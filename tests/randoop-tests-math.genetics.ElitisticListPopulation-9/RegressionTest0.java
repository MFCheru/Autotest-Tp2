import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 0, (double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 0, 1.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        try {
            elitisticListPopulation2.setElitismRate((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate(map5, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Collection<math.genetics.Chromosome> collection_chromosome6 = null;
        try {
            elitisticListPopulation2.addChromosomes(collection_chromosome6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(population3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) -1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) (byte) 0, (double) 0L);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation7);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 0.0d);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.lang.String str4 = elitisticListPopulation2.toString();
        try {
            elitisticListPopulation2.setElitismRate((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate(map5, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        java.util.Map map6 = collections.map.DefaultedMap.decorate(map4, (java.lang.Object) "hi!");
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate(map6, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        try {
            math.genetics.Chromosome chromosome6 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(population3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation8.spliterator();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        double d15 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        defaultedMap1.clear();
        boolean b8 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation7);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation7.iterator();
        int i11 = elitisticListPopulation7.getPopulationLimit();
        try {
            elitisticListPopulation7.setElitismRate((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
        org.junit.Assert.assertNotNull(iterator_chromosome10);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        try {
            math.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population13 = elitisticListPopulation12.nextGeneration();
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) population13);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i9 = defaultedMap8.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0f);
        defaultedMap1.putAll(map11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i15 = defaultedMap14.size();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) set20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i24 = defaultedMap23.size();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 1.0f);
        defaultedMap14.putAll(map26);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap1.get(obj29);
        int i31 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + '#' + "'", obj30.equals('#'));
        org.junit.Assert.assertTrue(i31 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i21 = defaultedMap20.size();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        java.lang.String str25 = defaultedMap20.toString();
        defaultedMap20.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap20);
        int i28 = defaultedMap10.size();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 0L);
        java.lang.Object obj32 = defaultedMap10.get((java.lang.Object) '#');
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + '#' + "'", obj32.equals('#'));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i3 = defaultedMap2.size();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap2.containsKey((java.lang.Object) set8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i12 = defaultedMap11.size();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set17 = defaultedMap16.entrySet();
        boolean b18 = defaultedMap11.containsKey((java.lang.Object) set17);
        defaultedMap2.putAll((java.util.Map) defaultedMap11);
        boolean b20 = defaultedMap2.isEmpty();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i24 = defaultedMap23.size();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate21, predicate25);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        try {
            java.util.Map map30 = collections.map.PredicatedMap.decorate(map0, predicate21, predicate29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate29);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        try {
            elitisticListPopulation2.setElitismRate(10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(i3 == 1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (short) 1, (double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6);
        int i9 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(list_chromosome10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation7);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation7.iterator();
        try {
            elitisticListPopulation7.setElitismRate((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
        org.junit.Assert.assertNotNull(iterator_chromosome10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i9 = defaultedMap8.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0f);
        defaultedMap1.putAll(map11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i15 = defaultedMap14.size();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) set20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i24 = defaultedMap23.size();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 1.0f);
        defaultedMap14.putAll(map26);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj29 = null;
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome33 = elitisticListPopulation32.spliterator();
        int i34 = elitisticListPopulation32.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        elitisticListPopulation32.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36);
        java.lang.Object obj39 = defaultedMap1.put(obj29, (java.lang.Object) arraylist_chromosome36);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(spliterator_chromosome33);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set2 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation5.spliterator();
        int i7 = elitisticListPopulation5.getPopulationSize();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation11.spliterator();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) arraylist_chromosome14);
        java.lang.String str19 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i22 = defaultedMap21.size();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate23, predicate24);
        java.lang.String str26 = defaultedMap21.toString();
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        java.lang.Object obj28 = defaultedMap21.remove((java.lang.Object) predicateUtils27);
        java.lang.Object obj29 = new java.lang.Object();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome33 = elitisticListPopulation32.spliterator();
        int i34 = elitisticListPopulation32.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        elitisticListPopulation32.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36);
        java.lang.Object obj39 = defaultedMap21.put(obj29, (java.lang.Object) elitisticListPopulation32);
        math.genetics.Population population40 = elitisticListPopulation32.nextGeneration();
        int i41 = elitisticListPopulation32.getPopulationSize();
        java.lang.Object obj42 = defaultedMap1.remove((java.lang.Object) i41);
        java.util.Collection collection43 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(spliterator_chromosome33);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(population40);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection43);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.entrySet();
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) predicateUtils7);
        java.lang.Object obj9 = new java.lang.Object();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation12.spliterator();
        int i14 = elitisticListPopulation12.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        java.lang.Object obj19 = defaultedMap1.put(obj9, (java.lang.Object) elitisticListPopulation12);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i22 = defaultedMap21.size();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate23, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i28 = defaultedMap27.size();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set33 = defaultedMap32.entrySet();
        boolean b34 = defaultedMap27.containsKey((java.lang.Object) set33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i37 = defaultedMap36.size();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set42 = defaultedMap41.entrySet();
        boolean b43 = defaultedMap36.containsKey((java.lang.Object) set42);
        defaultedMap27.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj45 = defaultedMap21.remove((java.lang.Object) defaultedMap36);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i49 = defaultedMap48.size();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate50, predicate51);
        java.lang.String str53 = defaultedMap48.toString();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i56 = defaultedMap55.size();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) 1.0f);
        defaultedMap48.putAll(map58);
        defaultedMap1.putAll((java.util.Map) defaultedMap48);
        java.util.Set set61 = defaultedMap48.entrySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(set61);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation8.spliterator();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setPopulationLimit((int) (byte) 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set2 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation5.spliterator();
        int i7 = elitisticListPopulation5.getPopulationSize();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation11.spliterator();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) arraylist_chromosome14);
        java.lang.String str19 = defaultedMap1.toString();
        int i20 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(d3 == 0.0d);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        boolean b19 = defaultedMap1.isEmpty();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i23 = defaultedMap22.size();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate20, predicate24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i30 = defaultedMap29.size();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) 1.0f);
        java.util.Map map34 = collections.map.DefaultedMap.decorate(map32, (java.lang.Object) "hi!");
        java.lang.Object obj35 = defaultedMap1.remove((java.lang.Object) map34);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '#');
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap1.size();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6);
        int i9 = elitisticListPopulation2.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) (byte) 0, (double) '#');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '#');
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i8 = defaultedMap7.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation11.spliterator();
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) spliterator_chromosome12);
        java.lang.String str14 = defaultedMap7.toString();
        java.lang.Object obj15 = defaultedMap4.get((java.lang.Object) defaultedMap7);
        boolean b17 = defaultedMap7.containsValue((java.lang.Object) (short) 100);
        java.util.Set set18 = defaultedMap7.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + '#' + "'", obj13.equals('#'));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + '#' + "'", obj15.equals('#'));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        boolean b19 = defaultedMap1.isEmpty();
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) false);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i25 = defaultedMap24.size();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate22, predicate27);
        java.util.Set set30 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        defaultedMap10.clear();
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation5.spliterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) spliterator_chromosome6);
        java.lang.String str8 = defaultedMap1.toString();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '#' + "'", obj7.equals('#'));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) predicateUtils7);
        java.lang.Object obj9 = new java.lang.Object();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation12.spliterator();
        int i14 = elitisticListPopulation12.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        java.lang.Object obj19 = defaultedMap1.put(obj9, (java.lang.Object) elitisticListPopulation12);
        math.genetics.Population population20 = elitisticListPopulation12.nextGeneration();
        int i21 = elitisticListPopulation12.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation12.getChromosomes();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(population20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(list_chromosome22);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation7);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation7.iterator();
        int i11 = elitisticListPopulation7.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome15 = elitisticListPopulation14.spliterator();
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome23 = elitisticListPopulation22.spliterator();
        int i24 = elitisticListPopulation22.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        elitisticListPopulation22.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26);
        elitisticListPopulation7.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (-1), (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
        org.junit.Assert.assertNotNull(iterator_chromosome10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        defaultedMap1.putAll(map13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i17 = defaultedMap16.size();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        java.lang.String str21 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i24 = defaultedMap23.size();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 1.0f);
        defaultedMap16.putAll(map26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i30 = defaultedMap29.size();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set35 = defaultedMap34.entrySet();
        boolean b36 = defaultedMap29.containsKey((java.lang.Object) set35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i39 = defaultedMap38.size();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) 1.0f);
        defaultedMap29.putAll(map41);
        defaultedMap16.putAll((java.util.Map) defaultedMap29);
        boolean b44 = defaultedMap1.containsKey((java.lang.Object) defaultedMap29);
        java.util.Set set45 = defaultedMap29.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.entrySet();
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        int i19 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i22 = defaultedMap21.size();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set27 = defaultedMap26.entrySet();
        boolean b28 = defaultedMap21.containsKey((java.lang.Object) set27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i31 = defaultedMap30.size();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set36 = defaultedMap35.entrySet();
        boolean b37 = defaultedMap30.containsKey((java.lang.Object) set36);
        defaultedMap21.putAll((java.util.Map) defaultedMap30);
        boolean b39 = defaultedMap21.isEmpty();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i43 = defaultedMap42.size();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate44, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate40, predicate44);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i51 = defaultedMap50.size();
        java.util.Set set52 = defaultedMap50.entrySet();
        java.lang.Object obj53 = new java.lang.Object();
        boolean b54 = defaultedMap50.equals(obj53);
        java.lang.Object obj55 = defaultedMap10.put((java.lang.Object) defaultedMap21, (java.lang.Object) b54);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set2 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation5.spliterator();
        int i7 = elitisticListPopulation5.getPopulationSize();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation11.spliterator();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) arraylist_chromosome14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i21 = defaultedMap20.size();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        java.lang.String str25 = defaultedMap20.toString();
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        java.lang.Object obj27 = defaultedMap20.remove((java.lang.Object) predicateUtils26);
        boolean b28 = defaultedMap20.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap20);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 100);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation7);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 0.0d);
        java.util.Collection collection12 = defaultedMap1.values();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        try {
            math.genetics.Chromosome chromosome3 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) predicateUtils7);
        java.lang.Object obj9 = new java.lang.Object();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation12.spliterator();
        int i14 = elitisticListPopulation12.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        java.lang.Object obj19 = defaultedMap1.put(obj9, (java.lang.Object) elitisticListPopulation12);
        math.genetics.Population population20 = elitisticListPopulation12.nextGeneration();
        int i21 = elitisticListPopulation12.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation12.iterator();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(population20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation7);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 0.0d);
        java.util.Collection collection12 = defaultedMap1.values();
        boolean b13 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation8.spliterator();
        int i10 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) (byte) 1, (double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '#');
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i9 = defaultedMap8.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap8.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i18 = defaultedMap17.size();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set23 = defaultedMap22.entrySet();
        boolean b24 = defaultedMap17.containsKey((java.lang.Object) set23);
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i28 = defaultedMap27.size();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        java.lang.String str32 = defaultedMap27.toString();
        defaultedMap27.clear();
        defaultedMap17.putAll((java.util.Map) defaultedMap27);
        int i35 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i38 = defaultedMap37.size();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set43 = defaultedMap42.entrySet();
        boolean b44 = defaultedMap37.containsKey((java.lang.Object) set43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i47 = defaultedMap46.size();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set52 = defaultedMap51.entrySet();
        boolean b53 = defaultedMap46.containsKey((java.lang.Object) set52);
        defaultedMap37.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i57 = defaultedMap56.size();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate58, predicate59);
        java.lang.String str61 = defaultedMap56.toString();
        collections.PredicateUtils predicateUtils62 = new collections.PredicateUtils();
        java.lang.Object obj63 = defaultedMap56.remove((java.lang.Object) predicateUtils62);
        java.lang.Object obj64 = new java.lang.Object();
        math.genetics.ElitisticListPopulation elitisticListPopulation67 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome68 = elitisticListPopulation67.spliterator();
        int i69 = elitisticListPopulation67.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array70 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome71 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b72 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome71, chromosome_array70);
        elitisticListPopulation67.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome71);
        java.lang.Object obj74 = defaultedMap56.put(obj64, (java.lang.Object) elitisticListPopulation67);
        java.lang.Object obj75 = defaultedMap46.remove(obj64);
        java.lang.Object obj76 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap46);
        collections.Transformer transformer77 = null;
        try {
            java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, transformer77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(spliterator_chromosome68);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNotNull(chromosome_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6);
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        math.genetics.Population population10 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(population10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '#');
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        int i5 = elitisticListPopulation2.getPopulationSize();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        int i7 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setElitismRate((double) 1.0f);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i21 = defaultedMap20.size();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        java.lang.String str25 = defaultedMap20.toString();
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        java.lang.Object obj27 = defaultedMap20.remove((java.lang.Object) predicateUtils26);
        java.lang.Object obj28 = new java.lang.Object();
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome32 = elitisticListPopulation31.spliterator();
        int i33 = elitisticListPopulation31.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        elitisticListPopulation31.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35);
        java.lang.Object obj38 = defaultedMap20.put(obj28, (java.lang.Object) elitisticListPopulation31);
        java.lang.Object obj39 = defaultedMap10.remove(obj28);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i42 = defaultedMap41.size();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set47 = defaultedMap46.entrySet();
        boolean b48 = defaultedMap41.containsKey((java.lang.Object) set47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i51 = defaultedMap50.size();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set56 = defaultedMap55.entrySet();
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) set56);
        defaultedMap41.putAll((java.util.Map) defaultedMap50);
        boolean b59 = defaultedMap41.isEmpty();
        boolean b61 = defaultedMap41.containsValue((java.lang.Object) false);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i65 = defaultedMap64.size();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate66, predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate62, predicate67);
        java.lang.Object obj70 = defaultedMap10.get((java.lang.Object) predicate67);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(spliterator_chromosome32);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + '#' + "'", obj70.equals('#'));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        int i7 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit(10);
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '#');
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i9 = defaultedMap8.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap8.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i18 = defaultedMap17.size();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set23 = defaultedMap22.entrySet();
        boolean b24 = defaultedMap17.containsKey((java.lang.Object) set23);
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i28 = defaultedMap27.size();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        java.lang.String str32 = defaultedMap27.toString();
        defaultedMap27.clear();
        defaultedMap17.putAll((java.util.Map) defaultedMap27);
        int i35 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i38 = defaultedMap37.size();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set43 = defaultedMap42.entrySet();
        boolean b44 = defaultedMap37.containsKey((java.lang.Object) set43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i47 = defaultedMap46.size();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set52 = defaultedMap51.entrySet();
        boolean b53 = defaultedMap46.containsKey((java.lang.Object) set52);
        defaultedMap37.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i57 = defaultedMap56.size();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate58, predicate59);
        java.lang.String str61 = defaultedMap56.toString();
        collections.PredicateUtils predicateUtils62 = new collections.PredicateUtils();
        java.lang.Object obj63 = defaultedMap56.remove((java.lang.Object) predicateUtils62);
        java.lang.Object obj64 = new java.lang.Object();
        math.genetics.ElitisticListPopulation elitisticListPopulation67 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome68 = elitisticListPopulation67.spliterator();
        int i69 = elitisticListPopulation67.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array70 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome71 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b72 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome71, chromosome_array70);
        elitisticListPopulation67.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome71);
        java.lang.Object obj74 = defaultedMap56.put(obj64, (java.lang.Object) elitisticListPopulation67);
        java.lang.Object obj75 = defaultedMap46.remove(obj64);
        java.lang.Object obj76 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap46);
        java.util.Collection collection77 = defaultedMap1.values();
        collections.Factory factory78 = null;
        try {
            java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(spliterator_chromosome68);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNotNull(chromosome_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(collection77);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation7);
        int i10 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = null;
        try {
            elitisticListPopulation2.setChromosomes(list_chromosome6);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
        org.junit.Assert.assertNotNull(population3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation9.spliterator();
        int i11 = elitisticListPopulation9.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13);
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome16);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(list_chromosome16);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        int i19 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i22 = defaultedMap21.size();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate23, predicate24);
        java.lang.String str26 = defaultedMap21.toString();
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        java.lang.Object obj28 = defaultedMap21.remove((java.lang.Object) predicateUtils27);
        java.lang.Object obj29 = new java.lang.Object();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome33 = elitisticListPopulation32.spliterator();
        int i34 = elitisticListPopulation32.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        elitisticListPopulation32.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36);
        java.lang.Object obj39 = defaultedMap21.put(obj29, (java.lang.Object) elitisticListPopulation32);
        math.genetics.Population population40 = elitisticListPopulation32.nextGeneration();
        java.lang.Object obj41 = defaultedMap10.get((java.lang.Object) elitisticListPopulation32);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome42 = elitisticListPopulation32.spliterator();
        elitisticListPopulation32.setElitismRate((double) 1L);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(spliterator_chromosome33);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(population40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + '#' + "'", obj41.equals('#'));
        org.junit.Assert.assertNotNull(spliterator_chromosome42);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        boolean b19 = defaultedMap1.isEmpty();
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) false);
        boolean b23 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i7 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        int i11 = defaultedMap6.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i15 = defaultedMap14.size();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) set20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i24 = defaultedMap23.size();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set29 = defaultedMap28.entrySet();
        boolean b30 = defaultedMap23.containsKey((java.lang.Object) set29);
        defaultedMap14.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i34 = defaultedMap33.size();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate35, predicate36);
        java.lang.String str38 = defaultedMap33.toString();
        defaultedMap33.clear();
        defaultedMap23.putAll((java.util.Map) defaultedMap33);
        int i41 = defaultedMap23.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap23);
        collections.Factory factory44 = null;
        try {
            java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, factory44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(i41 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (byte) 0);
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit((int) '#');
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '#');
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i8 = defaultedMap7.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation11.spliterator();
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) spliterator_chromosome12);
        java.lang.String str14 = defaultedMap7.toString();
        java.lang.Object obj15 = defaultedMap4.get((java.lang.Object) defaultedMap7);
        int i16 = defaultedMap4.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + '#' + "'", obj13.equals('#'));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + '#' + "'", obj15.equals('#'));
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        double d5 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(d5 == 0.0d);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation7);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 0.0d);
        java.util.Collection collection12 = defaultedMap1.values();
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) 1.0d);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) predicateUtils7);
        java.lang.Object obj9 = new java.lang.Object();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation12.spliterator();
        int i14 = elitisticListPopulation12.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        java.lang.Object obj19 = defaultedMap1.put(obj9, (java.lang.Object) elitisticListPopulation12);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation12.getChromosomes();
        java.lang.String str21 = elitisticListPopulation12.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]" + "'", str21.equals("[]"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation6.spliterator();
        int i8 = elitisticListPopulation6.getPopulationSize();
        int i9 = elitisticListPopulation6.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation12.spliterator();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        elitisticListPopulation6.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i8 = defaultedMap7.size();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set13 = defaultedMap12.entrySet();
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) set13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i17 = defaultedMap16.size();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set22 = defaultedMap21.entrySet();
        boolean b23 = defaultedMap16.containsKey((java.lang.Object) set22);
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        boolean b26 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i9 = defaultedMap8.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0f);
        defaultedMap1.putAll(map11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i15 = defaultedMap14.size();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) set20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i24 = defaultedMap23.size();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 1.0f);
        defaultedMap14.putAll(map26);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap1.get(obj29);
        collections.Factory factory31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + '#' + "'", obj30.equals('#'));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(1);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        int i7 = elitisticListPopulation2.getPopulationLimit();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i9 = defaultedMap8.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0f);
        defaultedMap1.putAll(map11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i15 = defaultedMap14.size();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) set20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i24 = defaultedMap23.size();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 1.0f);
        defaultedMap14.putAll(map26);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i31 = defaultedMap30.size();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set36 = defaultedMap35.entrySet();
        boolean b37 = defaultedMap30.containsKey((java.lang.Object) set36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i40 = defaultedMap39.size();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set45 = defaultedMap44.entrySet();
        boolean b46 = defaultedMap39.containsKey((java.lang.Object) set45);
        defaultedMap30.putAll((java.util.Map) defaultedMap39);
        boolean b48 = defaultedMap30.isEmpty();
        boolean b50 = defaultedMap30.containsValue((java.lang.Object) false);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i54 = defaultedMap53.size();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate55, predicate56);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate51, predicate56);
        boolean b59 = defaultedMap30.isEmpty();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap30);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        int i19 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i22 = defaultedMap21.size();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate23, predicate24);
        java.lang.String str26 = defaultedMap21.toString();
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        java.lang.Object obj28 = defaultedMap21.remove((java.lang.Object) predicateUtils27);
        java.lang.Object obj29 = new java.lang.Object();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome33 = elitisticListPopulation32.spliterator();
        int i34 = elitisticListPopulation32.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        elitisticListPopulation32.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36);
        java.lang.Object obj39 = defaultedMap21.put(obj29, (java.lang.Object) elitisticListPopulation32);
        math.genetics.Population population40 = elitisticListPopulation32.nextGeneration();
        java.lang.Object obj41 = defaultedMap10.get((java.lang.Object) elitisticListPopulation32);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome42 = elitisticListPopulation32.spliterator();
        int i43 = elitisticListPopulation32.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome44 = elitisticListPopulation32.iterator();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(spliterator_chromosome33);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(population40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + '#' + "'", obj41.equals('#'));
        org.junit.Assert.assertNotNull(spliterator_chromosome42);
        org.junit.Assert.assertTrue(i43 == 1);
        org.junit.Assert.assertNotNull(iterator_chromosome44);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation7);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation7.iterator();
        double d11 = elitisticListPopulation7.getElitismRate();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
        org.junit.Assert.assertNotNull(iterator_chromosome10);
        org.junit.Assert.assertTrue(d11 == 0.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        defaultedMap1.putAll(map13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate(map13, (java.lang.Object) "hi!");
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate(map16, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        try {
            math.genetics.Chromosome chromosome4 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation7);
        try {
            elitisticListPopulation7.setElitismRate((double) '#');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation11.spliterator();
        int i13 = elitisticListPopulation11.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation11.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome14);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNotNull(list_chromosome14);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i8 = defaultedMap7.size();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 1.0f);
        defaultedMap7.clear();
        java.util.Set set12 = defaultedMap7.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i15 = defaultedMap14.size();
        java.util.Set set16 = defaultedMap14.entrySet();
        int i17 = defaultedMap14.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = elitisticListPopulation20.spliterator();
        int i22 = elitisticListPopulation20.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome26 = elitisticListPopulation25.spliterator();
        int i27 = elitisticListPopulation25.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        elitisticListPopulation25.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29);
        int i32 = elitisticListPopulation25.getPopulationLimit();
        java.lang.Object obj33 = defaultedMap14.put((java.lang.Object) i22, (java.lang.Object) i32);
        boolean b34 = defaultedMap7.containsValue((java.lang.Object) i32);
        boolean b35 = defaultedMap1.containsKey((java.lang.Object) b34);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i7 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        int i11 = defaultedMap6.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.util.Set set13 = defaultedMap6.keySet();
        int i14 = defaultedMap6.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set2 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation5.spliterator();
        int i7 = elitisticListPopulation5.getPopulationSize();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation11.spliterator();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) arraylist_chromosome14);
        java.lang.String str19 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i23 = defaultedMap22.size();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate24, predicate25);
        java.lang.String str27 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i30 = defaultedMap29.size();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) 1.0f);
        defaultedMap22.putAll(map32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i36 = defaultedMap35.size();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set41 = defaultedMap40.entrySet();
        boolean b42 = defaultedMap35.containsKey((java.lang.Object) set41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i45 = defaultedMap44.size();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) 1.0f);
        defaultedMap35.putAll(map47);
        defaultedMap22.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj50 = defaultedMap1.remove((java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i53 = defaultedMap52.size();
        java.util.Set set54 = defaultedMap52.entrySet();
        java.lang.Object obj56 = defaultedMap52.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i59 = defaultedMap58.size();
        java.util.Set set60 = defaultedMap58.entrySet();
        boolean b61 = defaultedMap52.equals((java.lang.Object) defaultedMap58);
        java.lang.Object obj62 = defaultedMap35.get((java.lang.Object) defaultedMap52);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + '#' + "'", obj56.equals('#'));
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + '#' + "'", obj62.equals('#'));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation5.spliterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) spliterator_chromosome6);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '#' + "'", obj7.equals('#'));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i21 = defaultedMap20.size();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        java.lang.String str25 = defaultedMap20.toString();
        defaultedMap20.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap10.get(obj28);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + '#' + "'", obj29.equals('#'));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation7);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation7.iterator();
        int i11 = elitisticListPopulation7.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i14 = defaultedMap13.size();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population20 = elitisticListPopulation19.nextGeneration();
        java.lang.Object obj21 = defaultedMap13.get((java.lang.Object) elitisticListPopulation19);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation19.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome26 = elitisticListPopulation25.spliterator();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation25.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation7.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome36 = elitisticListPopulation35.spliterator();
        int i37 = elitisticListPopulation35.getPopulationSize();
        int i38 = elitisticListPopulation35.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome42 = elitisticListPopulation41.spliterator();
        int i43 = elitisticListPopulation41.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        elitisticListPopulation41.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45);
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45);
        elitisticListPopulation7.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
        org.junit.Assert.assertNotNull(iterator_chromosome10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(population20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + '#' + "'", obj21.equals('#'));
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(spliterator_chromosome26);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(i38 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome42);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        double d6 = elitisticListPopulation2.getElitismRate();
        try {
            math.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d6 == 0.0d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        double d6 = elitisticListPopulation2.getElitismRate();
        math.genetics.Chromosome chromosome7 = null;
        try {
            elitisticListPopulation2.addChromosome(chromosome7);
            org.junit.Assert.fail("Expected exception of type math.exception.NumberIsTooLargeException");
        } catch (math.exception.NumberIsTooLargeException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d6 == 0.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        boolean b19 = defaultedMap1.isEmpty();
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) false);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i25 = defaultedMap24.size();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate22, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i32 = defaultedMap31.size();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population38 = elitisticListPopulation37.nextGeneration();
        java.lang.Object obj39 = defaultedMap31.get((java.lang.Object) elitisticListPopulation37);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome40 = elitisticListPopulation37.iterator();
        int i41 = elitisticListPopulation37.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i44 = defaultedMap43.size();
        java.util.Set set45 = defaultedMap43.entrySet();
        int i46 = defaultedMap43.size();
        java.lang.Object obj47 = defaultedMap1.put((java.lang.Object) i41, (java.lang.Object) defaultedMap43);
        java.util.Set set48 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(population38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + '#' + "'", obj39.equals('#'));
        org.junit.Assert.assertNotNull(iterator_chromosome40);
        org.junit.Assert.assertTrue(i41 == 1);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set48);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i8 = defaultedMap7.size();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set13 = defaultedMap12.entrySet();
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) set13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i17 = defaultedMap16.size();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set22 = defaultedMap21.entrySet();
        boolean b23 = defaultedMap16.containsKey((java.lang.Object) set22);
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i28 = defaultedMap27.size();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set33 = defaultedMap32.entrySet();
        boolean b34 = defaultedMap27.containsKey((java.lang.Object) set33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i37 = defaultedMap36.size();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set42 = defaultedMap41.entrySet();
        boolean b43 = defaultedMap36.containsKey((java.lang.Object) set42);
        defaultedMap27.putAll((java.util.Map) defaultedMap36);
        boolean b45 = defaultedMap27.isEmpty();
        boolean b47 = defaultedMap27.containsValue((java.lang.Object) false);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i51 = defaultedMap50.size();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate52, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate48, predicate53);
        defaultedMap27.clear();
        defaultedMap16.putAll((java.util.Map) defaultedMap27);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6);
        int i9 = elitisticListPopulation2.getPopulationLimit();
        double d10 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i13 = defaultedMap12.size();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population19 = elitisticListPopulation18.nextGeneration();
        java.lang.Object obj20 = defaultedMap12.get((java.lang.Object) elitisticListPopulation18);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation18.iterator();
        int i22 = elitisticListPopulation18.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome26 = elitisticListPopulation25.spliterator();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation25.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome34 = elitisticListPopulation33.spliterator();
        int i35 = elitisticListPopulation33.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37);
        elitisticListPopulation25.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37);
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + '#' + "'", obj20.equals('#'));
        org.junit.Assert.assertNotNull(iterator_chromosome21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome26);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(list_chromosome43);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation7);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation7.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation13.spliterator();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation7.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population23 = elitisticListPopulation22.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation7.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome24);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
        org.junit.Assert.assertNotNull(iterator_chromosome10);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertNotNull(list_chromosome24);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i9 = defaultedMap8.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0f);
        defaultedMap1.putAll(map11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        boolean b15 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation8.spliterator();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, 0, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        boolean b19 = defaultedMap1.isEmpty();
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) false);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i25 = defaultedMap24.size();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate22, predicate27);
        defaultedMap1.clear();
        java.util.Collection collection31 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        int i7 = elitisticListPopulation2.getPopulationSize();
        try {
            math.genetics.Chromosome chromosome8 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        boolean b19 = defaultedMap1.isEmpty();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i23 = defaultedMap22.size();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate20, predicate24);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i31 = defaultedMap30.size();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 1.0f);
        java.lang.Object obj34 = defaultedMap1.remove((java.lang.Object) defaultedMap30);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i8 = defaultedMap7.size();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set13 = defaultedMap12.entrySet();
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) set13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i17 = defaultedMap16.size();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set22 = defaultedMap21.entrySet();
        boolean b23 = defaultedMap16.containsKey((java.lang.Object) set22);
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        java.util.Set set26 = defaultedMap16.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        int i6 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str7 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[null]" + "'", str7.equals("[null]"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6);
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation2.addChromosome(chromosome9);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation2.iterator();
        java.lang.String str12 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[null]" + "'", str12.equals("[null]"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation7);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        int i16 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i19 = defaultedMap18.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        int i23 = defaultedMap18.size();
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i27 = defaultedMap26.size();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set32 = defaultedMap31.entrySet();
        boolean b33 = defaultedMap26.containsKey((java.lang.Object) set32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i36 = defaultedMap35.size();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set41 = defaultedMap40.entrySet();
        boolean b42 = defaultedMap35.containsKey((java.lang.Object) set41);
        defaultedMap26.putAll((java.util.Map) defaultedMap35);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i46 = defaultedMap45.size();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate47, predicate48);
        java.lang.String str50 = defaultedMap45.toString();
        defaultedMap45.clear();
        defaultedMap35.putAll((java.util.Map) defaultedMap45);
        int i53 = defaultedMap35.size();
        defaultedMap13.putAll((java.util.Map) defaultedMap35);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap35);
        boolean b56 = defaultedMap1.containsKey((java.lang.Object) defaultedMap35);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        int i9 = defaultedMap1.size();
        boolean b10 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setElitismRate(0.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation8.spliterator();
        int i10 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12);
        int i15 = elitisticListPopulation8.getPopulationLimit();
        double d16 = elitisticListPopulation8.getElitismRate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i19 = defaultedMap18.size();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population25 = elitisticListPopulation24.nextGeneration();
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) elitisticListPopulation24);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome27 = elitisticListPopulation24.iterator();
        int i28 = elitisticListPopulation24.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome32 = elitisticListPopulation31.spliterator();
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation31.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome40 = elitisticListPopulation39.spliterator();
        int i41 = elitisticListPopulation39.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        elitisticListPopulation39.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43);
        elitisticListPopulation31.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome43);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43);
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(d16 == 0.0d);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(population25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + '#' + "'", obj26.equals('#'));
        org.junit.Assert.assertNotNull(iterator_chromosome27);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome32);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome40);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        boolean b19 = defaultedMap1.isEmpty();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i23 = defaultedMap22.size();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate20, predicate24);
        java.util.Collection collection28 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i31 = defaultedMap30.size();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set36 = defaultedMap35.entrySet();
        boolean b37 = defaultedMap30.containsKey((java.lang.Object) set36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i40 = defaultedMap39.size();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set45 = defaultedMap44.entrySet();
        boolean b46 = defaultedMap39.containsKey((java.lang.Object) set45);
        defaultedMap30.putAll((java.util.Map) defaultedMap39);
        boolean b48 = defaultedMap30.isEmpty();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i52 = defaultedMap51.size();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate53, predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate49, predicate53);
        java.util.Collection collection57 = defaultedMap30.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap30);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(collection57);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set4 = defaultedMap3.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation7.spliterator();
        int i9 = elitisticListPopulation7.getPopulationSize();
        int i10 = elitisticListPopulation7.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation13.spliterator();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation7.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        boolean b20 = defaultedMap3.containsKey((java.lang.Object) arraylist_chromosome16);
        java.lang.String str21 = defaultedMap3.toString();
        defaultedMap3.clear();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) predicateUtils7);
        java.lang.Object obj9 = new java.lang.Object();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation12.spliterator();
        int i14 = elitisticListPopulation12.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        java.lang.Object obj19 = defaultedMap1.put(obj9, (java.lang.Object) elitisticListPopulation12);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation12.getChromosomes();
        int i21 = elitisticListPopulation12.getPopulationLimit();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue(i21 == 1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        int i19 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i22 = defaultedMap21.size();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set27 = defaultedMap26.entrySet();
        boolean b28 = defaultedMap21.containsKey((java.lang.Object) set27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i31 = defaultedMap30.size();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set36 = defaultedMap35.entrySet();
        boolean b37 = defaultedMap30.containsKey((java.lang.Object) set36);
        defaultedMap21.putAll((java.util.Map) defaultedMap30);
        boolean b39 = defaultedMap21.isEmpty();
        boolean b41 = defaultedMap21.containsValue((java.lang.Object) false);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i45 = defaultedMap44.size();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate46, predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate42, predicate47);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate47, predicate50);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        defaultedMap1.putAll(map13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i17 = defaultedMap16.size();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        java.lang.String str21 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i24 = defaultedMap23.size();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 1.0f);
        defaultedMap16.putAll(map26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i30 = defaultedMap29.size();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set35 = defaultedMap34.entrySet();
        boolean b36 = defaultedMap29.containsKey((java.lang.Object) set35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i39 = defaultedMap38.size();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) 1.0f);
        defaultedMap29.putAll(map41);
        defaultedMap16.putAll((java.util.Map) defaultedMap29);
        boolean b44 = defaultedMap1.containsKey((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i47 = defaultedMap46.size();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set52 = defaultedMap51.entrySet();
        boolean b53 = defaultedMap46.containsKey((java.lang.Object) set52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i56 = defaultedMap55.size();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set61 = defaultedMap60.entrySet();
        boolean b62 = defaultedMap55.containsKey((java.lang.Object) set61);
        defaultedMap46.putAll((java.util.Map) defaultedMap55);
        boolean b64 = defaultedMap46.isEmpty();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap46);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(map65);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        int i19 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i22 = defaultedMap21.size();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate23, predicate24);
        java.lang.String str26 = defaultedMap21.toString();
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        java.lang.Object obj28 = defaultedMap21.remove((java.lang.Object) predicateUtils27);
        java.lang.Object obj29 = new java.lang.Object();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome33 = elitisticListPopulation32.spliterator();
        int i34 = elitisticListPopulation32.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        elitisticListPopulation32.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36);
        java.lang.Object obj39 = defaultedMap21.put(obj29, (java.lang.Object) elitisticListPopulation32);
        math.genetics.Population population40 = elitisticListPopulation32.nextGeneration();
        java.lang.Object obj41 = defaultedMap10.get((java.lang.Object) elitisticListPopulation32);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome42 = elitisticListPopulation32.spliterator();
        try {
            elitisticListPopulation32.setElitismRate((double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(spliterator_chromosome33);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(population40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + '#' + "'", obj41.equals('#'));
        org.junit.Assert.assertNotNull(spliterator_chromosome42);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        int i6 = elitisticListPopulation2.getPopulationSize();
        double d7 = elitisticListPopulation2.getElitismRate();
        try {
            math.genetics.Chromosome chromosome8 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(d7 == 0.0d);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i8 = defaultedMap7.size();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set13 = defaultedMap12.entrySet();
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) set13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i17 = defaultedMap16.size();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set22 = defaultedMap21.entrySet();
        boolean b23 = defaultedMap16.containsKey((java.lang.Object) set22);
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        java.util.Set set26 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation7);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 0.0d);
        java.util.Collection collection12 = defaultedMap1.values();
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) 1.0d);
        java.lang.String str15 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation10.spliterator();
        int i12 = elitisticListPopulation10.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation10.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation2.addChromosome(chromosome18);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i21 = defaultedMap20.size();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        java.lang.String str25 = defaultedMap20.toString();
        defaultedMap20.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap20);
        int i28 = defaultedMap10.size();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 0L);
        java.util.Map map31 = null;
        try {
            defaultedMap10.putAll(map31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1L);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation7);
        int i10 = elitisticListPopulation7.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation7.iterator();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i5 = defaultedMap4.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation8.spliterator();
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) spliterator_chromosome9);
        boolean b11 = defaultedMap1.equals(obj10);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + '#' + "'", obj10.equals('#'));
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.entrySet();
        int i10 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i13 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        int i17 = defaultedMap12.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i21 = defaultedMap20.size();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set26 = defaultedMap25.entrySet();
        boolean b27 = defaultedMap20.containsKey((java.lang.Object) set26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i30 = defaultedMap29.size();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set35 = defaultedMap34.entrySet();
        boolean b36 = defaultedMap29.containsKey((java.lang.Object) set35);
        defaultedMap20.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i40 = defaultedMap39.size();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate41, predicate42);
        java.lang.String str44 = defaultedMap39.toString();
        defaultedMap39.clear();
        defaultedMap29.putAll((java.util.Map) defaultedMap39);
        int i47 = defaultedMap29.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap29);
        java.lang.Object obj49 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome53 = elitisticListPopulation52.spliterator();
        math.genetics.Chromosome[] chromosome_array54 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome55 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55, chromosome_array54);
        elitisticListPopulation52.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55);
        double d58 = elitisticListPopulation52.getElitismRate();
        java.lang.Object obj59 = defaultedMap1.remove((java.lang.Object) d58);
        java.util.Set set60 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(spliterator_chromosome53);
        org.junit.Assert.assertNotNull(chromosome_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(d58 == 0.0d);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(set60);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6);
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        math.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(population11);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(list_chromosome4, (int) (short) 10, (double) 0);
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(list_chromosome4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        int i19 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i22 = defaultedMap21.size();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate23, predicate24);
        java.lang.String str26 = defaultedMap21.toString();
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        java.lang.Object obj28 = defaultedMap21.remove((java.lang.Object) predicateUtils27);
        java.lang.Object obj29 = new java.lang.Object();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome33 = elitisticListPopulation32.spliterator();
        int i34 = elitisticListPopulation32.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        elitisticListPopulation32.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36);
        java.lang.Object obj39 = defaultedMap21.put(obj29, (java.lang.Object) elitisticListPopulation32);
        math.genetics.Population population40 = elitisticListPopulation32.nextGeneration();
        java.lang.Object obj41 = defaultedMap10.get((java.lang.Object) elitisticListPopulation32);
        java.util.Set set42 = defaultedMap10.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(spliterator_chromosome33);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(population40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + '#' + "'", obj41.equals('#'));
        org.junit.Assert.assertNotNull(set42);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i21 = defaultedMap20.size();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        java.lang.String str25 = defaultedMap20.toString();
        defaultedMap20.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap20);
        int i28 = defaultedMap10.size();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 0L);
        java.lang.String str31 = defaultedMap10.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation7);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 0.0d);
        java.util.Collection collection12 = defaultedMap1.values();
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set17 = defaultedMap16.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = elitisticListPopulation20.spliterator();
        int i22 = elitisticListPopulation20.getPopulationSize();
        int i23 = elitisticListPopulation20.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = elitisticListPopulation26.spliterator();
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29);
        elitisticListPopulation20.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29);
        boolean b33 = defaultedMap16.containsKey((java.lang.Object) arraylist_chromosome29);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i36 = defaultedMap35.size();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate37, predicate38);
        java.lang.String str40 = defaultedMap35.toString();
        collections.PredicateUtils predicateUtils41 = new collections.PredicateUtils();
        java.lang.Object obj42 = defaultedMap35.remove((java.lang.Object) predicateUtils41);
        boolean b43 = defaultedMap35.isEmpty();
        defaultedMap16.putAll((java.util.Map) defaultedMap35);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i48 = defaultedMap47.size();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate49, predicate50);
        java.lang.String str52 = defaultedMap47.toString();
        collections.PredicateUtils predicateUtils53 = new collections.PredicateUtils();
        java.lang.Object obj54 = defaultedMap47.remove((java.lang.Object) predicateUtils53);
        java.lang.Object obj55 = new java.lang.Object();
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome59 = elitisticListPopulation58.spliterator();
        int i60 = elitisticListPopulation58.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array61 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome62 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b63 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome62, chromosome_array61);
        elitisticListPopulation58.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome62);
        java.lang.Object obj65 = defaultedMap47.put(obj55, (java.lang.Object) elitisticListPopulation58);
        boolean b66 = defaultedMap1.equals(obj65);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(spliterator_chromosome59);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNotNull(chromosome_array61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        int i5 = elitisticListPopulation2.getPopulationSize();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        double d7 = elitisticListPopulation2.getElitismRate();
        try {
            elitisticListPopulation2.setElitismRate((double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(d7 == 0.0d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set12 = defaultedMap11.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = elitisticListPopulation15.spliterator();
        int i17 = elitisticListPopulation15.getPopulationSize();
        int i18 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome22 = elitisticListPopulation21.spliterator();
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        elitisticListPopulation21.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24);
        elitisticListPopulation15.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24);
        boolean b28 = defaultedMap11.containsKey((java.lang.Object) arraylist_chromosome24);
        boolean b29 = defaultedMap1.equals((java.lang.Object) b28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i32 = defaultedMap31.size();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 1.0f);
        defaultedMap31.clear();
        java.util.Set set36 = defaultedMap31.entrySet();
        java.lang.Object obj37 = defaultedMap1.get((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i40 = defaultedMap39.size();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set45 = defaultedMap44.entrySet();
        boolean b46 = defaultedMap39.containsKey((java.lang.Object) set45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i49 = defaultedMap48.size();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set54 = defaultedMap53.entrySet();
        boolean b55 = defaultedMap48.containsKey((java.lang.Object) set54);
        defaultedMap39.putAll((java.util.Map) defaultedMap48);
        math.genetics.ElitisticListPopulation elitisticListPopulation59 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population60 = elitisticListPopulation59.nextGeneration();
        math.genetics.Chromosome chromosome61 = null;
        elitisticListPopulation59.addChromosome(chromosome61);
        int i63 = elitisticListPopulation59.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome64 = elitisticListPopulation59.iterator();
        java.lang.Object obj65 = defaultedMap48.get((java.lang.Object) iterator_chromosome64);
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) defaultedMap48);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome22);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + '#' + "'", obj37.equals('#'));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(population60);
        org.junit.Assert.assertTrue(i63 == 1);
        org.junit.Assert.assertNotNull(iterator_chromosome64);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + '#' + "'", obj65.equals('#'));
        org.junit.Assert.assertNotNull(map66);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i9 = defaultedMap8.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0f);
        defaultedMap1.putAll(map11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i15 = defaultedMap14.size();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) set20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i24 = defaultedMap23.size();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 1.0f);
        defaultedMap14.putAll(map26);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        java.util.Set set29 = defaultedMap14.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.util.Set set8 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        int i5 = elitisticListPopulation2.getPopulationSize();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        double d7 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation2.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        int i5 = elitisticListPopulation2.getPopulationSize();
        int i6 = elitisticListPopulation2.getPopulationSize();
        try {
            math.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i5 = defaultedMap4.size();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b11 = defaultedMap4.containsKey((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i14 = defaultedMap13.size();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 1.0f);
        defaultedMap4.putAll(map16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate(map16, (java.lang.Object) "hi!");
        defaultedMap2.putAll(map16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i23 = defaultedMap22.size();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population29 = elitisticListPopulation28.nextGeneration();
        java.lang.Object obj30 = defaultedMap22.get((java.lang.Object) elitisticListPopulation28);
        math.genetics.Population population31 = elitisticListPopulation28.nextGeneration();
        boolean b32 = defaultedMap2.containsValue((java.lang.Object) population31);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(population29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + '#' + "'", obj30.equals('#'));
        org.junit.Assert.assertNotNull(population31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation7);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 0.0d);
        java.util.Collection collection12 = defaultedMap1.values();
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        defaultedMap1.putAll(map13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i17 = defaultedMap16.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i23 = defaultedMap22.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = elitisticListPopulation26.spliterator();
        java.lang.Object obj28 = defaultedMap22.get((java.lang.Object) spliterator_chromosome27);
        java.lang.String str29 = defaultedMap22.toString();
        java.lang.Object obj30 = defaultedMap19.get((java.lang.Object) defaultedMap22);
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + '#' + "'", obj28.equals('#'));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + '#' + "'", obj30.equals('#'));
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i7 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        int i11 = defaultedMap6.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        boolean b14 = defaultedMap6.containsKey((java.lang.Object) 0L);
        java.util.Collection collection15 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i18 = defaultedMap17.size();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set23 = defaultedMap22.entrySet();
        boolean b24 = defaultedMap17.containsKey((java.lang.Object) set23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i27 = defaultedMap26.size();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set32 = defaultedMap31.entrySet();
        boolean b33 = defaultedMap26.containsKey((java.lang.Object) set32);
        defaultedMap17.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i37 = defaultedMap36.size();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate38, predicate39);
        java.lang.String str41 = defaultedMap36.toString();
        collections.PredicateUtils predicateUtils42 = new collections.PredicateUtils();
        java.lang.Object obj43 = defaultedMap36.remove((java.lang.Object) predicateUtils42);
        java.lang.Object obj44 = new java.lang.Object();
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome48 = elitisticListPopulation47.spliterator();
        int i49 = elitisticListPopulation47.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        elitisticListPopulation47.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome51);
        java.lang.Object obj54 = defaultedMap36.put(obj44, (java.lang.Object) elitisticListPopulation47);
        java.lang.Object obj55 = defaultedMap26.remove(obj44);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome59 = elitisticListPopulation58.spliterator();
        int i60 = elitisticListPopulation58.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array61 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome62 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b63 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome62, chromosome_array61);
        elitisticListPopulation58.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome62);
        math.genetics.Population population65 = elitisticListPopulation58.nextGeneration();
        java.lang.Object obj66 = defaultedMap26.remove((java.lang.Object) elitisticListPopulation58);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i69 = defaultedMap68.size();
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set74 = defaultedMap73.entrySet();
        boolean b75 = defaultedMap68.containsKey((java.lang.Object) set74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i78 = defaultedMap77.size();
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap77, (java.lang.Object) 1.0f);
        defaultedMap68.putAll(map80);
        collections.Predicate predicate82 = collections.PredicateUtils.uniquePredicate();
        boolean b83 = defaultedMap68.containsKey((java.lang.Object) predicate82);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i86 = defaultedMap85.size();
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate87, predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate82, predicate88);
        boolean b91 = defaultedMap6.containsKey((java.lang.Object) defaultedMap26);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(spliterator_chromosome48);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(spliterator_chromosome59);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNotNull(chromosome_array61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(population65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue(b91 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        try {
            math.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 0.0d);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i9 = defaultedMap8.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap8.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i18 = defaultedMap17.size();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 1.0f);
        defaultedMap8.putAll(map20);
        java.util.Map map23 = collections.map.DefaultedMap.decorate(map20, (java.lang.Object) "hi!");
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map20);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        boolean b19 = defaultedMap1.isEmpty();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i23 = defaultedMap22.size();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate20, predicate24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i30 = defaultedMap29.size();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population36 = elitisticListPopulation35.nextGeneration();
        java.lang.Object obj37 = defaultedMap29.get((java.lang.Object) elitisticListPopulation35);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome38 = elitisticListPopulation35.iterator();
        boolean b39 = defaultedMap1.equals((java.lang.Object) iterator_chromosome38);
        java.util.Set set40 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(population36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + '#' + "'", obj37.equals('#'));
        org.junit.Assert.assertNotNull(iterator_chromosome38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) predicateUtils7);
        java.lang.Object obj9 = new java.lang.Object();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation12.spliterator();
        int i14 = elitisticListPopulation12.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        java.lang.Object obj19 = defaultedMap1.put(obj9, (java.lang.Object) elitisticListPopulation12);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i22 = defaultedMap21.size();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate23, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i28 = defaultedMap27.size();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set33 = defaultedMap32.entrySet();
        boolean b34 = defaultedMap27.containsKey((java.lang.Object) set33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i37 = defaultedMap36.size();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set42 = defaultedMap41.entrySet();
        boolean b43 = defaultedMap36.containsKey((java.lang.Object) set42);
        defaultedMap27.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj45 = defaultedMap21.remove((java.lang.Object) defaultedMap36);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap21);
        int i47 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(i47 == 1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i11 = defaultedMap10.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i21 = defaultedMap20.size();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        java.lang.String str25 = defaultedMap20.toString();
        defaultedMap20.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap20);
        java.lang.String str28 = defaultedMap10.toString();
        java.util.Collection collection29 = defaultedMap10.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i7 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        int i11 = defaultedMap6.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i15 = defaultedMap14.size();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) set20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i24 = defaultedMap23.size();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set29 = defaultedMap28.entrySet();
        boolean b30 = defaultedMap23.containsKey((java.lang.Object) set29);
        defaultedMap14.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i34 = defaultedMap33.size();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate35, predicate36);
        java.lang.String str38 = defaultedMap33.toString();
        defaultedMap33.clear();
        defaultedMap23.putAll((java.util.Map) defaultedMap33);
        int i41 = defaultedMap23.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i45 = defaultedMap44.size();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i51 = defaultedMap50.size();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set56 = defaultedMap55.entrySet();
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) set56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i60 = defaultedMap59.size();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set65 = defaultedMap64.entrySet();
        boolean b66 = defaultedMap59.containsKey((java.lang.Object) set65);
        defaultedMap50.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj68 = defaultedMap44.remove((java.lang.Object) defaultedMap59);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i71 = defaultedMap70.size();
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation76 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population77 = elitisticListPopulation76.nextGeneration();
        java.lang.Object obj78 = defaultedMap70.get((java.lang.Object) elitisticListPopulation76);
        java.lang.Object obj79 = defaultedMap23.put((java.lang.Object) defaultedMap59, (java.lang.Object) defaultedMap70);
        collections.Factory factory80 = null;
        try {
            java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, factory80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(population77);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + '#' + "'", obj78.equals('#'));
        org.junit.Assert.assertNull(obj79);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6);
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        double d10 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(d10 == 0.0d);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation7);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation7.iterator();
        int i11 = elitisticListPopulation7.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i14 = defaultedMap13.size();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population20 = elitisticListPopulation19.nextGeneration();
        java.lang.Object obj21 = defaultedMap13.get((java.lang.Object) elitisticListPopulation19);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation19.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome26 = elitisticListPopulation25.spliterator();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation25.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation7.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome33 = arraylist_chromosome28.spliterator();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
        org.junit.Assert.assertNotNull(iterator_chromosome10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(population20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + '#' + "'", obj21.equals('#'));
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(spliterator_chromosome26);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome33);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '#');
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i9 = defaultedMap8.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap8.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i18 = defaultedMap17.size();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set23 = defaultedMap22.entrySet();
        boolean b24 = defaultedMap17.containsKey((java.lang.Object) set23);
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i28 = defaultedMap27.size();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        java.lang.String str32 = defaultedMap27.toString();
        defaultedMap27.clear();
        defaultedMap17.putAll((java.util.Map) defaultedMap27);
        int i35 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i38 = defaultedMap37.size();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set43 = defaultedMap42.entrySet();
        boolean b44 = defaultedMap37.containsKey((java.lang.Object) set43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i47 = defaultedMap46.size();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set52 = defaultedMap51.entrySet();
        boolean b53 = defaultedMap46.containsKey((java.lang.Object) set52);
        defaultedMap37.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i57 = defaultedMap56.size();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate58, predicate59);
        java.lang.String str61 = defaultedMap56.toString();
        collections.PredicateUtils predicateUtils62 = new collections.PredicateUtils();
        java.lang.Object obj63 = defaultedMap56.remove((java.lang.Object) predicateUtils62);
        java.lang.Object obj64 = new java.lang.Object();
        math.genetics.ElitisticListPopulation elitisticListPopulation67 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome68 = elitisticListPopulation67.spliterator();
        int i69 = elitisticListPopulation67.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array70 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome71 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b72 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome71, chromosome_array70);
        elitisticListPopulation67.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome71);
        java.lang.Object obj74 = defaultedMap56.put(obj64, (java.lang.Object) elitisticListPopulation67);
        java.lang.Object obj75 = defaultedMap46.remove(obj64);
        java.lang.Object obj76 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap46);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i79 = defaultedMap78.size();
        java.util.Set set80 = defaultedMap78.entrySet();
        int i81 = defaultedMap78.size();
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i84 = defaultedMap83.size();
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) '#');
        defaultedMap83.putAll((java.util.Map) defaultedMap86);
        int i88 = defaultedMap83.size();
        defaultedMap78.putAll((java.util.Map) defaultedMap83);
        boolean b91 = defaultedMap83.containsKey((java.lang.Object) 0L);
        java.lang.Object obj92 = defaultedMap17.get((java.lang.Object) defaultedMap83);
        collections.map.DefaultedMap defaultedMap94 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i95 = defaultedMap94.size();
        java.util.Set set96 = defaultedMap94.entrySet();
        java.lang.Object obj97 = new java.lang.Object();
        boolean b98 = defaultedMap94.equals(obj97);
        java.lang.Object obj99 = defaultedMap83.remove((java.lang.Object) defaultedMap94);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(spliterator_chromosome68);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNotNull(chromosome_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue(i81 == 0);
        org.junit.Assert.assertTrue(i84 == 0);
        org.junit.Assert.assertTrue(i88 == 0);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + '#' + "'", obj92.equals('#'));
        org.junit.Assert.assertTrue(i95 == 0);
        org.junit.Assert.assertNotNull(set96);
        org.junit.Assert.assertTrue(b98 == false);
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '#');
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i9 = defaultedMap8.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap8.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i18 = defaultedMap17.size();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set23 = defaultedMap22.entrySet();
        boolean b24 = defaultedMap17.containsKey((java.lang.Object) set23);
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i28 = defaultedMap27.size();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        java.lang.String str32 = defaultedMap27.toString();
        defaultedMap27.clear();
        defaultedMap17.putAll((java.util.Map) defaultedMap27);
        int i35 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i38 = defaultedMap37.size();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set43 = defaultedMap42.entrySet();
        boolean b44 = defaultedMap37.containsKey((java.lang.Object) set43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i47 = defaultedMap46.size();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set52 = defaultedMap51.entrySet();
        boolean b53 = defaultedMap46.containsKey((java.lang.Object) set52);
        defaultedMap37.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i57 = defaultedMap56.size();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate58, predicate59);
        java.lang.String str61 = defaultedMap56.toString();
        collections.PredicateUtils predicateUtils62 = new collections.PredicateUtils();
        java.lang.Object obj63 = defaultedMap56.remove((java.lang.Object) predicateUtils62);
        java.lang.Object obj64 = new java.lang.Object();
        math.genetics.ElitisticListPopulation elitisticListPopulation67 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome68 = elitisticListPopulation67.spliterator();
        int i69 = elitisticListPopulation67.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array70 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome71 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b72 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome71, chromosome_array70);
        elitisticListPopulation67.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome71);
        java.lang.Object obj74 = defaultedMap56.put(obj64, (java.lang.Object) elitisticListPopulation67);
        java.lang.Object obj75 = defaultedMap46.remove(obj64);
        java.lang.Object obj76 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap46);
        java.util.Set set77 = defaultedMap17.entrySet();
        java.util.Set set78 = defaultedMap17.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation81 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome82 = elitisticListPopulation81.spliterator();
        int i83 = elitisticListPopulation81.getPopulationLimit();
        int i84 = elitisticListPopulation81.getPopulationSize();
        boolean b85 = defaultedMap17.equals((java.lang.Object) i84);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(spliterator_chromosome68);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNotNull(chromosome_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNotNull(spliterator_chromosome82);
        org.junit.Assert.assertTrue(i83 == 1);
        org.junit.Assert.assertTrue(i84 == 0);
        org.junit.Assert.assertTrue(b85 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        int i7 = elitisticListPopulation2.getPopulationLimit();
        try {
            math.genetics.Chromosome chromosome8 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i7 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        int i11 = defaultedMap6.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i15 = defaultedMap14.size();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) set20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i24 = defaultedMap23.size();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set29 = defaultedMap28.entrySet();
        boolean b30 = defaultedMap23.containsKey((java.lang.Object) set29);
        defaultedMap14.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i34 = defaultedMap33.size();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate35, predicate36);
        java.lang.String str38 = defaultedMap33.toString();
        defaultedMap33.clear();
        defaultedMap23.putAll((java.util.Map) defaultedMap33);
        int i41 = defaultedMap23.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i45 = defaultedMap44.size();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate46, predicate47);
        java.lang.String str49 = defaultedMap44.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i52 = defaultedMap51.size();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) 1.0f);
        defaultedMap44.putAll(map54);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        math.genetics.Population population59 = elitisticListPopulation58.nextGeneration();
        double d60 = elitisticListPopulation58.getElitismRate();
        boolean b61 = defaultedMap44.equals((java.lang.Object) elitisticListPopulation58);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i64 = defaultedMap63.size();
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set69 = defaultedMap68.entrySet();
        boolean b70 = defaultedMap63.containsKey((java.lang.Object) set69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) '#');
        int i73 = defaultedMap72.size();
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap72, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set78 = defaultedMap77.entrySet();
        boolean b79 = defaultedMap72.containsKey((java.lang.Object) set78);
        defaultedMap63.putAll((java.util.Map) defaultedMap72);
        boolean b81 = defaultedMap63.isEmpty();
        java.lang.Object obj82 = defaultedMap44.get((java.lang.Object) defaultedMap63);
        boolean b84 = defaultedMap63.equals((java.lang.Object) "");
        java.lang.Object obj85 = defaultedMap1.get((java.lang.Object) defaultedMap63);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(population59);
        org.junit.Assert.assertTrue(d60 == 0.0d);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + '#' + "'", obj82.equals('#'));
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + '#' + "'", obj85.equals('#'));
    }
}

