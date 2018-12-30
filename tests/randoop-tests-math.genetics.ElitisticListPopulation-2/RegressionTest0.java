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
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        defaultedMap1.clear();
        int i8 = defaultedMap1.size();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        defaultedMap1.clear();
        int i8 = defaultedMap1.size();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        try {
            elitisticListPopulation5.setElitismRate((double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        try {
            math.genetics.Chromosome chromosome8 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, 1, 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation5.addChromosome(chromosome13);
        try {
            math.genetics.Chromosome chromosome15 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.lang.String str7 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setElitismRate((double) 1.0f);
        int i10 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i10 == 100);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        java.util.Collection collection4 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        defaultedMap1.clear();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) (byte) 0, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        double d7 = elitisticListPopulation5.getElitismRate();
        try {
            elitisticListPopulation5.setPopulationLimit((-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(d7 == 0.0d);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation5.setPopulationLimit((int) (short) 1);
        double d9 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(d9 == 0.0d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        int i3 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        boolean b5 = defaultedMap1.containsKey(obj4);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation8.getChromosomes();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap12.isEmpty();
        defaultedMap12.clear();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) (short) 100);
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) (-1.0f));
        boolean b20 = defaultedMap12.containsValue((java.lang.Object) 0.0d);
        int i21 = defaultedMap12.size();
        java.lang.Object obj23 = defaultedMap12.remove((java.lang.Object) (-1.0f));
        java.util.Collection collection24 = defaultedMap12.values();
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection24);
        try {
            elitisticListPopulation8.setPopulationLimit((-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertNotNull(population7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        boolean b5 = defaultedMap1.containsKey(obj4);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation8.getChromosomes();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        java.util.Collection collection11 = defaultedMap1.values();
        java.util.Set set12 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        try {
            math.genetics.Chromosome chromosome9 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 0.0d);
        int i10 = defaultedMap1.size();
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation5.addChromosome(chromosome13);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome21);
        java.lang.String str23 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[null]" + "'", str23.equals("[null]"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        defaultedMap1.clear();
        int i8 = defaultedMap1.size();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap12.isEmpty();
        defaultedMap12.clear();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) (short) 100);
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) (-1.0f));
        boolean b20 = defaultedMap12.containsValue((java.lang.Object) 0.0d);
        int i21 = defaultedMap12.size();
        java.lang.Object obj23 = defaultedMap12.remove((java.lang.Object) (-1.0f));
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        collections.Factory factory25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, 10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', 0.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation5.addChromosome(chromosome13);
        try {
            elitisticListPopulation5.setElitismRate((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation5.addChromosome(chromosome13);
        double d15 = elitisticListPopulation5.getElitismRate();
        try {
            elitisticListPopulation5.setPopulationLimit((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) true);
        collections.Predicate predicate8 = null;
        collections.Predicate predicate9 = null;
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) map10);
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.lang.String str7 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setElitismRate((double) 1.0f);
        math.genetics.Population population10 = elitisticListPopulation5.nextGeneration();
        try {
            math.genetics.Chromosome chromosome11 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(population10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        boolean b5 = defaultedMap1.containsKey(obj4);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation8.getChromosomes();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap12.isEmpty();
        defaultedMap12.clear();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) (short) 100);
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) (-1.0f));
        boolean b20 = defaultedMap12.containsValue((java.lang.Object) 0.0d);
        int i21 = defaultedMap12.size();
        java.lang.Object obj23 = defaultedMap12.remove((java.lang.Object) (-1.0f));
        java.util.Collection collection24 = defaultedMap12.values();
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection24);
        java.lang.String str26 = elitisticListPopulation8.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 0.0d);
        int i10 = defaultedMap1.size();
        java.lang.Object obj11 = null;
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) true);
        collections.Predicate predicate17 = null;
        collections.Predicate predicate18 = null;
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate18);
        defaultedMap14.clear();
        int i21 = defaultedMap14.size();
        java.lang.Object obj23 = defaultedMap14.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b26 = defaultedMap25.isEmpty();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        boolean b28 = defaultedMap25.containsKey((java.lang.Object) predicate27);
        boolean b29 = defaultedMap14.equals((java.lang.Object) predicate27);
        java.util.Collection collection30 = defaultedMap14.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation33.getChromosomes();
        java.lang.String str35 = elitisticListPopulation33.toString();
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap14, (java.lang.Object) str35);
        boolean b38 = defaultedMap14.containsValue((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0.0d + "'", obj16.equals(0.0d));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0.0d + "'", obj23.equals(0.0d));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(list_chromosome34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[]" + "'", str35.equals("[]"));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        defaultedMap1.clear();
        int i8 = defaultedMap1.size();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap12.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b19 = defaultedMap18.isEmpty();
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b27 = defaultedMap26.isEmpty();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        boolean b29 = defaultedMap26.containsKey((java.lang.Object) predicate28);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) b29);
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) defaultedMap22);
        boolean b32 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0.0d + "'", obj24.equals(0.0d));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) true);
        collections.Predicate predicate14 = null;
        collections.Predicate predicate15 = null;
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate14, predicate15);
        defaultedMap11.clear();
        int i18 = defaultedMap11.size();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, 100, 0.0d);
        elitisticListPopulation24.setPopulationLimit((int) '#');
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        defaultedMap1.putAll(map27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b31 = defaultedMap30.isEmpty();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        boolean b33 = defaultedMap30.containsKey((java.lang.Object) predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b36 = defaultedMap35.isEmpty();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        boolean b38 = defaultedMap35.containsKey((java.lang.Object) predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate(map27, predicate32, predicate39);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0.0d + "'", obj13.equals(0.0d));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setPopulationLimit((int) (short) 10);
        int i10 = elitisticListPopulation5.getPopulationLimit();
        java.lang.String str11 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i10 == 10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) true);
        collections.Predicate predicate14 = null;
        collections.Predicate predicate15 = null;
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) true);
        collections.Predicate predicate21 = null;
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate21, predicate22);
        defaultedMap18.clear();
        int i25 = defaultedMap18.size();
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) map16, (java.lang.Object) defaultedMap18);
        collections.Factory factory27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0.0d + "'", obj13.equals(0.0d));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap5.isEmpty();
        defaultedMap5.clear();
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap5.containsValue(obj10);
        boolean b12 = defaultedMap1.containsKey(obj10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        java.util.Collection collection13 = defaultedMap11.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) true);
        collections.Predicate predicate18 = null;
        collections.Predicate predicate19 = null;
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate18, predicate19);
        defaultedMap15.clear();
        int i22 = defaultedMap15.size();
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b27 = defaultedMap26.isEmpty();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        boolean b29 = defaultedMap26.containsKey((java.lang.Object) predicate28);
        boolean b30 = defaultedMap15.equals((java.lang.Object) predicate28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b33 = defaultedMap32.isEmpty();
        defaultedMap32.clear();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b41 = defaultedMap40.isEmpty();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        boolean b43 = defaultedMap40.containsKey((java.lang.Object) predicate42);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) b43);
        java.lang.Object obj45 = defaultedMap15.put((java.lang.Object) defaultedMap32, (java.lang.Object) defaultedMap36);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj47 = defaultedMap11.put((java.lang.Object) defaultedMap15, (java.lang.Object) predicate46);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0.0d + "'", obj17.equals(0.0d));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0.0d + "'", obj24.equals(0.0d));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0.0d + "'", obj38.equals(0.0d));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        boolean b5 = defaultedMap1.containsKey(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) true);
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = null;
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        defaultedMap7.clear();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b17 = defaultedMap16.isEmpty();
        defaultedMap16.clear();
        boolean b20 = defaultedMap16.containsValue((java.lang.Object) (short) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b24 = defaultedMap23.isEmpty();
        defaultedMap23.clear();
        boolean b27 = defaultedMap23.containsValue((java.lang.Object) (short) 100);
        boolean b29 = defaultedMap23.containsKey((java.lang.Object) (-1.0f));
        boolean b31 = defaultedMap23.containsValue((java.lang.Object) 0.0d);
        int i32 = defaultedMap23.size();
        java.lang.Object obj34 = defaultedMap23.remove((java.lang.Object) (-1.0f));
        java.util.Collection collection35 = defaultedMap23.values();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap37);
        java.util.Set set39 = defaultedMap38.entrySet();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) set39);
        defaultedMap16.putAll(map40);
        java.util.Map map43 = collections.map.DefaultedMap.decorate(map40, (java.lang.Object) true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        org.junit.Assert.assertTrue(i5 == 10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap5.isEmpty();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) predicate7);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap11.isEmpty();
        defaultedMap11.clear();
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) (short) 100);
        boolean b17 = defaultedMap11.containsKey((java.lang.Object) (-1.0f));
        boolean b19 = defaultedMap11.containsValue((java.lang.Object) 0.0d);
        int i20 = defaultedMap11.size();
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b24 = defaultedMap23.isEmpty();
        defaultedMap23.clear();
        boolean b27 = defaultedMap23.containsValue((java.lang.Object) (short) 100);
        boolean b29 = defaultedMap23.containsKey((java.lang.Object) (-1.0f));
        boolean b31 = defaultedMap23.containsValue((java.lang.Object) 0.0d);
        int i32 = defaultedMap23.size();
        java.lang.Object obj34 = defaultedMap23.remove((java.lang.Object) (-1.0f));
        java.util.Collection collection35 = defaultedMap23.values();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap37);
        java.util.Set set39 = defaultedMap38.entrySet();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) set39);
        boolean b41 = defaultedMap23.isEmpty();
        boolean b42 = defaultedMap11.equals((java.lang.Object) b41);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = arraylist_chromosome1.spliterator();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (-1), (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        java.util.Collection collection13 = defaultedMap11.values();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object obj15 = defaultedMap11.get(obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) (short) 100);
        boolean b23 = defaultedMap17.containsKey((java.lang.Object) (-1.0f));
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) (-1.0d));
        int i26 = defaultedMap17.size();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation32.getChromosomes();
        java.lang.String str34 = elitisticListPopulation32.toString();
        java.lang.Object obj35 = defaultedMap11.put((java.lang.Object) defaultedMap17, (java.lang.Object) str34);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0.0d + "'", obj25.equals(0.0d));
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]" + "'", str34.equals("[]"));
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.containsKey(obj3);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 0, (double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b10 = defaultedMap9.isEmpty();
        defaultedMap9.clear();
        java.lang.Object obj12 = null;
        boolean b13 = defaultedMap9.containsKey(obj12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) true);
        collections.Predicate predicate18 = null;
        collections.Predicate predicate19 = null;
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate18, predicate19);
        defaultedMap15.clear();
        java.lang.Object obj22 = defaultedMap9.get((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap24.isEmpty();
        defaultedMap24.clear();
        boolean b28 = defaultedMap24.containsValue((java.lang.Object) (short) 100);
        defaultedMap9.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0.0d + "'", obj17.equals(0.0d));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0.0d + "'", obj22.equals(0.0d));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0.0d + "'", obj30.equals(0.0d));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        defaultedMap1.clear();
        int i8 = defaultedMap1.size();
        boolean b9 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap11.isEmpty();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        boolean b14 = defaultedMap11.containsKey((java.lang.Object) predicate13);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = arraylist_chromosome16.spliterator();
        boolean b22 = defaultedMap11.containsValue((java.lang.Object) spliterator_chromosome21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap24.isEmpty();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) predicate26);
        boolean b29 = defaultedMap24.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj30 = defaultedMap11.remove((java.lang.Object) defaultedMap24);
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) true);
        collections.Predicate predicate36 = null;
        collections.Predicate predicate37 = null;
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate36, predicate37);
        boolean b39 = defaultedMap1.containsValue((java.lang.Object) predicate37);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0.0d + "'", obj35.equals(0.0d));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.lang.String str7 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setElitismRate((double) 1.0f);
        java.lang.String str10 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setPopulationLimit((int) (short) 10);
        int i10 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation5.addChromosome(chromosome11);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i10 == 10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        int i7 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        try {
            math.genetics.Chromosome chromosome6 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = arraylist_chromosome9.spliterator();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) (short) 100, (double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = arraylist_chromosome6.spliterator();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) spliterator_chromosome11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) predicate16);
        boolean b19 = defaultedMap14.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap22.isEmpty();
        defaultedMap22.clear();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (short) 100);
        boolean b28 = defaultedMap22.containsKey((java.lang.Object) (-1.0f));
        boolean b30 = defaultedMap22.containsValue((java.lang.Object) 0.0d);
        int i31 = defaultedMap22.size();
        defaultedMap14.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b35 = defaultedMap34.isEmpty();
        defaultedMap34.clear();
        boolean b38 = defaultedMap34.containsValue((java.lang.Object) (short) 100);
        boolean b40 = defaultedMap34.containsKey((java.lang.Object) (-1.0f));
        boolean b42 = defaultedMap34.containsValue((java.lang.Object) 0.0d);
        boolean b43 = defaultedMap22.containsKey((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) true);
        collections.Predicate predicate48 = null;
        collections.Predicate predicate49 = null;
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate48, predicate49);
        defaultedMap45.clear();
        boolean b53 = defaultedMap45.equals((java.lang.Object) 10.0d);
        java.lang.String str54 = defaultedMap45.toString();
        java.lang.Object obj55 = defaultedMap22.get((java.lang.Object) defaultedMap45);
        java.util.Collection collection56 = defaultedMap45.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0.0d + "'", obj47.equals(0.0d));
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 0.0d + "'", obj55.equals(0.0d));
        org.junit.Assert.assertNotNull(collection56);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = arraylist_chromosome6.spliterator();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) spliterator_chromosome11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) predicate16);
        boolean b19 = defaultedMap14.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap22.isEmpty();
        defaultedMap22.clear();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (short) 100);
        boolean b28 = defaultedMap22.containsKey((java.lang.Object) (-1.0f));
        boolean b30 = defaultedMap22.containsValue((java.lang.Object) 0.0d);
        int i31 = defaultedMap22.size();
        defaultedMap14.putAll((java.util.Map) defaultedMap22);
        boolean b34 = defaultedMap22.containsValue((java.lang.Object) 'a');
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.lang.String str7 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setElitismRate((double) 1.0f);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, 100, 0.0d);
        double d16 = elitisticListPopulation15.getElitismRate();
        java.lang.String str17 = elitisticListPopulation15.toString();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome24 = arraylist_chromosome19.spliterator();
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(d16 == 0.0d);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome24);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = arraylist_chromosome6.spliterator();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) spliterator_chromosome11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) predicate16);
        boolean b19 = defaultedMap14.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap22.isEmpty();
        defaultedMap22.clear();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (short) 100);
        boolean b28 = defaultedMap22.containsKey((java.lang.Object) (-1.0f));
        boolean b30 = defaultedMap22.containsValue((java.lang.Object) 0.0d);
        int i31 = defaultedMap22.size();
        defaultedMap14.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection33 = defaultedMap22.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) true);
        collections.Predicate predicate8 = null;
        collections.Predicate predicate9 = null;
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        boolean b12 = defaultedMap5.containsKey((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = null;
        boolean b14 = defaultedMap5.containsValue(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) true);
        collections.Predicate predicate19 = null;
        collections.Predicate predicate20 = null;
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate19, predicate20);
        boolean b23 = defaultedMap16.containsKey((java.lang.Object) (-1.0f));
        boolean b25 = defaultedMap16.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b28 = defaultedMap27.isEmpty();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        boolean b30 = defaultedMap27.containsKey((java.lang.Object) predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj37 = defaultedMap35.get((java.lang.Object) true);
        collections.Predicate predicate38 = null;
        collections.Predicate predicate39 = null;
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate38, predicate39);
        defaultedMap35.clear();
        int i42 = defaultedMap35.size();
        java.lang.Object obj44 = defaultedMap35.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b47 = defaultedMap46.isEmpty();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        boolean b49 = defaultedMap46.containsKey((java.lang.Object) predicate48);
        boolean b50 = defaultedMap35.equals((java.lang.Object) predicate48);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate32, predicate48);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate32, predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b56 = defaultedMap55.isEmpty();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        boolean b58 = defaultedMap55.containsKey((java.lang.Object) predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate59, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate32, predicate59);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0.0d + "'", obj18.equals(0.0d));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0.0d + "'", obj37.equals(0.0d));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0.0d + "'", obj44.equals(0.0d));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        boolean b10 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap12.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) true);
        collections.Predicate predicate23 = null;
        collections.Predicate predicate24 = null;
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate23, predicate24);
        defaultedMap20.clear();
        int i27 = defaultedMap20.size();
        java.lang.Object obj29 = defaultedMap20.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b32 = defaultedMap31.isEmpty();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        boolean b34 = defaultedMap31.containsKey((java.lang.Object) predicate33);
        boolean b35 = defaultedMap20.equals((java.lang.Object) predicate33);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate33);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap38);
        java.util.Set set40 = defaultedMap39.entrySet();
        boolean b41 = defaultedMap1.containsKey((java.lang.Object) defaultedMap39);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0.0d + "'", obj22.equals(0.0d));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0.0d + "'", obj29.equals(0.0d));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        int i13 = defaultedMap1.size();
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        boolean b5 = defaultedMap1.containsKey(obj4);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation8.getChromosomes();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap12.isEmpty();
        defaultedMap12.clear();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) (short) 100);
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) (-1.0f));
        boolean b20 = defaultedMap12.containsValue((java.lang.Object) 0.0d);
        int i21 = defaultedMap12.size();
        java.lang.Object obj23 = defaultedMap12.remove((java.lang.Object) (-1.0f));
        java.util.Collection collection24 = defaultedMap12.values();
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection24);
        double d26 = elitisticListPopulation8.getElitismRate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b29 = defaultedMap28.isEmpty();
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31, 100, 0.0d);
        double d36 = elitisticListPopulation35.getElitismRate();
        java.lang.String str37 = elitisticListPopulation35.toString();
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome44 = arraylist_chromosome39.spliterator();
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39);
        boolean b46 = defaultedMap28.equals((java.lang.Object) elitisticListPopulation35);
        double d47 = elitisticListPopulation35.getElitismRate();
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome49, 100, 0.0d);
        double d54 = elitisticListPopulation53.getElitismRate();
        java.lang.String str55 = elitisticListPopulation53.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome56 = elitisticListPopulation53.iterator();
        math.genetics.Chromosome[] chromosome_array57 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome58 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b59 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58, chromosome_array57);
        elitisticListPopulation53.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome58);
        elitisticListPopulation35.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome58);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome58);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(d26 == 0.0d);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(d36 == 0.0d);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(d47 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(d54 == 0.0d);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "[]" + "'", str55.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome56);
        org.junit.Assert.assertNotNull(chromosome_array57);
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 100, 0.0d);
        double d13 = elitisticListPopulation12.getElitismRate();
        java.lang.String str14 = elitisticListPopulation12.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation17.getChromosomes();
        elitisticListPopulation12.setChromosomes(list_chromosome18);
        elitisticListPopulation5.setChromosomes(list_chromosome18);
        double d21 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(d21 == 0.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        defaultedMap1.clear();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap1.equals(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) true);
        collections.Predicate predicate14 = null;
        collections.Predicate predicate15 = null;
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate14, predicate15);
        defaultedMap11.clear();
        int i18 = defaultedMap11.size();
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap22.isEmpty();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        boolean b25 = defaultedMap22.containsKey((java.lang.Object) predicate24);
        boolean b26 = defaultedMap11.equals((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b29 = defaultedMap28.isEmpty();
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b37 = defaultedMap36.isEmpty();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        boolean b39 = defaultedMap36.containsKey((java.lang.Object) predicate38);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) b39);
        java.lang.Object obj41 = defaultedMap11.put((java.lang.Object) defaultedMap28, (java.lang.Object) defaultedMap32);
        java.lang.String str42 = defaultedMap32.toString();
        boolean b43 = defaultedMap1.containsKey((java.lang.Object) str42);
        int i44 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0.0d + "'", obj13.equals(0.0d));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0.0d + "'", obj34.equals(0.0d));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 0, 10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        boolean b5 = defaultedMap1.containsKey(obj4);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation8.getChromosomes();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) true);
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = null;
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        boolean b20 = defaultedMap13.containsKey((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) (-1.0f));
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0.0d + "'", obj15.equals(0.0d));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0.0d + "'", obj21.equals(0.0d));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        defaultedMap1.clear();
        int i8 = defaultedMap1.size();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap12.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b19 = defaultedMap18.isEmpty();
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b27 = defaultedMap26.isEmpty();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        boolean b29 = defaultedMap26.containsKey((java.lang.Object) predicate28);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) b29);
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) defaultedMap22);
        java.util.Set set32 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0.0d + "'", obj24.equals(0.0d));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        boolean b5 = defaultedMap1.containsKey(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) true);
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = null;
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        defaultedMap7.clear();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.util.Collection collection15 = defaultedMap7.values();
        boolean b17 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        double d7 = elitisticListPopulation5.getElitismRate();
        int i8 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation5.spliterator();
        elitisticListPopulation5.setPopulationLimit((int) ' ');
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap5.isEmpty();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) predicate7);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b8);
        int i10 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        boolean b5 = defaultedMap1.containsKey(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) true);
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = null;
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        defaultedMap7.clear();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, 100, 0.0d);
        double d21 = elitisticListPopulation20.getElitismRate();
        java.lang.String str22 = elitisticListPopulation20.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome23 = elitisticListPopulation20.iterator();
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation20.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome28 = elitisticListPopulation20.spliterator();
        java.lang.Object obj29 = defaultedMap7.get((java.lang.Object) spliterator_chromosome28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b32 = defaultedMap31.isEmpty();
        defaultedMap31.clear();
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap31.containsKey(obj34);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation38.getChromosomes();
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) elitisticListPopulation38);
        java.util.Collection collection41 = defaultedMap31.values();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap31);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) 1.0d);
        boolean b45 = defaultedMap7.containsValue((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(d21 == 0.0d);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome23);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0.0d + "'", obj29.equals(0.0d));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(list_chromosome39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0.0d + "'", obj40.equals(0.0d));
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome11);
        int i13 = elitisticListPopulation5.getPopulationSize();
        java.lang.String str14 = elitisticListPopulation5.toString();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation20.getChromosomes();
        java.lang.String str22 = elitisticListPopulation20.toString();
        java.lang.String str23 = elitisticListPopulation20.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome24);
        elitisticListPopulation5.setPopulationLimit(10);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]" + "'", str23.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome24);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        defaultedMap1.clear();
        int i8 = defaultedMap1.size();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b17 = defaultedMap16.isEmpty();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        boolean b19 = defaultedMap16.containsKey((java.lang.Object) predicate18);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) b19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap22.isEmpty();
        defaultedMap22.clear();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (short) 100);
        boolean b28 = defaultedMap22.containsKey((java.lang.Object) (-1.0f));
        boolean b30 = defaultedMap22.containsValue((java.lang.Object) 0.0d);
        int i31 = defaultedMap22.size();
        boolean b32 = defaultedMap12.containsValue((java.lang.Object) defaultedMap22);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap22);
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap22.equals(obj34);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0.0d + "'", obj33.equals(0.0d));
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = arraylist_chromosome6.spliterator();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) spliterator_chromosome11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) predicate16);
        boolean b19 = defaultedMap14.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap22.isEmpty();
        defaultedMap22.clear();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (short) 100);
        boolean b28 = defaultedMap22.containsKey((java.lang.Object) (-1.0f));
        boolean b30 = defaultedMap22.containsValue((java.lang.Object) 0.0d);
        int i31 = defaultedMap22.size();
        defaultedMap14.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection33 = defaultedMap14.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) true);
        collections.Predicate predicate12 = null;
        collections.Predicate predicate13 = null;
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        defaultedMap9.clear();
        int i16 = defaultedMap9.size();
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap20.isEmpty();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        boolean b23 = defaultedMap20.containsKey((java.lang.Object) predicate22);
        boolean b24 = defaultedMap9.equals((java.lang.Object) predicate22);
        java.util.Collection collection25 = defaultedMap9.values();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) collection25);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) 0L);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, 100, 0.0d);
        double d35 = elitisticListPopulation34.getElitismRate();
        java.lang.String str36 = elitisticListPopulation34.toString();
        elitisticListPopulation34.setPopulationLimit((int) (short) 10);
        math.genetics.Population population39 = elitisticListPopulation34.nextGeneration();
        math.genetics.Population population40 = elitisticListPopulation34.nextGeneration();
        boolean b41 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation34);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0.0d + "'", obj18.equals(0.0d));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0.0d + "'", obj28.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(d35 == 0.0d);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]" + "'", str36.equals("[]"));
        org.junit.Assert.assertNotNull(population39);
        org.junit.Assert.assertNotNull(population40);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, 100, 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        java.lang.String str10 = elitisticListPopulation8.toString();
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome17 = arraylist_chromosome12.spliterator();
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12);
        boolean b19 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation8);
        double d20 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, 100, 0.0d);
        double d27 = elitisticListPopulation26.getElitismRate();
        java.lang.String str28 = elitisticListPopulation26.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome29 = elitisticListPopulation26.iterator();
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        elitisticListPopulation26.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31);
        double d35 = elitisticListPopulation8.getElitismRate();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(d27 == 0.0d);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]" + "'", str28.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome29);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(d35 == 0.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) true);
        collections.Predicate predicate8 = null;
        collections.Predicate predicate9 = null;
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) map10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b14 = defaultedMap13.isEmpty();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        boolean b16 = defaultedMap13.containsKey((java.lang.Object) predicate15);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome23 = arraylist_chromosome18.spliterator();
        boolean b24 = defaultedMap13.containsValue((java.lang.Object) spliterator_chromosome23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b27 = defaultedMap26.isEmpty();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        boolean b29 = defaultedMap26.containsKey((java.lang.Object) predicate28);
        boolean b31 = defaultedMap26.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj32 = defaultedMap13.remove((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b35 = defaultedMap34.isEmpty();
        defaultedMap34.clear();
        boolean b38 = defaultedMap34.containsValue((java.lang.Object) (short) 100);
        boolean b40 = defaultedMap34.containsKey((java.lang.Object) (-1.0f));
        boolean b42 = defaultedMap34.containsValue((java.lang.Object) 0.0d);
        int i43 = defaultedMap34.size();
        defaultedMap26.putAll((java.util.Map) defaultedMap34);
        boolean b45 = defaultedMap1.equals((java.lang.Object) defaultedMap34);
        boolean b46 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0);
        boolean b4 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        try {
            elitisticListPopulation5.setElitismRate((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap5.isEmpty();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) true);
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = null;
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        defaultedMap13.clear();
        int i20 = defaultedMap13.size();
        java.lang.Object obj22 = defaultedMap13.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap24.isEmpty();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) predicate26);
        boolean b28 = defaultedMap13.equals((java.lang.Object) predicate26);
        java.util.Collection collection29 = defaultedMap13.values();
        java.lang.Object obj30 = defaultedMap5.get((java.lang.Object) collection29);
        java.lang.Object obj32 = defaultedMap5.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b35 = defaultedMap34.isEmpty();
        defaultedMap34.clear();
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap34.containsKey(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) true);
        collections.Predicate predicate43 = null;
        collections.Predicate predicate44 = null;
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate43, predicate44);
        defaultedMap40.clear();
        java.lang.Object obj47 = defaultedMap34.get((java.lang.Object) defaultedMap40);
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome49, 100, 0.0d);
        double d54 = elitisticListPopulation53.getElitismRate();
        java.lang.String str55 = elitisticListPopulation53.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome56 = elitisticListPopulation53.iterator();
        math.genetics.Chromosome[] chromosome_array57 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome58 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b59 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58, chromosome_array57);
        elitisticListPopulation53.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome58);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome61 = elitisticListPopulation53.spliterator();
        java.lang.Object obj62 = defaultedMap40.get((java.lang.Object) spliterator_chromosome61);
        java.lang.Object obj63 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) defaultedMap40);
        boolean b64 = defaultedMap40.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0.0d + "'", obj15.equals(0.0d));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0.0d + "'", obj22.equals(0.0d));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0.0d + "'", obj30.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0.0d + "'", obj32.equals(0.0d));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0.0d + "'", obj42.equals(0.0d));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0.0d + "'", obj47.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(d54 == 0.0d);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "[]" + "'", str55.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome56);
        org.junit.Assert.assertNotNull(chromosome_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome61);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0.0d + "'", obj62.equals(0.0d));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b64 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, 100, 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        java.lang.String str10 = elitisticListPopulation8.toString();
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome17 = arraylist_chromosome12.spliterator();
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12);
        boolean b19 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation8);
        math.genetics.Population population20 = elitisticListPopulation8.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = elitisticListPopulation8.spliterator();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(population20);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        boolean b5 = defaultedMap1.containsKey(obj4);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation8.getChromosomes();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) true);
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = null;
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        boolean b20 = defaultedMap13.containsKey((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) (-1.0f));
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, 100, 0.0d);
        double d28 = elitisticListPopulation27.getElitismRate();
        java.lang.String str29 = elitisticListPopulation27.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome30 = elitisticListPopulation27.iterator();
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        elitisticListPopulation27.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32);
        math.genetics.Chromosome chromosome35 = null;
        elitisticListPopulation27.addChromosome(chromosome35);
        double d37 = elitisticListPopulation27.getElitismRate();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap39.isEmpty();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        boolean b42 = defaultedMap39.containsKey((java.lang.Object) predicate41);
        math.genetics.Chromosome[] chromosome_array43 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome44 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44, chromosome_array43);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome44, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome49 = arraylist_chromosome44.spliterator();
        boolean b50 = defaultedMap39.containsValue((java.lang.Object) spliterator_chromosome49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b53 = defaultedMap52.isEmpty();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        boolean b55 = defaultedMap52.containsKey((java.lang.Object) predicate54);
        boolean b57 = defaultedMap52.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj58 = defaultedMap39.remove((java.lang.Object) defaultedMap52);
        math.genetics.Chromosome[] chromosome_array59 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome60 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b61 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome60, chromosome_array59);
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome60, 100, 0.0d);
        double d65 = elitisticListPopulation64.getElitismRate();
        java.lang.String str66 = elitisticListPopulation64.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome67 = elitisticListPopulation64.iterator();
        math.genetics.Chromosome[] chromosome_array68 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome69 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b70 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome69, chromosome_array68);
        elitisticListPopulation64.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome69);
        java.util.List<math.genetics.Chromosome> list_chromosome72 = elitisticListPopulation64.getChromosomes();
        elitisticListPopulation64.setPopulationLimit(1);
        java.lang.Object obj75 = defaultedMap52.get((java.lang.Object) elitisticListPopulation64);
        java.lang.Object obj76 = defaultedMap1.put((java.lang.Object) d37, (java.lang.Object) elitisticListPopulation64);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0.0d + "'", obj15.equals(0.0d));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0.0d + "'", obj21.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]" + "'", str29.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome30);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(d37 == 0.0d);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(chromosome_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(chromosome_array59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(d65 == 0.0d);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "[]" + "'", str66.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome67);
        org.junit.Assert.assertNotNull(chromosome_array68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(list_chromosome72);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 0.0d + "'", obj75.equals(0.0d));
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        double d7 = elitisticListPopulation5.getElitismRate();
        java.lang.String str8 = elitisticListPopulation5.toString();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome15);
        math.genetics.Population population17 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(population17);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        defaultedMap1.clear();
        int i8 = defaultedMap1.size();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, 100, 0.0d);
        double d15 = elitisticListPopulation14.getElitismRate();
        java.lang.String str16 = elitisticListPopulation14.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation14.setChromosomes(list_chromosome20);
        int i22 = elitisticListPopulation14.getPopulationSize();
        java.lang.String str23 = elitisticListPopulation14.toString();
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation29.getChromosomes();
        java.lang.String str31 = elitisticListPopulation29.toString();
        java.lang.String str32 = elitisticListPopulation29.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation29.getChromosomes();
        elitisticListPopulation14.setChromosomes(list_chromosome33);
        java.lang.Object obj35 = defaultedMap1.get((java.lang.Object) list_chromosome33);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]" + "'", str23.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]" + "'", str31.equals("[]"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]" + "'", str32.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0.0d + "'", obj35.equals(0.0d));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        java.lang.String str4 = elitisticListPopulation2.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 0.0f);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b5 = defaultedMap4.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) true);
        collections.Predicate predicate15 = null;
        collections.Predicate predicate16 = null;
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate15, predicate16);
        defaultedMap12.clear();
        int i19 = defaultedMap12.size();
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b24 = defaultedMap23.isEmpty();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        boolean b26 = defaultedMap23.containsKey((java.lang.Object) predicate25);
        boolean b27 = defaultedMap12.equals((java.lang.Object) predicate25);
        java.util.Collection collection28 = defaultedMap12.values();
        java.lang.Object obj29 = defaultedMap4.get((java.lang.Object) collection28);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection28);
        int i31 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0.0d + "'", obj21.equals(0.0d));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0.0d + "'", obj29.equals(0.0d));
        org.junit.Assert.assertTrue(i31 == 1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap1.containsValue(obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) true);
        collections.Predicate predicate15 = null;
        collections.Predicate predicate16 = null;
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate15, predicate16);
        boolean b19 = defaultedMap12.containsKey((java.lang.Object) (-1.0f));
        boolean b21 = defaultedMap12.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b24 = defaultedMap23.isEmpty();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        boolean b26 = defaultedMap23.containsKey((java.lang.Object) predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) true);
        collections.Predicate predicate34 = null;
        collections.Predicate predicate35 = null;
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate34, predicate35);
        defaultedMap31.clear();
        int i38 = defaultedMap31.size();
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b43 = defaultedMap42.isEmpty();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        boolean b45 = defaultedMap42.containsKey((java.lang.Object) predicate44);
        boolean b46 = defaultedMap31.equals((java.lang.Object) predicate44);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate28, predicate44);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate28, predicate48);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0.0d + "'", obj33.equals(0.0d));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0.0d + "'", obj40.equals(0.0d));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome11);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome13);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        defaultedMap1.clear();
        int i8 = defaultedMap1.size();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b17 = defaultedMap16.isEmpty();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        boolean b19 = defaultedMap16.containsKey((java.lang.Object) predicate18);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) b19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap22.isEmpty();
        defaultedMap22.clear();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (short) 100);
        boolean b28 = defaultedMap22.containsKey((java.lang.Object) (-1.0f));
        boolean b30 = defaultedMap22.containsValue((java.lang.Object) 0.0d);
        int i31 = defaultedMap22.size();
        boolean b32 = defaultedMap12.containsValue((java.lang.Object) defaultedMap22);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap22);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0.0d + "'", obj33.equals(0.0d));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap5.isEmpty();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) true);
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = null;
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        defaultedMap13.clear();
        int i20 = defaultedMap13.size();
        java.lang.Object obj22 = defaultedMap13.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap24.isEmpty();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) predicate26);
        boolean b28 = defaultedMap13.equals((java.lang.Object) predicate26);
        java.util.Collection collection29 = defaultedMap13.values();
        java.lang.Object obj30 = defaultedMap5.get((java.lang.Object) collection29);
        java.lang.Object obj32 = defaultedMap5.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b35 = defaultedMap34.isEmpty();
        defaultedMap34.clear();
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap34.containsKey(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) true);
        collections.Predicate predicate43 = null;
        collections.Predicate predicate44 = null;
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate43, predicate44);
        defaultedMap40.clear();
        java.lang.Object obj47 = defaultedMap34.get((java.lang.Object) defaultedMap40);
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome49, 100, 0.0d);
        double d54 = elitisticListPopulation53.getElitismRate();
        java.lang.String str55 = elitisticListPopulation53.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome56 = elitisticListPopulation53.iterator();
        math.genetics.Chromosome[] chromosome_array57 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome58 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b59 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58, chromosome_array57);
        elitisticListPopulation53.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome58);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome61 = elitisticListPopulation53.spliterator();
        java.lang.Object obj62 = defaultedMap40.get((java.lang.Object) spliterator_chromosome61);
        java.lang.Object obj63 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) defaultedMap40);
        java.util.Collection collection64 = defaultedMap5.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0.0d + "'", obj15.equals(0.0d));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0.0d + "'", obj22.equals(0.0d));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0.0d + "'", obj30.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0.0d + "'", obj32.equals(0.0d));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0.0d + "'", obj42.equals(0.0d));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0.0d + "'", obj47.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(d54 == 0.0d);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "[]" + "'", str55.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome56);
        org.junit.Assert.assertNotNull(chromosome_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome61);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0.0d + "'", obj62.equals(0.0d));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(collection64);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        try {
            elitisticListPopulation5.setElitismRate((double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = arraylist_chromosome6.spliterator();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) spliterator_chromosome11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) predicate16);
        boolean b19 = defaultedMap14.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap22.isEmpty();
        defaultedMap22.clear();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (short) 100);
        boolean b28 = defaultedMap22.containsKey((java.lang.Object) (-1.0f));
        boolean b30 = defaultedMap22.containsValue((java.lang.Object) 0.0d);
        int i31 = defaultedMap22.size();
        defaultedMap14.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap14);
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35, 100, 0.0d);
        double d40 = elitisticListPopulation39.getElitismRate();
        java.lang.String str41 = elitisticListPopulation39.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome42 = elitisticListPopulation39.iterator();
        math.genetics.Chromosome[] chromosome_array43 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome44 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44, chromosome_array43);
        elitisticListPopulation39.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome44);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome47 = elitisticListPopulation39.spliterator();
        java.lang.Object obj48 = defaultedMap33.get((java.lang.Object) spliterator_chromosome47);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(d40 == 0.0d);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "[]" + "'", str41.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome42);
        org.junit.Assert.assertNotNull(chromosome_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome47);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(list_chromosome13, (int) '#', 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.lang.String str9 = elitisticListPopulation5.toString();
        double d10 = elitisticListPopulation5.getElitismRate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap12.isEmpty();
        defaultedMap12.clear();
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap12.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) true);
        collections.Predicate predicate21 = null;
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate21, predicate22);
        defaultedMap18.clear();
        java.lang.Object obj25 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.util.Collection collection26 = defaultedMap18.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection26);
        int i28 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0.0d + "'", obj25.equals(0.0d));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(i28 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 0.0d);
        boolean b10 = defaultedMap1.isEmpty();
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.lang.String str7 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setElitismRate((double) 1.0f);
        math.genetics.Population population10 = elitisticListPopulation5.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(list_chromosome11, (-1), (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(population10);
        org.junit.Assert.assertNotNull(list_chromosome11);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome11);
        int i13 = elitisticListPopulation5.getPopulationSize();
        java.lang.String str14 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation5.addChromosome(chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        java.lang.String str7 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        boolean b5 = defaultedMap1.containsKey(obj4);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation8.getChromosomes();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, 100, 0.0d);
        double d19 = elitisticListPopulation18.getElitismRate();
        java.lang.String str20 = elitisticListPopulation18.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation18.iterator();
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        elitisticListPopulation18.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23);
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation18.addChromosome(chromosome26);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome28 = elitisticListPopulation18.spliterator();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b31 = defaultedMap30.isEmpty();
        defaultedMap30.clear();
        boolean b34 = defaultedMap30.containsValue((java.lang.Object) (short) 100);
        boolean b36 = defaultedMap30.containsKey((java.lang.Object) (-1.0f));
        java.lang.Object obj38 = defaultedMap30.get((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b41 = defaultedMap40.isEmpty();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        boolean b43 = defaultedMap40.containsKey((java.lang.Object) predicate42);
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome50 = arraylist_chromosome45.spliterator();
        boolean b51 = defaultedMap40.containsValue((java.lang.Object) spliterator_chromosome50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b54 = defaultedMap53.isEmpty();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        boolean b56 = defaultedMap53.containsKey((java.lang.Object) predicate55);
        boolean b58 = defaultedMap53.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj59 = defaultedMap40.remove((java.lang.Object) defaultedMap53);
        defaultedMap30.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj61 = defaultedMap12.put((java.lang.Object) elitisticListPopulation18, (java.lang.Object) defaultedMap40);
        collections.Transformer transformer62 = null;
        try {
            java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome21);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0.0d + "'", obj38.equals(0.0d));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap11.isEmpty();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        boolean b14 = defaultedMap11.containsKey((java.lang.Object) predicate13);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = arraylist_chromosome16.spliterator();
        boolean b22 = defaultedMap11.containsValue((java.lang.Object) spliterator_chromosome21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap24.isEmpty();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) predicate26);
        boolean b29 = defaultedMap24.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj30 = defaultedMap11.remove((java.lang.Object) defaultedMap24);
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        boolean b32 = defaultedMap11.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b32 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        int i7 = elitisticListPopulation5.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) true);
        collections.Predicate predicate14 = null;
        collections.Predicate predicate15 = null;
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) true);
        collections.Predicate predicate21 = null;
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate21, predicate22);
        defaultedMap18.clear();
        int i25 = defaultedMap18.size();
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) map16, (java.lang.Object) defaultedMap18);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation32.getChromosomes();
        double d34 = elitisticListPopulation32.getElitismRate();
        java.lang.String str35 = elitisticListPopulation32.toString();
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation41.getChromosomes();
        elitisticListPopulation32.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome42);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 0.0f);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b49 = defaultedMap48.isEmpty();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        boolean b51 = defaultedMap48.containsKey((java.lang.Object) predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate52, predicate53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj58 = defaultedMap56.get((java.lang.Object) true);
        collections.Predicate predicate59 = null;
        collections.Predicate predicate60 = null;
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate59, predicate60);
        defaultedMap56.clear();
        int i63 = defaultedMap56.size();
        java.lang.Object obj65 = defaultedMap56.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b68 = defaultedMap67.isEmpty();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        boolean b70 = defaultedMap67.containsKey((java.lang.Object) predicate69);
        boolean b71 = defaultedMap56.equals((java.lang.Object) predicate69);
        java.util.Collection collection72 = defaultedMap56.values();
        java.lang.Object obj73 = defaultedMap48.get((java.lang.Object) collection72);
        elitisticListPopulation46.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection72);
        java.lang.Object obj75 = defaultedMap1.put((java.lang.Object) elitisticListPopulation32, (java.lang.Object) collection72);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0.0d + "'", obj13.equals(0.0d));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertTrue(d34 == 0.0d);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[]" + "'", str35.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0.0d + "'", obj58.equals(0.0d));
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 0.0d + "'", obj65.equals(0.0d));
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 0.0d + "'", obj73.equals(0.0d));
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation5.spliterator();
        int i14 = elitisticListPopulation5.getPopulationSize();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b17 = defaultedMap16.isEmpty();
        defaultedMap16.clear();
        boolean b20 = defaultedMap16.containsValue((java.lang.Object) (short) 100);
        boolean b22 = defaultedMap16.containsKey((java.lang.Object) (-1.0f));
        boolean b24 = defaultedMap16.containsValue((java.lang.Object) 0.0d);
        int i25 = defaultedMap16.size();
        java.lang.Object obj27 = defaultedMap16.get((java.lang.Object) (byte) 0);
        java.util.Collection collection28 = defaultedMap16.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection28);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0.0d + "'", obj27.equals(0.0d));
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        defaultedMap1.clear();
        int i8 = defaultedMap1.size();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap12.isEmpty();
        defaultedMap12.clear();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) (short) 100);
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) (-1.0f));
        boolean b20 = defaultedMap12.containsValue((java.lang.Object) 0.0d);
        int i21 = defaultedMap12.size();
        java.lang.Object obj23 = defaultedMap12.remove((java.lang.Object) (-1.0f));
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b27 = defaultedMap26.isEmpty();
        defaultedMap26.clear();
        java.lang.Object obj29 = null;
        boolean b30 = defaultedMap26.containsKey(obj29);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation33.getChromosomes();
        java.lang.Object obj35 = defaultedMap26.get((java.lang.Object) elitisticListPopulation33);
        java.util.Collection collection36 = defaultedMap26.values();
        java.lang.Object obj37 = defaultedMap1.get((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) true);
        collections.Predicate predicate42 = null;
        collections.Predicate predicate43 = null;
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate42, predicate43);
        boolean b46 = defaultedMap39.containsKey((java.lang.Object) (-1.0f));
        int i47 = defaultedMap39.size();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) true);
        collections.Predicate predicate52 = null;
        collections.Predicate predicate53 = null;
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate52, predicate53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj58 = defaultedMap56.get((java.lang.Object) true);
        collections.Predicate predicate59 = null;
        collections.Predicate predicate60 = null;
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate59, predicate60);
        defaultedMap56.clear();
        int i63 = defaultedMap56.size();
        java.lang.Object obj64 = defaultedMap39.put((java.lang.Object) map54, (java.lang.Object) defaultedMap56);
        defaultedMap26.putAll((java.util.Map) defaultedMap39);
        java.util.Set set66 = defaultedMap39.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(list_chromosome34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0.0d + "'", obj35.equals(0.0d));
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0.0d + "'", obj37.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0.0d + "'", obj41.equals(0.0d));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0.0d + "'", obj51.equals(0.0d));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0.0d + "'", obj58.equals(0.0d));
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(set66);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) arraylist_chromosome1);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 100, (double) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        boolean b10 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap12.isEmpty();
        defaultedMap12.clear();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) (short) 100);
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = defaultedMap12.get((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap22.isEmpty();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        boolean b25 = defaultedMap22.containsKey((java.lang.Object) predicate24);
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome32 = arraylist_chromosome27.spliterator();
        boolean b33 = defaultedMap22.containsValue((java.lang.Object) spliterator_chromosome32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b36 = defaultedMap35.isEmpty();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        boolean b38 = defaultedMap35.containsKey((java.lang.Object) predicate37);
        boolean b40 = defaultedMap35.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj41 = defaultedMap22.remove((java.lang.Object) defaultedMap35);
        defaultedMap12.putAll((java.util.Map) defaultedMap22);
        boolean b43 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        collections.Transformer transformer44 = null;
        try {
            java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) true);
        collections.Predicate predicate8 = null;
        collections.Predicate predicate9 = null;
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) map10);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        defaultedMap1.clear();
        int i8 = defaultedMap1.size();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, 100, 0.0d);
        elitisticListPopulation14.setPopulationLimit((int) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.util.Collection collection18 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = arraylist_chromosome6.spliterator();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) spliterator_chromosome11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) predicate16);
        boolean b19 = defaultedMap14.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap22.isEmpty();
        defaultedMap22.clear();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (short) 100);
        boolean b28 = defaultedMap22.containsKey((java.lang.Object) (-1.0f));
        java.lang.Object obj30 = defaultedMap22.get((java.lang.Object) (-1.0d));
        boolean b31 = defaultedMap1.containsValue(obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Set set34 = defaultedMap33.keySet();
        boolean b35 = defaultedMap1.containsKey((java.lang.Object) set34);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0.0d + "'", obj30.equals(0.0d));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set3 = defaultedMap2.entrySet();
        java.lang.Object obj5 = defaultedMap2.remove((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.lang.String str7 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setElitismRate((double) 1.0f);
        math.genetics.Population population10 = elitisticListPopulation5.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(population10);
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome11);
        int i13 = elitisticListPopulation5.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = arraylist_chromosome6.spliterator();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) spliterator_chromosome11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) predicate16);
        boolean b19 = defaultedMap14.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap22.isEmpty();
        defaultedMap22.clear();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (short) 100);
        boolean b28 = defaultedMap22.containsKey((java.lang.Object) (-1.0f));
        boolean b30 = defaultedMap22.containsValue((java.lang.Object) 0.0d);
        int i31 = defaultedMap22.size();
        defaultedMap14.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b35 = defaultedMap34.isEmpty();
        defaultedMap34.clear();
        boolean b38 = defaultedMap34.containsValue((java.lang.Object) (short) 100);
        boolean b40 = defaultedMap34.containsKey((java.lang.Object) (-1.0f));
        boolean b42 = defaultedMap34.containsValue((java.lang.Object) 0.0d);
        boolean b43 = defaultedMap22.containsKey((java.lang.Object) defaultedMap34);
        collections.Factory factory44 = null;
        try {
            java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, factory44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation5.getChromosomes();
        try {
            elitisticListPopulation5.setElitismRate((-1.0d));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap5.isEmpty();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) predicate7);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap11.isEmpty();
        defaultedMap11.clear();
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) (short) 100);
        boolean b17 = defaultedMap11.containsKey((java.lang.Object) (-1.0f));
        boolean b19 = defaultedMap11.containsValue((java.lang.Object) 0.0d);
        int i20 = defaultedMap11.size();
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        java.lang.String str22 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) true);
        collections.Predicate predicate8 = null;
        collections.Predicate predicate9 = null;
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        defaultedMap5.clear();
        int i12 = defaultedMap5.size();
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b17 = defaultedMap16.isEmpty();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        boolean b19 = defaultedMap16.containsKey((java.lang.Object) predicate18);
        boolean b20 = defaultedMap5.equals((java.lang.Object) predicate18);
        java.util.Collection collection21 = defaultedMap5.values();
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap24.isEmpty();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) predicate26);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome34 = arraylist_chromosome29.spliterator();
        boolean b35 = defaultedMap24.containsValue((java.lang.Object) spliterator_chromosome34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b38 = defaultedMap37.isEmpty();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        boolean b40 = defaultedMap37.containsKey((java.lang.Object) predicate39);
        boolean b42 = defaultedMap37.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj43 = defaultedMap24.remove((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap45.isEmpty();
        defaultedMap45.clear();
        boolean b49 = defaultedMap45.containsValue((java.lang.Object) (short) 100);
        boolean b51 = defaultedMap45.containsKey((java.lang.Object) (-1.0f));
        java.lang.Object obj53 = defaultedMap45.get((java.lang.Object) (-1.0d));
        boolean b54 = defaultedMap24.containsValue(obj53);
        java.lang.String str55 = defaultedMap24.toString();
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) str55);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0.0d + "'", obj53.equals(0.0d));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0.0d + "'", obj56.equals(0.0d));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Population population9 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(population9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        boolean b5 = defaultedMap1.containsKey(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) true);
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = null;
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        defaultedMap7.clear();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, 100, 0.0d);
        double d21 = elitisticListPopulation20.getElitismRate();
        java.lang.String str22 = elitisticListPopulation20.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome23 = elitisticListPopulation20.iterator();
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation20.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome28 = elitisticListPopulation20.spliterator();
        java.lang.Object obj29 = defaultedMap7.get((java.lang.Object) spliterator_chromosome28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) true);
        collections.Predicate predicate34 = null;
        collections.Predicate predicate35 = null;
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate34, predicate35);
        boolean b38 = defaultedMap31.containsKey((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap40);
        defaultedMap31.putAll((java.util.Map) defaultedMap41);
        boolean b43 = defaultedMap7.containsValue((java.lang.Object) defaultedMap31);
        boolean b44 = defaultedMap31.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(d21 == 0.0d);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome23);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0.0d + "'", obj29.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0.0d + "'", obj33.equals(0.0d));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap11.isEmpty();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        boolean b14 = defaultedMap11.containsKey((java.lang.Object) predicate13);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = arraylist_chromosome16.spliterator();
        boolean b22 = defaultedMap11.containsValue((java.lang.Object) spliterator_chromosome21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap24.isEmpty();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) predicate26);
        boolean b29 = defaultedMap24.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj30 = defaultedMap11.remove((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b33 = defaultedMap32.isEmpty();
        defaultedMap32.clear();
        boolean b36 = defaultedMap32.containsValue((java.lang.Object) (short) 100);
        boolean b38 = defaultedMap32.containsKey((java.lang.Object) (-1.0f));
        boolean b40 = defaultedMap32.containsValue((java.lang.Object) 0.0d);
        int i41 = defaultedMap32.size();
        defaultedMap24.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b45 = defaultedMap44.isEmpty();
        defaultedMap44.clear();
        boolean b48 = defaultedMap44.containsValue((java.lang.Object) (short) 100);
        boolean b50 = defaultedMap44.containsKey((java.lang.Object) (-1.0f));
        boolean b52 = defaultedMap44.containsValue((java.lang.Object) 0.0d);
        boolean b53 = defaultedMap32.containsKey((java.lang.Object) defaultedMap44);
        java.lang.Object obj54 = defaultedMap1.get((java.lang.Object) b53);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0.0d + "'", obj54.equals(0.0d));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        java.util.Set set10 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.lang.String str7 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setElitismRate((double) 1.0f);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 100);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, 100, 0.0d);
        double d18 = elitisticListPopulation17.getElitismRate();
        java.lang.String str19 = elitisticListPopulation17.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation17.iterator();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22);
        math.genetics.Chromosome chromosome25 = null;
        elitisticListPopulation17.addChromosome(chromosome25);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation32.getChromosomes();
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome33);
        elitisticListPopulation5.setChromosomes(list_chromosome33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) list_chromosome33);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]" + "'", str19.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(list_chromosome33);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        defaultedMap1.clear();
        int i8 = defaultedMap1.size();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap12.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap22.isEmpty();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        boolean b25 = defaultedMap22.containsKey((java.lang.Object) predicate24);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) b25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b30 = defaultedMap29.isEmpty();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        boolean b32 = defaultedMap29.containsKey((java.lang.Object) predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate33, predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) true);
        collections.Predicate predicate40 = null;
        collections.Predicate predicate41 = null;
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate40, predicate41);
        boolean b44 = defaultedMap37.containsKey((java.lang.Object) (-1.0f));
        java.lang.Object obj45 = null;
        boolean b46 = defaultedMap37.containsValue(obj45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj50 = defaultedMap48.get((java.lang.Object) true);
        collections.Predicate predicate51 = null;
        collections.Predicate predicate52 = null;
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate51, predicate52);
        boolean b55 = defaultedMap48.containsKey((java.lang.Object) (-1.0f));
        boolean b57 = defaultedMap48.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b60 = defaultedMap59.isEmpty();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        boolean b62 = defaultedMap59.containsKey((java.lang.Object) predicate61);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate63, predicate64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj69 = defaultedMap67.get((java.lang.Object) true);
        collections.Predicate predicate70 = null;
        collections.Predicate predicate71 = null;
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate70, predicate71);
        defaultedMap67.clear();
        int i74 = defaultedMap67.size();
        java.lang.Object obj76 = defaultedMap67.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b79 = defaultedMap78.isEmpty();
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        boolean b81 = defaultedMap78.containsKey((java.lang.Object) predicate80);
        boolean b82 = defaultedMap67.equals((java.lang.Object) predicate80);
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate64, predicate80);
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate64, predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate34, predicate84);
        java.lang.Object obj87 = defaultedMap1.get((java.lang.Object) predicate84);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0.0d + "'", obj39.equals(0.0d));
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0.0d + "'", obj50.equals(0.0d));
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 0.0d + "'", obj69.equals(0.0d));
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 0.0d + "'", obj76.equals(0.0d));
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + 0.0d + "'", obj87.equals(0.0d));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.lang.String str7 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setElitismRate((double) 1.0f);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 100);
        java.lang.String str12 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setPopulationLimit(10);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b11 = defaultedMap10.isEmpty();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        boolean b13 = defaultedMap10.containsKey((java.lang.Object) predicate12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = arraylist_chromosome15.spliterator();
        boolean b21 = defaultedMap10.containsValue((java.lang.Object) spliterator_chromosome20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b24 = defaultedMap23.isEmpty();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        boolean b26 = defaultedMap23.containsKey((java.lang.Object) predicate25);
        boolean b28 = defaultedMap23.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj29 = defaultedMap10.remove((java.lang.Object) defaultedMap23);
        boolean b30 = defaultedMap10.isEmpty();
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32, 100, 0.0d);
        double d37 = elitisticListPopulation36.getElitismRate();
        java.lang.String str38 = elitisticListPopulation36.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome39 = elitisticListPopulation36.iterator();
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) iterator_chromosome39);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i42 = defaultedMap41.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(d37 == 0.0d);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(i42 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome11);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation(list_chromosome11, (int) '4', (double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome11);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setPopulationLimit((int) ' ');
        double d10 = elitisticListPopulation5.getElitismRate();
        double d11 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue(d11 == 0.0d);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set3 = defaultedMap2.keySet();
        boolean b4 = defaultedMap2.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap6.containsKey(obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) true);
        collections.Predicate predicate15 = null;
        collections.Predicate predicate16 = null;
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate15, predicate16);
        defaultedMap12.clear();
        java.lang.Object obj19 = defaultedMap6.get((java.lang.Object) defaultedMap12);
        java.lang.Object obj20 = defaultedMap2.get((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0d + "'", obj19.equals(0.0d));
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation5.addChromosome(chromosome13);
        elitisticListPopulation5.setElitismRate((double) 1L);
        math.genetics.Population population17 = elitisticListPopulation5.nextGeneration();
        int i18 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(population17);
        org.junit.Assert.assertTrue(i18 == 100);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = arraylist_chromosome6.spliterator();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) spliterator_chromosome11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) predicate16);
        boolean b19 = defaultedMap14.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap22.isEmpty();
        defaultedMap22.clear();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (short) 100);
        boolean b28 = defaultedMap22.containsKey((java.lang.Object) (-1.0f));
        boolean b30 = defaultedMap22.containsValue((java.lang.Object) 0.0d);
        int i31 = defaultedMap22.size();
        defaultedMap14.putAll((java.util.Map) defaultedMap22);
        collections.Transformer transformer33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, transformer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        java.util.Collection collection13 = defaultedMap11.values();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap11.get(obj14);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap5.isEmpty();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) predicate7);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap12.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) true);
        collections.Predicate predicate23 = null;
        collections.Predicate predicate24 = null;
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate23, predicate24);
        defaultedMap20.clear();
        int i27 = defaultedMap20.size();
        java.lang.Object obj29 = defaultedMap20.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b32 = defaultedMap31.isEmpty();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        boolean b34 = defaultedMap31.containsKey((java.lang.Object) predicate33);
        boolean b35 = defaultedMap20.equals((java.lang.Object) predicate33);
        java.util.Collection collection36 = defaultedMap20.values();
        java.lang.Object obj37 = defaultedMap12.get((java.lang.Object) collection36);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, 100, 0.0d);
        double d44 = elitisticListPopulation43.getElitismRate();
        java.lang.String str45 = elitisticListPopulation43.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome46 = elitisticListPopulation43.getChromosomes();
        java.lang.Object obj47 = defaultedMap12.get((java.lang.Object) elitisticListPopulation43);
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome49, 100, 0.0d);
        double d54 = elitisticListPopulation53.getElitismRate();
        java.lang.String str55 = elitisticListPopulation53.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome56 = elitisticListPopulation53.iterator();
        math.genetics.Chromosome[] chromosome_array57 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome58 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b59 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58, chromosome_array57);
        elitisticListPopulation53.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome58);
        math.genetics.Chromosome[] chromosome_array61 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome62 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b63 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome62, chromosome_array61);
        math.genetics.ElitisticListPopulation elitisticListPopulation66 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome62, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome67 = elitisticListPopulation66.getChromosomes();
        elitisticListPopulation53.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome67);
        elitisticListPopulation43.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome67);
        java.lang.Object obj70 = defaultedMap1.remove((java.lang.Object) list_chromosome67);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0.0d + "'", obj22.equals(0.0d));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0.0d + "'", obj29.equals(0.0d));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0.0d + "'", obj37.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(d44 == 0.0d);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "[]" + "'", str45.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0.0d + "'", obj47.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(d54 == 0.0d);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "[]" + "'", str55.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome56);
        org.junit.Assert.assertNotNull(chromosome_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(chromosome_array61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(list_chromosome67);
        org.junit.Assert.assertNull(obj70);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b11 = defaultedMap10.isEmpty();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        boolean b13 = defaultedMap10.containsKey((java.lang.Object) predicate12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = arraylist_chromosome15.spliterator();
        boolean b21 = defaultedMap10.containsValue((java.lang.Object) spliterator_chromosome20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b24 = defaultedMap23.isEmpty();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        boolean b26 = defaultedMap23.containsKey((java.lang.Object) predicate25);
        boolean b28 = defaultedMap23.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj29 = defaultedMap10.remove((java.lang.Object) defaultedMap23);
        boolean b30 = defaultedMap10.isEmpty();
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32, 100, 0.0d);
        double d37 = elitisticListPopulation36.getElitismRate();
        java.lang.String str38 = elitisticListPopulation36.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome39 = elitisticListPopulation36.iterator();
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) iterator_chromosome39);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set42 = defaultedMap41.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(d37 == 0.0d);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set42);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) true);
        collections.Predicate predicate14 = null;
        collections.Predicate predicate15 = null;
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) true);
        collections.Predicate predicate21 = null;
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate21, predicate22);
        defaultedMap18.clear();
        int i25 = defaultedMap18.size();
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) map16, (java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b29 = defaultedMap28.isEmpty();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        boolean b31 = defaultedMap28.containsKey((java.lang.Object) predicate30);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome38 = arraylist_chromosome33.spliterator();
        boolean b39 = defaultedMap28.containsValue((java.lang.Object) spliterator_chromosome38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b42 = defaultedMap41.isEmpty();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        boolean b44 = defaultedMap41.containsKey((java.lang.Object) predicate43);
        boolean b46 = defaultedMap41.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj47 = defaultedMap28.remove((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b50 = defaultedMap49.isEmpty();
        defaultedMap49.clear();
        boolean b53 = defaultedMap49.containsValue((java.lang.Object) (short) 100);
        boolean b55 = defaultedMap49.containsKey((java.lang.Object) (-1.0f));
        java.lang.Object obj57 = defaultedMap49.get((java.lang.Object) (-1.0d));
        boolean b58 = defaultedMap28.containsValue(obj57);
        java.lang.String str59 = defaultedMap28.toString();
        java.lang.Object obj60 = defaultedMap1.get((java.lang.Object) defaultedMap28);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome64 = elitisticListPopulation63.getChromosomes();
        java.lang.Object obj65 = defaultedMap28.get((java.lang.Object) elitisticListPopulation63);
        math.genetics.Chromosome[] chromosome_array66 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome67 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b68 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome67, chromosome_array66);
        math.genetics.ElitisticListPopulation elitisticListPopulation71 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome67, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome72 = elitisticListPopulation71.getChromosomes();
        java.lang.String str73 = elitisticListPopulation71.toString();
        java.lang.Object obj74 = defaultedMap28.remove((java.lang.Object) str73);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0.0d + "'", obj13.equals(0.0d));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0.0d + "'", obj57.equals(0.0d));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(list_chromosome64);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 0.0d + "'", obj65.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(list_chromosome72);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "[]" + "'", str73.equals("[]"));
        org.junit.Assert.assertNull(obj74);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation5.setPopulationLimit((int) (short) 1);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 100);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation5.iterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b14 = defaultedMap13.isEmpty();
        defaultedMap13.clear();
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap13.containsKey(obj16);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation20.getChromosomes();
        java.lang.Object obj22 = defaultedMap13.get((java.lang.Object) elitisticListPopulation20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap24.isEmpty();
        defaultedMap24.clear();
        boolean b28 = defaultedMap24.containsValue((java.lang.Object) (short) 100);
        boolean b30 = defaultedMap24.containsKey((java.lang.Object) (-1.0f));
        boolean b32 = defaultedMap24.containsValue((java.lang.Object) 0.0d);
        int i33 = defaultedMap24.size();
        java.lang.Object obj35 = defaultedMap24.remove((java.lang.Object) (-1.0f));
        java.util.Collection collection36 = defaultedMap24.values();
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection36);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection36);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0.0d + "'", obj22.equals(0.0d));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap5.isEmpty();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) true);
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = null;
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        defaultedMap13.clear();
        int i20 = defaultedMap13.size();
        java.lang.Object obj22 = defaultedMap13.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap24.isEmpty();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) predicate26);
        boolean b28 = defaultedMap13.equals((java.lang.Object) predicate26);
        java.util.Collection collection29 = defaultedMap13.values();
        java.lang.Object obj30 = defaultedMap5.get((java.lang.Object) collection29);
        java.lang.Object obj32 = defaultedMap5.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b35 = defaultedMap34.isEmpty();
        defaultedMap34.clear();
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap34.containsKey(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) true);
        collections.Predicate predicate43 = null;
        collections.Predicate predicate44 = null;
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate43, predicate44);
        defaultedMap40.clear();
        java.lang.Object obj47 = defaultedMap34.get((java.lang.Object) defaultedMap40);
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome49, 100, 0.0d);
        double d54 = elitisticListPopulation53.getElitismRate();
        java.lang.String str55 = elitisticListPopulation53.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome56 = elitisticListPopulation53.iterator();
        math.genetics.Chromosome[] chromosome_array57 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome58 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b59 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58, chromosome_array57);
        elitisticListPopulation53.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome58);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome61 = elitisticListPopulation53.spliterator();
        java.lang.Object obj62 = defaultedMap40.get((java.lang.Object) spliterator_chromosome61);
        java.lang.Object obj63 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) defaultedMap40);
        defaultedMap40.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0.0d + "'", obj15.equals(0.0d));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0.0d + "'", obj22.equals(0.0d));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0.0d + "'", obj30.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0.0d + "'", obj32.equals(0.0d));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0.0d + "'", obj42.equals(0.0d));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0.0d + "'", obj47.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(d54 == 0.0d);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "[]" + "'", str55.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome56);
        org.junit.Assert.assertNotNull(chromosome_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome61);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0.0d + "'", obj62.equals(0.0d));
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation(list_chromosome3, (int) 'a', (double) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome3);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (-1.0d));
        int i10 = defaultedMap1.size();
        java.util.Set set11 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.lang.String str7 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setElitismRate((double) 1.0f);
        math.genetics.Population population10 = elitisticListPopulation5.nextGeneration();
        math.genetics.Population population11 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(population10);
        org.junit.Assert.assertNotNull(population11);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) true);
        collections.Predicate predicate12 = null;
        collections.Predicate predicate13 = null;
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        defaultedMap9.clear();
        int i16 = defaultedMap9.size();
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap20.isEmpty();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        boolean b23 = defaultedMap20.containsKey((java.lang.Object) predicate22);
        boolean b24 = defaultedMap9.equals((java.lang.Object) predicate22);
        java.util.Collection collection25 = defaultedMap9.values();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) collection25);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, 100, 0.0d);
        double d33 = elitisticListPopulation32.getElitismRate();
        java.lang.String str34 = elitisticListPopulation32.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation32.getChromosomes();
        java.lang.Object obj36 = defaultedMap1.get((java.lang.Object) elitisticListPopulation32);
        math.genetics.Population population37 = elitisticListPopulation32.nextGeneration();
        int i38 = elitisticListPopulation32.getPopulationLimit();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0.0d + "'", obj18.equals(0.0d));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(d33 == 0.0d);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]" + "'", str34.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0.0d + "'", obj36.equals(0.0d));
        org.junit.Assert.assertNotNull(population37);
        org.junit.Assert.assertTrue(i38 == 100);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap5.isEmpty();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) predicate7);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap11.isEmpty();
        defaultedMap11.clear();
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) (short) 100);
        boolean b17 = defaultedMap11.containsKey((java.lang.Object) (-1.0f));
        boolean b19 = defaultedMap11.containsValue((java.lang.Object) 0.0d);
        int i20 = defaultedMap11.size();
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        java.lang.Object obj23 = defaultedMap11.remove((java.lang.Object) "hi!");
        collections.Predicate predicate24 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) true);
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = null;
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate29, predicate30);
        boolean b33 = defaultedMap26.containsKey((java.lang.Object) (-1.0f));
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap26.containsValue(obj34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) true);
        collections.Predicate predicate40 = null;
        collections.Predicate predicate41 = null;
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate40, predicate41);
        boolean b44 = defaultedMap37.containsKey((java.lang.Object) (-1.0f));
        boolean b46 = defaultedMap37.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b49 = defaultedMap48.isEmpty();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        boolean b51 = defaultedMap48.containsKey((java.lang.Object) predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate52, predicate53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj58 = defaultedMap56.get((java.lang.Object) true);
        collections.Predicate predicate59 = null;
        collections.Predicate predicate60 = null;
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate59, predicate60);
        defaultedMap56.clear();
        int i63 = defaultedMap56.size();
        java.lang.Object obj65 = defaultedMap56.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b68 = defaultedMap67.isEmpty();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        boolean b70 = defaultedMap67.containsKey((java.lang.Object) predicate69);
        boolean b71 = defaultedMap56.equals((java.lang.Object) predicate69);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate53, predicate69);
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate53, predicate73);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate24, predicate73);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0.0d + "'", obj28.equals(0.0d));
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0.0d + "'", obj39.equals(0.0d));
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0.0d + "'", obj58.equals(0.0d));
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 0.0d + "'", obj65.equals(0.0d));
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation5.setPopulationLimit((int) (short) 1);
        int i9 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        math.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertNotNull(population4);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        java.lang.String str4 = elitisticListPopulation2.toString();
        try {
            elitisticListPopulation2.setElitismRate((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 0.0d);
        int i10 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap12.isEmpty();
        defaultedMap12.clear();
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap12.containsKey(obj15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation19.getChromosomes();
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) elitisticListPopulation19);
        java.util.Collection collection22 = defaultedMap12.values();
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24, 100, 0.0d);
        double d29 = elitisticListPopulation28.getElitismRate();
        java.lang.String str30 = elitisticListPopulation28.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation28.setChromosomes(list_chromosome34);
        int i36 = elitisticListPopulation28.getPopulationSize();
        java.lang.String str37 = elitisticListPopulation28.toString();
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome44 = elitisticListPopulation43.getChromosomes();
        java.lang.String str45 = elitisticListPopulation43.toString();
        java.lang.String str46 = elitisticListPopulation43.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome47 = elitisticListPopulation43.getChromosomes();
        elitisticListPopulation28.setChromosomes(list_chromosome47);
        boolean b49 = defaultedMap12.equals((java.lang.Object) elitisticListPopulation28);
        java.util.List<math.genetics.Chromosome> list_chromosome50 = elitisticListPopulation28.getChromosomes();
        boolean b51 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation28);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0.0d + "'", obj21.equals(0.0d));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(d29 == 0.0d);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]" + "'", str30.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome34);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(list_chromosome44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "[]" + "'", str45.equals("[]"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]" + "'", str46.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(list_chromosome50);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        defaultedMap1.clear();
        int i8 = defaultedMap1.size();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, 100, 0.0d);
        elitisticListPopulation14.setPopulationLimit((int) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.Transformer transformer18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome11);
        int i13 = elitisticListPopulation5.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(list_chromosome14, (int) 'a', (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(list_chromosome14);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = arraylist_chromosome9.spliterator();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9);
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertNotNull(list_chromosome16);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) -1, (double) 0L);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.lang.String str9 = elitisticListPopulation5.toString();
        double d10 = elitisticListPopulation5.getElitismRate();
        java.lang.String str11 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) true);
        collections.Predicate predicate14 = null;
        collections.Predicate predicate15 = null;
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) true);
        collections.Predicate predicate21 = null;
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate21, predicate22);
        defaultedMap18.clear();
        int i25 = defaultedMap18.size();
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) map16, (java.lang.Object) defaultedMap18);
        int i27 = defaultedMap18.size();
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, 100, 0.0d);
        elitisticListPopulation33.setElitismRate((double) 1L);
        java.lang.Object obj36 = defaultedMap18.remove((java.lang.Object) elitisticListPopulation33);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0.0d + "'", obj13.equals(0.0d));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.containsValue(obj6);
        java.lang.String str8 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = arraylist_chromosome6.spliterator();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) spliterator_chromosome11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) predicate16);
        boolean b19 = defaultedMap14.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap22.isEmpty();
        defaultedMap22.clear();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (short) 100);
        boolean b28 = defaultedMap22.containsKey((java.lang.Object) (-1.0f));
        boolean b30 = defaultedMap22.containsValue((java.lang.Object) 0.0d);
        int i31 = defaultedMap22.size();
        defaultedMap14.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b35 = defaultedMap34.isEmpty();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        boolean b37 = defaultedMap34.containsKey((java.lang.Object) predicate36);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome44 = arraylist_chromosome39.spliterator();
        boolean b45 = defaultedMap34.containsValue((java.lang.Object) spliterator_chromosome44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b48 = defaultedMap47.isEmpty();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        boolean b50 = defaultedMap47.containsKey((java.lang.Object) predicate49);
        boolean b52 = defaultedMap47.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj53 = defaultedMap34.remove((java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b56 = defaultedMap55.isEmpty();
        defaultedMap55.clear();
        boolean b59 = defaultedMap55.containsValue((java.lang.Object) (short) 100);
        boolean b61 = defaultedMap55.containsKey((java.lang.Object) (-1.0f));
        boolean b63 = defaultedMap55.containsValue((java.lang.Object) 0.0d);
        int i64 = defaultedMap55.size();
        defaultedMap47.putAll((java.util.Map) defaultedMap55);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b68 = defaultedMap67.isEmpty();
        defaultedMap67.clear();
        boolean b71 = defaultedMap67.containsValue((java.lang.Object) (short) 100);
        boolean b73 = defaultedMap67.containsKey((java.lang.Object) (-1.0f));
        boolean b75 = defaultedMap67.containsValue((java.lang.Object) 0.0d);
        boolean b76 = defaultedMap55.containsKey((java.lang.Object) defaultedMap67);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj80 = defaultedMap78.get((java.lang.Object) true);
        collections.Predicate predicate81 = null;
        collections.Predicate predicate82 = null;
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate81, predicate82);
        defaultedMap78.clear();
        boolean b86 = defaultedMap78.equals((java.lang.Object) 10.0d);
        java.lang.String str87 = defaultedMap78.toString();
        java.lang.Object obj88 = defaultedMap55.get((java.lang.Object) defaultedMap78);
        boolean b89 = defaultedMap22.containsValue((java.lang.Object) defaultedMap55);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 0.0d + "'", obj80.equals(0.0d));
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "{}" + "'", str87.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + 0.0d + "'", obj88.equals(0.0d));
        org.junit.Assert.assertTrue(b89 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap1.containsValue(obj9);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        defaultedMap1.clear();
        int i8 = defaultedMap1.size();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap12.isEmpty();
        defaultedMap12.clear();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) (short) 100);
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) (-1.0f));
        boolean b20 = defaultedMap12.containsValue((java.lang.Object) 0.0d);
        int i21 = defaultedMap12.size();
        java.lang.Object obj23 = defaultedMap12.remove((java.lang.Object) (-1.0f));
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b27 = defaultedMap26.isEmpty();
        defaultedMap26.clear();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj31 = null;
        boolean b32 = defaultedMap26.containsValue(obj31);
        java.lang.Object obj33 = defaultedMap12.remove((java.lang.Object) defaultedMap26);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) true);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) true);
        collections.Predicate predicate14 = null;
        collections.Predicate predicate15 = null;
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) true);
        collections.Predicate predicate21 = null;
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate21, predicate22);
        defaultedMap18.clear();
        int i25 = defaultedMap18.size();
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) map16, (java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b29 = defaultedMap28.isEmpty();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        boolean b31 = defaultedMap28.containsKey((java.lang.Object) predicate30);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome38 = arraylist_chromosome33.spliterator();
        boolean b39 = defaultedMap28.containsValue((java.lang.Object) spliterator_chromosome38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b42 = defaultedMap41.isEmpty();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        boolean b44 = defaultedMap41.containsKey((java.lang.Object) predicate43);
        boolean b46 = defaultedMap41.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj47 = defaultedMap28.remove((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b50 = defaultedMap49.isEmpty();
        defaultedMap49.clear();
        boolean b53 = defaultedMap49.containsValue((java.lang.Object) (short) 100);
        boolean b55 = defaultedMap49.containsKey((java.lang.Object) (-1.0f));
        java.lang.Object obj57 = defaultedMap49.get((java.lang.Object) (-1.0d));
        boolean b58 = defaultedMap28.containsValue(obj57);
        java.lang.String str59 = defaultedMap28.toString();
        java.lang.Object obj60 = defaultedMap1.get((java.lang.Object) defaultedMap28);
        collections.Transformer transformer61 = null;
        try {
            java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, transformer61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0.0d + "'", obj13.equals(0.0d));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0.0d + "'", obj57.equals(0.0d));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(obj60);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        double d7 = elitisticListPopulation5.getElitismRate();
        java.lang.String str8 = elitisticListPopulation5.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 100);
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.containsValue(obj6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, 100, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation13.getChromosomes();
        java.lang.String str15 = elitisticListPopulation13.toString();
        elitisticListPopulation13.setElitismRate((double) 1.0f);
        elitisticListPopulation13.setPopulationLimit((int) (byte) 100);
        java.lang.String str20 = elitisticListPopulation13.toString();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, 100, 0.0d);
        double d27 = elitisticListPopulation26.getElitismRate();
        java.lang.String str28 = elitisticListPopulation26.toString();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, 100, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome35 = arraylist_chromosome30.spliterator();
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38, 100, 0.0d);
        double d43 = elitisticListPopulation42.getElitismRate();
        java.lang.String str44 = elitisticListPopulation42.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome45 = elitisticListPopulation42.iterator();
        math.genetics.Chromosome[] chromosome_array46 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome47 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b48 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome47, chromosome_array46);
        elitisticListPopulation42.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome47);
        java.util.List<math.genetics.Chromosome> list_chromosome50 = elitisticListPopulation42.getChromosomes();
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome50);
        elitisticListPopulation13.setChromosomes(list_chromosome50);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation13);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]" + "'", str15.equals("[]"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(d27 == 0.0d);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]" + "'", str28.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome35);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(d43 == 0.0d);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[]" + "'", str44.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome45);
        org.junit.Assert.assertNotNull(chromosome_array46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(list_chromosome50);
        org.junit.Assert.assertNotNull(map53);
    }
}

