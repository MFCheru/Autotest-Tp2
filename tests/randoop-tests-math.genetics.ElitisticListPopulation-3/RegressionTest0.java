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
        java.util.List<math.genetics.Chromosome> list_chromosome0 = null;
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(list_chromosome0, (int) (short) 0, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) -1, 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        try {
            elitisticListPopulation5.setElitismRate((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
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
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 10, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap10.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) (short) 100);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (short) 10 + "'", obj15.equals((short) 10));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation5.addChromosome(chromosome10);
        try {
            elitisticListPopulation5.setElitismRate((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) predicateUtils14);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap4.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        try {
            elitisticListPopulation5.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.List<math.genetics.Chromosome> list_chromosome0 = null;
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(list_chromosome0, (int) 'a', (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate11, predicate12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (short) 10, 0.0d);
        elitisticListPopulation19.setPopulationLimit(1);
        java.lang.String str22 = elitisticListPopulation19.toString();
        java.lang.Object obj23 = defaultedMap4.remove((java.lang.Object) elitisticListPopulation19);
        try {
            math.genetics.Chromosome chromosome24 = elitisticListPopulation19.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap10.size();
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap10.remove((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate11, predicate12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (short) 10, 0.0d);
        elitisticListPopulation19.setPopulationLimit(1);
        java.lang.String str22 = elitisticListPopulation19.toString();
        java.lang.Object obj23 = defaultedMap4.remove((java.lang.Object) elitisticListPopulation19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b26 = defaultedMap25.isEmpty();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap25.putAll((java.util.Map) defaultedMap28);
        int i30 = defaultedMap28.size();
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) (byte) 10);
        java.lang.Object obj34 = defaultedMap28.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b39 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap38.putAll((java.util.Map) defaultedMap41);
        int i43 = defaultedMap41.size();
        java.lang.Object obj45 = defaultedMap41.get((java.lang.Object) (byte) 10);
        java.lang.Object obj47 = defaultedMap41.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate48, predicate49);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate35, predicate49);
        collections.Transformer transformer52 = null;
        try {
            java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 10 + "'", obj32.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 10 + "'", obj34.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) 10 + "'", obj45.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (short) 10 + "'", obj47.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate11, predicate12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (short) 10, 0.0d);
        elitisticListPopulation19.setPopulationLimit(1);
        java.lang.String str22 = elitisticListPopulation19.toString();
        java.lang.Object obj23 = defaultedMap4.remove((java.lang.Object) elitisticListPopulation19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b30 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.util.Collection collection34 = defaultedMap29.values();
        defaultedMap25.putAll((java.util.Map) defaultedMap29);
        boolean b37 = defaultedMap25.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap39.putAll((java.util.Map) defaultedMap42);
        java.util.Collection collection44 = defaultedMap39.values();
        java.util.Set set45 = defaultedMap39.entrySet();
        boolean b46 = defaultedMap25.containsKey((java.lang.Object) defaultedMap39);
        java.util.Collection collection47 = defaultedMap25.values();
        java.lang.Object obj49 = defaultedMap25.remove((java.lang.Object) '#');
        java.util.Collection collection50 = defaultedMap25.values();
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection50);
        double d52 = elitisticListPopulation19.getElitismRate();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(d52 == 0.0d);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        double d11 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(d11 == 0.0d);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        java.util.Set set6 = defaultedMap1.keySet();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        java.util.Collection collection17 = defaultedMap12.values();
        java.util.Set set18 = defaultedMap12.entrySet();
        java.util.Set set19 = defaultedMap12.entrySet();
        java.lang.Object obj20 = defaultedMap4.get((java.lang.Object) set19);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) (short) 10, 0.0d);
        elitisticListPopulation26.setPopulationLimit(1);
        java.lang.String str29 = elitisticListPopulation26.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation26.getChromosomes();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 0.0d);
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        java.lang.Object obj37 = defaultedMap4.put((java.lang.Object) elitisticListPopulation26, (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b44 = defaultedMap43.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap43.putAll((java.util.Map) defaultedMap46);
        java.util.Collection collection48 = defaultedMap43.values();
        defaultedMap39.putAll((java.util.Map) defaultedMap43);
        boolean b51 = defaultedMap39.equals((java.lang.Object) 10.0f);
        java.lang.Object obj52 = defaultedMap32.get((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 10 + "'", obj20.equals((short) 10));
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]" + "'", str29.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (short) 10 + "'", obj52.equals((short) 10));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation5.addChromosome(chromosome10);
        math.genetics.Chromosome chromosome12 = null;
        try {
            elitisticListPopulation5.addChromosome(chromosome12);
            org.junit.Assert.fail("Expected exception of type math.exception.NumberIsTooLargeException");
        } catch (math.exception.NumberIsTooLargeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b13 = defaultedMap1.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection20 = defaultedMap15.values();
        java.util.Set set21 = defaultedMap15.entrySet();
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) defaultedMap15);
        boolean b24 = defaultedMap15.containsValue((java.lang.Object) true);
        defaultedMap15.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation5.spliterator();
        try {
            elitisticListPopulation5.setElitismRate((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation5.spliterator();
        try {
            math.genetics.Chromosome chromosome11 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b13 = defaultedMap1.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection20 = defaultedMap15.values();
        java.util.Set set21 = defaultedMap15.entrySet();
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap24.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap24.putAll((java.util.Map) defaultedMap27);
        int i29 = defaultedMap27.size();
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) (byte) 10);
        java.lang.Object obj33 = defaultedMap27.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate34, predicate35);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) map36);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 10 + "'", obj31.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) 10 + "'", obj33.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(list_chromosome7, (-1), (double) 0L);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) predicateUtils14);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap10.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.util.Collection collection14 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        try {
            math.genetics.Chromosome chromosome8 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) (short) 10, 0.0d);
        elitisticListPopulation17.setPopulationLimit(1);
        java.lang.String str20 = elitisticListPopulation17.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation17.getChromosomes();
        double d22 = elitisticListPopulation17.getElitismRate();
        java.lang.Object obj24 = defaultedMap5.put((java.lang.Object) d22, (java.lang.Object) false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(d22 == 0.0d);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection18 = defaultedMap13.values();
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) defaultedMap13);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b23 = defaultedMap1.containsKey((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b26 = defaultedMap25.isEmpty();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap25.putAll((java.util.Map) defaultedMap28);
        int i30 = defaultedMap28.size();
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) (byte) 10);
        java.lang.Object obj34 = defaultedMap28.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate35, predicate36);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) (short) 10, 0.0d);
        elitisticListPopulation43.setPopulationLimit(1);
        java.lang.String str46 = elitisticListPopulation43.toString();
        java.lang.Object obj47 = defaultedMap28.remove((java.lang.Object) elitisticListPopulation43);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b50 = defaultedMap49.isEmpty();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap49.putAll((java.util.Map) defaultedMap52);
        int i54 = defaultedMap52.size();
        java.lang.Object obj56 = defaultedMap52.get((java.lang.Object) (byte) 10);
        java.lang.Object obj58 = defaultedMap52.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b63 = defaultedMap62.isEmpty();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap62.putAll((java.util.Map) defaultedMap65);
        int i67 = defaultedMap65.size();
        java.lang.Object obj69 = defaultedMap65.get((java.lang.Object) (byte) 10);
        java.lang.Object obj71 = defaultedMap65.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate72, predicate73);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate59, predicate73);
        java.lang.Object obj76 = defaultedMap1.remove((java.lang.Object) predicate59);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 10 + "'", obj32.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 10 + "'", obj34.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]" + "'", str46.equals("[]"));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (short) 10 + "'", obj56.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (short) 10 + "'", obj58.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + (short) 10 + "'", obj69.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (short) 10 + "'", obj71.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        int i15 = defaultedMap13.size();
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap21.isEmpty();
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) predicateUtils23);
        defaultedMap13.putAll((java.util.Map) defaultedMap21);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 10);
        boolean b28 = defaultedMap4.equals((java.lang.Object) map27);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 10 + "'", obj17.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap10.size();
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        java.util.Set set14 = defaultedMap4.entrySet();
        java.util.Set set15 = defaultedMap4.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b13 = defaultedMap1.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection20 = defaultedMap15.values();
        java.util.Set set21 = defaultedMap15.entrySet();
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) defaultedMap15);
        boolean b24 = defaultedMap15.equals((java.lang.Object) '4');
        java.util.Set set25 = defaultedMap15.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate11, predicate12);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0);
        java.lang.Object obj17 = defaultedMap4.remove((java.lang.Object) elitisticListPopulation16);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome18 = elitisticListPopulation16.spliterator();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(spliterator_chromosome18);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        double d10 = elitisticListPopulation5.getElitismRate();
        java.lang.String str11 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        try {
            math.genetics.Chromosome chromosome14 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(population13);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection18 = defaultedMap13.values();
        defaultedMap9.putAll((java.util.Map) defaultedMap13);
        boolean b21 = defaultedMap9.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b24 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap23.putAll((java.util.Map) defaultedMap26);
        java.util.Collection collection28 = defaultedMap23.values();
        java.util.Set set29 = defaultedMap23.entrySet();
        boolean b30 = defaultedMap9.containsKey((java.lang.Object) defaultedMap23);
        java.util.Collection collection31 = defaultedMap9.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection31);
        math.genetics.Chromosome chromosome33 = null;
        elitisticListPopulation5.addChromosome(chromosome33);
        try {
            math.genetics.Chromosome chromosome35 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection18 = defaultedMap13.values();
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) defaultedMap13);
        java.lang.String str20 = defaultedMap13.toString();
        boolean b21 = defaultedMap13.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.keySet();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b15 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        int i25 = defaultedMap23.size();
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap28.putAll((java.util.Map) defaultedMap31);
        int i33 = defaultedMap31.size();
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) (byte) 10);
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate38, predicate39);
        java.lang.Object obj41 = defaultedMap23.get((java.lang.Object) map40);
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b45 = defaultedMap44.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap44.putAll((java.util.Map) defaultedMap47);
        java.util.Collection collection49 = defaultedMap44.values();
        java.util.Set set50 = defaultedMap44.entrySet();
        java.util.Set set51 = defaultedMap44.entrySet();
        boolean b52 = defaultedMap11.containsValue((java.lang.Object) defaultedMap44);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 10 + "'", obj35.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 10 + "'", obj37.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) 10 + "'", obj41.equals((short) 10));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        java.util.Collection collection17 = defaultedMap12.values();
        java.util.Set set18 = defaultedMap12.entrySet();
        java.util.Set set19 = defaultedMap12.entrySet();
        java.lang.Object obj20 = defaultedMap4.get((java.lang.Object) set19);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) (short) 10, 0.0d);
        elitisticListPopulation26.setPopulationLimit(1);
        java.lang.String str29 = elitisticListPopulation26.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation26.getChromosomes();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 0.0d);
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        java.lang.Object obj37 = defaultedMap4.put((java.lang.Object) elitisticListPopulation26, (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap39.putAll((java.util.Map) defaultedMap42);
        int i44 = defaultedMap42.size();
        java.lang.Object obj46 = defaultedMap42.get((java.lang.Object) (byte) 10);
        java.lang.Object obj48 = defaultedMap42.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate49, predicate50);
        boolean b52 = defaultedMap4.containsKey((java.lang.Object) map51);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 10 + "'", obj20.equals((short) 10));
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]" + "'", str29.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (short) 10 + "'", obj46.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) 10 + "'", obj48.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationSize();
        try {
            elitisticListPopulation5.setElitismRate((double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome9);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(list_chromosome9, (int) (byte) 0, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation(list_chromosome6, (int) (short) 100, (double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        try {
            math.genetics.Chromosome chromosome11 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.lang.String str8 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation(list_chromosome6, (int) (byte) 0, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap10.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate11, predicate12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (short) 10, 0.0d);
        elitisticListPopulation19.setPopulationLimit(1);
        java.lang.String str22 = elitisticListPopulation19.toString();
        java.lang.Object obj23 = defaultedMap4.remove((java.lang.Object) elitisticListPopulation19);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) (short) 10, 0.0d);
        boolean b30 = defaultedMap4.containsValue((java.lang.Object) elitisticListPopulation29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b33 = defaultedMap32.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b36 = defaultedMap35.isEmpty();
        java.lang.Object obj37 = defaultedMap32.remove((java.lang.Object) b36);
        boolean b38 = defaultedMap4.containsValue((java.lang.Object) b36);
        int i39 = defaultedMap4.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        try {
            math.genetics.Chromosome chromosome3 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap10.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        boolean b14 = defaultedMap1.isEmpty();
        boolean b15 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap17.putAll((java.util.Map) defaultedMap20);
        int i22 = defaultedMap20.size();
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) (byte) 10);
        java.lang.Object obj26 = defaultedMap20.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b29 = defaultedMap28.isEmpty();
        collections.PredicateUtils predicateUtils30 = new collections.PredicateUtils();
        boolean b31 = defaultedMap28.containsKey((java.lang.Object) predicateUtils30);
        defaultedMap20.putAll((java.util.Map) defaultedMap28);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b41 = defaultedMap40.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap40.putAll((java.util.Map) defaultedMap43);
        java.util.Collection collection45 = defaultedMap40.values();
        defaultedMap36.putAll((java.util.Map) defaultedMap40);
        boolean b48 = defaultedMap36.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b51 = defaultedMap50.isEmpty();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap50.putAll((java.util.Map) defaultedMap53);
        java.util.Collection collection55 = defaultedMap50.values();
        java.util.Set set56 = defaultedMap50.entrySet();
        boolean b57 = defaultedMap36.containsKey((java.lang.Object) defaultedMap50);
        java.util.Collection collection58 = defaultedMap36.values();
        java.util.Map map59 = collections.map.DefaultedMap.decorate(map34, (java.lang.Object) defaultedMap36);
        java.lang.Object obj60 = defaultedMap1.remove((java.lang.Object) map34);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 10 + "'", obj24.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 10 + "'", obj26.equals((short) 10));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate11, predicate12);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0);
        java.lang.Object obj17 = defaultedMap4.remove((java.lang.Object) elitisticListPopulation16);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation16.iterator();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        java.util.Collection collection17 = defaultedMap12.values();
        java.util.Set set18 = defaultedMap12.entrySet();
        java.util.Set set19 = defaultedMap12.entrySet();
        java.lang.Object obj20 = defaultedMap4.get((java.lang.Object) set19);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) (short) 10, 0.0d);
        elitisticListPopulation26.setPopulationLimit(1);
        java.lang.String str29 = elitisticListPopulation26.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation26.getChromosomes();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 0.0d);
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        java.lang.Object obj37 = defaultedMap4.put((java.lang.Object) elitisticListPopulation26, (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b44 = defaultedMap43.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap43.putAll((java.util.Map) defaultedMap46);
        java.util.Collection collection48 = defaultedMap43.values();
        defaultedMap39.putAll((java.util.Map) defaultedMap43);
        boolean b51 = defaultedMap39.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b54 = defaultedMap53.isEmpty();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap53.putAll((java.util.Map) defaultedMap56);
        java.util.Collection collection58 = defaultedMap53.values();
        java.util.Set set59 = defaultedMap53.entrySet();
        boolean b60 = defaultedMap39.containsKey((java.lang.Object) defaultedMap53);
        java.util.Collection collection61 = defaultedMap39.values();
        java.lang.Object obj63 = defaultedMap39.remove((java.lang.Object) '#');
        java.util.Collection collection64 = defaultedMap39.values();
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection64);
        java.lang.String str66 = elitisticListPopulation26.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 10 + "'", obj20.equals((short) 10));
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]" + "'", str29.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "[]" + "'", str66.equals("[]"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) predicateUtils14);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap24.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap24.putAll((java.util.Map) defaultedMap27);
        java.util.Collection collection29 = defaultedMap24.values();
        defaultedMap20.putAll((java.util.Map) defaultedMap24);
        boolean b32 = defaultedMap20.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b35 = defaultedMap34.isEmpty();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap34.putAll((java.util.Map) defaultedMap37);
        java.util.Collection collection39 = defaultedMap34.values();
        java.util.Set set40 = defaultedMap34.entrySet();
        boolean b41 = defaultedMap20.containsKey((java.lang.Object) defaultedMap34);
        java.util.Collection collection42 = defaultedMap20.values();
        java.util.Map map43 = collections.map.DefaultedMap.decorate(map18, (java.lang.Object) defaultedMap20);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap46.isEmpty();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap46.putAll((java.util.Map) defaultedMap49);
        int i51 = defaultedMap49.size();
        java.lang.Object obj53 = defaultedMap49.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b56 = defaultedMap55.isEmpty();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap55.putAll((java.util.Map) defaultedMap58);
        java.util.Collection collection60 = defaultedMap55.values();
        java.util.Set set61 = defaultedMap55.entrySet();
        boolean b62 = defaultedMap49.containsValue((java.lang.Object) set61);
        java.lang.Object obj63 = defaultedMap20.put((java.lang.Object) predicate44, (java.lang.Object) b62);
        boolean b65 = defaultedMap20.containsValue((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 10 + "'", obj53.equals((short) 10));
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        double d10 = elitisticListPopulation5.getElitismRate();
        try {
            elitisticListPopulation5.setPopulationLimit((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(d10 == 0.0d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b13 = defaultedMap1.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection20 = defaultedMap15.values();
        java.util.Set set21 = defaultedMap15.entrySet();
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) defaultedMap15);
        java.util.Set set23 = defaultedMap1.entrySet();
        java.lang.String str24 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) predicateUtils14);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap19.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap19.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection24 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap30.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap30.putAll((java.util.Map) defaultedMap33);
        java.util.Collection collection35 = defaultedMap30.values();
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        boolean b38 = defaultedMap26.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b41 = defaultedMap40.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap40.putAll((java.util.Map) defaultedMap43);
        java.util.Collection collection45 = defaultedMap40.values();
        java.util.Set set46 = defaultedMap40.entrySet();
        boolean b47 = defaultedMap26.containsKey((java.lang.Object) defaultedMap40);
        java.util.Collection collection48 = defaultedMap26.values();
        boolean b49 = defaultedMap19.equals((java.lang.Object) collection48);
        java.lang.Object obj50 = defaultedMap4.put((java.lang.Object) '4', (java.lang.Object) b49);
        int i51 = defaultedMap4.size();
        java.util.Set set52 = defaultedMap4.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(i51 == 1);
        org.junit.Assert.assertNotNull(set52);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap5.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate11, predicate12);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0);
        java.lang.Object obj17 = defaultedMap4.remove((java.lang.Object) elitisticListPopulation16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b24 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap23.putAll((java.util.Map) defaultedMap26);
        java.util.Collection collection28 = defaultedMap23.values();
        defaultedMap19.putAll((java.util.Map) defaultedMap23);
        boolean b31 = defaultedMap19.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b34 = defaultedMap33.isEmpty();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap33.putAll((java.util.Map) defaultedMap36);
        java.util.Collection collection38 = defaultedMap33.values();
        java.util.Set set39 = defaultedMap33.entrySet();
        boolean b40 = defaultedMap19.containsKey((java.lang.Object) defaultedMap33);
        java.util.Collection collection41 = defaultedMap19.values();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate42, predicate43);
        boolean b45 = defaultedMap4.containsKey((java.lang.Object) map44);
        boolean b46 = defaultedMap4.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) i3);
        org.junit.Assert.assertTrue(i3 == 52);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationSize();
        java.lang.String str10 = elitisticListPopulation5.toString();
        math.genetics.Population population11 = elitisticListPopulation5.nextGeneration();
        try {
            math.genetics.Chromosome chromosome12 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertNotNull(population11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) -1, (double) 1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        try {
            elitisticListPopulation5.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.keySet();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b15 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        int i25 = defaultedMap23.size();
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap28.putAll((java.util.Map) defaultedMap31);
        int i33 = defaultedMap31.size();
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) (byte) 10);
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate38, predicate39);
        java.lang.Object obj41 = defaultedMap23.get((java.lang.Object) map40);
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b45 = defaultedMap44.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap44.putAll((java.util.Map) defaultedMap47);
        int i49 = defaultedMap47.size();
        java.lang.Object obj51 = defaultedMap47.get((java.lang.Object) (byte) 10);
        java.lang.Object obj53 = defaultedMap47.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b56 = defaultedMap55.isEmpty();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap55.putAll((java.util.Map) defaultedMap58);
        java.util.Collection collection60 = defaultedMap55.values();
        java.util.Set set61 = defaultedMap55.entrySet();
        java.util.Set set62 = defaultedMap55.entrySet();
        java.lang.Object obj63 = defaultedMap47.get((java.lang.Object) set62);
        boolean b64 = defaultedMap1.equals((java.lang.Object) defaultedMap47);
        java.util.Collection collection65 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 10 + "'", obj35.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 10 + "'", obj37.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) 10 + "'", obj41.equals((short) 10));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (short) 10 + "'", obj51.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 10 + "'", obj53.equals((short) 10));
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (short) 10 + "'", obj63.equals((short) 10));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(collection65);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (short) 10, 0.0d);
        elitisticListPopulation9.setPopulationLimit(1);
        java.lang.String str12 = elitisticListPopulation9.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation9.getChromosomes();
        double d14 = elitisticListPopulation9.getElitismRate();
        java.lang.String str15 = elitisticListPopulation9.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation9.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation9.iterator();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) iterator_chromosome17);
        java.util.Set set19 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]" + "'", str15.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        double d10 = elitisticListPopulation5.getElitismRate();
        java.lang.String str11 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        double d13 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue(d13 == 0.0d);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        double d10 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        org.junit.Assert.assertNotNull(list_chromosome3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap10.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        boolean b14 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b17 = defaultedMap16.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        int i21 = defaultedMap19.size();
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = defaultedMap19.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        java.util.Collection collection32 = defaultedMap27.values();
        java.util.Set set33 = defaultedMap27.entrySet();
        java.util.Set set34 = defaultedMap27.entrySet();
        java.lang.Object obj35 = defaultedMap19.get((java.lang.Object) set34);
        java.util.Set set36 = defaultedMap19.entrySet();
        boolean b37 = defaultedMap1.containsKey((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 10 + "'", obj23.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 10 + "'", obj25.equals((short) 10));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 10 + "'", obj35.equals((short) 10));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(list_chromosome7, (int) (short) 0, (double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        defaultedMap4.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        java.util.Collection collection17 = defaultedMap12.values();
        java.util.Set set18 = defaultedMap12.entrySet();
        java.util.Set set19 = defaultedMap12.entrySet();
        java.lang.Object obj20 = defaultedMap4.get((java.lang.Object) set19);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) (short) 10, 0.0d);
        elitisticListPopulation26.setPopulationLimit(1);
        java.lang.String str29 = elitisticListPopulation26.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation26.getChromosomes();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 0.0d);
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        java.lang.Object obj37 = defaultedMap4.put((java.lang.Object) elitisticListPopulation26, (java.lang.Object) defaultedMap32);
        collections.Factory factory38 = null;
        try {
            java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 10 + "'", obj20.equals((short) 10));
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]" + "'", str29.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.keySet();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b15 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        int i25 = defaultedMap23.size();
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap28.putAll((java.util.Map) defaultedMap31);
        int i33 = defaultedMap31.size();
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) (byte) 10);
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate38, predicate39);
        java.lang.Object obj41 = defaultedMap23.get((java.lang.Object) map40);
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) 0.0d);
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.remove(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b51 = defaultedMap50.isEmpty();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap50.putAll((java.util.Map) defaultedMap53);
        int i55 = defaultedMap53.size();
        defaultedMap44.putAll((java.util.Map) defaultedMap53);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj60 = defaultedMap44.put((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap59);
        defaultedMap11.putAll((java.util.Map) defaultedMap59);
        collections.Factory factory62 = null;
        try {
            java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, factory62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 10 + "'", obj35.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 10 + "'", obj37.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) 10 + "'", obj41.equals((short) 10));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationSize();
        double d10 = elitisticListPopulation5.getElitismRate();
        int i11 = elitisticListPopulation5.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap10.size();
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap19.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap19.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection24 = defaultedMap19.values();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        boolean b27 = defaultedMap15.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b30 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.util.Collection collection34 = defaultedMap29.values();
        java.util.Set set35 = defaultedMap29.entrySet();
        boolean b36 = defaultedMap15.containsKey((java.lang.Object) defaultedMap29);
        boolean b38 = defaultedMap29.equals((java.lang.Object) '4');
        boolean b39 = defaultedMap4.containsValue((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap41.isEmpty();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap41.putAll((java.util.Map) defaultedMap44);
        java.util.Collection collection46 = defaultedMap41.values();
        java.util.Set set47 = defaultedMap41.entrySet();
        java.util.Set set48 = defaultedMap41.keySet();
        java.util.Set set49 = defaultedMap41.entrySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b52 = defaultedMap51.isEmpty();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b55 = defaultedMap54.isEmpty();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap54.putAll((java.util.Map) defaultedMap57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b61 = defaultedMap60.isEmpty();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap60.putAll((java.util.Map) defaultedMap63);
        int i65 = defaultedMap63.size();
        defaultedMap57.putAll((java.util.Map) defaultedMap63);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b69 = defaultedMap68.isEmpty();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap68.putAll((java.util.Map) defaultedMap71);
        int i73 = defaultedMap71.size();
        java.lang.Object obj75 = defaultedMap71.get((java.lang.Object) (byte) 10);
        java.lang.Object obj77 = defaultedMap71.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate78, predicate79);
        java.lang.Object obj81 = defaultedMap63.get((java.lang.Object) map80);
        java.lang.Object obj82 = defaultedMap41.put((java.lang.Object) defaultedMap51, (java.lang.Object) defaultedMap63);
        java.lang.Object obj83 = defaultedMap4.remove((java.lang.Object) defaultedMap41);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + (short) 10 + "'", obj75.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + (short) 10 + "'", obj77.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + (short) 10 + "'", obj81.equals((short) 10));
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj83);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        try {
            elitisticListPopulation5.setElitismRate((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.util.Collection collection5 = defaultedMap4.values();
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 10, 0.0d);
        elitisticListPopulation11.setPopulationLimit(1);
        java.lang.String str14 = elitisticListPopulation11.toString();
        int i15 = elitisticListPopulation11.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation11.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(list_chromosome16, (int) (short) 10, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24, (int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation22.setChromosomes(list_chromosome29);
        elitisticListPopulation19.setChromosomes(list_chromosome29);
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) collection5, (java.lang.Object) list_chromosome29);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(list_chromosome29);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        int i15 = defaultedMap13.size();
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate20, predicate21);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap13);
        int i24 = defaultedMap1.size();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection28 = defaultedMap27.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 10 + "'", obj17.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        java.lang.String str10 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(list_chromosome7, (-1), (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) i6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        int i15 = defaultedMap13.size();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap18.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        int i23 = defaultedMap21.size();
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = defaultedMap21.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate28, predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate28);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate28);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 52);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short) 10 + "'", obj7.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 10 + "'", obj25.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 10 + "'", obj27.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationSize();
        java.lang.String str10 = elitisticListPopulation5.toString();
        double d11 = elitisticListPopulation5.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation5.spliterator();
        try {
            math.genetics.Chromosome chromosome13 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection18 = defaultedMap13.values();
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) defaultedMap13);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b23 = defaultedMap1.containsKey((java.lang.Object) 0);
        collections.Factory factory24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b13 = defaultedMap1.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection20 = defaultedMap15.values();
        java.util.Set set21 = defaultedMap15.entrySet();
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) defaultedMap15);
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 10 + "'", obj24.equals((short) 10));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        double d10 = elitisticListPopulation5.getElitismRate();
        java.lang.String str11 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation5.iterator();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.util.Collection collection16 = defaultedMap15.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection16);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.entrySet();
        boolean b9 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap11.putAll((java.util.Map) defaultedMap14);
        java.util.Collection collection16 = defaultedMap11.values();
        java.util.Set set17 = defaultedMap11.entrySet();
        java.util.Set set18 = defaultedMap11.keySet();
        java.util.Set set19 = defaultedMap11.entrySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap24.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap24.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap30.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap30.putAll((java.util.Map) defaultedMap33);
        int i35 = defaultedMap33.size();
        defaultedMap27.putAll((java.util.Map) defaultedMap33);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b39 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap38.putAll((java.util.Map) defaultedMap41);
        int i43 = defaultedMap41.size();
        java.lang.Object obj45 = defaultedMap41.get((java.lang.Object) (byte) 10);
        java.lang.Object obj47 = defaultedMap41.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate48, predicate49);
        java.lang.Object obj51 = defaultedMap33.get((java.lang.Object) map50);
        java.lang.Object obj52 = defaultedMap11.put((java.lang.Object) defaultedMap21, (java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b55 = defaultedMap54.isEmpty();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap54.putAll((java.util.Map) defaultedMap57);
        int i59 = defaultedMap57.size();
        java.lang.Object obj61 = defaultedMap57.get((java.lang.Object) (byte) 10);
        java.lang.Object obj63 = defaultedMap57.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b66 = defaultedMap65.isEmpty();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap65.putAll((java.util.Map) defaultedMap68);
        java.util.Collection collection70 = defaultedMap65.values();
        java.util.Set set71 = defaultedMap65.entrySet();
        java.util.Set set72 = defaultedMap65.entrySet();
        java.lang.Object obj73 = defaultedMap57.get((java.lang.Object) set72);
        boolean b74 = defaultedMap11.equals((java.lang.Object) defaultedMap57);
        java.lang.Object obj75 = defaultedMap1.get((java.lang.Object) b74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj79 = defaultedMap77.remove((java.lang.Object) (short) 10);
        java.lang.String str80 = defaultedMap77.toString();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap77);
        java.lang.Object obj82 = defaultedMap1.get((java.lang.Object) defaultedMap77);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) 10 + "'", obj45.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (short) 10 + "'", obj47.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (short) 10 + "'", obj51.equals((short) 10));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (short) 10 + "'", obj61.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (short) 10 + "'", obj63.equals((short) 10));
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + (short) 10 + "'", obj73.equals((short) 10));
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + (short) 10 + "'", obj75.equals((short) 10));
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "{}" + "'", str80.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (short) 10 + "'", obj82.equals((short) 10));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation5.spliterator();
        try {
            elitisticListPopulation5.setElitismRate((double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate11, predicate12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (short) 10, 0.0d);
        elitisticListPopulation19.setPopulationLimit(1);
        java.lang.String str22 = elitisticListPopulation19.toString();
        java.lang.Object obj23 = defaultedMap4.remove((java.lang.Object) elitisticListPopulation19);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) (short) 10, 0.0d);
        boolean b30 = defaultedMap4.containsValue((java.lang.Object) elitisticListPopulation29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b33 = defaultedMap32.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap32.putAll((java.util.Map) defaultedMap35);
        int i37 = defaultedMap35.size();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b41 = defaultedMap40.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap40.putAll((java.util.Map) defaultedMap43);
        int i45 = defaultedMap43.size();
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) (byte) 10);
        java.lang.Object obj49 = defaultedMap43.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate50, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate38, predicate50);
        java.lang.Object obj54 = defaultedMap4.remove((java.lang.Object) map53);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (short) 10 + "'", obj47.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (short) 10 + "'", obj49.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        java.util.Collection collection17 = defaultedMap12.values();
        java.util.Set set18 = defaultedMap12.entrySet();
        java.util.Set set19 = defaultedMap12.entrySet();
        java.lang.Object obj20 = defaultedMap4.get((java.lang.Object) set19);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) (short) 10, 0.0d);
        elitisticListPopulation26.setPopulationLimit(1);
        java.lang.String str29 = elitisticListPopulation26.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation26.getChromosomes();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 0.0d);
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        java.lang.Object obj37 = defaultedMap4.put((java.lang.Object) elitisticListPopulation26, (java.lang.Object) defaultedMap32);
        java.lang.String str38 = elitisticListPopulation26.toString();
        int i39 = elitisticListPopulation26.getPopulationLimit();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 10 + "'", obj20.equals((short) 10));
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]" + "'", str29.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
        org.junit.Assert.assertTrue(i39 == 1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        elitisticListPopulation5.setPopulationLimit((int) (short) 10);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        double d10 = elitisticListPopulation5.getElitismRate();
        int i11 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        double d10 = elitisticListPopulation5.getElitismRate();
        java.lang.String str11 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation5.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap10.size();
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        int i20 = defaultedMap18.size();
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) (byte) 10);
        java.lang.Object obj24 = defaultedMap18.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate25, predicate26);
        java.lang.Object obj28 = defaultedMap10.get((java.lang.Object) map27);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) (short) 10, 0.0d);
        elitisticListPopulation34.setPopulationLimit(1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b43 = defaultedMap42.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap42.putAll((java.util.Map) defaultedMap45);
        java.util.Collection collection47 = defaultedMap42.values();
        defaultedMap38.putAll((java.util.Map) defaultedMap42);
        boolean b50 = defaultedMap38.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b53 = defaultedMap52.isEmpty();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap52.putAll((java.util.Map) defaultedMap55);
        java.util.Collection collection57 = defaultedMap52.values();
        java.util.Set set58 = defaultedMap52.entrySet();
        boolean b59 = defaultedMap38.containsKey((java.lang.Object) defaultedMap52);
        java.util.Collection collection60 = defaultedMap38.values();
        elitisticListPopulation34.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection60);
        math.genetics.Chromosome chromosome62 = null;
        elitisticListPopulation34.addChromosome(chromosome62);
        math.genetics.Population population64 = elitisticListPopulation34.nextGeneration();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) population64);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 10 + "'", obj22.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 10 + "'", obj24.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 10 + "'", obj28.equals((short) 10));
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(population64);
        org.junit.Assert.assertNotNull(map65);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationSize();
        double d10 = elitisticListPopulation5.getElitismRate();
        int i11 = elitisticListPopulation5.getPopulationSize();
        double d12 = elitisticListPopulation5.getElitismRate();
        double d13 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertTrue(d13 == 0.0d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) list_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate11, predicate12);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        java.util.Collection collection17 = defaultedMap12.values();
        java.util.Set set18 = defaultedMap12.entrySet();
        java.util.Set set19 = defaultedMap12.entrySet();
        java.lang.Object obj20 = defaultedMap4.get((java.lang.Object) set19);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) (short) 10, 0.0d);
        elitisticListPopulation26.setPopulationLimit(1);
        java.lang.String str29 = elitisticListPopulation26.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation26.getChromosomes();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 0.0d);
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        java.lang.Object obj37 = defaultedMap4.put((java.lang.Object) elitisticListPopulation26, (java.lang.Object) defaultedMap32);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) (short) 10, 0.0d);
        elitisticListPopulation43.setPopulationLimit(1);
        java.lang.String str46 = elitisticListPopulation43.toString();
        int i47 = elitisticListPopulation43.getPopulationSize();
        java.lang.String str48 = elitisticListPopulation43.toString();
        double d49 = elitisticListPopulation43.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome50 = elitisticListPopulation43.spliterator();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b53 = defaultedMap52.isEmpty();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap52.putAll((java.util.Map) defaultedMap55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap58.isEmpty();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap58.putAll((java.util.Map) defaultedMap61);
        int i63 = defaultedMap61.size();
        defaultedMap55.putAll((java.util.Map) defaultedMap61);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b67 = defaultedMap66.isEmpty();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap66.putAll((java.util.Map) defaultedMap69);
        int i71 = defaultedMap69.size();
        java.lang.Object obj73 = defaultedMap69.get((java.lang.Object) (byte) 10);
        java.lang.Object obj75 = defaultedMap69.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate76, predicate77);
        java.lang.Object obj79 = defaultedMap61.get((java.lang.Object) map78);
        java.lang.Object obj80 = defaultedMap4.put((java.lang.Object) elitisticListPopulation43, (java.lang.Object) defaultedMap61);
        java.lang.String str81 = elitisticListPopulation43.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 10 + "'", obj20.equals((short) 10));
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]" + "'", str29.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]" + "'", str46.equals("[]"));
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[]" + "'", str48.equals("[]"));
        org.junit.Assert.assertTrue(d49 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + (short) 10 + "'", obj73.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + (short) 10 + "'", obj75.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + (short) 10 + "'", obj79.equals((short) 10));
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "[]" + "'", str81.equals("[]"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        java.util.Collection collection17 = defaultedMap12.values();
        java.util.Set set18 = defaultedMap12.entrySet();
        java.util.Set set19 = defaultedMap12.entrySet();
        java.lang.Object obj20 = defaultedMap4.get((java.lang.Object) set19);
        java.util.Set set21 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        java.util.Collection collection32 = defaultedMap27.values();
        defaultedMap23.putAll((java.util.Map) defaultedMap27);
        boolean b35 = defaultedMap23.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b38 = defaultedMap37.isEmpty();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap37.putAll((java.util.Map) defaultedMap40);
        java.util.Collection collection42 = defaultedMap37.values();
        java.util.Set set43 = defaultedMap37.entrySet();
        boolean b44 = defaultedMap23.containsKey((java.lang.Object) defaultedMap37);
        java.util.Collection collection45 = defaultedMap23.values();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate46, predicate47);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap23);
        collections.Factory factory50 = null;
        try {
            java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, factory50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 10 + "'", obj20.equals((short) 10));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) (short) 0);
        try {
            elitisticListPopulation2.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b10 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap9.putAll((java.util.Map) defaultedMap12);
        java.util.Collection collection14 = defaultedMap9.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        java.util.Collection collection25 = defaultedMap20.values();
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        boolean b28 = defaultedMap16.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap30.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap30.putAll((java.util.Map) defaultedMap33);
        java.util.Collection collection35 = defaultedMap30.values();
        java.util.Set set36 = defaultedMap30.entrySet();
        boolean b37 = defaultedMap16.containsKey((java.lang.Object) defaultedMap30);
        java.util.Collection collection38 = defaultedMap16.values();
        boolean b39 = defaultedMap9.equals((java.lang.Object) collection38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap41.isEmpty();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap41.putAll((java.util.Map) defaultedMap44);
        int i46 = defaultedMap44.size();
        java.lang.Object obj48 = defaultedMap44.get((java.lang.Object) (byte) 10);
        java.lang.Object obj50 = defaultedMap44.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate51, predicate52);
        math.genetics.Chromosome[] chromosome_array54 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome55 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55, chromosome_array54);
        math.genetics.ElitisticListPopulation elitisticListPopulation59 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome55, (int) (short) 10, 0.0d);
        elitisticListPopulation59.setPopulationLimit(1);
        java.lang.String str62 = elitisticListPopulation59.toString();
        java.lang.Object obj63 = defaultedMap44.remove((java.lang.Object) elitisticListPopulation59);
        boolean b64 = defaultedMap9.containsValue((java.lang.Object) defaultedMap44);
        boolean b65 = defaultedMap44.isEmpty();
        boolean b66 = defaultedMap44.isEmpty();
        boolean b67 = defaultedMap1.equals((java.lang.Object) defaultedMap44);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) 10 + "'", obj48.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (short) 10 + "'", obj50.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(chromosome_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "[]" + "'", str62.equals("[]"));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b67 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) predicateUtils14);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) map18);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection18 = defaultedMap13.values();
        defaultedMap9.putAll((java.util.Map) defaultedMap13);
        boolean b21 = defaultedMap9.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b24 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap23.putAll((java.util.Map) defaultedMap26);
        java.util.Collection collection28 = defaultedMap23.values();
        java.util.Set set29 = defaultedMap23.entrySet();
        boolean b30 = defaultedMap9.containsKey((java.lang.Object) defaultedMap23);
        java.util.Collection collection31 = defaultedMap9.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection31);
        math.genetics.Chromosome chromosome33 = null;
        elitisticListPopulation5.addChromosome(chromosome33);
        try {
            elitisticListPopulation5.setPopulationLimit((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b13 = defaultedMap1.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection20 = defaultedMap15.values();
        java.util.Set set21 = defaultedMap15.entrySet();
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) defaultedMap15);
        java.util.Collection collection23 = defaultedMap1.values();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate24, predicate25);
        java.lang.String str27 = defaultedMap1.toString();
        java.lang.Object obj28 = null;
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap31.isEmpty();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap31.putAll((java.util.Map) defaultedMap34);
        int i36 = defaultedMap34.size();
        java.lang.Object obj38 = defaultedMap34.get((java.lang.Object) (byte) 10);
        java.lang.Object obj40 = defaultedMap34.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate41, predicate42);
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45, (int) (short) 10, 0.0d);
        elitisticListPopulation49.setPopulationLimit(1);
        java.lang.String str52 = elitisticListPopulation49.toString();
        java.lang.Object obj53 = defaultedMap34.remove((java.lang.Object) elitisticListPopulation49);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b56 = defaultedMap55.isEmpty();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap55.putAll((java.util.Map) defaultedMap58);
        int i60 = defaultedMap58.size();
        java.lang.Object obj62 = defaultedMap58.get((java.lang.Object) (byte) 10);
        java.lang.Object obj64 = defaultedMap58.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) predicate65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b69 = defaultedMap68.isEmpty();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap68.putAll((java.util.Map) defaultedMap71);
        int i73 = defaultedMap71.size();
        java.lang.Object obj75 = defaultedMap71.get((java.lang.Object) (byte) 10);
        java.lang.Object obj77 = defaultedMap71.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate78, predicate79);
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate65, predicate79);
        defaultedMap1.putAll((java.util.Map) defaultedMap34);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 10 + "'", obj38.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short) 10 + "'", obj40.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "[]" + "'", str52.equals("[]"));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + (short) 10 + "'", obj62.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (short) 10 + "'", obj64.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + (short) 10 + "'", obj75.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + (short) 10 + "'", obj77.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate11, predicate12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (short) 10, 0.0d);
        elitisticListPopulation19.setPopulationLimit(1);
        java.lang.String str22 = elitisticListPopulation19.toString();
        java.lang.Object obj23 = defaultedMap4.remove((java.lang.Object) elitisticListPopulation19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b30 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.util.Collection collection34 = defaultedMap29.values();
        defaultedMap25.putAll((java.util.Map) defaultedMap29);
        boolean b37 = defaultedMap25.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap39.putAll((java.util.Map) defaultedMap42);
        java.util.Collection collection44 = defaultedMap39.values();
        java.util.Set set45 = defaultedMap39.entrySet();
        boolean b46 = defaultedMap25.containsKey((java.lang.Object) defaultedMap39);
        java.util.Collection collection47 = defaultedMap25.values();
        java.lang.Object obj49 = defaultedMap25.remove((java.lang.Object) '#');
        java.util.Collection collection50 = defaultedMap25.values();
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection50);
        elitisticListPopulation19.setPopulationLimit((int) '#');
        int i54 = elitisticListPopulation19.getPopulationLimit();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(i54 == 35);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap10.size();
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        int i20 = defaultedMap18.size();
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap24.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap24.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap30.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap30.putAll((java.util.Map) defaultedMap33);
        int i35 = defaultedMap33.size();
        defaultedMap27.putAll((java.util.Map) defaultedMap33);
        java.util.Set set37 = defaultedMap27.entrySet();
        boolean b38 = defaultedMap18.equals((java.lang.Object) defaultedMap27);
        java.lang.Object obj39 = defaultedMap10.remove((java.lang.Object) b38);
        java.lang.String str40 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj43 = null;
        boolean b44 = defaultedMap42.equals(obj43);
        int i45 = defaultedMap42.size();
        int i46 = defaultedMap42.size();
        boolean b47 = defaultedMap10.equals((java.lang.Object) defaultedMap42);
        int i48 = defaultedMap42.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 10 + "'", obj22.equals((short) 10));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(i48 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        double d10 = elitisticListPopulation5.getElitismRate();
        java.lang.String str11 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (short) 10);
        elitisticListPopulation5.setElitismRate(0.0d);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(population13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection18 = defaultedMap13.values();
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) defaultedMap13);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b22 = defaultedMap1.isEmpty();
        java.util.Set set23 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap4.isEmpty();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) b5);
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.String str8 = defaultedMap1.toString();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) (short) 10, 0.0d);
        elitisticListPopulation14.setPopulationLimit(1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap22.putAll((java.util.Map) defaultedMap25);
        java.util.Collection collection27 = defaultedMap22.values();
        defaultedMap18.putAll((java.util.Map) defaultedMap22);
        boolean b30 = defaultedMap18.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b33 = defaultedMap32.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap32.putAll((java.util.Map) defaultedMap35);
        java.util.Collection collection37 = defaultedMap32.values();
        java.util.Set set38 = defaultedMap32.entrySet();
        boolean b39 = defaultedMap18.containsKey((java.lang.Object) defaultedMap32);
        java.util.Collection collection40 = defaultedMap18.values();
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection40);
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome43, (int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation47.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome49 = elitisticListPopulation47.getChromosomes();
        elitisticListPopulation14.setChromosomes(list_chromosome49);
        boolean b51 = defaultedMap1.containsKey((java.lang.Object) list_chromosome49);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(list_chromosome48);
        org.junit.Assert.assertNotNull(list_chromosome49);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection18 = defaultedMap13.values();
        defaultedMap9.putAll((java.util.Map) defaultedMap13);
        boolean b21 = defaultedMap9.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b24 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap23.putAll((java.util.Map) defaultedMap26);
        java.util.Collection collection28 = defaultedMap23.values();
        java.util.Set set29 = defaultedMap23.entrySet();
        boolean b30 = defaultedMap9.containsKey((java.lang.Object) defaultedMap23);
        java.util.Collection collection31 = defaultedMap9.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection31);
        math.genetics.Chromosome chromosome33 = null;
        elitisticListPopulation5.addChromosome(chromosome33);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome35 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(spliterator_chromosome35);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) i6);
        java.lang.String str8 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 52);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short) 10 + "'", obj7.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate11, predicate12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (short) 10, 0.0d);
        elitisticListPopulation19.setPopulationLimit(1);
        java.lang.String str22 = elitisticListPopulation19.toString();
        java.lang.Object obj23 = defaultedMap4.remove((java.lang.Object) elitisticListPopulation19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b26 = defaultedMap25.isEmpty();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap25.putAll((java.util.Map) defaultedMap28);
        int i30 = defaultedMap28.size();
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) (byte) 10);
        java.lang.Object obj34 = defaultedMap28.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b39 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap38.putAll((java.util.Map) defaultedMap41);
        int i43 = defaultedMap41.size();
        java.lang.Object obj45 = defaultedMap41.get((java.lang.Object) (byte) 10);
        java.lang.Object obj47 = defaultedMap41.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate48, predicate49);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate35, predicate49);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b54 = defaultedMap53.isEmpty();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap53.putAll((java.util.Map) defaultedMap56);
        int i58 = defaultedMap56.size();
        java.lang.Object obj60 = defaultedMap56.get((java.lang.Object) (byte) 10);
        java.lang.Object obj62 = defaultedMap56.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj66 = defaultedMap64.remove((java.lang.Object) 0.0d);
        java.lang.Object obj67 = null;
        java.lang.Object obj68 = defaultedMap64.remove(obj67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b71 = defaultedMap70.isEmpty();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap70.putAll((java.util.Map) defaultedMap73);
        int i75 = defaultedMap73.size();
        defaultedMap64.putAll((java.util.Map) defaultedMap73);
        boolean b77 = defaultedMap64.isEmpty();
        java.lang.Object obj78 = defaultedMap56.remove((java.lang.Object) b77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b81 = defaultedMap80.isEmpty();
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap80.putAll((java.util.Map) defaultedMap83);
        int i85 = defaultedMap83.size();
        java.lang.Object obj87 = defaultedMap83.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b90 = defaultedMap89.isEmpty();
        collections.map.DefaultedMap defaultedMap92 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap89.putAll((java.util.Map) defaultedMap92);
        java.util.Collection collection94 = defaultedMap89.values();
        java.util.Set set95 = defaultedMap89.entrySet();
        boolean b96 = defaultedMap83.containsValue((java.lang.Object) set95);
        java.lang.Object obj97 = defaultedMap4.put(obj78, (java.lang.Object) b96);
        collections.Transformer transformer98 = null;
        try {
            java.util.Map map99 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 10 + "'", obj32.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 10 + "'", obj34.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) 10 + "'", obj45.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (short) 10 + "'", obj47.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (short) 10 + "'", obj60.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + (short) 10 + "'", obj62.equals((short) 10));
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(i85 == 0);
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + (short) 10 + "'", obj87.equals((short) 10));
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertNotNull(collection94);
        org.junit.Assert.assertNotNull(set95);
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b13 = defaultedMap1.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap20.isEmpty();
        java.lang.Object obj22 = defaultedMap17.remove((java.lang.Object) b21);
        boolean b23 = defaultedMap15.equals((java.lang.Object) b21);
        boolean b24 = defaultedMap1.equals((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 0.0d);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap26.remove(obj29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b33 = defaultedMap32.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap32.putAll((java.util.Map) defaultedMap35);
        int i37 = defaultedMap35.size();
        defaultedMap26.putAll((java.util.Map) defaultedMap35);
        boolean b39 = defaultedMap26.isEmpty();
        java.lang.Object obj40 = defaultedMap1.remove((java.lang.Object) b39);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        java.util.Collection collection17 = defaultedMap12.values();
        defaultedMap8.putAll((java.util.Map) defaultedMap12);
        boolean b20 = defaultedMap8.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap22.putAll((java.util.Map) defaultedMap25);
        java.util.Collection collection27 = defaultedMap22.values();
        java.util.Set set28 = defaultedMap22.entrySet();
        boolean b29 = defaultedMap8.containsKey((java.lang.Object) defaultedMap22);
        java.util.Collection collection30 = defaultedMap8.values();
        boolean b31 = defaultedMap1.equals((java.lang.Object) collection30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b34 = defaultedMap33.isEmpty();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap33.putAll((java.util.Map) defaultedMap36);
        int i38 = defaultedMap36.size();
        java.lang.Object obj40 = defaultedMap36.get((java.lang.Object) (byte) 10);
        java.lang.Object obj42 = defaultedMap36.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate43, predicate44);
        math.genetics.Chromosome[] chromosome_array46 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome47 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b48 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome47, chromosome_array46);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome47, (int) (short) 10, 0.0d);
        elitisticListPopulation51.setPopulationLimit(1);
        java.lang.String str54 = elitisticListPopulation51.toString();
        java.lang.Object obj55 = defaultedMap36.remove((java.lang.Object) elitisticListPopulation51);
        boolean b56 = defaultedMap1.containsValue((java.lang.Object) defaultedMap36);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short) 10 + "'", obj40.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 10 + "'", obj42.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(chromosome_array46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "[]" + "'", str54.equals("[]"));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap4.isEmpty();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) b5);
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        int i7 = elitisticListPopulation5.getPopulationSize();
        double d8 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(d8 == 0.0d);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b17 = defaultedMap16.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        int i21 = defaultedMap19.size();
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap13.entrySet();
        boolean b24 = defaultedMap4.equals((java.lang.Object) defaultedMap13);
        java.util.Collection collection25 = defaultedMap4.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap6.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap10.get(obj17);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 10 + "'", obj18.equals((short) 10));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        java.lang.String str4 = defaultedMap1.toString();
        java.util.Set set5 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation5.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 0L);
        double d3 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setElitismRate((double) 0L);
        java.lang.String str6 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap10.size();
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        int i20 = defaultedMap18.size();
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap24.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap24.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap30.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap30.putAll((java.util.Map) defaultedMap33);
        int i35 = defaultedMap33.size();
        defaultedMap27.putAll((java.util.Map) defaultedMap33);
        java.util.Set set37 = defaultedMap27.entrySet();
        boolean b38 = defaultedMap18.equals((java.lang.Object) defaultedMap27);
        java.lang.Object obj39 = defaultedMap10.remove((java.lang.Object) b38);
        collections.Factory factory40 = null;
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 10 + "'", obj22.equals((short) 10));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        int i10 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) -1, 10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.keySet();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b15 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        int i25 = defaultedMap23.size();
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap28.putAll((java.util.Map) defaultedMap31);
        int i33 = defaultedMap31.size();
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) (byte) 10);
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate38, predicate39);
        java.lang.Object obj41 = defaultedMap23.get((java.lang.Object) map40);
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) defaultedMap23);
        java.util.Set set43 = defaultedMap11.keySet();
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45, (int) (short) 10, 0.0d);
        elitisticListPopulation49.setPopulationLimit(1);
        java.lang.String str52 = elitisticListPopulation49.toString();
        int i53 = elitisticListPopulation49.getPopulationLimit();
        math.genetics.Chromosome chromosome54 = null;
        elitisticListPopulation49.addChromosome(chromosome54);
        java.lang.Object obj56 = defaultedMap11.get((java.lang.Object) chromosome54);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 10 + "'", obj35.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 10 + "'", obj37.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) 10 + "'", obj41.equals((short) 10));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "[]" + "'", str52.equals("[]"));
        org.junit.Assert.assertTrue(i53 == 1);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (short) 10 + "'", obj56.equals((short) 10));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap10.size();
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        int i20 = defaultedMap18.size();
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) (byte) 10);
        java.lang.Object obj24 = defaultedMap18.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate25, predicate26);
        java.lang.Object obj28 = defaultedMap10.get((java.lang.Object) map27);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) (short) 10, 0.0d);
        elitisticListPopulation34.setPopulationLimit(1);
        java.lang.String str37 = elitisticListPopulation34.toString();
        int i38 = elitisticListPopulation34.getPopulationLimit();
        java.lang.String str39 = elitisticListPopulation34.toString();
        java.util.Map map40 = collections.map.DefaultedMap.decorate(map27, (java.lang.Object) str39);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 10 + "'", obj22.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 10 + "'", obj24.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 10 + "'", obj28.equals((short) 10));
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
        org.junit.Assert.assertTrue(i38 == 1);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]" + "'", str39.equals("[]"));
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap10.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        boolean b14 = defaultedMap1.isEmpty();
        boolean b15 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap17.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap28.putAll((java.util.Map) defaultedMap31);
        java.util.Collection collection33 = defaultedMap28.values();
        defaultedMap24.putAll((java.util.Map) defaultedMap28);
        boolean b36 = defaultedMap24.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b39 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap38.putAll((java.util.Map) defaultedMap41);
        java.util.Collection collection43 = defaultedMap38.values();
        java.util.Set set44 = defaultedMap38.entrySet();
        boolean b45 = defaultedMap24.containsKey((java.lang.Object) defaultedMap38);
        java.util.Collection collection46 = defaultedMap24.values();
        boolean b47 = defaultedMap17.equals((java.lang.Object) collection46);
        java.lang.Object obj48 = defaultedMap1.remove((java.lang.Object) collection46);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b56 = defaultedMap55.isEmpty();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap55.putAll((java.util.Map) defaultedMap58);
        java.util.Collection collection60 = defaultedMap55.values();
        defaultedMap51.putAll((java.util.Map) defaultedMap55);
        boolean b63 = defaultedMap51.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b66 = defaultedMap65.isEmpty();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap65.putAll((java.util.Map) defaultedMap68);
        java.util.Collection collection70 = defaultedMap65.values();
        java.util.Set set71 = defaultedMap65.entrySet();
        boolean b72 = defaultedMap51.containsKey((java.lang.Object) defaultedMap65);
        java.util.Set set73 = defaultedMap51.entrySet();
        boolean b74 = defaultedMap1.containsKey((java.lang.Object) set73);
        boolean b75 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 0.0d);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.remove(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b15 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        int i19 = defaultedMap17.size();
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj24 = defaultedMap8.put((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap23);
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.String str26 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.keySet();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 52);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b4 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection8 = defaultedMap3.values();
        java.util.Set set9 = defaultedMap3.entrySet();
        java.util.Set set10 = defaultedMap3.keySet();
        java.util.Set set11 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate11, predicate12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (short) 10, 0.0d);
        elitisticListPopulation19.setPopulationLimit(1);
        java.lang.String str22 = elitisticListPopulation19.toString();
        java.lang.Object obj23 = defaultedMap4.remove((java.lang.Object) elitisticListPopulation19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b30 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.util.Collection collection34 = defaultedMap29.values();
        defaultedMap25.putAll((java.util.Map) defaultedMap29);
        boolean b37 = defaultedMap25.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap39.putAll((java.util.Map) defaultedMap42);
        java.util.Collection collection44 = defaultedMap39.values();
        java.util.Set set45 = defaultedMap39.entrySet();
        boolean b46 = defaultedMap25.containsKey((java.lang.Object) defaultedMap39);
        java.util.Collection collection47 = defaultedMap25.values();
        java.lang.Object obj49 = defaultedMap25.remove((java.lang.Object) '#');
        java.util.Collection collection50 = defaultedMap25.values();
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection50);
        elitisticListPopulation19.setPopulationLimit((int) '#');
        math.genetics.ElitisticListPopulation elitisticListPopulation56 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome57 = elitisticListPopulation56.getChromosomes();
        elitisticListPopulation19.setChromosomes(list_chromosome57);
        java.lang.String str59 = elitisticListPopulation19.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome60 = elitisticListPopulation19.getChromosomes();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(list_chromosome57);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "[]" + "'", str59.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome60);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b13 = defaultedMap1.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection20 = defaultedMap15.values();
        java.util.Set set21 = defaultedMap15.entrySet();
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) defaultedMap15);
        boolean b24 = defaultedMap15.equals((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap15);
        defaultedMap25.clear();
        java.util.Collection collection27 = defaultedMap25.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) predicateUtils14);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap24.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap24.putAll((java.util.Map) defaultedMap27);
        java.util.Collection collection29 = defaultedMap24.values();
        defaultedMap20.putAll((java.util.Map) defaultedMap24);
        boolean b32 = defaultedMap20.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b35 = defaultedMap34.isEmpty();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap34.putAll((java.util.Map) defaultedMap37);
        java.util.Collection collection39 = defaultedMap34.values();
        java.util.Set set40 = defaultedMap34.entrySet();
        boolean b41 = defaultedMap20.containsKey((java.lang.Object) defaultedMap34);
        java.util.Collection collection42 = defaultedMap20.values();
        java.util.Map map43 = collections.map.DefaultedMap.decorate(map18, (java.lang.Object) defaultedMap20);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap46.isEmpty();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap46.putAll((java.util.Map) defaultedMap49);
        int i51 = defaultedMap49.size();
        java.lang.Object obj53 = defaultedMap49.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b56 = defaultedMap55.isEmpty();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap55.putAll((java.util.Map) defaultedMap58);
        java.util.Collection collection60 = defaultedMap55.values();
        java.util.Set set61 = defaultedMap55.entrySet();
        boolean b62 = defaultedMap49.containsValue((java.lang.Object) set61);
        java.lang.Object obj63 = defaultedMap20.put((java.lang.Object) predicate44, (java.lang.Object) b62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj67 = defaultedMap65.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b70 = defaultedMap69.isEmpty();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap69.putAll((java.util.Map) defaultedMap72);
        java.util.Collection collection74 = defaultedMap69.values();
        defaultedMap65.putAll((java.util.Map) defaultedMap69);
        java.lang.Object obj76 = defaultedMap20.get((java.lang.Object) defaultedMap69);
        java.util.Collection collection77 = defaultedMap20.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 10 + "'", obj53.equals((short) 10));
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + (short) 10 + "'", obj76.equals((short) 10));
        org.junit.Assert.assertNotNull(collection77);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        double d10 = elitisticListPopulation5.getElitismRate();
        java.lang.String str11 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation5.iterator();
        java.lang.String str14 = elitisticListPopulation5.toString();
        try {
            elitisticListPopulation5.setElitismRate((double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        int i4 = defaultedMap1.size();
        int i5 = defaultedMap1.size();
        java.lang.String str6 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap10.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        java.util.Collection collection25 = defaultedMap20.values();
        java.util.Set set26 = defaultedMap20.entrySet();
        java.util.Set set27 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b30 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        int i34 = defaultedMap32.size();
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) (byte) 10);
        java.lang.Object obj38 = defaultedMap32.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate39, predicate40);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) defaultedMap32);
        int i43 = defaultedMap20.size();
        boolean b44 = defaultedMap18.containsValue((java.lang.Object) i43);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 10 + "'", obj36.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 10 + "'", obj38.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection18 = defaultedMap13.values();
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) defaultedMap13);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b22 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap28.putAll((java.util.Map) defaultedMap31);
        java.util.Collection collection33 = defaultedMap28.values();
        defaultedMap24.putAll((java.util.Map) defaultedMap28);
        java.lang.String str35 = defaultedMap28.toString();
        java.lang.Object obj36 = defaultedMap1.get((java.lang.Object) str35);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 10 + "'", obj36.equals((short) 10));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        java.util.Collection collection17 = defaultedMap12.values();
        java.util.Set set18 = defaultedMap12.entrySet();
        java.util.Set set19 = defaultedMap12.entrySet();
        java.lang.Object obj20 = defaultedMap4.get((java.lang.Object) set19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b27 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap26.putAll((java.util.Map) defaultedMap29);
        java.util.Collection collection31 = defaultedMap26.values();
        defaultedMap22.putAll((java.util.Map) defaultedMap26);
        boolean b34 = defaultedMap22.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b37 = defaultedMap36.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap36.putAll((java.util.Map) defaultedMap39);
        java.util.Collection collection41 = defaultedMap36.values();
        java.util.Set set42 = defaultedMap36.entrySet();
        boolean b43 = defaultedMap22.containsKey((java.lang.Object) defaultedMap36);
        java.util.Collection collection44 = defaultedMap22.values();
        java.lang.Object obj46 = defaultedMap22.remove((java.lang.Object) '#');
        java.lang.Object obj47 = defaultedMap4.remove(obj46);
        java.util.Set set48 = defaultedMap4.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 10 + "'", obj20.equals((short) 10));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set48);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) predicateUtils14);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap24.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap24.putAll((java.util.Map) defaultedMap27);
        java.util.Collection collection29 = defaultedMap24.values();
        defaultedMap20.putAll((java.util.Map) defaultedMap24);
        boolean b32 = defaultedMap20.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b35 = defaultedMap34.isEmpty();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap34.putAll((java.util.Map) defaultedMap37);
        java.util.Collection collection39 = defaultedMap34.values();
        java.util.Set set40 = defaultedMap34.entrySet();
        boolean b41 = defaultedMap20.containsKey((java.lang.Object) defaultedMap34);
        java.util.Collection collection42 = defaultedMap20.values();
        java.util.Map map43 = collections.map.DefaultedMap.decorate(map18, (java.lang.Object) defaultedMap20);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap46.isEmpty();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap46.putAll((java.util.Map) defaultedMap49);
        int i51 = defaultedMap49.size();
        java.lang.Object obj53 = defaultedMap49.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b56 = defaultedMap55.isEmpty();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap55.putAll((java.util.Map) defaultedMap58);
        java.util.Collection collection60 = defaultedMap55.values();
        java.util.Set set61 = defaultedMap55.entrySet();
        boolean b62 = defaultedMap49.containsValue((java.lang.Object) set61);
        java.lang.Object obj63 = defaultedMap20.put((java.lang.Object) predicate44, (java.lang.Object) b62);
        java.util.Set set64 = defaultedMap20.keySet();
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        math.genetics.ElitisticListPopulation elitisticListPopulation70 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome66, (int) (short) 10, 0.0d);
        elitisticListPopulation70.setPopulationLimit(1);
        java.lang.String str73 = elitisticListPopulation70.toString();
        int i74 = elitisticListPopulation70.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome75 = elitisticListPopulation70.getChromosomes();
        java.lang.Object obj76 = defaultedMap20.remove((java.lang.Object) list_chromosome75);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome77 = list_chromosome75.spliterator();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 10 + "'", obj53.equals((short) 10));
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "[]" + "'", str73.equals("[]"));
        org.junit.Assert.assertTrue(i74 == 1);
        org.junit.Assert.assertNotNull(list_chromosome75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(spliterator_chromosome77);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection18 = defaultedMap13.values();
        defaultedMap9.putAll((java.util.Map) defaultedMap13);
        boolean b21 = defaultedMap9.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b24 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap23.putAll((java.util.Map) defaultedMap26);
        java.util.Collection collection28 = defaultedMap23.values();
        java.util.Set set29 = defaultedMap23.entrySet();
        boolean b30 = defaultedMap9.containsKey((java.lang.Object) defaultedMap23);
        java.util.Collection collection31 = defaultedMap9.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection31);
        math.genetics.Chromosome chromosome33 = null;
        elitisticListPopulation5.addChromosome(chromosome33);
        int i35 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(i35 == 1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate11, predicate12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (short) 10, 0.0d);
        elitisticListPopulation19.setPopulationLimit(1);
        java.lang.String str22 = elitisticListPopulation19.toString();
        java.lang.Object obj23 = defaultedMap4.remove((java.lang.Object) elitisticListPopulation19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b30 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.util.Collection collection34 = defaultedMap29.values();
        defaultedMap25.putAll((java.util.Map) defaultedMap29);
        boolean b37 = defaultedMap25.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap39.putAll((java.util.Map) defaultedMap42);
        java.util.Collection collection44 = defaultedMap39.values();
        java.util.Set set45 = defaultedMap39.entrySet();
        boolean b46 = defaultedMap25.containsKey((java.lang.Object) defaultedMap39);
        java.util.Collection collection47 = defaultedMap25.values();
        java.lang.Object obj49 = defaultedMap25.remove((java.lang.Object) '#');
        java.util.Collection collection50 = defaultedMap25.values();
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection50);
        math.genetics.Chromosome chromosome52 = null;
        elitisticListPopulation19.addChromosome(chromosome52);
        elitisticListPopulation19.setPopulationLimit((int) (byte) 1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection50);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b13 = defaultedMap1.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection20 = defaultedMap15.values();
        java.util.Set set21 = defaultedMap15.entrySet();
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) defaultedMap15);
        java.util.Collection collection23 = defaultedMap1.values();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate24, predicate25);
        java.lang.String str27 = defaultedMap1.toString();
        int i28 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(i28 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        double d10 = elitisticListPopulation5.getElitismRate();
        java.lang.String str11 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation5.iterator();
        int i14 = elitisticListPopulation5.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        java.util.Collection collection17 = defaultedMap12.values();
        java.util.Set set18 = defaultedMap12.entrySet();
        java.util.Set set19 = defaultedMap12.entrySet();
        java.lang.Object obj20 = defaultedMap4.get((java.lang.Object) set19);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) (short) 10, 0.0d);
        elitisticListPopulation26.setPopulationLimit(1);
        java.lang.String str29 = elitisticListPopulation26.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation26.getChromosomes();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 0.0d);
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        java.lang.Object obj37 = defaultedMap4.put((java.lang.Object) elitisticListPopulation26, (java.lang.Object) defaultedMap32);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) (short) 10, 0.0d);
        elitisticListPopulation43.setPopulationLimit(1);
        java.lang.String str46 = elitisticListPopulation43.toString();
        int i47 = elitisticListPopulation43.getPopulationSize();
        java.lang.String str48 = elitisticListPopulation43.toString();
        double d49 = elitisticListPopulation43.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome50 = elitisticListPopulation43.spliterator();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b53 = defaultedMap52.isEmpty();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap52.putAll((java.util.Map) defaultedMap55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap58.isEmpty();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap58.putAll((java.util.Map) defaultedMap61);
        int i63 = defaultedMap61.size();
        defaultedMap55.putAll((java.util.Map) defaultedMap61);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b67 = defaultedMap66.isEmpty();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap66.putAll((java.util.Map) defaultedMap69);
        int i71 = defaultedMap69.size();
        java.lang.Object obj73 = defaultedMap69.get((java.lang.Object) (byte) 10);
        java.lang.Object obj75 = defaultedMap69.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate76, predicate77);
        java.lang.Object obj79 = defaultedMap61.get((java.lang.Object) map78);
        java.lang.Object obj80 = defaultedMap4.put((java.lang.Object) elitisticListPopulation43, (java.lang.Object) defaultedMap61);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome81 = elitisticListPopulation43.iterator();
        math.genetics.Chromosome chromosome82 = null;
        elitisticListPopulation43.addChromosome(chromosome82);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 10 + "'", obj20.equals((short) 10));
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]" + "'", str29.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]" + "'", str46.equals("[]"));
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[]" + "'", str48.equals("[]"));
        org.junit.Assert.assertTrue(d49 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + (short) 10 + "'", obj73.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + (short) 10 + "'", obj75.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + (short) 10 + "'", obj79.equals((short) 10));
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(iterator_chromosome81);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation5.addChromosome(chromosome10);
        double d12 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertNotNull(population13);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate11, predicate12);
        java.util.Set set14 = defaultedMap4.keySet();
        java.util.Set set15 = defaultedMap4.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        int i11 = elitisticListPopulation5.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 0L);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.lang.String str4 = elitisticListPopulation2.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap6.putAll((java.util.Map) defaultedMap10);
        boolean b18 = defaultedMap6.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        java.util.Collection collection25 = defaultedMap20.values();
        java.util.Set set26 = defaultedMap20.entrySet();
        boolean b27 = defaultedMap6.containsKey((java.lang.Object) defaultedMap20);
        java.util.Collection collection28 = defaultedMap6.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection28);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate11, predicate12);
        java.util.Collection collection14 = defaultedMap4.values();
        java.lang.Object obj16 = defaultedMap4.remove((java.lang.Object) 100);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        int i17 = defaultedMap15.size();
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) (byte) 10);
        java.lang.Object obj21 = defaultedMap15.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate22, predicate23);
        java.util.Collection collection25 = defaultedMap15.values();
        boolean b26 = defaultedMap9.containsKey((java.lang.Object) defaultedMap15);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, (int) (short) 10, 0.0d);
        elitisticListPopulation32.setPopulationLimit(1);
        java.lang.String str35 = elitisticListPopulation32.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation32.getChromosomes();
        double d37 = elitisticListPopulation32.getElitismRate();
        java.lang.String str38 = elitisticListPopulation32.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome39 = elitisticListPopulation32.iterator();
        math.genetics.Population population40 = elitisticListPopulation32.nextGeneration();
        elitisticListPopulation32.setPopulationLimit((int) (short) 10);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b45 = defaultedMap44.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap44.putAll((java.util.Map) defaultedMap47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b51 = defaultedMap50.isEmpty();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap50.putAll((java.util.Map) defaultedMap53);
        int i55 = defaultedMap53.size();
        defaultedMap47.putAll((java.util.Map) defaultedMap53);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b63 = defaultedMap62.isEmpty();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap62.putAll((java.util.Map) defaultedMap65);
        java.util.Collection collection67 = defaultedMap62.values();
        defaultedMap58.putAll((java.util.Map) defaultedMap62);
        boolean b70 = defaultedMap58.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b73 = defaultedMap72.isEmpty();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap72.putAll((java.util.Map) defaultedMap75);
        java.util.Collection collection77 = defaultedMap72.values();
        java.util.Set set78 = defaultedMap72.entrySet();
        boolean b79 = defaultedMap58.containsKey((java.lang.Object) defaultedMap72);
        boolean b81 = defaultedMap72.equals((java.lang.Object) '4');
        boolean b82 = defaultedMap47.containsValue((java.lang.Object) '4');
        java.lang.Object obj83 = defaultedMap15.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap47);
        java.lang.Object obj84 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[]" + "'", str35.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertTrue(d37 == 0.0d);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome39);
        org.junit.Assert.assertNotNull(population40);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + (short) 10 + "'", obj84.equals((short) 10));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b13 = defaultedMap1.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection20 = defaultedMap15.values();
        java.util.Set set21 = defaultedMap15.entrySet();
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) defaultedMap15);
        boolean b24 = defaultedMap15.containsValue((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b27 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap26.putAll((java.util.Map) defaultedMap29);
        java.util.Collection collection31 = defaultedMap26.values();
        java.util.Set set32 = defaultedMap26.entrySet();
        java.util.Set set33 = defaultedMap26.keySet();
        boolean b34 = defaultedMap15.containsKey((java.lang.Object) set33);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 0L);
        double d3 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setElitismRate((double) 0L);
        int i6 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        double d10 = elitisticListPopulation5.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation17.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation17.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome19);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertNotNull(list_chromosome19);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        double d10 = elitisticListPopulation5.getElitismRate();
        java.lang.String str11 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (short) 10);
        math.genetics.Population population16 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setElitismRate((double) (byte) 0);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(population16);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap10.size();
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        int i20 = defaultedMap18.size();
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) (byte) 10);
        java.lang.Object obj24 = defaultedMap18.get((java.lang.Object) (byte) -1);
        java.lang.Object obj25 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        int i32 = defaultedMap30.size();
        defaultedMap4.putAll((java.util.Map) defaultedMap30);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 10 + "'", obj22.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 10 + "'", obj24.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 10 + "'", obj25.equals((short) 10));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i32 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap6.putAll((java.util.Map) defaultedMap10);
        boolean b18 = defaultedMap6.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        java.util.Collection collection25 = defaultedMap20.values();
        java.util.Set set26 = defaultedMap20.entrySet();
        boolean b27 = defaultedMap6.containsKey((java.lang.Object) defaultedMap20);
        java.util.Set set28 = defaultedMap6.entrySet();
        java.util.Set set29 = defaultedMap6.keySet();
        boolean b30 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationSize();
        double d10 = elitisticListPopulation5.getElitismRate();
        int i11 = elitisticListPopulation5.getPopulationSize();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 0.0d);
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap13.remove(obj16);
        java.util.Set set18 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 0.0d);
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap20.remove(obj23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b27 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap26.putAll((java.util.Map) defaultedMap29);
        int i31 = defaultedMap29.size();
        defaultedMap20.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj36 = defaultedMap20.put((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap35);
        java.lang.Object obj37 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.util.Collection collection38 = defaultedMap13.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection38);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.keySet();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b15 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        int i25 = defaultedMap23.size();
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap28.putAll((java.util.Map) defaultedMap31);
        int i33 = defaultedMap31.size();
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) (byte) 10);
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate38, predicate39);
        java.lang.Object obj41 = defaultedMap23.get((java.lang.Object) map40);
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) defaultedMap23);
        java.util.Set set43 = defaultedMap23.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 10 + "'", obj35.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 10 + "'", obj37.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) 10 + "'", obj41.equals((short) 10));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 0L);
        double d13 = elitisticListPopulation12.getElitismRate();
        java.lang.String str14 = elitisticListPopulation12.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) (short) 10, 0.0d);
        elitisticListPopulation13.setPopulationLimit(1);
        java.lang.String str16 = elitisticListPopulation13.toString();
        int i17 = elitisticListPopulation13.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(list_chromosome18, (int) (short) 10, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation30.getChromosomes();
        elitisticListPopulation24.setChromosomes(list_chromosome31);
        elitisticListPopulation21.setChromosomes(list_chromosome31);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation(list_chromosome31, (int) (short) 10, (double) 0L);
        elitisticListPopulation5.setChromosomes(list_chromosome31);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap39.putAll((java.util.Map) defaultedMap42);
        java.util.Collection collection44 = defaultedMap39.values();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b51 = defaultedMap50.isEmpty();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap50.putAll((java.util.Map) defaultedMap53);
        java.util.Collection collection55 = defaultedMap50.values();
        defaultedMap46.putAll((java.util.Map) defaultedMap50);
        boolean b58 = defaultedMap46.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b61 = defaultedMap60.isEmpty();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap60.putAll((java.util.Map) defaultedMap63);
        java.util.Collection collection65 = defaultedMap60.values();
        java.util.Set set66 = defaultedMap60.entrySet();
        boolean b67 = defaultedMap46.containsKey((java.lang.Object) defaultedMap60);
        java.util.Collection collection68 = defaultedMap46.values();
        boolean b69 = defaultedMap39.equals((java.lang.Object) collection68);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection68);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) (short) 10, 0.0d);
        elitisticListPopulation13.setPopulationLimit(1);
        java.lang.String str16 = elitisticListPopulation13.toString();
        int i17 = elitisticListPopulation13.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(list_chromosome18, (int) (short) 10, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation30.getChromosomes();
        elitisticListPopulation24.setChromosomes(list_chromosome31);
        elitisticListPopulation21.setChromosomes(list_chromosome31);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation(list_chromosome31, (int) (short) 10, (double) 0L);
        elitisticListPopulation5.setChromosomes(list_chromosome31);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) (short) 10, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome44 = elitisticListPopulation43.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation43.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation(list_chromosome45, 1, 0.0d);
        elitisticListPopulation5.setChromosomes(list_chromosome45);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(list_chromosome44);
        org.junit.Assert.assertNotNull(list_chromosome45);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        java.util.Collection collection17 = defaultedMap12.values();
        java.util.Set set18 = defaultedMap12.entrySet();
        java.util.Set set19 = defaultedMap12.entrySet();
        java.lang.Object obj20 = defaultedMap4.get((java.lang.Object) set19);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) (short) 10, 0.0d);
        elitisticListPopulation26.setPopulationLimit(1);
        java.lang.String str29 = elitisticListPopulation26.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation26.getChromosomes();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 0.0d);
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        java.lang.Object obj37 = defaultedMap4.put((java.lang.Object) elitisticListPopulation26, (java.lang.Object) defaultedMap32);
        java.lang.String str38 = elitisticListPopulation26.toString();
        java.lang.String str39 = elitisticListPopulation26.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 10 + "'", obj20.equals((short) 10));
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]" + "'", str29.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]" + "'", str39.equals("[]"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b13 = defaultedMap1.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection20 = defaultedMap15.values();
        java.util.Set set21 = defaultedMap15.entrySet();
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) defaultedMap15);
        boolean b24 = defaultedMap15.equals((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b34 = defaultedMap33.isEmpty();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap33.putAll((java.util.Map) defaultedMap36);
        int i38 = defaultedMap36.size();
        defaultedMap30.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b46 = defaultedMap45.isEmpty();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap45.putAll((java.util.Map) defaultedMap48);
        java.util.Collection collection50 = defaultedMap45.values();
        defaultedMap41.putAll((java.util.Map) defaultedMap45);
        boolean b53 = defaultedMap41.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b56 = defaultedMap55.isEmpty();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap55.putAll((java.util.Map) defaultedMap58);
        java.util.Collection collection60 = defaultedMap55.values();
        java.util.Set set61 = defaultedMap55.entrySet();
        boolean b62 = defaultedMap41.containsKey((java.lang.Object) defaultedMap55);
        boolean b64 = defaultedMap55.equals((java.lang.Object) '4');
        boolean b65 = defaultedMap30.containsValue((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b68 = defaultedMap67.isEmpty();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap67.putAll((java.util.Map) defaultedMap70);
        int i72 = defaultedMap70.size();
        java.lang.Object obj74 = defaultedMap70.get((java.lang.Object) (byte) 10);
        java.lang.Object obj76 = defaultedMap70.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj80 = defaultedMap78.remove((java.lang.Object) 0.0d);
        java.lang.Object obj81 = null;
        java.lang.Object obj82 = defaultedMap78.remove(obj81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b85 = defaultedMap84.isEmpty();
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap84.putAll((java.util.Map) defaultedMap87);
        int i89 = defaultedMap87.size();
        defaultedMap78.putAll((java.util.Map) defaultedMap87);
        boolean b91 = defaultedMap78.isEmpty();
        java.lang.Object obj92 = defaultedMap70.remove((java.lang.Object) b91);
        java.lang.Object obj93 = defaultedMap25.put((java.lang.Object) defaultedMap30, obj92);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (short) 10 + "'", obj74.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + (short) 10 + "'", obj76.equals((short) 10));
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(i89 == 0);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNull(obj93);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        int i4 = defaultedMap1.size();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b13 = defaultedMap1.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection20 = defaultedMap15.values();
        java.util.Set set21 = defaultedMap15.entrySet();
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) defaultedMap15);
        java.util.Collection collection23 = defaultedMap1.values();
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) '#');
        java.util.Collection collection26 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap28.putAll((java.util.Map) defaultedMap31);
        int i33 = defaultedMap31.size();
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) (byte) 10);
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap39.isEmpty();
        collections.PredicateUtils predicateUtils41 = new collections.PredicateUtils();
        boolean b42 = defaultedMap39.containsKey((java.lang.Object) predicateUtils41);
        defaultedMap31.putAll((java.util.Map) defaultedMap39);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b52 = defaultedMap51.isEmpty();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap51.putAll((java.util.Map) defaultedMap54);
        java.util.Collection collection56 = defaultedMap51.values();
        defaultedMap47.putAll((java.util.Map) defaultedMap51);
        boolean b59 = defaultedMap47.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b62 = defaultedMap61.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap61.putAll((java.util.Map) defaultedMap64);
        java.util.Collection collection66 = defaultedMap61.values();
        java.util.Set set67 = defaultedMap61.entrySet();
        boolean b68 = defaultedMap47.containsKey((java.lang.Object) defaultedMap61);
        java.util.Collection collection69 = defaultedMap47.values();
        java.util.Map map70 = collections.map.DefaultedMap.decorate(map45, (java.lang.Object) defaultedMap47);
        boolean b71 = defaultedMap1.containsKey((java.lang.Object) map45);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 10 + "'", obj35.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 10 + "'", obj37.equals((short) 10));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationSize();
        java.lang.String str10 = elitisticListPopulation5.toString();
        double d11 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation5.addChromosome(chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertTrue(d11 == 0.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        double d10 = elitisticListPopulation5.getElitismRate();
        java.lang.String str11 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 100);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.keySet();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b15 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        int i25 = defaultedMap23.size();
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap28.putAll((java.util.Map) defaultedMap31);
        int i33 = defaultedMap31.size();
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) (byte) 10);
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate38, predicate39);
        java.lang.Object obj41 = defaultedMap23.get((java.lang.Object) map40);
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b45 = defaultedMap44.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap44.putAll((java.util.Map) defaultedMap47);
        int i49 = defaultedMap47.size();
        java.lang.Object obj51 = defaultedMap47.get((java.lang.Object) (byte) 10);
        java.lang.Object obj53 = defaultedMap47.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b56 = defaultedMap55.isEmpty();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap55.putAll((java.util.Map) defaultedMap58);
        java.util.Collection collection60 = defaultedMap55.values();
        java.util.Set set61 = defaultedMap55.entrySet();
        java.util.Set set62 = defaultedMap55.entrySet();
        java.lang.Object obj63 = defaultedMap47.get((java.lang.Object) set62);
        boolean b64 = defaultedMap1.equals((java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj68 = defaultedMap66.remove((java.lang.Object) 0.0d);
        java.lang.Object obj69 = null;
        java.lang.Object obj70 = defaultedMap66.remove(obj69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b73 = defaultedMap72.isEmpty();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap72.putAll((java.util.Map) defaultedMap75);
        int i77 = defaultedMap75.size();
        defaultedMap66.putAll((java.util.Map) defaultedMap75);
        java.util.Set set79 = defaultedMap66.keySet();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj83 = defaultedMap81.remove((java.lang.Object) 0.0d);
        java.lang.Object obj84 = null;
        java.lang.Object obj85 = defaultedMap81.remove(obj84);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b88 = defaultedMap87.isEmpty();
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap87.putAll((java.util.Map) defaultedMap90);
        int i92 = defaultedMap90.size();
        defaultedMap81.putAll((java.util.Map) defaultedMap90);
        boolean b94 = defaultedMap81.isEmpty();
        boolean b95 = defaultedMap81.isEmpty();
        java.lang.Object obj96 = defaultedMap1.put((java.lang.Object) defaultedMap66, (java.lang.Object) b95);
        boolean b97 = defaultedMap66.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 10 + "'", obj35.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 10 + "'", obj37.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) 10 + "'", obj41.equals((short) 10));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (short) 10 + "'", obj51.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 10 + "'", obj53.equals((short) 10));
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (short) 10 + "'", obj63.equals((short) 10));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(i92 == 0);
        org.junit.Assert.assertTrue(b94 == true);
        org.junit.Assert.assertTrue(b95 == true);
        org.junit.Assert.assertNotNull(obj96);
        org.junit.Assert.assertTrue(b97 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(list_chromosome10, (int) (short) 10, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = list_chromosome10.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate11, predicate12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (short) 10, 0.0d);
        elitisticListPopulation19.setPopulationLimit(1);
        java.lang.String str22 = elitisticListPopulation19.toString();
        java.lang.Object obj23 = defaultedMap4.remove((java.lang.Object) elitisticListPopulation19);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) (short) 10, 0.0d);
        boolean b30 = defaultedMap4.containsValue((java.lang.Object) elitisticListPopulation29);
        int i31 = elitisticListPopulation29.getPopulationSize();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        java.util.Collection collection15 = defaultedMap10.values();
        java.util.Set set16 = defaultedMap10.entrySet();
        boolean b17 = defaultedMap4.containsValue((java.lang.Object) set16);
        int i18 = defaultedMap4.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) 0.0f);
        defaultedMap1.clear();
        java.util.Collection collection12 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertNotNull(population4);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b13 = defaultedMap1.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection20 = defaultedMap15.values();
        java.util.Set set21 = defaultedMap15.entrySet();
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) defaultedMap15);
        java.util.Collection collection23 = defaultedMap1.values();
        java.util.Collection collection24 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap10.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap19.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap19.putAll((java.util.Map) defaultedMap22);
        int i24 = defaultedMap22.size();
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) (byte) 10);
        java.lang.Object obj28 = defaultedMap22.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap30.isEmpty();
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        boolean b33 = defaultedMap30.containsKey((java.lang.Object) predicateUtils32);
        defaultedMap22.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b38 = defaultedMap37.isEmpty();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap37.putAll((java.util.Map) defaultedMap40);
        java.util.Collection collection42 = defaultedMap37.values();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b49 = defaultedMap48.isEmpty();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap48.putAll((java.util.Map) defaultedMap51);
        java.util.Collection collection53 = defaultedMap48.values();
        defaultedMap44.putAll((java.util.Map) defaultedMap48);
        boolean b56 = defaultedMap44.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap58.isEmpty();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap58.putAll((java.util.Map) defaultedMap61);
        java.util.Collection collection63 = defaultedMap58.values();
        java.util.Set set64 = defaultedMap58.entrySet();
        boolean b65 = defaultedMap44.containsKey((java.lang.Object) defaultedMap58);
        java.util.Collection collection66 = defaultedMap44.values();
        boolean b67 = defaultedMap37.equals((java.lang.Object) collection66);
        java.lang.Object obj68 = defaultedMap22.put((java.lang.Object) '4', (java.lang.Object) b67);
        int i69 = defaultedMap22.size();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) i69);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 10 + "'", obj26.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 10 + "'", obj28.equals((short) 10));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(i69 == 1);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection10 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection18 = defaultedMap13.values();
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) defaultedMap13);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b22 = defaultedMap1.isEmpty();
        collections.Factory factory23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (short) 10, 0.0d);
        elitisticListPopulation9.setPopulationLimit(1);
        java.lang.String str12 = elitisticListPopulation9.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation9.getChromosomes();
        double d14 = elitisticListPopulation9.getElitismRate();
        java.lang.String str15 = elitisticListPopulation9.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation9.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation9.iterator();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) iterator_chromosome17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        int i25 = defaultedMap23.size();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap28.putAll((java.util.Map) defaultedMap31);
        int i33 = defaultedMap31.size();
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) (byte) 10);
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate26, predicate38);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b44 = defaultedMap43.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap43.putAll((java.util.Map) defaultedMap46);
        int i48 = defaultedMap46.size();
        java.lang.Object obj50 = defaultedMap46.get((java.lang.Object) (byte) 10);
        java.lang.Object obj52 = defaultedMap46.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate53, predicate54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b58 = defaultedMap57.isEmpty();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap57.putAll((java.util.Map) defaultedMap60);
        int i62 = defaultedMap60.size();
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) (byte) 10);
        java.lang.Object obj66 = defaultedMap60.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate67, predicate68);
        boolean b70 = defaultedMap46.equals((java.lang.Object) predicate67);
        java.util.Map map71 = collections.map.PredicatedMap.decorate(map18, predicate38, predicate67);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]" + "'", str15.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 10 + "'", obj35.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 10 + "'", obj37.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (short) 10 + "'", obj50.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (short) 10 + "'", obj52.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (short) 10 + "'", obj64.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + (short) 10 + "'", obj66.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(map71);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        java.util.Collection collection17 = defaultedMap12.values();
        java.util.Set set18 = defaultedMap12.entrySet();
        java.util.Set set19 = defaultedMap12.entrySet();
        java.lang.Object obj20 = defaultedMap4.get((java.lang.Object) set19);
        boolean b21 = defaultedMap4.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 10 + "'", obj20.equals((short) 10));
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationSize();
        java.lang.String str10 = elitisticListPopulation5.toString();
        double d11 = elitisticListPopulation5.getElitismRate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        int i18 = defaultedMap16.size();
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) (byte) 10);
        java.lang.Object obj22 = defaultedMap16.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap24.isEmpty();
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) predicateUtils26);
        defaultedMap16.putAll((java.util.Map) defaultedMap24);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b37 = defaultedMap36.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap36.putAll((java.util.Map) defaultedMap39);
        java.util.Collection collection41 = defaultedMap36.values();
        defaultedMap32.putAll((java.util.Map) defaultedMap36);
        boolean b44 = defaultedMap32.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap46.isEmpty();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap46.putAll((java.util.Map) defaultedMap49);
        java.util.Collection collection51 = defaultedMap46.values();
        java.util.Set set52 = defaultedMap46.entrySet();
        boolean b53 = defaultedMap32.containsKey((java.lang.Object) defaultedMap46);
        java.util.Collection collection54 = defaultedMap32.values();
        java.util.Map map55 = collections.map.DefaultedMap.decorate(map30, (java.lang.Object) defaultedMap32);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap58.isEmpty();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap58.putAll((java.util.Map) defaultedMap61);
        int i63 = defaultedMap61.size();
        java.lang.Object obj65 = defaultedMap61.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b68 = defaultedMap67.isEmpty();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap67.putAll((java.util.Map) defaultedMap70);
        java.util.Collection collection72 = defaultedMap67.values();
        java.util.Set set73 = defaultedMap67.entrySet();
        boolean b74 = defaultedMap61.containsValue((java.lang.Object) set73);
        java.lang.Object obj75 = defaultedMap32.put((java.lang.Object) predicate56, (java.lang.Object) b74);
        java.util.Set set76 = defaultedMap32.keySet();
        math.genetics.Chromosome[] chromosome_array77 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome78 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b79 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome78, chromosome_array77);
        math.genetics.ElitisticListPopulation elitisticListPopulation82 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome78, (int) (short) 10, 0.0d);
        elitisticListPopulation82.setPopulationLimit(1);
        java.lang.String str85 = elitisticListPopulation82.toString();
        int i86 = elitisticListPopulation82.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome87 = elitisticListPopulation82.getChromosomes();
        java.lang.Object obj88 = defaultedMap32.remove((java.lang.Object) list_chromosome87);
        elitisticListPopulation5.setChromosomes(list_chromosome87);
        java.lang.String str90 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 10 + "'", obj20.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 10 + "'", obj22.equals((short) 10));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (short) 10 + "'", obj65.equals((short) 10));
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNotNull(chromosome_array77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "[]" + "'", str85.equals("[]"));
        org.junit.Assert.assertTrue(i86 == 1);
        org.junit.Assert.assertNotNull(list_chromosome87);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "[]" + "'", str90.equals("[]"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) 0.0f);
        boolean b11 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection18 = defaultedMap13.values();
        java.util.Set set19 = defaultedMap13.entrySet();
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        java.util.Set set6 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate11, predicate12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (short) 10, 0.0d);
        elitisticListPopulation19.setPopulationLimit(1);
        java.lang.String str22 = elitisticListPopulation19.toString();
        java.lang.Object obj23 = defaultedMap4.remove((java.lang.Object) elitisticListPopulation19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b30 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.util.Collection collection34 = defaultedMap29.values();
        defaultedMap25.putAll((java.util.Map) defaultedMap29);
        boolean b37 = defaultedMap25.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap39.putAll((java.util.Map) defaultedMap42);
        java.util.Collection collection44 = defaultedMap39.values();
        java.util.Set set45 = defaultedMap39.entrySet();
        boolean b46 = defaultedMap25.containsKey((java.lang.Object) defaultedMap39);
        java.util.Collection collection47 = defaultedMap25.values();
        java.lang.Object obj49 = defaultedMap25.remove((java.lang.Object) '#');
        java.util.Collection collection50 = defaultedMap25.values();
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection50);
        elitisticListPopulation19.setPopulationLimit((int) '#');
        math.genetics.ElitisticListPopulation elitisticListPopulation56 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome57 = elitisticListPopulation56.getChromosomes();
        elitisticListPopulation19.setChromosomes(list_chromosome57);
        java.util.List<math.genetics.Chromosome> list_chromosome59 = elitisticListPopulation19.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome60 = elitisticListPopulation19.iterator();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(list_chromosome57);
        org.junit.Assert.assertNotNull(list_chromosome59);
        org.junit.Assert.assertNotNull(iterator_chromosome60);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        double d10 = elitisticListPopulation5.getElitismRate();
        java.lang.String str11 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation5.iterator();
        java.lang.String str14 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome15);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap10.size();
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = defaultedMap10.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate17, predicate18);
        java.util.Collection collection20 = defaultedMap10.values();
        boolean b21 = defaultedMap4.containsKey((java.lang.Object) defaultedMap10);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) (short) 10, 0.0d);
        elitisticListPopulation27.setPopulationLimit(1);
        java.lang.String str30 = elitisticListPopulation27.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation27.getChromosomes();
        double d32 = elitisticListPopulation27.getElitismRate();
        java.lang.String str33 = elitisticListPopulation27.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome34 = elitisticListPopulation27.iterator();
        math.genetics.Population population35 = elitisticListPopulation27.nextGeneration();
        elitisticListPopulation27.setPopulationLimit((int) (short) 10);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap39.putAll((java.util.Map) defaultedMap42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b46 = defaultedMap45.isEmpty();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap45.putAll((java.util.Map) defaultedMap48);
        int i50 = defaultedMap48.size();
        defaultedMap42.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj55 = defaultedMap53.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b58 = defaultedMap57.isEmpty();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap57.putAll((java.util.Map) defaultedMap60);
        java.util.Collection collection62 = defaultedMap57.values();
        defaultedMap53.putAll((java.util.Map) defaultedMap57);
        boolean b65 = defaultedMap53.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b68 = defaultedMap67.isEmpty();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap67.putAll((java.util.Map) defaultedMap70);
        java.util.Collection collection72 = defaultedMap67.values();
        java.util.Set set73 = defaultedMap67.entrySet();
        boolean b74 = defaultedMap53.containsKey((java.lang.Object) defaultedMap67);
        boolean b76 = defaultedMap67.equals((java.lang.Object) '4');
        boolean b77 = defaultedMap42.containsValue((java.lang.Object) '4');
        java.lang.Object obj78 = defaultedMap10.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap42);
        boolean b79 = defaultedMap42.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 10 + "'", obj14.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short) 10 + "'", obj16.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]" + "'", str30.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertTrue(d32 == 0.0d);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[]" + "'", str33.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome34);
        org.junit.Assert.assertNotNull(population35);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b79 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, 0.0d);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0d);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap10.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap16);
        boolean b18 = defaultedMap1.isEmpty();
        java.util.Set set19 = defaultedMap1.entrySet();
        int i20 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(i20 == 1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap10.size();
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap19.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap19.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection24 = defaultedMap19.values();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        boolean b27 = defaultedMap15.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b30 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.util.Collection collection34 = defaultedMap29.values();
        java.util.Set set35 = defaultedMap29.entrySet();
        boolean b36 = defaultedMap15.containsKey((java.lang.Object) defaultedMap29);
        boolean b38 = defaultedMap29.equals((java.lang.Object) '4');
        boolean b39 = defaultedMap4.containsValue((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '4');
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationSize();
        java.lang.String str10 = elitisticListPopulation5.toString();
        double d11 = elitisticListPopulation5.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation5.spliterator();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
        org.junit.Assert.assertNotNull(population13);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) (short) 10, 0.0d);
        elitisticListPopulation16.setPopulationLimit(1);
        java.lang.String str19 = elitisticListPopulation16.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation16.getChromosomes();
        double d21 = elitisticListPopulation16.getElitismRate();
        math.genetics.Population population22 = elitisticListPopulation16.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome23);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]" + "'", str19.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue(d21 == 0.0d);
        org.junit.Assert.assertNotNull(population22);
        org.junit.Assert.assertNotNull(list_chromosome23);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.keySet();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b15 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        int i25 = defaultedMap23.size();
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap28.putAll((java.util.Map) defaultedMap31);
        int i33 = defaultedMap31.size();
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) (byte) 10);
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate38, predicate39);
        java.lang.Object obj41 = defaultedMap23.get((java.lang.Object) map40);
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b49 = defaultedMap48.isEmpty();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap48.putAll((java.util.Map) defaultedMap51);
        java.util.Collection collection53 = defaultedMap48.values();
        defaultedMap44.putAll((java.util.Map) defaultedMap48);
        boolean b56 = defaultedMap44.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap58.isEmpty();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap58.putAll((java.util.Map) defaultedMap61);
        java.util.Collection collection63 = defaultedMap58.values();
        java.util.Set set64 = defaultedMap58.entrySet();
        boolean b65 = defaultedMap44.containsKey((java.lang.Object) defaultedMap58);
        java.util.Collection collection66 = defaultedMap44.values();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate67, predicate68);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b72 = defaultedMap71.isEmpty();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap71.putAll((java.util.Map) defaultedMap74);
        int i76 = defaultedMap74.size();
        java.lang.Object obj78 = defaultedMap74.get((java.lang.Object) (byte) 10);
        java.lang.Object obj80 = defaultedMap74.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate81, predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate68, predicate81);
        collections.Transformer transformer85 = null;
        try {
            java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, transformer85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 10 + "'", obj35.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 10 + "'", obj37.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) 10 + "'", obj41.equals((short) 10));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + (short) 10 + "'", obj78.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + (short) 10 + "'", obj80.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map84);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(list_chromosome11);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, 0.0d);
        elitisticListPopulation5.setPopulationLimit(1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(list_chromosome10, (int) (short) 10, (double) (short) 0);
        int i14 = elitisticListPopulation13.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap12.isEmpty();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) predicateUtils14);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap24.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap24.putAll((java.util.Map) defaultedMap27);
        java.util.Collection collection29 = defaultedMap24.values();
        defaultedMap20.putAll((java.util.Map) defaultedMap24);
        boolean b32 = defaultedMap20.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b35 = defaultedMap34.isEmpty();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap34.putAll((java.util.Map) defaultedMap37);
        java.util.Collection collection39 = defaultedMap34.values();
        java.util.Set set40 = defaultedMap34.entrySet();
        boolean b41 = defaultedMap20.containsKey((java.lang.Object) defaultedMap34);
        java.util.Collection collection42 = defaultedMap20.values();
        java.util.Map map43 = collections.map.DefaultedMap.decorate(map18, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b46 = defaultedMap45.isEmpty();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b49 = defaultedMap48.isEmpty();
        java.lang.Object obj50 = defaultedMap45.remove((java.lang.Object) b49);
        java.util.Collection collection51 = defaultedMap45.values();
        java.util.Map map52 = collections.map.DefaultedMap.decorate(map18, (java.lang.Object) collection51);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(map52);
    }
}

