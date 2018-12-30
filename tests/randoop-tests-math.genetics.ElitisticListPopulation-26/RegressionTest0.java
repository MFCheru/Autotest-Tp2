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
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 100);
        int i7 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        boolean b6 = defaultedMap1.equals((java.lang.Object) predicate5);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, 0.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        java.util.Set set14 = defaultedMap6.entrySet();
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) -1, (double) 1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '4', (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (-1L));
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set12 = defaultedMap11.keySet();
        boolean b14 = defaultedMap11.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) (-1.0f));
        defaultedMap11.putAll((java.util.Map) defaultedMap16);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate21, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set28 = defaultedMap27.keySet();
        boolean b30 = defaultedMap27.containsValue((java.lang.Object) (-1.0f));
        boolean b31 = defaultedMap27.isEmpty();
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) defaultedMap27);
        collections.Factory factory33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0d + "'", obj6.equals(1.0d));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        java.util.Map map15 = collections.map.DefaultedMap.decorate(map13, (java.lang.Object) 1.0f);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate(map13, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set13 = defaultedMap12.keySet();
        boolean b15 = defaultedMap12.containsValue((java.lang.Object) (-1.0f));
        boolean b16 = defaultedMap12.isEmpty();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) b16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set20 = defaultedMap19.keySet();
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) defaultedMap19);
        int i22 = defaultedMap1.size();
        collections.Transformer transformer23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1.0d + "'", obj17.equals(1.0d));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) true);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 100);
        java.util.Collection collection7 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 0, (double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.Predicate predicate0 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) 'a');
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 'a');
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0d + "'", obj9.equals(1.0d));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 0, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        java.util.Map map15 = collections.map.DefaultedMap.decorate(map13, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 'a');
        java.util.Set set20 = defaultedMap17.keySet();
        java.util.Map map21 = collections.map.DefaultedMap.decorate(map15, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set24 = defaultedMap23.keySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set29 = defaultedMap28.keySet();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        boolean b31 = defaultedMap28.containsKey((java.lang.Object) predicate30);
        boolean b33 = defaultedMap28.containsValue((java.lang.Object) 100);
        java.lang.Object obj34 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set37 = defaultedMap36.keySet();
        boolean b39 = defaultedMap36.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set42 = defaultedMap41.keySet();
        boolean b44 = defaultedMap41.containsValue((java.lang.Object) (-1.0f));
        defaultedMap36.putAll((java.util.Map) defaultedMap41);
        java.lang.Object obj46 = defaultedMap28.put(obj34, (java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set49 = defaultedMap48.keySet();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        boolean b51 = defaultedMap48.containsKey((java.lang.Object) predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        boolean b53 = defaultedMap48.equals((java.lang.Object) predicate52);
        boolean b54 = defaultedMap36.equals((java.lang.Object) b53);
        java.util.Set set55 = defaultedMap36.keySet();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) set55);
        java.util.Map map57 = collections.map.DefaultedMap.decorate(map15, (java.lang.Object) defaultedMap23);
        collections.Factory factory58 = null;
        try {
            java.util.Map map59 = collections.map.DefaultedMap.decorate(map57, factory58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) predicate8);
        boolean b11 = defaultedMap6.containsValue((java.lang.Object) 100);
        java.lang.Object obj12 = new java.lang.Object();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj14 = defaultedMap6.put(obj12, (java.lang.Object) predicate13);
        boolean b15 = defaultedMap1.equals((java.lang.Object) predicate13);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) true);
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsValue(obj5);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0.0d, (java.lang.Object) '#');
        java.lang.String str10 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{0.0=#}" + "'", str10.equals("{0.0=#}"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        boolean b6 = defaultedMap1.equals((java.lang.Object) predicate5);
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) '#');
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        boolean b6 = defaultedMap1.equals((java.lang.Object) predicate5);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation5.addChromosome(chromosome10);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 'a');
        java.util.Set set11 = defaultedMap8.keySet();
        java.util.Collection collection12 = defaultedMap8.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection12);
        try {
            math.genetics.Chromosome chromosome14 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        java.util.Map map15 = collections.map.DefaultedMap.decorate(map13, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 'a');
        java.util.Set set20 = defaultedMap17.keySet();
        java.util.Map map21 = collections.map.DefaultedMap.decorate(map15, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set24 = defaultedMap23.keySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set29 = defaultedMap28.keySet();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        boolean b31 = defaultedMap28.containsKey((java.lang.Object) predicate30);
        boolean b33 = defaultedMap28.containsValue((java.lang.Object) 100);
        java.lang.Object obj34 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set37 = defaultedMap36.keySet();
        boolean b39 = defaultedMap36.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set42 = defaultedMap41.keySet();
        boolean b44 = defaultedMap41.containsValue((java.lang.Object) (-1.0f));
        defaultedMap36.putAll((java.util.Map) defaultedMap41);
        java.lang.Object obj46 = defaultedMap28.put(obj34, (java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set49 = defaultedMap48.keySet();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        boolean b51 = defaultedMap48.containsKey((java.lang.Object) predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        boolean b53 = defaultedMap48.equals((java.lang.Object) predicate52);
        boolean b54 = defaultedMap36.equals((java.lang.Object) b53);
        java.util.Set set55 = defaultedMap36.keySet();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) set55);
        java.util.Map map57 = collections.map.DefaultedMap.decorate(map15, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set60 = defaultedMap59.keySet();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set65 = defaultedMap64.keySet();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        boolean b67 = defaultedMap64.containsKey((java.lang.Object) predicate66);
        boolean b69 = defaultedMap64.containsValue((java.lang.Object) 100);
        java.lang.Object obj70 = new java.lang.Object();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj72 = defaultedMap64.put(obj70, (java.lang.Object) predicate71);
        boolean b73 = defaultedMap59.equals((java.lang.Object) predicate71);
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate(map57, predicate71, predicate74);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 100);
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set15 = defaultedMap14.keySet();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (-1.0f));
        defaultedMap9.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj19 = defaultedMap1.put(obj7, (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        boolean b26 = defaultedMap21.equals((java.lang.Object) predicate25);
        boolean b27 = defaultedMap9.equals((java.lang.Object) b26);
        java.util.Set set28 = defaultedMap9.keySet();
        collections.Transformer transformer29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 100);
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set15 = defaultedMap14.keySet();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (-1.0f));
        defaultedMap9.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj19 = defaultedMap1.put(obj7, (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        boolean b26 = defaultedMap21.equals((java.lang.Object) predicate25);
        boolean b27 = defaultedMap9.equals((java.lang.Object) b26);
        java.util.Set set28 = defaultedMap9.keySet();
        java.util.Set set29 = defaultedMap9.keySet();
        java.util.Collection collection30 = defaultedMap9.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b8 = defaultedMap5.containsValue((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap5.keySet();
        int i10 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set13 = defaultedMap12.keySet();
        boolean b15 = defaultedMap12.containsValue((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) (-1L));
        boolean b19 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set23 = defaultedMap22.keySet();
        boolean b25 = defaultedMap22.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set28 = defaultedMap27.keySet();
        boolean b30 = defaultedMap27.containsValue((java.lang.Object) (-1.0f));
        defaultedMap22.putAll((java.util.Map) defaultedMap27);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate32, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate32, predicate35);
        boolean b37 = defaultedMap5.containsKey((java.lang.Object) map36);
        java.lang.Object obj38 = defaultedMap3.get((java.lang.Object) map36);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1.0d + "'", obj17.equals(1.0d));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 0, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        java.util.Set set5 = defaultedMap1.keySet();
        int i6 = defaultedMap1.size();
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        boolean b6 = defaultedMap1.equals((java.lang.Object) predicate5);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap1.remove(obj7);
        boolean b9 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation5.getPopulationSize();
        double d11 = elitisticListPopulation5.getElitismRate();
        try {
            math.genetics.Chromosome chromosome12 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(d11 == 0.0d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (-1L));
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set12 = defaultedMap11.keySet();
        boolean b14 = defaultedMap11.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) (-1.0f));
        defaultedMap11.putAll((java.util.Map) defaultedMap16);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate21, predicate24);
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) "");
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0d + "'", obj6.equals(1.0d));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1.0d + "'", obj27.equals(1.0d));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation5);
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b8 = defaultedMap5.containsValue((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap5.keySet();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) set9);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.String str7 = defaultedMap6.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        try {
            elitisticListPopulation5.setElitismRate((double) '#');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation5);
        elitisticListPopulation5.setElitismRate((double) 1);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        java.util.Map map15 = collections.map.DefaultedMap.decorate(map13, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 'a');
        java.util.Set set20 = defaultedMap17.keySet();
        java.util.Map map21 = collections.map.DefaultedMap.decorate(map15, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set24 = defaultedMap23.keySet();
        boolean b25 = defaultedMap23.isEmpty();
        defaultedMap23.clear();
        java.util.Set set27 = defaultedMap23.entrySet();
        java.lang.Object obj28 = defaultedMap17.get((java.lang.Object) set27);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 10 + "'", obj28.equals((short) 10));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) predicate8);
        boolean b11 = defaultedMap6.containsValue((java.lang.Object) 100);
        java.lang.Object obj12 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set15 = defaultedMap14.keySet();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set20 = defaultedMap19.keySet();
        boolean b22 = defaultedMap19.containsValue((java.lang.Object) (-1.0f));
        defaultedMap14.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj24 = defaultedMap6.put(obj12, (java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set27 = defaultedMap26.keySet();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        boolean b29 = defaultedMap26.containsKey((java.lang.Object) predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        boolean b31 = defaultedMap26.equals((java.lang.Object) predicate30);
        boolean b32 = defaultedMap14.equals((java.lang.Object) b31);
        java.util.Set set33 = defaultedMap14.keySet();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 'a');
        java.util.Set set39 = defaultedMap36.keySet();
        java.lang.Object obj42 = defaultedMap36.put((java.lang.Object) 10, (java.lang.Object) (byte) 0);
        java.util.Set set43 = defaultedMap36.entrySet();
        boolean b44 = defaultedMap1.equals((java.lang.Object) set43);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (short) 100);
        try {
            elitisticListPopulation5.setElitismRate((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        double d11 = elitisticListPopulation5.getElitismRate();
        int i12 = elitisticListPopulation5.getPopulationLimit();
        double d13 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(d13 == 0.0d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation5.getPopulationSize();
        double d11 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        double d24 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, 100, (double) 0L);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) (short) 1, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.equals((java.lang.Object) 1.0f);
        java.lang.String str5 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation5.getPopulationSize();
        double d11 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        double d24 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, 100, (double) 0L);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome38 = elitisticListPopulation37.iterator();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) 'a');
        java.util.Set set43 = defaultedMap40.keySet();
        java.util.Collection collection44 = defaultedMap40.values();
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection44);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection44);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b8 = defaultedMap5.containsValue((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap5.keySet();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) set9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        defaultedMap3.putAll((java.util.Map) defaultedMap12);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation5.getPopulationSize();
        double d11 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation5.setPopulationLimit((int) (short) 100);
        math.genetics.Population population26 = elitisticListPopulation5.nextGeneration();
        int i27 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(population26);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        try {
            math.genetics.Chromosome chromosome11 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        boolean b6 = defaultedMap1.equals((java.lang.Object) predicate5);
        int i7 = defaultedMap1.size();
        java.util.Set set8 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        try {
            elitisticListPopulation5.setElitismRate((double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set8 = defaultedMap7.keySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.Chromosome chromosome4 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        try {
            elitisticListPopulation5.setElitismRate((double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        double d11 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setElitismRate((double) 1.0f);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, 100, (double) 0L);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection2 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        boolean b12 = defaultedMap7.equals((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set15 = defaultedMap14.keySet();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set20 = defaultedMap19.keySet();
        boolean b22 = defaultedMap19.containsValue((java.lang.Object) (-1.0f));
        defaultedMap14.putAll((java.util.Map) defaultedMap19);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set30 = defaultedMap29.keySet();
        boolean b31 = defaultedMap29.isEmpty();
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        boolean b33 = defaultedMap29.containsValue((java.lang.Object) predicateUtils32);
        defaultedMap1.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set37 = defaultedMap36.keySet();
        boolean b39 = defaultedMap36.containsValue((java.lang.Object) (-1.0f));
        java.lang.Object obj41 = defaultedMap36.get((java.lang.Object) (-1L));
        boolean b43 = defaultedMap36.containsKey((java.lang.Object) 10.0d);
        defaultedMap36.clear();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set47 = defaultedMap46.keySet();
        boolean b49 = defaultedMap46.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set52 = defaultedMap51.keySet();
        boolean b54 = defaultedMap51.containsValue((java.lang.Object) (-1.0f));
        defaultedMap46.putAll((java.util.Map) defaultedMap51);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate56, predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate56, predicate59);
        int i61 = defaultedMap36.size();
        boolean b62 = defaultedMap29.equals((java.lang.Object) i61);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1.0d + "'", obj41.equals(1.0d));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue(b62 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        double d11 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation5.iterator();
        try {
            elitisticListPopulation5.setElitismRate(10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set13 = defaultedMap12.keySet();
        boolean b15 = defaultedMap12.containsValue((java.lang.Object) (-1.0f));
        boolean b16 = defaultedMap12.isEmpty();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) b16);
        java.util.Collection collection18 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1.0d + "'", obj17.equals(1.0d));
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        java.util.Set set14 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap6.containsKey((java.lang.Object) defaultedMap16);
        java.lang.String str19 = defaultedMap16.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 0, 10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        boolean b12 = defaultedMap7.equals((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set15 = defaultedMap14.keySet();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set20 = defaultedMap19.keySet();
        boolean b22 = defaultedMap19.containsValue((java.lang.Object) (-1.0f));
        defaultedMap14.putAll((java.util.Map) defaultedMap19);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set30 = defaultedMap29.keySet();
        boolean b31 = defaultedMap29.isEmpty();
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        boolean b33 = defaultedMap29.containsValue((java.lang.Object) predicateUtils32);
        defaultedMap1.putAll((java.util.Map) defaultedMap29);
        collections.Transformer transformer35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        java.util.Set set5 = defaultedMap1.keySet();
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0d + "'", obj8.equals(1.0d));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        java.util.Set set5 = defaultedMap1.keySet();
        int i6 = defaultedMap1.size();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) (-1L));
        boolean b16 = defaultedMap9.containsKey((java.lang.Object) 10.0d);
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set20 = defaultedMap19.keySet();
        boolean b22 = defaultedMap19.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set25 = defaultedMap24.keySet();
        boolean b27 = defaultedMap24.containsValue((java.lang.Object) (-1.0f));
        defaultedMap19.putAll((java.util.Map) defaultedMap24);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate29, predicate32);
        defaultedMap1.putAll(map33);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1.0d + "'", obj14.equals(1.0d));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = arraylist_chromosome11.spliterator();
        java.lang.Object obj15 = defaultedMap3.remove((java.lang.Object) spliterator_chromosome14);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (-1L));
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0d + "'", obj6.equals(1.0d));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 100);
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set15 = defaultedMap14.keySet();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (-1.0f));
        defaultedMap9.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj19 = defaultedMap1.put(obj7, (java.lang.Object) defaultedMap9);
        java.util.Collection collection20 = defaultedMap9.values();
        java.util.Collection collection21 = defaultedMap9.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation5.getPopulationSize();
        double d11 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        double d24 = elitisticListPopulation5.getElitismRate();
        double d25 = elitisticListPopulation5.getElitismRate();
        try {
            math.genetics.Chromosome chromosome26 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(d25 == 0.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 100);
        java.lang.Object obj7 = new java.lang.Object();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj9 = defaultedMap1.put(obj7, (java.lang.Object) predicate8);
        java.util.Set set10 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        java.util.Set set5 = defaultedMap1.keySet();
        int i6 = defaultedMap1.size();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation12.iterator();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        double d18 = elitisticListPopulation12.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation12.iterator();
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation12);
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        java.util.Set set5 = defaultedMap1.keySet();
        int i6 = defaultedMap1.size();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation12.iterator();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        double d18 = elitisticListPopulation12.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation12.iterator();
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation12);
        java.util.Set set21 = defaultedMap1.keySet();
        boolean b23 = defaultedMap1.equals((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        int i2 = defaultedMap1.size();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10);
        math.genetics.Population population13 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation8);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22);
        int i25 = elitisticListPopulation20.getPopulationSize();
        double d26 = elitisticListPopulation20.getElitismRate();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome33 = elitisticListPopulation32.iterator();
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        elitisticListPopulation32.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35);
        elitisticListPopulation20.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35);
        double d39 = elitisticListPopulation20.getElitismRate();
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome41, 100, (double) 0L);
        elitisticListPopulation20.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome41);
        boolean b47 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation20);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(d26 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome33);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(d39 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i7 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        boolean b12 = defaultedMap9.containsKey((java.lang.Object) predicate11);
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) 100);
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) (-1));
        defaultedMap9.clear();
        boolean b18 = defaultedMap6.containsValue((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set21 = defaultedMap20.keySet();
        boolean b23 = defaultedMap20.containsValue((java.lang.Object) (-1.0f));
        java.util.Set set24 = defaultedMap20.keySet();
        java.lang.Object obj25 = defaultedMap6.remove((java.lang.Object) set24);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 100);
        java.lang.Object obj7 = new java.lang.Object();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj9 = defaultedMap1.put(obj7, (java.lang.Object) predicate8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) '#', (double) (byte) 0);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        double d11 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        try {
            math.genetics.Chromosome chromosome13 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.lang.String str2 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        boolean b13 = defaultedMap10.containsKey((java.lang.Object) predicate12);
        java.lang.Object obj14 = defaultedMap7.get((java.lang.Object) b13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) b13);
        defaultedMap1.clear();
        boolean b17 = defaultedMap1.isEmpty();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set21 = defaultedMap20.keySet();
        boolean b23 = defaultedMap20.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set26 = defaultedMap25.keySet();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) (-1.0f));
        defaultedMap20.putAll((java.util.Map) defaultedMap25);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate30, predicate31);
        boolean b33 = defaultedMap1.containsValue((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set36 = defaultedMap35.keySet();
        boolean b38 = defaultedMap35.containsValue((java.lang.Object) (-1.0f));
        boolean b39 = defaultedMap35.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set42 = defaultedMap41.keySet();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        boolean b44 = defaultedMap41.containsKey((java.lang.Object) predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        boolean b46 = defaultedMap41.equals((java.lang.Object) predicate45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set49 = defaultedMap48.keySet();
        boolean b51 = defaultedMap48.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set54 = defaultedMap53.keySet();
        boolean b56 = defaultedMap53.containsValue((java.lang.Object) (-1.0f));
        defaultedMap48.putAll((java.util.Map) defaultedMap53);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate58, predicate59);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate45, predicate59);
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate45, predicate62);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1.0d + "'", obj14.equals(1.0d));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1.0d + "'", obj15.equals(1.0d));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        boolean b6 = defaultedMap1.equals((java.lang.Object) predicate5);
        int i7 = defaultedMap1.size();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation13.iterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        java.util.Set set19 = defaultedMap16.keySet();
        java.util.Collection collection20 = defaultedMap16.values();
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection20);
        java.lang.Object obj22 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation13);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome23 = elitisticListPopulation13.iterator();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(iterator_chromosome23);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (-1L));
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set12 = defaultedMap11.keySet();
        boolean b14 = defaultedMap11.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) (-1.0f));
        defaultedMap11.putAll((java.util.Map) defaultedMap16);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate21, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set28 = defaultedMap27.keySet();
        boolean b30 = defaultedMap27.containsValue((java.lang.Object) (-1.0f));
        boolean b31 = defaultedMap27.isEmpty();
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) defaultedMap27);
        collections.Transformer transformer33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0d + "'", obj6.equals(1.0d));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (-1L));
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        int i9 = defaultedMap1.size();
        boolean b10 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0d + "'", obj6.equals(1.0d));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.lang.String str6 = elitisticListPopulation5.toString();
        int i7 = elitisticListPopulation5.getPopulationSize();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 100);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, 100, (double) 0L);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5);
        try {
            elitisticListPopulation2.setElitismRate((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        boolean b12 = defaultedMap7.equals((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set15 = defaultedMap14.keySet();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set20 = defaultedMap19.keySet();
        boolean b22 = defaultedMap19.containsValue((java.lang.Object) (-1.0f));
        defaultedMap14.putAll((java.util.Map) defaultedMap19);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set30 = defaultedMap29.keySet();
        boolean b31 = defaultedMap29.isEmpty();
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        boolean b33 = defaultedMap29.containsValue((java.lang.Object) predicateUtils32);
        defaultedMap1.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set37 = defaultedMap36.keySet();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        boolean b39 = defaultedMap36.containsKey((java.lang.Object) predicate38);
        boolean b41 = defaultedMap36.containsValue((java.lang.Object) 100);
        java.lang.Object obj42 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set45 = defaultedMap44.keySet();
        boolean b47 = defaultedMap44.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set50 = defaultedMap49.keySet();
        boolean b52 = defaultedMap49.containsValue((java.lang.Object) (-1.0f));
        defaultedMap44.putAll((java.util.Map) defaultedMap49);
        java.lang.Object obj54 = defaultedMap36.put(obj42, (java.lang.Object) defaultedMap44);
        java.util.Collection collection55 = defaultedMap44.values();
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) defaultedMap44);
        boolean b58 = defaultedMap1.containsKey((java.lang.Object) "[]");
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set61 = defaultedMap60.keySet();
        boolean b63 = defaultedMap60.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set66 = defaultedMap65.keySet();
        boolean b68 = defaultedMap65.containsValue((java.lang.Object) (-1.0f));
        defaultedMap60.putAll((java.util.Map) defaultedMap65);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set72 = defaultedMap71.keySet();
        boolean b74 = defaultedMap71.containsValue((java.lang.Object) (-1.0f));
        boolean b75 = defaultedMap71.isEmpty();
        java.lang.Object obj76 = defaultedMap60.get((java.lang.Object) b75);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set79 = defaultedMap78.keySet();
        java.lang.Object obj80 = defaultedMap60.remove((java.lang.Object) defaultedMap78);
        boolean b81 = defaultedMap1.equals((java.lang.Object) defaultedMap60);
        java.util.Set set82 = defaultedMap60.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 1.0d + "'", obj56.equals(1.0d));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 1.0d + "'", obj76.equals(1.0d));
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertNotNull(set82);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (short) 10, (double) (byte) 0);
        try {
            math.genetics.Chromosome chromosome14 = elitisticListPopulation13.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation5.getPopulationSize();
        double d11 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        double d24 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, 100, (double) 0L);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome38 = elitisticListPopulation37.iterator();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) 'a');
        java.util.Set set43 = defaultedMap40.keySet();
        java.util.Collection collection44 = defaultedMap40.values();
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection44);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection44);
        java.lang.String str47 = elitisticListPopulation5.toString();
        try {
            math.genetics.Chromosome chromosome48 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "[]" + "'", str47.equals("[]"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) 'a');
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 'a');
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, 100, (double) 0L);
        int i16 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '#', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome20);
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) elitisticListPopulation15);
        math.genetics.Chromosome chromosome23 = null;
        elitisticListPopulation15.addChromosome(chromosome23);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0d + "'", obj9.equals(1.0d));
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1.0d + "'", obj22.equals(1.0d));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (-1L));
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set11 = defaultedMap10.keySet();
        boolean b13 = defaultedMap10.containsValue((java.lang.Object) (-1.0f));
        boolean b14 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        boolean b19 = defaultedMap16.containsKey((java.lang.Object) predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        boolean b21 = defaultedMap16.equals((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set24 = defaultedMap23.keySet();
        boolean b26 = defaultedMap23.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set29 = defaultedMap28.keySet();
        boolean b31 = defaultedMap28.containsValue((java.lang.Object) (-1.0f));
        defaultedMap23.putAll((java.util.Map) defaultedMap28);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate33, predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate20, predicate34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set39 = defaultedMap38.keySet();
        boolean b41 = defaultedMap38.containsValue((java.lang.Object) (-1.0f));
        boolean b42 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set45 = defaultedMap44.keySet();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        boolean b47 = defaultedMap44.containsKey((java.lang.Object) predicate46);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        boolean b49 = defaultedMap44.equals((java.lang.Object) predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set52 = defaultedMap51.keySet();
        boolean b54 = defaultedMap51.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set57 = defaultedMap56.keySet();
        boolean b59 = defaultedMap56.containsValue((java.lang.Object) (-1.0f));
        defaultedMap51.putAll((java.util.Map) defaultedMap56);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate61, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate48, predicate62);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate34, predicate62);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0d + "'", obj6.equals(1.0d));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        java.util.Set set14 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        boolean b19 = defaultedMap16.containsKey((java.lang.Object) predicate18);
        boolean b21 = defaultedMap16.containsValue((java.lang.Object) 100);
        java.lang.Object obj23 = defaultedMap16.remove((java.lang.Object) (-1));
        java.lang.Object obj24 = defaultedMap6.get((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set27 = defaultedMap26.keySet();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        boolean b29 = defaultedMap26.containsKey((java.lang.Object) predicate28);
        boolean b31 = defaultedMap26.containsValue((java.lang.Object) 100);
        java.lang.Object obj32 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set35 = defaultedMap34.keySet();
        boolean b37 = defaultedMap34.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set40 = defaultedMap39.keySet();
        boolean b42 = defaultedMap39.containsValue((java.lang.Object) (-1.0f));
        defaultedMap34.putAll((java.util.Map) defaultedMap39);
        java.lang.Object obj44 = defaultedMap26.put(obj32, (java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set47 = defaultedMap46.keySet();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        boolean b49 = defaultedMap46.containsKey((java.lang.Object) predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        boolean b51 = defaultedMap46.equals((java.lang.Object) predicate50);
        boolean b52 = defaultedMap34.equals((java.lang.Object) b51);
        java.lang.Object obj53 = defaultedMap16.get((java.lang.Object) b52);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1.0d + "'", obj24.equals(1.0d));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 1.0d + "'", obj53.equals(1.0d));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation5.getPopulationSize();
        double d11 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation5.setPopulationLimit((int) (short) 100);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome26 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome26);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation5.getPopulationSize();
        double d11 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome24 = arraylist_chromosome20.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome24);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (-1L));
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set12 = defaultedMap11.keySet();
        boolean b14 = defaultedMap11.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) (-1.0f));
        defaultedMap11.putAll((java.util.Map) defaultedMap16);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate21, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set28 = defaultedMap27.keySet();
        boolean b30 = defaultedMap27.containsValue((java.lang.Object) (-1.0f));
        boolean b31 = defaultedMap27.isEmpty();
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) defaultedMap27);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) '#', (double) (byte) 0);
        boolean b36 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set39 = defaultedMap38.keySet();
        boolean b41 = defaultedMap38.containsValue((java.lang.Object) (-1.0f));
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) (-1L));
        int i44 = defaultedMap38.size();
        java.util.Set set45 = defaultedMap38.entrySet();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap38);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0d + "'", obj6.equals(1.0d));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1.0d + "'", obj43.equals(1.0d));
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 100);
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set15 = defaultedMap14.keySet();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (-1.0f));
        defaultedMap9.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj19 = defaultedMap1.put(obj7, (java.lang.Object) defaultedMap9);
        java.util.Collection collection20 = defaultedMap9.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        int i23 = defaultedMap22.size();
        java.util.Collection collection24 = defaultedMap22.values();
        defaultedMap22.clear();
        boolean b26 = defaultedMap22.isEmpty();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome33 = elitisticListPopulation32.iterator();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        int i37 = defaultedMap36.size();
        java.util.Collection collection38 = defaultedMap36.values();
        elitisticListPopulation32.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection38);
        boolean b40 = defaultedMap22.containsKey((java.lang.Object) collection38);
        java.lang.Object obj41 = defaultedMap9.remove((java.lang.Object) defaultedMap22);
        defaultedMap9.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome33);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        math.genetics.Population population10 = elitisticListPopulation5.nextGeneration();
        try {
            elitisticListPopulation5.setPopulationLimit((-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(population10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) (byte) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        int i7 = elitisticListPopulation5.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.List<math.genetics.Chromosome> list_chromosome0 = null;
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(list_chromosome0, (int) (short) 100, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) true);
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsValue(obj5);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0.0d, (java.lang.Object) '#');
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation15.iterator();
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        double d21 = elitisticListPopulation15.getElitismRate();
        int i22 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.Chromosome chromosome23 = null;
        elitisticListPopulation15.addChromosome(chromosome23);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome25 = elitisticListPopulation15.iterator();
        boolean b26 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation15);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(d21 == 0.0d);
        org.junit.Assert.assertTrue(i22 == 100);
        org.junit.Assert.assertNotNull(iterator_chromosome25);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap1.remove(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set15 = defaultedMap14.keySet();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (-1.0f));
        boolean b18 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap14);
        int i20 = defaultedMap19.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set23 = defaultedMap22.keySet();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        boolean b25 = defaultedMap22.containsKey((java.lang.Object) predicate24);
        boolean b27 = defaultedMap22.containsValue((java.lang.Object) 100);
        java.lang.Object obj29 = defaultedMap22.remove((java.lang.Object) (-1));
        defaultedMap22.clear();
        boolean b31 = defaultedMap19.containsValue((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) 'a');
        java.util.Set set36 = defaultedMap33.keySet();
        defaultedMap19.putAll((java.util.Map) defaultedMap33);
        boolean b38 = defaultedMap1.containsValue((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set41 = defaultedMap40.keySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) true);
        java.lang.Object obj44 = null;
        boolean b45 = defaultedMap40.containsValue(obj44);
        java.lang.Object obj48 = defaultedMap40.put((java.lang.Object) 0.0d, (java.lang.Object) '#');
        boolean b49 = defaultedMap19.equals((java.lang.Object) defaultedMap40);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (short) 100);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) true);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set8 = defaultedMap7.keySet();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        boolean b17 = defaultedMap12.equals((java.lang.Object) predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set20 = defaultedMap19.keySet();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set25 = defaultedMap24.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) predicate26);
        boolean b29 = defaultedMap24.containsValue((java.lang.Object) 100);
        java.lang.Object obj30 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set33 = defaultedMap32.keySet();
        boolean b35 = defaultedMap32.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set38 = defaultedMap37.keySet();
        boolean b40 = defaultedMap37.containsValue((java.lang.Object) (-1.0f));
        defaultedMap32.putAll((java.util.Map) defaultedMap37);
        java.lang.Object obj42 = defaultedMap24.put(obj30, (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set45 = defaultedMap44.keySet();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        boolean b47 = defaultedMap44.containsKey((java.lang.Object) predicate46);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        boolean b49 = defaultedMap44.equals((java.lang.Object) predicate48);
        boolean b50 = defaultedMap32.equals((java.lang.Object) b49);
        java.util.Set set51 = defaultedMap32.keySet();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) set51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set55 = defaultedMap54.keySet();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        boolean b57 = defaultedMap54.containsKey((java.lang.Object) predicate56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set60 = defaultedMap59.keySet();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        boolean b62 = defaultedMap59.containsKey((java.lang.Object) predicate61);
        boolean b64 = defaultedMap59.containsValue((java.lang.Object) 100);
        java.lang.Object obj65 = new java.lang.Object();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj67 = defaultedMap59.put(obj65, (java.lang.Object) predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate(map52, predicate56, predicate66);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate16, predicate66);
        math.genetics.ElitisticListPopulation elitisticListPopulation72 = new math.genetics.ElitisticListPopulation((int) '#', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome73 = elitisticListPopulation72.getChromosomes();
        elitisticListPopulation72.setPopulationLimit((int) (short) 10);
        java.lang.Object obj76 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) elitisticListPopulation72);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(list_chromosome73);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        double d11 = elitisticListPopulation5.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        boolean b12 = defaultedMap7.equals((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set15 = defaultedMap14.keySet();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set20 = defaultedMap19.keySet();
        boolean b22 = defaultedMap19.containsValue((java.lang.Object) (-1.0f));
        defaultedMap14.putAll((java.util.Map) defaultedMap19);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate25);
        collections.Transformer transformer28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate(map27, transformer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', 0.0d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        double d11 = elitisticListPopulation5.getElitismRate();
        int i12 = elitisticListPopulation5.getPopulationLimit();
        try {
            math.genetics.Chromosome chromosome13 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertTrue(i12 == 100);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        java.util.Set set14 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        boolean b19 = defaultedMap16.containsKey((java.lang.Object) predicate18);
        boolean b21 = defaultedMap16.containsValue((java.lang.Object) 100);
        java.lang.Object obj23 = defaultedMap16.remove((java.lang.Object) (-1));
        java.lang.Object obj24 = defaultedMap6.get((java.lang.Object) defaultedMap16);
        boolean b25 = defaultedMap6.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1.0d + "'", obj24.equals(1.0d));
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set8 = defaultedMap7.keySet();
        boolean b10 = defaultedMap7.containsValue((java.lang.Object) (-1.0f));
        boolean b11 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set13 = defaultedMap12.keySet();
        boolean b15 = defaultedMap12.containsValue((java.lang.Object) (-1.0f));
        boolean b16 = defaultedMap12.isEmpty();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) b16);
        boolean b18 = defaultedMap1.isEmpty();
        java.util.Collection collection19 = defaultedMap1.values();
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1.0d + "'", obj17.equals(1.0d));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        int i10 = defaultedMap9.size();
        java.util.Collection collection11 = defaultedMap9.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection11);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        int i23 = elitisticListPopulation18.getPopulationSize();
        double d24 = elitisticListPopulation18.getElitismRate();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome31 = elitisticListPopulation30.iterator();
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        elitisticListPopulation18.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33);
        int i38 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome31);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i38 == 100);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set13 = defaultedMap12.keySet();
        boolean b15 = defaultedMap12.containsValue((java.lang.Object) (-1.0f));
        boolean b16 = defaultedMap12.isEmpty();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) b16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set20 = defaultedMap19.keySet();
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set24 = defaultedMap23.keySet();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        boolean b26 = defaultedMap23.containsKey((java.lang.Object) predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        boolean b28 = defaultedMap23.equals((java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        boolean b33 = defaultedMap30.containsKey((java.lang.Object) predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        boolean b35 = defaultedMap30.equals((java.lang.Object) predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate27, predicate34);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1.0d + "'", obj17.equals(1.0d));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (short) 10);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome3);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set5 = defaultedMap4.keySet();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) predicate6);
        boolean b9 = defaultedMap4.containsValue((java.lang.Object) 100);
        java.lang.Object obj10 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set13 = defaultedMap12.keySet();
        boolean b15 = defaultedMap12.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set18 = defaultedMap17.keySet();
        boolean b20 = defaultedMap17.containsValue((java.lang.Object) (-1.0f));
        defaultedMap12.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj22 = defaultedMap4.put(obj10, (java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set25 = defaultedMap24.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        boolean b29 = defaultedMap24.equals((java.lang.Object) predicate28);
        boolean b30 = defaultedMap12.equals((java.lang.Object) b29);
        java.util.Set set31 = defaultedMap12.keySet();
        int i32 = defaultedMap12.size();
        java.lang.Object obj34 = defaultedMap12.get((java.lang.Object) 0.0d);
        boolean b35 = defaultedMap1.equals((java.lang.Object) defaultedMap12);
        int i36 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1.0d + "'", obj34.equals(1.0d));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        double d11 = elitisticListPopulation5.getElitismRate();
        double d12 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation5.addChromosome(chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertTrue(d12 == 0.0d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        boolean b6 = defaultedMap1.equals((java.lang.Object) predicate5);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation5.getPopulationSize();
        double d11 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        double d24 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, 100, (double) 0L);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        double d32 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(d32 == 0.0d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 100);
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set15 = defaultedMap14.keySet();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (-1.0f));
        defaultedMap9.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj19 = defaultedMap1.put(obj7, (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) predicate23);
        java.lang.String str25 = defaultedMap21.toString();
        defaultedMap21.clear();
        defaultedMap9.putAll((java.util.Map) defaultedMap21);
        java.util.Set set28 = defaultedMap21.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (-1L));
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set12 = defaultedMap11.keySet();
        boolean b14 = defaultedMap11.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) (-1.0f));
        defaultedMap11.putAll((java.util.Map) defaultedMap16);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate21, predicate24);
        int i26 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set29 = defaultedMap28.keySet();
        boolean b31 = defaultedMap28.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set34 = defaultedMap33.keySet();
        boolean b36 = defaultedMap33.containsValue((java.lang.Object) (-1.0f));
        defaultedMap28.putAll((java.util.Map) defaultedMap33);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate38, predicate39);
        boolean b41 = defaultedMap1.containsValue((java.lang.Object) predicate39);
        java.util.Collection collection42 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0d + "'", obj6.equals(1.0d));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        double d11 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation5.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        java.util.Set set5 = defaultedMap1.keySet();
        int i6 = defaultedMap1.size();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome17 = elitisticListPopulation12.spliterator();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set20 = defaultedMap19.keySet();
        boolean b22 = defaultedMap19.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set25 = defaultedMap24.keySet();
        boolean b27 = defaultedMap24.containsValue((java.lang.Object) (-1.0f));
        defaultedMap19.putAll((java.util.Map) defaultedMap24);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate29, predicate30);
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) elitisticListPopulation12, (java.lang.Object) defaultedMap24);
        elitisticListPopulation12.setPopulationLimit((int) (byte) 1);
        elitisticListPopulation12.setPopulationLimit((int) '4');
        math.genetics.Population population37 = elitisticListPopulation12.nextGeneration();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(population37);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicateUtils4);
        java.util.Set set6 = defaultedMap1.keySet();
        java.util.Collection collection7 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation5.getPopulationSize();
        double d11 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        double d24 = elitisticListPopulation5.getElitismRate();
        double d25 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setElitismRate((double) 1.0f);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(d25 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 100);
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set15 = defaultedMap14.keySet();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (-1.0f));
        defaultedMap9.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj19 = defaultedMap1.put(obj7, (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        boolean b26 = defaultedMap21.equals((java.lang.Object) predicate25);
        boolean b27 = defaultedMap9.equals((java.lang.Object) b26);
        java.util.Set set28 = defaultedMap9.keySet();
        java.util.Set set29 = defaultedMap9.keySet();
        java.util.Set set30 = defaultedMap9.entrySet();
        boolean b31 = defaultedMap9.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        int i8 = elitisticListPopulation5.getPopulationSize();
        try {
            math.genetics.Chromosome chromosome9 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set13 = defaultedMap12.keySet();
        boolean b15 = defaultedMap12.containsValue((java.lang.Object) (-1.0f));
        boolean b16 = defaultedMap12.isEmpty();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) b16);
        boolean b18 = defaultedMap1.isEmpty();
        java.lang.String str19 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1.0d + "'", obj17.equals(1.0d));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 100);
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set15 = defaultedMap14.keySet();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (-1.0f));
        defaultedMap9.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj19 = defaultedMap1.put(obj7, (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        boolean b26 = defaultedMap21.equals((java.lang.Object) predicate25);
        boolean b27 = defaultedMap9.equals((java.lang.Object) b26);
        java.util.Set set28 = defaultedMap9.keySet();
        int i29 = defaultedMap9.size();
        java.lang.Object obj31 = defaultedMap9.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set34 = defaultedMap33.keySet();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set39 = defaultedMap38.keySet();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        boolean b41 = defaultedMap38.containsKey((java.lang.Object) predicate40);
        boolean b43 = defaultedMap38.containsValue((java.lang.Object) 100);
        java.lang.Object obj44 = new java.lang.Object();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj46 = defaultedMap38.put(obj44, (java.lang.Object) predicate45);
        boolean b47 = defaultedMap33.equals((java.lang.Object) predicate45);
        java.util.Set set48 = defaultedMap33.entrySet();
        boolean b49 = defaultedMap9.containsValue((java.lang.Object) defaultedMap33);
        java.util.Set set50 = defaultedMap9.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 1.0d + "'", obj31.equals(1.0d));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set50);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.isEmpty();
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation11.iterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        int i16 = defaultedMap15.size();
        java.util.Collection collection17 = defaultedMap15.values();
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection17);
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) collection17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set27 = defaultedMap26.keySet();
        boolean b29 = defaultedMap26.containsValue((java.lang.Object) (-1.0f));
        defaultedMap21.putAll((java.util.Map) defaultedMap26);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate31, predicate32);
        java.util.Set set34 = defaultedMap26.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set37 = defaultedMap36.keySet();
        boolean b38 = defaultedMap26.containsKey((java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set41 = defaultedMap40.keySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set46 = defaultedMap45.keySet();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        boolean b48 = defaultedMap45.containsKey((java.lang.Object) predicate47);
        boolean b50 = defaultedMap45.containsValue((java.lang.Object) 100);
        java.lang.Object obj51 = new java.lang.Object();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj53 = defaultedMap45.put(obj51, (java.lang.Object) predicate52);
        boolean b54 = defaultedMap40.equals((java.lang.Object) predicate52);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set57 = defaultedMap56.keySet();
        boolean b59 = defaultedMap56.containsValue((java.lang.Object) (-1.0f));
        boolean b60 = defaultedMap56.isEmpty();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set63 = defaultedMap62.keySet();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        boolean b65 = defaultedMap62.containsKey((java.lang.Object) predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        boolean b67 = defaultedMap62.equals((java.lang.Object) predicate66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set70 = defaultedMap69.keySet();
        boolean b72 = defaultedMap69.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set75 = defaultedMap74.keySet();
        boolean b77 = defaultedMap74.containsValue((java.lang.Object) (-1.0f));
        defaultedMap69.putAll((java.util.Map) defaultedMap74);
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate79, predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate66, predicate80);
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate52, predicate80);
        java.lang.Object obj84 = defaultedMap1.get((java.lang.Object) predicate80);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + 1.0d + "'", obj84.equals(1.0d));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        int i10 = defaultedMap9.size();
        java.util.Collection collection11 = defaultedMap9.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection11);
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setElitismRate(0.0d);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(population13);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.util.Map map4 = null;
        try {
            defaultedMap1.putAll(map4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap9.keySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) true);
        java.util.Set set13 = defaultedMap9.keySet();
        java.util.Set set14 = defaultedMap9.entrySet();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) set14);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        int i8 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) '#', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome10);
        int i12 = elitisticListPopulation5.getPopulationLimit();
        try {
            elitisticListPopulation5.setElitismRate((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(i12 == 100);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        boolean b6 = defaultedMap1.equals((java.lang.Object) predicate5);
        int i7 = defaultedMap1.size();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation13.iterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        java.util.Set set19 = defaultedMap16.keySet();
        java.util.Collection collection20 = defaultedMap16.values();
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection20);
        java.lang.Object obj22 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation13);
        java.lang.String str23 = elitisticListPopulation13.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]" + "'", str23.equals("[]"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        double d11 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation5.spliterator();
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation5.addChromosome(chromosome14);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        java.util.Set set5 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i7 = defaultedMap6.size();
        int i8 = defaultedMap6.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        boolean b12 = defaultedMap7.equals((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set15 = defaultedMap14.keySet();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set20 = defaultedMap19.keySet();
        boolean b22 = defaultedMap19.containsValue((java.lang.Object) (-1.0f));
        defaultedMap14.putAll((java.util.Map) defaultedMap19);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set30 = defaultedMap29.keySet();
        boolean b31 = defaultedMap29.isEmpty();
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        boolean b33 = defaultedMap29.containsValue((java.lang.Object) predicateUtils32);
        defaultedMap1.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set37 = defaultedMap36.keySet();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        boolean b39 = defaultedMap36.containsKey((java.lang.Object) predicate38);
        boolean b41 = defaultedMap36.containsValue((java.lang.Object) 100);
        java.lang.Object obj42 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set45 = defaultedMap44.keySet();
        boolean b47 = defaultedMap44.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set50 = defaultedMap49.keySet();
        boolean b52 = defaultedMap49.containsValue((java.lang.Object) (-1.0f));
        defaultedMap44.putAll((java.util.Map) defaultedMap49);
        java.lang.Object obj54 = defaultedMap36.put(obj42, (java.lang.Object) defaultedMap44);
        java.util.Collection collection55 = defaultedMap44.values();
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) defaultedMap44);
        java.util.Collection collection57 = defaultedMap44.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 1.0d + "'", obj56.equals(1.0d));
        org.junit.Assert.assertNotNull(collection57);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (short) 10, (double) (byte) 0);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap6.equals((java.lang.Object) predicate10);
        int i12 = defaultedMap6.size();
        boolean b14 = defaultedMap6.equals((java.lang.Object) 'a');
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.util.Set set16 = defaultedMap6.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        math.genetics.Population population10 = elitisticListPopulation5.nextGeneration();
        try {
            elitisticListPopulation5.setElitismRate((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(population10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        boolean b14 = defaultedMap11.containsKey((java.lang.Object) predicate13);
        java.lang.Object obj15 = defaultedMap8.get((java.lang.Object) b14);
        java.util.Set set16 = defaultedMap8.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set19 = defaultedMap18.keySet();
        boolean b21 = defaultedMap18.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set24 = defaultedMap23.keySet();
        boolean b26 = defaultedMap23.containsValue((java.lang.Object) (-1.0f));
        defaultedMap18.putAll((java.util.Map) defaultedMap23);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate28, predicate29);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) map30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set34 = defaultedMap33.keySet();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        boolean b36 = defaultedMap33.containsKey((java.lang.Object) predicate35);
        boolean b38 = defaultedMap33.containsValue((java.lang.Object) 100);
        java.lang.Object obj39 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set42 = defaultedMap41.keySet();
        boolean b44 = defaultedMap41.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set47 = defaultedMap46.keySet();
        boolean b49 = defaultedMap46.containsValue((java.lang.Object) (-1.0f));
        defaultedMap41.putAll((java.util.Map) defaultedMap46);
        java.lang.Object obj51 = defaultedMap33.put(obj39, (java.lang.Object) defaultedMap41);
        java.lang.String str52 = defaultedMap41.toString();
        java.lang.Object obj53 = defaultedMap6.put((java.lang.Object) map30, (java.lang.Object) str52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set56 = defaultedMap55.keySet();
        boolean b58 = defaultedMap55.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set61 = defaultedMap60.keySet();
        boolean b63 = defaultedMap60.containsValue((java.lang.Object) (-1.0f));
        defaultedMap55.putAll((java.util.Map) defaultedMap60);
        java.lang.String str65 = defaultedMap60.toString();
        boolean b66 = defaultedMap6.containsValue((java.lang.Object) str65);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1.0d + "'", obj15.equals(1.0d));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertTrue(b66 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) '#', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome10);
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation5.addChromosome(chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertNotNull(list_chromosome10);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap6.equals((java.lang.Object) predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set14 = defaultedMap13.keySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        boolean b21 = defaultedMap18.containsKey((java.lang.Object) predicate20);
        boolean b23 = defaultedMap18.containsValue((java.lang.Object) 100);
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set27 = defaultedMap26.keySet();
        boolean b29 = defaultedMap26.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set32 = defaultedMap31.keySet();
        boolean b34 = defaultedMap31.containsValue((java.lang.Object) (-1.0f));
        defaultedMap26.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj36 = defaultedMap18.put(obj24, (java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set39 = defaultedMap38.keySet();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        boolean b41 = defaultedMap38.containsKey((java.lang.Object) predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        boolean b43 = defaultedMap38.equals((java.lang.Object) predicate42);
        boolean b44 = defaultedMap26.equals((java.lang.Object) b43);
        java.util.Set set45 = defaultedMap26.keySet();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) set45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set49 = defaultedMap48.keySet();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        boolean b51 = defaultedMap48.containsKey((java.lang.Object) predicate50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set54 = defaultedMap53.keySet();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        boolean b56 = defaultedMap53.containsKey((java.lang.Object) predicate55);
        boolean b58 = defaultedMap53.containsValue((java.lang.Object) 100);
        java.lang.Object obj59 = new java.lang.Object();
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj61 = defaultedMap53.put(obj59, (java.lang.Object) predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate(map46, predicate50, predicate60);
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate60);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set66 = defaultedMap65.keySet();
        boolean b68 = defaultedMap65.containsValue((java.lang.Object) (-1.0f));
        java.lang.Object obj70 = defaultedMap65.get((java.lang.Object) (-1L));
        boolean b72 = defaultedMap65.containsKey((java.lang.Object) 10.0d);
        defaultedMap65.clear();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set76 = defaultedMap75.keySet();
        boolean b78 = defaultedMap75.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set81 = defaultedMap80.keySet();
        boolean b83 = defaultedMap80.containsValue((java.lang.Object) (-1.0f));
        defaultedMap75.putAll((java.util.Map) defaultedMap80);
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate85, predicate86);
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate85, predicate88);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set92 = defaultedMap91.keySet();
        boolean b94 = defaultedMap91.containsValue((java.lang.Object) (-1.0f));
        boolean b95 = defaultedMap91.isEmpty();
        boolean b96 = defaultedMap65.containsValue((java.lang.Object) defaultedMap91);
        boolean b97 = defaultedMap1.containsKey((java.lang.Object) defaultedMap91);
        collections.map.DefaultedMap defaultedMap98 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap91);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 1.0d + "'", obj70.equals(1.0d));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(set92);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertTrue(b95 == true);
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertTrue(b97 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i7 = defaultedMap6.size();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap6.containsValue(obj8);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.util.List<math.genetics.Chromosome> list_chromosome0 = null;
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(list_chromosome0, (int) (short) 100, 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation5.getPopulationSize();
        double d11 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome24 = elitisticListPopulation5.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome24);
        org.junit.Assert.assertNotNull(list_chromosome25);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b8 = defaultedMap5.containsValue((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap5.keySet();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) set9);
        boolean b11 = defaultedMap3.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        java.util.Set set14 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        boolean b19 = defaultedMap16.containsKey((java.lang.Object) predicate18);
        boolean b21 = defaultedMap16.containsValue((java.lang.Object) 100);
        java.lang.Object obj23 = defaultedMap16.remove((java.lang.Object) (-1));
        java.lang.Object obj24 = defaultedMap6.get((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set27 = defaultedMap26.keySet();
        boolean b29 = defaultedMap26.containsValue((java.lang.Object) (-1.0f));
        boolean b30 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap26);
        int i32 = defaultedMap31.size();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set35 = defaultedMap34.keySet();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        boolean b37 = defaultedMap34.containsKey((java.lang.Object) predicate36);
        boolean b39 = defaultedMap34.containsValue((java.lang.Object) 100);
        java.lang.Object obj41 = defaultedMap34.remove((java.lang.Object) (-1));
        defaultedMap34.clear();
        boolean b43 = defaultedMap31.containsValue((java.lang.Object) defaultedMap34);
        java.lang.Object obj44 = defaultedMap16.get((java.lang.Object) b43);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1.0d + "'", obj24.equals(1.0d));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1.0d + "'", obj44.equals(1.0d));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.lang.String str10 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 'a');
        java.util.Set set10 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set13 = defaultedMap12.keySet();
        boolean b15 = defaultedMap12.containsValue((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) (-1L));
        java.lang.Object obj18 = defaultedMap7.get(obj17);
        int i19 = defaultedMap7.size();
        java.util.Collection collection20 = defaultedMap7.values();
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) collection20);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1.0d + "'", obj17.equals(1.0d));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 10 + "'", obj18.equals((short) 10));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i7 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        boolean b12 = defaultedMap9.containsKey((java.lang.Object) predicate11);
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) 100);
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) (-1));
        defaultedMap9.clear();
        boolean b18 = defaultedMap6.containsValue((java.lang.Object) defaultedMap9);
        int i19 = defaultedMap9.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        java.util.Set set14 = defaultedMap6.entrySet();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22);
        int i25 = elitisticListPopulation20.getPopulationSize();
        double d26 = elitisticListPopulation20.getElitismRate();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome33 = elitisticListPopulation32.iterator();
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        elitisticListPopulation32.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35);
        elitisticListPopulation20.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35);
        double d39 = elitisticListPopulation20.getElitismRate();
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome41, 100, (double) 0L);
        elitisticListPopulation20.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome41);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome53 = elitisticListPopulation52.iterator();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) 'a');
        java.util.Set set58 = defaultedMap55.keySet();
        java.util.Collection collection59 = defaultedMap55.values();
        elitisticListPopulation52.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection59);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection59);
        math.genetics.Chromosome[] chromosome_array62 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome63 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b64 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome63, chromosome_array62);
        math.genetics.ElitisticListPopulation elitisticListPopulation67 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome63, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome68 = elitisticListPopulation67.iterator();
        math.genetics.Chromosome[] chromosome_array69 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome70 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b71 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome70, chromosome_array69);
        elitisticListPopulation67.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome70);
        double d73 = elitisticListPopulation67.getElitismRate();
        int i74 = elitisticListPopulation67.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array75 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome76 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b77 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome76, chromosome_array75);
        elitisticListPopulation67.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome76);
        elitisticListPopulation20.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome76);
        double d80 = elitisticListPopulation20.getElitismRate();
        boolean b81 = defaultedMap6.equals((java.lang.Object) elitisticListPopulation20);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(d26 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome33);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(d39 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(chromosome_array62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome68);
        org.junit.Assert.assertNotNull(chromosome_array69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(d73 == 0.0d);
        org.junit.Assert.assertTrue(i74 == 100);
        org.junit.Assert.assertNotNull(chromosome_array75);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(d80 == 0.0d);
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 100);
        java.lang.Object obj7 = new java.lang.Object();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj9 = defaultedMap1.put(obj7, (java.lang.Object) predicate8);
        java.util.Collection collection10 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 'a');
        java.util.Set set11 = defaultedMap8.keySet();
        java.util.Collection collection12 = defaultedMap8.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection12);
        java.lang.String str14 = elitisticListPopulation5.toString();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation20.iterator();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        int i25 = defaultedMap24.size();
        java.util.Collection collection26 = defaultedMap24.values();
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection26);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection26);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation5.getPopulationSize();
        double d11 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        double d24 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, 100, (double) 0L);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome38 = elitisticListPopulation37.iterator();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) 'a');
        java.util.Set set43 = defaultedMap40.keySet();
        java.util.Collection collection44 = defaultedMap40.values();
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection44);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection44);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        elitisticListPopulation52.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome57 = arraylist_chromosome54.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome58 = arraylist_chromosome54.spliterator();
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54);
        java.lang.String str60 = elitisticListPopulation5.toString();
        try {
            math.genetics.Chromosome chromosome61 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome57);
        org.junit.Assert.assertNotNull(spliterator_chromosome58);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "[]" + "'", str60.equals("[]"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        double d11 = elitisticListPopulation5.getElitismRate();
        int i12 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation5.addChromosome(chromosome13);
        try {
            math.genetics.Chromosome chromosome15 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertTrue(i12 == 100);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) 'a');
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 'a');
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, 100, (double) 0L);
        int i16 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '#', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome20);
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) elitisticListPopulation15);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) '#', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome26);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0d + "'", obj9.equals(1.0d));
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1.0d + "'", obj22.equals(1.0d));
        org.junit.Assert.assertNotNull(list_chromosome26);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 100);
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set15 = defaultedMap14.keySet();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (-1.0f));
        defaultedMap9.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj19 = defaultedMap1.put(obj7, (java.lang.Object) defaultedMap9);
        java.lang.String str20 = defaultedMap9.toString();
        java.util.Set set21 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set24 = defaultedMap23.keySet();
        boolean b26 = defaultedMap23.containsValue((java.lang.Object) (-1.0f));
        java.util.Set set27 = defaultedMap23.keySet();
        int i28 = defaultedMap23.size();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set31 = defaultedMap30.keySet();
        boolean b33 = defaultedMap30.containsValue((java.lang.Object) (-1.0f));
        java.lang.Object obj35 = defaultedMap30.get((java.lang.Object) (-1L));
        boolean b37 = defaultedMap30.containsKey((java.lang.Object) 10.0d);
        defaultedMap30.clear();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set41 = defaultedMap40.keySet();
        boolean b43 = defaultedMap40.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set46 = defaultedMap45.keySet();
        boolean b48 = defaultedMap45.containsValue((java.lang.Object) (-1.0f));
        defaultedMap40.putAll((java.util.Map) defaultedMap45);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate50, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate50, predicate53);
        boolean b55 = defaultedMap23.containsKey((java.lang.Object) map54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set58 = defaultedMap57.keySet();
        boolean b60 = defaultedMap57.containsValue((java.lang.Object) (-1.0f));
        boolean b61 = defaultedMap57.isEmpty();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap57);
        boolean b63 = defaultedMap23.containsKey((java.lang.Object) defaultedMap62);
        java.lang.Object obj64 = defaultedMap9.get((java.lang.Object) defaultedMap23);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1.0d + "'", obj35.equals(1.0d));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 1.0d + "'", obj64.equals(1.0d));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 100);
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set15 = defaultedMap14.keySet();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (-1.0f));
        defaultedMap9.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj19 = defaultedMap1.put(obj7, (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        boolean b26 = defaultedMap21.equals((java.lang.Object) predicate25);
        boolean b27 = defaultedMap9.equals((java.lang.Object) b26);
        java.util.Set set28 = defaultedMap9.keySet();
        java.util.Set set29 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set32 = defaultedMap31.keySet();
        boolean b34 = defaultedMap31.containsValue((java.lang.Object) (-1.0f));
        boolean b35 = defaultedMap31.isEmpty();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap31);
        int i37 = defaultedMap36.size();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set40 = defaultedMap39.keySet();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        boolean b42 = defaultedMap39.containsKey((java.lang.Object) predicate41);
        boolean b44 = defaultedMap39.containsValue((java.lang.Object) 100);
        java.lang.Object obj46 = defaultedMap39.remove((java.lang.Object) (-1));
        defaultedMap39.clear();
        boolean b48 = defaultedMap36.containsValue((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 'a');
        java.util.Set set53 = defaultedMap50.keySet();
        defaultedMap36.putAll((java.util.Map) defaultedMap50);
        boolean b55 = defaultedMap9.equals((java.lang.Object) defaultedMap50);
        java.util.Set set56 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set59 = defaultedMap58.keySet();
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        boolean b61 = defaultedMap58.containsKey((java.lang.Object) predicate60);
        boolean b63 = defaultedMap58.containsValue((java.lang.Object) 100);
        java.lang.Object obj64 = new java.lang.Object();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj66 = defaultedMap58.put(obj64, (java.lang.Object) predicate65);
        java.lang.Object obj67 = defaultedMap9.get((java.lang.Object) predicate65);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 1.0d + "'", obj67.equals(1.0d));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation5.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) -1);
        boolean b4 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (-1.0f) + "'", obj3.equals((-1.0f)));
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation5.getPopulationSize();
        double d11 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        double d24 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, 100, (double) 0L);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        elitisticListPopulation5.setPopulationLimit((int) ' ');
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set36 = defaultedMap35.keySet();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        boolean b38 = defaultedMap35.containsKey((java.lang.Object) predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        boolean b40 = defaultedMap35.equals((java.lang.Object) predicate39);
        int i41 = defaultedMap35.size();
        boolean b43 = defaultedMap35.equals((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        int i46 = defaultedMap45.size();
        java.util.Collection collection47 = defaultedMap45.values();
        boolean b48 = defaultedMap35.containsValue((java.lang.Object) collection47);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection47);
        math.genetics.Population population50 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(population50);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation5.getPopulationSize();
        double d11 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        double d24 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, 100, (double) 0L);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome38 = elitisticListPopulation37.iterator();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) 'a');
        java.util.Set set43 = defaultedMap40.keySet();
        java.util.Collection collection44 = defaultedMap40.values();
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection44);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection44);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome53 = elitisticListPopulation52.iterator();
        math.genetics.Chromosome[] chromosome_array54 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome55 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55, chromosome_array54);
        elitisticListPopulation52.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55);
        double d58 = elitisticListPopulation52.getElitismRate();
        int i59 = elitisticListPopulation52.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array60 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome61 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61, chromosome_array60);
        elitisticListPopulation52.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome61);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome61);
        double d65 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setElitismRate((double) 1.0f);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome53);
        org.junit.Assert.assertNotNull(chromosome_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(d58 == 0.0d);
        org.junit.Assert.assertTrue(i59 == 100);
        org.junit.Assert.assertNotNull(chromosome_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(d65 == 0.0d);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation5.getPopulationSize();
        double d11 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        double d24 = elitisticListPopulation5.getElitismRate();
        double d25 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setElitismRate((double) 1.0f);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome28 = elitisticListPopulation5.iterator();
        math.genetics.Population population29 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(d25 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome28);
        org.junit.Assert.assertNotNull(population29);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 100);
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set15 = defaultedMap14.keySet();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (-1.0f));
        defaultedMap9.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj19 = defaultedMap1.put(obj7, (java.lang.Object) defaultedMap9);
        java.lang.String str20 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set23 = defaultedMap22.keySet();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        boolean b25 = defaultedMap22.containsKey((java.lang.Object) predicate24);
        boolean b27 = defaultedMap22.containsValue((java.lang.Object) 100);
        java.lang.Object obj28 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set31 = defaultedMap30.keySet();
        boolean b33 = defaultedMap30.containsValue((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set36 = defaultedMap35.keySet();
        boolean b38 = defaultedMap35.containsValue((java.lang.Object) (-1.0f));
        defaultedMap30.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj40 = defaultedMap22.put(obj28, (java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set43 = defaultedMap42.keySet();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        boolean b45 = defaultedMap42.containsKey((java.lang.Object) predicate44);
        java.lang.String str46 = defaultedMap42.toString();
        defaultedMap42.clear();
        defaultedMap30.putAll((java.util.Map) defaultedMap42);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap42);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) 'a');
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 'a');
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, 100, (double) 0L);
        int i16 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '#', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome20);
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) elitisticListPopulation15);
        math.genetics.Population population23 = elitisticListPopulation15.nextGeneration();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0d + "'", obj9.equals(1.0d));
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1.0d + "'", obj22.equals(1.0d));
        org.junit.Assert.assertNotNull(population23);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation5.getPopulationSize();
        double d11 = elitisticListPopulation5.getElitismRate();
        double d12 = elitisticListPopulation5.getElitismRate();
        double d13 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertTrue(d13 == 0.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        boolean b6 = defaultedMap1.equals((java.lang.Object) predicate5);
        int i7 = defaultedMap1.size();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation13.iterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        java.util.Set set19 = defaultedMap16.keySet();
        java.util.Collection collection20 = defaultedMap16.values();
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection20);
        java.lang.Object obj22 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation13);
        int i23 = elitisticListPopulation13.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, 100, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome30 = elitisticListPopulation29.iterator();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) 'a');
        java.util.Set set35 = defaultedMap32.keySet();
        java.util.Collection collection36 = defaultedMap32.values();
        elitisticListPopulation29.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection36);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection36);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 100);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection36);
    }
}

