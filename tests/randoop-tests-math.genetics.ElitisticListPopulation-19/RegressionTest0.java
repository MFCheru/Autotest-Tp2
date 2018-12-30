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
        java.util.Map map0 = null;
        collections.Predicate predicate1 = null;
        collections.Predicate predicate2 = null;
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 0, (double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 0, (double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 10, (double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) -1, 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) -1, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 10);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1) + "'", obj4.equals((-1)));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        defaultedMap6.clear();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) 10.0d);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) "");
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        boolean b12 = defaultedMap9.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap3.equals(obj14);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        int i8 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        int i12 = elitisticListPopulation2.getPopulationLimit();
        try {
            elitisticListPopulation2.setElitismRate((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 97);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap5.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set18 = defaultedMap17.keySet();
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) (byte) 10);
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) (byte) 10);
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1) + "'", obj20.equals((-1)));
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.List<math.genetics.Chromosome> list_chromosome0 = null;
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(list_chromosome0, (int) (byte) 1, 10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        int i5 = elitisticListPopulation2.getPopulationSize();
        try {
            math.genetics.Chromosome chromosome6 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap5.remove((java.lang.Object) 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        elitisticListPopulation2.setPopulationLimit(97);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 100);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 10);
        int i9 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.util.Set set7 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1) + "'", obj4.equals((-1)));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1) + "'", obj6.equals((-1)));
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        try {
            elitisticListPopulation2.setElitismRate((double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation2.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b13 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj16 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        defaultedMap17.clear();
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) defaultedMap17);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) "");
        java.lang.Object obj22 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj26 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        defaultedMap27.clear();
        boolean b30 = defaultedMap27.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj32 = defaultedMap27.get((java.lang.Object) 10.0d);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        defaultedMap23.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap27.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj38 = defaultedMap17.get((java.lang.Object) defaultedMap36);
        java.lang.Object obj39 = defaultedMap5.remove(obj38);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1) + "'", obj19.equals((-1)));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) 10.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj10 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        defaultedMap11.clear();
        boolean b13 = defaultedMap1.equals((java.lang.Object) defaultedMap11);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        int i12 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation2.getChromosomes();
        java.lang.String str14 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation2.iterator();
        try {
            elitisticListPopulation2.setElitismRate((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        int i12 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation2.getChromosomes();
        int i14 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation2.iterator();
        try {
            math.genetics.Chromosome chromosome16 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 0, (double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        try {
            math.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) "");
        java.util.Set set8 = defaultedMap3.entrySet();
        java.util.Set set9 = defaultedMap3.entrySet();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) 10.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj10 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        defaultedMap15.clear();
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) 10.0d);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        defaultedMap11.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap15.putAll((java.util.Map) defaultedMap24);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) map26);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation(list_chromosome6, (-1), (double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        try {
            math.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.lang.String str5 = elitisticListPopulation2.toString();
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation2.getPopulationLimit();
        int i11 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]" + "'", str5.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 97);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.String str5 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1) + "'", obj4.equals((-1)));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        double d6 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
        org.junit.Assert.assertTrue(d6 == 1.0d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj9 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        boolean b13 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap10.equals((java.lang.Object) (short) 0);
        java.util.Collection collection16 = defaultedMap10.values();
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection16);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome18 = elitisticListPopulation8.spliterator();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation8.getChromosomes();
        int i21 = elitisticListPopulation8.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(spliterator_chromosome18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1) + "'", obj19.equals((-1)));
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue(i21 == 97);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj13 = defaultedMap8.get((java.lang.Object) 10.0d);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap4.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        defaultedMap19.clear();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) 10.0d);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj26 = defaultedMap8.remove((java.lang.Object) defaultedMap19);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        boolean b28 = defaultedMap19.isEmpty();
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.lang.String str5 = elitisticListPopulation2.toString();
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]" + "'", str5.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) 10.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj10 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        defaultedMap15.clear();
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) 10.0d);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        defaultedMap11.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap15.putAll((java.util.Map) defaultedMap24);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set29 = defaultedMap28.keySet();
        java.lang.Object obj31 = defaultedMap28.get((java.lang.Object) (byte) 10);
        boolean b33 = defaultedMap28.containsValue((java.lang.Object) 10.0d);
        java.lang.Object obj35 = defaultedMap28.remove((java.lang.Object) "hi!");
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (-1.0f));
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj42 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        defaultedMap43.clear();
        boolean b46 = defaultedMap43.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj48 = defaultedMap43.get((java.lang.Object) 10.0d);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population53 = elitisticListPopulation52.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation52.iterator();
        double d55 = elitisticListPopulation52.getElitismRate();
        java.lang.String str56 = elitisticListPopulation52.toString();
        boolean b57 = defaultedMap43.containsValue((java.lang.Object) str56);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) predicate59);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate58, predicate59);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate38, predicate59);
        defaultedMap24.putAll(map62);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (-1) + "'", obj31.equals((-1)));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(population53);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertTrue(d55 == 1.0d);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "[]" + "'", str56.equals("[]"));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) 10.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population13 = elitisticListPopulation12.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation12.iterator();
        double d15 = elitisticListPopulation12.getElitismRate();
        java.lang.String str16 = elitisticListPopulation12.toString();
        boolean b17 = defaultedMap3.containsValue((java.lang.Object) str16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate18, predicate19);
        java.lang.Object obj22 = null;
        boolean b23 = defaultedMap3.containsValue(obj22);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertTrue(d15 == 1.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) 10.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population13 = elitisticListPopulation12.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation12.iterator();
        double d15 = elitisticListPopulation12.getElitismRate();
        java.lang.String str16 = elitisticListPopulation12.toString();
        boolean b17 = defaultedMap3.containsValue((java.lang.Object) str16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate18, predicate19);
        java.util.Collection collection22 = defaultedMap3.values();
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj26 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        defaultedMap27.clear();
        boolean b30 = defaultedMap27.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj32 = defaultedMap27.get((java.lang.Object) 10.0d);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population37 = elitisticListPopulation36.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome38 = elitisticListPopulation36.iterator();
        double d39 = elitisticListPopulation36.getElitismRate();
        java.lang.String str40 = elitisticListPopulation36.toString();
        boolean b41 = defaultedMap27.containsValue((java.lang.Object) str40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate42, predicate43);
        boolean b46 = defaultedMap3.containsKey((java.lang.Object) map45);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertTrue(d15 == 1.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(population37);
        org.junit.Assert.assertNotNull(iterator_chromosome38);
        org.junit.Assert.assertTrue(d39 == 1.0d);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[]" + "'", str40.equals("[]"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) -1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.Predicate predicate0 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap5.putAll((java.util.Map) defaultedMap14);
        boolean b16 = defaultedMap14.isEmpty();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        int i6 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) 10.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj10 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        defaultedMap15.clear();
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) 10.0d);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        defaultedMap11.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap15.putAll((java.util.Map) defaultedMap24);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = defaultedMap24.get((java.lang.Object) 0L);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (-1) + "'", obj28.equals((-1)));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap5.putAll((java.util.Map) defaultedMap14);
        java.util.Collection collection16 = defaultedMap14.values();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        defaultedMap6.clear();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 10.0d);
        boolean b11 = defaultedMap6.equals((java.lang.Object) (short) 0);
        java.util.Collection collection12 = defaultedMap6.values();
        elitisticListPopulation4.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection12);
        int i14 = elitisticListPopulation4.getPopulationSize();
        java.lang.String str15 = elitisticListPopulation4.toString();
        double d16 = elitisticListPopulation4.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation4.getChromosomes();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) elitisticListPopulation4);
        java.lang.Object obj21 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) 97);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]" + "'", str15.equals("[]"));
        org.junit.Assert.assertTrue(d16 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1) + "'", obj18.equals((-1)));
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) 10.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i10 = defaultedMap3.size();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap5.putAll((java.util.Map) defaultedMap14);
        java.util.Set set16 = defaultedMap5.entrySet();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj15 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj21 = defaultedMap16.get((java.lang.Object) 10.0d);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj23 = defaultedMap5.remove((java.lang.Object) defaultedMap16);
        collections.Transformer transformer24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation(list_chromosome12, 10, (double) 1L);
        int i16 = elitisticListPopulation15.getPopulationSize();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (short) 0);
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        boolean b12 = defaultedMap9.containsKey((java.lang.Object) 10.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set16 = defaultedMap15.keySet();
        java.util.Set set17 = defaultedMap15.entrySet();
        boolean b19 = defaultedMap15.containsValue((java.lang.Object) (byte) 100);
        java.lang.Object obj20 = defaultedMap9.get((java.lang.Object) (byte) 100);
        defaultedMap9.clear();
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        int i12 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setElitismRate((double) 0L);
        java.lang.String str15 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]" + "'", str15.equals("[]"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation(list_chromosome12, 10, (double) 1L);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = list_chromosome12.spliterator();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) list_chromosome12);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj9 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        boolean b13 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap10.equals((java.lang.Object) (short) 0);
        java.util.Collection collection16 = defaultedMap10.values();
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection16);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome18 = elitisticListPopulation8.spliterator();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation8.iterator();
        elitisticListPopulation8.setElitismRate(1.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation8.getChromosomes();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(spliterator_chromosome18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1) + "'", obj19.equals((-1)));
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertNotNull(list_chromosome23);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(list_chromosome4);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        int i12 = elitisticListPopulation2.getPopulationSize();
        double d13 = elitisticListPopulation2.getElitismRate();
        try {
            elitisticListPopulation2.setElitismRate(10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(d13 == 1.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.lang.String str5 = elitisticListPopulation2.toString();
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation2.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj13 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        defaultedMap14.clear();
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) defaultedMap14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj20 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) 10.0d);
        boolean b26 = defaultedMap21.equals((java.lang.Object) (short) 0);
        java.util.Collection collection27 = defaultedMap21.values();
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection27);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome29 = elitisticListPopulation19.spliterator();
        java.lang.Object obj30 = defaultedMap12.get((java.lang.Object) elitisticListPopulation19);
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome31);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj36 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        defaultedMap37.clear();
        boolean b40 = defaultedMap37.containsKey((java.lang.Object) 10.0d);
        boolean b42 = defaultedMap37.equals((java.lang.Object) (short) 0);
        java.util.Collection collection43 = defaultedMap37.values();
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection43);
        int i45 = elitisticListPopulation35.getPopulationSize();
        java.lang.String str46 = elitisticListPopulation35.toString();
        double d47 = elitisticListPopulation35.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation35.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome48);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]" + "'", str5.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (-1) + "'", obj16.equals((-1)));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(spliterator_chromosome29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (-1) + "'", obj30.equals((-1)));
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]" + "'", str46.equals("[]"));
        org.junit.Assert.assertTrue(d47 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome48);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        int i12 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation2.getChromosomes();
        int i14 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation2.iterator();
        int i16 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        java.lang.String str6 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        int i7 = defaultedMap1.size();
        int i8 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        defaultedMap7.clear();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) 10.0d);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        java.lang.Object obj19 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        defaultedMap20.clear();
        boolean b23 = defaultedMap20.containsKey((java.lang.Object) 10.0d);
        boolean b25 = defaultedMap20.equals((java.lang.Object) (short) 0);
        java.util.Collection collection26 = defaultedMap20.values();
        java.lang.Object obj27 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        defaultedMap28.clear();
        boolean b31 = defaultedMap28.containsKey((java.lang.Object) 10.0d);
        defaultedMap20.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set35 = defaultedMap34.keySet();
        java.util.Set set36 = defaultedMap34.entrySet();
        boolean b38 = defaultedMap34.containsValue((java.lang.Object) (byte) 100);
        java.lang.Object obj39 = defaultedMap28.get((java.lang.Object) (byte) 100);
        defaultedMap28.clear();
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        java.util.Collection collection42 = defaultedMap1.values();
        java.util.Collection collection43 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(collection43);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap5.putAll((java.util.Map) defaultedMap14);
        defaultedMap5.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj20 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) 10.0d);
        boolean b26 = defaultedMap21.equals((java.lang.Object) (short) 0);
        java.util.Collection collection27 = defaultedMap21.values();
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection27);
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation19.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(list_chromosome29, 10, (double) 1L);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation(list_chromosome29, (int) (byte) 100, (double) 0);
        int i36 = elitisticListPopulation35.getPopulationLimit();
        boolean b37 = defaultedMap5.equals((java.lang.Object) elitisticListPopulation35);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(list_chromosome29);
        org.junit.Assert.assertTrue(i36 == 100);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        defaultedMap1.clear();
        java.util.Collection collection7 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        int i12 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str13 = elitisticListPopulation2.toString();
        double d14 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation2.getChromosomes();
        java.lang.Object obj16 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        defaultedMap17.clear();
        boolean b20 = defaultedMap17.containsKey((java.lang.Object) 10.0d);
        boolean b22 = defaultedMap17.equals((java.lang.Object) (short) 0);
        java.util.Collection collection23 = defaultedMap17.values();
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsKey((java.lang.Object) 10.0d);
        defaultedMap17.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set32 = defaultedMap31.keySet();
        java.util.Set set33 = defaultedMap31.entrySet();
        boolean b35 = defaultedMap31.containsValue((java.lang.Object) (byte) 100);
        java.lang.Object obj36 = defaultedMap25.get((java.lang.Object) (byte) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj40 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        defaultedMap41.clear();
        boolean b44 = defaultedMap41.containsKey((java.lang.Object) 10.0d);
        boolean b46 = defaultedMap41.equals((java.lang.Object) (short) 0);
        java.util.Collection collection47 = defaultedMap41.values();
        elitisticListPopulation39.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection47);
        int i49 = elitisticListPopulation39.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome50 = elitisticListPopulation39.getChromosomes();
        boolean b51 = defaultedMap25.containsValue((java.lang.Object) list_chromosome50);
        elitisticListPopulation2.setChromosomes(list_chromosome50);
        java.lang.String str53 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertTrue(d14 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(i49 == 97);
        org.junit.Assert.assertNotNull(list_chromosome50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[]" + "'", str53.equals("[]"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        defaultedMap6.clear();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Set set11 = defaultedMap1.entrySet();
        java.lang.Object obj12 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj16 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        defaultedMap17.clear();
        boolean b20 = defaultedMap17.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) 10.0d);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap17.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set30 = defaultedMap29.keySet();
        java.lang.Object obj32 = defaultedMap29.get((java.lang.Object) (byte) 10);
        boolean b33 = defaultedMap26.containsKey((java.lang.Object) (byte) 10);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b33);
        java.util.Collection collection35 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (-1) + "'", obj32.equals((-1)));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        elitisticListPopulation2.setElitismRate((double) 1.0f);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        defaultedMap7.clear();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) 10.0d);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        java.lang.Object obj19 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        defaultedMap20.clear();
        boolean b23 = defaultedMap20.containsKey((java.lang.Object) 10.0d);
        boolean b25 = defaultedMap20.equals((java.lang.Object) (short) 0);
        java.util.Collection collection26 = defaultedMap20.values();
        java.lang.Object obj27 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        defaultedMap28.clear();
        boolean b31 = defaultedMap28.containsKey((java.lang.Object) 10.0d);
        defaultedMap20.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set35 = defaultedMap34.keySet();
        java.util.Set set36 = defaultedMap34.entrySet();
        boolean b38 = defaultedMap34.containsValue((java.lang.Object) (byte) 100);
        java.lang.Object obj39 = defaultedMap28.get((java.lang.Object) (byte) 100);
        defaultedMap28.clear();
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        java.util.Collection collection42 = defaultedMap1.values();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        java.lang.Object obj45 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj49 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        defaultedMap50.clear();
        boolean b53 = defaultedMap50.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj55 = defaultedMap50.get((java.lang.Object) 10.0d);
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        defaultedMap46.putAll((java.util.Map) defaultedMap50);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap50.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj61 = defaultedMap44.remove((java.lang.Object) defaultedMap50);
        java.lang.Object obj62 = defaultedMap1.get((java.lang.Object) defaultedMap50);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(obj62);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.lang.String str5 = elitisticListPopulation2.toString();
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        int i13 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]" + "'", str5.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (short) 0);
        boolean b7 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population11 = elitisticListPopulation10.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation10.iterator();
        double d13 = elitisticListPopulation10.getElitismRate();
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) d13);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue(d13 == 1.0d);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation(list_chromosome12, 10, (double) 1L);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = list_chromosome12.spliterator();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(list_chromosome12, (int) (byte) 10, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj9 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        boolean b13 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap10.equals((java.lang.Object) (short) 0);
        java.util.Collection collection16 = defaultedMap10.values();
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection16);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome18 = elitisticListPopulation8.spliterator();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation8.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation8.getChromosomes();
        try {
            elitisticListPopulation8.setPopulationLimit((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(spliterator_chromosome18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1) + "'", obj19.equals((-1)));
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertNotNull(list_chromosome21);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        java.util.Set set5 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        defaultedMap6.clear();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Set set11 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set14 = defaultedMap13.keySet();
        java.util.Set set15 = defaultedMap13.entrySet();
        defaultedMap13.clear();
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        defaultedMap19.clear();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) 10.0d);
        java.lang.Object obj26 = defaultedMap19.get((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = defaultedMap13.remove((java.lang.Object) (byte) 10);
        defaultedMap13.clear();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap5.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set18 = defaultedMap17.keySet();
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) (byte) 10);
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) (byte) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj25 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        defaultedMap26.clear();
        boolean b29 = defaultedMap26.containsKey((java.lang.Object) 10.0d);
        boolean b31 = defaultedMap26.equals((java.lang.Object) (short) 0);
        java.util.Collection collection32 = defaultedMap26.values();
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection32);
        int i34 = elitisticListPopulation24.getPopulationLimit();
        int i35 = elitisticListPopulation24.getPopulationSize();
        boolean b36 = defaultedMap14.containsKey((java.lang.Object) elitisticListPopulation24);
        int i37 = elitisticListPopulation24.getPopulationSize();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1) + "'", obj20.equals((-1)));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(i34 == 97);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj11 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        defaultedMap12.clear();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) 10.0d);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj19 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj23 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        defaultedMap24.clear();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj29 = defaultedMap24.get((java.lang.Object) 10.0d);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        defaultedMap20.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap24.putAll((java.util.Map) defaultedMap33);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap33);
        java.lang.Object obj36 = defaultedMap1.get((java.lang.Object) map35);
        java.util.Set set37 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1) + "'", obj4.equals((-1)));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (-1) + "'", obj36.equals((-1)));
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) defaultedMap9);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) predicateUtils12);
        defaultedMap1.putAll(map13);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1) + "'", obj11.equals((-1)));
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.Predicate predicate0 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj13 = defaultedMap8.get((java.lang.Object) 10.0d);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap4.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        defaultedMap19.clear();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) 10.0d);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj26 = defaultedMap8.remove((java.lang.Object) defaultedMap19);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        int i28 = defaultedMap19.size();
        java.lang.Object obj29 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj33 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        defaultedMap34.clear();
        boolean b37 = defaultedMap34.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) 10.0d);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        defaultedMap30.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap34.putAll((java.util.Map) defaultedMap43);
        defaultedMap19.putAll((java.util.Map) defaultedMap43);
        collections.Factory factory46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, factory46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(obj39);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) defaultedMap9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj15 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsKey((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.equals((java.lang.Object) (short) 0);
        java.util.Collection collection22 = defaultedMap16.values();
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection22);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome24 = elitisticListPopulation14.spliterator();
        java.lang.Object obj25 = defaultedMap7.get((java.lang.Object) elitisticListPopulation14);
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation14.getChromosomes();
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) list_chromosome26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap1.putAll((java.util.Map) defaultedMap29);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1) + "'", obj11.equals((-1)));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(spliterator_chromosome24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (-1) + "'", obj25.equals((-1)));
        org.junit.Assert.assertNotNull(list_chromosome26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1) + "'", obj27.equals((-1)));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 97);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation(list_chromosome12, 10, (double) 1L);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(list_chromosome12, (int) (byte) 100, (double) 0);
        int i19 = elitisticListPopulation18.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = elitisticListPopulation18.spliterator();
        int i21 = elitisticListPopulation18.getPopulationLimit();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertTrue(i21 == 100);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        defaultedMap6.clear();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Set set11 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set14 = defaultedMap13.keySet();
        java.util.Set set15 = defaultedMap13.entrySet();
        defaultedMap13.clear();
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        defaultedMap19.clear();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) 10.0d);
        java.lang.Object obj26 = defaultedMap19.get((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = defaultedMap13.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj28 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        defaultedMap29.clear();
        boolean b32 = defaultedMap29.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj34 = defaultedMap29.get((java.lang.Object) 10.0d);
        java.lang.Object obj35 = defaultedMap13.remove(obj34);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap5.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap14.containsValue(obj16);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj15 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsKey((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.equals((java.lang.Object) (short) 0);
        java.util.Collection collection22 = defaultedMap16.values();
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection22);
        int i24 = elitisticListPopulation14.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome25);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(i24 == 97);
        org.junit.Assert.assertNotNull(list_chromosome25);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        int i11 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1) + "'", obj4.equals((-1)));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b13 = defaultedMap5.isEmpty();
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation(list_chromosome8, 97, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) defaultedMap5);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) "");
        java.lang.Object obj10 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        defaultedMap15.clear();
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) 10.0d);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        defaultedMap11.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap15.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj26 = defaultedMap5.get((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set29 = defaultedMap28.keySet();
        java.lang.Object obj31 = defaultedMap28.get((java.lang.Object) (byte) 10);
        boolean b33 = defaultedMap28.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate34, predicate36);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) defaultedMap28);
        defaultedMap1.putAll((java.util.Map) defaultedMap28);
        boolean b41 = defaultedMap28.isEmpty();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1) + "'", obj7.equals((-1)));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (-1) + "'", obj31.equals((-1)));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b41 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap5.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set18 = defaultedMap17.keySet();
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) (byte) 10);
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) (byte) 10);
        java.lang.Object obj22 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        defaultedMap23.clear();
        boolean b26 = defaultedMap23.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj27 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        defaultedMap28.clear();
        boolean b31 = defaultedMap28.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj32 = defaultedMap23.get((java.lang.Object) 10.0d);
        java.util.Set set33 = defaultedMap23.entrySet();
        java.lang.Object obj34 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        defaultedMap35.clear();
        boolean b38 = defaultedMap35.containsKey((java.lang.Object) 10.0d);
        boolean b40 = defaultedMap35.equals((java.lang.Object) (short) 0);
        java.util.Collection collection41 = defaultedMap35.values();
        java.lang.Object obj42 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        defaultedMap43.clear();
        boolean b46 = defaultedMap43.containsKey((java.lang.Object) 10.0d);
        defaultedMap35.putAll((java.util.Map) defaultedMap43);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj49 = defaultedMap43.get((java.lang.Object) predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj52 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        defaultedMap53.clear();
        boolean b56 = defaultedMap53.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj58 = defaultedMap53.get((java.lang.Object) 10.0d);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        math.genetics.ElitisticListPopulation elitisticListPopulation62 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population63 = elitisticListPopulation62.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome64 = elitisticListPopulation62.iterator();
        double d65 = elitisticListPopulation62.getElitismRate();
        java.lang.String str66 = elitisticListPopulation62.toString();
        boolean b67 = defaultedMap53.containsValue((java.lang.Object) str66);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) predicate69);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate68, predicate69);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate48, predicate68);
        java.lang.Object obj73 = defaultedMap14.get((java.lang.Object) defaultedMap23);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1) + "'", obj20.equals((-1)));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(population63);
        org.junit.Assert.assertNotNull(iterator_chromosome64);
        org.junit.Assert.assertTrue(d65 == 1.0d);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "[]" + "'", str66.equals("[]"));
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + (-1) + "'", obj73.equals((-1)));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setElitismRate((double) 1.0f);
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap5.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set18 = defaultedMap17.keySet();
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) (byte) 10);
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) (byte) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj25 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        defaultedMap26.clear();
        boolean b29 = defaultedMap26.containsKey((java.lang.Object) 10.0d);
        boolean b31 = defaultedMap26.equals((java.lang.Object) (short) 0);
        java.util.Collection collection32 = defaultedMap26.values();
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection32);
        int i34 = elitisticListPopulation24.getPopulationLimit();
        int i35 = elitisticListPopulation24.getPopulationSize();
        boolean b36 = defaultedMap14.containsKey((java.lang.Object) elitisticListPopulation24);
        java.lang.Object obj37 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        defaultedMap38.clear();
        java.lang.Object obj40 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj44 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        defaultedMap45.clear();
        boolean b48 = defaultedMap45.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj50 = defaultedMap45.get((java.lang.Object) 10.0d);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        defaultedMap41.putAll((java.util.Map) defaultedMap45);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj55 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        defaultedMap56.clear();
        boolean b59 = defaultedMap56.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj61 = defaultedMap56.get((java.lang.Object) 10.0d);
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        java.lang.Object obj63 = defaultedMap45.remove((java.lang.Object) defaultedMap56);
        defaultedMap38.putAll((java.util.Map) defaultedMap56);
        java.util.Set set65 = defaultedMap38.entrySet();
        boolean b66 = defaultedMap14.containsValue((java.lang.Object) defaultedMap38);
        boolean b67 = defaultedMap38.isEmpty();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1) + "'", obj20.equals((-1)));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(i34 == 97);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj13 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        defaultedMap14.clear();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap14.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set23 = defaultedMap22.keySet();
        java.util.Set set24 = defaultedMap22.entrySet();
        boolean b25 = defaultedMap14.containsKey((java.lang.Object) set24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj28 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        defaultedMap29.clear();
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) defaultedMap29);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj36 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        defaultedMap37.clear();
        boolean b40 = defaultedMap37.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj42 = defaultedMap37.get((java.lang.Object) 10.0d);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population47 = elitisticListPopulation46.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome48 = elitisticListPopulation46.iterator();
        double d49 = elitisticListPopulation46.getElitismRate();
        java.lang.String str50 = elitisticListPopulation46.toString();
        boolean b51 = defaultedMap37.containsValue((java.lang.Object) str50);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj55 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        defaultedMap56.clear();
        boolean b59 = defaultedMap56.containsKey((java.lang.Object) 10.0d);
        boolean b61 = defaultedMap56.equals((java.lang.Object) (short) 0);
        java.util.Collection collection62 = defaultedMap56.values();
        elitisticListPopulation54.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection62);
        java.util.List<math.genetics.Chromosome> list_chromosome64 = elitisticListPopulation54.getChromosomes();
        java.lang.Object obj65 = defaultedMap29.put((java.lang.Object) defaultedMap37, (java.lang.Object) list_chromosome64);
        java.lang.Object obj66 = defaultedMap14.get((java.lang.Object) defaultedMap37);
        java.lang.Object obj67 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        int i68 = defaultedMap14.size();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (-1) + "'", obj31.equals((-1)));
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(population47);
        org.junit.Assert.assertNotNull(iterator_chromosome48);
        org.junit.Assert.assertTrue(d49 == 1.0d);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "[]" + "'", str50.equals("[]"));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(list_chromosome64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue(i68 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj9 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        boolean b13 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap10.equals((java.lang.Object) (short) 0);
        java.util.Collection collection16 = defaultedMap10.values();
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection16);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome18 = elitisticListPopulation8.spliterator();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation8.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation8.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation(list_chromosome21, 97, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(spliterator_chromosome18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1) + "'", obj19.equals((-1)));
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertNotNull(list_chromosome21);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) 10.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population13 = elitisticListPopulation12.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation12.iterator();
        double d15 = elitisticListPopulation12.getElitismRate();
        java.lang.String str16 = elitisticListPopulation12.toString();
        boolean b17 = defaultedMap3.containsValue((java.lang.Object) str16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate18, predicate19);
        int i22 = defaultedMap3.size();
        boolean b23 = defaultedMap3.isEmpty();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertTrue(d15 == 1.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) "");
        java.util.Set set8 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set12 = defaultedMap11.keySet();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) (byte) 10);
        boolean b16 = defaultedMap11.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate17, predicate19);
        java.lang.Object obj22 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        defaultedMap23.clear();
        boolean b26 = defaultedMap23.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj27 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        defaultedMap28.clear();
        boolean b31 = defaultedMap28.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj32 = defaultedMap23.get((java.lang.Object) 10.0d);
        java.util.Set set33 = defaultedMap23.entrySet();
        java.lang.Object obj34 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        defaultedMap35.clear();
        boolean b38 = defaultedMap35.containsKey((java.lang.Object) 10.0d);
        boolean b40 = defaultedMap35.equals((java.lang.Object) (short) 0);
        java.util.Collection collection41 = defaultedMap35.values();
        java.lang.Object obj42 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        defaultedMap43.clear();
        boolean b46 = defaultedMap43.containsKey((java.lang.Object) 10.0d);
        defaultedMap35.putAll((java.util.Map) defaultedMap43);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj49 = defaultedMap43.get((java.lang.Object) predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj52 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        defaultedMap53.clear();
        boolean b56 = defaultedMap53.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj58 = defaultedMap53.get((java.lang.Object) 10.0d);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        math.genetics.ElitisticListPopulation elitisticListPopulation62 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population63 = elitisticListPopulation62.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome64 = elitisticListPopulation62.iterator();
        double d65 = elitisticListPopulation62.getElitismRate();
        java.lang.String str66 = elitisticListPopulation62.toString();
        boolean b67 = defaultedMap53.containsValue((java.lang.Object) str66);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) predicate69);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate68, predicate69);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate48, predicate68);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate17, predicate68);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1) + "'", obj14.equals((-1)));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(population63);
        org.junit.Assert.assertNotNull(iterator_chromosome64);
        org.junit.Assert.assertTrue(d65 == 1.0d);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "[]" + "'", str66.equals("[]"));
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        int i12 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str13 = elitisticListPopulation2.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation2.getChromosomes();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        java.util.Set set16 = defaultedMap15.keySet();
        defaultedMap15.clear();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsValue(obj7);
        java.lang.Object obj9 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        boolean b13 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) 10.0d);
        java.lang.Object obj17 = defaultedMap10.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        boolean b20 = defaultedMap19.isEmpty();
        java.lang.Object obj21 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        defaultedMap22.clear();
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) 1.0f);
        java.lang.Object obj26 = defaultedMap10.put((java.lang.Object) b20, obj25);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) b20);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1) + "'", obj4.equals((-1)));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj13 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        defaultedMap14.clear();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap14.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set23 = defaultedMap22.keySet();
        java.util.Set set24 = defaultedMap22.entrySet();
        boolean b25 = defaultedMap14.containsKey((java.lang.Object) set24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj28 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        defaultedMap29.clear();
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) defaultedMap29);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj36 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        defaultedMap37.clear();
        boolean b40 = defaultedMap37.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj42 = defaultedMap37.get((java.lang.Object) 10.0d);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population47 = elitisticListPopulation46.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome48 = elitisticListPopulation46.iterator();
        double d49 = elitisticListPopulation46.getElitismRate();
        java.lang.String str50 = elitisticListPopulation46.toString();
        boolean b51 = defaultedMap37.containsValue((java.lang.Object) str50);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj55 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        defaultedMap56.clear();
        boolean b59 = defaultedMap56.containsKey((java.lang.Object) 10.0d);
        boolean b61 = defaultedMap56.equals((java.lang.Object) (short) 0);
        java.util.Collection collection62 = defaultedMap56.values();
        elitisticListPopulation54.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection62);
        java.util.List<math.genetics.Chromosome> list_chromosome64 = elitisticListPopulation54.getChromosomes();
        java.lang.Object obj65 = defaultedMap29.put((java.lang.Object) defaultedMap37, (java.lang.Object) list_chromosome64);
        java.lang.Object obj66 = defaultedMap14.get((java.lang.Object) defaultedMap37);
        java.lang.Object obj67 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        boolean b70 = defaultedMap69.isEmpty();
        java.lang.Object obj71 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap(obj71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj75 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap(obj75);
        defaultedMap76.clear();
        boolean b79 = defaultedMap76.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj81 = defaultedMap76.get((java.lang.Object) 10.0d);
        defaultedMap74.putAll((java.util.Map) defaultedMap76);
        defaultedMap72.putAll((java.util.Map) defaultedMap76);
        boolean b84 = defaultedMap76.isEmpty();
        boolean b85 = defaultedMap69.containsValue((java.lang.Object) b84);
        boolean b86 = defaultedMap14.equals((java.lang.Object) b85);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (-1) + "'", obj31.equals((-1)));
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(population47);
        org.junit.Assert.assertNotNull(iterator_chromosome48);
        org.junit.Assert.assertTrue(d49 == 1.0d);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "[]" + "'", str50.equals("[]"));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(list_chromosome64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b86 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1) + "'", obj4.equals((-1)));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation2.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation2.iterator();
        int i16 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj10 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        defaultedMap11.clear();
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) defaultedMap11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj17 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        boolean b21 = defaultedMap18.containsKey((java.lang.Object) 10.0d);
        boolean b23 = defaultedMap18.equals((java.lang.Object) (short) 0);
        java.util.Collection collection24 = defaultedMap18.values();
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection24);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome26 = elitisticListPopulation16.spliterator();
        java.lang.Object obj27 = defaultedMap9.get((java.lang.Object) elitisticListPopulation16);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome28 = elitisticListPopulation16.iterator();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) elitisticListPopulation16);
        java.lang.String str30 = elitisticListPopulation16.toString();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1) + "'", obj13.equals((-1)));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(spliterator_chromosome26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1) + "'", obj27.equals((-1)));
        org.junit.Assert.assertNotNull(iterator_chromosome28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]" + "'", str30.equals("[]"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (short) 0);
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        boolean b12 = defaultedMap9.containsKey((java.lang.Object) 10.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set16 = defaultedMap15.keySet();
        java.util.Set set17 = defaultedMap15.entrySet();
        boolean b19 = defaultedMap15.containsValue((java.lang.Object) (byte) 100);
        java.lang.Object obj20 = defaultedMap9.get((java.lang.Object) (byte) 100);
        defaultedMap9.clear();
        int i22 = defaultedMap9.size();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b13 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set16 = defaultedMap15.keySet();
        java.lang.Object obj18 = defaultedMap15.get((java.lang.Object) (byte) 10);
        boolean b20 = defaultedMap15.containsValue((java.lang.Object) 10.0d);
        java.lang.Object obj22 = defaultedMap15.remove((java.lang.Object) "hi!");
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) (-1.0f));
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj29 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        defaultedMap30.clear();
        boolean b33 = defaultedMap30.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj35 = defaultedMap30.get((java.lang.Object) 10.0d);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population40 = elitisticListPopulation39.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome41 = elitisticListPopulation39.iterator();
        double d42 = elitisticListPopulation39.getElitismRate();
        java.lang.String str43 = elitisticListPopulation39.toString();
        boolean b44 = defaultedMap30.containsValue((java.lang.Object) str43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate45, predicate46);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate25, predicate46);
        boolean b50 = defaultedMap5.equals((java.lang.Object) map49);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1) + "'", obj18.equals((-1)));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(population40);
        org.junit.Assert.assertNotNull(iterator_chromosome41);
        org.junit.Assert.assertTrue(d42 == 1.0d);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "[]" + "'", str43.equals("[]"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.Object obj9 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        boolean b13 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap10.equals((java.lang.Object) (short) 0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) (short) 0);
        boolean b18 = defaultedMap1.equals((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj13 = defaultedMap8.get((java.lang.Object) 10.0d);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap4.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        defaultedMap19.clear();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) 10.0d);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj26 = defaultedMap8.remove((java.lang.Object) defaultedMap19);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        java.util.Set set28 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj32 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        boolean b36 = defaultedMap33.containsKey((java.lang.Object) 10.0d);
        boolean b38 = defaultedMap33.equals((java.lang.Object) (short) 0);
        java.util.Collection collection39 = defaultedMap33.values();
        elitisticListPopulation31.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection39);
        int i41 = elitisticListPopulation31.getPopulationLimit();
        boolean b42 = defaultedMap1.equals((java.lang.Object) i41);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(i41 == 97);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        int i12 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str13 = elitisticListPopulation2.toString();
        double d14 = elitisticListPopulation2.getElitismRate();
        int i15 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation2.addChromosome(chromosome16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        java.lang.Object obj20 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 10.0d);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        defaultedMap21.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap25.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj36 = defaultedMap19.remove((java.lang.Object) defaultedMap25);
        java.lang.Object obj37 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        defaultedMap38.clear();
        boolean b41 = defaultedMap38.containsKey((java.lang.Object) 10.0d);
        boolean b43 = defaultedMap38.equals((java.lang.Object) (short) 0);
        java.util.Collection collection44 = defaultedMap38.values();
        java.lang.Object obj45 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        defaultedMap46.clear();
        boolean b49 = defaultedMap46.containsKey((java.lang.Object) 10.0d);
        defaultedMap38.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set53 = defaultedMap52.keySet();
        java.util.Set set54 = defaultedMap52.entrySet();
        boolean b56 = defaultedMap52.containsValue((java.lang.Object) (byte) 100);
        java.lang.Object obj57 = defaultedMap46.get((java.lang.Object) (byte) 100);
        defaultedMap46.clear();
        java.lang.Object obj59 = defaultedMap19.remove((java.lang.Object) defaultedMap46);
        java.util.Collection collection60 = defaultedMap19.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection60);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertTrue(d14 == 1.0d);
        org.junit.Assert.assertTrue(i15 == 97);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(collection60);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b2 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        int i12 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str13 = elitisticListPopulation2.toString();
        double d14 = elitisticListPopulation2.getElitismRate();
        int i15 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertTrue(d14 == 1.0d);
        org.junit.Assert.assertTrue(i15 == 97);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) defaultedMap9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj15 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsKey((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.equals((java.lang.Object) (short) 0);
        java.util.Collection collection22 = defaultedMap16.values();
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection22);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome24 = elitisticListPopulation14.spliterator();
        java.lang.Object obj25 = defaultedMap7.get((java.lang.Object) elitisticListPopulation14);
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation14.getChromosomes();
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) list_chromosome26);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Chromosome chromosome31 = null;
        elitisticListPopulation30.addChromosome(chromosome31);
        java.lang.String str33 = elitisticListPopulation30.toString();
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35);
        int i38 = elitisticListPopulation30.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj41 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        defaultedMap42.clear();
        java.lang.Object obj44 = defaultedMap40.get((java.lang.Object) defaultedMap42);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj48 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        defaultedMap49.clear();
        boolean b52 = defaultedMap49.containsKey((java.lang.Object) 10.0d);
        boolean b54 = defaultedMap49.equals((java.lang.Object) (short) 0);
        java.util.Collection collection55 = defaultedMap49.values();
        elitisticListPopulation47.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection55);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome57 = elitisticListPopulation47.spliterator();
        java.lang.Object obj58 = defaultedMap40.get((java.lang.Object) elitisticListPopulation47);
        java.util.List<math.genetics.Chromosome> list_chromosome59 = elitisticListPopulation47.getChromosomes();
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome59);
        java.lang.Object obj61 = defaultedMap1.get((java.lang.Object) elitisticListPopulation30);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1) + "'", obj11.equals((-1)));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(spliterator_chromosome24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (-1) + "'", obj25.equals((-1)));
        org.junit.Assert.assertNotNull(list_chromosome26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1) + "'", obj27.equals((-1)));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[null]" + "'", str33.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i38 == 97);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (-1) + "'", obj44.equals((-1)));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(spliterator_chromosome57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (-1) + "'", obj58.equals((-1)));
        org.junit.Assert.assertNotNull(list_chromosome59);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (-1) + "'", obj61.equals((-1)));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation(list_chromosome8, (int) (byte) 1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation2.getChromosomes();
        double d13 = elitisticListPopulation2.getElitismRate();
        int i14 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(d13 == 1.0d);
        org.junit.Assert.assertTrue(i14 == 97);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        defaultedMap7.clear();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) 10.0d);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        int i19 = defaultedMap7.size();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, 0.0d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        int i6 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str7 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[null]" + "'", str7.equals("[null]"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 10);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.lang.String str5 = elitisticListPopulation2.toString();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]" + "'", str5.equals("[null]"));
        org.junit.Assert.assertTrue(i6 == 97);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        defaultedMap5.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set16 = defaultedMap15.keySet();
        java.lang.Object obj18 = defaultedMap15.get((java.lang.Object) (byte) 10);
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) 100.0d);
        boolean b21 = defaultedMap15.isEmpty();
        boolean b22 = defaultedMap5.containsKey((java.lang.Object) b21);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1) + "'", obj18.equals((-1)));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1) + "'", obj20.equals((-1)));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.Predicate predicate0 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set4 = defaultedMap3.keySet();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (byte) 10);
        boolean b8 = defaultedMap3.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set16 = defaultedMap15.keySet();
        java.lang.Object obj18 = defaultedMap15.get((java.lang.Object) (byte) 10);
        boolean b20 = defaultedMap15.containsValue((java.lang.Object) 10.0d);
        java.lang.Object obj22 = defaultedMap15.remove((java.lang.Object) "hi!");
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) (-1.0f));
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj29 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        defaultedMap30.clear();
        boolean b33 = defaultedMap30.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj35 = defaultedMap30.get((java.lang.Object) 10.0d);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population40 = elitisticListPopulation39.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome41 = elitisticListPopulation39.iterator();
        double d42 = elitisticListPopulation39.getElitismRate();
        java.lang.String str43 = elitisticListPopulation39.toString();
        boolean b44 = defaultedMap30.containsValue((java.lang.Object) str43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate45, predicate46);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate25, predicate46);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate46);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1) + "'", obj6.equals((-1)));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1) + "'", obj18.equals((-1)));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(population40);
        org.junit.Assert.assertNotNull(iterator_chromosome41);
        org.junit.Assert.assertTrue(d42 == 1.0d);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "[]" + "'", str43.equals("[]"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        int i12 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str13 = elitisticListPopulation2.toString();
        double d14 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation2.getChromosomes();
        java.lang.Object obj16 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        defaultedMap17.clear();
        boolean b20 = defaultedMap17.containsKey((java.lang.Object) 10.0d);
        boolean b22 = defaultedMap17.equals((java.lang.Object) (short) 0);
        java.util.Collection collection23 = defaultedMap17.values();
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsKey((java.lang.Object) 10.0d);
        defaultedMap17.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set32 = defaultedMap31.keySet();
        java.util.Set set33 = defaultedMap31.entrySet();
        boolean b35 = defaultedMap31.containsValue((java.lang.Object) (byte) 100);
        java.lang.Object obj36 = defaultedMap25.get((java.lang.Object) (byte) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj40 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        defaultedMap41.clear();
        boolean b44 = defaultedMap41.containsKey((java.lang.Object) 10.0d);
        boolean b46 = defaultedMap41.equals((java.lang.Object) (short) 0);
        java.util.Collection collection47 = defaultedMap41.values();
        elitisticListPopulation39.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection47);
        int i49 = elitisticListPopulation39.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome50 = elitisticListPopulation39.getChromosomes();
        boolean b51 = defaultedMap25.containsValue((java.lang.Object) list_chromosome50);
        elitisticListPopulation2.setChromosomes(list_chromosome50);
        math.genetics.Population population53 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertTrue(d14 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(i49 == 97);
        org.junit.Assert.assertNotNull(list_chromosome50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(population53);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        int i12 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str13 = elitisticListPopulation2.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome15 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(spliterator_chromosome15);
        org.junit.Assert.assertNotNull(list_chromosome16);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) "");
        boolean b8 = defaultedMap3.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation11.addChromosome(chromosome12);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) elitisticListPopulation11);
        math.genetics.Population population15 = elitisticListPopulation11.nextGeneration();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(population15);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) "");
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj12 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        boolean b16 = defaultedMap13.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) 10.0d);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        defaultedMap9.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj24 = defaultedMap3.get((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set27 = defaultedMap26.keySet();
        java.lang.Object obj29 = defaultedMap26.get((java.lang.Object) (byte) 10);
        boolean b31 = defaultedMap26.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate32, predicate34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) defaultedMap26);
        java.lang.Object obj38 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.util.Collection collection40 = defaultedMap39.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population44 = elitisticListPopulation43.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome45 = elitisticListPopulation43.iterator();
        double d46 = elitisticListPopulation43.getElitismRate();
        java.lang.String str47 = elitisticListPopulation43.toString();
        boolean b48 = defaultedMap39.equals((java.lang.Object) str47);
        boolean b49 = defaultedMap26.equals((java.lang.Object) str47);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (-1) + "'", obj29.equals((-1)));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(population44);
        org.junit.Assert.assertNotNull(iterator_chromosome45);
        org.junit.Assert.assertTrue(d46 == 1.0d);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "[]" + "'", str47.equals("[]"));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) defaultedMap5);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) "");
        java.lang.Object obj10 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        defaultedMap15.clear();
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) 10.0d);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        defaultedMap11.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap15.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj26 = defaultedMap5.get((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set29 = defaultedMap28.keySet();
        java.lang.Object obj31 = defaultedMap28.get((java.lang.Object) (byte) 10);
        boolean b33 = defaultedMap28.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate34, predicate36);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) defaultedMap28);
        defaultedMap1.putAll((java.util.Map) defaultedMap28);
        java.lang.Object obj41 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        defaultedMap42.clear();
        boolean b45 = defaultedMap42.containsKey((java.lang.Object) 10.0d);
        boolean b47 = defaultedMap42.equals((java.lang.Object) (short) 0);
        java.util.Collection collection48 = defaultedMap42.values();
        java.lang.Object obj49 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        defaultedMap50.clear();
        boolean b53 = defaultedMap50.containsKey((java.lang.Object) 10.0d);
        defaultedMap42.putAll((java.util.Map) defaultedMap50);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj56 = defaultedMap50.get((java.lang.Object) predicate55);
        boolean b57 = defaultedMap28.containsKey((java.lang.Object) defaultedMap50);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1) + "'", obj7.equals((-1)));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (-1) + "'", obj31.equals((-1)));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        defaultedMap15.clear();
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) 10.0d);
        boolean b20 = defaultedMap15.equals((java.lang.Object) (short) 0);
        java.util.Collection collection21 = defaultedMap15.values();
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection21);
        int i23 = elitisticListPopulation13.getPopulationSize();
        java.lang.String str24 = elitisticListPopulation13.toString();
        double d25 = elitisticListPopulation13.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation13.getChromosomes();
        java.lang.Object obj27 = defaultedMap10.get((java.lang.Object) elitisticListPopulation13);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, obj27);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.lang.String str30 = defaultedMap8.toString();
        collections.Factory factory31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, factory31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
        org.junit.Assert.assertTrue(d25 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1) + "'", obj27.equals((-1)));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation(list_chromosome12, (-1), (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(list_chromosome12);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        defaultedMap15.clear();
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) defaultedMap15);
        defaultedMap13.clear();
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj22 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        defaultedMap23.clear();
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) defaultedMap23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj29 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        defaultedMap30.clear();
        boolean b33 = defaultedMap30.containsKey((java.lang.Object) 10.0d);
        boolean b35 = defaultedMap30.equals((java.lang.Object) (short) 0);
        java.util.Collection collection36 = defaultedMap30.values();
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection36);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome38 = elitisticListPopulation28.spliterator();
        java.lang.Object obj39 = defaultedMap21.get((java.lang.Object) elitisticListPopulation28);
        java.util.List<math.genetics.Chromosome> list_chromosome40 = elitisticListPopulation28.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation28.getChromosomes();
        boolean b42 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation28);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1) + "'", obj4.equals((-1)));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1) + "'", obj17.equals((-1)));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (-1) + "'", obj25.equals((-1)));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(spliterator_chromosome38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (-1) + "'", obj39.equals((-1)));
        org.junit.Assert.assertNotNull(list_chromosome40);
        org.junit.Assert.assertNotNull(list_chromosome41);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.lang.String str6 = elitisticListPopulation2.toString();
        try {
            elitisticListPopulation2.setElitismRate((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) "");
        boolean b8 = defaultedMap3.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation11.addChromosome(chromosome12);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) elitisticListPopulation11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set17 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap16.get((java.lang.Object) (byte) 10);
        boolean b21 = defaultedMap16.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate22, predicate24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj30 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        defaultedMap31.clear();
        boolean b34 = defaultedMap31.containsKey((java.lang.Object) 10.0d);
        boolean b36 = defaultedMap31.equals((java.lang.Object) (short) 0);
        java.util.Collection collection37 = defaultedMap31.values();
        elitisticListPopulation29.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection37);
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation29.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome40 = elitisticListPopulation29.spliterator();
        java.lang.Object obj41 = defaultedMap3.put((java.lang.Object) map26, (java.lang.Object) elitisticListPopulation29);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1) + "'", obj19.equals((-1)));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(list_chromosome39);
        org.junit.Assert.assertNotNull(spliterator_chromosome40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj13 = defaultedMap8.get((java.lang.Object) 10.0d);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap4.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        defaultedMap19.clear();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) 10.0d);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj26 = defaultedMap8.remove((java.lang.Object) defaultedMap19);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        int i28 = defaultedMap19.size();
        java.lang.Object obj29 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        defaultedMap30.clear();
        boolean b33 = defaultedMap30.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj34 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        defaultedMap35.clear();
        boolean b38 = defaultedMap35.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) 10.0d);
        java.util.Set set40 = defaultedMap30.entrySet();
        java.lang.Object obj41 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        defaultedMap42.clear();
        boolean b45 = defaultedMap42.containsKey((java.lang.Object) 10.0d);
        boolean b47 = defaultedMap42.equals((java.lang.Object) (short) 0);
        java.util.Collection collection48 = defaultedMap42.values();
        java.lang.Object obj49 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        defaultedMap50.clear();
        boolean b53 = defaultedMap50.containsKey((java.lang.Object) 10.0d);
        defaultedMap42.putAll((java.util.Map) defaultedMap50);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj56 = defaultedMap50.get((java.lang.Object) predicate55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj59 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        defaultedMap60.clear();
        boolean b63 = defaultedMap60.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj65 = defaultedMap60.get((java.lang.Object) 10.0d);
        defaultedMap58.putAll((java.util.Map) defaultedMap60);
        math.genetics.ElitisticListPopulation elitisticListPopulation69 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population70 = elitisticListPopulation69.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome71 = elitisticListPopulation69.iterator();
        double d72 = elitisticListPopulation69.getElitismRate();
        java.lang.String str73 = elitisticListPopulation69.toString();
        boolean b74 = defaultedMap60.containsValue((java.lang.Object) str73);
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) predicate76);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate75, predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate55, predicate75);
        boolean b80 = defaultedMap19.containsKey((java.lang.Object) predicate75);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNotNull(population70);
        org.junit.Assert.assertNotNull(iterator_chromosome71);
        org.junit.Assert.assertTrue(d72 == 1.0d);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "[]" + "'", str73.equals("[]"));
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b80 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(97, (double) 0);
        try {
            math.genetics.Chromosome chromosome3 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.lang.String str6 = elitisticListPopulation2.toString();
        try {
            math.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 1.0f);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) "");
        java.util.Set set8 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        java.lang.Object obj10 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        defaultedMap11.clear();
        boolean b14 = defaultedMap11.containsKey((java.lang.Object) 10.0d);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) b14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj23 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        defaultedMap24.clear();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap24.equals((java.lang.Object) (short) 0);
        java.util.Collection collection30 = defaultedMap24.values();
        elitisticListPopulation22.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection30);
        int i32 = elitisticListPopulation22.getPopulationSize();
        java.lang.String str33 = elitisticListPopulation22.toString();
        double d34 = elitisticListPopulation22.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation22.getChromosomes();
        java.lang.Object obj36 = defaultedMap19.get((java.lang.Object) elitisticListPopulation22);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, obj36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj40 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        defaultedMap41.clear();
        java.lang.Object obj43 = defaultedMap39.get((java.lang.Object) defaultedMap41);
        java.lang.Object obj45 = defaultedMap41.get((java.lang.Object) "");
        java.util.Set set46 = defaultedMap41.entrySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap41);
        java.lang.Object obj48 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        defaultedMap49.clear();
        boolean b52 = defaultedMap49.containsKey((java.lang.Object) 10.0d);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) b52);
        defaultedMap17.putAll((java.util.Map) defaultedMap47);
        boolean b55 = defaultedMap9.containsKey((java.lang.Object) defaultedMap17);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[]" + "'", str33.equals("[]"));
        org.junit.Assert.assertTrue(d34 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (-1) + "'", obj36.equals((-1)));
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (-1) + "'", obj43.equals((-1)));
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (short) 0);
        java.util.Collection collection14 = defaultedMap8.values();
        elitisticListPopulation6.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection14);
        int i16 = elitisticListPopulation6.getPopulationSize();
        java.lang.String str17 = elitisticListPopulation6.toString();
        double d18 = elitisticListPopulation6.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation6.getChromosomes();
        java.lang.Object obj20 = defaultedMap3.get((java.lang.Object) elitisticListPopulation6);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj20);
        java.util.Set set22 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj25 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        defaultedMap26.clear();
        java.lang.Object obj28 = defaultedMap24.get((java.lang.Object) defaultedMap26);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj33 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        defaultedMap34.clear();
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) defaultedMap34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj40 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        defaultedMap41.clear();
        boolean b44 = defaultedMap41.containsKey((java.lang.Object) 10.0d);
        boolean b46 = defaultedMap41.equals((java.lang.Object) (short) 0);
        java.util.Collection collection47 = defaultedMap41.values();
        elitisticListPopulation39.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection47);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome49 = elitisticListPopulation39.spliterator();
        java.lang.Object obj50 = defaultedMap32.get((java.lang.Object) elitisticListPopulation39);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome51 = elitisticListPopulation39.iterator();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) elitisticListPopulation39);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set56 = defaultedMap55.keySet();
        java.lang.Object obj58 = defaultedMap55.get((java.lang.Object) (byte) 10);
        boolean b60 = defaultedMap55.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) predicate61);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) predicate63);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate61, predicate63);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set68 = defaultedMap67.keySet();
        java.lang.Object obj70 = defaultedMap67.get((java.lang.Object) (byte) 10);
        boolean b72 = defaultedMap67.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) predicate73);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) predicate75);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate73, predicate75);
        java.util.Map map78 = collections.map.PredicatedMap.decorate(map53, predicate61, predicate73);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertTrue(d18 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1) + "'", obj20.equals((-1)));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (-1) + "'", obj28.equals((-1)));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (-1) + "'", obj36.equals((-1)));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(spliterator_chromosome49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (-1) + "'", obj50.equals((-1)));
        org.junit.Assert.assertNotNull(iterator_chromosome51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (-1) + "'", obj58.equals((-1)));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + (-1) + "'", obj70.equals((-1)));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (short) 0);
        java.util.Collection collection14 = defaultedMap8.values();
        elitisticListPopulation6.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection14);
        int i16 = elitisticListPopulation6.getPopulationSize();
        java.lang.String str17 = elitisticListPopulation6.toString();
        double d18 = elitisticListPopulation6.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation6.getChromosomes();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj25 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        defaultedMap26.clear();
        boolean b29 = defaultedMap26.containsKey((java.lang.Object) 10.0d);
        boolean b31 = defaultedMap26.equals((java.lang.Object) (short) 0);
        java.util.Collection collection32 = defaultedMap26.values();
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection32);
        int i34 = elitisticListPopulation24.getPopulationSize();
        java.lang.String str35 = elitisticListPopulation24.toString();
        double d36 = elitisticListPopulation24.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome37 = elitisticListPopulation24.getChromosomes();
        java.lang.Object obj38 = defaultedMap21.get((java.lang.Object) elitisticListPopulation24);
        java.lang.Object obj39 = defaultedMap1.put((java.lang.Object) list_chromosome19, (java.lang.Object) defaultedMap21);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertTrue(d18 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[]" + "'", str35.equals("[]"));
        org.junit.Assert.assertTrue(d36 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (-1) + "'", obj38.equals((-1)));
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation(list_chromosome12, 10, (double) 1L);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(list_chromosome12, (int) (byte) 100, (double) 0);
        int i19 = elitisticListPopulation18.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = elitisticListPopulation18.spliterator();
        java.lang.String str21 = elitisticListPopulation18.toString();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]" + "'", str21.equals("[]"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 0, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (short) 0);
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        boolean b12 = defaultedMap9.containsKey((java.lang.Object) 10.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        int i14 = defaultedMap9.size();
        java.lang.Object obj15 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsKey((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.equals((java.lang.Object) (short) 0);
        java.util.Collection collection22 = defaultedMap16.values();
        java.lang.Object obj23 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        defaultedMap24.clear();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) 10.0d);
        defaultedMap16.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set31 = defaultedMap30.keySet();
        java.util.Set set32 = defaultedMap30.entrySet();
        boolean b34 = defaultedMap30.containsValue((java.lang.Object) (byte) 100);
        java.lang.Object obj35 = defaultedMap24.get((java.lang.Object) (byte) 100);
        boolean b36 = defaultedMap9.containsKey((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) "");
        java.util.Set set8 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        java.lang.Object obj10 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        defaultedMap11.clear();
        boolean b14 = defaultedMap11.containsKey((java.lang.Object) 10.0d);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) b14);
        java.util.Set set16 = defaultedMap9.keySet();
        defaultedMap9.clear();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        int i12 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation2.getChromosomes();
        int i14 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation2.addChromosome(chromosome15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population20 = elitisticListPopulation19.nextGeneration();
        double d21 = elitisticListPopulation19.getElitismRate();
        int i22 = elitisticListPopulation19.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation19.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome24);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(list_chromosome24, (int) (byte) 0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(population20);
        org.junit.Assert.assertTrue(d21 == 1.0d);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertNotNull(list_chromosome24);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        defaultedMap7.clear();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) 10.0d);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        java.lang.Object obj19 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        defaultedMap20.clear();
        boolean b23 = defaultedMap20.containsKey((java.lang.Object) 10.0d);
        boolean b25 = defaultedMap20.equals((java.lang.Object) (short) 0);
        java.util.Collection collection26 = defaultedMap20.values();
        java.lang.Object obj27 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        defaultedMap28.clear();
        boolean b31 = defaultedMap28.containsKey((java.lang.Object) 10.0d);
        defaultedMap20.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set35 = defaultedMap34.keySet();
        java.util.Set set36 = defaultedMap34.entrySet();
        boolean b38 = defaultedMap34.containsValue((java.lang.Object) (byte) 100);
        java.lang.Object obj39 = defaultedMap28.get((java.lang.Object) (byte) 100);
        defaultedMap28.clear();
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        java.util.Collection collection42 = defaultedMap1.values();
        java.lang.Object obj43 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        defaultedMap44.clear();
        boolean b47 = defaultedMap44.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj49 = defaultedMap44.get((java.lang.Object) 10.0d);
        java.lang.Object obj51 = defaultedMap44.get((java.lang.Object) (byte) 10);
        java.lang.Object obj52 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        defaultedMap53.clear();
        boolean b56 = defaultedMap53.containsKey((java.lang.Object) 10.0d);
        boolean b58 = defaultedMap53.equals((java.lang.Object) (short) 0);
        java.lang.Object obj59 = defaultedMap44.get((java.lang.Object) (short) 0);
        java.lang.Object obj60 = defaultedMap1.remove((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        defaultedMap15.clear();
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) 10.0d);
        boolean b20 = defaultedMap15.equals((java.lang.Object) (short) 0);
        java.util.Collection collection21 = defaultedMap15.values();
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection21);
        int i23 = elitisticListPopulation13.getPopulationSize();
        java.lang.String str24 = elitisticListPopulation13.toString();
        double d25 = elitisticListPopulation13.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation13.getChromosomes();
        java.lang.Object obj27 = defaultedMap10.get((java.lang.Object) elitisticListPopulation13);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, obj27);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        boolean b30 = defaultedMap8.isEmpty();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
        org.junit.Assert.assertTrue(d25 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1) + "'", obj27.equals((-1)));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj9 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        boolean b13 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap10.equals((java.lang.Object) (short) 0);
        java.util.Collection collection16 = defaultedMap10.values();
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection16);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome18 = elitisticListPopulation8.spliterator();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation8.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation8.iterator();
        double d22 = elitisticListPopulation8.getElitismRate();
        java.lang.String str23 = elitisticListPopulation8.toString();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(spliterator_chromosome18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1) + "'", obj19.equals((-1)));
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
        org.junit.Assert.assertTrue(d22 == 1.0d);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]" + "'", str23.equals("[]"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj9 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        boolean b13 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap10.equals((java.lang.Object) (short) 0);
        java.util.Collection collection16 = defaultedMap10.values();
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection16);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome18 = elitisticListPopulation8.spliterator();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation8.getChromosomes();
        int i21 = elitisticListPopulation8.getPopulationSize();
        try {
            elitisticListPopulation8.setPopulationLimit((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(spliterator_chromosome18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1) + "'", obj19.equals((-1)));
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        int i12 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str13 = elitisticListPopulation2.toString();
        double d14 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation2.getChromosomes();
        int i16 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Population population17 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertTrue(d14 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertNotNull(population17);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(97, (double) 0);
        elitisticListPopulation2.setElitismRate((double) 1L);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.lang.String str5 = elitisticListPopulation2.toString();
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation2.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj13 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        defaultedMap14.clear();
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) defaultedMap14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj20 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) 10.0d);
        boolean b26 = defaultedMap21.equals((java.lang.Object) (short) 0);
        java.util.Collection collection27 = defaultedMap21.values();
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection27);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome29 = elitisticListPopulation19.spliterator();
        java.lang.Object obj30 = defaultedMap12.get((java.lang.Object) elitisticListPopulation19);
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome31);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation(list_chromosome31, 10, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]" + "'", str5.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (-1) + "'", obj16.equals((-1)));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(spliterator_chromosome29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (-1) + "'", obj30.equals((-1)));
        org.junit.Assert.assertNotNull(list_chromosome31);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) defaultedMap9);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) predicateUtils12);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) predicateUtils12);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1) + "'", obj11.equals((-1)));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) 10.0d);
        defaultedMap2.putAll((java.util.Map) defaultedMap4);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        int i13 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj16 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        defaultedMap17.clear();
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) defaultedMap17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj23 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        defaultedMap24.clear();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap24.equals((java.lang.Object) (short) 0);
        java.util.Collection collection30 = defaultedMap24.values();
        elitisticListPopulation22.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection30);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome32 = elitisticListPopulation22.spliterator();
        java.lang.Object obj33 = defaultedMap15.get((java.lang.Object) elitisticListPopulation22);
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation22.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation22.getChromosomes();
        java.lang.Object obj36 = defaultedMap2.put((java.lang.Object) defaultedMap12, (java.lang.Object) list_chromosome35);
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1) + "'", obj19.equals((-1)));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(spliterator_chromosome32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (-1) + "'", obj33.equals((-1)));
        org.junit.Assert.assertNotNull(list_chromosome34);
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) 10.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population13 = elitisticListPopulation12.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation12.iterator();
        double d15 = elitisticListPopulation12.getElitismRate();
        java.lang.String str16 = elitisticListPopulation12.toString();
        boolean b17 = defaultedMap3.containsValue((java.lang.Object) str16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate18, predicate19);
        java.util.Collection collection22 = defaultedMap3.values();
        defaultedMap3.clear();
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj28 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        defaultedMap29.clear();
        boolean b32 = defaultedMap29.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj34 = defaultedMap29.get((java.lang.Object) 10.0d);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        defaultedMap25.putAll((java.util.Map) defaultedMap29);
        defaultedMap29.clear();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) ' ');
        boolean b40 = defaultedMap3.containsKey((java.lang.Object) ' ');
        boolean b41 = defaultedMap3.isEmpty();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertTrue(d15 == 1.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) "");
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj12 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        boolean b16 = defaultedMap13.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) 10.0d);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        defaultedMap9.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj24 = defaultedMap3.get((java.lang.Object) defaultedMap22);
        java.util.Collection collection25 = defaultedMap22.values();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (short) 0);
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        boolean b12 = defaultedMap9.containsKey((java.lang.Object) 10.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set16 = defaultedMap15.keySet();
        java.lang.Object obj18 = defaultedMap15.get((java.lang.Object) (byte) 10);
        boolean b20 = defaultedMap15.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate21, predicate23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj28 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        defaultedMap29.clear();
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) defaultedMap29);
        defaultedMap27.clear();
        java.lang.Object obj33 = defaultedMap15.remove((java.lang.Object) defaultedMap27);
        defaultedMap9.putAll((java.util.Map) defaultedMap27);
        java.util.Collection collection35 = defaultedMap27.values();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1) + "'", obj18.equals((-1)));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (-1) + "'", obj31.equals((-1)));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        double d8 = elitisticListPopulation5.getElitismRate();
        java.lang.String str9 = elitisticListPopulation5.toString();
        boolean b10 = defaultedMap1.equals((java.lang.Object) str9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj13 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        defaultedMap14.clear();
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) defaultedMap14);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) "");
        boolean b19 = defaultedMap14.isEmpty();
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) b19);
        java.lang.Object obj21 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj25 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        defaultedMap26.clear();
        boolean b29 = defaultedMap26.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj31 = defaultedMap26.get((java.lang.Object) 10.0d);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        defaultedMap22.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap26.putAll((java.util.Map) defaultedMap35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set39 = defaultedMap38.keySet();
        java.lang.Object obj41 = defaultedMap38.get((java.lang.Object) (byte) 10);
        boolean b42 = defaultedMap35.containsKey((java.lang.Object) (byte) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap35);
        defaultedMap1.clear();
        java.util.Collection collection45 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (-1) + "'", obj16.equals((-1)));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (-1) + "'", obj41.equals((-1)));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(collection45);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        int i12 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str13 = elitisticListPopulation2.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome15 = elitisticListPopulation2.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation2.iterator();
        int i17 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(spliterator_chromosome15);
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation2.spliterator();
        double d14 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
        org.junit.Assert.assertTrue(d14 == 1.0d);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        defaultedMap6.clear();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Set set11 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set14 = defaultedMap13.keySet();
        java.util.Set set15 = defaultedMap13.entrySet();
        defaultedMap13.clear();
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        boolean b18 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.lang.String str5 = elitisticListPopulation2.toString();
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = arraylist_chromosome7.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]" + "'", str5.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap5.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set18 = defaultedMap17.keySet();
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) (byte) 10);
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) (byte) 10);
        defaultedMap14.clear();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1) + "'", obj20.equals((-1)));
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.util.List<math.genetics.Chromosome> list_chromosome0 = null;
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(list_chromosome0, (int) (short) 1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        int i5 = elitisticListPopulation2.getPopulationLimit();
        try {
            elitisticListPopulation2.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(i5 == 97);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj9 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        boolean b13 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap10.equals((java.lang.Object) (short) 0);
        java.util.Collection collection16 = defaultedMap10.values();
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection16);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome18 = elitisticListPopulation8.spliterator();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        java.util.Collection collection20 = defaultedMap1.values();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(spliterator_chromosome18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1) + "'", obj19.equals((-1)));
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.lang.String str5 = elitisticListPopulation2.toString();
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, 100, (double) (byte) 1);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 10, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]" + "'", str5.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) defaultedMap5);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) "");
        java.lang.Object obj10 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        defaultedMap15.clear();
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) 10.0d);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        defaultedMap11.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap15.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj26 = defaultedMap5.get((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set29 = defaultedMap28.keySet();
        java.lang.Object obj31 = defaultedMap28.get((java.lang.Object) (byte) 10);
        boolean b33 = defaultedMap28.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate34, predicate36);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) defaultedMap28);
        defaultedMap1.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj43 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj47 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        defaultedMap48.clear();
        boolean b51 = defaultedMap48.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj53 = defaultedMap48.get((java.lang.Object) 10.0d);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        defaultedMap44.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj58 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        defaultedMap59.clear();
        boolean b62 = defaultedMap59.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj64 = defaultedMap59.get((java.lang.Object) 10.0d);
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj66 = defaultedMap48.remove((java.lang.Object) defaultedMap59);
        java.lang.Object obj67 = defaultedMap1.put((java.lang.Object) (-1), obj66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        math.genetics.ElitisticListPopulation elitisticListPopulation72 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj73 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        defaultedMap74.clear();
        boolean b77 = defaultedMap74.containsKey((java.lang.Object) 10.0d);
        boolean b79 = defaultedMap74.equals((java.lang.Object) (short) 0);
        java.util.Collection collection80 = defaultedMap74.values();
        elitisticListPopulation72.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection80);
        int i82 = elitisticListPopulation72.getPopulationSize();
        java.lang.String str83 = elitisticListPopulation72.toString();
        double d84 = elitisticListPopulation72.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome85 = elitisticListPopulation72.getChromosomes();
        java.lang.Object obj86 = defaultedMap69.get((java.lang.Object) elitisticListPopulation72);
        defaultedMap1.putAll((java.util.Map) defaultedMap69);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1) + "'", obj7.equals((-1)));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (-1) + "'", obj31.equals((-1)));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "[]" + "'", str83.equals("[]"));
        org.junit.Assert.assertTrue(d84 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome85);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + (-1) + "'", obj86.equals((-1)));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        defaultedMap6.clear();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj11 = defaultedMap6.get((java.lang.Object) 10.0d);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj13 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj17 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        boolean b21 = defaultedMap18.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) 10.0d);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        defaultedMap14.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap18.putAll((java.util.Map) defaultedMap27);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap27);
        boolean b30 = defaultedMap1.equals((java.lang.Object) map29);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (short) 0);
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        boolean b12 = defaultedMap9.containsKey((java.lang.Object) 10.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj15 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) defaultedMap16);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) "");
        java.util.Set set21 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap16);
        java.lang.Object obj23 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        defaultedMap24.clear();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) 10.0d);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) b27);
        java.util.Set set29 = defaultedMap22.keySet();
        java.lang.Object obj30 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        defaultedMap31.clear();
        boolean b34 = defaultedMap31.containsKey((java.lang.Object) 10.0d);
        boolean b36 = defaultedMap31.equals((java.lang.Object) (short) 0);
        java.util.Collection collection37 = defaultedMap31.values();
        java.util.Set set38 = defaultedMap31.entrySet();
        java.lang.Object obj39 = defaultedMap1.put((java.lang.Object) defaultedMap22, (java.lang.Object) set38);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1) + "'", obj18.equals((-1)));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        java.lang.String str12 = elitisticListPopulation9.toString();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, 100, (double) (byte) 1);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[null]" + "'", str12.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) 10.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        int i12 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj15 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) defaultedMap16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj22 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        defaultedMap23.clear();
        boolean b26 = defaultedMap23.containsKey((java.lang.Object) 10.0d);
        boolean b28 = defaultedMap23.equals((java.lang.Object) (short) 0);
        java.util.Collection collection29 = defaultedMap23.values();
        elitisticListPopulation21.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection29);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome31 = elitisticListPopulation21.spliterator();
        java.lang.Object obj32 = defaultedMap14.get((java.lang.Object) elitisticListPopulation21);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation21.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation21.getChromosomes();
        java.lang.Object obj35 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) list_chromosome34);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation(list_chromosome34, (int) (byte) 100, (double) (byte) 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1) + "'", obj18.equals((-1)));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(spliterator_chromosome31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (-1) + "'", obj32.equals((-1)));
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertNotNull(list_chromosome34);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        int i12 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str13 = elitisticListPopulation2.toString();
        math.genetics.Population population14 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertNotNull(population14);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        defaultedMap7.clear();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.equals((java.lang.Object) (short) 0);
        java.util.Collection collection13 = defaultedMap7.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection13);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        defaultedMap19.clear();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) 10.0d);
        boolean b24 = defaultedMap19.equals((java.lang.Object) (short) 0);
        java.util.Collection collection25 = defaultedMap19.values();
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection25);
        int i27 = elitisticListPopulation17.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation17.getChromosomes();
        int i29 = elitisticListPopulation17.getPopulationSize();
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation17.addChromosome(chromosome30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj34 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        defaultedMap35.clear();
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) defaultedMap35);
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj42 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        defaultedMap43.clear();
        boolean b46 = defaultedMap43.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj48 = defaultedMap43.get((java.lang.Object) 10.0d);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population53 = elitisticListPopulation52.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation52.iterator();
        double d55 = elitisticListPopulation52.getElitismRate();
        java.lang.String str56 = elitisticListPopulation52.toString();
        boolean b57 = defaultedMap43.containsValue((java.lang.Object) str56);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj61 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        defaultedMap62.clear();
        boolean b65 = defaultedMap62.containsKey((java.lang.Object) 10.0d);
        boolean b67 = defaultedMap62.equals((java.lang.Object) (short) 0);
        java.util.Collection collection68 = defaultedMap62.values();
        elitisticListPopulation60.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection68);
        java.util.List<math.genetics.Chromosome> list_chromosome70 = elitisticListPopulation60.getChromosomes();
        java.lang.Object obj71 = defaultedMap35.put((java.lang.Object) defaultedMap43, (java.lang.Object) list_chromosome70);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome70);
        elitisticListPopulation2.setChromosomes(list_chromosome70);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation76 = new math.genetics.ElitisticListPopulation(list_chromosome70, (int) (short) -1, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(i27 == 97);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (-1) + "'", obj37.equals((-1)));
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(population53);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertTrue(d55 == 1.0d);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "[]" + "'", str56.equals("[]"));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNotNull(list_chromosome70);
        org.junit.Assert.assertNull(obj71);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        defaultedMap15.clear();
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj21 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        defaultedMap22.clear();
        boolean b25 = defaultedMap22.containsKey((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap22.equals((java.lang.Object) (short) 0);
        java.util.Collection collection28 = defaultedMap22.values();
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection28);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome30 = elitisticListPopulation20.spliterator();
        java.lang.Object obj31 = defaultedMap13.get((java.lang.Object) elitisticListPopulation20);
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation20.getChromosomes();
        java.lang.Object obj33 = defaultedMap7.get((java.lang.Object) list_chromosome32);
        java.util.Collection collection34 = defaultedMap7.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection34);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation2.addChromosome(chromosome36);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj41 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        defaultedMap42.clear();
        boolean b45 = defaultedMap42.containsKey((java.lang.Object) 10.0d);
        boolean b47 = defaultedMap42.equals((java.lang.Object) (short) 0);
        java.util.Collection collection48 = defaultedMap42.values();
        elitisticListPopulation40.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection48);
        java.util.List<math.genetics.Chromosome> list_chromosome50 = elitisticListPopulation40.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome50);
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1) + "'", obj11.equals((-1)));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1) + "'", obj17.equals((-1)));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(spliterator_chromosome30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (-1) + "'", obj31.equals((-1)));
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (-1) + "'", obj33.equals((-1)));
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(list_chromosome50);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj11 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        defaultedMap12.clear();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) 10.0d);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj19 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj23 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        defaultedMap24.clear();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj29 = defaultedMap24.get((java.lang.Object) 10.0d);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        defaultedMap20.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap24.putAll((java.util.Map) defaultedMap33);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap33);
        java.lang.Object obj36 = defaultedMap1.get((java.lang.Object) map35);
        java.lang.Object obj37 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        defaultedMap38.clear();
        boolean b41 = defaultedMap38.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj42 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        defaultedMap43.clear();
        boolean b46 = defaultedMap43.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj47 = defaultedMap38.get((java.lang.Object) 10.0d);
        java.util.Set set48 = defaultedMap38.entrySet();
        java.lang.Object obj49 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj53 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        defaultedMap54.clear();
        boolean b57 = defaultedMap54.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj59 = defaultedMap54.get((java.lang.Object) 10.0d);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        defaultedMap50.putAll((java.util.Map) defaultedMap54);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap54.putAll((java.util.Map) defaultedMap63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set67 = defaultedMap66.keySet();
        java.lang.Object obj69 = defaultedMap66.get((java.lang.Object) (byte) 10);
        boolean b70 = defaultedMap63.containsKey((java.lang.Object) (byte) 10);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) b70);
        java.lang.Object obj72 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap(obj72);
        defaultedMap73.clear();
        boolean b76 = defaultedMap73.containsKey((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap73.putAll((java.util.Map) defaultedMap78);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set82 = defaultedMap81.keySet();
        java.util.Set set83 = defaultedMap81.entrySet();
        boolean b84 = defaultedMap73.containsKey((java.lang.Object) set83);
        boolean b85 = defaultedMap38.equals((java.lang.Object) set83);
        boolean b86 = defaultedMap1.containsKey((java.lang.Object) defaultedMap38);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1) + "'", obj4.equals((-1)));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (-1) + "'", obj36.equals((-1)));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + (-1) + "'", obj69.equals((-1)));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b86 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        math.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (short) 0);
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        boolean b12 = defaultedMap9.containsKey((java.lang.Object) 10.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set16 = defaultedMap15.keySet();
        java.util.Set set17 = defaultedMap15.entrySet();
        boolean b19 = defaultedMap15.containsValue((java.lang.Object) (byte) 100);
        java.lang.Object obj20 = defaultedMap9.get((java.lang.Object) (byte) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsKey((java.lang.Object) 10.0d);
        boolean b30 = defaultedMap25.equals((java.lang.Object) (short) 0);
        java.util.Collection collection31 = defaultedMap25.values();
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection31);
        int i33 = elitisticListPopulation23.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation23.getChromosomes();
        boolean b35 = defaultedMap9.containsValue((java.lang.Object) list_chromosome34);
        java.lang.Object obj36 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj40 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        defaultedMap41.clear();
        boolean b44 = defaultedMap41.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj46 = defaultedMap41.get((java.lang.Object) 10.0d);
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        defaultedMap37.putAll((java.util.Map) defaultedMap41);
        java.lang.Object obj49 = defaultedMap9.get((java.lang.Object) defaultedMap37);
        java.util.Set set50 = defaultedMap9.entrySet();
        java.util.Set set51 = defaultedMap9.keySet();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(i33 == 97);
        org.junit.Assert.assertNotNull(list_chromosome34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        defaultedMap15.clear();
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj21 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        defaultedMap22.clear();
        boolean b25 = defaultedMap22.containsKey((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap22.equals((java.lang.Object) (short) 0);
        java.util.Collection collection28 = defaultedMap22.values();
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection28);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome30 = elitisticListPopulation20.spliterator();
        java.lang.Object obj31 = defaultedMap13.get((java.lang.Object) elitisticListPopulation20);
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation20.getChromosomes();
        java.lang.Object obj33 = defaultedMap7.get((java.lang.Object) list_chromosome32);
        java.util.Collection collection34 = defaultedMap7.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection34);
        int i36 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1) + "'", obj11.equals((-1)));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1) + "'", obj17.equals((-1)));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(spliterator_chromosome30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (-1) + "'", obj31.equals((-1)));
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (-1) + "'", obj33.equals((-1)));
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(i36 == 97);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        defaultedMap7.clear();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.equals((java.lang.Object) (short) 0);
        java.util.Collection collection13 = defaultedMap7.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection13);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        defaultedMap19.clear();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) 10.0d);
        boolean b24 = defaultedMap19.equals((java.lang.Object) (short) 0);
        java.util.Collection collection25 = defaultedMap19.values();
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection25);
        int i27 = elitisticListPopulation17.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation17.getChromosomes();
        int i29 = elitisticListPopulation17.getPopulationSize();
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation17.addChromosome(chromosome30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj34 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        defaultedMap35.clear();
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) defaultedMap35);
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj42 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        defaultedMap43.clear();
        boolean b46 = defaultedMap43.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj48 = defaultedMap43.get((java.lang.Object) 10.0d);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population53 = elitisticListPopulation52.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation52.iterator();
        double d55 = elitisticListPopulation52.getElitismRate();
        java.lang.String str56 = elitisticListPopulation52.toString();
        boolean b57 = defaultedMap43.containsValue((java.lang.Object) str56);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj61 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        defaultedMap62.clear();
        boolean b65 = defaultedMap62.containsKey((java.lang.Object) 10.0d);
        boolean b67 = defaultedMap62.equals((java.lang.Object) (short) 0);
        java.util.Collection collection68 = defaultedMap62.values();
        elitisticListPopulation60.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection68);
        java.util.List<math.genetics.Chromosome> list_chromosome70 = elitisticListPopulation60.getChromosomes();
        java.lang.Object obj71 = defaultedMap35.put((java.lang.Object) defaultedMap43, (java.lang.Object) list_chromosome70);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome70);
        elitisticListPopulation2.setChromosomes(list_chromosome70);
        double d74 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(i27 == 97);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (-1) + "'", obj37.equals((-1)));
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(population53);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertTrue(d55 == 1.0d);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "[]" + "'", str56.equals("[]"));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNotNull(list_chromosome70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(d74 == 1.0d);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj10 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        defaultedMap11.clear();
        boolean b14 = defaultedMap11.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) 10.0d);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population21 = elitisticListPopulation20.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation20.iterator();
        double d23 = elitisticListPopulation20.getElitismRate();
        java.lang.String str24 = elitisticListPopulation20.toString();
        boolean b25 = defaultedMap11.containsValue((java.lang.Object) str24);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj29 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        defaultedMap30.clear();
        boolean b33 = defaultedMap30.containsKey((java.lang.Object) 10.0d);
        boolean b35 = defaultedMap30.equals((java.lang.Object) (short) 0);
        java.util.Collection collection36 = defaultedMap30.values();
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection36);
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation28.getChromosomes();
        java.lang.Object obj39 = defaultedMap3.put((java.lang.Object) defaultedMap11, (java.lang.Object) list_chromosome38);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome40 = list_chromosome38.spliterator();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(population21);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertTrue(d23 == 1.0d);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(spliterator_chromosome40);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate9);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1) + "'", obj4.equals((-1)));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.equals((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap4.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        int i12 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population13 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(population13);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) defaultedMap9);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) "");
        boolean b14 = defaultedMap9.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation17.addChromosome(chromosome18);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) elitisticListPopulation17);
        boolean b21 = defaultedMap3.equals((java.lang.Object) elitisticListPopulation17);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1) + "'", obj11.equals((-1)));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj9 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        boolean b13 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap10.equals((java.lang.Object) (short) 0);
        java.util.Collection collection16 = defaultedMap10.values();
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection16);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome18 = elitisticListPopulation8.spliterator();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation8.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsKey((java.lang.Object) 10.0d);
        boolean b30 = defaultedMap25.equals((java.lang.Object) (short) 0);
        java.util.Collection collection31 = defaultedMap25.values();
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection31);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation8.setChromosomes(list_chromosome33);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1) + "'", obj5.equals((-1)));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(spliterator_chromosome18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1) + "'", obj19.equals((-1)));
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(list_chromosome33);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) defaultedMap5);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) "");
        java.lang.Object obj10 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        defaultedMap15.clear();
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) 10.0d);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        defaultedMap11.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap15.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj26 = defaultedMap5.get((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set29 = defaultedMap28.keySet();
        java.lang.Object obj31 = defaultedMap28.get((java.lang.Object) (byte) 10);
        boolean b33 = defaultedMap28.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate34, predicate36);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) defaultedMap28);
        defaultedMap1.putAll((java.util.Map) defaultedMap28);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1) + "'", obj7.equals((-1)));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (-1) + "'", obj31.equals((-1)));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        defaultedMap6.clear();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Set set11 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj13 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        defaultedMap14.clear();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        boolean b19 = defaultedMap14.equals((java.lang.Object) (short) 0);
        java.util.Collection collection20 = defaultedMap14.values();
        java.lang.Object obj21 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        defaultedMap22.clear();
        boolean b25 = defaultedMap22.containsKey((java.lang.Object) 10.0d);
        defaultedMap14.putAll((java.util.Map) defaultedMap22);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj28 = defaultedMap22.get((java.lang.Object) predicate27);
        java.lang.Object obj29 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        defaultedMap30.clear();
        boolean b33 = defaultedMap30.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj34 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        defaultedMap35.clear();
        boolean b38 = defaultedMap35.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) 10.0d);
        java.util.Set set40 = defaultedMap30.entrySet();
        java.lang.Object obj41 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        defaultedMap42.clear();
        boolean b45 = defaultedMap42.containsKey((java.lang.Object) 10.0d);
        boolean b47 = defaultedMap42.equals((java.lang.Object) (short) 0);
        java.util.Collection collection48 = defaultedMap42.values();
        java.lang.Object obj49 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        defaultedMap50.clear();
        boolean b53 = defaultedMap50.containsKey((java.lang.Object) 10.0d);
        defaultedMap42.putAll((java.util.Map) defaultedMap50);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj56 = defaultedMap50.get((java.lang.Object) predicate55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj59 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        defaultedMap60.clear();
        boolean b63 = defaultedMap60.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj65 = defaultedMap60.get((java.lang.Object) 10.0d);
        defaultedMap58.putAll((java.util.Map) defaultedMap60);
        math.genetics.ElitisticListPopulation elitisticListPopulation69 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 1.0f);
        math.genetics.Population population70 = elitisticListPopulation69.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome71 = elitisticListPopulation69.iterator();
        double d72 = elitisticListPopulation69.getElitismRate();
        java.lang.String str73 = elitisticListPopulation69.toString();
        boolean b74 = defaultedMap60.containsValue((java.lang.Object) str73);
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) predicate76);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate75, predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate55, predicate75);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate27, predicate75);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNotNull(population70);
        org.junit.Assert.assertNotNull(iterator_chromosome71);
        org.junit.Assert.assertTrue(d72 == 1.0d);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "[]" + "'", str73.equals("[]"));
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map80);
    }
}

