from subprocess import call
from glob import glob
from time import time
import csv

classes = ["collections.comparators.FixedOrderComparator",
           "collections.iterators.FilterIterator",
           "collections.map.PredicatedMap",
           "math.genetics.ElitisticListPopulation"]
evosuite = ["collections/comparators/",
            "collections/iterators/",
            "collections/map/",
            "math/genetics/ElitisticListPopulation"]
className = ["FixedOrderComparator","FilterIterator","PredicatedMap","ElitisticListPopulation"]

cantSuites = 30

call(["mvn", "compile"])

with open("csv/out.csv", "wb") as csvOut:
    writer = csv.writer(csvOut, delimiter=",", quotechar="|", quoting=csv.QUOTE_MINIMAL)

    for i in xrange(cantSuites):
        for j in xrange(len(classes)):
            # GENERAR TEST SUITE

            call(["java",
                    "-ea",
                    "-classpath", "../lib/randoop-all-3.1.5.jar:" +
                                  "target/classes",
                    "randoop.main.Main", "gentests",
                    "--no-error-revealing-tests=true",
                    "--testclass=" + classes[j],
                    "--randomseed=" + str(int(time())),
                    "--classlist=classRandoop.txt",
                    "--timelimit=60",
                    "--junit-output-dir=tests/randoop-tests-" + classes[j] + "-" + str(i)])

            call(["java",
                    "-jar", "../lib/evosuite-1.0.5.jar",
                    "-class", classes[j],
                    "-projectCP", "target/classes",
                    "-generateSuite",
                    "-Dsearch_budget=60",
                    "-Duse_separate_classloader=false",
                    "-Dsave_all_data=false",
                    "-Dstopping_condition=MaxTime"])

            call(["mv", "evosuite-tests", "tests/evosuite-tests-" + classes[j] + "-" + str(i)])
            call(["rm", "evosuite-report"])

            # COMPILAR TEST SUITE

            dirRandoop = "tests/randoop-tests-" + classes[j] + "-" + str(i) + "/"
            dirEvosuite = "tests/evosuite-tests-" + classes[j] + "-" + str(i) + "/"
            testsRandoop = sorted(glob(dirRandoop + "*.java"))
            testsEvosuite = sorted(glob(dirEvosuite + evosuite[j] + "*.java"))

            for test in testsRandoop:
                call(["javac", "-classpath", ".:../lib/junit-4.12.jar:../lib/hamcrest-core-1.3.jar:target/classes:" + dirRandoop, test])
            for test in testsEvosuite:
                call(["javac", "-classpath", ".:../lib/*:../lib/evosuite-standalone-runtime-1.0.5.jar:target/classes:" + dirEvosuite, test])

            # CORRER TEST SUITE

            dirRandoopJacoco  = "jacoco/randoop-tests" + classes[j] + "-" + str(i)
            dirEvosuiteJacoco = "jacoco/evosuite-tests" + classes[j] + "-" + str(i)
            print dirRandoopJacoco

            call(["java",
                    "-javaagent:../lib/jacocoagent.jar=destfile=" + dirRandoopJacoco + "/Regression.exec",
                    "-classpath", ".:../lib/junit-4.12.jar:" +
                                  "../lib/hamcrest-core-1.3.jar:" + 
                                  "target/classes:" + 
                                  dirRandoop,
                    "org.junit.runner.JUnitCore", "RegressionTest"])

            call(["java", "-javaagent:../lib/jacocoagent.jar=destfile=" + dirEvosuiteJacoco + "/Evo.exec",
                  "-classpath", ".:../lib/junit-4.12.jar:" + 
                                "../lib/hamcrest-core-1.3.jar:" + 
                                "../lib/evosuite-standalone-runtime-1.0.5.jar:" + 
                                "../lib/slf4j-simple-1.7.25.jar:target/classes:" +
                                dirEvosuite,
                  "org.junit.runner.JUnitCore", classes[j] + "_ESTest"])

            # CORRER JACOCO

            dirRandoopCSV  = "csv/" + dirRandoop
            dirEvosuiteCSV = "csv/" + dirEvosuite
            call(["mkdir", "-p", dirRandoopCSV])
            call(["mkdir", "-p", dirEvosuiteCSV])

            call(["java", "-jar", "../lib/jacococli.jar", "report", dirRandoopJacoco + "/Regression.exec",
                  "--classfiles", "target/classes/",# + evosuite[j] + className[j] + ".class", 
                  "--csv", dirRandoopCSV + "/Regression.csv"])

            call(["java", "-jar", "../lib/jacococli.jar", "report", dirEvosuiteJacoco + "/Evo.exec",
                  "--classfiles", "target/classes/",# + evosuite[j] + className[j] + ".class",
                  "--csv", dirEvosuiteCSV + "/Evo.csv"])

            # CORRER PITEST

            dirReportsRandoop  = "reports/" + dirRandoop
            dirReportsEvosuite = "reports/" + dirEvosuite

            call(["java",
                    "-cp", dirRandoop + ":../lib/*:target/classes/",
                    "org.pitest.mutationtest.commandline.MutationCoverageReport",
                    "--reportDir", dirReportsRandoop + "/Regression/",
                    "--outputFormats", "csv",
                    "--timestampedReports=false",
                    "--targetClasses", classes[j],
                    "--targetTests", "RegressionTest",
                    "--sourceDirs", "src/main/java/," + dirRandoop])

            call(["java",
                  "-cp", dirEvosuite + ":../lib/*:target/classes/",
                  "org.pitest.mutationtest.commandline.MutationCoverageReport",
                  "--reportDir", dirReportsEvosuite,
                  "--outputFormats", "csv",
                  "--timestampedReports=false",
                  "--targetClasses", classes[j],
                  "--targetTests", classes[j] + "_ESTest",
                  "--sourceDirs", "src/main/java/," + dirEvosuite])

            # EXTRAER LINE Y BRANCH COVERAGE
            with open(dirRandoopCSV + "/Regression.csv", "r") as csvfile:
                reader = csv.reader(csvfile, delimiter=",")
                reader.next()
                for row in reader:
                    if row[2] == className[j]:
                        branchMisR = int(row[5])
                        branchCovR = int(row[6])
                        lineMisR = int(row[7])
                        lineCovR = int(row[8])

            with open(dirEvosuiteCSV + "/Evo.csv", "r") as csvfile:
                reader = csv.reader(csvfile, delimiter=",")
                reader.next()
                for row in reader:
                    if row[2] == className[j]:
                        branchMisE = int(row[5])
                        branchCovE = int(row[6])
                        lineMisE = int(row[7])
                        lineCovE = int(row[8])

            # EXTRAER PORCENTAJE MUTATION
            with open(dirReportsRandoop + "/Regression/mutations.csv", "r") as csvfile:
                reader = csv.reader(csvfile, delimiter=",")
                killedR = 0
                survivedR = 0
                for row in reader:
                    if row[5] == "KILLED":
                        killedR += 1
                    else:
                        survivedR += 1

            with open(dirReportsEvosuite + "/mutations.csv", "r") as csvfile:
                reader = csv.reader(csvfile, delimiter=",")
                killedE = 0
                survivedE = 0
                for row in reader:
                    if row[5] == "KILLED":
                        killedE += 1
                    else:
                        survivedE += 1
            
            # ESCRIBIR SALIDA DEL TEST SUITE
            randoopOut  = [classes[j], 
                           "Randoop",
                           (float(lineCovR) / (lineCovR + lineMisR)),
                           (float(branchCovR) / (branchCovR + branchMisR)),
                           (float(killedR) / (killedR+survivedR))]

            evosuiteOut = [classes[j],
                           "Evosuite",
                           (float(lineCovE) / (lineCovE + lineMisE)),
                           (float(branchCovE) / (branchCovE + branchMisE)),
                           (float(killedE) / (killedE+survivedE))]

            writer.writerow(randoopOut)
            writer.writerow(evosuiteOut)

with open("table.csv", "wb") as tableCSV:
    writer = csv.writer(tableCSV, delimiter=",", quotechar="|", quoting=csv.QUOTE_MINIMAL)
    for testClass in classes:
        with open("csv/out.csv", "r") as csvfile:
            reader = csv.reader(csvfile, delimiter=",")
            lineR = 0
            branchR = 0
            mutationR = 0
            lineE = 0
            branchE = 0
            mutationE = 0
            coso = 0
            for row in reader:
                if row[0] == testClass:
                    coso += 1
                    if row[1] == "Randoop":
                        lineR += float(row[2])
                        branchR += float(row[3])
                        mutationR += float(row[4])
                    else:
                        lineE += float(row[2])
                        branchE += float(row[3])
                        mutationE += float(row[4])
            print coso
            writer.writerow([testClass, "Randoop", lineR/float(cantSuites), branchR/float(cantSuites), mutationR/float(cantSuites)])
            writer.writerow([testClass, "Evosutie", lineE/float(cantSuites), branchE/float(cantSuites), mutationE/float(cantSuites)])
