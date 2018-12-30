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
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (-1.0d));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
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
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
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
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (-1.0d));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 10.0d);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, 0.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) 1L);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) b9);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        try {
            math.genetics.Chromosome chromosome3 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 0, (double) '#');
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
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        try {
            math.genetics.Chromosome chromosome4 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate(map9, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        defaultedMap1.clear();
        int i9 = defaultedMap1.size();
        java.util.Set set10 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap1.keySet();
        java.lang.String str7 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b11 = defaultedMap5.isEmpty();
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 'a', (java.lang.Object) predicate21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        boolean b36 = defaultedMap33.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) 0);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate40);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate40, predicate43);
        boolean b45 = defaultedMap1.containsKey((java.lang.Object) predicate43);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        defaultedMap47.clear();
        boolean b50 = defaultedMap47.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj52 = defaultedMap47.get((java.lang.Object) 0);
        boolean b53 = defaultedMap1.containsKey((java.lang.Object) 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Collection collection8 = defaultedMap7.values();
        java.util.Set set9 = defaultedMap7.keySet();
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) set9);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        org.junit.Assert.assertNotNull(population3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        boolean b16 = defaultedMap13.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) 0);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj26 = defaultedMap21.get((java.lang.Object) 0);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate28);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate28, predicate31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        defaultedMap34.clear();
        boolean b37 = defaultedMap34.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) 0);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate40, predicate41);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        defaultedMap47.clear();
        boolean b50 = defaultedMap47.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate52);
        java.lang.Object obj54 = defaultedMap44.put((java.lang.Object) 'a', (java.lang.Object) predicate52);
        boolean b56 = defaultedMap44.containsValue((java.lang.Object) 'a');
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        defaultedMap58.clear();
        boolean b61 = defaultedMap58.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj63 = defaultedMap58.get((java.lang.Object) 0);
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate64, predicate65);
        boolean b67 = defaultedMap44.containsValue((java.lang.Object) predicate65);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate41, predicate65);
        collections.Transformer transformer69 = null;
        try {
            java.util.Map map70 = collections.map.DefaultedMap.decorate(map68, transformer69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(map68);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        try {
            math.genetics.Chromosome chromosome6 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(population5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) (-1.0d));
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        defaultedMap14.clear();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate18, predicate19);
        java.lang.Object obj21 = defaultedMap11.put((java.lang.Object) 'a', (java.lang.Object) predicate19);
        boolean b23 = defaultedMap11.containsValue((java.lang.Object) 'a');
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate32);
        boolean b34 = defaultedMap11.containsValue((java.lang.Object) predicate32);
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        int i36 = defaultedMap11.size();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i36 == 1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        try {
            elitisticListPopulation2.setElitismRate((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 'a', (java.lang.Object) predicate21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        boolean b36 = defaultedMap33.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) 0);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate40);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate40, predicate43);
        boolean b45 = defaultedMap1.containsKey((java.lang.Object) predicate43);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        defaultedMap47.clear();
        boolean b50 = defaultedMap47.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj52 = defaultedMap47.get((java.lang.Object) 0);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate53, predicate54);
        boolean b56 = defaultedMap1.equals((java.lang.Object) predicate53);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        try {
            elitisticListPopulation2.setElitismRate((double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) 100.0f);
        boolean b8 = defaultedMap4.containsKey((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap4.entrySet();
        java.util.Set set10 = defaultedMap4.entrySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 'a', (java.lang.Object) predicate21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        boolean b36 = defaultedMap33.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) 0);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate40);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate40, predicate43);
        boolean b45 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        defaultedMap47.clear();
        boolean b50 = defaultedMap47.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj52 = defaultedMap47.get((java.lang.Object) 0);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate53, predicate54);
        java.lang.Object obj56 = defaultedMap13.remove((java.lang.Object) map55);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        defaultedMap14.clear();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate18, predicate19);
        java.lang.Object obj21 = defaultedMap11.put((java.lang.Object) 'a', (java.lang.Object) predicate19);
        boolean b23 = defaultedMap11.containsValue((java.lang.Object) 'a');
        java.util.Set set24 = defaultedMap11.entrySet();
        boolean b25 = defaultedMap1.containsValue((java.lang.Object) set24);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d29 = elitisticListPopulation28.getElitismRate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation28);
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) elitisticListPopulation28, (java.lang.Object) 10);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(d29 == 0.0d);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) 0);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate16);
        java.util.Collection collection19 = defaultedMap1.values();
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 100.0f);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap6.entrySet();
        java.lang.Object obj13 = defaultedMap6.remove((java.lang.Object) (-1));
        boolean b14 = defaultedMap1.equals((java.lang.Object) (-1));
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population19 = elitisticListPopulation18.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation18.iterator();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) elitisticListPopulation18);
        try {
            math.genetics.Chromosome chromosome22 = elitisticListPopulation18.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) 0);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate16);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap20.get(obj21);
        java.util.Collection collection23 = defaultedMap20.values();
        boolean b24 = defaultedMap1.equals((java.lang.Object) collection23);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        defaultedMap26.clear();
        boolean b29 = defaultedMap26.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj31 = defaultedMap26.get((java.lang.Object) 0);
        boolean b32 = defaultedMap1.containsValue(obj31);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        java.lang.String str9 = elitisticListPopulation2.toString();
        try {
            math.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[null]" + "'", str9.equals("[null]"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.lang.String str6 = elitisticListPopulation2.toString();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        elitisticListPopulation10.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12);
        try {
            math.genetics.Chromosome chromosome16 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 100.0f);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap6.entrySet();
        java.lang.Object obj13 = defaultedMap6.remove((java.lang.Object) (-1));
        boolean b14 = defaultedMap1.equals((java.lang.Object) (-1));
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, 10, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) (short) 10, 1.0d);
        int i29 = elitisticListPopulation28.getPopulationSize();
        double d30 = elitisticListPopulation28.getElitismRate();
        boolean b31 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation28);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(d30 == 1.0d);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b11 = defaultedMap5.isEmpty();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        boolean b16 = defaultedMap13.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) 0);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        defaultedMap26.clear();
        boolean b29 = defaultedMap26.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        java.lang.Object obj33 = defaultedMap23.put((java.lang.Object) 'a', (java.lang.Object) predicate31);
        boolean b35 = defaultedMap23.containsValue((java.lang.Object) 'a');
        java.util.Set set36 = defaultedMap23.entrySet();
        boolean b37 = defaultedMap13.containsValue((java.lang.Object) set36);
        java.lang.Object obj38 = defaultedMap5.get((java.lang.Object) set36);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) predicate8);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d15 = elitisticListPopulation14.getElitismRate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation14);
        math.genetics.Population population17 = elitisticListPopulation14.nextGeneration();
        java.lang.String str18 = elitisticListPopulation14.toString();
        math.genetics.Population population19 = elitisticListPopulation14.nextGeneration();
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation14.addChromosome(chromosome20);
        boolean b22 = defaultedMap1.equals((java.lang.Object) chromosome20);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertNotNull(population17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        boolean b16 = defaultedMap13.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) 0);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj26 = defaultedMap21.get((java.lang.Object) 0);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate28);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate28, predicate31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        defaultedMap34.clear();
        boolean b37 = defaultedMap34.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) 0);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate40, predicate41);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        defaultedMap47.clear();
        boolean b50 = defaultedMap47.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate52);
        java.lang.Object obj54 = defaultedMap44.put((java.lang.Object) 'a', (java.lang.Object) predicate52);
        boolean b56 = defaultedMap44.containsValue((java.lang.Object) 'a');
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        defaultedMap58.clear();
        boolean b61 = defaultedMap58.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj63 = defaultedMap58.get((java.lang.Object) 0);
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate64, predicate65);
        boolean b67 = defaultedMap44.containsValue((java.lang.Object) predicate65);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate41, predicate65);
        boolean b70 = defaultedMap1.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj71 = null;
        boolean b72 = defaultedMap1.containsKey(obj71);
        int i73 = defaultedMap1.size();
        collections.Transformer transformer74 = null;
        try {
            java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(i73 == 1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.get(obj2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) predicate4);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.get(obj2);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap5.containsKey(obj11);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.lang.String str6 = elitisticListPopulation2.toString();
        int i7 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        elitisticListPopulation10.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12);
        int i16 = elitisticListPopulation2.getPopulationLimit();
        try {
            elitisticListPopulation2.setElitismRate((double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertTrue(i7 == 35);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i16 == 35);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.lang.String str6 = elitisticListPopulation2.toString();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        double d8 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(d8 == 0.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Collection collection8 = defaultedMap7.values();
        java.util.Set set9 = defaultedMap7.keySet();
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) set9);
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        defaultedMap14.clear();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) 0);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0);
        java.util.Collection collection21 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) 'a');
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        defaultedMap15.clear();
        boolean b18 = defaultedMap15.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) 0);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate21, predicate22);
        boolean b24 = defaultedMap1.containsValue((java.lang.Object) predicate22);
        int i25 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        try {
            elitisticListPopulation2.setElitismRate((double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.lang.String str6 = elitisticListPopulation2.toString();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        elitisticListPopulation10.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) (short) -1, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 100.0f);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap6.entrySet();
        java.lang.Object obj13 = defaultedMap6.remove((java.lang.Object) (-1));
        boolean b14 = defaultedMap1.equals((java.lang.Object) (-1));
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population19 = elitisticListPopulation18.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation18.iterator();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) elitisticListPopulation18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i10 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i10 == 35);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (short) 0, 1.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        try {
            elitisticListPopulation2.setElitismRate((double) 35);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.get(obj2);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        boolean b13 = defaultedMap10.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate14, predicate15);
        java.lang.Object obj17 = defaultedMap7.put((java.lang.Object) 'a', (java.lang.Object) predicate15);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        defaultedMap22.clear();
        boolean b25 = defaultedMap22.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate26, predicate27);
        java.lang.Object obj29 = defaultedMap19.put((java.lang.Object) 'a', (java.lang.Object) predicate27);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        defaultedMap31.clear();
        boolean b34 = defaultedMap31.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj36 = defaultedMap31.get((java.lang.Object) 0);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        defaultedMap39.clear();
        boolean b42 = defaultedMap39.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj44 = defaultedMap39.get((java.lang.Object) 0);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate37, predicate46);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate46, predicate49);
        boolean b51 = defaultedMap7.containsKey((java.lang.Object) predicate49);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        java.util.Collection collection54 = defaultedMap53.values();
        java.util.Set set55 = defaultedMap53.keySet();
        java.lang.Object obj56 = defaultedMap7.remove((java.lang.Object) defaultedMap53);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        defaultedMap59.clear();
        boolean b62 = defaultedMap59.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate63, predicate64);
        java.lang.Object obj66 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap(obj66);
        defaultedMap67.clear();
        boolean b70 = defaultedMap67.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate71, predicate72);
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) (byte) 0);
        defaultedMap59.putAll(map75);
        boolean b77 = defaultedMap7.containsValue((java.lang.Object) map75);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue(b77 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        double d6 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        org.junit.Assert.assertTrue(d6 == 0.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) 'a');
        java.util.Set set14 = defaultedMap1.entrySet();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) map22);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Collection collection5 = defaultedMap4.values();
        java.util.Set set6 = defaultedMap4.keySet();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) 1L);
        defaultedMap4.putAll((java.util.Map) defaultedMap8);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        java.util.Set set15 = defaultedMap4.entrySet();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        boolean b21 = defaultedMap17.containsKey((java.lang.Object) 1L);
        java.util.Set set22 = defaultedMap17.entrySet();
        java.util.Set set23 = defaultedMap17.entrySet();
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap17.containsKey(obj24);
        defaultedMap4.putAll((java.util.Map) defaultedMap17);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 'a', (java.lang.Object) predicate21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        boolean b36 = defaultedMap33.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) 0);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate40);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate40, predicate43);
        boolean b45 = defaultedMap1.containsKey((java.lang.Object) predicate43);
        java.util.Collection collection46 = defaultedMap1.values();
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        defaultedMap48.clear();
        boolean b51 = defaultedMap48.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj53 = defaultedMap48.get((java.lang.Object) 0);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        defaultedMap56.clear();
        boolean b59 = defaultedMap56.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj61 = defaultedMap56.get((java.lang.Object) 0);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate62, predicate63);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate54, predicate63);
        boolean b66 = defaultedMap1.containsKey((java.lang.Object) predicate54);
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        java.lang.Object obj70 = null;
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap(obj70);
        defaultedMap71.clear();
        boolean b74 = defaultedMap71.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate75, predicate76);
        java.lang.Object obj78 = defaultedMap68.put((java.lang.Object) 'a', (java.lang.Object) predicate76);
        boolean b80 = defaultedMap68.containsValue((java.lang.Object) 'a');
        java.lang.Object obj81 = null;
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap(obj81);
        defaultedMap82.clear();
        boolean b85 = defaultedMap82.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj87 = defaultedMap82.get((java.lang.Object) 0);
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap82, predicate88, predicate89);
        boolean b91 = defaultedMap68.containsValue((java.lang.Object) predicate89);
        boolean b92 = defaultedMap1.containsKey((java.lang.Object) defaultedMap68);
        collections.Transformer transformer93 = null;
        try {
            java.util.Map map94 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 'a', (java.lang.Object) predicate21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        boolean b36 = defaultedMap33.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) 0);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate40);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate40, predicate43);
        boolean b45 = defaultedMap1.containsKey((java.lang.Object) predicate43);
        java.util.Collection collection46 = defaultedMap1.values();
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        defaultedMap48.clear();
        boolean b51 = defaultedMap48.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj53 = defaultedMap48.get((java.lang.Object) 0);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        defaultedMap56.clear();
        boolean b59 = defaultedMap56.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj61 = defaultedMap56.get((java.lang.Object) 0);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate62, predicate63);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate54, predicate63);
        boolean b66 = defaultedMap1.containsKey((java.lang.Object) predicate54);
        collections.Factory factory67 = null;
        try {
            java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 100.0f);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap6.entrySet();
        java.lang.Object obj13 = defaultedMap6.remove((java.lang.Object) (-1));
        boolean b14 = defaultedMap1.equals((java.lang.Object) (-1));
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population19 = elitisticListPopulation18.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation18.iterator();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) elitisticListPopulation18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation18);
        elitisticListPopulation18.setPopulationLimit((int) (byte) 1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, 10, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation9.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        java.util.Map map12 = null;
        try {
            defaultedMap1.putAll(map12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.List<math.genetics.Chromosome> list_chromosome0 = null;
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(list_chromosome0, 0, (double) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap9.containsKey((java.lang.Object) 1L);
        java.util.Set set14 = defaultedMap9.entrySet();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap9);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.util.Collection collection20 = defaultedMap19.values();
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) defaultedMap19, (java.lang.Object) (-1.0d));
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation25.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27);
        int i30 = elitisticListPopulation25.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome31 = elitisticListPopulation25.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation25.getChromosomes();
        java.lang.Object obj33 = defaultedMap17.remove((java.lang.Object) list_chromosome32);
        java.lang.Object obj34 = defaultedMap9.remove((java.lang.Object) defaultedMap17);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome31);
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Collection collection8 = defaultedMap7.values();
        java.util.Set set9 = defaultedMap7.keySet();
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) set9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set12 = defaultedMap11.keySet();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        defaultedMap14.clear();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate18, predicate19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        java.lang.Object obj32 = defaultedMap22.put((java.lang.Object) 'a', (java.lang.Object) predicate30);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        defaultedMap34.clear();
        boolean b37 = defaultedMap34.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) 0);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        defaultedMap42.clear();
        boolean b45 = defaultedMap42.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj47 = defaultedMap42.get((java.lang.Object) 0);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate48, predicate49);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate40, predicate49);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate49, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate19, predicate49);
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        defaultedMap56.clear();
        boolean b59 = defaultedMap56.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate60, predicate61);
        java.lang.Object obj63 = null;
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap(obj63);
        java.lang.Object obj66 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap(obj66);
        defaultedMap67.clear();
        boolean b70 = defaultedMap67.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate71, predicate72);
        java.lang.Object obj74 = defaultedMap64.put((java.lang.Object) 'a', (java.lang.Object) predicate72);
        java.lang.Object obj75 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap(obj75);
        defaultedMap76.clear();
        boolean b79 = defaultedMap76.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj81 = defaultedMap76.get((java.lang.Object) 0);
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj83 = null;
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap(obj83);
        defaultedMap84.clear();
        boolean b87 = defaultedMap84.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj89 = defaultedMap84.get((java.lang.Object) 0);
        collections.Predicate predicate90 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate91 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate90, predicate91);
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate82, predicate91);
        collections.Predicate predicate94 = collections.PredicateUtils.truePredicate();
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate91, predicate94);
        java.util.Map map96 = collections.map.PredicatedMap.decorate(map54, predicate60, predicate94);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNotNull(map96);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b11 = defaultedMap5.isEmpty();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Collection collection17 = defaultedMap16.values();
        java.util.Set set18 = defaultedMap16.keySet();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) 1L);
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj26 = defaultedMap13.get((java.lang.Object) defaultedMap16);
        java.util.Set set27 = defaultedMap16.entrySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap16);
        collections.Transformer transformer29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 'a', (java.lang.Object) predicate21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        boolean b36 = defaultedMap33.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) 0);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate40);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate40, predicate43);
        boolean b45 = defaultedMap1.containsKey((java.lang.Object) predicate43);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        java.util.Collection collection48 = defaultedMap47.values();
        java.util.Set set49 = defaultedMap47.keySet();
        java.lang.Object obj50 = defaultedMap1.remove((java.lang.Object) defaultedMap47);
        java.lang.Object obj52 = defaultedMap1.get((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population15 = elitisticListPopulation14.nextGeneration();
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) population15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        boolean b20 = defaultedMap9.containsKey((java.lang.Object) '#');
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) b20);
        int i22 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(population15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        defaultedMap11.clear();
        boolean b14 = defaultedMap11.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        defaultedMap11.clear();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 100.0f);
        java.lang.String str23 = defaultedMap20.toString();
        boolean b24 = defaultedMap11.containsKey((java.lang.Object) defaultedMap20);
        java.lang.Object obj25 = defaultedMap9.remove((java.lang.Object) b24);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.util.Set set7 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        int i4 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (-1), 1.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population15 = elitisticListPopulation14.nextGeneration();
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) population15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        boolean b20 = defaultedMap9.containsKey((java.lang.Object) '#');
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) b20);
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(population15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, 10, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (short) 10, 1.0d);
        int i13 = elitisticListPopulation12.getPopulationSize();
        double d14 = elitisticListPopulation12.getElitismRate();
        double d15 = elitisticListPopulation12.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = null;
        try {
            elitisticListPopulation12.setChromosomes(list_chromosome16);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(d14 == 1.0d);
        org.junit.Assert.assertTrue(d15 == 1.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        boolean b8 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) -1, (double) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) 100.0f);
        boolean b8 = defaultedMap4.containsKey((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap4.entrySet();
        java.util.Set set10 = defaultedMap4.entrySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 'a', (java.lang.Object) predicate21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        boolean b36 = defaultedMap33.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) 0);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate40);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate40, predicate43);
        boolean b45 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        elitisticListPopulation48.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50);
        int i53 = elitisticListPopulation48.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome54 = elitisticListPopulation48.spliterator();
        math.genetics.Population population55 = elitisticListPopulation48.nextGeneration();
        java.lang.Object obj56 = defaultedMap13.get((java.lang.Object) elitisticListPopulation48);
        math.genetics.Chromosome chromosome57 = null;
        elitisticListPopulation48.addChromosome(chromosome57);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i53 == 35);
        org.junit.Assert.assertNotNull(spliterator_chromosome54);
        org.junit.Assert.assertNotNull(population55);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        int i17 = elitisticListPopulation12.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation12.iterator();
        elitisticListPopulation12.setPopulationLimit(10);
        java.lang.String str21 = elitisticListPopulation12.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation12.iterator();
        java.lang.Object obj23 = defaultedMap1.remove((java.lang.Object) iterator_chromosome22);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]" + "'", str21.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) (-1.0d));
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d10 = elitisticListPopulation9.getElitismRate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d15 = elitisticListPopulation14.getElitismRate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation14);
        math.genetics.Population population17 = elitisticListPopulation14.nextGeneration();
        java.lang.String str18 = elitisticListPopulation14.toString();
        int i19 = elitisticListPopulation14.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        elitisticListPopulation22.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24, (int) (short) 100, (double) (byte) 1);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 1);
        java.util.Collection collection33 = defaultedMap3.values();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertNotNull(population17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertTrue(i19 == 35);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        java.lang.String str8 = defaultedMap5.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Collection collection12 = defaultedMap11.values();
        java.util.Set set13 = defaultedMap11.keySet();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 100.0f);
        boolean b19 = defaultedMap15.containsKey((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap15);
        boolean b21 = defaultedMap15.isEmpty();
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        defaultedMap23.clear();
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.util.Collection collection27 = defaultedMap26.values();
        java.util.Set set28 = defaultedMap26.keySet();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) 100.0f);
        boolean b34 = defaultedMap30.containsKey((java.lang.Object) 1L);
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj36 = defaultedMap23.get((java.lang.Object) defaultedMap26);
        java.util.Set set37 = defaultedMap26.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap26);
        boolean b39 = defaultedMap1.containsValue((java.lang.Object) defaultedMap26);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, 10, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (short) 10, 1.0d);
        int i13 = elitisticListPopulation12.getPopulationSize();
        try {
            elitisticListPopulation12.setElitismRate((double) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation2.spliterator();
        math.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        try {
            elitisticListPopulation2.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 35);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNotNull(population9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        int i10 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) 'a');
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        defaultedMap19.clear();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Collection collection23 = defaultedMap22.values();
        java.util.Set set24 = defaultedMap22.keySet();
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 100.0f);
        boolean b30 = defaultedMap26.containsKey((java.lang.Object) 1L);
        defaultedMap22.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj32 = defaultedMap19.get((java.lang.Object) defaultedMap22);
        java.util.Set set33 = defaultedMap22.entrySet();
        java.util.Set set34 = defaultedMap22.entrySet();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) set34);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) 0);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate16);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        defaultedMap20.clear();
        boolean b23 = defaultedMap20.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate24, predicate25);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        defaultedMap28.clear();
        boolean b31 = defaultedMap28.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj33 = defaultedMap28.get((java.lang.Object) 0);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate24, predicate34);
        java.util.Collection collection38 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        defaultedMap1.clear();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 100.0f);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap10.putAll((java.util.Map) defaultedMap14);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        elitisticListPopulation21.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23);
        int i26 = elitisticListPopulation21.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome27 = elitisticListPopulation21.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation21.getChromosomes();
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) list_chromosome28);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome27);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        defaultedMap1.clear();
        int i9 = defaultedMap1.size();
        java.util.Set set10 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d12 = elitisticListPopulation11.getElitismRate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation11);
        math.genetics.Population population14 = elitisticListPopulation11.nextGeneration();
        java.lang.String str15 = elitisticListPopulation11.toString();
        int i16 = elitisticListPopulation11.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.Population population26 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]" + "'", str15.equals("[]"));
        org.junit.Assert.assertTrue(i16 == 35);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(population26);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(list_chromosome9, (int) (byte) 1, (double) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population13 = elitisticListPopulation12.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation12.iterator();
        int i15 = elitisticListPopulation12.getPopulationSize();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) i15);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        org.junit.Assert.assertTrue(d3 == 0.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) 100.0f);
        boolean b8 = defaultedMap4.containsKey((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap4.entrySet();
        java.util.Set set10 = defaultedMap4.entrySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 'a', (java.lang.Object) predicate21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        boolean b36 = defaultedMap33.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) 0);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate40);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate40, predicate43);
        boolean b45 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        defaultedMap47.clear();
        boolean b50 = defaultedMap47.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate52);
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        java.util.Collection collection56 = defaultedMap55.values();
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        defaultedMap61.clear();
        boolean b64 = defaultedMap61.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate65, predicate66);
        java.lang.Object obj68 = defaultedMap58.put((java.lang.Object) 'a', (java.lang.Object) predicate66);
        java.lang.Object obj69 = null;
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap(obj69);
        defaultedMap70.clear();
        boolean b73 = defaultedMap70.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj75 = defaultedMap70.get((java.lang.Object) 0);
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj77 = null;
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap(obj77);
        defaultedMap78.clear();
        boolean b81 = defaultedMap78.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj83 = defaultedMap78.get((java.lang.Object) 0);
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate84, predicate85);
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate76, predicate85);
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate85, predicate88);
        collections.Predicate predicate90 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate88, predicate90);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate51, predicate88);
        java.util.Collection collection93 = defaultedMap13.values();
        java.util.Set set94 = defaultedMap13.entrySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(collection93);
        org.junit.Assert.assertNotNull(set94);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        int i8 = defaultedMap1.size();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        java.lang.String str6 = elitisticListPopulation2.toString();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation2.spliterator();
        math.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        math.genetics.Population population10 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 35);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertNotNull(population10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.get(obj2);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        boolean b13 = defaultedMap10.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate14, predicate15);
        java.lang.Object obj17 = defaultedMap7.put((java.lang.Object) 'a', (java.lang.Object) predicate15);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        defaultedMap22.clear();
        boolean b25 = defaultedMap22.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate26, predicate27);
        java.lang.Object obj29 = defaultedMap19.put((java.lang.Object) 'a', (java.lang.Object) predicate27);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        defaultedMap31.clear();
        boolean b34 = defaultedMap31.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj36 = defaultedMap31.get((java.lang.Object) 0);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        defaultedMap39.clear();
        boolean b42 = defaultedMap39.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj44 = defaultedMap39.get((java.lang.Object) 0);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate37, predicate46);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate46, predicate49);
        boolean b51 = defaultedMap7.containsKey((java.lang.Object) predicate49);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        java.util.Collection collection54 = defaultedMap53.values();
        java.util.Set set55 = defaultedMap53.keySet();
        java.lang.Object obj56 = defaultedMap7.remove((java.lang.Object) defaultedMap53);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        defaultedMap59.clear();
        boolean b62 = defaultedMap59.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate63, predicate64);
        java.lang.Object obj66 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap(obj66);
        java.lang.Object obj69 = null;
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap(obj69);
        defaultedMap70.clear();
        boolean b73 = defaultedMap70.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate74, predicate75);
        java.lang.Object obj77 = defaultedMap67.put((java.lang.Object) 'a', (java.lang.Object) predicate75);
        java.lang.Object obj78 = null;
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap(obj78);
        defaultedMap79.clear();
        boolean b82 = defaultedMap79.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj84 = defaultedMap79.get((java.lang.Object) 0);
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj86 = null;
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap(obj86);
        defaultedMap87.clear();
        boolean b90 = defaultedMap87.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj92 = defaultedMap87.get((java.lang.Object) 0);
        collections.Predicate predicate93 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate94 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap87, predicate93, predicate94);
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate85, predicate94);
        collections.Predicate predicate97 = collections.PredicateUtils.truePredicate();
        java.util.Map map98 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate94, predicate97);
        java.util.Map map99 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate64, predicate94);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(predicate97);
        org.junit.Assert.assertNotNull(map98);
        org.junit.Assert.assertNotNull(map99);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.get(obj2);
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        defaultedMap6.clear();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 100.0f);
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) 1L);
        java.util.Set set16 = defaultedMap11.entrySet();
        java.lang.Object obj18 = defaultedMap11.remove((java.lang.Object) (-1));
        boolean b19 = defaultedMap6.equals((java.lang.Object) (-1));
        defaultedMap6.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population24 = elitisticListPopulation23.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome25 = elitisticListPopulation23.iterator();
        java.lang.Object obj26 = defaultedMap6.get((java.lang.Object) elitisticListPopulation23);
        int i27 = elitisticListPopulation23.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d31 = elitisticListPopulation30.getElitismRate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation30);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d36 = elitisticListPopulation35.getElitismRate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation35);
        math.genetics.Population population38 = elitisticListPopulation35.nextGeneration();
        java.lang.String str39 = elitisticListPopulation35.toString();
        int i40 = elitisticListPopulation35.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        elitisticListPopulation43.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45);
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45);
        elitisticListPopulation30.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45, (int) (short) 100, (double) (byte) 1);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45);
        java.lang.Object obj54 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation23);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertNotNull(iterator_chromosome25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 35);
        org.junit.Assert.assertTrue(d31 == 0.0d);
        org.junit.Assert.assertTrue(d36 == 0.0d);
        org.junit.Assert.assertNotNull(population38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]" + "'", str39.equals("[]"));
        org.junit.Assert.assertTrue(i40 == 35);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        defaultedMap1.clear();
        int i9 = defaultedMap1.size();
        java.util.Collection collection10 = defaultedMap1.values();
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        defaultedMap15.clear();
        boolean b18 = defaultedMap15.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap12.put((java.lang.Object) 'a', (java.lang.Object) predicate20);
        boolean b24 = defaultedMap12.containsValue((java.lang.Object) 'a');
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 'a');
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        java.util.Set set12 = defaultedMap1.entrySet();
        boolean b14 = defaultedMap1.equals((java.lang.Object) 35);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        try {
            elitisticListPopulation2.setElitismRate((double) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        defaultedMap1.clear();
        int i9 = defaultedMap1.size();
        java.util.Collection collection10 = defaultedMap1.values();
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.util.Collection collection15 = defaultedMap14.values();
        java.lang.Object obj17 = defaultedMap12.put((java.lang.Object) defaultedMap14, (java.lang.Object) (-1.0d));
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        defaultedMap19.clear();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        defaultedMap22.clear();
        boolean b25 = defaultedMap22.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate26, predicate27);
        java.lang.Object obj29 = defaultedMap19.get((java.lang.Object) predicate26);
        java.lang.Object obj30 = defaultedMap12.get(obj29);
        boolean b31 = defaultedMap1.containsValue(obj29);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) 100.0f);
        boolean b8 = defaultedMap4.containsKey((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap4.entrySet();
        java.util.Set set10 = defaultedMap4.entrySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        int i12 = defaultedMap1.size();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        defaultedMap15.clear();
        boolean b18 = defaultedMap15.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) 0);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        defaultedMap23.clear();
        boolean b26 = defaultedMap23.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj28 = defaultedMap23.get((java.lang.Object) 0);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate21, predicate30);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        defaultedMap34.clear();
        boolean b37 = defaultedMap34.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate39);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        defaultedMap42.clear();
        boolean b45 = defaultedMap42.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj47 = defaultedMap42.get((java.lang.Object) 0);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate48, predicate49);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate38, predicate48);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate38);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(10);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation2.iterator();
        double d13 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue(d13 == 0.0d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) 'a');
        java.util.Set set14 = defaultedMap1.entrySet();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) map22);
        collections.Factory factory24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Collection collection8 = defaultedMap7.values();
        java.util.Set set9 = defaultedMap7.keySet();
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) set9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        defaultedMap15.clear();
        boolean b18 = defaultedMap15.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap12.put((java.lang.Object) 'a', (java.lang.Object) predicate20);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        defaultedMap24.clear();
        boolean b27 = defaultedMap24.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj29 = defaultedMap24.get((java.lang.Object) 0);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        defaultedMap32.clear();
        boolean b35 = defaultedMap32.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj37 = defaultedMap32.get((java.lang.Object) 0);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate30, predicate39);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate39, predicate42);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        defaultedMap45.clear();
        boolean b48 = defaultedMap45.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj50 = defaultedMap45.get((java.lang.Object) 0);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate51, predicate52);
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        defaultedMap58.clear();
        boolean b61 = defaultedMap58.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate62, predicate63);
        java.lang.Object obj65 = defaultedMap55.put((java.lang.Object) 'a', (java.lang.Object) predicate63);
        boolean b67 = defaultedMap55.containsValue((java.lang.Object) 'a');
        java.lang.Object obj68 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        defaultedMap69.clear();
        boolean b72 = defaultedMap69.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj74 = defaultedMap69.get((java.lang.Object) 0);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate75, predicate76);
        boolean b78 = defaultedMap55.containsValue((java.lang.Object) predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate52, predicate76);
        boolean b81 = defaultedMap12.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj82 = null;
        boolean b83 = defaultedMap12.containsKey(obj82);
        int i84 = defaultedMap12.size();
        java.lang.Object obj85 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.lang.Object obj88 = defaultedMap12.get((java.lang.Object) '4');
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(i84 == 1);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(10);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Collection collection8 = defaultedMap7.values();
        java.util.Set set9 = defaultedMap7.keySet();
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) set9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set12 = defaultedMap11.keySet();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        defaultedMap14.clear();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate18, predicate19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        java.lang.Object obj32 = defaultedMap22.put((java.lang.Object) 'a', (java.lang.Object) predicate30);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        defaultedMap34.clear();
        boolean b37 = defaultedMap34.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) 0);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        defaultedMap42.clear();
        boolean b45 = defaultedMap42.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj47 = defaultedMap42.get((java.lang.Object) 0);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate48, predicate49);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate40, predicate49);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate49, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate19, predicate49);
        collections.Factory factory55 = null;
        try {
            java.util.Map map56 = collections.map.DefaultedMap.decorate(map54, factory55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) 'a');
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        defaultedMap15.clear();
        boolean b18 = defaultedMap15.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) 0);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate21, predicate22);
        boolean b24 = defaultedMap1.containsValue((java.lang.Object) predicate22);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Collection collection8 = defaultedMap7.values();
        java.util.Set set9 = defaultedMap7.keySet();
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) set9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.lang.String str6 = elitisticListPopulation2.toString();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        elitisticListPopulation10.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, 10, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) (short) 10, 1.0d);
        int i29 = elitisticListPopulation28.getPopulationSize();
        double d30 = elitisticListPopulation28.getElitismRate();
        double d31 = elitisticListPopulation28.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome32);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(d30 == 1.0d);
        org.junit.Assert.assertTrue(d31 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome32);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        org.junit.Assert.assertNotNull(population3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b11 = defaultedMap5.isEmpty();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Collection collection17 = defaultedMap16.values();
        java.util.Set set18 = defaultedMap16.keySet();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) 1L);
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj26 = defaultedMap13.get((java.lang.Object) defaultedMap16);
        java.util.Set set27 = defaultedMap16.entrySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap30.get(obj31);
        java.lang.Object obj34 = defaultedMap30.remove((java.lang.Object) 10);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        defaultedMap39.clear();
        boolean b42 = defaultedMap39.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate43, predicate44);
        java.lang.Object obj46 = defaultedMap36.put((java.lang.Object) 'a', (java.lang.Object) predicate44);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        defaultedMap51.clear();
        boolean b54 = defaultedMap51.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate55, predicate56);
        java.lang.Object obj58 = defaultedMap48.put((java.lang.Object) 'a', (java.lang.Object) predicate56);
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        defaultedMap60.clear();
        boolean b63 = defaultedMap60.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj65 = defaultedMap60.get((java.lang.Object) 0);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        defaultedMap68.clear();
        boolean b71 = defaultedMap68.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj73 = defaultedMap68.get((java.lang.Object) 0);
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate74, predicate75);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate66, predicate75);
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate75, predicate78);
        boolean b80 = defaultedMap36.containsKey((java.lang.Object) predicate78);
        java.lang.Object obj81 = null;
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap(obj81);
        java.util.Collection collection83 = defaultedMap82.values();
        java.util.Set set84 = defaultedMap82.keySet();
        java.lang.Object obj85 = defaultedMap36.remove((java.lang.Object) defaultedMap82);
        defaultedMap30.putAll((java.util.Map) defaultedMap36);
        defaultedMap16.putAll((java.util.Map) defaultedMap30);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNull(obj85);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        try {
            elitisticListPopulation2.setPopulationLimit((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        boolean b11 = defaultedMap8.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 'a', (java.lang.Object) predicate13);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        defaultedMap17.clear();
        boolean b20 = defaultedMap17.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) 0);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate23, predicate32);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate32, predicate35);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        defaultedMap38.clear();
        boolean b41 = defaultedMap38.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) 0);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        defaultedMap46.clear();
        boolean b49 = defaultedMap46.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj51 = defaultedMap46.get((java.lang.Object) 0);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate52, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate44, predicate53);
        java.lang.Object obj56 = null;
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap(obj56);
        defaultedMap57.clear();
        boolean b60 = defaultedMap57.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate61, predicate62);
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        defaultedMap65.clear();
        boolean b68 = defaultedMap65.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj70 = defaultedMap65.get((java.lang.Object) 0);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate71, predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate61, predicate71);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate35, predicate61);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d12 = elitisticListPopulation11.getElitismRate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation11);
        math.genetics.Population population14 = elitisticListPopulation11.nextGeneration();
        java.lang.String str15 = elitisticListPopulation11.toString();
        int i16 = elitisticListPopulation11.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) (short) 10, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]" + "'", str15.equals("[]"));
        org.junit.Assert.assertTrue(i16 == 35);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) (-1));
        defaultedMap1.clear();
        java.util.Set set10 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation2.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population12 = elitisticListPopulation11.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation11.iterator();
        java.lang.String str14 = elitisticListPopulation11.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19);
        elitisticListPopulation11.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19);
        math.genetics.Population population24 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 35);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(population24);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
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
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d8 = elitisticListPopulation7.getElitismRate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation7);
        math.genetics.Population population10 = elitisticListPopulation7.nextGeneration();
        java.lang.String str11 = elitisticListPopulation7.toString();
        int i12 = elitisticListPopulation7.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        elitisticListPopulation15.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17);
        elitisticListPopulation7.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d25 = elitisticListPopulation24.getElitismRate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation24);
        math.genetics.Population population27 = elitisticListPopulation24.nextGeneration();
        java.lang.String str28 = elitisticListPopulation24.toString();
        math.genetics.Population population29 = elitisticListPopulation24.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation32.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        elitisticListPopulation24.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNotNull(population10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(i12 == 35);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(d25 == 0.0d);
        org.junit.Assert.assertNotNull(population27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]" + "'", str28.equals("[]"));
        org.junit.Assert.assertNotNull(population29);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate13, predicate14);
        defaultedMap9.clear();
        int i17 = defaultedMap9.size();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        defaultedMap19.clear();
        boolean b22 = defaultedMap19.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        defaultedMap19.clear();
        java.util.Set set27 = defaultedMap19.entrySet();
        boolean b28 = defaultedMap9.containsKey((java.lang.Object) set27);
        boolean b29 = defaultedMap1.equals((java.lang.Object) b28);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b11 = defaultedMap5.isEmpty();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Collection collection17 = defaultedMap16.values();
        java.util.Set set18 = defaultedMap16.keySet();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) 1L);
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj26 = defaultedMap13.get((java.lang.Object) defaultedMap16);
        java.util.Set set27 = defaultedMap16.entrySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap16);
        java.util.Set set29 = defaultedMap16.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 0);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj12 = defaultedMap7.put((java.lang.Object) defaultedMap9, (java.lang.Object) (-1.0d));
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population16 = elitisticListPopulation15.nextGeneration();
        int i17 = elitisticListPopulation15.getPopulationLimit();
        java.lang.Object obj18 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) i17);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertTrue(i17 == 35);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Collection collection5 = defaultedMap4.values();
        java.util.Set set6 = defaultedMap4.keySet();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) 1L);
        defaultedMap4.putAll((java.util.Map) defaultedMap8);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        java.util.Set set15 = defaultedMap4.entrySet();
        java.util.Set set16 = defaultedMap4.entrySet();
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.get(obj2);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) 100.0f);
        boolean b8 = defaultedMap4.containsKey((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap4.entrySet();
        java.util.Set set10 = defaultedMap4.entrySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 'a', (java.lang.Object) predicate21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        boolean b36 = defaultedMap33.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) 0);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate40);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate40, predicate43);
        boolean b45 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        defaultedMap47.clear();
        boolean b50 = defaultedMap47.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate52);
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        java.util.Collection collection56 = defaultedMap55.values();
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        defaultedMap61.clear();
        boolean b64 = defaultedMap61.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate65, predicate66);
        java.lang.Object obj68 = defaultedMap58.put((java.lang.Object) 'a', (java.lang.Object) predicate66);
        java.lang.Object obj69 = null;
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap(obj69);
        defaultedMap70.clear();
        boolean b73 = defaultedMap70.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj75 = defaultedMap70.get((java.lang.Object) 0);
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj77 = null;
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap(obj77);
        defaultedMap78.clear();
        boolean b81 = defaultedMap78.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj83 = defaultedMap78.get((java.lang.Object) 0);
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate84, predicate85);
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate76, predicate85);
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate85, predicate88);
        collections.Predicate predicate90 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate88, predicate90);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate51, predicate88);
        java.util.Collection collection93 = defaultedMap13.values();
        boolean b95 = defaultedMap13.equals((java.lang.Object) (byte) 100);
        collections.Factory factory96 = null;
        try {
            java.util.Map map97 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, factory96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(collection93);
        org.junit.Assert.assertTrue(b95 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        boolean b4 = defaultedMap2.containsKey((java.lang.Object) (short) -1);
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) b4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.get(obj2);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 100.0f);
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Collection collection14 = defaultedMap13.values();
        java.util.Set set15 = defaultedMap13.keySet();
        boolean b16 = defaultedMap7.containsKey((java.lang.Object) set15);
        boolean b18 = defaultedMap7.containsValue((java.lang.Object) 100.0d);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        defaultedMap23.clear();
        boolean b26 = defaultedMap23.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate27, predicate28);
        java.lang.Object obj30 = defaultedMap20.put((java.lang.Object) 'a', (java.lang.Object) predicate28);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        defaultedMap32.clear();
        boolean b35 = defaultedMap32.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj37 = defaultedMap32.get((java.lang.Object) 0);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        defaultedMap40.clear();
        boolean b43 = defaultedMap40.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj45 = defaultedMap40.get((java.lang.Object) 0);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate46, predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate38, predicate47);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate47, predicate50);
        boolean b52 = defaultedMap7.containsValue((java.lang.Object) map51);
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap1.put((java.lang.Object) map51, obj53);
        int i55 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(i55 == 1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap1.containsKey(obj8);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 'a', (java.lang.Object) predicate21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        boolean b36 = defaultedMap33.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) 0);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate40);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate40, predicate43);
        boolean b45 = defaultedMap1.containsKey((java.lang.Object) predicate43);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        defaultedMap1.clear();
        int i9 = defaultedMap1.size();
        java.util.Collection collection10 = defaultedMap1.values();
        boolean b11 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, 0.0d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.get(obj2);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10);
        collections.Predicate predicate6 = null;
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        boolean b11 = defaultedMap8.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj13 = defaultedMap8.get((java.lang.Object) 0);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj21 = defaultedMap16.get((java.lang.Object) 0);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate22, predicate23);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate14, predicate23);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        defaultedMap27.clear();
        boolean b30 = defaultedMap27.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        defaultedMap35.clear();
        boolean b38 = defaultedMap35.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj40 = defaultedMap35.get((java.lang.Object) 0);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate31, predicate41);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate41);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        int i5 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) (-1.0d));
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d10 = elitisticListPopulation9.getElitismRate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d15 = elitisticListPopulation14.getElitismRate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation14);
        math.genetics.Population population17 = elitisticListPopulation14.nextGeneration();
        java.lang.String str18 = elitisticListPopulation14.toString();
        int i19 = elitisticListPopulation14.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        elitisticListPopulation22.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24, (int) (short) 100, (double) (byte) 1);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 1);
        collections.Factory factory33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate(map32, factory33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertNotNull(population17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertTrue(i19 == 35);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        math.genetics.Population population13 = elitisticListPopulation8.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation8.iterator();
        boolean b15 = defaultedMap1.equals((java.lang.Object) iterator_chromosome14);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0.0f);
        try {
            math.genetics.Chromosome chromosome3 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        java.lang.String str6 = elitisticListPopulation2.toString();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        try {
            elitisticListPopulation2.setPopulationLimit((-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(population7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13);
        elitisticListPopulation11.setPopulationLimit((int) ' ');
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        defaultedMap19.clear();
        boolean b22 = defaultedMap19.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 100.0f);
        boolean b28 = defaultedMap24.containsKey((java.lang.Object) 1L);
        java.util.Set set29 = defaultedMap24.entrySet();
        java.lang.Object obj31 = defaultedMap24.remove((java.lang.Object) (-1));
        boolean b32 = defaultedMap19.equals((java.lang.Object) (-1));
        defaultedMap19.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population37 = elitisticListPopulation36.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome38 = elitisticListPopulation36.iterator();
        java.lang.Object obj39 = defaultedMap19.get((java.lang.Object) elitisticListPopulation36);
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) ' ', (java.lang.Object) elitisticListPopulation36);
        java.util.Set set41 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(population37);
        org.junit.Assert.assertNotNull(iterator_chromosome38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) -1, (double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, 10, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (short) 10, 1.0d);
        int i13 = elitisticListPopulation12.getPopulationSize();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        defaultedMap15.clear();
        boolean b18 = defaultedMap15.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        defaultedMap15.clear();
        int i23 = defaultedMap15.size();
        java.util.Collection collection24 = defaultedMap15.values();
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection24);
        java.lang.String str26 = elitisticListPopulation12.toString();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.lang.String str6 = elitisticListPopulation2.toString();
        try {
            elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) defaultedMap4);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.get(obj2);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d9 = elitisticListPopulation8.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation8);
        int i11 = elitisticListPopulation8.getPopulationSize();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) i11);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 'a', (java.lang.Object) predicate21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        boolean b36 = defaultedMap33.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) 0);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate40);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate40, predicate43);
        boolean b45 = defaultedMap1.containsKey((java.lang.Object) predicate43);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        java.util.Collection collection48 = defaultedMap47.values();
        java.util.Set set49 = defaultedMap47.keySet();
        java.lang.Object obj50 = defaultedMap1.remove((java.lang.Object) defaultedMap47);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d54 = elitisticListPopulation53.getElitismRate();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation53);
        math.genetics.Chromosome chromosome56 = null;
        elitisticListPopulation53.addChromosome(chromosome56);
        java.lang.Object obj58 = defaultedMap47.get((java.lang.Object) chromosome56);
        java.lang.String str59 = defaultedMap47.toString();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(d54 == 0.0d);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 'a', (java.lang.Object) predicate21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        boolean b36 = defaultedMap33.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) 0);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate40);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate40, predicate43);
        boolean b45 = defaultedMap1.containsKey((java.lang.Object) predicate43);
        java.util.Collection collection46 = defaultedMap1.values();
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        defaultedMap48.clear();
        boolean b51 = defaultedMap48.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj53 = defaultedMap48.get((java.lang.Object) 0);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        defaultedMap56.clear();
        boolean b59 = defaultedMap56.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj61 = defaultedMap56.get((java.lang.Object) 0);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate62, predicate63);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate54, predicate63);
        boolean b66 = defaultedMap1.containsKey((java.lang.Object) predicate54);
        math.genetics.ElitisticListPopulation elitisticListPopulation69 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d70 = elitisticListPopulation69.getElitismRate();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation69);
        int i72 = elitisticListPopulation69.getPopulationLimit();
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) i72);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(d70 == 0.0d);
        org.junit.Assert.assertTrue(i72 == 35);
        org.junit.Assert.assertNotNull(map73);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 100.0f);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap6.entrySet();
        java.lang.Object obj13 = defaultedMap6.remove((java.lang.Object) (-1));
        boolean b14 = defaultedMap1.equals((java.lang.Object) (-1));
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population19 = elitisticListPopulation18.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation18.iterator();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) elitisticListPopulation18);
        int i22 = elitisticListPopulation18.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome23 = elitisticListPopulation18.spliterator();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 35);
        org.junit.Assert.assertNotNull(spliterator_chromosome23);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, 10, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (short) 10, 1.0d);
        int i13 = elitisticListPopulation12.getPopulationSize();
        double d14 = elitisticListPopulation12.getElitismRate();
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation12.addChromosome(chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(d14 == 1.0d);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(10);
        math.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(population11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, 0.0d);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        defaultedMap14.clear();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate18, predicate19);
        java.lang.Object obj21 = defaultedMap11.put((java.lang.Object) 'a', (java.lang.Object) predicate19);
        boolean b23 = defaultedMap11.containsValue((java.lang.Object) 'a');
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate32);
        boolean b34 = defaultedMap11.containsValue((java.lang.Object) predicate32);
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        collections.Transformer transformer36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, transformer36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, 10, (double) (short) 0);
        double d10 = elitisticListPopulation9.getElitismRate();
        int i11 = elitisticListPopulation9.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue(i11 == 10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) 'a');
        java.util.Set set14 = defaultedMap1.entrySet();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) map22);
        boolean b24 = defaultedMap1.isEmpty();
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 100.0f);
        boolean b30 = defaultedMap26.containsKey((java.lang.Object) 1L);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b30);
        java.util.Set set32 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set32);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) 'a');
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        defaultedMap22.clear();
        boolean b25 = defaultedMap22.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate26, predicate27);
        java.lang.Object obj29 = defaultedMap19.put((java.lang.Object) 'a', (java.lang.Object) predicate27);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        defaultedMap34.clear();
        boolean b37 = defaultedMap34.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate39);
        java.lang.Object obj41 = defaultedMap31.put((java.lang.Object) 'a', (java.lang.Object) predicate39);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        defaultedMap43.clear();
        boolean b46 = defaultedMap43.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj48 = defaultedMap43.get((java.lang.Object) 0);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        defaultedMap51.clear();
        boolean b54 = defaultedMap51.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj56 = defaultedMap51.get((java.lang.Object) 0);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate57, predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate49, predicate58);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate58, predicate61);
        boolean b63 = defaultedMap19.containsKey((java.lang.Object) predicate61);
        java.util.Collection collection64 = defaultedMap19.values();
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        defaultedMap66.clear();
        boolean b69 = defaultedMap66.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj71 = defaultedMap66.get((java.lang.Object) 0);
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        defaultedMap74.clear();
        boolean b77 = defaultedMap74.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj79 = defaultedMap74.get((java.lang.Object) 0);
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate80, predicate81);
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate72, predicate81);
        boolean b84 = defaultedMap19.containsKey((java.lang.Object) predicate72);
        java.lang.Object obj85 = null;
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap(obj85);
        defaultedMap86.clear();
        boolean b89 = defaultedMap86.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate91 = collections.PredicateUtils.truePredicate();
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap86, predicate90, predicate91);
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate72, predicate90);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(map93);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 100.0f);
        boolean b17 = defaultedMap13.containsKey((java.lang.Object) 1L);
        java.util.Set set18 = defaultedMap13.entrySet();
        java.lang.String str19 = defaultedMap13.toString();
        int i20 = defaultedMap13.size();
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) i20);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        defaultedMap1.clear();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.lang.String str13 = defaultedMap10.toString();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, 10, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (short) 10, 1.0d);
        int i28 = elitisticListPopulation27.getPopulationSize();
        double d29 = elitisticListPopulation27.getElitismRate();
        double d30 = elitisticListPopulation27.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome31 = elitisticListPopulation27.spliterator();
        java.lang.Object obj32 = defaultedMap10.get((java.lang.Object) elitisticListPopulation27);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(d29 == 1.0d);
        org.junit.Assert.assertTrue(d30 == 1.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population18 = elitisticListPopulation17.nextGeneration();
        boolean b19 = defaultedMap12.containsValue((java.lang.Object) population18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) b19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 100.0f);
        boolean b26 = defaultedMap22.containsKey((java.lang.Object) 1L);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.util.Collection collection29 = defaultedMap28.values();
        java.util.Set set30 = defaultedMap28.keySet();
        boolean b31 = defaultedMap22.containsKey((java.lang.Object) set30);
        int i32 = defaultedMap22.size();
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) i32);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap35.get(obj36);
        java.lang.Object obj39 = defaultedMap35.remove((java.lang.Object) 10);
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        defaultedMap44.clear();
        boolean b47 = defaultedMap44.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate48, predicate49);
        java.lang.Object obj51 = defaultedMap41.put((java.lang.Object) 'a', (java.lang.Object) predicate49);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        defaultedMap56.clear();
        boolean b59 = defaultedMap56.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate60, predicate61);
        java.lang.Object obj63 = defaultedMap53.put((java.lang.Object) 'a', (java.lang.Object) predicate61);
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        defaultedMap65.clear();
        boolean b68 = defaultedMap65.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj70 = defaultedMap65.get((java.lang.Object) 0);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj72 = null;
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap(obj72);
        defaultedMap73.clear();
        boolean b76 = defaultedMap73.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj78 = defaultedMap73.get((java.lang.Object) 0);
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate79, predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate71, predicate80);
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate80, predicate83);
        boolean b85 = defaultedMap41.containsKey((java.lang.Object) predicate83);
        java.lang.Object obj86 = null;
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap(obj86);
        java.util.Collection collection88 = defaultedMap87.values();
        java.util.Set set89 = defaultedMap87.keySet();
        java.lang.Object obj90 = defaultedMap41.remove((java.lang.Object) defaultedMap87);
        defaultedMap35.putAll((java.util.Map) defaultedMap41);
        java.lang.Object obj92 = defaultedMap1.get((java.lang.Object) defaultedMap35);
        java.util.Collection collection93 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(collection88);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(collection93);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        defaultedMap1.clear();
        int i9 = defaultedMap1.size();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        defaultedMap11.clear();
        boolean b14 = defaultedMap11.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 100.0f);
        boolean b23 = defaultedMap19.containsKey((java.lang.Object) 1L);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.util.Collection collection26 = defaultedMap25.values();
        java.util.Set set27 = defaultedMap25.keySet();
        boolean b28 = defaultedMap19.containsKey((java.lang.Object) set27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap19);
        java.util.Set set30 = defaultedMap29.keySet();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        defaultedMap32.clear();
        boolean b35 = defaultedMap32.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate37);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        defaultedMap43.clear();
        boolean b46 = defaultedMap43.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate48);
        java.lang.Object obj50 = defaultedMap40.put((java.lang.Object) 'a', (java.lang.Object) predicate48);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        defaultedMap52.clear();
        boolean b55 = defaultedMap52.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj57 = defaultedMap52.get((java.lang.Object) 0);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        defaultedMap60.clear();
        boolean b63 = defaultedMap60.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj65 = defaultedMap60.get((java.lang.Object) 0);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate66, predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate58, predicate67);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate67, predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate37, predicate67);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate67);
        math.genetics.ElitisticListPopulation elitisticListPopulation76 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array77 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome78 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b79 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome78, chromosome_array77);
        elitisticListPopulation76.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome78);
        math.genetics.ElitisticListPopulation elitisticListPopulation83 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome78, 10, (double) (short) 0);
        boolean b84 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation83);
        try {
            elitisticListPopulation83.setElitismRate(100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(chromosome_array77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b84 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Collection collection8 = defaultedMap7.values();
        java.util.Set set9 = defaultedMap7.keySet();
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) set9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.String str11 = defaultedMap5.toString();
        defaultedMap5.clear();
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 100.0f);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap6.entrySet();
        java.lang.Object obj13 = defaultedMap6.remove((java.lang.Object) (-1));
        boolean b14 = defaultedMap1.equals((java.lang.Object) (-1));
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population19 = elitisticListPopulation18.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation18.iterator();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) elitisticListPopulation18);
        int i22 = elitisticListPopulation18.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d26 = elitisticListPopulation25.getElitismRate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d31 = elitisticListPopulation30.getElitismRate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation30);
        math.genetics.Population population33 = elitisticListPopulation30.nextGeneration();
        java.lang.String str34 = elitisticListPopulation30.toString();
        int i35 = elitisticListPopulation30.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        elitisticListPopulation38.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40);
        elitisticListPopulation25.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40, (int) (short) 100, (double) (byte) 1);
        elitisticListPopulation18.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome49 = elitisticListPopulation18.spliterator();
        java.lang.String str50 = elitisticListPopulation18.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 35);
        org.junit.Assert.assertTrue(d26 == 0.0d);
        org.junit.Assert.assertTrue(d31 == 0.0d);
        org.junit.Assert.assertNotNull(population33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]" + "'", str34.equals("[]"));
        org.junit.Assert.assertTrue(i35 == 35);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "[]" + "'", str50.equals("[]"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate13, predicate14);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 0);
        defaultedMap1.putAll(map17);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) 1L);
        java.util.Set set25 = defaultedMap20.entrySet();
        java.lang.Object obj27 = defaultedMap20.remove((java.lang.Object) (-1));
        defaultedMap20.clear();
        java.lang.Object obj29 = new java.lang.Object();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, obj29);
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) map30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population35 = elitisticListPopulation34.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome36 = elitisticListPopulation34.iterator();
        java.lang.String str37 = elitisticListPopulation34.toString();
        java.lang.String str38 = elitisticListPopulation34.toString();
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        defaultedMap40.clear();
        boolean b43 = defaultedMap40.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate44, predicate45);
        defaultedMap40.clear();
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) 100.0f);
        java.lang.String str52 = defaultedMap49.toString();
        java.util.Collection collection53 = defaultedMap49.values();
        java.lang.Object obj54 = defaultedMap40.remove((java.lang.Object) collection53);
        elitisticListPopulation34.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection53);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) collection53);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(population35);
        org.junit.Assert.assertNotNull(iterator_chromosome36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(map56);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) 'a');
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.util.Map map18 = null;
        try {
            defaultedMap16.putAll(map18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        int i9 = elitisticListPopulation2.getPopulationLimit();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        defaultedMap11.clear();
        boolean b14 = defaultedMap11.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        defaultedMap11.clear();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 100.0f);
        java.lang.String str23 = defaultedMap20.toString();
        java.util.Collection collection24 = defaultedMap20.values();
        java.lang.Object obj25 = defaultedMap11.remove((java.lang.Object) collection24);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection24);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation2.getChromosomes();
        int i28 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue(i9 == 35);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertTrue(i28 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population15 = elitisticListPopulation14.nextGeneration();
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) population15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        boolean b20 = defaultedMap9.containsKey((java.lang.Object) '#');
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) b20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        defaultedMap26.clear();
        boolean b29 = defaultedMap26.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        java.lang.Object obj33 = defaultedMap23.put((java.lang.Object) 'a', (java.lang.Object) predicate31);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        defaultedMap35.clear();
        boolean b38 = defaultedMap35.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj40 = defaultedMap35.get((java.lang.Object) 0);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        defaultedMap43.clear();
        boolean b46 = defaultedMap43.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj48 = defaultedMap43.get((java.lang.Object) 0);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate41, predicate50);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate50, predicate53);
        boolean b55 = defaultedMap1.equals((java.lang.Object) predicate53);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(population15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Collection collection5 = defaultedMap4.values();
        java.util.Set set6 = defaultedMap4.keySet();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) 1L);
        defaultedMap4.putAll((java.util.Map) defaultedMap8);
        java.lang.String str14 = defaultedMap8.toString();
        defaultedMap8.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        int i23 = elitisticListPopulation18.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation18.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation18.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation18.getChromosomes();
        boolean b27 = defaultedMap8.containsKey((java.lang.Object) list_chromosome26);
        elitisticListPopulation2.setChromosomes(list_chromosome26);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome24);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertNotNull(list_chromosome26);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        java.lang.String str8 = defaultedMap5.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap1.remove(obj10);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationSize();
        int i8 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) defaultedMap7, (java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 0);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Collection collection14 = defaultedMap13.values();
        java.lang.Object obj16 = defaultedMap11.put((java.lang.Object) defaultedMap13, (java.lang.Object) (-1.0d));
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        java.lang.Object obj28 = defaultedMap18.get((java.lang.Object) predicate25);
        java.lang.Object obj29 = defaultedMap11.get(obj28);
        java.lang.Object obj30 = defaultedMap1.remove(obj29);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(35, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) 100.0f);
        boolean b8 = defaultedMap4.containsKey((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap4.entrySet();
        java.util.Set set10 = defaultedMap4.entrySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 'a', (java.lang.Object) predicate21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        boolean b36 = defaultedMap33.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) 0);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate40);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate40, predicate43);
        boolean b45 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        elitisticListPopulation48.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50);
        int i53 = elitisticListPopulation48.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome54 = elitisticListPopulation48.spliterator();
        math.genetics.Population population55 = elitisticListPopulation48.nextGeneration();
        java.lang.Object obj56 = defaultedMap13.get((java.lang.Object) elitisticListPopulation48);
        int i57 = defaultedMap13.size();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i53 == 35);
        org.junit.Assert.assertNotNull(spliterator_chromosome54);
        org.junit.Assert.assertNotNull(population55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(i57 == 1);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        int i10 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Collection collection8 = defaultedMap7.values();
        java.util.Set set9 = defaultedMap7.keySet();
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) set9);
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        defaultedMap14.clear();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) 0);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        defaultedMap28.clear();
        boolean b31 = defaultedMap28.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate32, predicate33);
        java.lang.Object obj35 = defaultedMap25.put((java.lang.Object) 'a', (java.lang.Object) predicate33);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        defaultedMap37.clear();
        boolean b40 = defaultedMap37.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj42 = defaultedMap37.get((java.lang.Object) 0);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        defaultedMap45.clear();
        boolean b48 = defaultedMap45.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj50 = defaultedMap45.get((java.lang.Object) 0);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate43, predicate52);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate52, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate55, predicate57);
        java.lang.Object obj59 = defaultedMap1.remove((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation2.addChromosome(chromosome11);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(iterator_chromosome10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap9.containsKey((java.lang.Object) 1L);
        java.util.Set set14 = defaultedMap9.entrySet();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap9);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        defaultedMap1.clear();
        int i9 = defaultedMap1.size();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 100.0f);
        java.lang.String str14 = defaultedMap11.toString();
        java.util.Collection collection15 = defaultedMap11.values();
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d20 = elitisticListPopulation19.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation19);
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation19.getChromosomes();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation19);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population7 = elitisticListPopulation6.nextGeneration();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) population7);
        java.util.Set set9 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 100.0f);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap6.entrySet();
        java.lang.Object obj13 = defaultedMap6.remove((java.lang.Object) (-1));
        boolean b14 = defaultedMap1.equals((java.lang.Object) (-1));
        defaultedMap1.clear();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 100.0f);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap6.entrySet();
        java.lang.Object obj13 = defaultedMap6.remove((java.lang.Object) (-1));
        boolean b14 = defaultedMap1.equals((java.lang.Object) (-1));
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population19 = elitisticListPopulation18.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation18.iterator();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) elitisticListPopulation18);
        int i22 = elitisticListPopulation18.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d26 = elitisticListPopulation25.getElitismRate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d31 = elitisticListPopulation30.getElitismRate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation30);
        math.genetics.Population population33 = elitisticListPopulation30.nextGeneration();
        java.lang.String str34 = elitisticListPopulation30.toString();
        int i35 = elitisticListPopulation30.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        elitisticListPopulation38.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40);
        elitisticListPopulation25.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40, (int) (short) 100, (double) (byte) 1);
        elitisticListPopulation18.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome49 = elitisticListPopulation18.spliterator();
        math.genetics.Population population50 = elitisticListPopulation18.nextGeneration();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 35);
        org.junit.Assert.assertTrue(d26 == 0.0d);
        org.junit.Assert.assertTrue(d31 == 0.0d);
        org.junit.Assert.assertNotNull(population33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]" + "'", str34.equals("[]"));
        org.junit.Assert.assertTrue(i35 == 35);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome49);
        org.junit.Assert.assertNotNull(population50);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.String str7 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        org.junit.Assert.assertTrue(i6 == 35);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d8 = elitisticListPopulation7.getElitismRate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation7);
        math.genetics.Population population10 = elitisticListPopulation7.nextGeneration();
        java.lang.String str11 = elitisticListPopulation7.toString();
        int i12 = elitisticListPopulation7.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        elitisticListPopulation15.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17);
        elitisticListPopulation7.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) (short) 100, (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome25 = arraylist_chromosome17.spliterator();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNotNull(population10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(i12 == 35);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome25);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        defaultedMap1.clear();
        int i9 = defaultedMap1.size();
        java.util.Collection collection10 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d14 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d19 = elitisticListPopulation18.getElitismRate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation18);
        math.genetics.Population population21 = elitisticListPopulation18.nextGeneration();
        java.lang.String str22 = elitisticListPopulation18.toString();
        int i23 = elitisticListPopulation18.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation13.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, (int) (short) 100, (double) (byte) 1);
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) arraylist_chromosome28);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        elitisticListPopulation39.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41);
        elitisticListPopulation39.setPopulationLimit((int) ' ');
        java.util.List<math.genetics.Chromosome> list_chromosome46 = elitisticListPopulation39.getChromosomes();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation39);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNotNull(population21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertTrue(i23 == 35);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(list_chromosome46);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation2.iterator();
        try {
            elitisticListPopulation2.setElitismRate((double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(iterator_chromosome10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        defaultedMap1.clear();
        int i9 = defaultedMap1.size();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        defaultedMap11.clear();
        boolean b14 = defaultedMap11.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 100.0f);
        boolean b23 = defaultedMap19.containsKey((java.lang.Object) 1L);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.util.Collection collection26 = defaultedMap25.values();
        java.util.Set set27 = defaultedMap25.keySet();
        boolean b28 = defaultedMap19.containsKey((java.lang.Object) set27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap19);
        java.util.Set set30 = defaultedMap29.keySet();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        defaultedMap32.clear();
        boolean b35 = defaultedMap32.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate37);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        defaultedMap43.clear();
        boolean b46 = defaultedMap43.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate48);
        java.lang.Object obj50 = defaultedMap40.put((java.lang.Object) 'a', (java.lang.Object) predicate48);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        defaultedMap52.clear();
        boolean b55 = defaultedMap52.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj57 = defaultedMap52.get((java.lang.Object) 0);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        defaultedMap60.clear();
        boolean b63 = defaultedMap60.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj65 = defaultedMap60.get((java.lang.Object) 0);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate66, predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate58, predicate67);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate67, predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate37, predicate67);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate67);
        math.genetics.ElitisticListPopulation elitisticListPopulation76 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array77 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome78 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b79 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome78, chromosome_array77);
        elitisticListPopulation76.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome78);
        math.genetics.ElitisticListPopulation elitisticListPopulation83 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome78, 10, (double) (short) 0);
        boolean b84 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation83);
        math.genetics.ElitisticListPopulation elitisticListPopulation87 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array88 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome89 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b90 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome89, chromosome_array88);
        elitisticListPopulation87.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome89);
        elitisticListPopulation87.setPopulationLimit((int) ' ');
        java.util.List<math.genetics.Chromosome> list_chromosome94 = elitisticListPopulation87.getChromosomes();
        elitisticListPopulation83.setChromosomes(list_chromosome94);
        java.lang.String str96 = elitisticListPopulation83.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(chromosome_array77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(chromosome_array88);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNotNull(list_chromosome94);
        org.junit.Assert.assertTrue("'" + str96 + "' != '" + "[]" + "'", str96.equals("[]"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.lang.String str6 = elitisticListPopulation2.toString();
        int i7 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        elitisticListPopulation10.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        elitisticListPopulation19.setPopulationLimit((int) ' ');
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome26);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertTrue(i7 == 35);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(list_chromosome26);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 0);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate(map9, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate13, predicate14);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 0);
        defaultedMap1.putAll(map17);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) 1L);
        java.util.Set set25 = defaultedMap20.entrySet();
        java.lang.Object obj27 = defaultedMap20.remove((java.lang.Object) (-1));
        defaultedMap20.clear();
        java.lang.Object obj29 = new java.lang.Object();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, obj29);
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) map30);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        boolean b35 = defaultedMap1.equals((java.lang.Object) defaultedMap33);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b35 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation2.addChromosome(chromosome14);
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation(100, (double) 0.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d13 = elitisticListPopulation12.getElitismRate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        math.genetics.Population population15 = elitisticListPopulation12.nextGeneration();
        java.lang.String str16 = elitisticListPopulation12.toString();
        int i17 = elitisticListPopulation12.getPopulationLimit();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        defaultedMap19.clear();
        boolean b22 = defaultedMap19.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) 0);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        defaultedMap27.clear();
        boolean b30 = defaultedMap27.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj32 = defaultedMap27.get((java.lang.Object) 0);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate33, predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate25, predicate34);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap38.get(obj39);
        java.util.Collection collection41 = defaultedMap38.values();
        boolean b42 = defaultedMap19.equals((java.lang.Object) collection41);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        elitisticListPopulation46.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, 10, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation56 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, (int) (short) 10, 1.0d);
        int i57 = elitisticListPopulation56.getPopulationSize();
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        defaultedMap59.clear();
        boolean b62 = defaultedMap59.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate63, predicate64);
        defaultedMap59.clear();
        int i67 = defaultedMap59.size();
        java.util.Collection collection68 = defaultedMap59.values();
        elitisticListPopulation56.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection68);
        math.genetics.ElitisticListPopulation elitisticListPopulation72 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array73 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome74 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b75 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome74, chromosome_array73);
        elitisticListPopulation72.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome74);
        int i77 = elitisticListPopulation72.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array78 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome79 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b80 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome79, chromosome_array78);
        elitisticListPopulation72.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome79);
        elitisticListPopulation56.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome79);
        math.genetics.ElitisticListPopulation elitisticListPopulation85 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome79, 10, 1.0d);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome79);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome79);
        java.lang.Object obj88 = defaultedMap6.remove((java.lang.Object) elitisticListPopulation9);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertNotNull(population15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertTrue(i17 == 35);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNotNull(chromosome_array73);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertNotNull(chromosome_array78);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.String str11 = defaultedMap5.toString();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        defaultedMap17.clear();
        boolean b20 = defaultedMap17.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate21, predicate22);
        java.lang.Object obj24 = defaultedMap14.put((java.lang.Object) 'a', (java.lang.Object) predicate22);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate12, predicate22);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        defaultedMap1.clear();
        int i9 = defaultedMap1.size();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        defaultedMap11.clear();
        boolean b14 = defaultedMap11.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 100.0f);
        boolean b23 = defaultedMap19.containsKey((java.lang.Object) 1L);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.util.Collection collection26 = defaultedMap25.values();
        java.util.Set set27 = defaultedMap25.keySet();
        boolean b28 = defaultedMap19.containsKey((java.lang.Object) set27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap19);
        java.util.Set set30 = defaultedMap29.keySet();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        defaultedMap32.clear();
        boolean b35 = defaultedMap32.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate37);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        defaultedMap43.clear();
        boolean b46 = defaultedMap43.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate48);
        java.lang.Object obj50 = defaultedMap40.put((java.lang.Object) 'a', (java.lang.Object) predicate48);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        defaultedMap52.clear();
        boolean b55 = defaultedMap52.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj57 = defaultedMap52.get((java.lang.Object) 0);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        defaultedMap60.clear();
        boolean b63 = defaultedMap60.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj65 = defaultedMap60.get((java.lang.Object) 0);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate66, predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate58, predicate67);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate67, predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate37, predicate67);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate67);
        java.util.Collection collection74 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(collection74);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d8 = elitisticListPopulation7.getElitismRate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation7);
        math.genetics.Population population10 = elitisticListPopulation7.nextGeneration();
        java.lang.String str11 = elitisticListPopulation7.toString();
        int i12 = elitisticListPopulation7.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        elitisticListPopulation15.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17);
        elitisticListPopulation7.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) (short) 100, (double) (byte) 1);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) 'a', (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNotNull(population10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(i12 == 35);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        boolean b16 = defaultedMap13.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) 0);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj26 = defaultedMap21.get((java.lang.Object) 0);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate28);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate28, predicate31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        defaultedMap34.clear();
        boolean b37 = defaultedMap34.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) 0);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate40, predicate41);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        defaultedMap47.clear();
        boolean b50 = defaultedMap47.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate52);
        java.lang.Object obj54 = defaultedMap44.put((java.lang.Object) 'a', (java.lang.Object) predicate52);
        boolean b56 = defaultedMap44.containsValue((java.lang.Object) 'a');
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        defaultedMap58.clear();
        boolean b61 = defaultedMap58.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj63 = defaultedMap58.get((java.lang.Object) 0);
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate64, predicate65);
        boolean b67 = defaultedMap44.containsValue((java.lang.Object) predicate65);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate41, predicate65);
        boolean b70 = defaultedMap1.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj71 = null;
        boolean b72 = defaultedMap1.containsKey(obj71);
        boolean b73 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) 0);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate16);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        defaultedMap20.clear();
        boolean b23 = defaultedMap20.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate24, predicate25);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        defaultedMap28.clear();
        boolean b31 = defaultedMap28.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj33 = defaultedMap28.get((java.lang.Object) 0);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate24, predicate34);
        java.util.Set set38 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.lang.String str6 = elitisticListPopulation2.toString();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        elitisticListPopulation10.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12);
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(list_chromosome16);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        math.genetics.Population population10 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(population10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population18 = elitisticListPopulation17.nextGeneration();
        boolean b19 = defaultedMap12.containsValue((java.lang.Object) population18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) b19);
        java.lang.Object obj21 = null;
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj21);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        elitisticListPopulation7.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome14);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(list_chromosome14);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        math.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(population6);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        defaultedMap9.clear();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) 0);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate16);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        defaultedMap20.clear();
        boolean b23 = defaultedMap20.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) 0);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate26, predicate27);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        boolean b36 = defaultedMap33.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate37, predicate38);
        java.lang.Object obj40 = defaultedMap30.put((java.lang.Object) 'a', (java.lang.Object) predicate38);
        boolean b42 = defaultedMap30.containsValue((java.lang.Object) 'a');
        java.util.Set set43 = defaultedMap30.entrySet();
        boolean b44 = defaultedMap20.containsValue((java.lang.Object) set43);
        java.util.Map map45 = collections.map.DefaultedMap.decorate(map18, (java.lang.Object) defaultedMap20);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) 100.0f);
        boolean b8 = defaultedMap4.containsKey((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap4.entrySet();
        java.util.Set set10 = defaultedMap4.entrySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 'a', (java.lang.Object) predicate21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        boolean b36 = defaultedMap33.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) 0);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate40);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate40, predicate43);
        boolean b45 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        java.lang.Object obj46 = null;
        boolean b47 = defaultedMap13.containsValue(obj46);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 100.0f);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap6.entrySet();
        java.lang.Object obj13 = defaultedMap6.remove((java.lang.Object) (-1));
        boolean b14 = defaultedMap1.equals((java.lang.Object) (-1));
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Population population19 = elitisticListPopulation18.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation18.iterator();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) elitisticListPopulation18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation18);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation25.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, 10, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, (int) (short) 10, 1.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome36 = arraylist_chromosome27.spliterator();
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome38 = elitisticListPopulation18.spliterator();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome36);
        org.junit.Assert.assertNotNull(spliterator_chromosome38);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        double d8 = elitisticListPopulation7.getElitismRate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation7);
        math.genetics.Population population10 = elitisticListPopulation7.nextGeneration();
        java.lang.String str11 = elitisticListPopulation7.toString();
        int i12 = elitisticListPopulation7.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        elitisticListPopulation15.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17);
        elitisticListPopulation7.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17);
        int i22 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNotNull(population10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(i12 == 35);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i22 == 35);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        defaultedMap4.clear();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        boolean b16 = defaultedMap13.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) 0);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj26 = defaultedMap21.get((java.lang.Object) 0);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate28);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate28, predicate31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        defaultedMap34.clear();
        boolean b37 = defaultedMap34.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) 0);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate40, predicate41);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        defaultedMap47.clear();
        boolean b50 = defaultedMap47.containsValue((java.lang.Object) 1.0f);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate52);
        java.lang.Object obj54 = defaultedMap44.put((java.lang.Object) 'a', (java.lang.Object) predicate52);
        boolean b56 = defaultedMap44.containsValue((java.lang.Object) 'a');
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        defaultedMap58.clear();
        boolean b61 = defaultedMap58.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj63 = defaultedMap58.get((java.lang.Object) 0);
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate64, predicate65);
        boolean b67 = defaultedMap44.containsValue((java.lang.Object) predicate65);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate41, predicate65);
        boolean b70 = defaultedMap1.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj71 = null;
        boolean b72 = defaultedMap1.containsKey(obj71);
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        java.lang.Object obj76 = defaultedMap74.get((java.lang.Object) 100.0f);
        boolean b78 = defaultedMap74.containsKey((java.lang.Object) 1L);
        java.lang.Object obj79 = null;
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap(obj79);
        java.util.Collection collection81 = defaultedMap80.values();
        boolean b82 = defaultedMap74.equals((java.lang.Object) collection81);
        boolean b83 = defaultedMap1.containsValue((java.lang.Object) collection81);
        java.util.Set set84 = defaultedMap1.keySet();
        java.util.Set set85 = defaultedMap1.keySet();
        java.util.Set set86 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertNotNull(set86);
    }
}

