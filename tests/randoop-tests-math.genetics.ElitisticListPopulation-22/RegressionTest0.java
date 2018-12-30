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
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
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
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) (byte) 10);
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 100, 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 0, (double) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        elitisticListPopulation5.setPopulationLimit((int) (short) 10);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        try {
            elitisticListPopulation5.setElitismRate((double) (byte) 10);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation5.addChromosome(chromosome7);
        math.genetics.Population population9 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation5.addChromosome(chromosome10);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 0, (double) (short) 100);
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
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation8, obj13);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = null;
        try {
            elitisticListPopulation8.setChromosomes(list_chromosome15);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        math.genetics.Population population11 = elitisticListPopulation5.nextGeneration();
        int i12 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue(i12 == 100);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.lang.String str8 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection6 = defaultedMap5.values();
        java.util.Collection collection7 = defaultedMap5.values();
        java.util.Set set8 = defaultedMap5.entrySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, (int) (byte) 100, (double) 1.0f);
        java.lang.Object obj19 = defaultedMap5.get((java.lang.Object) 1.0f);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) -1 + "'", obj19.equals((short) -1));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "");
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Set set4 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        try {
            math.genetics.Chromosome chromosome9 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation14.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        java.lang.String str19 = elitisticListPopulation14.toString();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation25.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27);
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation14.setChromosomes(list_chromosome30);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33, (int) (byte) 100, (double) 1.0f);
        int i38 = elitisticListPopulation37.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40);
        elitisticListPopulation14.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40);
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        elitisticListPopulation49.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome51);
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation49.getChromosomes();
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome54);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome54);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation59 = new math.genetics.ElitisticListPopulation(list_chromosome54, (int) (byte) 0, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]" + "'", str19.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(list_chromosome54);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation8, obj13);
        elitisticListPopulation8.setPopulationLimit((int) (byte) 10);
        elitisticListPopulation8.setPopulationLimit((int) (short) 100);
        math.genetics.Population population19 = elitisticListPopulation8.nextGeneration();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(population19);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection12 = defaultedMap11.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection12);
        elitisticListPopulation5.setElitismRate((double) 0L);
        int i16 = elitisticListPopulation5.getPopulationSize();
        try {
            math.genetics.Chromosome chromosome17 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection12 = defaultedMap11.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection12);
        int i14 = elitisticListPopulation5.getPopulationSize();
        double d15 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation5.addChromosome(chromosome16);
        java.lang.String str18 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(d15 == 1.0d);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[null]" + "'", str18.equals("[null]"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection12 = defaultedMap11.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Collection collection6 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.lang.String str17 = elitisticListPopulation12.toString();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation12.setChromosomes(list_chromosome28);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) elitisticListPopulation12);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection33 = defaultedMap32.values();
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35, (int) (byte) 100, (double) 1.0f);
        int i40 = elitisticListPopulation39.getPopulationSize();
        math.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation39.addChromosome(chromosome41);
        math.genetics.Population population43 = elitisticListPopulation39.nextGeneration();
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap32.put((java.lang.Object) elitisticListPopulation39, obj44);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        int i47 = defaultedMap32.size();
        collections.Factory factory48 = null;
        try {
            java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, factory48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) -1 + "'", obj30.equals((short) -1));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(population43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(i47 == 1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection12 = defaultedMap11.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection12);
        double d14 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(d14 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation8, obj13);
        elitisticListPopulation8.setPopulationLimit((int) (byte) 10);
        elitisticListPopulation8.setPopulationLimit((int) (short) 100);
        try {
            math.genetics.Chromosome chromosome19 = elitisticListPopulation8.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.util.Collection collection6 = defaultedMap4.values();
        java.util.Set set7 = defaultedMap4.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        collections.Predicate predicate11 = null;
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection15 = defaultedMap14.values();
        java.lang.Object obj17 = defaultedMap14.remove((java.lang.Object) 100.0f);
        defaultedMap14.clear();
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation5.addChromosome(chromosome7);
        math.genetics.Population population9 = elitisticListPopulation5.nextGeneration();
        try {
            elitisticListPopulation5.setElitismRate(100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(population9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation5.addChromosome(chromosome7);
        try {
            elitisticListPopulation5.setElitismRate((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Set set2 = defaultedMap1.keySet();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        boolean b10 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation8);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection6 = defaultedMap5.values();
        java.util.Collection collection7 = defaultedMap5.values();
        java.util.Set set8 = defaultedMap5.entrySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        int i13 = defaultedMap5.size();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 10, (double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b11 = defaultedMap7.isEmpty();
        java.util.Collection collection12 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection15 = defaultedMap14.values();
        java.util.Collection collection16 = defaultedMap14.values();
        java.util.Set set17 = defaultedMap14.entrySet();
        java.lang.String str18 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection21 = defaultedMap20.values();
        java.util.Collection collection22 = defaultedMap20.values();
        java.util.Set set23 = defaultedMap20.entrySet();
        java.lang.String str24 = defaultedMap20.toString();
        java.lang.Object obj26 = defaultedMap14.put((java.lang.Object) defaultedMap20, (java.lang.Object) 0.0d);
        defaultedMap7.putAll((java.util.Map) defaultedMap20);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        elitisticListPopulation33.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection40 = defaultedMap39.values();
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection40);
        boolean b42 = defaultedMap20.containsKey((java.lang.Object) elitisticListPopulation33);
        defaultedMap1.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection46 = defaultedMap45.values();
        java.util.Collection collection47 = defaultedMap45.values();
        java.util.Set set48 = defaultedMap45.entrySet();
        java.lang.String str49 = defaultedMap45.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection52 = defaultedMap51.values();
        java.util.Collection collection53 = defaultedMap51.values();
        java.util.Set set54 = defaultedMap51.entrySet();
        java.lang.String str55 = defaultedMap51.toString();
        java.lang.Object obj57 = defaultedMap45.put((java.lang.Object) defaultedMap51, (java.lang.Object) 0.0d);
        int i58 = defaultedMap51.size();
        math.genetics.Chromosome[] chromosome_array59 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome60 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b61 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome60, chromosome_array59);
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome60, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        elitisticListPopulation64.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome66);
        java.lang.String str69 = elitisticListPopulation64.toString();
        math.genetics.Chromosome[] chromosome_array70 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome71 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b72 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome71, chromosome_array70);
        math.genetics.ElitisticListPopulation elitisticListPopulation75 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome71, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array76 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome77 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b78 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome77, chromosome_array76);
        elitisticListPopulation75.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome77);
        java.util.List<math.genetics.Chromosome> list_chromosome80 = elitisticListPopulation75.getChromosomes();
        elitisticListPopulation64.setChromosomes(list_chromosome80);
        java.lang.Object obj82 = defaultedMap51.get((java.lang.Object) list_chromosome80);
        defaultedMap20.putAll((java.util.Map) defaultedMap51);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertNotNull(chromosome_array59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "[]" + "'", str69.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(chromosome_array76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(list_chromosome80);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (short) -1 + "'", obj82.equals((short) -1));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        java.lang.String str11 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, 10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation8, obj13);
        java.util.Collection collection15 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        elitisticListPopulation21.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23);
        java.lang.String str26 = elitisticListPopulation21.toString();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation32.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34);
        java.util.List<math.genetics.Chromosome> list_chromosome37 = elitisticListPopulation32.getChromosomes();
        elitisticListPopulation21.setChromosomes(list_chromosome37);
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40, (int) (byte) 100, (double) 1.0f);
        int i45 = elitisticListPopulation44.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array46 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome47 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b48 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome47, chromosome_array46);
        elitisticListPopulation44.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome47);
        elitisticListPopulation21.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome47);
        java.lang.Object obj51 = defaultedMap1.get((java.lang.Object) arraylist_chromosome47);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(list_chromosome37);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(chromosome_array46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (short) -1 + "'", obj51.equals((short) -1));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Collection collection6 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.lang.String str17 = elitisticListPopulation12.toString();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation12.setChromosomes(list_chromosome28);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) elitisticListPopulation12);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection33 = defaultedMap32.values();
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35, (int) (byte) 100, (double) 1.0f);
        int i40 = elitisticListPopulation39.getPopulationSize();
        math.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation39.addChromosome(chromosome41);
        math.genetics.Population population43 = elitisticListPopulation39.nextGeneration();
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap32.put((java.lang.Object) elitisticListPopulation39, obj44);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj51 = defaultedMap48.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b52 = defaultedMap48.isEmpty();
        java.util.Collection collection53 = defaultedMap48.values();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection57 = defaultedMap56.values();
        java.util.Collection collection58 = defaultedMap56.values();
        java.util.Set set59 = defaultedMap56.entrySet();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate60, predicate61);
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate54, predicate61);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection66 = defaultedMap65.values();
        java.util.Collection collection67 = defaultedMap65.values();
        java.util.Set set68 = defaultedMap65.entrySet();
        java.lang.String str69 = defaultedMap65.toString();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection72 = defaultedMap71.values();
        java.util.Collection collection73 = defaultedMap71.values();
        java.util.Set set74 = defaultedMap71.entrySet();
        java.lang.String str75 = defaultedMap71.toString();
        java.lang.Object obj77 = defaultedMap65.put((java.lang.Object) defaultedMap71, (java.lang.Object) 0.0d);
        boolean b78 = defaultedMap71.isEmpty();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection81 = defaultedMap80.values();
        java.util.Collection collection82 = defaultedMap80.values();
        java.util.Set set83 = defaultedMap80.entrySet();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate84, predicate85);
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate(map86, predicate87, predicate88);
        collections.Predicate predicate90 = null;
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate88, predicate90);
        try {
            java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate54, predicate88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) -1 + "'", obj30.equals((short) -1));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(population43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{}" + "'", str69.equals("{}"));
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "{}" + "'", str75.equals("{}"));
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map91);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection4 = defaultedMap3.values();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) (byte) 100, (double) 1.0f);
        int i11 = elitisticListPopulation10.getPopulationSize();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation10.addChromosome(chromosome12);
        math.genetics.Population population14 = elitisticListPopulation10.nextGeneration();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap3.put((java.lang.Object) elitisticListPopulation10, obj15);
        java.lang.Object obj17 = defaultedMap1.remove(obj15);
        collections.Factory factory18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection9 = defaultedMap8.values();
        java.util.Collection collection10 = defaultedMap8.values();
        java.util.Set set11 = defaultedMap8.entrySet();
        java.lang.String str12 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection15 = defaultedMap14.values();
        java.util.Collection collection16 = defaultedMap14.values();
        java.util.Set set17 = defaultedMap14.entrySet();
        java.lang.String str18 = defaultedMap14.toString();
        java.lang.Object obj20 = defaultedMap8.put((java.lang.Object) defaultedMap14, (java.lang.Object) 0.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        elitisticListPopulation27.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection34 = defaultedMap33.values();
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection34);
        boolean b36 = defaultedMap14.containsKey((java.lang.Object) elitisticListPopulation27);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection39 = defaultedMap38.values();
        java.util.Collection collection40 = defaultedMap38.values();
        java.util.Set set41 = defaultedMap38.entrySet();
        java.lang.String str42 = defaultedMap38.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection45 = defaultedMap44.values();
        java.util.Collection collection46 = defaultedMap44.values();
        java.util.Set set47 = defaultedMap44.entrySet();
        java.lang.String str48 = defaultedMap44.toString();
        java.lang.Object obj50 = defaultedMap38.put((java.lang.Object) defaultedMap44, (java.lang.Object) 0.0d);
        int i51 = defaultedMap44.size();
        java.util.Set set52 = defaultedMap44.entrySet();
        boolean b53 = defaultedMap14.containsKey((java.lang.Object) defaultedMap44);
        collections.Factory factory54 = null;
        try {
            java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, factory54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation8, obj13);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation8.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation8.setElitismRate((double) 0.0f);
        int i19 = elitisticListPopulation8.getPopulationLimit();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertTrue(i19 == 100);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        math.genetics.Population population11 = elitisticListPopulation5.nextGeneration();
        math.genetics.Population population12 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(population12);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        elitisticListPopulation11.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection18 = defaultedMap17.values();
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection18);
        int i20 = elitisticListPopulation11.getPopulationSize();
        double d21 = elitisticListPopulation11.getElitismRate();
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation11.addChromosome(chromosome22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj28 = defaultedMap25.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b29 = defaultedMap25.isEmpty();
        java.util.Collection collection30 = defaultedMap25.values();
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        elitisticListPopulation36.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38);
        java.lang.String str41 = elitisticListPopulation36.toString();
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome43, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        elitisticListPopulation47.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome49);
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation47.getChromosomes();
        elitisticListPopulation36.setChromosomes(list_chromosome52);
        java.lang.Object obj54 = defaultedMap25.get((java.lang.Object) elitisticListPopulation36);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection57 = defaultedMap56.values();
        math.genetics.Chromosome[] chromosome_array58 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome59 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b60 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome59, chromosome_array58);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome59, (int) (byte) 100, (double) 1.0f);
        int i64 = elitisticListPopulation63.getPopulationSize();
        math.genetics.Chromosome chromosome65 = null;
        elitisticListPopulation63.addChromosome(chromosome65);
        math.genetics.Population population67 = elitisticListPopulation63.nextGeneration();
        java.lang.Object obj68 = null;
        java.lang.Object obj69 = defaultedMap56.put((java.lang.Object) elitisticListPopulation63, obj68);
        defaultedMap25.putAll((java.util.Map) defaultedMap56);
        java.util.Collection collection71 = defaultedMap56.values();
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection71);
        java.lang.Object obj73 = defaultedMap1.get((java.lang.Object) elitisticListPopulation11);
        try {
            math.genetics.Chromosome chromosome74 = elitisticListPopulation11.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(d21 == 1.0d);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "[]" + "'", str41.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(list_chromosome52);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + (short) -1 + "'", obj54.equals((short) -1));
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(chromosome_array58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(population67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + (short) -1 + "'", obj73.equals((short) -1));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        java.lang.String str10 = elitisticListPopulation5.toString();
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation16.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome21);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24, (int) (byte) 100, (double) 1.0f);
        int i29 = elitisticListPopulation28.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        try {
            elitisticListPopulation5.setElitismRate((double) '#');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Collection collection6 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.lang.String str17 = elitisticListPopulation12.toString();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation12.setChromosomes(list_chromosome28);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) elitisticListPopulation12);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection33 = defaultedMap32.values();
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35, (int) (byte) 100, (double) 1.0f);
        int i40 = elitisticListPopulation39.getPopulationSize();
        math.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation39.addChromosome(chromosome41);
        math.genetics.Population population43 = elitisticListPopulation39.nextGeneration();
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap32.put((java.lang.Object) elitisticListPopulation39, obj44);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        java.util.Collection collection47 = defaultedMap32.values();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection50 = defaultedMap49.values();
        math.genetics.Chromosome[] chromosome_array51 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome52 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b53 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52, chromosome_array51);
        math.genetics.ElitisticListPopulation elitisticListPopulation56 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome52, (int) (byte) 100, (double) 1.0f);
        int i57 = elitisticListPopulation56.getPopulationSize();
        math.genetics.Chromosome chromosome58 = null;
        elitisticListPopulation56.addChromosome(chromosome58);
        math.genetics.Population population60 = elitisticListPopulation56.nextGeneration();
        java.lang.Object obj61 = null;
        java.lang.Object obj62 = defaultedMap49.put((java.lang.Object) elitisticListPopulation56, obj61);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome63 = elitisticListPopulation56.spliterator();
        java.lang.Object obj64 = null;
        java.lang.Object obj65 = defaultedMap32.put((java.lang.Object) elitisticListPopulation56, obj64);
        math.genetics.Chromosome[] chromosome_array66 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome67 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b68 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome67, chromosome_array66);
        math.genetics.ElitisticListPopulation elitisticListPopulation71 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome67, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array72 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome73 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b74 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome73, chromosome_array72);
        elitisticListPopulation71.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome73);
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) arraylist_chromosome73);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) -1 + "'", obj30.equals((short) -1));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(population43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(chromosome_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(population60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(spliterator_chromosome63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(chromosome_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(chromosome_array72);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(map76);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "");
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation9.getChromosomes();
        boolean b15 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation9);
        boolean b16 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "");
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 1L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit(100);
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        try {
            elitisticListPopulation5.setElitismRate(100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "");
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation9.getChromosomes();
        boolean b15 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation9);
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap1.containsKey(obj16);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        java.lang.String str10 = elitisticListPopulation5.toString();
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation16.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome21);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24, (int) (byte) 100, (double) 1.0f);
        int i29 = elitisticListPopulation28.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        elitisticListPopulation40.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42);
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation40.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome45);
        double d47 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(list_chromosome45);
        org.junit.Assert.assertTrue(d47 == 1.0d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Collection collection6 = defaultedMap1.values();
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection13 = defaultedMap12.values();
        java.util.Collection collection14 = defaultedMap12.values();
        java.util.Set set15 = defaultedMap12.entrySet();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        collections.Predicate predicate19 = null;
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate16, predicate19);
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) predicate16);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation8, obj13);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation8.iterator();
        java.lang.String str16 = elitisticListPopulation8.toString();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[null]" + "'", str16.equals("[null]"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Collection collection6 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.lang.String str17 = elitisticListPopulation12.toString();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation12.setChromosomes(list_chromosome28);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) elitisticListPopulation12);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection33 = defaultedMap32.values();
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35, (int) (byte) 100, (double) 1.0f);
        int i40 = elitisticListPopulation39.getPopulationSize();
        math.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation39.addChromosome(chromosome41);
        math.genetics.Population population43 = elitisticListPopulation39.nextGeneration();
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap32.put((java.lang.Object) elitisticListPopulation39, obj44);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate47, predicate48);
        java.lang.String str50 = defaultedMap32.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) -1 + "'", obj30.equals((short) -1));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(population43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{[null]=null}" + "'", str50.equals("{[null]=null}"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Collection collection6 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.lang.String str17 = elitisticListPopulation12.toString();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation12.setChromosomes(list_chromosome28);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) elitisticListPopulation12);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b36 = defaultedMap32.isEmpty();
        java.util.Collection collection37 = defaultedMap32.values();
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        elitisticListPopulation43.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45);
        java.lang.String str48 = elitisticListPopulation43.toString();
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome50, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array55 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome56 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b57 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56, chromosome_array55);
        elitisticListPopulation54.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56);
        java.util.List<math.genetics.Chromosome> list_chromosome59 = elitisticListPopulation54.getChromosomes();
        elitisticListPopulation43.setChromosomes(list_chromosome59);
        java.lang.Object obj61 = defaultedMap32.get((java.lang.Object) elitisticListPopulation43);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection64 = defaultedMap63.values();
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        math.genetics.ElitisticListPopulation elitisticListPopulation70 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome66, (int) (byte) 100, (double) 1.0f);
        int i71 = elitisticListPopulation70.getPopulationSize();
        math.genetics.Chromosome chromosome72 = null;
        elitisticListPopulation70.addChromosome(chromosome72);
        math.genetics.Population population74 = elitisticListPopulation70.nextGeneration();
        java.lang.Object obj75 = null;
        java.lang.Object obj76 = defaultedMap63.put((java.lang.Object) elitisticListPopulation70, obj75);
        defaultedMap32.putAll((java.util.Map) defaultedMap63);
        boolean b78 = defaultedMap1.containsValue((java.lang.Object) defaultedMap63);
        java.util.Set set79 = defaultedMap1.keySet();
        collections.Factory factory80 = null;
        try {
            java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) -1 + "'", obj30.equals((short) -1));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[]" + "'", str48.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(chromosome_array55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(list_chromosome59);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (short) -1 + "'", obj61.equals((short) -1));
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertNotNull(population74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(set79);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.util.Collection collection6 = defaultedMap4.values();
        java.util.Set set7 = defaultedMap4.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        collections.Predicate predicate11 = null;
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection15 = defaultedMap14.values();
        java.util.Collection collection16 = defaultedMap14.values();
        java.util.Set set17 = defaultedMap14.entrySet();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate18, predicate19);
        boolean b21 = defaultedMap14.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.util.Collection collection9 = defaultedMap7.values();
        java.util.Set set10 = defaultedMap7.entrySet();
        java.lang.String str11 = defaultedMap7.toString();
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) 0.0d);
        int i14 = defaultedMap7.size();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        elitisticListPopulation20.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22);
        java.lang.String str25 = elitisticListPopulation20.toString();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        elitisticListPopulation31.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33);
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation20.setChromosomes(list_chromosome36);
        java.lang.Object obj38 = defaultedMap7.get((java.lang.Object) list_chromosome36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection41 = defaultedMap40.values();
        java.util.Collection collection42 = defaultedMap40.values();
        java.util.Set set43 = defaultedMap40.entrySet();
        java.lang.String str44 = defaultedMap40.toString();
        java.util.Collection collection45 = defaultedMap40.values();
        java.util.Set set46 = defaultedMap40.entrySet();
        java.lang.Object obj47 = defaultedMap7.remove((java.lang.Object) set46);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) -1 + "'", obj38.equals((short) -1));
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.lang.String str8 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[null]" + "'", str8.equals("[null]"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation8, obj13);
        boolean b16 = defaultedMap1.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection22 = defaultedMap21.values();
        java.util.Collection collection23 = defaultedMap21.values();
        java.util.Set set24 = defaultedMap21.entrySet();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        collections.Predicate predicate28 = null;
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate25, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b35 = defaultedMap31.isEmpty();
        java.util.Collection collection36 = defaultedMap31.values();
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array43 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome44 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44, chromosome_array43);
        elitisticListPopulation42.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome44);
        java.lang.String str47 = elitisticListPopulation42.toString();
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome49, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array54 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome55 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55, chromosome_array54);
        elitisticListPopulation53.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome55);
        java.util.List<math.genetics.Chromosome> list_chromosome58 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation42.setChromosomes(list_chromosome58);
        java.lang.Object obj60 = defaultedMap31.get((java.lang.Object) elitisticListPopulation42);
        boolean b62 = defaultedMap31.containsValue((java.lang.Object) 10.0f);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj68 = defaultedMap65.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b69 = defaultedMap65.isEmpty();
        java.util.Collection collection70 = defaultedMap65.values();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection74 = defaultedMap73.values();
        java.util.Collection collection75 = defaultedMap73.values();
        java.util.Set set76 = defaultedMap73.entrySet();
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate77, predicate78);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate71, predicate78);
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate63, predicate78);
        try {
            java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate28, predicate63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(chromosome_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "[]" + "'", str47.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(chromosome_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(list_chromosome58);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (short) -1 + "'", obj60.equals((short) -1));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.util.Collection collection9 = defaultedMap7.values();
        java.util.Set set10 = defaultedMap7.entrySet();
        java.lang.String str11 = defaultedMap7.toString();
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection16 = defaultedMap15.values();
        java.util.Collection collection17 = defaultedMap15.values();
        java.util.Set set18 = defaultedMap15.entrySet();
        java.lang.String str19 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection22 = defaultedMap21.values();
        java.util.Collection collection23 = defaultedMap21.values();
        java.util.Set set24 = defaultedMap21.entrySet();
        java.lang.String str25 = defaultedMap21.toString();
        java.lang.Object obj27 = defaultedMap15.put((java.lang.Object) defaultedMap21, (java.lang.Object) 0.0d);
        boolean b28 = defaultedMap21.isEmpty();
        defaultedMap21.clear();
        boolean b30 = defaultedMap1.containsKey((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) (byte) 100, (double) 1.0f);
        int i8 = elitisticListPopulation7.getPopulationSize();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation7.addChromosome(chromosome9);
        math.genetics.Population population11 = elitisticListPopulation7.nextGeneration();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation7.addChromosome(chromosome12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (byte) 100, (double) 1.0f);
        int i20 = elitisticListPopulation19.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22);
        elitisticListPopulation7.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) arraylist_chromosome22);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection29 = defaultedMap28.values();
        java.util.Collection collection30 = defaultedMap28.values();
        java.util.Set set31 = defaultedMap28.entrySet();
        java.lang.String str32 = defaultedMap28.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection35 = defaultedMap34.values();
        java.util.Collection collection36 = defaultedMap34.values();
        java.util.Set set37 = defaultedMap34.entrySet();
        java.lang.String str38 = defaultedMap34.toString();
        java.lang.Object obj40 = defaultedMap28.put((java.lang.Object) defaultedMap34, (java.lang.Object) 0.0d);
        int i41 = defaultedMap34.size();
        java.lang.Object obj42 = defaultedMap1.get((java.lang.Object) i41);
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) -1 + "'", obj26.equals((short) -1));
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) -1 + "'", obj42.equals((short) -1));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "");
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation9.getChromosomes();
        boolean b15 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation9);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = elitisticListPopulation9.spliterator();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation9);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.util.Collection collection12 = defaultedMap10.values();
        java.util.Set set13 = defaultedMap10.entrySet();
        java.lang.String str14 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection17 = defaultedMap16.values();
        java.util.Collection collection18 = defaultedMap16.values();
        java.util.Set set19 = defaultedMap16.entrySet();
        java.lang.String str20 = defaultedMap16.toString();
        java.lang.Object obj22 = defaultedMap10.put((java.lang.Object) defaultedMap16, (java.lang.Object) 0.0d);
        boolean b23 = defaultedMap16.isEmpty();
        defaultedMap16.clear();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap16);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection4 = defaultedMap3.values();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) (byte) 100, (double) 1.0f);
        int i11 = elitisticListPopulation10.getPopulationSize();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation10.addChromosome(chromosome12);
        math.genetics.Population population14 = elitisticListPopulation10.nextGeneration();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap3.put((java.lang.Object) elitisticListPopulation10, obj15);
        java.util.Collection collection17 = defaultedMap3.values();
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) collection17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b24 = defaultedMap20.isEmpty();
        java.util.Collection collection25 = defaultedMap20.values();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        elitisticListPopulation31.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33);
        java.lang.String str36 = elitisticListPopulation31.toString();
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array43 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome44 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44, chromosome_array43);
        elitisticListPopulation42.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome44);
        java.util.List<math.genetics.Chromosome> list_chromosome47 = elitisticListPopulation42.getChromosomes();
        elitisticListPopulation31.setChromosomes(list_chromosome47);
        java.lang.Object obj49 = defaultedMap20.get((java.lang.Object) elitisticListPopulation31);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection52 = defaultedMap51.values();
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54, (int) (byte) 100, (double) 1.0f);
        int i59 = elitisticListPopulation58.getPopulationSize();
        math.genetics.Chromosome chromosome60 = null;
        elitisticListPopulation58.addChromosome(chromosome60);
        math.genetics.Population population62 = elitisticListPopulation58.nextGeneration();
        java.lang.Object obj63 = null;
        java.lang.Object obj64 = defaultedMap51.put((java.lang.Object) elitisticListPopulation58, obj63);
        defaultedMap20.putAll((java.util.Map) defaultedMap51);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate66, predicate67);
        defaultedMap1.putAll(map68);
        collections.Transformer transformer70 = null;
        try {
            java.util.Map map71 = collections.map.DefaultedMap.decorate(map68, transformer70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]" + "'", str36.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(chromosome_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(list_chromosome47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (short) -1 + "'", obj49.equals((short) -1));
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNotNull(population62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Population population9 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        elitisticListPopulation15.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17);
        java.lang.String str20 = elitisticListPopulation15.toString();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation26.getChromosomes();
        elitisticListPopulation15.setChromosomes(list_chromosome31);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, (int) (byte) 100, (double) 1.0f);
        int i39 = elitisticListPopulation38.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        elitisticListPopulation38.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41);
        elitisticListPopulation15.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome41);
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array51 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome52 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b53 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52, chromosome_array51);
        elitisticListPopulation50.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome52);
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation50.getChromosomes();
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome55);
        elitisticListPopulation5.setChromosomes(list_chromosome55);
        double d58 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(chromosome_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertTrue(d58 == 1.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b12 = defaultedMap8.isEmpty();
        java.util.Collection collection13 = defaultedMap8.values();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        java.lang.String str24 = elitisticListPopulation19.toString();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        elitisticListPopulation30.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32);
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation30.getChromosomes();
        elitisticListPopulation19.setChromosomes(list_chromosome35);
        java.lang.Object obj37 = defaultedMap8.get((java.lang.Object) elitisticListPopulation19);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection40 = defaultedMap39.values();
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) (byte) 100, (double) 1.0f);
        int i47 = elitisticListPopulation46.getPopulationSize();
        math.genetics.Chromosome chromosome48 = null;
        elitisticListPopulation46.addChromosome(chromosome48);
        math.genetics.Population population50 = elitisticListPopulation46.nextGeneration();
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = defaultedMap39.put((java.lang.Object) elitisticListPopulation46, obj51);
        defaultedMap8.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj58 = defaultedMap55.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b59 = defaultedMap55.isEmpty();
        java.util.Collection collection60 = defaultedMap55.values();
        math.genetics.Chromosome[] chromosome_array61 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome62 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b63 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome62, chromosome_array61);
        math.genetics.ElitisticListPopulation elitisticListPopulation66 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome62, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array67 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome68 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b69 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome68, chromosome_array67);
        elitisticListPopulation66.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome68);
        java.lang.String str71 = elitisticListPopulation66.toString();
        math.genetics.Chromosome[] chromosome_array72 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome73 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b74 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome73, chromosome_array72);
        math.genetics.ElitisticListPopulation elitisticListPopulation77 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome73, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array78 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome79 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b80 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome79, chromosome_array78);
        elitisticListPopulation77.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome79);
        java.util.List<math.genetics.Chromosome> list_chromosome82 = elitisticListPopulation77.getChromosomes();
        elitisticListPopulation66.setChromosomes(list_chromosome82);
        java.lang.Object obj84 = defaultedMap55.get((java.lang.Object) elitisticListPopulation66);
        boolean b86 = defaultedMap55.containsValue((java.lang.Object) 10.0f);
        java.lang.Object obj87 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) b86);
        java.util.Collection collection88 = defaultedMap8.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) -1 + "'", obj37.equals((short) -1));
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(population50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(chromosome_array61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(chromosome_array67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "[]" + "'", str71.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array72);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(chromosome_array78);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(list_chromosome82);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + (short) -1 + "'", obj84.equals((short) -1));
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(collection88);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        java.lang.String str10 = elitisticListPopulation5.toString();
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation16.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome21);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24, (int) (byte) 100, (double) 1.0f);
        int i29 = elitisticListPopulation28.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        elitisticListPopulation40.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42);
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation40.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome45);
        elitisticListPopulation5.setElitismRate(0.0d);
        int i49 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(list_chromosome45);
        org.junit.Assert.assertTrue(i49 == 100);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation8, obj13);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome15 = elitisticListPopulation8.spliterator();
        elitisticListPopulation8.setPopulationLimit((int) (short) 100);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(spliterator_chromosome15);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 1L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Collection collection6 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.lang.String str17 = elitisticListPopulation12.toString();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation12.setChromosomes(list_chromosome28);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) elitisticListPopulation12);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b36 = defaultedMap32.isEmpty();
        java.util.Collection collection37 = defaultedMap32.values();
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        elitisticListPopulation43.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45);
        java.lang.String str48 = elitisticListPopulation43.toString();
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome50, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array55 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome56 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b57 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56, chromosome_array55);
        elitisticListPopulation54.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56);
        java.util.List<math.genetics.Chromosome> list_chromosome59 = elitisticListPopulation54.getChromosomes();
        elitisticListPopulation43.setChromosomes(list_chromosome59);
        java.lang.Object obj61 = defaultedMap32.get((java.lang.Object) elitisticListPopulation43);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection64 = defaultedMap63.values();
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        math.genetics.ElitisticListPopulation elitisticListPopulation70 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome66, (int) (byte) 100, (double) 1.0f);
        int i71 = elitisticListPopulation70.getPopulationSize();
        math.genetics.Chromosome chromosome72 = null;
        elitisticListPopulation70.addChromosome(chromosome72);
        math.genetics.Population population74 = elitisticListPopulation70.nextGeneration();
        java.lang.Object obj75 = null;
        java.lang.Object obj76 = defaultedMap63.put((java.lang.Object) elitisticListPopulation70, obj75);
        defaultedMap32.putAll((java.util.Map) defaultedMap63);
        boolean b78 = defaultedMap1.containsValue((java.lang.Object) defaultedMap63);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection81 = defaultedMap80.values();
        java.util.Collection collection82 = defaultedMap80.values();
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection85 = defaultedMap84.values();
        java.util.Collection collection86 = defaultedMap84.values();
        java.util.Set set87 = defaultedMap84.entrySet();
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate88, predicate89);
        defaultedMap80.putAll((java.util.Map) defaultedMap84);
        boolean b93 = defaultedMap84.containsValue((java.lang.Object) (-1));
        java.util.Collection collection94 = defaultedMap84.values();
        java.lang.Object obj95 = defaultedMap63.get((java.lang.Object) defaultedMap84);
        int i96 = defaultedMap84.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) -1 + "'", obj30.equals((short) -1));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[]" + "'", str48.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(chromosome_array55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(list_chromosome59);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (short) -1 + "'", obj61.equals((short) -1));
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertNotNull(population74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertNotNull(collection94);
        org.junit.Assert.assertTrue("'" + obj95 + "' != '" + (short) -1 + "'", obj95.equals((short) -1));
        org.junit.Assert.assertTrue(i96 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection6 = defaultedMap5.values();
        java.util.Collection collection7 = defaultedMap5.values();
        java.util.Set set8 = defaultedMap5.entrySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection15 = defaultedMap14.values();
        java.util.Collection collection16 = defaultedMap14.values();
        java.util.Set set17 = defaultedMap14.entrySet();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate18, predicate19);
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.util.Collection collection9 = defaultedMap7.values();
        java.util.Set set10 = defaultedMap7.entrySet();
        java.lang.String str11 = defaultedMap7.toString();
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection16 = defaultedMap15.values();
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18, (int) (byte) 100, (double) 1.0f);
        int i23 = elitisticListPopulation22.getPopulationSize();
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation22.addChromosome(chromosome24);
        math.genetics.Population population26 = elitisticListPopulation22.nextGeneration();
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap15.put((java.lang.Object) elitisticListPopulation22, obj27);
        boolean b30 = defaultedMap15.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection33 = defaultedMap32.values();
        java.util.Collection collection34 = defaultedMap32.values();
        java.lang.Object obj35 = defaultedMap15.remove((java.lang.Object) collection34);
        java.lang.Object obj36 = defaultedMap1.get(obj35);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(population26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) -1 + "'", obj36.equals((short) -1));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection6 = defaultedMap5.values();
        java.util.Collection collection7 = defaultedMap5.values();
        java.util.Set set8 = defaultedMap5.entrySet();
        java.lang.String str9 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection12 = defaultedMap11.values();
        java.util.Collection collection13 = defaultedMap11.values();
        java.util.Set set14 = defaultedMap11.entrySet();
        java.lang.String str15 = defaultedMap11.toString();
        java.lang.Object obj17 = defaultedMap5.put((java.lang.Object) defaultedMap11, (java.lang.Object) 0.0d);
        int i18 = defaultedMap11.size();
        java.util.Set set19 = defaultedMap11.entrySet();
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) set19);
        java.util.Collection collection21 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation8, obj13);
        java.util.Collection collection15 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection19 = defaultedMap18.values();
        java.util.Collection collection20 = defaultedMap18.values();
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.String str22 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection25 = defaultedMap24.values();
        java.util.Collection collection26 = defaultedMap24.values();
        java.util.Set set27 = defaultedMap24.entrySet();
        java.lang.String str28 = defaultedMap24.toString();
        java.lang.Object obj30 = defaultedMap18.put((java.lang.Object) defaultedMap24, (java.lang.Object) 0.0d);
        int i31 = defaultedMap24.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection35 = defaultedMap34.values();
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37, (int) (byte) 100, (double) 1.0f);
        int i42 = elitisticListPopulation41.getPopulationSize();
        math.genetics.Chromosome chromosome43 = null;
        elitisticListPopulation41.addChromosome(chromosome43);
        math.genetics.Population population45 = elitisticListPopulation41.nextGeneration();
        java.lang.Object obj46 = null;
        java.lang.Object obj47 = defaultedMap34.put((java.lang.Object) elitisticListPopulation41, obj46);
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation41.getChromosomes();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation41);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(population45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(list_chromosome48);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation8, obj13);
        boolean b16 = defaultedMap1.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        java.util.Set set18 = defaultedMap17.entrySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection10 = defaultedMap9.values();
        java.util.Collection collection11 = defaultedMap9.values();
        java.util.Set set12 = defaultedMap9.entrySet();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate13, predicate14);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate14);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Collection collection6 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.lang.String str17 = elitisticListPopulation12.toString();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation12.setChromosomes(list_chromosome28);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) elitisticListPopulation12);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection33 = defaultedMap32.values();
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35, (int) (byte) 100, (double) 1.0f);
        int i40 = elitisticListPopulation39.getPopulationSize();
        math.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation39.addChromosome(chromosome41);
        math.genetics.Population population43 = elitisticListPopulation39.nextGeneration();
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap32.put((java.lang.Object) elitisticListPopulation39, obj44);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        java.util.Map map47 = null;
        try {
            defaultedMap32.putAll(map47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) -1 + "'", obj30.equals((short) -1));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(population43);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        int i11 = elitisticListPopulation5.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(100, (double) 1L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation14.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome16);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection4 = defaultedMap3.values();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) (byte) 100, (double) 1.0f);
        int i11 = elitisticListPopulation10.getPopulationSize();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation10.addChromosome(chromosome12);
        math.genetics.Population population14 = elitisticListPopulation10.nextGeneration();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap3.put((java.lang.Object) elitisticListPopulation10, obj15);
        java.util.Collection collection17 = defaultedMap3.values();
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) collection17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection21 = defaultedMap20.values();
        java.util.Collection collection22 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection25 = defaultedMap24.values();
        java.util.Collection collection26 = defaultedMap24.values();
        java.util.Set set27 = defaultedMap24.entrySet();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate28, predicate29);
        defaultedMap20.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) -1 + "'", obj32.equals((short) -1));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Collection collection6 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.lang.String str17 = elitisticListPopulation12.toString();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation12.setChromosomes(list_chromosome28);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) elitisticListPopulation12);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection33 = defaultedMap32.values();
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35, (int) (byte) 100, (double) 1.0f);
        int i40 = elitisticListPopulation39.getPopulationSize();
        math.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation39.addChromosome(chromosome41);
        math.genetics.Population population43 = elitisticListPopulation39.nextGeneration();
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap32.put((java.lang.Object) elitisticListPopulation39, obj44);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        java.util.Collection collection47 = defaultedMap32.values();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection50 = defaultedMap49.values();
        math.genetics.Chromosome[] chromosome_array51 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome52 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b53 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52, chromosome_array51);
        math.genetics.ElitisticListPopulation elitisticListPopulation56 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome52, (int) (byte) 100, (double) 1.0f);
        int i57 = elitisticListPopulation56.getPopulationSize();
        math.genetics.Chromosome chromosome58 = null;
        elitisticListPopulation56.addChromosome(chromosome58);
        math.genetics.Population population60 = elitisticListPopulation56.nextGeneration();
        java.lang.Object obj61 = null;
        java.lang.Object obj62 = defaultedMap49.put((java.lang.Object) elitisticListPopulation56, obj61);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome63 = elitisticListPopulation56.spliterator();
        java.lang.Object obj64 = null;
        java.lang.Object obj65 = defaultedMap32.put((java.lang.Object) elitisticListPopulation56, obj64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        math.genetics.Chromosome[] chromosome_array68 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome69 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b70 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome69, chromosome_array68);
        math.genetics.ElitisticListPopulation elitisticListPopulation73 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome69, (int) (byte) 100, (double) 1.0f);
        int i74 = elitisticListPopulation73.getPopulationSize();
        math.genetics.Chromosome chromosome75 = null;
        elitisticListPopulation73.addChromosome(chromosome75);
        math.genetics.Population population77 = elitisticListPopulation73.nextGeneration();
        math.genetics.Chromosome chromosome78 = null;
        elitisticListPopulation73.addChromosome(chromosome78);
        math.genetics.Chromosome[] chromosome_array80 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome81 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b82 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome81, chromosome_array80);
        math.genetics.ElitisticListPopulation elitisticListPopulation85 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome81, (int) (byte) 100, (double) 1.0f);
        int i86 = elitisticListPopulation85.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array87 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome88 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b89 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome88, chromosome_array87);
        elitisticListPopulation85.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome88);
        elitisticListPopulation73.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome88);
        java.lang.Object obj92 = defaultedMap67.get((java.lang.Object) arraylist_chromosome88);
        elitisticListPopulation56.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome88);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) -1 + "'", obj30.equals((short) -1));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(population43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(chromosome_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(population60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(spliterator_chromosome63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(chromosome_array68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertNotNull(population77);
        org.junit.Assert.assertNotNull(chromosome_array80);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertNotNull(chromosome_array87);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + (short) -1 + "'", obj92.equals((short) -1));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 0, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 100);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Collection collection6 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.lang.String str17 = elitisticListPopulation12.toString();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation12.setChromosomes(list_chromosome28);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) elitisticListPopulation12);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection33 = defaultedMap32.values();
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35, (int) (byte) 100, (double) 1.0f);
        int i40 = elitisticListPopulation39.getPopulationSize();
        math.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation39.addChromosome(chromosome41);
        math.genetics.Population population43 = elitisticListPopulation39.nextGeneration();
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap32.put((java.lang.Object) elitisticListPopulation39, obj44);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, (int) (byte) 100, (double) 1.0f);
        int i53 = elitisticListPopulation52.getPopulationSize();
        java.lang.String str54 = elitisticListPopulation52.toString();
        boolean b55 = defaultedMap32.containsKey((java.lang.Object) elitisticListPopulation52);
        int i56 = elitisticListPopulation52.getPopulationSize();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) -1 + "'", obj30.equals((short) -1));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(population43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "[]" + "'", str54.equals("[]"));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i56 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        elitisticListPopulation11.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13);
        java.lang.String str16 = elitisticListPopulation11.toString();
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        elitisticListPopulation22.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome27);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) (byte) 100, (double) 1.0f);
        int i35 = elitisticListPopulation34.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        elitisticListPopulation34.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37);
        elitisticListPopulation11.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        elitisticListPopulation46.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        java.util.List<math.genetics.Chromosome> list_chromosome51 = elitisticListPopulation46.getChromosomes();
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome51);
        java.lang.Object obj53 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation11);
        math.genetics.Chromosome[] chromosome_array54 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome55 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55, chromosome_array54);
        math.genetics.ElitisticListPopulation elitisticListPopulation59 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome55, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array60 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome61 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61, chromosome_array60);
        elitisticListPopulation59.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome61);
        elitisticListPopulation11.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome61);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(list_chromosome51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(chromosome_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(chromosome_array60);
        org.junit.Assert.assertTrue(b62 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation8, obj13);
        boolean b16 = defaultedMap1.equals((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection19 = defaultedMap18.values();
        java.util.Collection collection20 = defaultedMap18.values();
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) collection20);
        defaultedMap1.clear();
        collections.Factory factory23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Collection collection6 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.lang.String str17 = elitisticListPopulation12.toString();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation12.setChromosomes(list_chromosome28);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) elitisticListPopulation12);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b36 = defaultedMap32.isEmpty();
        java.util.Collection collection37 = defaultedMap32.values();
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        elitisticListPopulation43.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45);
        java.lang.String str48 = elitisticListPopulation43.toString();
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome50, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array55 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome56 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b57 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56, chromosome_array55);
        elitisticListPopulation54.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56);
        java.util.List<math.genetics.Chromosome> list_chromosome59 = elitisticListPopulation54.getChromosomes();
        elitisticListPopulation43.setChromosomes(list_chromosome59);
        java.lang.Object obj61 = defaultedMap32.get((java.lang.Object) elitisticListPopulation43);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection64 = defaultedMap63.values();
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        math.genetics.ElitisticListPopulation elitisticListPopulation70 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome66, (int) (byte) 100, (double) 1.0f);
        int i71 = elitisticListPopulation70.getPopulationSize();
        math.genetics.Chromosome chromosome72 = null;
        elitisticListPopulation70.addChromosome(chromosome72);
        math.genetics.Population population74 = elitisticListPopulation70.nextGeneration();
        java.lang.Object obj75 = null;
        java.lang.Object obj76 = defaultedMap63.put((java.lang.Object) elitisticListPopulation70, obj75);
        defaultedMap32.putAll((java.util.Map) defaultedMap63);
        boolean b78 = defaultedMap1.containsValue((java.lang.Object) defaultedMap63);
        java.util.Set set79 = defaultedMap1.keySet();
        math.genetics.Chromosome[] chromosome_array80 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome81 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b82 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome81, chromosome_array80);
        math.genetics.ElitisticListPopulation elitisticListPopulation85 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome81, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array86 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome87 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b88 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome87, chromosome_array86);
        elitisticListPopulation85.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome87);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection92 = defaultedMap91.values();
        elitisticListPopulation85.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection92);
        int i94 = elitisticListPopulation85.getPopulationSize();
        collections.map.DefaultedMap defaultedMap96 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj97 = defaultedMap1.put((java.lang.Object) i94, (java.lang.Object) (short) -1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) -1 + "'", obj30.equals((short) -1));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[]" + "'", str48.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(chromosome_array55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(list_chromosome59);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (short) -1 + "'", obj61.equals((short) -1));
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertNotNull(population74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNotNull(chromosome_array80);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(chromosome_array86);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertTrue(i94 == 0);
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection4 = defaultedMap3.values();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) (byte) 100, (double) 1.0f);
        int i11 = elitisticListPopulation10.getPopulationSize();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation10.addChromosome(chromosome12);
        math.genetics.Population population14 = elitisticListPopulation10.nextGeneration();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap3.put((java.lang.Object) elitisticListPopulation10, obj15);
        java.lang.Object obj17 = defaultedMap1.remove(obj15);
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 100, (double) 1.0f);
        int i24 = elitisticListPopulation23.getPopulationSize();
        double d25 = elitisticListPopulation23.getElitismRate();
        boolean b26 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation23);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(d25 == 1.0d);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation8, obj13);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome15 = elitisticListPopulation8.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = elitisticListPopulation8.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome17 = elitisticListPopulation8.spliterator();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation8.addChromosome(chromosome18);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(spliterator_chromosome15);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
        org.junit.Assert.assertNotNull(spliterator_chromosome17);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Collection collection6 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.lang.String str17 = elitisticListPopulation12.toString();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation12.setChromosomes(list_chromosome28);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) elitisticListPopulation12);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection33 = defaultedMap32.values();
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35, (int) (byte) 100, (double) 1.0f);
        int i40 = elitisticListPopulation39.getPopulationSize();
        math.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation39.addChromosome(chromosome41);
        math.genetics.Population population43 = elitisticListPopulation39.nextGeneration();
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap32.put((java.lang.Object) elitisticListPopulation39, obj44);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection50 = defaultedMap49.values();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection54 = defaultedMap53.values();
        java.util.Collection collection55 = defaultedMap53.values();
        java.util.Set set56 = defaultedMap53.entrySet();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate57, predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate(map59, predicate60, predicate61);
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate51, predicate61);
        try {
            java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate47, predicate51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) -1 + "'", obj30.equals((short) -1));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(population43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation8, obj13);
        java.util.Collection collection15 = defaultedMap1.values();
        java.lang.String str16 = defaultedMap1.toString();
        java.lang.String str17 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) "");
        java.util.Collection collection22 = defaultedMap19.values();
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation28.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection35 = defaultedMap34.values();
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection35);
        int i37 = elitisticListPopulation28.getPopulationSize();
        double d38 = elitisticListPopulation28.getElitismRate();
        math.genetics.Population population39 = elitisticListPopulation28.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome40 = elitisticListPopulation28.iterator();
        java.lang.Object obj41 = defaultedMap19.remove((java.lang.Object) elitisticListPopulation28);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{[null]=null}" + "'", str16.equals("{[null]=null}"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{[null]=null}" + "'", str17.equals("{[null]=null}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(d38 == 1.0d);
        org.junit.Assert.assertNotNull(population39);
        org.junit.Assert.assertNotNull(iterator_chromosome40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        int i11 = elitisticListPopulation5.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(100, (double) 1L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation14.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome16);
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection30 = defaultedMap29.values();
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection30);
        elitisticListPopulation23.setElitismRate((double) 0L);
        elitisticListPopulation23.setElitismRate(0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome36);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(list_chromosome36);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection24 = defaultedMap23.values();
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection24);
        int i26 = elitisticListPopulation17.getPopulationSize();
        double d27 = elitisticListPopulation17.getElitismRate();
        math.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation17.addChromosome(chromosome28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b35 = defaultedMap31.isEmpty();
        java.util.Collection collection36 = defaultedMap31.values();
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array43 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome44 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44, chromosome_array43);
        elitisticListPopulation42.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome44);
        java.lang.String str47 = elitisticListPopulation42.toString();
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome49, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array54 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome55 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55, chromosome_array54);
        elitisticListPopulation53.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome55);
        java.util.List<math.genetics.Chromosome> list_chromosome58 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation42.setChromosomes(list_chromosome58);
        java.lang.Object obj60 = defaultedMap31.get((java.lang.Object) elitisticListPopulation42);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection63 = defaultedMap62.values();
        math.genetics.Chromosome[] chromosome_array64 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome65 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b66 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65, chromosome_array64);
        math.genetics.ElitisticListPopulation elitisticListPopulation69 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome65, (int) (byte) 100, (double) 1.0f);
        int i70 = elitisticListPopulation69.getPopulationSize();
        math.genetics.Chromosome chromosome71 = null;
        elitisticListPopulation69.addChromosome(chromosome71);
        math.genetics.Population population73 = elitisticListPopulation69.nextGeneration();
        java.lang.Object obj74 = null;
        java.lang.Object obj75 = defaultedMap62.put((java.lang.Object) elitisticListPopulation69, obj74);
        defaultedMap31.putAll((java.util.Map) defaultedMap62);
        java.util.Collection collection77 = defaultedMap62.values();
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection77);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection77);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(d27 == 1.0d);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(chromosome_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "[]" + "'", str47.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(chromosome_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(list_chromosome58);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (short) -1 + "'", obj60.equals((short) -1));
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(chromosome_array64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertNotNull(population73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(collection77);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection9 = defaultedMap8.values();
        java.util.Collection collection10 = defaultedMap8.values();
        java.util.Set set11 = defaultedMap8.entrySet();
        java.lang.String str12 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection15 = defaultedMap14.values();
        java.util.Collection collection16 = defaultedMap14.values();
        java.util.Set set17 = defaultedMap14.entrySet();
        java.lang.String str18 = defaultedMap14.toString();
        java.lang.Object obj20 = defaultedMap8.put((java.lang.Object) defaultedMap14, (java.lang.Object) 0.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        elitisticListPopulation27.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection34 = defaultedMap33.values();
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection34);
        boolean b36 = defaultedMap14.containsKey((java.lang.Object) elitisticListPopulation27);
        defaultedMap14.clear();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b12 = defaultedMap8.isEmpty();
        java.util.Collection collection13 = defaultedMap8.values();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        java.lang.String str24 = elitisticListPopulation19.toString();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        elitisticListPopulation30.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32);
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation30.getChromosomes();
        elitisticListPopulation19.setChromosomes(list_chromosome35);
        java.lang.Object obj37 = defaultedMap8.get((java.lang.Object) elitisticListPopulation19);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection40 = defaultedMap39.values();
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) (byte) 100, (double) 1.0f);
        int i47 = elitisticListPopulation46.getPopulationSize();
        math.genetics.Chromosome chromosome48 = null;
        elitisticListPopulation46.addChromosome(chromosome48);
        math.genetics.Population population50 = elitisticListPopulation46.nextGeneration();
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = defaultedMap39.put((java.lang.Object) elitisticListPopulation46, obj51);
        defaultedMap8.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj58 = defaultedMap55.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b59 = defaultedMap55.isEmpty();
        java.util.Collection collection60 = defaultedMap55.values();
        math.genetics.Chromosome[] chromosome_array61 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome62 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b63 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome62, chromosome_array61);
        math.genetics.ElitisticListPopulation elitisticListPopulation66 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome62, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array67 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome68 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b69 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome68, chromosome_array67);
        elitisticListPopulation66.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome68);
        java.lang.String str71 = elitisticListPopulation66.toString();
        math.genetics.Chromosome[] chromosome_array72 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome73 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b74 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome73, chromosome_array72);
        math.genetics.ElitisticListPopulation elitisticListPopulation77 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome73, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array78 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome79 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b80 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome79, chromosome_array78);
        elitisticListPopulation77.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome79);
        java.util.List<math.genetics.Chromosome> list_chromosome82 = elitisticListPopulation77.getChromosomes();
        elitisticListPopulation66.setChromosomes(list_chromosome82);
        java.lang.Object obj84 = defaultedMap55.get((java.lang.Object) elitisticListPopulation66);
        boolean b86 = defaultedMap55.containsValue((java.lang.Object) 10.0f);
        java.lang.Object obj87 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) b86);
        boolean b89 = defaultedMap8.containsKey((java.lang.Object) '4');
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) -1 + "'", obj37.equals((short) -1));
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(population50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(chromosome_array61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(chromosome_array67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "[]" + "'", str71.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array72);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(chromosome_array78);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(list_chromosome82);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + (short) -1 + "'", obj84.equals((short) -1));
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue(b89 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation8, obj13);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome15 = elitisticListPopulation8.spliterator();
        int i16 = elitisticListPopulation8.getPopulationSize();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(spliterator_chromosome15);
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Collection collection6 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.lang.String str17 = elitisticListPopulation12.toString();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation12.setChromosomes(list_chromosome28);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) elitisticListPopulation12);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection33 = defaultedMap32.values();
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35, (int) (byte) 100, (double) 1.0f);
        int i40 = elitisticListPopulation39.getPopulationSize();
        math.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation39.addChromosome(chromosome41);
        math.genetics.Population population43 = elitisticListPopulation39.nextGeneration();
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap32.put((java.lang.Object) elitisticListPopulation39, obj44);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, (int) (byte) 100, (double) 1.0f);
        int i53 = elitisticListPopulation52.getPopulationSize();
        java.lang.String str54 = elitisticListPopulation52.toString();
        boolean b55 = defaultedMap32.containsKey((java.lang.Object) elitisticListPopulation52);
        java.lang.Object obj56 = null;
        java.lang.Object obj57 = defaultedMap32.remove(obj56);
        collections.Factory factory58 = null;
        try {
            java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, factory58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) -1 + "'", obj30.equals((short) -1));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(population43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "[]" + "'", str54.equals("[]"));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 1L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        math.genetics.Population population11 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation5.addChromosome(chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(population11);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection12 = defaultedMap11.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection12);
        int i14 = elitisticListPopulation5.getPopulationSize();
        double d15 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population16 = elitisticListPopulation5.nextGeneration();
        double d17 = elitisticListPopulation5.getElitismRate();
        int i18 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(d15 == 1.0d);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertTrue(d17 == 1.0d);
        org.junit.Assert.assertTrue(i18 == 100);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        elitisticListPopulation11.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13);
        java.lang.String str16 = elitisticListPopulation11.toString();
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        elitisticListPopulation22.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome27);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) (byte) 100, (double) 1.0f);
        int i35 = elitisticListPopulation34.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        elitisticListPopulation34.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37);
        elitisticListPopulation11.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        elitisticListPopulation46.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        java.util.List<math.genetics.Chromosome> list_chromosome51 = elitisticListPopulation46.getChromosomes();
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome51);
        java.lang.Object obj53 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation11);
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation11.getChromosomes();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(list_chromosome51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(list_chromosome54);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.containsKey(obj3);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection10 = defaultedMap9.values();
        java.util.Collection collection11 = defaultedMap9.values();
        java.util.Set set12 = defaultedMap9.entrySet();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate13, predicate14);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate14);
        java.lang.String str17 = defaultedMap1.toString();
        int i18 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{10.0=-1}" + "'", str17.equals("{10.0=-1}"));
        org.junit.Assert.assertTrue(i18 == 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation5.addChromosome(chromosome7);
        try {
            elitisticListPopulation5.setElitismRate((double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation8, obj13);
        java.util.Collection collection15 = defaultedMap1.values();
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection18 = defaultedMap1.values();
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation8, obj13);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome15 = elitisticListPopulation8.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = elitisticListPopulation8.spliterator();
        elitisticListPopulation8.setElitismRate((double) (byte) 1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(spliterator_chromosome15);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) -1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((-1), (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "");
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation9.getChromosomes();
        boolean b15 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation9);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = elitisticListPopulation9.spliterator();
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        elitisticListPopulation22.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24);
        java.lang.String str27 = elitisticListPopulation22.toString();
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        elitisticListPopulation33.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35);
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation22.setChromosomes(list_chromosome38);
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome41, (int) (byte) 100, (double) 1.0f);
        int i46 = elitisticListPopulation45.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        elitisticListPopulation45.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48);
        elitisticListPopulation22.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        math.genetics.Chromosome[] chromosome_array52 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome53 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b54 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome53, chromosome_array52);
        math.genetics.ElitisticListPopulation elitisticListPopulation57 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome53, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array58 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome59 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b60 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome59, chromosome_array58);
        elitisticListPopulation57.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome59);
        java.util.List<math.genetics.Chromosome> list_chromosome62 = elitisticListPopulation57.getChromosomes();
        elitisticListPopulation22.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome62);
        java.util.List<math.genetics.Chromosome> list_chromosome64 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation9.setChromosomes(list_chromosome64);
        int i66 = elitisticListPopulation9.getPopulationLimit();
        math.genetics.Population population67 = elitisticListPopulation9.nextGeneration();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]" + "'", str27.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(chromosome_array52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(chromosome_array58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(list_chromosome62);
        org.junit.Assert.assertNotNull(list_chromosome64);
        org.junit.Assert.assertTrue(i66 == 100);
        org.junit.Assert.assertNotNull(population67);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        int i11 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation5.addChromosome(chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection6 = defaultedMap5.values();
        java.util.Collection collection7 = defaultedMap5.values();
        java.util.Set set8 = defaultedMap5.entrySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.String str13 = defaultedMap5.toString();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation8, obj13);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation8.iterator();
        double d16 = elitisticListPopulation8.getElitismRate();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertTrue(d16 == 1.0d);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 1.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation5.addChromosome(chromosome7);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        int i10 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertTrue(i10 == 100);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) (byte) 100, (double) 1.0f);
        int i8 = elitisticListPopulation7.getPopulationSize();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation7.addChromosome(chromosome9);
        math.genetics.Population population11 = elitisticListPopulation7.nextGeneration();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation7.addChromosome(chromosome12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (byte) 100, (double) 1.0f);
        int i20 = elitisticListPopulation19.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22);
        elitisticListPopulation7.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) arraylist_chromosome22);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection29 = defaultedMap28.values();
        java.util.Collection collection30 = defaultedMap28.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection33 = defaultedMap32.values();
        java.util.Collection collection34 = defaultedMap32.values();
        java.util.Set set35 = defaultedMap32.entrySet();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate37);
        defaultedMap28.putAll((java.util.Map) defaultedMap32);
        boolean b41 = defaultedMap32.containsValue((java.lang.Object) (-1));
        java.util.Collection collection42 = defaultedMap32.values();
        java.util.Collection collection43 = defaultedMap32.values();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap32);
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) -1 + "'", obj26.equals((short) -1));
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation8, obj13);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation8.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation8.getChromosomes();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertNotNull(list_chromosome16);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((-1), (double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b11 = defaultedMap7.isEmpty();
        java.util.Collection collection12 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection15 = defaultedMap14.values();
        java.util.Collection collection16 = defaultedMap14.values();
        java.util.Set set17 = defaultedMap14.entrySet();
        java.lang.String str18 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection21 = defaultedMap20.values();
        java.util.Collection collection22 = defaultedMap20.values();
        java.util.Set set23 = defaultedMap20.entrySet();
        java.lang.String str24 = defaultedMap20.toString();
        java.lang.Object obj26 = defaultedMap14.put((java.lang.Object) defaultedMap20, (java.lang.Object) 0.0d);
        defaultedMap7.putAll((java.util.Map) defaultedMap20);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        elitisticListPopulation33.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection40 = defaultedMap39.values();
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection40);
        boolean b42 = defaultedMap20.containsKey((java.lang.Object) elitisticListPopulation33);
        defaultedMap1.putAll((java.util.Map) defaultedMap20);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate44, predicate45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj51 = defaultedMap48.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b52 = defaultedMap48.isEmpty();
        java.util.Collection collection53 = defaultedMap48.values();
        math.genetics.Chromosome[] chromosome_array54 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome55 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55, chromosome_array54);
        math.genetics.ElitisticListPopulation elitisticListPopulation59 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome55, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array60 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome61 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61, chromosome_array60);
        elitisticListPopulation59.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome61);
        java.lang.String str64 = elitisticListPopulation59.toString();
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        math.genetics.ElitisticListPopulation elitisticListPopulation70 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome66, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array71 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome72 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b73 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome72, chromosome_array71);
        elitisticListPopulation70.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome72);
        java.util.List<math.genetics.Chromosome> list_chromosome75 = elitisticListPopulation70.getChromosomes();
        elitisticListPopulation59.setChromosomes(list_chromosome75);
        java.lang.Object obj77 = defaultedMap48.get((java.lang.Object) elitisticListPopulation59);
        boolean b78 = defaultedMap20.equals((java.lang.Object) elitisticListPopulation59);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(chromosome_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(chromosome_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "[]" + "'", str64.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(chromosome_array71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(list_chromosome75);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + (short) -1 + "'", obj77.equals((short) -1));
        org.junit.Assert.assertTrue(b78 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 100, (double) 1.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) elitisticListPopulation8, obj13);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation8.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation8.setPopulationLimit((int) (byte) 100);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(list_chromosome16);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.util.Collection collection9 = defaultedMap7.values();
        java.util.Set set10 = defaultedMap7.entrySet();
        java.lang.String str11 = defaultedMap7.toString();
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) 0.0d);
        int i14 = defaultedMap7.size();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        elitisticListPopulation20.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22);
        java.lang.String str25 = elitisticListPopulation20.toString();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        elitisticListPopulation31.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33);
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation20.setChromosomes(list_chromosome36);
        java.lang.Object obj38 = defaultedMap7.get((java.lang.Object) list_chromosome36);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome39 = list_chromosome36.spliterator();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) -1 + "'", obj38.equals((short) -1));
        org.junit.Assert.assertNotNull(spliterator_chromosome39);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) (byte) 100, (double) 1.0f);
        int i8 = elitisticListPopulation7.getPopulationSize();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation7.addChromosome(chromosome9);
        math.genetics.Population population11 = elitisticListPopulation7.nextGeneration();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation7.addChromosome(chromosome12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (byte) 100, (double) 1.0f);
        int i20 = elitisticListPopulation19.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22);
        elitisticListPopulation7.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) arraylist_chromosome22);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection30 = defaultedMap29.values();
        java.lang.Object obj31 = defaultedMap1.put(obj27, (java.lang.Object) collection30);
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) -1 + "'", obj26.equals((short) -1));
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) (byte) 100, (double) 1.0f);
        int i14 = elitisticListPopulation13.getPopulationSize();
        java.lang.String str15 = elitisticListPopulation13.toString();
        int i16 = elitisticListPopulation13.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) "");
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation26.getChromosomes();
        boolean b32 = defaultedMap18.equals((java.lang.Object) elitisticListPopulation26);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome33 = elitisticListPopulation26.spliterator();
        java.lang.Object obj34 = defaultedMap1.put((java.lang.Object) i16, (java.lang.Object) spliterator_chromosome33);
        java.util.Set set35 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]" + "'", str15.equals("[]"));
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.util.Collection collection12 = defaultedMap10.values();
        java.util.Set set13 = defaultedMap10.entrySet();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate14, predicate15);
        collections.Predicate predicate17 = null;
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate14, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) 10.0d, (java.lang.Object) (-1));
        boolean b24 = defaultedMap20.isEmpty();
        java.util.Collection collection25 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection28 = defaultedMap27.values();
        java.util.Collection collection29 = defaultedMap27.values();
        java.util.Set set30 = defaultedMap27.entrySet();
        java.lang.String str31 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection34 = defaultedMap33.values();
        java.util.Collection collection35 = defaultedMap33.values();
        java.util.Set set36 = defaultedMap33.entrySet();
        java.lang.String str37 = defaultedMap33.toString();
        java.lang.Object obj39 = defaultedMap27.put((java.lang.Object) defaultedMap33, (java.lang.Object) 0.0d);
        defaultedMap20.putAll((java.util.Map) defaultedMap33);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) (byte) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        elitisticListPopulation46.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection53 = defaultedMap52.values();
        elitisticListPopulation46.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection53);
        boolean b55 = defaultedMap33.containsKey((java.lang.Object) elitisticListPopulation46);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection58 = defaultedMap57.values();
        java.util.Collection collection59 = defaultedMap57.values();
        java.util.Set set60 = defaultedMap57.entrySet();
        java.lang.String str61 = defaultedMap57.toString();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Collection collection64 = defaultedMap63.values();
        java.util.Collection collection65 = defaultedMap63.values();
        java.util.Set set66 = defaultedMap63.entrySet();
        java.lang.String str67 = defaultedMap63.toString();
        java.lang.Object obj69 = defaultedMap57.put((java.lang.Object) defaultedMap63, (java.lang.Object) 0.0d);
        int i70 = defaultedMap63.size();
        java.util.Set set71 = defaultedMap63.entrySet();
        boolean b72 = defaultedMap33.containsKey((java.lang.Object) defaultedMap63);
        boolean b73 = defaultedMap33.isEmpty();
        java.lang.Object obj74 = defaultedMap1.put((java.lang.Object) predicate17, (java.lang.Object) defaultedMap33);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNull(obj74);
    }
}

