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
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
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
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        try {
            elitisticListPopulation2.setPopulationLimit((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
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
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, (double) 100);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b4 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.clear();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 1.0d);
        java.util.Map map10 = collections.map.DefaultedMap.decorate(map4, (java.lang.Object) defaultedMap6);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate(map10, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        try {
            elitisticListPopulation2.setElitismRate((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        try {
            elitisticListPopulation2.setElitismRate((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.Predicate predicate0 = collections.PredicateUtils.uniquePredicate();
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        math.genetics.Chromosome chromosome7 = null;
        try {
            elitisticListPopulation2.addChromosome(chromosome7);
            org.junit.Assert.fail("Expected exception of type math.exception.NumberIsTooLargeException");
        } catch (math.exception.NumberIsTooLargeException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) map9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        defaultedMap1.putAll(map15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate20, predicate24);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100.0f + "'", obj10.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.clear();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 10.0f);
        boolean b12 = defaultedMap3.equals((java.lang.Object) b11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b16 = defaultedMap3.containsValue((java.lang.Object) collection15);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1.0f);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.lang.String str4 = elitisticListPopulation2.toString();
        try {
            math.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap7.clear();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) 10.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation5.addChromosome(chromosome7);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation5.spliterator();
        math.genetics.Population population10 = elitisticListPopulation5.nextGeneration();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) population10);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNotNull(population10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(list_chromosome7, (int) (byte) 100, (double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.Predicate predicate5 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.util.Map map11 = collections.map.PredicatedMap.decorate(map4, predicate5, predicate8);
        java.util.Map map13 = collections.map.DefaultedMap.decorate(map4, (java.lang.Object) (byte) 10);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate(map4, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap7.clear();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) 10.0f);
        int i11 = defaultedMap7.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        int i13 = defaultedMap1.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation16.iterator();
        java.lang.String str18 = elitisticListPopulation16.toString();
        int i19 = elitisticListPopulation16.getPopulationLimit();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation16);
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        math.genetics.Chromosome chromosome5 = null;
        try {
            elitisticListPopulation2.addChromosome(chromosome5);
            org.junit.Assert.fail("Expected exception of type math.exception.NumberIsTooLargeException");
        } catch (math.exception.NumberIsTooLargeException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        try {
            elitisticListPopulation2.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        try {
            elitisticListPopulation2.setElitismRate((double) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        double d7 = elitisticListPopulation2.getElitismRate();
        math.genetics.Chromosome chromosome8 = null;
        try {
            elitisticListPopulation2.addChromosome(chromosome8);
            org.junit.Assert.fail("Expected exception of type math.exception.NumberIsTooLargeException");
        } catch (math.exception.NumberIsTooLargeException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue(d7 == 1.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.lang.Object obj11 = defaultedMap3.get((java.lang.Object) 100);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap3.keySet();
        boolean b11 = defaultedMap3.isEmpty();
        java.util.Set set12 = defaultedMap3.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation15.iterator();
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation15.addChromosome(chromosome17);
        java.lang.Object obj19 = defaultedMap3.get((java.lang.Object) elitisticListPopulation15);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100.0f + "'", obj19.equals(100.0f));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 1);
        int i7 = defaultedMap1.size();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        double d5 = elitisticListPopulation2.getElitismRate();
        try {
            elitisticListPopulation2.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(d5 == 0.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Collection collection8 = defaultedMap1.values();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection5 = defaultedMap4.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b9 = defaultedMap4.containsValue((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection12 = defaultedMap11.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b16 = defaultedMap11.containsValue((java.lang.Object) 1);
        boolean b17 = defaultedMap4.containsKey((java.lang.Object) defaultedMap11);
        java.util.Collection collection18 = defaultedMap4.values();
        int i19 = defaultedMap4.size();
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) i19);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.String str2 = defaultedMap1.toString();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap3.keySet();
        boolean b11 = defaultedMap3.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation14.iterator();
        boolean b16 = defaultedMap3.containsKey((java.lang.Object) elitisticListPopulation14);
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation14.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation20.iterator();
        java.lang.String str22 = elitisticListPopulation20.toString();
        int i23 = elitisticListPopulation20.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation20.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.clear();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 10.0f);
        int i10 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.clear();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) 10.0f);
        int i16 = defaultedMap12.size();
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set28 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection31 = defaultedMap30.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b35 = defaultedMap30.containsValue((java.lang.Object) 1);
        defaultedMap21.putAll((java.util.Map) defaultedMap30);
        java.util.Set set37 = defaultedMap30.keySet();
        boolean b38 = defaultedMap6.equals((java.lang.Object) defaultedMap30);
        java.util.Set set39 = defaultedMap30.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap30);
        collections.Factory factory41 = null;
        try {
            java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(set39);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.clear();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 1.0d);
        java.util.Map map10 = collections.map.DefaultedMap.decorate(map4, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.clear();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1.0d);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.Predicate predicate23 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate(map22, predicate23, predicate26);
        java.util.Map map31 = collections.map.DefaultedMap.decorate(map22, (java.lang.Object) (byte) 10);
        java.lang.Object obj32 = defaultedMap6.put((java.lang.Object) defaultedMap12, (java.lang.Object) map22);
        java.util.Collection collection33 = defaultedMap12.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0f + "'", obj17.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        double d8 = elitisticListPopulation2.getElitismRate();
        double d9 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        try {
            elitisticListPopulation2.setElitismRate((double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection3 = defaultedMap2.values();
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) collection3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (short) 10);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj15 = defaultedMap9.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set16 = defaultedMap9.keySet();
        boolean b17 = defaultedMap9.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation20.iterator();
        boolean b22 = defaultedMap9.containsKey((java.lang.Object) elitisticListPopulation20);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation20.getChromosomes();
        boolean b24 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation20);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap14.clear();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) defaultedMap14);
        defaultedMap1.putAll(map18);
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate(map18, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0f + "'", obj6.equals(100.0f));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.Predicate predicate5 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.util.Map map11 = collections.map.PredicatedMap.decorate(map4, predicate5, predicate8);
        java.util.Map map13 = collections.map.DefaultedMap.decorate(map4, (java.lang.Object) (byte) 10);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate(map13, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap14.clear();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) defaultedMap14);
        defaultedMap1.putAll(map18);
        int i20 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0f + "'", obj6.equals(100.0f));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) map9);
        java.util.Set set11 = defaultedMap1.entrySet();
        java.util.Set set12 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100.0f + "'", obj10.equals(100.0f));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        double d7 = elitisticListPopulation2.getElitismRate();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue(d7 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap3.keySet();
        boolean b11 = defaultedMap3.isEmpty();
        java.util.Set set12 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.lang.Object obj28 = defaultedMap19.get((java.lang.Object) map27);
        defaultedMap14.putAll(map27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        collections.Predicate predicate35 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate(map34, predicate35, predicate38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        java.lang.Object obj43 = defaultedMap3.put((java.lang.Object) map27, (java.lang.Object) defaultedMap42);
        java.util.Set set44 = defaultedMap42.entrySet();
        collections.Factory factory45 = null;
        try {
            java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, factory45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100.0f + "'", obj28.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap7.clear();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) 10.0f);
        int i11 = defaultedMap7.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        int i13 = defaultedMap1.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation16.iterator();
        java.lang.String str18 = elitisticListPopulation16.toString();
        int i19 = elitisticListPopulation16.getPopulationLimit();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation16);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation16.iterator();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation6.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation6.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation6.spliterator();
        int i11 = elitisticListPopulation6.getPopulationLimit();
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) i11);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.clear();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Collection collection15 = defaultedMap8.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection15);
        math.genetics.Chromosome chromosome17 = null;
        try {
            elitisticListPopulation2.addChromosome(chromosome17);
            org.junit.Assert.fail("Expected exception of type math.exception.NumberIsTooLargeException");
        } catch (math.exception.NumberIsTooLargeException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation2.spliterator();
        java.lang.String str9 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[null]" + "'", str9.equals("[null]"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.clear();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Collection collection15 = defaultedMap8.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection15);
        elitisticListPopulation2.setPopulationLimit((int) '4');
        elitisticListPopulation2.setPopulationLimit(100);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap3.keySet();
        boolean b11 = defaultedMap3.isEmpty();
        java.util.Set set12 = defaultedMap3.entrySet();
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.clear();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Collection collection15 = defaultedMap8.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection15);
        elitisticListPopulation2.setPopulationLimit((int) '4');
        elitisticListPopulation2.setPopulationLimit(100);
        java.lang.String str21 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[hi!]" + "'", str21.equals("[hi!]"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap7.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.clear();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj12 = defaultedMap6.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Collection collection13 = defaultedMap6.values();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.util.Collection collection15 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        double d7 = elitisticListPopulation2.getElitismRate();
        try {
            math.genetics.Chromosome chromosome8 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(d7 == 0.0d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) map9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation13.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = elitisticListPopulation13.spliterator();
        java.lang.String str17 = elitisticListPopulation13.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap19.clear();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj25 = defaultedMap19.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Collection collection26 = defaultedMap19.values();
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection26);
        boolean b28 = defaultedMap1.containsKey((java.lang.Object) collection26);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100.0f + "'", obj10.equals(100.0f));
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        try {
            math.genetics.Chromosome chromosome8 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(population7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.clear();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 1.0d);
        java.util.Map map10 = collections.map.DefaultedMap.decorate(map4, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.clear();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1.0d);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.Predicate predicate23 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate(map22, predicate23, predicate26);
        java.util.Map map31 = collections.map.DefaultedMap.decorate(map22, (java.lang.Object) (byte) 10);
        java.lang.Object obj32 = defaultedMap6.put((java.lang.Object) defaultedMap12, (java.lang.Object) map22);
        java.util.Set set33 = defaultedMap12.keySet();
        collections.Transformer transformer34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0f + "'", obj17.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap3.keySet();
        boolean b11 = defaultedMap3.isEmpty();
        java.util.Set set12 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.lang.Object obj28 = defaultedMap19.get((java.lang.Object) map27);
        defaultedMap14.putAll(map27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        collections.Predicate predicate35 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate(map34, predicate35, predicate38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        java.lang.Object obj43 = defaultedMap3.put((java.lang.Object) map27, (java.lang.Object) defaultedMap42);
        java.util.Set set44 = defaultedMap42.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation47.setElitismRate((double) (short) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome50 = elitisticListPopulation47.getChromosomes();
        math.genetics.Population population51 = elitisticListPopulation47.nextGeneration();
        boolean b52 = defaultedMap42.equals((java.lang.Object) population51);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100.0f + "'", obj28.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(list_chromosome50);
        org.junit.Assert.assertNotNull(population51);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Collection collection8 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation11.iterator();
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation11.addChromosome(chromosome13);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome15 = elitisticListPopulation11.spliterator();
        int i16 = elitisticListPopulation11.getPopulationLimit();
        math.genetics.Population population17 = elitisticListPopulation11.nextGeneration();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) population17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection21 = defaultedMap20.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b25 = defaultedMap20.containsValue((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        java.lang.Object obj31 = defaultedMap20.remove((java.lang.Object) predicate28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection34 = defaultedMap33.values();
        defaultedMap33.clear();
        boolean b37 = defaultedMap33.containsKey((java.lang.Object) 0.0f);
        java.util.Set set38 = defaultedMap33.entrySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b44 = defaultedMap42.equals((java.lang.Object) (short) 10);
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        java.lang.Object obj48 = defaultedMap42.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set49 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate52, predicate53);
        java.lang.Object obj55 = defaultedMap33.put((java.lang.Object) set49, (java.lang.Object) predicate53);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate28, predicate53);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(spliterator_chromosome15);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNotNull(population17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map56);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        math.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
        org.junit.Assert.assertNotNull(population6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 1);
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap9.clear();
        boolean b12 = defaultedMap9.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj15 = defaultedMap9.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation18.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b28 = defaultedMap26.equals((java.lang.Object) (short) 10);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        int i30 = defaultedMap24.size();
        java.lang.Object obj31 = defaultedMap9.put((java.lang.Object) arraylist_chromosome20, (java.lang.Object) defaultedMap24);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        java.lang.String str33 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[]" + "'", str33.equals("[]"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection9 = defaultedMap8.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b13 = defaultedMap8.containsValue((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection16 = defaultedMap15.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b20 = defaultedMap15.containsValue((java.lang.Object) 1);
        boolean b21 = defaultedMap8.containsKey((java.lang.Object) defaultedMap15);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) false);
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (short) 10);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.lang.Object obj34 = defaultedMap28.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set35 = defaultedMap28.keySet();
        boolean b36 = defaultedMap28.isEmpty();
        java.util.Set set37 = defaultedMap28.entrySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        java.lang.Object obj53 = defaultedMap44.get((java.lang.Object) map52);
        defaultedMap39.putAll(map52);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate57, predicate58);
        collections.Predicate predicate60 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate63, predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate(map59, predicate60, predicate63);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) predicate60);
        java.lang.Object obj68 = defaultedMap28.put((java.lang.Object) map52, (java.lang.Object) defaultedMap67);
        boolean b69 = defaultedMap1.containsKey(obj68);
        boolean b70 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 100.0f + "'", obj53.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.clear();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap13.clear();
        boolean b16 = defaultedMap13.containsKey((java.lang.Object) 10.0f);
        int i17 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap19.clear();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) 10.0f);
        int i23 = defaultedMap19.size();
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (short) 10);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.lang.Object obj34 = defaultedMap28.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set35 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection38 = defaultedMap37.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b42 = defaultedMap37.containsValue((java.lang.Object) 1);
        defaultedMap28.putAll((java.util.Map) defaultedMap37);
        java.util.Set set44 = defaultedMap37.keySet();
        boolean b45 = defaultedMap13.equals((java.lang.Object) defaultedMap37);
        java.util.Set set46 = defaultedMap37.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap37);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap37);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Collection collection8 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation11.iterator();
        java.lang.String str13 = elitisticListPopulation11.toString();
        int i14 = elitisticListPopulation11.getPopulationLimit();
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) i14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap17.clear();
        boolean b20 = defaultedMap17.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b36 = defaultedMap34.equals((java.lang.Object) (short) 10);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        int i38 = defaultedMap32.size();
        java.lang.Object obj39 = defaultedMap17.put((java.lang.Object) arraylist_chromosome28, (java.lang.Object) defaultedMap32);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation42.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome45 = elitisticListPopulation42.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome46 = elitisticListPopulation42.iterator();
        boolean b47 = defaultedMap17.equals((java.lang.Object) iterator_chromosome46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap49.clear();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) 1.0d);
        java.lang.Object obj54 = defaultedMap49.get((java.lang.Object) 1.0d);
        java.util.Set set55 = defaultedMap49.entrySet();
        java.lang.Object obj56 = defaultedMap1.put((java.lang.Object) iterator_chromosome46, (java.lang.Object) set55);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(spliterator_chromosome45);
        org.junit.Assert.assertNotNull(iterator_chromosome46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 100.0f + "'", obj54.equals(100.0f));
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap7.clear();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) 10.0f);
        int i11 = defaultedMap7.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj22 = defaultedMap16.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set23 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection26 = defaultedMap25.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b30 = defaultedMap25.containsValue((java.lang.Object) 1);
        defaultedMap16.putAll((java.util.Map) defaultedMap25);
        java.util.Set set32 = defaultedMap25.keySet();
        boolean b33 = defaultedMap1.equals((java.lang.Object) defaultedMap25);
        java.util.Set set34 = defaultedMap25.entrySet();
        collections.Transformer transformer35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, transformer35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation(list_chromosome5, (int) (short) 0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap3.keySet();
        boolean b11 = defaultedMap3.isEmpty();
        java.util.Set set12 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.lang.Object obj28 = defaultedMap19.get((java.lang.Object) map27);
        defaultedMap14.putAll(map27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        collections.Predicate predicate35 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate(map34, predicate35, predicate38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        java.lang.Object obj43 = defaultedMap3.put((java.lang.Object) map27, (java.lang.Object) defaultedMap42);
        collections.Transformer transformer44 = null;
        try {
            java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, transformer44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100.0f + "'", obj28.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap3.keySet();
        boolean b11 = defaultedMap3.isEmpty();
        java.util.Set set12 = defaultedMap3.entrySet();
        boolean b14 = defaultedMap3.containsKey((java.lang.Object) 10);
        defaultedMap3.clear();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        try {
            elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        double d4 = elitisticListPopulation2.getElitismRate();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        int i6 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap7.clear();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) 10.0f);
        int i11 = defaultedMap7.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj22 = defaultedMap16.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set23 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection26 = defaultedMap25.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b30 = defaultedMap25.containsValue((java.lang.Object) 1);
        defaultedMap16.putAll((java.util.Map) defaultedMap25);
        java.util.Set set32 = defaultedMap25.keySet();
        boolean b33 = defaultedMap1.equals((java.lang.Object) defaultedMap25);
        java.util.Set set34 = defaultedMap25.entrySet();
        collections.Factory factory35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, factory35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) map9);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100.0f + "'", obj10.equals(100.0f));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.Predicate predicate5 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.util.Map map11 = collections.map.PredicatedMap.decorate(map4, predicate5, predicate8);
        java.util.Map map13 = collections.map.DefaultedMap.decorate(map4, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap15.clear();
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        elitisticListPopulation24.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b34 = defaultedMap32.equals((java.lang.Object) (short) 10);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        int i36 = defaultedMap30.size();
        java.lang.Object obj37 = defaultedMap15.put((java.lang.Object) arraylist_chromosome26, (java.lang.Object) defaultedMap30);
        java.util.Map map38 = collections.map.DefaultedMap.decorate(map13, (java.lang.Object) defaultedMap15);
        defaultedMap15.clear();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map38);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.clear();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 10.0f);
        int i10 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.clear();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) 10.0f);
        int i16 = defaultedMap12.size();
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set28 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection31 = defaultedMap30.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b35 = defaultedMap30.containsValue((java.lang.Object) 1);
        defaultedMap21.putAll((java.util.Map) defaultedMap30);
        java.util.Set set37 = defaultedMap30.keySet();
        boolean b38 = defaultedMap6.equals((java.lang.Object) defaultedMap30);
        java.util.Set set39 = defaultedMap30.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (short) 10);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj50 = defaultedMap44.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set51 = defaultedMap44.keySet();
        boolean b52 = defaultedMap44.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome56 = elitisticListPopulation55.iterator();
        boolean b57 = defaultedMap44.containsKey((java.lang.Object) elitisticListPopulation55);
        boolean b58 = defaultedMap1.containsValue((java.lang.Object) defaultedMap44);
        int i59 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i59 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        try {
            elitisticListPopulation2.setElitismRate((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.clear();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 1.0d);
        java.util.Map map10 = collections.map.DefaultedMap.decorate(map4, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.clear();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1.0d);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.Predicate predicate23 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate(map22, predicate23, predicate26);
        java.util.Map map31 = collections.map.DefaultedMap.decorate(map22, (java.lang.Object) (byte) 10);
        java.lang.Object obj32 = defaultedMap6.put((java.lang.Object) defaultedMap12, (java.lang.Object) map22);
        collections.Transformer transformer33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0f + "'", obj17.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        double d8 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) '#');
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation2.spliterator();
        try {
            math.genetics.Chromosome chromosome13 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[null]" + "'", str11.equals("[null]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.clear();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj12 = defaultedMap6.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Collection collection13 = defaultedMap6.values();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap16.clear();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate26);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate(map19, predicate22, predicate29);
        defaultedMap1.putAll(map30);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.clear();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Collection collection15 = defaultedMap8.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection15);
        java.lang.String str17 = elitisticListPopulation2.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation20.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome23 = elitisticListPopulation20.spliterator();
        double d24 = elitisticListPopulation20.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation27.setElitismRate((double) (short) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation20.setChromosomes(list_chromosome30);
        elitisticListPopulation2.setChromosomes(list_chromosome30);
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[hi!]" + "'", str17.equals("[hi!]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome23);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome30);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 1);
        int i7 = defaultedMap1.size();
        java.lang.String str8 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        collections.Predicate predicate14 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate(map13, predicate14, predicate17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome26 = elitisticListPopulation25.iterator();
        math.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation25.addChromosome(chromosome27);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome29 = elitisticListPopulation25.spliterator();
        int i30 = elitisticListPopulation25.getPopulationLimit();
        math.genetics.Population population31 = elitisticListPopulation25.nextGeneration();
        boolean b32 = defaultedMap1.equals((java.lang.Object) population31);
        java.util.Collection collection33 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(iterator_chromosome26);
        org.junit.Assert.assertNotNull(spliterator_chromosome29);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertNotNull(population31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap7.clear();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) 10.0f);
        int i11 = defaultedMap7.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        int i13 = defaultedMap1.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation16.iterator();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation16.addChromosome(chromosome18);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = elitisticListPopulation16.spliterator();
        math.genetics.Population population21 = elitisticListPopulation16.nextGeneration();
        double d22 = elitisticListPopulation16.getElitismRate();
        elitisticListPopulation16.setPopulationLimit((int) '#');
        java.lang.String str25 = elitisticListPopulation16.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome26 = elitisticListPopulation16.iterator();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) iterator_chromosome26);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertNotNull(population21);
        org.junit.Assert.assertTrue(d22 == 1.0d);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[null]" + "'", str25.equals("[null]"));
        org.junit.Assert.assertNotNull(iterator_chromosome26);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) map15);
        defaultedMap1.putAll(map15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection29 = defaultedMap28.values();
        defaultedMap28.clear();
        boolean b32 = defaultedMap28.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        java.lang.Object obj43 = defaultedMap34.get((java.lang.Object) map42);
        defaultedMap28.putAll(map42);
        boolean b45 = defaultedMap19.containsValue((java.lang.Object) map42);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap48.clear();
        boolean b51 = defaultedMap48.containsKey((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap53.clear();
        boolean b56 = defaultedMap53.containsKey((java.lang.Object) 10.0f);
        int i57 = defaultedMap53.size();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap59.clear();
        boolean b62 = defaultedMap59.containsKey((java.lang.Object) 10.0f);
        int i63 = defaultedMap59.size();
        defaultedMap53.putAll((java.util.Map) defaultedMap59);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b70 = defaultedMap68.equals((java.lang.Object) (short) 10);
        defaultedMap66.putAll((java.util.Map) defaultedMap68);
        java.lang.Object obj74 = defaultedMap68.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set75 = defaultedMap68.keySet();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection78 = defaultedMap77.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation81 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b82 = defaultedMap77.containsValue((java.lang.Object) 1);
        defaultedMap68.putAll((java.util.Map) defaultedMap77);
        java.util.Set set84 = defaultedMap77.keySet();
        boolean b85 = defaultedMap53.equals((java.lang.Object) defaultedMap77);
        java.util.Set set86 = defaultedMap77.entrySet();
        defaultedMap48.putAll((java.util.Map) defaultedMap77);
        boolean b88 = defaultedMap19.equals((java.lang.Object) defaultedMap77);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100.0f + "'", obj16.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100.0f + "'", obj43.equals(100.0f));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertTrue(b88 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection13 = defaultedMap12.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b17 = defaultedMap12.containsValue((java.lang.Object) 1);
        defaultedMap3.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        java.lang.Object obj34 = defaultedMap25.get((java.lang.Object) map33);
        defaultedMap20.putAll(map33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate43, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        java.lang.Object obj51 = defaultedMap42.get((java.lang.Object) map50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate54, predicate55);
        defaultedMap42.putAll(map56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate60, predicate61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate65, predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate61, predicate65);
        java.util.Map map69 = collections.map.PredicatedMap.decorate(map33, predicate38, predicate65);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection72 = defaultedMap71.values();
        defaultedMap71.clear();
        boolean b75 = defaultedMap71.containsKey((java.lang.Object) 0.0f);
        java.util.Set set76 = defaultedMap71.entrySet();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b82 = defaultedMap80.equals((java.lang.Object) (short) 10);
        defaultedMap78.putAll((java.util.Map) defaultedMap80);
        java.lang.Object obj86 = defaultedMap80.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set87 = defaultedMap80.keySet();
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate91 = collections.PredicateUtils.truePredicate();
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap89, predicate90, predicate91);
        java.lang.Object obj93 = defaultedMap71.put((java.lang.Object) set87, (java.lang.Object) predicate91);
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate65, predicate91);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100.0f + "'", obj34.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 100.0f + "'", obj51.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(map94);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.clear();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 10.0f);
        boolean b12 = defaultedMap3.equals((java.lang.Object) b11);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap15.clear();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 1.0d);
        boolean b19 = defaultedMap3.equals((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        elitisticListPopulation10.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        int i22 = defaultedMap16.size();
        java.lang.Object obj23 = defaultedMap1.put((java.lang.Object) arraylist_chromosome12, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0f + "'", obj6.equals(100.0f));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection13 = defaultedMap12.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b17 = defaultedMap12.containsValue((java.lang.Object) 1);
        defaultedMap3.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.lang.Object obj29 = defaultedMap20.get((java.lang.Object) map28);
        java.util.Set set30 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b36 = defaultedMap34.equals((java.lang.Object) (short) 10);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj40 = defaultedMap34.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set41 = defaultedMap34.keySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection44 = defaultedMap43.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b48 = defaultedMap43.containsValue((java.lang.Object) 1);
        defaultedMap34.putAll((java.util.Map) defaultedMap43);
        java.lang.Object obj50 = defaultedMap20.remove((java.lang.Object) defaultedMap43);
        defaultedMap3.putAll((java.util.Map) defaultedMap20);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100.0f + "'", obj29.equals(100.0f));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap7.clear();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) 10.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        int i13 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Set set8 = defaultedMap1.entrySet();
        java.lang.String str9 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) map19);
        java.util.Set set21 = defaultedMap11.entrySet();
        boolean b22 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{10=hi!}" + "'", str9.equals("{10=hi!}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100.0f + "'", obj20.equals(100.0f));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) 0);
        java.lang.String str3 = elitisticListPopulation2.toString();
        try {
            math.genetics.Chromosome chromosome4 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        double d6 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation9.setElitismRate((double) (short) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome12);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation16.iterator();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation16.addChromosome(chromosome18);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = elitisticListPopulation16.spliterator();
        math.genetics.Population population21 = elitisticListPopulation16.nextGeneration();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap23.clear();
        boolean b26 = defaultedMap23.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj29 = defaultedMap23.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation32.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b42 = defaultedMap40.equals((java.lang.Object) (short) 10);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        int i44 = defaultedMap38.size();
        java.lang.Object obj45 = defaultedMap23.put((java.lang.Object) arraylist_chromosome34, (java.lang.Object) defaultedMap38);
        elitisticListPopulation16.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertNotNull(population21);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        defaultedMap1.clear();
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.containsValue(obj6);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection12 = defaultedMap11.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b16 = defaultedMap11.containsValue((java.lang.Object) 1);
        int i17 = defaultedMap11.size();
        java.lang.String str18 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        collections.Predicate predicate24 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate(map23, predicate24, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        defaultedMap11.putAll((java.util.Map) defaultedMap31);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap11);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0f + "'", obj6.equals(100.0f));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap3.keySet();
        boolean b11 = defaultedMap3.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation14.iterator();
        boolean b16 = defaultedMap3.containsKey((java.lang.Object) elitisticListPopulation14);
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation14.getChromosomes();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation14);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome19 = elitisticListPopulation14.spliterator();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertNotNull(spliterator_chromosome19);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.clear();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Collection collection15 = defaultedMap8.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection15);
        elitisticListPopulation2.setPopulationLimit((int) '4');
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome19 = elitisticListPopulation2.spliterator();
        math.genetics.Population population20 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(spliterator_chromosome19);
        org.junit.Assert.assertNotNull(population20);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.Predicate predicate5 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.util.Map map11 = collections.map.PredicatedMap.decorate(map4, predicate5, predicate8);
        java.util.Map map13 = collections.map.DefaultedMap.decorate(map4, (java.lang.Object) (byte) 10);
        collections.Predicate predicate14 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        java.lang.Object obj30 = defaultedMap21.get((java.lang.Object) map29);
        defaultedMap16.putAll(map29);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        java.lang.Object obj47 = defaultedMap38.get((java.lang.Object) map46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        defaultedMap38.putAll(map52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate56, predicate57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate61, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate57, predicate61);
        java.util.Map map65 = collections.map.PredicatedMap.decorate(map29, predicate34, predicate61);
        java.util.Map map66 = collections.map.PredicatedMap.decorate(map4, predicate14, predicate61);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 100.0f + "'", obj30.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100.0f + "'", obj47.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.clear();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Collection collection15 = defaultedMap8.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection15);
        elitisticListPopulation2.setPopulationLimit((int) '4');
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome19 = elitisticListPopulation2.spliterator();
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation2.addChromosome(chromosome20);
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(spliterator_chromosome19);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Collection collection8 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation11.iterator();
        java.lang.String str13 = elitisticListPopulation11.toString();
        int i14 = elitisticListPopulation11.getPopulationLimit();
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) i14);
        java.util.Collection collection16 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection11 = defaultedMap10.values();
        defaultedMap10.clear();
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) map24);
        defaultedMap10.putAll(map24);
        boolean b27 = defaultedMap1.containsValue((java.lang.Object) map24);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome31 = elitisticListPopulation30.iterator();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) iterator_chromosome31);
        java.lang.String str33 = defaultedMap32.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        java.lang.Object obj44 = defaultedMap35.get((java.lang.Object) map43);
        java.util.Set set45 = defaultedMap35.entrySet();
        java.lang.Object obj46 = defaultedMap32.get((java.lang.Object) set45);
        java.lang.Object obj47 = defaultedMap1.get((java.lang.Object) defaultedMap32);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100.0f + "'", obj25.equals(100.0f));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome31);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 100.0f + "'", obj44.equals(100.0f));
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100.0f + "'", obj47.equals(100.0f));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (short) 10);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj11 = defaultedMap5.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set12 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection15 = defaultedMap14.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b19 = defaultedMap14.containsValue((java.lang.Object) 1);
        defaultedMap5.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        boolean b23 = defaultedMap1.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + true + "'", obj21.equals(true));
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        double d8 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) '#');
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation2.addChromosome(chromosome12);
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.clear();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Collection collection15 = defaultedMap8.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection15);
        elitisticListPopulation2.setPopulationLimit((int) '4');
        int i19 = elitisticListPopulation2.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection22 = defaultedMap21.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b26 = defaultedMap21.containsValue((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection29 = defaultedMap28.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b33 = defaultedMap28.containsValue((java.lang.Object) 1);
        boolean b34 = defaultedMap21.containsKey((java.lang.Object) defaultedMap28);
        java.util.Collection collection35 = defaultedMap21.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection35);
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(i19 == 52);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) map9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        defaultedMap1.putAll(map15);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection20 = defaultedMap19.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b24 = defaultedMap19.containsValue((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        java.lang.Object obj30 = defaultedMap19.remove((java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate27, predicate34);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100.0f + "'", obj10.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        int i7 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(list_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        int i5 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.clear();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 1.0d);
        java.util.Map map10 = collections.map.DefaultedMap.decorate(map4, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.clear();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1.0d);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.Predicate predicate23 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate(map22, predicate23, predicate26);
        java.util.Map map31 = collections.map.DefaultedMap.decorate(map22, (java.lang.Object) (byte) 10);
        java.lang.Object obj32 = defaultedMap6.put((java.lang.Object) defaultedMap12, (java.lang.Object) map22);
        boolean b34 = defaultedMap6.equals((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0f + "'", obj17.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj11 = defaultedMap5.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Collection collection12 = defaultedMap5.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection12);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) map15);
        defaultedMap1.putAll(map15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set28 = defaultedMap21.keySet();
        boolean b29 = defaultedMap21.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome33 = elitisticListPopulation32.iterator();
        boolean b34 = defaultedMap21.containsKey((java.lang.Object) elitisticListPopulation32);
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation32.getChromosomes();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation32);
        boolean b37 = defaultedMap36.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap36);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100.0f + "'", obj16.equals(100.0f));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertTrue(b37 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.clear();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 10.0f);
        int i10 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.clear();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) 10.0f);
        int i16 = defaultedMap12.size();
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set28 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection31 = defaultedMap30.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b35 = defaultedMap30.containsValue((java.lang.Object) 1);
        defaultedMap21.putAll((java.util.Map) defaultedMap30);
        java.util.Set set37 = defaultedMap30.keySet();
        boolean b38 = defaultedMap6.equals((java.lang.Object) defaultedMap30);
        java.util.Set set39 = defaultedMap30.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (short) 10);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj50 = defaultedMap44.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set51 = defaultedMap44.keySet();
        boolean b52 = defaultedMap44.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome56 = elitisticListPopulation55.iterator();
        boolean b57 = defaultedMap44.containsKey((java.lang.Object) elitisticListPopulation55);
        boolean b58 = defaultedMap1.containsValue((java.lang.Object) defaultedMap44);
        defaultedMap44.clear();
        java.lang.Object obj61 = defaultedMap44.get((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 100.0f + "'", obj61.equals(100.0f));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        double d7 = elitisticListPopulation2.getElitismRate();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = arraylist_chromosome9.spliterator();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue(d7 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = list_chromosome5.spliterator();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(list_chromosome5, 0, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit((int) (short) 10);
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.Predicate predicate5 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.util.Map map11 = collections.map.PredicatedMap.decorate(map4, predicate5, predicate8);
        java.util.Map map13 = collections.map.DefaultedMap.decorate(map4, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b19 = defaultedMap17.equals((java.lang.Object) (short) 10);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set24 = defaultedMap17.keySet();
        boolean b25 = defaultedMap17.isEmpty();
        java.util.Set set26 = defaultedMap17.entrySet();
        java.util.Map map27 = collections.map.DefaultedMap.decorate(map4, (java.lang.Object) defaultedMap17);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        boolean b29 = defaultedMap17.containsKey((java.lang.Object) predicate28);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection9 = defaultedMap8.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b13 = defaultedMap8.containsValue((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection16 = defaultedMap15.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b20 = defaultedMap15.containsValue((java.lang.Object) 1);
        boolean b21 = defaultedMap8.containsKey((java.lang.Object) defaultedMap15);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) false);
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (short) 10);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.lang.Object obj34 = defaultedMap28.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set35 = defaultedMap28.keySet();
        boolean b36 = defaultedMap28.isEmpty();
        java.util.Set set37 = defaultedMap28.entrySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        java.lang.Object obj53 = defaultedMap44.get((java.lang.Object) map52);
        defaultedMap39.putAll(map52);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate57, predicate58);
        collections.Predicate predicate60 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate63, predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate(map59, predicate60, predicate63);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) predicate60);
        java.lang.Object obj68 = defaultedMap28.put((java.lang.Object) map52, (java.lang.Object) defaultedMap67);
        boolean b69 = defaultedMap1.containsKey(obj68);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b75 = defaultedMap73.equals((java.lang.Object) (short) 10);
        defaultedMap71.putAll((java.util.Map) defaultedMap73);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap78.clear();
        boolean b81 = defaultedMap78.containsKey((java.lang.Object) 10.0f);
        boolean b82 = defaultedMap73.equals((java.lang.Object) b81);
        defaultedMap73.clear();
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap73);
        defaultedMap84.clear();
        boolean b86 = defaultedMap1.containsKey((java.lang.Object) defaultedMap84);
        boolean b88 = defaultedMap84.containsKey((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 100.0f + "'", obj53.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue(b88 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((-1), (double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b16 = defaultedMap14.equals((java.lang.Object) (short) 10);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set21 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        java.lang.Object obj27 = defaultedMap9.put((java.lang.Object) set21, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap29.clear();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b36 = defaultedMap34.equals((java.lang.Object) (short) 10);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj40 = defaultedMap34.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set41 = defaultedMap34.keySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        java.lang.Object obj47 = defaultedMap29.put((java.lang.Object) set41, (java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection50 = defaultedMap49.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b54 = defaultedMap49.containsValue((java.lang.Object) 1);
        int i55 = defaultedMap49.size();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) i55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap58.clear();
        boolean b61 = defaultedMap58.containsKey((java.lang.Object) 10.0f);
        int i62 = defaultedMap58.size();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap64.clear();
        boolean b67 = defaultedMap64.containsKey((java.lang.Object) 10.0f);
        int i68 = defaultedMap64.size();
        defaultedMap58.putAll((java.util.Map) defaultedMap64);
        int i70 = defaultedMap58.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation73 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome74 = elitisticListPopulation73.iterator();
        java.lang.String str75 = elitisticListPopulation73.toString();
        int i76 = elitisticListPopulation73.getPopulationLimit();
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) elitisticListPopulation73);
        defaultedMap29.putAll(map77);
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) map77);
        boolean b80 = defaultedMap1.containsValue((java.lang.Object) map77);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome74);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "[]" + "'", str75.equals("[]"));
        org.junit.Assert.assertTrue(i76 == 1);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b80 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap7.clear();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) 10.0f);
        int i11 = defaultedMap7.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj22 = defaultedMap16.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set23 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection26 = defaultedMap25.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b30 = defaultedMap25.containsValue((java.lang.Object) 1);
        defaultedMap16.putAll((java.util.Map) defaultedMap25);
        java.util.Set set32 = defaultedMap25.keySet();
        boolean b33 = defaultedMap1.equals((java.lang.Object) defaultedMap25);
        java.util.Set set34 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap25);
        java.lang.String str36 = defaultedMap25.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome8 = null;
        try {
            elitisticListPopulation2.addChromosome(chromosome8);
            org.junit.Assert.fail("Expected exception of type math.exception.NumberIsTooLargeException");
        } catch (math.exception.NumberIsTooLargeException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection11 = defaultedMap10.values();
        defaultedMap10.clear();
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) map24);
        defaultedMap10.putAll(map24);
        boolean b27 = defaultedMap1.containsValue((java.lang.Object) map24);
        java.util.Collection collection28 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100.0f + "'", obj25.equals(100.0f));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        try {
            math.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection11 = defaultedMap10.values();
        defaultedMap10.clear();
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) map24);
        defaultedMap10.putAll(map24);
        boolean b27 = defaultedMap1.equals((java.lang.Object) map24);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100.0f + "'", obj25.equals(100.0f));
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Collection collection8 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation11.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation11.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation11.iterator();
        double d16 = elitisticListPopulation11.getElitismRate();
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation11);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertTrue(d16 == 0.0d);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap3.keySet();
        boolean b11 = defaultedMap3.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation14.iterator();
        boolean b16 = defaultedMap3.containsKey((java.lang.Object) elitisticListPopulation14);
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation14.getChromosomes();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation14);
        try {
            elitisticListPopulation14.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome17);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation2.spliterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap10.clear();
        boolean b13 = defaultedMap10.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (short) 10);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        int i31 = defaultedMap25.size();
        java.lang.Object obj32 = defaultedMap10.put((java.lang.Object) arraylist_chromosome21, (java.lang.Object) defaultedMap25);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        elitisticListPopulation2.setPopulationLimit(52);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome36 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(iterator_chromosome36);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap3.keySet();
        boolean b11 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap13.clear();
        boolean b16 = defaultedMap13.containsKey((java.lang.Object) 10.0f);
        int i17 = defaultedMap13.size();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        double d8 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) '#');
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation2.iterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap13.clear();
        boolean b16 = defaultedMap13.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Collection collection20 = defaultedMap13.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection20);
        try {
            math.genetics.Chromosome chromosome22 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.clear();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 1.0d);
        java.util.Map map10 = collections.map.DefaultedMap.decorate(map4, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.clear();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1.0d);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.Predicate predicate23 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate(map22, predicate23, predicate26);
        java.util.Map map31 = collections.map.DefaultedMap.decorate(map22, (java.lang.Object) (byte) 10);
        java.lang.Object obj32 = defaultedMap6.put((java.lang.Object) defaultedMap12, (java.lang.Object) map22);
        java.util.Set set33 = defaultedMap6.entrySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0f + "'", obj17.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection12 = defaultedMap11.values();
        defaultedMap11.clear();
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        java.lang.Object obj26 = defaultedMap17.get((java.lang.Object) map25);
        defaultedMap11.putAll(map25);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate44);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate31, predicate44);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0f + "'", obj6.equals(100.0f));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100.0f + "'", obj28.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        double d10 = elitisticListPopulation2.getElitismRate();
        int i11 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(d10 == 1.0d);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, 1.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap7.clear();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) 10.0f);
        int i11 = defaultedMap7.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj22 = defaultedMap16.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set23 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection26 = defaultedMap25.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b30 = defaultedMap25.containsValue((java.lang.Object) 1);
        defaultedMap16.putAll((java.util.Map) defaultedMap25);
        java.util.Set set32 = defaultedMap25.keySet();
        boolean b33 = defaultedMap1.equals((java.lang.Object) defaultedMap25);
        java.lang.String str34 = defaultedMap1.toString();
        java.util.Set set35 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set17 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap1.put((java.lang.Object) set17, (java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap30.clear();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 1.0d);
        java.util.Map map34 = collections.map.DefaultedMap.decorate(map28, (java.lang.Object) defaultedMap30);
        boolean b35 = defaultedMap1.containsValue((java.lang.Object) map34);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        double d8 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) '#');
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation2.iterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap13.clear();
        boolean b16 = defaultedMap13.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Collection collection20 = defaultedMap13.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection20);
        int i22 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(i22 == 2);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.clear();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 1.0d);
        java.util.Map map10 = collections.map.DefaultedMap.decorate(map4, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.clear();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1.0d);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.Predicate predicate23 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate(map22, predicate23, predicate26);
        java.util.Map map31 = collections.map.DefaultedMap.decorate(map22, (java.lang.Object) (byte) 10);
        java.lang.Object obj32 = defaultedMap6.put((java.lang.Object) defaultedMap12, (java.lang.Object) map22);
        java.util.Collection collection33 = defaultedMap6.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0f + "'", obj17.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap7.clear();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) 10.0f);
        int i11 = defaultedMap7.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        int i13 = defaultedMap1.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation16.iterator();
        java.lang.String str18 = elitisticListPopulation16.toString();
        int i19 = elitisticListPopulation16.getPopulationLimit();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation16);
        int i21 = elitisticListPopulation16.getPopulationSize();
        math.genetics.Population population22 = elitisticListPopulation16.nextGeneration();
        int i23 = elitisticListPopulation16.getPopulationLimit();
        try {
            math.genetics.Chromosome chromosome24 = elitisticListPopulation16.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(population22);
        org.junit.Assert.assertTrue(i23 == 1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(population3);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set17 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap1.put((java.lang.Object) set17, (java.lang.Object) predicate21);
        java.util.Set set24 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection9 = defaultedMap8.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b13 = defaultedMap8.containsValue((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection16 = defaultedMap15.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b20 = defaultedMap15.containsValue((java.lang.Object) 1);
        boolean b21 = defaultedMap8.containsKey((java.lang.Object) defaultedMap15);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) false);
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) false);
        collections.Transformer transformer25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.lang.String str4 = elitisticListPopulation2.toString();
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) iterator_chromosome3);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap7.clear();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) 10.0f);
        int i11 = defaultedMap7.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        int i13 = defaultedMap1.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation16.iterator();
        java.lang.String str18 = elitisticListPopulation16.toString();
        int i19 = elitisticListPopulation16.getPopulationLimit();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation16);
        int i21 = elitisticListPopulation16.getPopulationSize();
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation16.addChromosome(chromosome22);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        double d7 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation11.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation11.spliterator();
        double d15 = elitisticListPopulation11.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation18.setElitismRate((double) (short) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome21);
        elitisticListPopulation2.setChromosomes(list_chromosome21);
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue(d7 == 1.0d);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome21);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 1.0d);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection10 = defaultedMap9.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection17 = defaultedMap16.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b21 = defaultedMap16.containsValue((java.lang.Object) 1);
        boolean b22 = defaultedMap9.containsKey((java.lang.Object) defaultedMap16);
        java.util.Collection collection23 = defaultedMap9.values();
        int i24 = defaultedMap9.size();
        int i25 = defaultedMap9.size();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0f + "'", obj6.equals(100.0f));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        double d4 = elitisticListPopulation2.getElitismRate();
        int i5 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) map15);
        defaultedMap1.putAll(map15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection29 = defaultedMap28.values();
        defaultedMap28.clear();
        boolean b32 = defaultedMap28.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        java.lang.Object obj43 = defaultedMap34.get((java.lang.Object) map42);
        defaultedMap28.putAll(map42);
        boolean b45 = defaultedMap19.containsValue((java.lang.Object) map42);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap19);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome50 = elitisticListPopulation49.iterator();
        math.genetics.Chromosome chromosome51 = null;
        elitisticListPopulation49.addChromosome(chromosome51);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome53 = elitisticListPopulation49.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation49.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome55 = elitisticListPopulation49.spliterator();
        boolean b56 = defaultedMap19.equals((java.lang.Object) elitisticListPopulation49);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate59, predicate60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate64, predicate65);
        java.lang.Object obj67 = defaultedMap58.get((java.lang.Object) map66);
        java.util.Set set68 = defaultedMap58.entrySet();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b74 = defaultedMap72.equals((java.lang.Object) (short) 10);
        defaultedMap70.putAll((java.util.Map) defaultedMap72);
        java.lang.Object obj78 = defaultedMap72.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set79 = defaultedMap72.keySet();
        boolean b80 = defaultedMap72.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation83 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome84 = elitisticListPopulation83.iterator();
        java.lang.String str85 = elitisticListPopulation83.toString();
        boolean b86 = defaultedMap72.containsValue((java.lang.Object) elitisticListPopulation83);
        java.lang.String str87 = elitisticListPopulation83.toString();
        boolean b88 = defaultedMap58.equals((java.lang.Object) elitisticListPopulation83);
        boolean b89 = defaultedMap19.equals((java.lang.Object) elitisticListPopulation83);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100.0f + "'", obj16.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100.0f + "'", obj43.equals(100.0f));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(iterator_chromosome50);
        org.junit.Assert.assertNotNull(spliterator_chromosome53);
        org.junit.Assert.assertNotNull(list_chromosome54);
        org.junit.Assert.assertNotNull(spliterator_chromosome55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 100.0f + "'", obj67.equals(100.0f));
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome84);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "[]" + "'", str85.equals("[]"));
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "[]" + "'", str87.equals("[]"));
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue(b89 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        math.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        int i7 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.clear();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 10.0f);
        int i10 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.clear();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) 10.0f);
        int i16 = defaultedMap12.size();
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set28 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection31 = defaultedMap30.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b35 = defaultedMap30.containsValue((java.lang.Object) 1);
        defaultedMap21.putAll((java.util.Map) defaultedMap30);
        java.util.Set set37 = defaultedMap30.keySet();
        boolean b38 = defaultedMap6.equals((java.lang.Object) defaultedMap30);
        java.util.Set set39 = defaultedMap30.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap30);
        java.util.Set set41 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set41);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap3.keySet();
        boolean b11 = defaultedMap3.isEmpty();
        java.util.Set set12 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.lang.Object obj28 = defaultedMap19.get((java.lang.Object) map27);
        defaultedMap14.putAll(map27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        collections.Predicate predicate35 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate(map34, predicate35, predicate38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        java.lang.Object obj43 = defaultedMap3.put((java.lang.Object) map27, (java.lang.Object) defaultedMap42);
        boolean b44 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap46.clear();
        boolean b49 = defaultedMap46.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj52 = defaultedMap46.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        java.util.Collection collection53 = defaultedMap46.values();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap46);
        java.lang.Object obj55 = defaultedMap3.get((java.lang.Object) defaultedMap46);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100.0f + "'", obj28.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 100.0f + "'", obj55.equals(100.0f));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation9.setElitismRate((double) (short) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation9.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = list_chromosome12.spliterator();
        elitisticListPopulation2.setChromosomes(list_chromosome12);
        try {
            math.genetics.Chromosome chromosome15 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) map9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        defaultedMap1.putAll(map15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (short) 10);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        java.lang.Object obj35 = defaultedMap26.get((java.lang.Object) map34);
        java.util.Set set36 = defaultedMap26.entrySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b42 = defaultedMap40.equals((java.lang.Object) (short) 10);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj46 = defaultedMap40.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set47 = defaultedMap40.keySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection50 = defaultedMap49.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b54 = defaultedMap49.containsValue((java.lang.Object) 1);
        defaultedMap40.putAll((java.util.Map) defaultedMap49);
        java.lang.Object obj56 = defaultedMap26.remove((java.lang.Object) defaultedMap49);
        defaultedMap18.putAll((java.util.Map) defaultedMap26);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100.0f + "'", obj10.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100.0f + "'", obj24.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100.0f + "'", obj35.equals(100.0f));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        double d6 = elitisticListPopulation2.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (byte) 1, 1.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome13);
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap3.keySet();
        boolean b11 = defaultedMap3.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation14.iterator();
        java.lang.String str16 = elitisticListPopulation14.toString();
        boolean b17 = defaultedMap3.containsValue((java.lang.Object) elitisticListPopulation14);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.Predicate predicate23 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate(map22, predicate23, predicate26);
        java.util.Map map31 = collections.map.DefaultedMap.decorate(map22, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b37 = defaultedMap35.equals((java.lang.Object) (short) 10);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj41 = defaultedMap35.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set42 = defaultedMap35.keySet();
        boolean b43 = defaultedMap35.isEmpty();
        java.util.Set set44 = defaultedMap35.entrySet();
        java.util.Map map45 = collections.map.DefaultedMap.decorate(map22, (java.lang.Object) defaultedMap35);
        boolean b46 = defaultedMap3.containsKey((java.lang.Object) defaultedMap35);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) map9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        defaultedMap1.putAll(map15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Collection collection18 = defaultedMap17.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100.0f + "'", obj10.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap14.clear();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) defaultedMap14);
        defaultedMap1.putAll(map18);
        java.lang.String str20 = defaultedMap1.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation23.iterator();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) iterator_chromosome24);
        java.lang.String str26 = defaultedMap25.toString();
        boolean b27 = defaultedMap1.containsValue((java.lang.Object) defaultedMap25);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0f + "'", obj6.equals(100.0f));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(iterator_chromosome24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap3.keySet();
        boolean b11 = defaultedMap3.isEmpty();
        java.util.Set set12 = defaultedMap3.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation15.addChromosome(chromosome16);
        int i18 = elitisticListPopulation15.getPopulationLimit();
        java.lang.Object obj19 = defaultedMap3.get((java.lang.Object) i18);
        defaultedMap3.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation23.iterator();
        math.genetics.Chromosome chromosome25 = null;
        elitisticListPopulation23.addChromosome(chromosome25);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = elitisticListPopulation23.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation23.getChromosomes();
        java.lang.Object obj29 = defaultedMap3.get((java.lang.Object) elitisticListPopulation23);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) 100 + "'", obj19.equals((byte) 100));
        org.junit.Assert.assertNotNull(iterator_chromosome24);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100.0f + "'", obj29.equals(100.0f));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        double d8 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) '#');
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(list_chromosome13, 0, (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[null]" + "'", str11.equals("[null]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
        org.junit.Assert.assertNotNull(list_chromosome13);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) map9);
        java.util.Set set11 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (short) 10);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set22 = defaultedMap15.keySet();
        boolean b23 = defaultedMap15.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome27 = elitisticListPopulation26.iterator();
        java.lang.String str28 = elitisticListPopulation26.toString();
        boolean b29 = defaultedMap15.containsValue((java.lang.Object) elitisticListPopulation26);
        java.lang.String str30 = elitisticListPopulation26.toString();
        boolean b31 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation26);
        int i32 = elitisticListPopulation26.getPopulationSize();
        math.genetics.Population population33 = elitisticListPopulation26.nextGeneration();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100.0f + "'", obj10.equals(100.0f));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]" + "'", str28.equals("[]"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]" + "'", str30.equals("[]"));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(population33);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) map9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        defaultedMap1.putAll(map15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (short) 10);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap18);
        collections.Transformer transformer25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, transformer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100.0f + "'", obj10.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100.0f + "'", obj24.equals(100.0f));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.clear();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 10.0f);
        int i10 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.clear();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) 10.0f);
        int i16 = defaultedMap12.size();
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set28 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection31 = defaultedMap30.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b35 = defaultedMap30.containsValue((java.lang.Object) 1);
        defaultedMap21.putAll((java.util.Map) defaultedMap30);
        java.util.Set set37 = defaultedMap30.keySet();
        boolean b38 = defaultedMap6.equals((java.lang.Object) defaultedMap30);
        java.util.Set set39 = defaultedMap30.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (short) 10);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj50 = defaultedMap44.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set51 = defaultedMap44.keySet();
        boolean b52 = defaultedMap44.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome56 = elitisticListPopulation55.iterator();
        boolean b57 = defaultedMap44.containsKey((java.lang.Object) elitisticListPopulation55);
        boolean b58 = defaultedMap1.containsValue((java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection61 = defaultedMap60.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b65 = defaultedMap60.containsValue((java.lang.Object) 1);
        int i66 = defaultedMap60.size();
        java.util.Collection collection67 = defaultedMap60.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation70 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        math.genetics.Chromosome chromosome71 = null;
        elitisticListPopulation70.addChromosome(chromosome71);
        math.genetics.Population population73 = elitisticListPopulation70.nextGeneration();
        java.lang.Object obj74 = defaultedMap44.put((java.lang.Object) collection67, (java.lang.Object) elitisticListPopulation70);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(population73);
        org.junit.Assert.assertNull(obj74);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        boolean b10 = defaultedMap3.isEmpty();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap3.keySet();
        boolean b11 = defaultedMap3.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation14.iterator();
        java.lang.String str16 = elitisticListPopulation14.toString();
        boolean b17 = defaultedMap3.containsValue((java.lang.Object) elitisticListPopulation14);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap19.clear();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj25 = defaultedMap19.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation28.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (short) 10);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        int i40 = defaultedMap34.size();
        java.lang.Object obj41 = defaultedMap19.put((java.lang.Object) arraylist_chromosome30, (java.lang.Object) defaultedMap34);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation44.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome47 = elitisticListPopulation44.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome48 = elitisticListPopulation44.iterator();
        boolean b49 = defaultedMap19.equals((java.lang.Object) iterator_chromosome48);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation52.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome55 = elitisticListPopulation52.spliterator();
        java.lang.Object obj56 = defaultedMap3.put((java.lang.Object) defaultedMap19, (java.lang.Object) elitisticListPopulation52);
        java.util.Set set57 = defaultedMap19.keySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(spliterator_chromosome47);
        org.junit.Assert.assertNotNull(iterator_chromosome48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap7.clear();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) 10.0f);
        int i11 = defaultedMap7.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection15 = defaultedMap14.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b19 = defaultedMap14.containsValue((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection22 = defaultedMap21.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b26 = defaultedMap21.containsValue((java.lang.Object) 1);
        boolean b27 = defaultedMap14.containsKey((java.lang.Object) defaultedMap21);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) false);
        java.lang.Object obj30 = defaultedMap7.get((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str33 = defaultedMap32.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap32);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 100.0f + "'", obj30.equals(100.0f));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection9 = defaultedMap8.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b13 = defaultedMap8.containsValue((java.lang.Object) 1);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        java.util.Collection collection15 = defaultedMap1.values();
        int i16 = defaultedMap1.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation19.iterator();
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation19.addChromosome(chromosome21);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome23 = elitisticListPopulation19.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation19.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome25 = elitisticListPopulation19.spliterator();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap27.clear();
        boolean b30 = defaultedMap27.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj33 = defaultedMap27.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        elitisticListPopulation36.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (short) 10);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        int i48 = defaultedMap42.size();
        java.lang.Object obj49 = defaultedMap27.put((java.lang.Object) arraylist_chromosome38, (java.lang.Object) defaultedMap42);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38);
        java.lang.Object obj51 = defaultedMap1.get((java.lang.Object) arraylist_chromosome38);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertNotNull(spliterator_chromosome23);
        org.junit.Assert.assertNotNull(list_chromosome24);
        org.junit.Assert.assertNotNull(spliterator_chromosome25);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 100.0f + "'", obj51.equals(100.0f));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap14.clear();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) defaultedMap14);
        defaultedMap1.putAll(map18);
        java.lang.String str20 = defaultedMap1.toString();
        java.util.Collection collection21 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0f + "'", obj6.equals(100.0f));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap14.clear();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) defaultedMap14);
        defaultedMap1.putAll(map18);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome23 = elitisticListPopulation22.iterator();
        java.lang.String str24 = elitisticListPopulation22.toString();
        int i25 = elitisticListPopulation22.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation22.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) arraylist_chromosome27, obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap33.clear();
        boolean b36 = defaultedMap33.containsKey((java.lang.Object) 10.0f);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome41 = elitisticListPopulation40.iterator();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation40);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0f + "'", obj6.equals(100.0f));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(iterator_chromosome23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(iterator_chromosome41);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        double d7 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit(52);
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(d7 == 0.0d);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap3.keySet();
        boolean b11 = defaultedMap3.isEmpty();
        java.util.Set set12 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.lang.Object obj28 = defaultedMap19.get((java.lang.Object) map27);
        defaultedMap14.putAll(map27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        collections.Predicate predicate35 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate(map34, predicate35, predicate38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        java.lang.Object obj43 = defaultedMap3.put((java.lang.Object) map27, (java.lang.Object) defaultedMap42);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome47 = elitisticListPopulation46.iterator();
        java.lang.Object obj48 = defaultedMap3.remove((java.lang.Object) elitisticListPopulation46);
        java.util.Set set49 = defaultedMap3.keySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100.0f + "'", obj28.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(iterator_chromosome47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap7.clear();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) 10.0f);
        int i11 = defaultedMap7.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj22 = defaultedMap16.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set23 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection26 = defaultedMap25.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        boolean b30 = defaultedMap25.containsValue((java.lang.Object) 1);
        defaultedMap16.putAll((java.util.Map) defaultedMap25);
        java.util.Set set32 = defaultedMap25.keySet();
        boolean b33 = defaultedMap1.equals((java.lang.Object) defaultedMap25);
        java.util.Set set34 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        collections.Predicate predicate41 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate(map40, predicate41, predicate44);
        java.util.Map map49 = collections.map.DefaultedMap.decorate(map40, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap51.clear();
        boolean b54 = defaultedMap51.containsKey((java.lang.Object) 10.0f);
        java.lang.Object obj57 = defaultedMap51.put((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        math.genetics.Chromosome[] chromosome_array61 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome62 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b63 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome62, chromosome_array61);
        elitisticListPopulation60.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome62);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b70 = defaultedMap68.equals((java.lang.Object) (short) 10);
        defaultedMap66.putAll((java.util.Map) defaultedMap68);
        int i72 = defaultedMap66.size();
        java.lang.Object obj73 = defaultedMap51.put((java.lang.Object) arraylist_chromosome62, (java.lang.Object) defaultedMap66);
        java.util.Map map74 = collections.map.DefaultedMap.decorate(map49, (java.lang.Object) defaultedMap51);
        java.lang.Object obj75 = defaultedMap25.get((java.lang.Object) defaultedMap51);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(chromosome_array61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 100.0f + "'", obj75.equals(100.0f));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1);
        double d3 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(d3 == 1.0d);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap3.keySet();
        boolean b11 = defaultedMap3.isEmpty();
        java.util.Set set12 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.lang.Object obj28 = defaultedMap19.get((java.lang.Object) map27);
        defaultedMap14.putAll(map27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        collections.Predicate predicate35 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate(map34, predicate35, predicate38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        java.lang.Object obj43 = defaultedMap3.put((java.lang.Object) map27, (java.lang.Object) defaultedMap42);
        java.util.Set set44 = defaultedMap42.entrySet();
        int i45 = defaultedMap42.size();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100.0f + "'", obj28.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(i45 == 0);
    }
}

