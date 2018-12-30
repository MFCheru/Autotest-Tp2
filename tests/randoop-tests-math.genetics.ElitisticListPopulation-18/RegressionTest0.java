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
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) predicate1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 'a');
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (-1L));
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (short) 0);
        boolean b12 = defaultedMap1.equals((java.lang.Object) map11);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.get(obj4);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) map4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b8 = defaultedMap7.isEmpty();
        boolean b9 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b12 = defaultedMap11.isEmpty();
        boolean b13 = defaultedMap11.isEmpty();
        java.lang.Object obj15 = defaultedMap7.put((java.lang.Object) b13, (java.lang.Object) (short) -1);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) b13);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        try {
            elitisticListPopulation5.setElitismRate((double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b9 = defaultedMap8.isEmpty();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (-1L));
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (short) 0);
        boolean b14 = defaultedMap3.equals((java.lang.Object) map13);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = null;
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate15, predicate16);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        java.util.Map map19 = null;
        try {
            defaultedMap1.putAll(map19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = null;
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) predicate8);
        int i12 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 'a' + "'", obj11.equals('a'));
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        try {
            math.genetics.Chromosome chromosome8 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        try {
            math.genetics.Chromosome chromosome7 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        try {
            elitisticListPopulation5.setElitismRate((double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b7 = defaultedMap6.isEmpty();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) (-1L));
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) (short) 0);
        boolean b17 = defaultedMap6.equals((java.lang.Object) map16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = null;
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate18, predicate19);
        java.lang.Object obj21 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = null;
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b29 = defaultedMap28.isEmpty();
        java.util.Collection collection30 = defaultedMap28.values();
        boolean b31 = defaultedMap1.containsKey((java.lang.Object) collection30);
        collections.Transformer transformer32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 0, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b10 = defaultedMap9.isEmpty();
        boolean b11 = defaultedMap9.isEmpty();
        java.lang.Object obj13 = defaultedMap5.put((java.lang.Object) b11, (java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) b11, (java.lang.Object) 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.Chromosome chromosome7 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap4.toString();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (-1L));
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 0);
        boolean b20 = defaultedMap9.equals((java.lang.Object) map19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate21, predicate22);
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = null;
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate21, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b32 = defaultedMap31.isEmpty();
        java.util.Collection collection33 = defaultedMap31.values();
        boolean b34 = defaultedMap4.containsKey((java.lang.Object) collection33);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection33);
        double d36 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(d36 == 1.0d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str7 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) b7, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set12 = defaultedMap11.keySet();
        boolean b13 = defaultedMap1.equals((java.lang.Object) set12);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = null;
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 'a' + "'", obj9.equals('a'));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b6 = defaultedMap5.isEmpty();
        boolean b8 = defaultedMap5.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b11 = defaultedMap10.isEmpty();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (-1L));
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) 0);
        boolean b16 = defaultedMap5.equals((java.lang.Object) map15);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = null;
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate17, predicate18);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj23 = defaultedMap5.get((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 'a' + "'", obj23.equals('a'));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) -1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 'a');
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.remove(obj9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b14 = defaultedMap13.isEmpty();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (-1L));
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (short) 0);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj23 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.lang.String str25 = defaultedMap24.toString();
        java.lang.Object obj27 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.lang.String str29 = defaultedMap28.toString();
        java.lang.Object obj30 = defaultedMap24.put((java.lang.Object) 0, (java.lang.Object) defaultedMap28);
        boolean b31 = defaultedMap22.equals((java.lang.Object) defaultedMap24);
        defaultedMap24.clear();
        java.lang.Object obj33 = defaultedMap1.put((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap24);
        collections.Transformer transformer34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, transformer34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, 1, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, 0, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b3 = defaultedMap2.isEmpty();
        java.util.Collection collection4 = defaultedMap2.values();
        java.util.Collection collection5 = defaultedMap2.values();
        boolean b7 = defaultedMap2.containsValue((java.lang.Object) "hi!");
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        java.lang.Object obj12 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.String str14 = defaultedMap13.toString();
        java.lang.Object obj15 = defaultedMap9.put((java.lang.Object) 0, (java.lang.Object) defaultedMap13);
        defaultedMap2.putAll((java.util.Map) defaultedMap9);
        defaultedMap2.clear();
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.get(obj4);
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        java.util.Set set9 = defaultedMap7.keySet();
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) set9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate12);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        int i7 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap1.containsKey(obj6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b11 = defaultedMap10.isEmpty();
        java.util.Collection collection12 = defaultedMap10.values();
        java.util.Collection collection13 = defaultedMap10.values();
        boolean b15 = defaultedMap10.containsValue((java.lang.Object) "hi!");
        java.lang.Object obj16 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.String str18 = defaultedMap17.toString();
        java.lang.Object obj20 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.String str22 = defaultedMap21.toString();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) 0, (java.lang.Object) defaultedMap21);
        defaultedMap10.putAll((java.util.Map) defaultedMap17);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        java.util.Set set26 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj9 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.String str11 = defaultedMap10.toString();
        java.lang.Object obj12 = defaultedMap6.put((java.lang.Object) 0, (java.lang.Object) defaultedMap10);
        boolean b13 = defaultedMap1.containsKey(obj12);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        try {
            elitisticListPopulation5.setElitismRate((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b9 = defaultedMap8.isEmpty();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (-1L));
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (short) 0);
        boolean b14 = defaultedMap3.equals((java.lang.Object) map13);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = null;
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate15, predicate16);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', 10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Population population9 = elitisticListPopulation5.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation5.iterator();
        math.genetics.Population population11 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertNotNull(iterator_chromosome10);
        org.junit.Assert.assertNotNull(population11);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) 0, (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b15 = defaultedMap14.isEmpty();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b20 = defaultedMap19.isEmpty();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) (-1L));
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) (short) 0);
        boolean b25 = defaultedMap14.equals((java.lang.Object) map24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = null;
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate26, predicate27);
        java.lang.Object obj29 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = null;
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate26, predicate32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b37 = defaultedMap36.isEmpty();
        java.util.Collection collection38 = defaultedMap36.values();
        boolean b39 = defaultedMap9.containsKey((java.lang.Object) collection38);
        java.lang.Object obj40 = defaultedMap1.remove((java.lang.Object) collection38);
        collections.Factory factory41 = null;
        try {
            java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap4.toString();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (-1L));
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 0);
        boolean b20 = defaultedMap9.equals((java.lang.Object) map19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate21, predicate22);
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = null;
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate21, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b32 = defaultedMap31.isEmpty();
        java.util.Collection collection33 = defaultedMap31.values();
        boolean b34 = defaultedMap4.containsKey((java.lang.Object) collection33);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection33);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation2.addChromosome(chromosome36);
        int i38 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i38 == 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b9 = defaultedMap8.isEmpty();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (-1L));
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map11);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate(map11, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 0);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 10);
        math.genetics.Population population10 = elitisticListPopulation5.nextGeneration();
        java.util.Collection<math.genetics.Chromosome> collection_chromosome11 = null;
        try {
            elitisticListPopulation5.addChromosomes(collection_chromosome11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(population10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (-1L));
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (short) 0);
        boolean b12 = defaultedMap1.equals((java.lang.Object) map11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj15 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.String str17 = defaultedMap16.toString();
        java.lang.Object obj19 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.String str21 = defaultedMap20.toString();
        java.lang.Object obj22 = defaultedMap16.put((java.lang.Object) 0, (java.lang.Object) defaultedMap20);
        boolean b23 = defaultedMap14.equals((java.lang.Object) defaultedMap16);
        defaultedMap16.clear();
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) defaultedMap16);
        boolean b26 = defaultedMap16.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 10);
        double d10 = elitisticListPopulation5.getElitismRate();
        try {
            elitisticListPopulation5.setElitismRate((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(d10 == 1.0d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set5 = defaultedMap4.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) b7, (java.lang.Object) (short) -1);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap4.toString();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (-1L));
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 0);
        boolean b20 = defaultedMap9.equals((java.lang.Object) map19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate21, predicate22);
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = null;
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate21, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b32 = defaultedMap31.isEmpty();
        java.util.Collection collection33 = defaultedMap31.values();
        boolean b34 = defaultedMap4.containsKey((java.lang.Object) collection33);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection33);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation2.addChromosome(chromosome36);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome38 = elitisticListPopulation2.spliterator();
        double d39 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome38);
        org.junit.Assert.assertTrue(d39 == 1.0d);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap4.toString();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (-1L));
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 0);
        boolean b20 = defaultedMap9.equals((java.lang.Object) map19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate21, predicate22);
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = null;
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate21, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b32 = defaultedMap31.isEmpty();
        java.util.Collection collection33 = defaultedMap31.values();
        boolean b34 = defaultedMap4.containsKey((java.lang.Object) collection33);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection33);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation2.addChromosome(chromosome36);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome38 = elitisticListPopulation2.spliterator();
        try {
            elitisticListPopulation2.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome38);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        int i7 = elitisticListPopulation5.getPopulationSize();
        double d8 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(d8 == 1.0d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b14 = defaultedMap13.isEmpty();
        boolean b16 = defaultedMap13.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b19 = defaultedMap18.isEmpty();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (-1L));
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (short) 0);
        boolean b24 = defaultedMap13.equals((java.lang.Object) map23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = null;
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate25, predicate26);
        java.lang.Object obj28 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = null;
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate25, predicate31);
        boolean b34 = defaultedMap8.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.lang.String str36 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) (short) 100);
        int i10 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Collection collection8 = defaultedMap6.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        elitisticListPopulation11.setElitismRate(0.0d);
        boolean b14 = defaultedMap6.equals((java.lang.Object) 0.0d);
        java.util.Set set15 = defaultedMap6.keySet();
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100 + "'", obj16.equals(100));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (-1L));
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (short) 0);
        boolean b12 = defaultedMap1.equals((java.lang.Object) map11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj15 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.String str17 = defaultedMap16.toString();
        java.lang.Object obj19 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.String str21 = defaultedMap20.toString();
        java.lang.Object obj22 = defaultedMap16.put((java.lang.Object) 0, (java.lang.Object) defaultedMap20);
        boolean b23 = defaultedMap14.equals((java.lang.Object) defaultedMap16);
        defaultedMap16.clear();
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) defaultedMap16);
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, 1, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        elitisticListPopulation31.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33);
        boolean b36 = defaultedMap16.containsKey((java.lang.Object) elitisticListPopulation31);
        try {
            math.genetics.Chromosome chromosome37 = elitisticListPopulation31.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (-1L));
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (short) 0);
        boolean b12 = defaultedMap1.equals((java.lang.Object) map11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = null;
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate14);
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) (short) -1);
        int i18 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b8 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (-1L));
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (short) 0);
        defaultedMap7.clear();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b17 = defaultedMap16.isEmpty();
        java.util.Collection collection18 = defaultedMap16.values();
        java.util.Collection collection19 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b22 = defaultedMap16.containsValue((java.lang.Object) 'a');
        java.util.Collection collection23 = defaultedMap16.values();
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap16.remove(obj24);
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str32 = defaultedMap31.toString();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b37 = defaultedMap36.isEmpty();
        boolean b39 = defaultedMap36.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b42 = defaultedMap41.isEmpty();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) (-1L));
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) (short) 0);
        boolean b47 = defaultedMap36.equals((java.lang.Object) map46);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = null;
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate48, predicate49);
        java.lang.Object obj51 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate54 = null;
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate53, predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate48, predicate54);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b59 = defaultedMap58.isEmpty();
        java.util.Collection collection60 = defaultedMap58.values();
        boolean b61 = defaultedMap31.containsKey((java.lang.Object) collection60);
        elitisticListPopulation29.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection60);
        java.lang.Object obj63 = defaultedMap7.get((java.lang.Object) elitisticListPopulation29);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 'a' + "'", obj63.equals('a'));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 10);
        double d10 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(d10 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        elitisticListPopulation2.setElitismRate(0.0d);
        math.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(iterator_chromosome7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.get(obj4);
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        java.util.Set set9 = defaultedMap7.keySet();
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) set9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj16 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.String str18 = defaultedMap17.toString();
        java.lang.Object obj20 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.String str22 = defaultedMap21.toString();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) 0, (java.lang.Object) defaultedMap21);
        boolean b24 = defaultedMap15.equals((java.lang.Object) defaultedMap17);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 'a' + "'", obj25.equals('a'));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 0);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b15 = defaultedMap14.isEmpty();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b20 = defaultedMap19.isEmpty();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) (-1L));
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) (short) 0);
        boolean b25 = defaultedMap14.equals((java.lang.Object) map24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = null;
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate26, predicate27);
        java.lang.Object obj29 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = null;
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate26, predicate32);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate26);
        java.util.Collection collection36 = defaultedMap1.values();
        collections.Transformer transformer37 = null;
        try {
            java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setElitismRate((double) 0L);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b8 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (-1L));
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (short) 0);
        defaultedMap7.clear();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b17 = defaultedMap16.isEmpty();
        java.util.Collection collection18 = defaultedMap16.values();
        java.util.Collection collection19 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b22 = defaultedMap16.containsValue((java.lang.Object) 'a');
        java.util.Collection collection23 = defaultedMap16.values();
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap16.remove(obj24);
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b29 = defaultedMap28.isEmpty();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (-1L));
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (short) 0);
        defaultedMap16.putAll((java.util.Map) defaultedMap28);
        java.util.Set set35 = defaultedMap16.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b8 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (-1L));
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (short) 0);
        defaultedMap7.clear();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, 1, (double) 1.0f);
        int i21 = elitisticListPopulation20.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation20.iterator();
        int i23 = elitisticListPopulation20.getPopulationLimit();
        math.genetics.Population population24 = elitisticListPopulation20.nextGeneration();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b27 = defaultedMap26.isEmpty();
        boolean b28 = defaultedMap26.isEmpty();
        java.util.Collection collection29 = defaultedMap26.values();
        boolean b30 = defaultedMap26.isEmpty();
        java.util.Set set31 = defaultedMap26.entrySet();
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) elitisticListPopulation20, (java.lang.Object) defaultedMap26);
        int i33 = elitisticListPopulation20.getPopulationLimit();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(i33 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = null;
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) predicate8);
        boolean b12 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 'a' + "'", obj11.equals('a'));
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 1L);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) (-1L));
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) (short) 0);
        boolean b23 = defaultedMap12.equals((java.lang.Object) map22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = null;
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate24, predicate25);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap12);
        boolean b28 = defaultedMap1.containsKey((java.lang.Object) map27);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation5.spliterator();
        try {
            elitisticListPopulation5.setPopulationLimit((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        java.lang.String str9 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setPopulationLimit(100);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = null;
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) predicate8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b14 = defaultedMap13.isEmpty();
        boolean b16 = defaultedMap13.containsValue((java.lang.Object) (short) 0);
        java.lang.String str17 = defaultedMap13.toString();
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = null;
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap13.get((java.lang.Object) predicate20);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.lang.Object obj26 = defaultedMap1.remove((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 'a' + "'", obj11.equals('a'));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 'a' + "'", obj23.equals('a'));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 'a' + "'", obj24.equals('a'));
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.get(obj4);
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        java.util.Set set9 = defaultedMap7.keySet();
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) set9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) (short) 0);
        java.lang.String str20 = defaultedMap16.toString();
        java.lang.Object obj21 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = null;
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        java.lang.Object obj26 = defaultedMap16.get((java.lang.Object) predicate23);
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map13, predicate14, predicate23);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 'a' + "'", obj26.equals('a'));
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b8 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (-1L));
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (short) 0);
        defaultedMap7.clear();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, 1, (double) 1.0f);
        int i21 = elitisticListPopulation20.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation20.iterator();
        int i23 = elitisticListPopulation20.getPopulationLimit();
        math.genetics.Population population24 = elitisticListPopulation20.nextGeneration();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b27 = defaultedMap26.isEmpty();
        boolean b28 = defaultedMap26.isEmpty();
        java.util.Collection collection29 = defaultedMap26.values();
        boolean b30 = defaultedMap26.isEmpty();
        java.util.Set set31 = defaultedMap26.entrySet();
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) elitisticListPopulation20, (java.lang.Object) defaultedMap26);
        try {
            elitisticListPopulation20.setElitismRate((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (-1L));
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 0);
        boolean b20 = defaultedMap9.equals((java.lang.Object) map19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate21, predicate22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap9);
        int i25 = defaultedMap9.size();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj29 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b35 = defaultedMap34.isEmpty();
        boolean b37 = defaultedMap34.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b40 = defaultedMap39.isEmpty();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) (-1L));
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) (short) 0);
        boolean b45 = defaultedMap34.equals((java.lang.Object) map44);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = null;
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate46, predicate47);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) defaultedMap34);
        defaultedMap30.putAll((java.util.Map) defaultedMap34);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        elitisticListPopulation53.setElitismRate(0.0d);
        java.lang.Object obj56 = defaultedMap28.put((java.lang.Object) defaultedMap30, (java.lang.Object) 0.0d);
        java.lang.Object obj57 = defaultedMap1.get(obj56);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100 + "'", obj26.equals(100));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 100 + "'", obj57.equals(100));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b14 = defaultedMap13.isEmpty();
        boolean b16 = defaultedMap13.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b19 = defaultedMap18.isEmpty();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (-1L));
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (short) 0);
        boolean b24 = defaultedMap13.equals((java.lang.Object) map23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = null;
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate25, predicate26);
        java.lang.Object obj28 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = null;
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate25, predicate31);
        boolean b34 = defaultedMap8.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.Factory factory36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b6 = defaultedMap5.isEmpty();
        boolean b8 = defaultedMap5.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b11 = defaultedMap10.isEmpty();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (-1L));
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) 0);
        boolean b16 = defaultedMap5.equals((java.lang.Object) map15);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = null;
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate17, predicate18);
        java.lang.Object obj20 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.String str22 = defaultedMap21.toString();
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.String str26 = defaultedMap25.toString();
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) 0, (java.lang.Object) defaultedMap25);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b31 = defaultedMap30.isEmpty();
        boolean b33 = defaultedMap30.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b36 = defaultedMap35.isEmpty();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) (-1L));
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) (short) 0);
        boolean b41 = defaultedMap30.equals((java.lang.Object) map40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = null;
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate42, predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate28, predicate43);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate28);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 10);
        elitisticListPopulation5.setElitismRate((double) (short) 1);
        try {
            elitisticListPopulation5.setElitismRate((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(population7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 0);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b15 = defaultedMap14.isEmpty();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b20 = defaultedMap19.isEmpty();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) (-1L));
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) (short) 0);
        boolean b25 = defaultedMap14.equals((java.lang.Object) map24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = null;
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate26, predicate27);
        java.lang.Object obj29 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = null;
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate26, predicate32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b37 = defaultedMap36.isEmpty();
        java.util.Collection collection38 = defaultedMap36.values();
        boolean b39 = defaultedMap9.containsKey((java.lang.Object) collection38);
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) collection38);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 'a' + "'", obj40.equals('a'));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = null;
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.lang.Object obj10 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = null;
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.Object obj15 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = null;
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate18);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 'a' + "'", obj9.equals('a'));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap4.toString();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (-1L));
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 0);
        boolean b20 = defaultedMap9.equals((java.lang.Object) map19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate21, predicate22);
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = null;
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate21, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b32 = defaultedMap31.isEmpty();
        java.util.Collection collection33 = defaultedMap31.values();
        boolean b34 = defaultedMap4.containsKey((java.lang.Object) collection33);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection33);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation2.addChromosome(chromosome36);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome38 = elitisticListPopulation2.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome39 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome40 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome38);
        org.junit.Assert.assertNotNull(iterator_chromosome39);
        org.junit.Assert.assertNotNull(iterator_chromosome40);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b8 = defaultedMap7.isEmpty();
        boolean b10 = defaultedMap7.containsValue((java.lang.Object) (short) 0);
        java.lang.String str11 = defaultedMap7.toString();
        java.lang.Object obj12 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b14 = defaultedMap7.containsKey(obj12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b17 = defaultedMap16.isEmpty();
        java.util.Collection collection18 = defaultedMap16.values();
        java.util.Collection collection19 = defaultedMap16.values();
        boolean b21 = defaultedMap16.containsValue((java.lang.Object) "hi!");
        java.lang.Object obj22 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.String str24 = defaultedMap23.toString();
        java.lang.Object obj26 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.String str28 = defaultedMap27.toString();
        java.lang.Object obj29 = defaultedMap23.put((java.lang.Object) 0, (java.lang.Object) defaultedMap27);
        defaultedMap16.putAll((java.util.Map) defaultedMap23);
        boolean b31 = defaultedMap7.containsKey((java.lang.Object) defaultedMap16);
        java.lang.Object obj32 = null;
        boolean b33 = defaultedMap16.equals(obj32);
        defaultedMap16.clear();
        java.lang.Object obj35 = defaultedMap1.put(obj5, (java.lang.Object) defaultedMap16);
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation41.getChromosomes();
        math.genetics.Population population43 = elitisticListPopulation41.nextGeneration();
        elitisticListPopulation41.setPopulationLimit((int) (byte) 10);
        math.genetics.Population population46 = elitisticListPopulation41.nextGeneration();
        boolean b47 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation41);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertNotNull(population43);
        org.junit.Assert.assertNotNull(population46);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = null;
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) predicate8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b14 = defaultedMap13.isEmpty();
        boolean b16 = defaultedMap13.containsValue((java.lang.Object) (short) 0);
        java.lang.String str17 = defaultedMap13.toString();
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = null;
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap13.get((java.lang.Object) predicate20);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b27 = defaultedMap26.isEmpty();
        java.util.Collection collection28 = defaultedMap26.values();
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap26.get(obj29);
        java.lang.Object obj31 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.String str33 = defaultedMap32.toString();
        java.util.Set set34 = defaultedMap32.keySet();
        boolean b35 = defaultedMap26.containsKey((java.lang.Object) set34);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap26);
        boolean b37 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b40 = defaultedMap39.isEmpty();
        boolean b42 = defaultedMap39.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b45 = defaultedMap44.isEmpty();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) (-1L));
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) (short) 0);
        boolean b50 = defaultedMap39.equals((java.lang.Object) map49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj53 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        java.lang.String str55 = defaultedMap54.toString();
        java.lang.Object obj57 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        java.lang.String str59 = defaultedMap58.toString();
        java.lang.Object obj60 = defaultedMap54.put((java.lang.Object) 0, (java.lang.Object) defaultedMap58);
        boolean b61 = defaultedMap52.equals((java.lang.Object) defaultedMap54);
        defaultedMap54.clear();
        boolean b63 = defaultedMap39.containsKey((java.lang.Object) defaultedMap54);
        math.genetics.Chromosome[] chromosome_array64 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome65 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b66 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65, chromosome_array64);
        math.genetics.ElitisticListPopulation elitisticListPopulation69 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome65, 1, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array70 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome71 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b72 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome71, chromosome_array70);
        elitisticListPopulation69.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome71);
        boolean b74 = defaultedMap54.containsKey((java.lang.Object) elitisticListPopulation69);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome75 = elitisticListPopulation69.iterator();
        java.lang.Object obj76 = defaultedMap13.get((java.lang.Object) elitisticListPopulation69);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 'a' + "'", obj11.equals('a'));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 'a' + "'", obj23.equals('a'));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 'a' + "'", obj24.equals('a'));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 'a' + "'", obj30.equals('a'));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(chromosome_array64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(chromosome_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome75);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 'a' + "'", obj76.equals('a'));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.String str9 = defaultedMap8.toString();
        java.lang.Object obj11 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.String str13 = defaultedMap12.toString();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) 0, (java.lang.Object) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Collection collection19 = defaultedMap17.values();
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap17.get(obj20);
        java.lang.Object obj22 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.String str24 = defaultedMap23.toString();
        java.util.Set set25 = defaultedMap23.keySet();
        boolean b26 = defaultedMap17.containsKey((java.lang.Object) set25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b30 = defaultedMap29.isEmpty();
        boolean b32 = defaultedMap29.containsValue((java.lang.Object) (short) 0);
        java.lang.String str33 = defaultedMap29.toString();
        java.lang.Object obj34 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = null;
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        java.lang.Object obj39 = defaultedMap29.get((java.lang.Object) predicate36);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate27, predicate36);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b43 = defaultedMap42.isEmpty();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) (-1L));
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) (short) 0);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str51 = defaultedMap50.toString();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b56 = defaultedMap55.isEmpty();
        boolean b58 = defaultedMap55.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b61 = defaultedMap60.isEmpty();
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) (-1L));
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) (short) 0);
        boolean b66 = defaultedMap55.equals((java.lang.Object) map65);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate68 = null;
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate67, predicate68);
        java.lang.Object obj70 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap(obj70);
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate73 = null;
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate72, predicate73);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate67, predicate73);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate48, predicate67);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate36, predicate67);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 'a' + "'", obj21.equals('a'));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 'a' + "'", obj39.equals('a'));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b8 = defaultedMap7.isEmpty();
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) defaultedMap7);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, 1, (double) 1.0f);
        int i16 = elitisticListPopulation15.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation15.iterator();
        int i18 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.Population population19 = elitisticListPopulation15.nextGeneration();
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation15.addChromosome(chromosome20);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) elitisticListPopulation15);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 'a' + "'", obj22.equals('a'));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.String str9 = defaultedMap8.toString();
        java.lang.Object obj11 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.String str13 = defaultedMap12.toString();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) 0, (java.lang.Object) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b7 = defaultedMap6.isEmpty();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Collection collection13 = defaultedMap11.values();
        java.util.Collection collection14 = defaultedMap11.values();
        boolean b16 = defaultedMap11.containsValue((java.lang.Object) "hi!");
        boolean b17 = defaultedMap6.containsValue((java.lang.Object) defaultedMap11);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) b17);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap3.keySet();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) set4);
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Collection collection4 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b7 = defaultedMap6.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 10);
        int i10 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(i10 == 10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b8 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (-1L));
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (short) 0);
        defaultedMap7.clear();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, 1, (double) 1.0f);
        int i21 = elitisticListPopulation20.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation20.iterator();
        int i23 = elitisticListPopulation20.getPopulationLimit();
        math.genetics.Population population24 = elitisticListPopulation20.nextGeneration();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b27 = defaultedMap26.isEmpty();
        boolean b28 = defaultedMap26.isEmpty();
        java.util.Collection collection29 = defaultedMap26.values();
        boolean b30 = defaultedMap26.isEmpty();
        java.util.Set set31 = defaultedMap26.entrySet();
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) elitisticListPopulation20, (java.lang.Object) defaultedMap26);
        try {
            math.genetics.Chromosome chromosome33 = elitisticListPopulation20.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation(list_chromosome6, (int) (byte) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (-1L));
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 0);
        boolean b20 = defaultedMap9.equals((java.lang.Object) map19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate21, predicate22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap9);
        int i25 = defaultedMap9.size();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.Factory factory27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100 + "'", obj26.equals(100));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.get(obj4);
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        java.util.Set set9 = defaultedMap7.keySet();
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) set9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b14 = defaultedMap13.isEmpty();
        boolean b16 = defaultedMap13.containsValue((java.lang.Object) (short) 0);
        java.lang.String str17 = defaultedMap13.toString();
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = null;
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap13.get((java.lang.Object) predicate20);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate20);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        int i26 = defaultedMap25.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 'a' + "'", obj23.equals('a'));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b8 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (-1L));
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (short) 0);
        java.lang.Object obj13 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.String str15 = defaultedMap14.toString();
        java.lang.Object obj17 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.String str19 = defaultedMap18.toString();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) 0, (java.lang.Object) defaultedMap18);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b24 = defaultedMap23.isEmpty();
        boolean b26 = defaultedMap23.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b29 = defaultedMap28.isEmpty();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (-1L));
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (short) 0);
        boolean b34 = defaultedMap23.equals((java.lang.Object) map33);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = null;
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate35, predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate21, predicate36);
        java.lang.Object obj39 = defaultedMap7.remove((java.lang.Object) predicate21);
        boolean b40 = defaultedMap1.equals((java.lang.Object) predicate21);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Population population9 = elitisticListPopulation5.nextGeneration();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation5);
        try {
            math.genetics.Chromosome chromosome11 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(population9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (-1L));
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (short) 0);
        boolean b12 = defaultedMap1.equals((java.lang.Object) map11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = null;
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate14);
        java.lang.Object obj16 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.String str18 = defaultedMap17.toString();
        java.lang.Object obj20 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.String str22 = defaultedMap21.toString();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) 0, (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str26 = defaultedMap25.toString();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b31 = defaultedMap30.isEmpty();
        boolean b33 = defaultedMap30.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b36 = defaultedMap35.isEmpty();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) (-1L));
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) (short) 0);
        boolean b41 = defaultedMap30.equals((java.lang.Object) map40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = null;
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate42, predicate43);
        java.lang.Object obj45 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = null;
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate42, predicate48);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b53 = defaultedMap52.isEmpty();
        java.util.Collection collection54 = defaultedMap52.values();
        boolean b55 = defaultedMap25.containsKey((java.lang.Object) collection54);
        java.lang.Object obj56 = defaultedMap17.remove((java.lang.Object) collection54);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj59 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        java.lang.String str61 = defaultedMap60.toString();
        java.lang.Object obj63 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap(obj63);
        java.lang.String str65 = defaultedMap64.toString();
        java.lang.Object obj66 = defaultedMap60.put((java.lang.Object) 0, (java.lang.Object) defaultedMap64);
        boolean b67 = defaultedMap58.equals((java.lang.Object) defaultedMap60);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj69 = defaultedMap17.put((java.lang.Object) b67, (java.lang.Object) predicate68);
        boolean b70 = defaultedMap1.equals((java.lang.Object) predicate68);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = null;
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj11 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.String str13 = defaultedMap12.toString();
        java.lang.Object obj15 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.String str17 = defaultedMap16.toString();
        java.lang.Object obj18 = defaultedMap12.put((java.lang.Object) 0, (java.lang.Object) defaultedMap16);
        java.lang.Object obj19 = defaultedMap10.remove((java.lang.Object) defaultedMap16);
        java.util.Set set20 = defaultedMap16.keySet();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 'a' + "'", obj9.equals('a'));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = null;
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        int i10 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b13 = defaultedMap12.isEmpty();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (-1L));
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (short) 0);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str21 = defaultedMap20.toString();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b26 = defaultedMap25.isEmpty();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b31 = defaultedMap30.isEmpty();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (-1L));
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (short) 0);
        boolean b36 = defaultedMap25.equals((java.lang.Object) map35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = null;
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate37, predicate38);
        java.lang.Object obj40 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = null;
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate42, predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate37, predicate43);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate18, predicate37);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b49 = defaultedMap48.isEmpty();
        boolean b51 = defaultedMap48.containsValue((java.lang.Object) (short) 0);
        java.lang.String str52 = defaultedMap48.toString();
        java.lang.Object obj53 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate56 = null;
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        java.lang.Object obj58 = defaultedMap48.get((java.lang.Object) predicate55);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate37, predicate55);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 'a' + "'", obj9.equals('a'));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 'a' + "'", obj58.equals('a'));
        org.junit.Assert.assertNotNull(map59);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) arraylist_chromosome7);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) -1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap4.toString();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (-1L));
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 0);
        boolean b20 = defaultedMap9.equals((java.lang.Object) map19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate21, predicate22);
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = null;
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate21, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b32 = defaultedMap31.isEmpty();
        java.util.Collection collection33 = defaultedMap31.values();
        boolean b34 = defaultedMap4.containsKey((java.lang.Object) collection33);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection33);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome36 = elitisticListPopulation2.iterator();
        java.lang.String str37 = elitisticListPopulation2.toString();
        int i38 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
        org.junit.Assert.assertTrue(i38 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Population population9 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation5.addChromosome(chromosome10);
        int i12 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap1.containsKey(obj6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b11 = defaultedMap10.isEmpty();
        java.util.Collection collection12 = defaultedMap10.values();
        java.util.Collection collection13 = defaultedMap10.values();
        boolean b15 = defaultedMap10.containsValue((java.lang.Object) "hi!");
        java.lang.Object obj16 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.String str18 = defaultedMap17.toString();
        java.lang.Object obj20 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.String str22 = defaultedMap21.toString();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) 0, (java.lang.Object) defaultedMap21);
        defaultedMap10.putAll((java.util.Map) defaultedMap17);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap10.equals(obj26);
        defaultedMap10.clear();
        collections.Factory factory29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 10);
        math.genetics.Population population10 = elitisticListPopulation5.nextGeneration();
        math.genetics.Population population11 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setElitismRate((double) (byte) 1);
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(population10);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(list_chromosome14);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 1.0d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Collection collection8 = defaultedMap6.values();
        java.util.Collection collection9 = defaultedMap6.values();
        boolean b11 = defaultedMap6.containsValue((java.lang.Object) "hi!");
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.lang.String str13 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap1.containsKey(obj6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b11 = defaultedMap10.isEmpty();
        java.util.Collection collection12 = defaultedMap10.values();
        java.util.Collection collection13 = defaultedMap10.values();
        boolean b15 = defaultedMap10.containsValue((java.lang.Object) "hi!");
        java.lang.Object obj16 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.String str18 = defaultedMap17.toString();
        java.lang.Object obj20 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.String str22 = defaultedMap21.toString();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) 0, (java.lang.Object) defaultedMap21);
        defaultedMap10.putAll((java.util.Map) defaultedMap17);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap10.equals(obj26);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set31 = defaultedMap30.keySet();
        int i32 = defaultedMap30.size();
        boolean b33 = defaultedMap30.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str39 = defaultedMap38.toString();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b44 = defaultedMap43.isEmpty();
        boolean b46 = defaultedMap43.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b49 = defaultedMap48.isEmpty();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) (-1L));
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) (short) 0);
        boolean b54 = defaultedMap43.equals((java.lang.Object) map53);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate56 = null;
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate55, predicate56);
        java.lang.Object obj58 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate61 = null;
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate60, predicate61);
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate55, predicate61);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b66 = defaultedMap65.isEmpty();
        java.util.Collection collection67 = defaultedMap65.values();
        boolean b68 = defaultedMap38.containsKey((java.lang.Object) collection67);
        elitisticListPopulation36.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection67);
        math.genetics.Chromosome chromosome70 = null;
        elitisticListPopulation36.addChromosome(chromosome70);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome72 = elitisticListPopulation36.iterator();
        java.lang.Object obj73 = defaultedMap30.get((java.lang.Object) iterator_chromosome72);
        java.lang.Object obj74 = defaultedMap10.get(obj73);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome72);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 'a' + "'", obj73.equals('a'));
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 'a' + "'", obj74.equals('a'));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b9 = defaultedMap8.isEmpty();
        java.util.Collection collection10 = defaultedMap8.values();
        java.util.Collection collection11 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b14 = defaultedMap8.containsValue((java.lang.Object) 'a');
        java.util.Collection collection15 = defaultedMap8.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection15);
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation5.addChromosome(chromosome17);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Collection collection4 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(list_chromosome7, 10, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.List<math.genetics.Chromosome> list_chromosome0 = null;
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(list_chromosome0, 0, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        int i9 = elitisticListPopulation8.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i9 == 97);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 10);
        elitisticListPopulation5.setElitismRate((double) (short) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str17 = defaultedMap16.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b22 = defaultedMap21.isEmpty();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b27 = defaultedMap26.isEmpty();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) (-1L));
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) (short) 0);
        boolean b32 = defaultedMap21.equals((java.lang.Object) map31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = null;
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate33, predicate34);
        java.lang.Object obj36 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = null;
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate33, predicate39);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b44 = defaultedMap43.isEmpty();
        java.util.Collection collection45 = defaultedMap43.values();
        boolean b46 = defaultedMap16.containsKey((java.lang.Object) collection45);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection45);
        math.genetics.Chromosome chromosome48 = null;
        elitisticListPopulation14.addChromosome(chromosome48);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome50 = elitisticListPopulation14.spliterator();
        elitisticListPopulation14.setPopulationLimit((int) (short) 10);
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54, 1, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array59 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome60 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b61 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome60, chromosome_array59);
        elitisticListPopulation58.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome60);
        elitisticListPopulation14.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome60);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome60);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome50);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(chromosome_array59);
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b8 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (-1L));
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (short) 0);
        defaultedMap7.clear();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, 1, (double) 1.0f);
        int i21 = elitisticListPopulation20.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation20.iterator();
        int i23 = elitisticListPopulation20.getPopulationLimit();
        math.genetics.Population population24 = elitisticListPopulation20.nextGeneration();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b27 = defaultedMap26.isEmpty();
        boolean b28 = defaultedMap26.isEmpty();
        java.util.Collection collection29 = defaultedMap26.values();
        boolean b30 = defaultedMap26.isEmpty();
        java.util.Set set31 = defaultedMap26.entrySet();
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) elitisticListPopulation20, (java.lang.Object) defaultedMap26);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        elitisticListPopulation35.setElitismRate(0.0d);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome44 = elitisticListPopulation43.getChromosomes();
        math.genetics.Population population45 = elitisticListPopulation43.nextGeneration();
        math.genetics.Chromosome[] chromosome_array46 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome47 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b48 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome47, chromosome_array46);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome47, 1, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array52 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome53 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b54 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome53, chromosome_array52);
        elitisticListPopulation51.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome53);
        elitisticListPopulation43.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome53);
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome53);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome53);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(list_chromosome44);
        org.junit.Assert.assertNotNull(population45);
        org.junit.Assert.assertNotNull(chromosome_array46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(chromosome_array52);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 1L);
        java.util.Collection collection8 = defaultedMap1.values();
        boolean b9 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap4.toString();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (-1L));
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 0);
        boolean b20 = defaultedMap9.equals((java.lang.Object) map19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate21, predicate22);
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = null;
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate21, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b32 = defaultedMap31.isEmpty();
        java.util.Collection collection33 = defaultedMap31.values();
        boolean b34 = defaultedMap4.containsKey((java.lang.Object) collection33);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection33);
        int i36 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i36 == 1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap4.toString();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (-1L));
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 0);
        boolean b20 = defaultedMap9.equals((java.lang.Object) map19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate21, predicate22);
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = null;
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate21, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b32 = defaultedMap31.isEmpty();
        java.util.Collection collection33 = defaultedMap31.values();
        boolean b34 = defaultedMap4.containsKey((java.lang.Object) collection33);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection33);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation2.addChromosome(chromosome36);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome44 = elitisticListPopulation43.getChromosomes();
        math.genetics.Population population45 = elitisticListPopulation43.nextGeneration();
        math.genetics.Chromosome[] chromosome_array46 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome47 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b48 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome47, chromosome_array46);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome47, 1, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array52 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome53 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b54 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome53, chromosome_array52);
        elitisticListPopulation51.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome53);
        elitisticListPopulation43.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome53);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome53);
        math.genetics.Chromosome chromosome58 = null;
        elitisticListPopulation2.addChromosome(chromosome58);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(list_chromosome44);
        org.junit.Assert.assertNotNull(population45);
        org.junit.Assert.assertNotNull(chromosome_array46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(chromosome_array52);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.get(obj4);
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        java.util.Set set9 = defaultedMap7.keySet();
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) set9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b14 = defaultedMap13.isEmpty();
        boolean b16 = defaultedMap13.containsValue((java.lang.Object) (short) 0);
        java.lang.String str17 = defaultedMap13.toString();
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = null;
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap13.get((java.lang.Object) predicate20);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap26.clear();
        java.lang.Object obj28 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = null;
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) map32);
        java.lang.Object obj34 = defaultedMap26.get((java.lang.Object) defaultedMap33);
        java.util.Set set35 = defaultedMap33.keySet();
        java.lang.Object obj36 = defaultedMap1.remove((java.lang.Object) set35);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 'a' + "'", obj23.equals('a'));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 'a' + "'", obj34.equals('a'));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        int i8 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 10);
        math.genetics.Population population10 = elitisticListPopulation5.nextGeneration();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b13 = defaultedMap12.isEmpty();
        java.util.Collection collection14 = defaultedMap12.values();
        java.util.Collection collection15 = defaultedMap12.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection15);
        java.lang.String str17 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(population10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 10);
        double d10 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population11 = elitisticListPopulation5.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = population11.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(d10 == 1.0d);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b9 = defaultedMap8.isEmpty();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (-1L));
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (short) 0);
        boolean b14 = defaultedMap3.equals((java.lang.Object) map13);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = null;
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate15, predicate16);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        java.lang.String str19 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation5.spliterator();
        java.lang.String str11 = elitisticListPopulation5.toString();
        math.genetics.Population population12 = elitisticListPopulation5.nextGeneration();
        try {
            math.genetics.Chromosome chromosome13 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(population12);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 'a');
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap10.clear();
        java.lang.Object obj12 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = null;
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) map16);
        java.lang.Object obj18 = defaultedMap10.get((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        java.lang.Object obj20 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.String str22 = defaultedMap21.toString();
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.String str26 = defaultedMap25.toString();
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) 0, (java.lang.Object) defaultedMap25);
        java.lang.Object obj28 = defaultedMap19.remove((java.lang.Object) defaultedMap25);
        java.lang.Object obj29 = defaultedMap1.get(obj28);
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) (-1));
        java.util.Set set32 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 'a' + "'", obj18.equals('a'));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 'a' + "'", obj29.equals('a'));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 'a' + "'", obj31.equals('a'));
        org.junit.Assert.assertNotNull(set32);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        boolean b5 = defaultedMap1.containsKey(obj3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 'a');
        java.util.Collection collection8 = defaultedMap1.values();
        java.util.Set set9 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b7 = defaultedMap6.isEmpty();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) (-1L));
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) (short) 0);
        boolean b17 = defaultedMap6.equals((java.lang.Object) map16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = null;
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate18, predicate19);
        java.lang.Object obj21 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = null;
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b29 = defaultedMap28.isEmpty();
        java.util.Collection collection30 = defaultedMap28.values();
        boolean b31 = defaultedMap1.containsKey((java.lang.Object) collection30);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33, 1, (double) 1.0f);
        int i38 = elitisticListPopulation37.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome39 = elitisticListPopulation37.iterator();
        int i40 = elitisticListPopulation37.getPopulationLimit();
        int i41 = elitisticListPopulation37.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome42 = elitisticListPopulation37.spliterator();
        java.lang.String str43 = elitisticListPopulation37.toString();
        math.genetics.Population population44 = elitisticListPopulation37.nextGeneration();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) population44);
        math.genetics.Chromosome[] chromosome_array46 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome47 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b48 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome47, chromosome_array46);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome47, 1, (double) 1.0f);
        int i52 = elitisticListPopulation51.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome53 = elitisticListPopulation51.iterator();
        int i54 = elitisticListPopulation51.getPopulationLimit();
        int i55 = elitisticListPopulation51.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome56 = elitisticListPopulation51.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome57 = elitisticListPopulation51.iterator();
        java.lang.Object obj58 = defaultedMap45.get((java.lang.Object) elitisticListPopulation51);
        java.lang.Object obj59 = defaultedMap1.get((java.lang.Object) elitisticListPopulation51);
        math.genetics.Chromosome chromosome60 = null;
        elitisticListPopulation51.addChromosome(chromosome60);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome39);
        org.junit.Assert.assertTrue(i40 == 1);
        org.junit.Assert.assertTrue(i41 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "[]" + "'", str43.equals("[]"));
        org.junit.Assert.assertNotNull(population44);
        org.junit.Assert.assertNotNull(chromosome_array46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome53);
        org.junit.Assert.assertTrue(i54 == 1);
        org.junit.Assert.assertTrue(i55 == 1);
        org.junit.Assert.assertNotNull(list_chromosome56);
        org.junit.Assert.assertNotNull(iterator_chromosome57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 100 + "'", obj59.equals(100));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b8 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (-1L));
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (short) 0);
        defaultedMap7.clear();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b17 = defaultedMap16.isEmpty();
        java.util.Collection collection18 = defaultedMap16.values();
        java.util.Collection collection19 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b22 = defaultedMap16.containsValue((java.lang.Object) 'a');
        java.util.Collection collection23 = defaultedMap16.values();
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap16.remove(obj24);
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b29 = defaultedMap28.isEmpty();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (-1L));
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (short) 0);
        defaultedMap16.putAll((java.util.Map) defaultedMap28);
        java.util.Set set35 = defaultedMap28.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap4.toString();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (-1L));
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 0);
        boolean b20 = defaultedMap9.equals((java.lang.Object) map19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate21, predicate22);
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = null;
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate21, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b32 = defaultedMap31.isEmpty();
        java.util.Collection collection33 = defaultedMap31.values();
        boolean b34 = defaultedMap4.containsKey((java.lang.Object) collection33);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection33);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation2.addChromosome(chromosome36);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome38 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit((int) (short) 10);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, 1, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        elitisticListPopulation46.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, (int) (short) 0, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome38);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap4.toString();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (-1L));
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 0);
        boolean b20 = defaultedMap9.equals((java.lang.Object) map19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate21, predicate22);
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = null;
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate21, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b32 = defaultedMap31.isEmpty();
        java.util.Collection collection33 = defaultedMap31.values();
        boolean b34 = defaultedMap4.containsKey((java.lang.Object) collection33);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection33);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation2.addChromosome(chromosome36);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome38 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome38);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (-1L));
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (short) 0);
        boolean b12 = defaultedMap1.equals((java.lang.Object) map11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj15 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.String str17 = defaultedMap16.toString();
        java.lang.Object obj19 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.String str21 = defaultedMap20.toString();
        java.lang.Object obj22 = defaultedMap16.put((java.lang.Object) 0, (java.lang.Object) defaultedMap20);
        boolean b23 = defaultedMap14.equals((java.lang.Object) defaultedMap16);
        defaultedMap16.clear();
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set28 = defaultedMap27.keySet();
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) defaultedMap27);
        java.util.Set set30 = defaultedMap27.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = null;
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.util.Set set10 = defaultedMap8.keySet();
        int i11 = defaultedMap8.size();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 'a' + "'", obj9.equals('a'));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap4.toString();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (-1L));
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 0);
        boolean b20 = defaultedMap9.equals((java.lang.Object) map19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate21, predicate22);
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = null;
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate21, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b32 = defaultedMap31.isEmpty();
        java.util.Collection collection33 = defaultedMap31.values();
        boolean b34 = defaultedMap4.containsKey((java.lang.Object) collection33);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection33);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation2.addChromosome(chromosome36);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome38 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit((int) (short) 10);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, 1, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        elitisticListPopulation46.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome38);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 'a');
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.remove(obj9);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        boolean b4 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b15 = defaultedMap14.isEmpty();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b20 = defaultedMap19.isEmpty();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) (-1L));
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) (short) 0);
        boolean b25 = defaultedMap14.equals((java.lang.Object) map24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = null;
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate26, predicate27);
        java.lang.Object obj29 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = null;
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate26, predicate32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b37 = defaultedMap36.isEmpty();
        java.util.Collection collection38 = defaultedMap36.values();
        boolean b39 = defaultedMap9.containsKey((java.lang.Object) collection38);
        elitisticListPopulation7.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection38);
        math.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation7.addChromosome(chromosome41);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome43 = elitisticListPopulation7.iterator();
        java.lang.Object obj44 = defaultedMap1.get((java.lang.Object) iterator_chromosome43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap46.clear();
        java.lang.Object obj48 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate51 = null;
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) map52);
        java.lang.Object obj54 = defaultedMap46.get((java.lang.Object) defaultedMap53);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj54);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 'a' + "'", obj44.equals('a'));
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 'a' + "'", obj54.equals('a'));
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = null;
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) (short) 1);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 'a' + "'", obj9.equals('a'));
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0.0f);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 97);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b14 = defaultedMap13.isEmpty();
        boolean b16 = defaultedMap13.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b19 = defaultedMap18.isEmpty();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (-1L));
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (short) 0);
        boolean b24 = defaultedMap13.equals((java.lang.Object) map23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = null;
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate25, predicate26);
        java.lang.Object obj28 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = null;
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate25, predicate31);
        boolean b34 = defaultedMap8.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        int i7 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, 1, (double) 1.0f);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b9 = defaultedMap8.isEmpty();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (-1L));
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map11);
        int i13 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b16 = defaultedMap15.isEmpty();
        boolean b18 = defaultedMap15.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b21 = defaultedMap20.isEmpty();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) (-1L));
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) (short) 0);
        boolean b26 = defaultedMap15.equals((java.lang.Object) map25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = null;
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate27, predicate28);
        boolean b31 = defaultedMap15.containsValue((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) defaultedMap15);
        collections.Factory factory33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (short) 0);
        java.lang.String str13 = defaultedMap9.toString();
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = null;
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) predicate16);
        collections.Predicate predicate20 = null;
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate20);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 'a' + "'", obj19.equals('a'));
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(list_chromosome7, (int) '#', (double) (byte) 0);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b8 = defaultedMap7.isEmpty();
        boolean b10 = defaultedMap7.containsValue((java.lang.Object) (short) 0);
        java.lang.String str11 = defaultedMap7.toString();
        java.lang.Object obj12 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b14 = defaultedMap7.containsKey(obj12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b17 = defaultedMap16.isEmpty();
        java.util.Collection collection18 = defaultedMap16.values();
        java.util.Collection collection19 = defaultedMap16.values();
        boolean b21 = defaultedMap16.containsValue((java.lang.Object) "hi!");
        java.lang.Object obj22 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.String str24 = defaultedMap23.toString();
        java.lang.Object obj26 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.String str28 = defaultedMap27.toString();
        java.lang.Object obj29 = defaultedMap23.put((java.lang.Object) 0, (java.lang.Object) defaultedMap27);
        defaultedMap16.putAll((java.util.Map) defaultedMap23);
        boolean b31 = defaultedMap7.containsKey((java.lang.Object) defaultedMap16);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b31);
        java.lang.Object obj33 = null;
        java.util.Map map34 = collections.map.DefaultedMap.decorate(map32, obj33);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        int i3 = defaultedMap1.size();
        java.util.Collection collection4 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation5.spliterator();
        java.lang.String str11 = elitisticListPopulation5.toString();
        int i12 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = null;
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, 1, (double) 1.0f);
        int i16 = elitisticListPopulation15.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation15.iterator();
        int i18 = elitisticListPopulation15.getPopulationLimit();
        java.lang.Object obj19 = defaultedMap8.get((java.lang.Object) elitisticListPopulation15);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 'a' + "'", obj9.equals('a'));
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 'a');
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.remove(obj9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b14 = defaultedMap13.isEmpty();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (-1L));
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (short) 0);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 0);
        java.lang.String str20 = defaultedMap1.toString();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{1.0=0}" + "'", str20.equals("{1.0=0}"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 10);
        double d10 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population11 = elitisticListPopulation5.nextGeneration();
        java.lang.String str12 = elitisticListPopulation5.toString();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(d10 == 1.0d);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(population13);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, 1, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15);
        double d19 = elitisticListPopulation5.getElitismRate();
        try {
            elitisticListPopulation5.setPopulationLimit((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(d19 == 1.0d);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        int i10 = defaultedMap8.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.lang.String str4 = defaultedMap1.toString();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation10.getChromosomes();
        math.genetics.Population population12 = elitisticListPopulation10.nextGeneration();
        elitisticListPopulation10.setPopulationLimit((int) (byte) 10);
        elitisticListPopulation10.setElitismRate((double) (short) 1);
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation10);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation10.iterator();
        try {
            math.genetics.Chromosome chromosome19 = elitisticListPopulation10.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap1.containsKey(obj6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b11 = defaultedMap10.isEmpty();
        java.util.Collection collection12 = defaultedMap10.values();
        java.util.Collection collection13 = defaultedMap10.values();
        boolean b15 = defaultedMap10.containsValue((java.lang.Object) "hi!");
        java.lang.Object obj16 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.String str18 = defaultedMap17.toString();
        java.lang.Object obj20 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.String str22 = defaultedMap21.toString();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) 0, (java.lang.Object) defaultedMap21);
        defaultedMap10.putAll((java.util.Map) defaultedMap17);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        collections.Predicate predicate26 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b29 = defaultedMap28.isEmpty();
        java.util.Collection collection30 = defaultedMap28.values();
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap28.get(obj31);
        java.lang.Object obj33 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.lang.String str35 = defaultedMap34.toString();
        java.util.Set set36 = defaultedMap34.keySet();
        boolean b37 = defaultedMap28.containsKey((java.lang.Object) set36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b41 = defaultedMap40.isEmpty();
        boolean b43 = defaultedMap40.containsValue((java.lang.Object) (short) 0);
        java.lang.String str44 = defaultedMap40.toString();
        java.lang.Object obj45 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = null;
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        java.lang.Object obj50 = defaultedMap40.get((java.lang.Object) predicate47);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate38, predicate47);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate26, predicate38);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 'a' + "'", obj32.equals('a'));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 'a' + "'", obj50.equals('a'));
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Population population9 = elitisticListPopulation5.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation5.spliterator();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation5);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 0);
        defaultedMap1.clear();
        int i8 = defaultedMap1.size();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.String str9 = defaultedMap8.toString();
        java.lang.Object obj11 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.String str13 = defaultedMap12.toString();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) 0, (java.lang.Object) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str19 = defaultedMap18.toString();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 10.0f);
        java.util.Set set22 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b27 = defaultedMap26.isEmpty();
        boolean b29 = defaultedMap26.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b32 = defaultedMap31.isEmpty();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) (-1L));
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) (short) 0);
        boolean b37 = defaultedMap26.equals((java.lang.Object) map36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = null;
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate38, predicate39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) defaultedMap26);
        int i42 = defaultedMap26.size();
        java.lang.Object obj43 = defaultedMap18.get((java.lang.Object) defaultedMap26);
        java.lang.Object obj44 = defaultedMap1.get((java.lang.Object) defaultedMap18);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        elitisticListPopulation47.setElitismRate(0.0d);
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome51, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome56 = elitisticListPopulation55.getChromosomes();
        math.genetics.Population population57 = elitisticListPopulation55.nextGeneration();
        math.genetics.Chromosome[] chromosome_array58 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome59 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b60 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome59, chromosome_array58);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome59, 1, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array64 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome65 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b66 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65, chromosome_array64);
        elitisticListPopulation63.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome65);
        elitisticListPopulation55.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome65);
        elitisticListPopulation47.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65);
        boolean b70 = defaultedMap1.containsKey((java.lang.Object) arraylist_chromosome65);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100 + "'", obj43.equals(100));
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 'a' + "'", obj44.equals('a'));
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(list_chromosome56);
        org.junit.Assert.assertNotNull(population57);
        org.junit.Assert.assertNotNull(chromosome_array58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(chromosome_array64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap4.toString();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (-1L));
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 0);
        boolean b20 = defaultedMap9.equals((java.lang.Object) map19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate21, predicate22);
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = null;
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate21, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b32 = defaultedMap31.isEmpty();
        java.util.Collection collection33 = defaultedMap31.values();
        boolean b34 = defaultedMap4.containsKey((java.lang.Object) collection33);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection33);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation2.addChromosome(chromosome36);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome38 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit((int) (short) 10);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, 1, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        elitisticListPopulation46.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b54 = defaultedMap53.isEmpty();
        java.util.Collection collection55 = defaultedMap53.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection55);
        java.lang.String str57 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome38);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "[]" + "'", str57.equals("[]"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        int i2 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.String str6 = defaultedMap5.toString();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 10.0f);
        java.util.Set set9 = defaultedMap5.keySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b13 = defaultedMap12.isEmpty();
        java.util.Collection collection14 = defaultedMap12.values();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap12.get(obj15);
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap12.get(obj17);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, obj17);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 'a' + "'", obj10.equals('a'));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 'a' + "'", obj16.equals('a'));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 'a' + "'", obj18.equals('a'));
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation5.spliterator();
        java.lang.String str11 = elitisticListPopulation5.toString();
        math.genetics.Population population12 = elitisticListPopulation5.nextGeneration();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) population12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, 1, (double) 1.0f);
        int i20 = elitisticListPopulation19.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation19.iterator();
        int i22 = elitisticListPopulation19.getPopulationLimit();
        int i23 = elitisticListPopulation19.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation19.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome25 = elitisticListPopulation19.iterator();
        java.lang.Object obj26 = defaultedMap13.get((java.lang.Object) elitisticListPopulation19);
        java.util.Set set27 = defaultedMap13.entrySet();
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap13.containsValue(obj28);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertNotNull(list_chromosome24);
        org.junit.Assert.assertNotNull(iterator_chromosome25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        java.lang.Object obj3 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = null;
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.util.Set set10 = defaultedMap8.keySet();
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, 1, (double) 1.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation16.getChromosomes();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b20 = defaultedMap19.isEmpty();
        java.util.Collection collection21 = defaultedMap19.values();
        java.util.Collection collection22 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b25 = defaultedMap19.containsValue((java.lang.Object) 'a');
        java.util.Collection collection26 = defaultedMap19.values();
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection26);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) collection26);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 'a' + "'", obj9.equals('a'));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(map28);
    }
}

