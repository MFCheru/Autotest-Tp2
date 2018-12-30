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
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '4', (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
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
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 0, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) -1, (double) '#');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate(map4, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap7.remove(obj11);
        java.lang.Object obj13 = defaultedMap1.put(obj5, obj12);
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (short) 100);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) -1, (double) 1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap7.remove(obj11);
        java.lang.Object obj13 = defaultedMap1.put(obj5, obj12);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) (-1.0f), obj15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        try {
            java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 0, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap7.remove(obj11);
        java.lang.Object obj13 = defaultedMap1.put(obj5, obj12);
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (short) 100);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 0, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap9.containsValue(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Collection collection13 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        java.lang.String str4 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap7.remove(obj11);
        java.lang.Object obj13 = defaultedMap1.put(obj5, obj12);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) (-1.0f), obj15);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 10, 10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b15 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap24);
        defaultedMap17.clear();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap17);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj12 = defaultedMap4.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap11);
        defaultedMap4.clear();
        java.lang.String str14 = defaultedMap4.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate(map4, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.containsValue(obj2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap5.remove(obj9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate11, predicate15);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate18);
        collections.Transformer transformer20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap7.remove(obj11);
        java.lang.Object obj13 = defaultedMap1.put(obj5, obj12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap15.containsValue(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap19.remove(obj23);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate25, predicate29);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate29, predicate32);
        java.lang.Object obj34 = defaultedMap1.remove((java.lang.Object) predicate29);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        boolean b15 = defaultedMap14.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap1.entrySet();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        java.lang.Object obj24 = defaultedMap18.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str27 = defaultedMap26.toString();
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b37 = defaultedMap35.containsValue((java.lang.Object) ' ');
        java.util.Set set38 = defaultedMap35.entrySet();
        boolean b40 = defaultedMap35.equals((java.lang.Object) 100.0f);
        java.lang.Object obj41 = defaultedMap30.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set42 = defaultedMap30.entrySet();
        java.lang.Object obj43 = defaultedMap26.put(obj28, (java.lang.Object) defaultedMap30);
        java.lang.Object obj44 = defaultedMap18.get(obj43);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        java.util.Set set46 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100.0f + "'", obj16.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "hi!" + "'", obj32.equals("hi!"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b15 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap24);
        defaultedMap17.clear();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap17);
        collections.Transformer transformer28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, transformer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap24.containsValue(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap28.remove(obj32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate34, predicate38);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate38, predicate41);
        java.lang.Object obj43 = defaultedMap14.get((java.lang.Object) defaultedMap24);
        int i44 = defaultedMap14.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "hi!" + "'", obj43.equals("hi!"));
        org.junit.Assert.assertTrue(i44 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) ' ');
        java.util.Set set22 = defaultedMap19.entrySet();
        boolean b24 = defaultedMap19.equals((java.lang.Object) 100.0f);
        java.lang.Object obj25 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b28 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj38 = defaultedMap30.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap37);
        defaultedMap30.clear();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap30);
        boolean b41 = defaultedMap1.containsKey((java.lang.Object) map40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap43.remove(obj47);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b54 = defaultedMap52.containsValue((java.lang.Object) ' ');
        java.util.Set set55 = defaultedMap52.entrySet();
        java.lang.Object obj57 = defaultedMap52.get((java.lang.Object) 100L);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, obj57);
        defaultedMap1.putAll(map58);
        java.lang.Object obj60 = null;
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj60);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + (short) 100 + "'", obj57.equals((short) 100));
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map61);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 100, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap5.remove(obj9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate11, predicate15);
        java.util.Collection collection18 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b21 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        boolean b28 = defaultedMap5.containsValue((java.lang.Object) defaultedMap20);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) b28);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "hi!" + "'", obj29.equals("hi!"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) ' ');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap7.remove(obj11);
        java.lang.Object obj13 = defaultedMap1.put(obj5, obj12);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) (-1.0f), obj15);
        java.lang.String str17 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (-1), (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) ' ');
        java.util.Set set24 = defaultedMap21.entrySet();
        boolean b26 = defaultedMap21.equals((java.lang.Object) 100.0f);
        java.lang.Object obj27 = defaultedMap16.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set28 = defaultedMap16.entrySet();
        boolean b29 = defaultedMap14.equals((java.lang.Object) defaultedMap16);
        java.util.Set set30 = defaultedMap14.entrySet();
        collections.Factory factory31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, factory31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap9.containsValue(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) ' ');
        java.util.Set set22 = defaultedMap19.entrySet();
        boolean b24 = defaultedMap19.equals((java.lang.Object) 100.0f);
        java.lang.Object obj25 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        java.lang.Object obj33 = defaultedMap27.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj34 = defaultedMap14.get((java.lang.Object) defaultedMap27);
        boolean b35 = defaultedMap1.containsKey(obj34);
        collections.Transformer transformer36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!" + "'", obj34.equals("hi!"));
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap9.containsValue(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) ' ');
        java.util.Set set22 = defaultedMap19.entrySet();
        boolean b24 = defaultedMap19.equals((java.lang.Object) 100.0f);
        java.lang.Object obj25 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap14.entrySet();
        java.lang.Object obj29 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        java.lang.Object obj37 = defaultedMap31.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str40 = defaultedMap39.toString();
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b50 = defaultedMap48.containsValue((java.lang.Object) ' ');
        java.util.Set set51 = defaultedMap48.entrySet();
        boolean b53 = defaultedMap48.equals((java.lang.Object) 100.0f);
        java.lang.Object obj54 = defaultedMap43.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set55 = defaultedMap43.entrySet();
        java.lang.Object obj56 = defaultedMap39.put(obj41, (java.lang.Object) defaultedMap43);
        java.lang.Object obj57 = defaultedMap31.get(obj56);
        defaultedMap14.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj61 = null;
        boolean b62 = defaultedMap60.containsValue(obj61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate65, predicate66);
        java.lang.Object obj68 = null;
        java.lang.Object obj69 = defaultedMap64.remove(obj68);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate73, predicate74);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate70, predicate74);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate74, predicate77);
        boolean b79 = defaultedMap31.containsKey((java.lang.Object) predicate77);
        boolean b80 = defaultedMap1.equals((java.lang.Object) b79);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100.0f + "'", obj29.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "hi!" + "'", obj45.equals("hi!"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + "hi!" + "'", obj57.equals("hi!"));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b80 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) ' ');
        java.util.Set set22 = defaultedMap19.entrySet();
        boolean b24 = defaultedMap19.equals((java.lang.Object) 100.0f);
        java.lang.Object obj25 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b28 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj38 = defaultedMap30.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap37);
        defaultedMap30.clear();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap30);
        boolean b41 = defaultedMap1.containsKey((java.lang.Object) map40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap43.remove(obj47);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b54 = defaultedMap52.containsValue((java.lang.Object) ' ');
        java.util.Set set55 = defaultedMap52.entrySet();
        java.lang.Object obj57 = defaultedMap52.get((java.lang.Object) 100L);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, obj57);
        defaultedMap1.putAll(map58);
        java.util.Set set60 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + (short) 100 + "'", obj57.equals((short) 100));
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(set60);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap9.containsValue(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) predicateUtils13);
        java.lang.String str15 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "hi!" + "'", obj14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{=100.0}" + "'", str15.equals("{=100.0}"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) ' ');
        java.util.Set set13 = defaultedMap10.entrySet();
        boolean b15 = defaultedMap10.equals((java.lang.Object) 100.0f);
        java.lang.Object obj16 = defaultedMap5.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set17 = defaultedMap5.entrySet();
        java.lang.Object obj18 = defaultedMap1.put(obj3, (java.lang.Object) defaultedMap5);
        java.util.Set set19 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "hi!" + "'", obj7.equals("hi!"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) ' ');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Set set6 = defaultedMap1.keySet();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap9.remove(obj13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) ' ');
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) 100L);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj23);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.Transformer transformer26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 100 + "'", obj23.equals((short) 100));
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) ' ');
        java.util.Set set13 = defaultedMap10.entrySet();
        boolean b15 = defaultedMap10.equals((java.lang.Object) 100.0f);
        java.lang.Object obj16 = defaultedMap5.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set17 = defaultedMap5.entrySet();
        java.lang.Object obj18 = defaultedMap1.put(obj3, (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) ' ');
        java.util.Set set28 = defaultedMap25.entrySet();
        boolean b30 = defaultedMap25.equals((java.lang.Object) 100.0f);
        java.lang.Object obj31 = defaultedMap20.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b34 = defaultedMap33.isEmpty();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        defaultedMap33.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj44 = defaultedMap36.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap43);
        defaultedMap36.clear();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) defaultedMap36);
        java.lang.Object obj47 = defaultedMap1.get((java.lang.Object) map46);
        collections.Factory factory48 = null;
        try {
            java.util.Map map49 = collections.map.DefaultedMap.decorate(map46, factory48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "hi!" + "'", obj7.equals("hi!"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + "hi!" + "'", obj47.equals("hi!"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) ' ');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) ' ');
        java.util.Set set4 = defaultedMap1.entrySet();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.util.Set set7 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i9 = defaultedMap4.size();
        java.lang.String str10 = defaultedMap4.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj12 = defaultedMap4.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b16 = defaultedMap14.containsValue((java.lang.Object) ' ');
        java.util.Set set17 = defaultedMap14.entrySet();
        java.lang.String str18 = defaultedMap14.toString();
        java.lang.String str19 = defaultedMap14.toString();
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) str19);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "hi!" + "'", obj20.equals("hi!"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 0, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        try {
            elitisticListPopulation5.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        double d7 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) (short) 1, (double) 1L);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9);
        try {
            math.genetics.Chromosome chromosome15 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(d7 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        double d7 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        try {
            math.genetics.Chromosome chromosome10 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(d7 == 1.0d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) ' ');
        java.lang.Object obj4 = null;
        boolean b5 = defaultedMap1.containsValue(obj4);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap10.remove(obj14);
        java.lang.Object obj16 = defaultedMap4.put(obj8, obj15);
        boolean b18 = defaultedMap4.containsValue((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate21, predicate26);
        boolean b30 = defaultedMap1.containsValue((java.lang.Object) map29);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        try {
            elitisticListPopulation5.setElitismRate((-1.0d));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) ' ');
        java.util.Set set31 = defaultedMap28.entrySet();
        boolean b33 = defaultedMap28.equals((java.lang.Object) 100.0f);
        java.lang.Object obj34 = defaultedMap23.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap36.containsValue(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap40.remove(obj44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate46, predicate50);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate50, predicate53);
        java.lang.Object obj55 = defaultedMap1.put((java.lang.Object) 100.0f, (java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) predicate58);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate64, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate58, predicate64);
        java.util.Set set68 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!" + "'", obj25.equals("hi!"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(set68);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 0, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        elitisticListPopulation5.setPopulationLimit(100);
        try {
            elitisticListPopulation5.setElitismRate((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap23.containsValue(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap27.remove(obj31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate33, predicate37);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate37, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate40, predicate42);
        collections.Transformer transformer44 = null;
        try {
            java.util.Map map45 = collections.map.DefaultedMap.decorate(map43, transformer44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap9.containsValue(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.lang.String str13 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        java.lang.Object obj19 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap21.remove(obj25);
        java.lang.Object obj27 = defaultedMap15.put(obj19, obj26);
        boolean b29 = defaultedMap15.containsValue((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate32, predicate37);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate37, predicate44);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        try {
            elitisticListPopulation5.setPopulationLimit((-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) ' ');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap7.remove(obj11);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        double d14 = elitisticListPopulation12.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) (short) 1, (double) 1L);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.lang.String str23 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(d14 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]" + "'", str23.equals("[]"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) ' ');
        java.util.Set set4 = defaultedMap1.entrySet();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 100L);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate11);
        java.util.Collection collection14 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b17 = defaultedMap16.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        boolean b24 = defaultedMap1.containsValue((java.lang.Object) defaultedMap16);
        collections.Transformer transformer25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) -1, (double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        double d7 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) (short) 1, (double) 1L);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation5.addChromosome(chromosome15);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(d7 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) ' ');
        java.util.Set set31 = defaultedMap28.entrySet();
        boolean b33 = defaultedMap28.equals((java.lang.Object) 100.0f);
        java.lang.Object obj34 = defaultedMap23.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap36.containsValue(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap40.remove(obj44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate46, predicate50);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate50, predicate53);
        java.lang.Object obj55 = defaultedMap1.put((java.lang.Object) 100.0f, (java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj59 = defaultedMap57.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b64 = defaultedMap62.containsValue((java.lang.Object) ' ');
        java.util.Set set65 = defaultedMap62.entrySet();
        boolean b67 = defaultedMap62.equals((java.lang.Object) 100.0f);
        java.lang.Object obj68 = defaultedMap57.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate71, predicate72);
        java.lang.Object obj76 = defaultedMap70.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj77 = defaultedMap57.get((java.lang.Object) defaultedMap70);
        defaultedMap70.clear();
        boolean b79 = defaultedMap36.containsKey((java.lang.Object) defaultedMap70);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj83 = defaultedMap81.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b88 = defaultedMap86.containsValue((java.lang.Object) ' ');
        java.util.Set set89 = defaultedMap86.entrySet();
        boolean b91 = defaultedMap86.equals((java.lang.Object) 100.0f);
        java.lang.Object obj92 = defaultedMap81.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set93 = defaultedMap81.entrySet();
        java.util.Map map94 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) defaultedMap81);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!" + "'", obj25.equals("hi!"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "hi!" + "'", obj59.equals("hi!"));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + "hi!" + "'", obj77.equals("hi!"));
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + "hi!" + "'", obj83.equals("hi!"));
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(set93);
        org.junit.Assert.assertNotNull(map94);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation5.addChromosome(chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) ' ');
        java.util.Set set13 = defaultedMap10.entrySet();
        boolean b15 = defaultedMap10.equals((java.lang.Object) 100.0f);
        java.lang.Object obj16 = defaultedMap5.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set17 = defaultedMap5.entrySet();
        java.lang.Object obj18 = defaultedMap1.put(obj3, (java.lang.Object) defaultedMap5);
        java.util.Collection collection19 = defaultedMap1.values();
        java.util.Set set20 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap22.remove(obj26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate28, predicate32);
        java.util.Set set35 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b39 = defaultedMap37.containsValue((java.lang.Object) ' ');
        java.util.Set set40 = defaultedMap37.entrySet();
        java.lang.String str41 = defaultedMap37.toString();
        defaultedMap37.clear();
        java.lang.Object obj43 = defaultedMap22.remove((java.lang.Object) defaultedMap37);
        boolean b44 = defaultedMap1.equals((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "hi!" + "'", obj7.equals("hi!"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) ' ');
        java.util.Set set13 = defaultedMap10.entrySet();
        boolean b15 = defaultedMap10.equals((java.lang.Object) 100.0f);
        java.lang.Object obj16 = defaultedMap5.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set17 = defaultedMap5.entrySet();
        java.lang.Object obj18 = defaultedMap1.put(obj3, (java.lang.Object) defaultedMap5);
        int i19 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) (short) 1, (double) 1L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome28 = elitisticListPopulation27.iterator();
        math.genetics.Population population29 = elitisticListPopulation27.nextGeneration();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str32 = defaultedMap31.toString();
        java.util.Collection collection33 = defaultedMap31.values();
        java.lang.Object obj34 = defaultedMap21.put((java.lang.Object) elitisticListPopulation27, (java.lang.Object) collection33);
        boolean b35 = defaultedMap5.containsValue((java.lang.Object) elitisticListPopulation27);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "hi!" + "'", obj7.equals("hi!"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome28);
        org.junit.Assert.assertNotNull(population29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        double d7 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        java.lang.String str10 = elitisticListPopulation5.toString();
        int i11 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(d7 == 1.0d);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[null]" + "'", str10.equals("[null]"));
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate11);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate(map13, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        int i7 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate11);
        java.util.Collection collection14 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b17 = defaultedMap16.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        boolean b24 = defaultedMap1.containsValue((java.lang.Object) defaultedMap16);
        int i25 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) ' ');
        java.util.Set set19 = defaultedMap16.entrySet();
        boolean b21 = defaultedMap16.equals((java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap11.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.lang.Object obj30 = defaultedMap24.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj31 = defaultedMap11.get((java.lang.Object) defaultedMap24);
        defaultedMap24.clear();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj35 = null;
        boolean b36 = defaultedMap34.containsValue(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        java.lang.Object obj42 = null;
        java.lang.Object obj43 = defaultedMap38.remove(obj42);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate44, predicate48);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate48, predicate51);
        java.lang.Object obj53 = defaultedMap24.get((java.lang.Object) defaultedMap34);
        boolean b54 = defaultedMap9.containsValue((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "hi!" + "'", obj13.equals("hi!"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "hi!" + "'", obj31.equals("hi!"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + "hi!" + "'", obj53.equals("hi!"));
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Collection collection2 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) ' ');
        java.util.Set set24 = defaultedMap21.entrySet();
        boolean b26 = defaultedMap21.equals((java.lang.Object) 100.0f);
        java.lang.Object obj27 = defaultedMap16.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set28 = defaultedMap16.entrySet();
        boolean b29 = defaultedMap14.equals((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) b29);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) ' ');
        java.util.Set set31 = defaultedMap28.entrySet();
        boolean b33 = defaultedMap28.equals((java.lang.Object) 100.0f);
        java.lang.Object obj34 = defaultedMap23.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap36.containsValue(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap40.remove(obj44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate46, predicate50);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate50, predicate53);
        java.lang.Object obj55 = defaultedMap1.put((java.lang.Object) 100.0f, (java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj59 = defaultedMap57.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b64 = defaultedMap62.containsValue((java.lang.Object) ' ');
        java.util.Set set65 = defaultedMap62.entrySet();
        boolean b67 = defaultedMap62.equals((java.lang.Object) 100.0f);
        java.lang.Object obj68 = defaultedMap57.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate71, predicate72);
        java.lang.Object obj76 = defaultedMap70.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj77 = defaultedMap57.get((java.lang.Object) defaultedMap70);
        defaultedMap70.clear();
        boolean b79 = defaultedMap36.containsKey((java.lang.Object) defaultedMap70);
        math.genetics.Chromosome[] chromosome_array80 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome81 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b82 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome81, chromosome_array80);
        math.genetics.ElitisticListPopulation elitisticListPopulation85 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome81, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome86 = elitisticListPopulation85.getChromosomes();
        double d87 = elitisticListPopulation85.getElitismRate();
        math.genetics.Chromosome[] chromosome_array88 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome89 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b90 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome89, chromosome_array88);
        math.genetics.ElitisticListPopulation elitisticListPopulation93 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome89, (int) (short) 1, (double) 1L);
        elitisticListPopulation85.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome89);
        math.genetics.Chromosome chromosome95 = null;
        elitisticListPopulation85.addChromosome(chromosome95);
        java.util.List<math.genetics.Chromosome> list_chromosome97 = elitisticListPopulation85.getChromosomes();
        java.lang.Object obj98 = defaultedMap36.remove((java.lang.Object) elitisticListPopulation85);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!" + "'", obj25.equals("hi!"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "hi!" + "'", obj59.equals("hi!"));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + "hi!" + "'", obj77.equals("hi!"));
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(chromosome_array80);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(list_chromosome86);
        org.junit.Assert.assertTrue(d87 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array88);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNotNull(list_chromosome97);
        org.junit.Assert.assertNull(obj98);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.String str9 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap11.remove(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) ' ');
        java.util.Set set23 = defaultedMap20.entrySet();
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) 100L);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, obj25);
        boolean b28 = defaultedMap11.containsKey((java.lang.Object) (-1));
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) b28);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{=100.0}" + "'", str9.equals("{=100.0}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "hi!" + "'", obj29.equals("hi!"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap24.containsValue(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap28.remove(obj32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate34, predicate38);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate38, predicate41);
        java.lang.Object obj43 = defaultedMap14.get((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate46, predicate47);
        java.lang.Object obj49 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate52, predicate53);
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = defaultedMap51.remove(obj55);
        java.lang.Object obj57 = defaultedMap45.put(obj49, obj56);
        boolean b59 = defaultedMap45.containsValue((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate62, predicate63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate67, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate62, predicate67);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate67, predicate71);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "hi!" + "'", obj43.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        double d7 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) (short) 1, (double) 1L);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation5.addChromosome(chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation(list_chromosome17, (int) (short) 1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(d7 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(list_chromosome17);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) ' ');
        java.util.Set set23 = defaultedMap20.entrySet();
        boolean b25 = defaultedMap20.equals((java.lang.Object) 100.0f);
        java.lang.Object obj26 = defaultedMap15.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        java.lang.Object obj34 = defaultedMap28.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj35 = defaultedMap15.get((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b44 = defaultedMap42.containsValue((java.lang.Object) ' ');
        java.util.Set set45 = defaultedMap42.entrySet();
        boolean b47 = defaultedMap42.equals((java.lang.Object) 100.0f);
        java.lang.Object obj48 = defaultedMap37.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj51 = null;
        boolean b52 = defaultedMap50.containsValue(obj51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap54.remove(obj58);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate63, predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate60, predicate64);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate64, predicate67);
        java.lang.Object obj69 = defaultedMap15.put((java.lang.Object) 100.0f, (java.lang.Object) defaultedMap50);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate72, predicate73);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) predicate72);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate78, predicate79);
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate72, predicate78);
        java.util.Collection collection82 = defaultedMap15.values();
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        java.lang.String str84 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + "hi!" + "'", obj35.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "{10.0=100.0}" + "'", str84.equals("{10.0=100.0}"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) ' ');
        java.util.Set set31 = defaultedMap28.entrySet();
        boolean b33 = defaultedMap28.equals((java.lang.Object) 100.0f);
        java.lang.Object obj34 = defaultedMap23.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap36.containsValue(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap40.remove(obj44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate46, predicate50);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate50, predicate53);
        java.lang.Object obj55 = defaultedMap1.put((java.lang.Object) 100.0f, (java.lang.Object) defaultedMap36);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate59, predicate60);
        java.lang.Object obj62 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate65, predicate66);
        java.lang.Object obj68 = null;
        java.lang.Object obj69 = defaultedMap64.remove(obj68);
        java.lang.Object obj70 = defaultedMap58.put(obj62, obj69);
        java.lang.Object obj72 = null;
        java.lang.Object obj73 = defaultedMap58.put((java.lang.Object) (-1.0f), obj72);
        math.genetics.Chromosome[] chromosome_array74 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome75 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b76 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome75, chromosome_array74);
        math.genetics.ElitisticListPopulation elitisticListPopulation79 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome75, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome80 = elitisticListPopulation79.getChromosomes();
        double d81 = elitisticListPopulation79.getElitismRate();
        math.genetics.Chromosome chromosome82 = null;
        elitisticListPopulation79.addChromosome(chromosome82);
        elitisticListPopulation79.setPopulationLimit(1);
        java.lang.Object obj86 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) elitisticListPopulation79);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!" + "'", obj25.equals("hi!"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(chromosome_array74);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(list_chromosome80);
        org.junit.Assert.assertTrue(d81 == 1.0d);
        org.junit.Assert.assertNull(obj86);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        elitisticListPopulation5.setPopulationLimit(100);
        int i8 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation14.getChromosomes();
        double d16 = elitisticListPopulation14.getElitismRate();
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation14.addChromosome(chromosome17);
        int i19 = elitisticListPopulation14.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome20);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue(d16 == 1.0d);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNotNull(list_chromosome20);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) ' ');
        java.util.Set set13 = defaultedMap10.entrySet();
        boolean b15 = defaultedMap10.equals((java.lang.Object) 100.0f);
        java.lang.Object obj16 = defaultedMap5.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set17 = defaultedMap5.entrySet();
        java.lang.Object obj18 = defaultedMap1.put(obj3, (java.lang.Object) defaultedMap5);
        defaultedMap1.clear();
        java.lang.String str20 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str23 = defaultedMap22.toString();
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) ' ');
        java.util.Set set34 = defaultedMap31.entrySet();
        boolean b36 = defaultedMap31.equals((java.lang.Object) 100.0f);
        java.lang.Object obj37 = defaultedMap26.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set38 = defaultedMap26.entrySet();
        java.lang.Object obj39 = defaultedMap22.put(obj24, (java.lang.Object) defaultedMap26);
        java.util.Collection collection40 = defaultedMap22.values();
        boolean b41 = defaultedMap1.containsValue((java.lang.Object) collection40);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "hi!" + "'", obj7.equals("hi!"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "hi!" + "'", obj28.equals("hi!"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = null;
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj4);
        java.lang.String str6 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate11);
        java.util.Set set14 = defaultedMap1.keySet();
        boolean b15 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) ' ');
        java.util.Set set31 = defaultedMap28.entrySet();
        boolean b33 = defaultedMap28.equals((java.lang.Object) 100.0f);
        java.lang.Object obj34 = defaultedMap23.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap36.containsValue(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap40.remove(obj44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate46, predicate50);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate50, predicate53);
        java.lang.Object obj55 = defaultedMap1.put((java.lang.Object) 100.0f, (java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) predicate58);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate64, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate58, predicate64);
        java.util.Collection collection68 = defaultedMap1.values();
        int i69 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!" + "'", obj25.equals("hi!"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue(i69 == 2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) ' ');
        java.util.Set set13 = defaultedMap10.entrySet();
        java.lang.String str14 = defaultedMap10.toString();
        java.lang.String str15 = defaultedMap10.toString();
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) str15);
        java.util.Collection collection17 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate11);
        java.util.Set set14 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) ' ');
        java.util.Set set19 = defaultedMap16.entrySet();
        java.lang.String str20 = defaultedMap16.toString();
        defaultedMap16.clear();
        java.lang.Object obj22 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str25 = defaultedMap24.toString();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b35 = defaultedMap33.containsValue((java.lang.Object) ' ');
        java.util.Set set36 = defaultedMap33.entrySet();
        boolean b38 = defaultedMap33.equals((java.lang.Object) 100.0f);
        java.lang.Object obj39 = defaultedMap28.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set40 = defaultedMap28.entrySet();
        java.lang.Object obj41 = defaultedMap24.put(obj26, (java.lang.Object) defaultedMap28);
        int i42 = defaultedMap28.size();
        java.util.Set set43 = defaultedMap28.keySet();
        java.lang.Object obj44 = defaultedMap1.get((java.lang.Object) set43);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "hi!" + "'", obj30.equals("hi!"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        elitisticListPopulation5.setPopulationLimit((int) (short) 10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap13.remove(obj17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b35 = defaultedMap33.containsValue((java.lang.Object) ' ');
        java.util.Set set36 = defaultedMap33.entrySet();
        boolean b38 = defaultedMap33.equals((java.lang.Object) 100.0f);
        java.lang.Object obj39 = defaultedMap28.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set40 = defaultedMap28.entrySet();
        boolean b41 = defaultedMap26.equals((java.lang.Object) defaultedMap28);
        java.util.Collection collection42 = defaultedMap26.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection42);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "hi!" + "'", obj30.equals("hi!"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) ' ');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate11);
        java.util.Set set14 = defaultedMap1.keySet();
        java.util.Set set15 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) ' ');
        java.util.Set set25 = defaultedMap22.entrySet();
        boolean b27 = defaultedMap22.equals((java.lang.Object) 100.0f);
        java.lang.Object obj28 = defaultedMap17.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b37 = defaultedMap35.containsValue((java.lang.Object) ' ');
        java.util.Set set38 = defaultedMap35.entrySet();
        boolean b40 = defaultedMap35.equals((java.lang.Object) 100.0f);
        java.lang.Object obj41 = defaultedMap30.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b44 = defaultedMap43.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        defaultedMap43.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj54 = defaultedMap46.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap53);
        defaultedMap46.clear();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) defaultedMap46);
        boolean b57 = defaultedMap17.containsKey((java.lang.Object) map56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate60, predicate61);
        java.lang.Object obj63 = null;
        java.lang.Object obj64 = defaultedMap59.remove(obj63);
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b70 = defaultedMap68.containsValue((java.lang.Object) ' ');
        java.util.Set set71 = defaultedMap68.entrySet();
        java.lang.Object obj73 = defaultedMap68.get((java.lang.Object) 100L);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, obj73);
        defaultedMap17.putAll(map74);
        boolean b76 = defaultedMap1.containsKey((java.lang.Object) defaultedMap17);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "hi!" + "'", obj19.equals("hi!"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "hi!" + "'", obj32.equals("hi!"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + (short) 100 + "'", obj73.equals((short) 100));
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) ' ');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) (short) 1, (double) 1L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        math.genetics.Population population9 = elitisticListPopulation7.nextGeneration();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str12 = defaultedMap11.toString();
        java.util.Collection collection13 = defaultedMap11.values();
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation7, (java.lang.Object) collection13);
        elitisticListPopulation7.setElitismRate(0.0d);
        math.genetics.Population population17 = elitisticListPopulation7.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(population17);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap1.entrySet();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        java.lang.Object obj24 = defaultedMap18.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str27 = defaultedMap26.toString();
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b37 = defaultedMap35.containsValue((java.lang.Object) ' ');
        java.util.Set set38 = defaultedMap35.entrySet();
        boolean b40 = defaultedMap35.equals((java.lang.Object) 100.0f);
        java.lang.Object obj41 = defaultedMap30.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set42 = defaultedMap30.entrySet();
        java.lang.Object obj43 = defaultedMap26.put(obj28, (java.lang.Object) defaultedMap30);
        java.lang.Object obj44 = defaultedMap18.get(obj43);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj48 = null;
        boolean b49 = defaultedMap47.containsValue(obj48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate52, predicate53);
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = defaultedMap51.remove(obj55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate60, predicate61);
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate57, predicate61);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate61, predicate64);
        boolean b66 = defaultedMap18.containsKey((java.lang.Object) predicate64);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate69, predicate70);
        java.lang.Object obj72 = null;
        java.lang.Object obj73 = defaultedMap68.remove(obj72);
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate77, predicate78);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate74, predicate78);
        java.util.Collection collection81 = defaultedMap68.values();
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b84 = defaultedMap83.isEmpty();
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap86, predicate87, predicate88);
        defaultedMap83.putAll((java.util.Map) defaultedMap86);
        boolean b91 = defaultedMap68.containsValue((java.lang.Object) defaultedMap83);
        java.util.Set set92 = defaultedMap68.keySet();
        boolean b93 = defaultedMap18.containsKey((java.lang.Object) set92);
        int i94 = defaultedMap18.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100.0f + "'", obj16.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "hi!" + "'", obj32.equals("hi!"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertNotNull(set92);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertTrue(i94 == 1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        double d7 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str12 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(d7 == 1.0d);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[null]" + "'", str12.equals("[null]"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        int i10 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        double d8 = elitisticListPopulation5.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate11);
        java.util.Collection collection14 = defaultedMap1.values();
        int i15 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str18 = defaultedMap17.toString();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) ' ');
        java.util.Set set29 = defaultedMap26.entrySet();
        boolean b31 = defaultedMap26.equals((java.lang.Object) 100.0f);
        java.lang.Object obj32 = defaultedMap21.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set33 = defaultedMap21.entrySet();
        java.lang.Object obj34 = defaultedMap17.put(obj19, (java.lang.Object) defaultedMap21);
        boolean b35 = defaultedMap17.isEmpty();
        boolean b36 = defaultedMap1.containsKey((java.lang.Object) defaultedMap17);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "hi!" + "'", obj23.equals("hi!"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        java.lang.Object obj9 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap11.remove(obj15);
        java.lang.Object obj17 = defaultedMap5.put(obj9, obj16);
        boolean b18 = defaultedMap1.containsKey(obj9);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation(10, 0.0d);
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (short) 1, (double) 1L);
        elitisticListPopulation6.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) arraylist_chromosome8);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        double d7 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        elitisticListPopulation5.setElitismRate((double) 0L);
        math.genetics.Population population12 = elitisticListPopulation5.nextGeneration();
        java.lang.String str13 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(d7 == 1.0d);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[null]" + "'", str13.equals("[null]"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap9.containsValue(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) ' ');
        java.util.Set set22 = defaultedMap19.entrySet();
        boolean b24 = defaultedMap19.equals((java.lang.Object) 100.0f);
        java.lang.Object obj25 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        java.lang.Object obj33 = defaultedMap27.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj34 = defaultedMap14.get((java.lang.Object) defaultedMap27);
        boolean b35 = defaultedMap1.containsKey(obj34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap37.remove(obj41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate46, predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate43, predicate47);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap37);
        java.lang.String str51 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!" + "'", obj34.equals("hi!"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{=100.0}" + "'", str51.equals("{=100.0}"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap10.remove(obj14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate20);
        java.util.Set set23 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) ' ');
        java.util.Set set28 = defaultedMap25.entrySet();
        java.lang.String str29 = defaultedMap25.toString();
        defaultedMap25.clear();
        java.lang.Object obj31 = defaultedMap10.remove((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) defaultedMap33);
        boolean b35 = defaultedMap1.containsKey((java.lang.Object) defaultedMap33);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = defaultedMap1.get(obj4);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "hi!" + "'", obj6.equals("hi!"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) ' ');
        java.util.Set set15 = defaultedMap12.entrySet();
        boolean b17 = defaultedMap12.equals((java.lang.Object) 100.0f);
        java.lang.Object obj18 = defaultedMap7.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b21 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj31 = defaultedMap23.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap30);
        defaultedMap23.clear();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        java.lang.Object obj39 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate42, predicate43);
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap41.remove(obj45);
        java.lang.Object obj47 = defaultedMap35.put(obj39, obj46);
        java.lang.Object obj49 = null;
        java.lang.Object obj50 = defaultedMap35.put((java.lang.Object) (-1.0f), obj49);
        java.lang.Object obj52 = defaultedMap23.put(obj50, (java.lang.Object) 1.0d);
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome59 = elitisticListPopulation58.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome60 = elitisticListPopulation58.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome61 = elitisticListPopulation58.getChromosomes();
        java.lang.Object obj62 = defaultedMap23.get((java.lang.Object) list_chromosome61);
        elitisticListPopulation5.setChromosomes(list_chromosome61);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "hi!" + "'", obj9.equals("hi!"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(list_chromosome59);
        org.junit.Assert.assertNotNull(iterator_chromosome60);
        org.junit.Assert.assertNotNull(list_chromosome61);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + "hi!" + "'", obj62.equals("hi!"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap7.remove(obj11);
        java.lang.Object obj13 = defaultedMap1.put(obj5, obj12);
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (short) 100);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap18.remove(obj22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate24, predicate28);
        java.util.Collection collection31 = defaultedMap18.values();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b34 = defaultedMap33.isEmpty();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        defaultedMap33.putAll((java.util.Map) defaultedMap36);
        boolean b41 = defaultedMap18.containsValue((java.lang.Object) defaultedMap33);
        java.util.Set set42 = defaultedMap18.keySet();
        boolean b43 = defaultedMap1.containsValue((java.lang.Object) set42);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b5 = defaultedMap1.isEmpty();
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100);
        java.util.Map map9 = null;
        try {
            defaultedMap1.putAll(map9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(iterator_chromosome10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        double d7 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        int i10 = elitisticListPopulation5.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation5.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(d7 == 1.0d);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap1.entrySet();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        java.lang.Object obj24 = defaultedMap18.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str27 = defaultedMap26.toString();
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b37 = defaultedMap35.containsValue((java.lang.Object) ' ');
        java.util.Set set38 = defaultedMap35.entrySet();
        boolean b40 = defaultedMap35.equals((java.lang.Object) 100.0f);
        java.lang.Object obj41 = defaultedMap30.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set42 = defaultedMap30.entrySet();
        java.lang.Object obj43 = defaultedMap26.put(obj28, (java.lang.Object) defaultedMap30);
        java.lang.Object obj44 = defaultedMap18.get(obj43);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj48 = null;
        boolean b49 = defaultedMap47.containsValue(obj48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate52, predicate53);
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = defaultedMap51.remove(obj55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate60, predicate61);
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate57, predicate61);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate61, predicate64);
        boolean b66 = defaultedMap18.containsKey((java.lang.Object) predicate64);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b69 = defaultedMap68.isEmpty();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate72, predicate73);
        defaultedMap68.putAll((java.util.Map) defaultedMap71);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap71);
        boolean b77 = defaultedMap18.equals((java.lang.Object) defaultedMap76);
        math.genetics.Chromosome[] chromosome_array78 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome79 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b80 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome79, chromosome_array78);
        math.genetics.ElitisticListPopulation elitisticListPopulation83 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome79, (int) (short) 1, (double) 1L);
        int i84 = elitisticListPopulation83.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome85 = elitisticListPopulation83.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome86 = elitisticListPopulation83.getChromosomes();
        boolean b87 = defaultedMap18.containsValue((java.lang.Object) list_chromosome86);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation90 = new math.genetics.ElitisticListPopulation(list_chromosome86, (int) (byte) 0, (double) 2);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100.0f + "'", obj16.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "hi!" + "'", obj32.equals("hi!"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(chromosome_array78);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(i84 == 1);
        org.junit.Assert.assertNotNull(iterator_chromosome85);
        org.junit.Assert.assertNotNull(list_chromosome86);
        org.junit.Assert.assertTrue(b87 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.String str9 = defaultedMap1.toString();
        collections.Predicate predicate10 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) ' ');
        java.util.Set set20 = defaultedMap17.entrySet();
        boolean b22 = defaultedMap17.equals((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap12.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.lang.Object obj31 = defaultedMap25.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj32 = defaultedMap12.get((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b41 = defaultedMap39.containsValue((java.lang.Object) ' ');
        java.util.Set set42 = defaultedMap39.entrySet();
        boolean b44 = defaultedMap39.equals((java.lang.Object) 100.0f);
        java.lang.Object obj45 = defaultedMap34.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj48 = null;
        boolean b49 = defaultedMap47.containsValue(obj48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate52, predicate53);
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = defaultedMap51.remove(obj55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate60, predicate61);
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate57, predicate61);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate61, predicate64);
        java.lang.Object obj66 = defaultedMap12.put((java.lang.Object) 100.0f, (java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate69, predicate70);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) predicate69);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate75, predicate76);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate69, predicate75);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate75);
        int i80 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{=100.0}" + "'", str9.equals("{=100.0}"));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "hi!" + "'", obj14.equals("hi!"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "hi!" + "'", obj32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + "hi!" + "'", obj36.equals("hi!"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(i80 == 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) ' ');
        java.util.Set set24 = defaultedMap21.entrySet();
        boolean b26 = defaultedMap21.equals((java.lang.Object) 100.0f);
        java.lang.Object obj27 = defaultedMap16.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set28 = defaultedMap16.entrySet();
        boolean b29 = defaultedMap14.equals((java.lang.Object) defaultedMap16);
        boolean b30 = defaultedMap14.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        elitisticListPopulation5.setPopulationLimit(100);
        int i8 = elitisticListPopulation5.getPopulationSize();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) ' ');
        java.util.Set set18 = defaultedMap15.entrySet();
        boolean b20 = defaultedMap15.equals((java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap10.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b24 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        defaultedMap23.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj34 = defaultedMap26.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap33);
        defaultedMap26.clear();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        java.lang.Object obj42 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = defaultedMap44.remove(obj48);
        java.lang.Object obj50 = defaultedMap38.put(obj42, obj49);
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap38.put((java.lang.Object) (-1.0f), obj52);
        java.lang.Object obj55 = defaultedMap26.put(obj53, (java.lang.Object) 1.0d);
        math.genetics.Chromosome[] chromosome_array56 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome57 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b58 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57, chromosome_array56);
        math.genetics.ElitisticListPopulation elitisticListPopulation61 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome57, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome62 = elitisticListPopulation61.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome63 = elitisticListPopulation61.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome64 = elitisticListPopulation61.getChromosomes();
        java.lang.Object obj65 = defaultedMap26.get((java.lang.Object) list_chromosome64);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome64);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + "hi!" + "'", obj12.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(chromosome_array56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(list_chromosome62);
        org.junit.Assert.assertNotNull(iterator_chromosome63);
        org.junit.Assert.assertNotNull(list_chromosome64);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + "hi!" + "'", obj65.equals("hi!"));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) ' ');
        java.util.Set set24 = defaultedMap21.entrySet();
        boolean b26 = defaultedMap21.equals((java.lang.Object) 100.0f);
        java.lang.Object obj27 = defaultedMap16.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set28 = defaultedMap16.entrySet();
        boolean b29 = defaultedMap14.equals((java.lang.Object) defaultedMap16);
        java.util.Collection collection30 = defaultedMap14.values();
        java.lang.String str31 = defaultedMap14.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) ' ');
        java.util.Set set13 = defaultedMap10.entrySet();
        boolean b15 = defaultedMap10.equals((java.lang.Object) 100.0f);
        java.lang.Object obj16 = defaultedMap5.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set17 = defaultedMap5.entrySet();
        java.lang.Object obj18 = defaultedMap1.put(obj3, (java.lang.Object) defaultedMap5);
        int i19 = defaultedMap5.size();
        java.util.Set set20 = defaultedMap5.keySet();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b25 = defaultedMap24.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        defaultedMap24.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj35 = defaultedMap27.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap34);
        java.lang.Object obj36 = defaultedMap22.get((java.lang.Object) defaultedMap27);
        java.lang.String str37 = defaultedMap22.toString();
        boolean b38 = defaultedMap5.containsValue((java.lang.Object) str37);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "hi!" + "'", obj7.equals("hi!"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) ' ');
        java.util.Set set13 = defaultedMap10.entrySet();
        java.lang.String str14 = defaultedMap10.toString();
        java.lang.String str15 = defaultedMap10.toString();
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) str15);
        java.lang.Object obj17 = null;
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj17);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        double d8 = elitisticListPopulation5.getElitismRate();
        int i9 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        double d7 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        double d10 = elitisticListPopulation5.getElitismRate();
        int i11 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(d7 == 1.0d);
        org.junit.Assert.assertTrue(d10 == 1.0d);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 0, (double) 1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) ' ');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Set set6 = defaultedMap1.keySet();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap9.remove(obj13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) ' ');
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) 100L);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj23);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        java.lang.Object obj33 = defaultedMap27.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str36 = defaultedMap35.toString();
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) ' ');
        java.util.Set set47 = defaultedMap44.entrySet();
        boolean b49 = defaultedMap44.equals((java.lang.Object) 100.0f);
        java.lang.Object obj50 = defaultedMap39.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set51 = defaultedMap39.entrySet();
        java.lang.Object obj52 = defaultedMap35.put(obj37, (java.lang.Object) defaultedMap39);
        java.lang.Object obj53 = defaultedMap27.get(obj52);
        boolean b54 = defaultedMap27.isEmpty();
        boolean b55 = defaultedMap9.equals((java.lang.Object) b54);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 100 + "'", obj23.equals((short) 100));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + "hi!" + "'", obj41.equals("hi!"));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + "hi!" + "'", obj53.equals("hi!"));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        double d7 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        java.lang.String str10 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 10);
        elitisticListPopulation5.setElitismRate((double) (byte) 1);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(d7 == 1.0d);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[null]" + "'", str10.equals("[null]"));
        org.junit.Assert.assertNotNull(iterator_chromosome11);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate11);
        java.util.Set set14 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) ' ');
        java.util.Set set19 = defaultedMap16.entrySet();
        java.lang.String str20 = defaultedMap16.toString();
        defaultedMap16.clear();
        java.lang.Object obj22 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        java.lang.String str23 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) (short) 1, (double) 1L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        math.genetics.Population population9 = elitisticListPopulation7.nextGeneration();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str12 = defaultedMap11.toString();
        java.util.Collection collection13 = defaultedMap11.values();
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation7, (java.lang.Object) collection13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        java.util.Collection collection22 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) ' ');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b15 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap24);
        defaultedMap17.clear();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        java.lang.Object obj33 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap35.remove(obj39);
        java.lang.Object obj41 = defaultedMap29.put(obj33, obj40);
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap29.put((java.lang.Object) (-1.0f), obj43);
        java.lang.Object obj46 = defaultedMap17.put(obj44, (java.lang.Object) 1.0d);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome53 = elitisticListPopulation52.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation52.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation52.getChromosomes();
        java.lang.Object obj56 = defaultedMap17.get((java.lang.Object) list_chromosome55);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome57 = list_chromosome55.spliterator();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(list_chromosome53);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "hi!" + "'", obj56.equals("hi!"));
        org.junit.Assert.assertNotNull(spliterator_chromosome57);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate11);
        java.util.Set set14 = defaultedMap1.keySet();
        java.util.Set set15 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection18 = defaultedMap17.values();
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) defaultedMap17);
        java.lang.String str20 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set23 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) ' ');
        java.util.Set set19 = defaultedMap16.entrySet();
        boolean b21 = defaultedMap16.equals((java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap11.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set23 = defaultedMap11.entrySet();
        java.lang.Object obj26 = defaultedMap11.put((java.lang.Object) 10.0d, (java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        java.lang.Object obj34 = defaultedMap28.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str37 = defaultedMap36.toString();
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) ' ');
        java.util.Set set48 = defaultedMap45.entrySet();
        boolean b50 = defaultedMap45.equals((java.lang.Object) 100.0f);
        java.lang.Object obj51 = defaultedMap40.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set52 = defaultedMap40.entrySet();
        java.lang.Object obj53 = defaultedMap36.put(obj38, (java.lang.Object) defaultedMap40);
        java.lang.Object obj54 = defaultedMap28.get(obj53);
        defaultedMap11.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj58 = null;
        boolean b59 = defaultedMap57.containsValue(obj58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate62, predicate63);
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = defaultedMap61.remove(obj65);
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate70, predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate67, predicate71);
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate71, predicate74);
        boolean b76 = defaultedMap28.containsKey((java.lang.Object) predicate74);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b79 = defaultedMap78.isEmpty();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap81, predicate82, predicate83);
        defaultedMap78.putAll((java.util.Map) defaultedMap81);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap81);
        boolean b87 = defaultedMap28.equals((java.lang.Object) defaultedMap86);
        math.genetics.Chromosome[] chromosome_array88 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome89 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b90 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome89, chromosome_array88);
        math.genetics.ElitisticListPopulation elitisticListPopulation93 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome89, (int) (short) 1, (double) 1L);
        int i94 = elitisticListPopulation93.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome95 = elitisticListPopulation93.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome96 = elitisticListPopulation93.getChromosomes();
        boolean b97 = defaultedMap28.containsValue((java.lang.Object) list_chromosome96);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome96);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "hi!" + "'", obj13.equals("hi!"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "hi!" + "'", obj42.equals("hi!"));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "hi!" + "'", obj54.equals("hi!"));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNotNull(chromosome_array88);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(i94 == 1);
        org.junit.Assert.assertNotNull(iterator_chromosome95);
        org.junit.Assert.assertNotNull(list_chromosome96);
        org.junit.Assert.assertTrue(b97 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        elitisticListPopulation5.setPopulationLimit((int) (short) 10);
        int i12 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(i12 == 10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) ' ');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Set set6 = defaultedMap1.keySet();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap9.remove(obj13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) ' ');
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) 100L);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj23);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        int i26 = defaultedMap9.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 100 + "'", obj23.equals((short) 100));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = null;
        boolean b5 = defaultedMap3.containsValue(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap7.remove(obj11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate13, predicate17);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate17, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) ' ');
        java.util.Set set31 = defaultedMap28.entrySet();
        boolean b33 = defaultedMap28.equals((java.lang.Object) 100.0f);
        java.lang.Object obj34 = defaultedMap23.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        java.lang.Object obj42 = defaultedMap36.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj43 = defaultedMap23.get((java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj46 = null;
        boolean b47 = defaultedMap45.containsValue(obj46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap49.remove(obj53);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate55, predicate59);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate59, predicate62);
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate62, predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate20, predicate62);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!" + "'", obj25.equals("hi!"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "hi!" + "'", obj43.equals("hi!"));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap9.containsValue(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap14.remove(obj18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate20, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b36 = defaultedMap34.containsValue((java.lang.Object) ' ');
        java.util.Set set37 = defaultedMap34.entrySet();
        boolean b39 = defaultedMap34.equals((java.lang.Object) 100.0f);
        java.lang.Object obj40 = defaultedMap29.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set41 = defaultedMap29.entrySet();
        boolean b42 = defaultedMap27.equals((java.lang.Object) defaultedMap29);
        java.util.Set set43 = defaultedMap27.entrySet();
        java.lang.Object obj44 = defaultedMap9.get((java.lang.Object) set43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap9);
        math.genetics.Chromosome[] chromosome_array46 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome47 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b48 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome47, chromosome_array46);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome47, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation51.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome53 = elitisticListPopulation51.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation51.getChromosomes();
        java.lang.Object obj55 = defaultedMap45.get((java.lang.Object) list_chromosome54);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "hi!" + "'", obj31.equals("hi!"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 100 + "'", obj44.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(list_chromosome52);
        org.junit.Assert.assertNotNull(iterator_chromosome53);
        org.junit.Assert.assertNotNull(list_chromosome54);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.String str9 = defaultedMap1.toString();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{=100.0}" + "'", str9.equals("{=100.0}"));
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) ' ');
        java.util.Set set22 = defaultedMap19.entrySet();
        boolean b24 = defaultedMap19.equals((java.lang.Object) 100.0f);
        java.lang.Object obj25 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b28 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj38 = defaultedMap30.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap37);
        defaultedMap30.clear();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap30);
        boolean b41 = defaultedMap1.containsKey((java.lang.Object) map40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap43.remove(obj47);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b54 = defaultedMap52.containsValue((java.lang.Object) ' ');
        java.util.Set set55 = defaultedMap52.entrySet();
        java.lang.Object obj57 = defaultedMap52.get((java.lang.Object) 100L);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, obj57);
        defaultedMap1.putAll(map58);
        int i60 = defaultedMap1.size();
        boolean b61 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + (short) 100 + "'", obj57.equals((short) 100));
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(i60 == 1);
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str10 = defaultedMap9.toString();
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) ' ');
        java.util.Set set21 = defaultedMap18.entrySet();
        boolean b23 = defaultedMap18.equals((java.lang.Object) 100.0f);
        java.lang.Object obj24 = defaultedMap13.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set25 = defaultedMap13.entrySet();
        java.lang.Object obj26 = defaultedMap9.put(obj11, (java.lang.Object) defaultedMap13);
        java.lang.Object obj27 = defaultedMap1.get(obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        java.lang.Object obj33 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap35.remove(obj39);
        java.lang.Object obj41 = defaultedMap29.put(obj33, obj40);
        boolean b42 = defaultedMap1.containsValue(obj40);
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap1.remove(obj43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "hi!" + "'", obj15.equals("hi!"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        java.lang.Object obj11 = defaultedMap5.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap13.containsValue(obj14);
        defaultedMap5.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, (double) (byte) 0);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        double d10 = elitisticListPopulation5.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation5.getChromosomes();
        try {
            elitisticListPopulation5.setElitismRate((double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(d10 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation5.addChromosome(chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 1.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str10 = defaultedMap9.toString();
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) ' ');
        java.util.Set set21 = defaultedMap18.entrySet();
        boolean b23 = defaultedMap18.equals((java.lang.Object) 100.0f);
        java.lang.Object obj24 = defaultedMap13.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set25 = defaultedMap13.entrySet();
        java.lang.Object obj26 = defaultedMap9.put(obj11, (java.lang.Object) defaultedMap13);
        java.lang.Object obj27 = defaultedMap1.get(obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        java.lang.Object obj33 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap35.remove(obj39);
        java.lang.Object obj41 = defaultedMap29.put(obj33, obj40);
        boolean b42 = defaultedMap1.containsValue(obj40);
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap1.remove(obj43);
        java.util.Set set45 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "hi!" + "'", obj15.equals("hi!"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((-1), (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) ' ');
        java.util.Set set24 = defaultedMap21.entrySet();
        boolean b26 = defaultedMap21.equals((java.lang.Object) 100.0f);
        java.lang.Object obj27 = defaultedMap16.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        java.util.Set set28 = defaultedMap16.entrySet();
        boolean b29 = defaultedMap14.equals((java.lang.Object) defaultedMap16);
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation35.getChromosomes();
        double d37 = elitisticListPopulation35.getElitismRate();
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) (short) 1, (double) 1L);
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39);
        boolean b45 = defaultedMap14.containsKey((java.lang.Object) arraylist_chromosome39);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertTrue(d37 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b15 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap24);
        defaultedMap17.clear();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        java.lang.Object obj33 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap35.remove(obj39);
        java.lang.Object obj41 = defaultedMap29.put(obj33, obj40);
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap29.put((java.lang.Object) (-1.0f), obj43);
        java.lang.Object obj46 = defaultedMap17.put(obj44, (java.lang.Object) 1.0d);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, (int) (short) 1, (double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome53 = elitisticListPopulation52.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation52.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation52.getChromosomes();
        java.lang.Object obj56 = defaultedMap17.get((java.lang.Object) list_chromosome55);
        math.genetics.ElitisticListPopulation elitisticListPopulation59 = new math.genetics.ElitisticListPopulation(list_chromosome55, (int) (short) 1, 0.0d);
        int i60 = elitisticListPopulation59.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(list_chromosome53);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "hi!" + "'", obj56.equals("hi!"));
        org.junit.Assert.assertTrue(i60 == 1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate11);
        java.util.Set set14 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) ' ');
        java.util.Set set19 = defaultedMap16.entrySet();
        java.lang.String str20 = defaultedMap16.toString();
        defaultedMap16.clear();
        java.lang.Object obj22 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        java.util.Set set23 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 1L);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation5.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.Predicate predicate0 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap3.remove(obj7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate9, predicate13);
        java.util.Collection collection16 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b19 = defaultedMap18.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        boolean b26 = defaultedMap3.containsValue((java.lang.Object) defaultedMap18);
        java.lang.Object obj28 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) "", (java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) ' ');
        java.util.Set set31 = defaultedMap28.entrySet();
        boolean b33 = defaultedMap28.equals((java.lang.Object) 100.0f);
        java.lang.Object obj34 = defaultedMap23.put((java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap36.containsValue(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap40.remove(obj44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate46, predicate50);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate50, predicate53);
        java.lang.Object obj55 = defaultedMap1.put((java.lang.Object) 100.0f, (java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) predicate58);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate64, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate58, predicate64);
        java.util.Collection collection68 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation71 = new math.genetics.ElitisticListPopulation(10, 0.0d);
        java.lang.Object obj72 = defaultedMap1.get((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!" + "'", obj25.equals("hi!"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + "hi!" + "'", obj72.equals("hi!"));
    }
}

