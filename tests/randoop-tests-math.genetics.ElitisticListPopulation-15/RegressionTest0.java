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
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 0, (double) '#');
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '4', (double) (short) 10);
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
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        try {
            elitisticListPopulation5.setElitismRate((double) '#');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 10, (double) '4');
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
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) 1L);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, 1.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) -1, 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        boolean b4 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        try {
            math.genetics.Chromosome chromosome16 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        int i4 = defaultedMap1.size();
        boolean b5 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (-1), (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        try {
            elitisticListPopulation5.setPopulationLimit((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 0, (double) (-1L));
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
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        double d7 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(d7 == 0.0d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Population population18 = elitisticListPopulation5.nextGeneration();
        try {
            math.genetics.Chromosome chromosome19 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(population18);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) -1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection8 = defaultedMap7.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) (-1));
        int i14 = defaultedMap11.size();
        java.lang.Object obj16 = defaultedMap11.remove((java.lang.Object) 100L);
        boolean b17 = defaultedMap1.equals((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 100 + "'", obj13.equals((short) 100));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome13);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation5.addChromosome(chromosome15);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome17 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(spliterator_chromosome17);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, 1, 0.0d);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) i12);
        java.util.Collection collection14 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.String str4 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, 1, 0.0d);
        int i14 = elitisticListPopulation13.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome21);
        int i23 = elitisticListPopulation13.getPopulationLimit();
        int i24 = elitisticListPopulation13.getPopulationSize();
        elitisticListPopulation13.setElitismRate((double) (byte) 1);
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 100 + "'", obj27.equals((short) 100));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection2 = defaultedMap1.values();
        int i3 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) defaultedMap19);
        boolean b21 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) collection24);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection24);
        int i27 = elitisticListPopulation5.getPopulationLimit();
        int i28 = elitisticListPopulation5.getPopulationSize();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj33 = defaultedMap30.get((java.lang.Object) defaultedMap32);
        boolean b34 = defaultedMap30.isEmpty();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection37 = defaultedMap36.values();
        java.lang.Object obj38 = defaultedMap30.get((java.lang.Object) collection37);
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40, 1, 0.0d);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) arraylist_chromosome40);
        java.lang.Object obj46 = defaultedMap30.remove((java.lang.Object) arraylist_chromosome40);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 100 + "'", obj20.equals((short) 100));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) 100 + "'", obj33.equals((short) 100));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 100 + "'", obj38.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        double d16 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation5.addChromosome(chromosome17);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(d16 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = list_chromosome6.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) false);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        int i10 = defaultedMap1.size();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 100 + "'", obj12.equals((short) 100));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        double d16 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation5.addChromosome(chromosome17);
        double d19 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(d16 == 0.0d);
        org.junit.Assert.assertTrue(d19 == 0.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.lang.String str6 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        try {
            elitisticListPopulation5.setElitismRate((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj12 = defaultedMap9.get((java.lang.Object) defaultedMap11);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome19 = elitisticListPopulation18.spliterator();
        boolean b20 = defaultedMap9.equals((java.lang.Object) elitisticListPopulation18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) defaultedMap24);
        defaultedMap9.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj32 = defaultedMap29.get((java.lang.Object) defaultedMap31);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome39 = elitisticListPopulation38.spliterator();
        boolean b40 = defaultedMap29.equals((java.lang.Object) elitisticListPopulation38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj45 = defaultedMap42.get((java.lang.Object) defaultedMap44);
        defaultedMap29.putAll((java.util.Map) defaultedMap44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap50.clear();
        java.util.Set set52 = defaultedMap50.entrySet();
        java.lang.Object obj53 = defaultedMap48.get((java.lang.Object) set52);
        boolean b54 = defaultedMap29.equals((java.lang.Object) defaultedMap48);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap48);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 100 + "'", obj12.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 100 + "'", obj32.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) 100 + "'", obj45.equals((short) 100));
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 100 + "'", obj53.equals((short) 100));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.String str4 = defaultedMap1.toString();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) arraylist_chromosome1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, 1, 0.0d);
        double d15 = elitisticListPopulation14.getElitismRate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap17.clear();
        java.lang.Object obj20 = defaultedMap17.remove((java.lang.Object) false);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) (-1L));
        collections.Predicate predicate23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate23, predicate24);
        java.lang.Object obj26 = defaultedMap8.put((java.lang.Object) d15, (java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap28.clear();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) false);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (-1L));
        collections.Predicate predicate34 = null;
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate34, predicate35);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap28);
        java.lang.Object obj38 = defaultedMap6.get((java.lang.Object) map37);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        int i16 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setElitismRate((double) (byte) 1);
        int i19 = elitisticListPopulation5.getPopulationSize();
        try {
            math.genetics.Chromosome chromosome20 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Population population18 = elitisticListPopulation5.nextGeneration();
        int i19 = elitisticListPopulation5.getPopulationLimit();
        double d20 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        int i7 = elitisticListPopulation5.getPopulationSize();
        int i8 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) false);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0.0d);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) false);
        java.util.Collection collection5 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, 1, 0.0d);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) i12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, 1, 0.0d);
        int i20 = elitisticListPopulation19.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation26.getChromosomes();
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome27);
        int i29 = elitisticListPopulation19.getPopulationLimit();
        elitisticListPopulation19.setPopulationLimit((int) (byte) 1);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 1);
        java.lang.String str33 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) defaultedMap12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = elitisticListPopulation19.spliterator();
        boolean b21 = defaultedMap10.equals((java.lang.Object) elitisticListPopulation19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj26 = defaultedMap23.get((java.lang.Object) defaultedMap25);
        boolean b27 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection30 = defaultedMap29.values();
        java.lang.Object obj31 = defaultedMap23.get((java.lang.Object) collection30);
        boolean b32 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap34.clear();
        java.lang.Object obj37 = defaultedMap34.remove((java.lang.Object) false);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (-1L));
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        boolean b41 = defaultedMap34.equals((java.lang.Object) predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate40, predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate42, predicate44);
        math.genetics.Chromosome[] chromosome_array46 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome47 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b48 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome47, chromosome_array46);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome47, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation51.getChromosomes();
        java.lang.Object obj53 = defaultedMap1.put((java.lang.Object) predicate42, (java.lang.Object) elitisticListPopulation51);
        java.lang.String str54 = elitisticListPopulation51.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 100 + "'", obj13.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 100 + "'", obj26.equals((short) 100));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 100 + "'", obj31.equals((short) 100));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(chromosome_array46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(list_chromosome52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "[]" + "'", str54.equals("[]"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj10 = defaultedMap7.get((java.lang.Object) defaultedMap9);
        boolean b11 = defaultedMap7.isEmpty();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (-1L));
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.String str15 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 100 + "'", obj10.equals((short) 100));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        int i16 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation5.addChromosome(chromosome17);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome19 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome19);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        elitisticListPopulation5.setPopulationLimit(100);
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation5.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection8 = defaultedMap7.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection10 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        elitisticListPopulation5.setPopulationLimit(100);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18, 1, 0.0d);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome24 = elitisticListPopulation5.spliterator();
        try {
            math.genetics.Chromosome chromosome25 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome24);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, 0.0d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection8 = defaultedMap7.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) defaultedMap11);
        java.lang.String str14 = defaultedMap11.toString();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 100 + "'", obj13.equals((short) 100));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection8 = defaultedMap7.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap15.clear();
        java.util.Set set17 = defaultedMap15.entrySet();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, 1, 0.0d);
        int i26 = elitisticListPopulation25.getPopulationLimit();
        boolean b27 = defaultedMap15.containsValue((java.lang.Object) i26);
        boolean b28 = defaultedMap11.containsKey((java.lang.Object) b27);
        boolean b29 = defaultedMap11.isEmpty();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 100 + "'", obj13.equals((short) 100));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj12 = defaultedMap9.get((java.lang.Object) defaultedMap11);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome19 = elitisticListPopulation18.spliterator();
        boolean b20 = defaultedMap9.equals((java.lang.Object) elitisticListPopulation18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) defaultedMap24);
        defaultedMap9.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj32 = defaultedMap29.get((java.lang.Object) defaultedMap31);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome39 = elitisticListPopulation38.spliterator();
        boolean b40 = defaultedMap29.equals((java.lang.Object) elitisticListPopulation38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj45 = defaultedMap42.get((java.lang.Object) defaultedMap44);
        defaultedMap29.putAll((java.util.Map) defaultedMap44);
        boolean b47 = defaultedMap9.containsValue((java.lang.Object) defaultedMap29);
        java.util.Set set48 = defaultedMap9.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 100 + "'", obj12.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 100 + "'", obj32.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) 100 + "'", obj45.equals((short) 100));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, 1, 0.0d);
        double d8 = elitisticListPopulation7.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap10.clear();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) false);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (-1L));
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate17);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) d8, (java.lang.Object) predicate16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap21.clear();
        java.util.Set set23 = defaultedMap21.entrySet();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, 1, 0.0d);
        int i32 = elitisticListPopulation31.getPopulationLimit();
        boolean b33 = defaultedMap21.containsValue((java.lang.Object) i32);
        int i34 = defaultedMap21.size();
        java.lang.String str35 = defaultedMap21.toString();
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) str35);
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection8 = defaultedMap7.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) collection8);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.equals((java.lang.Object) 100L);
        int i13 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj18 = defaultedMap15.get((java.lang.Object) defaultedMap17);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome25 = elitisticListPopulation24.spliterator();
        boolean b26 = defaultedMap15.equals((java.lang.Object) elitisticListPopulation24);
        math.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation24.addChromosome(chromosome27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) chromosome27);
        java.util.Set set30 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap32.clear();
        java.lang.Object obj35 = defaultedMap32.remove((java.lang.Object) false);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) (-1L));
        collections.Predicate predicate38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate38, predicate39);
        java.lang.Object obj41 = defaultedMap1.put((java.lang.Object) set30, (java.lang.Object) map40);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 100 + "'", obj9.equals((short) 100));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation5.addChromosome(chromosome16);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        int i7 = elitisticListPopulation5.getPopulationSize();
        java.lang.String str8 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation10.spliterator();
        boolean b12 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation10);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation10.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) chromosome13);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) set16);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj12 = defaultedMap9.get((java.lang.Object) defaultedMap11);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome19 = elitisticListPopulation18.spliterator();
        boolean b20 = defaultedMap9.equals((java.lang.Object) elitisticListPopulation18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) defaultedMap24);
        defaultedMap9.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj32 = defaultedMap29.get((java.lang.Object) defaultedMap31);
        boolean b33 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection36 = defaultedMap35.values();
        java.lang.Object obj37 = defaultedMap29.get((java.lang.Object) collection36);
        boolean b38 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap40.clear();
        java.lang.Object obj43 = defaultedMap40.remove((java.lang.Object) false);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) (-1L));
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        boolean b47 = defaultedMap40.equals((java.lang.Object) predicate46);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate46, predicate48);
        boolean b50 = defaultedMap1.containsKey((java.lang.Object) predicate46);
        int i51 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 100 + "'", obj12.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 100 + "'", obj32.equals((short) 100));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 100 + "'", obj37.equals((short) 100));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i51 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection8 = defaultedMap7.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection8 = defaultedMap7.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj18 = defaultedMap15.get((java.lang.Object) defaultedMap17);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome25 = elitisticListPopulation24.spliterator();
        boolean b26 = defaultedMap15.equals((java.lang.Object) elitisticListPopulation24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj31 = defaultedMap28.get((java.lang.Object) defaultedMap30);
        boolean b32 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection35 = defaultedMap34.values();
        java.lang.Object obj36 = defaultedMap28.get((java.lang.Object) collection35);
        boolean b37 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap39.clear();
        java.lang.Object obj42 = defaultedMap39.remove((java.lang.Object) false);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) (-1L));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        boolean b46 = defaultedMap39.equals((java.lang.Object) predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate45, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate47, predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap52.clear();
        java.lang.Object obj55 = defaultedMap52.remove((java.lang.Object) false);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) (-1L));
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        boolean b59 = defaultedMap52.equals((java.lang.Object) predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate49, predicate58);
        java.util.Map map61 = null;
        try {
            defaultedMap11.putAll(map61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 100 + "'", obj13.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 100 + "'", obj31.equals((short) 100));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 100 + "'", obj36.equals((short) 100));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, 1, 0.0d);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome19);
        int i21 = elitisticListPopulation11.getPopulationLimit();
        elitisticListPopulation11.setPopulationLimit((int) (byte) 1);
        math.genetics.Population population24 = elitisticListPopulation11.nextGeneration();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) population24);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap9.clear();
        java.lang.Object obj12 = defaultedMap9.remove((java.lang.Object) false);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, 1, 0.0d);
        double d19 = elitisticListPopulation18.getElitismRate();
        java.lang.Object obj20 = defaultedMap9.get((java.lang.Object) d19);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Set set22 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 100 + "'", obj20.equals((short) 100));
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        int i16 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation5.addChromosome(chromosome17);
        int i19 = elitisticListPopulation5.getPopulationSize();
        int i20 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) false);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, 1, 0.0d);
        double d11 = elitisticListPopulation10.getElitismRate();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) d11);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, 1, 0.0d);
        int i19 = elitisticListPopulation18.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome26);
        int i28 = elitisticListPopulation18.getPopulationLimit();
        int i29 = elitisticListPopulation18.getPopulationSize();
        boolean b30 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation18);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection33 = defaultedMap32.values();
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection33);
        double d35 = elitisticListPopulation18.getElitismRate();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 100 + "'", obj12.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(list_chromosome26);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(d35 == 0.0d);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        int i18 = elitisticListPopulation5.getPopulationLimit();
        int i19 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation10.spliterator();
        boolean b12 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation10);
        int i13 = elitisticListPopulation10.getPopulationSize();
        math.genetics.Population population14 = elitisticListPopulation10.nextGeneration();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, 1, 0.0d);
        int i21 = elitisticListPopulation20.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome28);
        int i30 = elitisticListPopulation20.getPopulationLimit();
        double d31 = elitisticListPopulation20.getElitismRate();
        math.genetics.Chromosome chromosome32 = null;
        elitisticListPopulation20.addChromosome(chromosome32);
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation10.setChromosomes(list_chromosome34);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertTrue(d31 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome34);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap9.clear();
        java.lang.Object obj12 = defaultedMap9.remove((java.lang.Object) false);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, 1, 0.0d);
        double d19 = elitisticListPopulation18.getElitismRate();
        java.lang.Object obj20 = defaultedMap9.get((java.lang.Object) d19);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, 1, 0.0d);
        int i28 = elitisticListPopulation27.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome35);
        int i37 = elitisticListPopulation27.getPopulationLimit();
        elitisticListPopulation27.setPopulationLimit((int) (byte) 1);
        math.genetics.Population population40 = elitisticListPopulation27.nextGeneration();
        int i41 = elitisticListPopulation27.getPopulationLimit();
        math.genetics.Population population42 = elitisticListPopulation27.nextGeneration();
        boolean b43 = defaultedMap1.containsValue((java.lang.Object) population42);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 100 + "'", obj20.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertTrue(i37 == 1);
        org.junit.Assert.assertNotNull(population40);
        org.junit.Assert.assertTrue(i41 == 1);
        org.junit.Assert.assertNotNull(population42);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) defaultedMap19);
        boolean b21 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) collection24);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection24);
        int i27 = elitisticListPopulation5.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj32 = defaultedMap29.get((java.lang.Object) defaultedMap31);
        boolean b33 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection36 = defaultedMap35.values();
        java.lang.Object obj37 = defaultedMap29.get((java.lang.Object) collection36);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, 1, 0.0d);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) arraylist_chromosome39);
        java.lang.Object obj45 = defaultedMap29.remove((java.lang.Object) arraylist_chromosome39);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) (byte) 100, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 100 + "'", obj20.equals((short) 100));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 100 + "'", obj32.equals((short) 100));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 100 + "'", obj37.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        double d7 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d7 == 0.0d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection8 = defaultedMap7.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, 1, 0.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation15.iterator();
        math.genetics.Population population17 = elitisticListPopulation15.nextGeneration();
        boolean b18 = defaultedMap7.equals((java.lang.Object) elitisticListPopulation15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) b18);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertNotNull(population17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap5.clear();
        java.lang.Object obj8 = defaultedMap5.remove((java.lang.Object) false);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) (-1L));
        collections.Predicate predicate11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) defaultedMap19);
        boolean b21 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) collection24);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) (-1));
        int i32 = defaultedMap29.size();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) (-1));
        int i37 = defaultedMap34.size();
        java.util.Set set38 = defaultedMap34.entrySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap40.clear();
        java.lang.Object obj43 = defaultedMap40.remove((java.lang.Object) false);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) (-1L));
        collections.Predicate predicate46 = null;
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap40);
        java.lang.String str50 = defaultedMap40.toString();
        int i51 = defaultedMap40.size();
        java.lang.Object obj52 = defaultedMap29.put((java.lang.Object) defaultedMap34, (java.lang.Object) i51);
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54, 1, 0.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome59 = elitisticListPopulation58.iterator();
        math.genetics.Population population60 = elitisticListPopulation58.nextGeneration();
        java.lang.Object obj61 = defaultedMap17.put((java.lang.Object) defaultedMap34, (java.lang.Object) elitisticListPopulation58);
        boolean b62 = defaultedMap5.containsValue(obj61);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 100 + "'", obj20.equals((short) 100));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 100 + "'", obj31.equals((short) 100));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 100 + "'", obj36.equals((short) 100));
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome59);
        org.junit.Assert.assertNotNull(population60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b62 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, 1, 0.0d);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) i12);
        int i14 = defaultedMap1.size();
        java.util.Set set15 = defaultedMap1.entrySet();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 100 + "'", obj17.equals((short) 100));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap5.isEmpty();
        java.lang.String str8 = defaultedMap5.toString();
        java.lang.String str9 = defaultedMap5.toString();
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) str9);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection8 = defaultedMap7.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj18 = defaultedMap15.get((java.lang.Object) defaultedMap17);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome25 = elitisticListPopulation24.spliterator();
        boolean b26 = defaultedMap15.equals((java.lang.Object) elitisticListPopulation24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj31 = defaultedMap28.get((java.lang.Object) defaultedMap30);
        boolean b32 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection35 = defaultedMap34.values();
        java.lang.Object obj36 = defaultedMap28.get((java.lang.Object) collection35);
        boolean b37 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap39.clear();
        java.lang.Object obj42 = defaultedMap39.remove((java.lang.Object) false);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) (-1L));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        boolean b46 = defaultedMap39.equals((java.lang.Object) predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate45, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate47, predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap52.clear();
        java.lang.Object obj55 = defaultedMap52.remove((java.lang.Object) false);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) (-1L));
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        boolean b59 = defaultedMap52.equals((java.lang.Object) predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate49, predicate58);
        int i61 = defaultedMap11.size();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 100 + "'", obj13.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 100 + "'", obj31.equals((short) 100));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 100 + "'", obj36.equals((short) 100));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(i61 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome15 = list_chromosome13.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(spliterator_chromosome15);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) defaultedMap19);
        boolean b21 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) collection24);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection24);
        int i27 = elitisticListPopulation5.getPopulationLimit();
        int i28 = elitisticListPopulation5.getPopulationSize();
        double d29 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 100 + "'", obj20.equals((short) 100));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(d29 == 0.0d);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        int i2 = defaultedMap1.size();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.containsValue(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap6.clear();
        java.util.Set set8 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap10.clear();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) false);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (-1L));
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        defaultedMap6.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) defaultedMap24);
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome32 = elitisticListPopulation31.spliterator();
        boolean b33 = defaultedMap22.equals((java.lang.Object) elitisticListPopulation31);
        math.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation31.addChromosome(chromosome34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) chromosome34);
        int i37 = defaultedMap36.size();
        java.util.Set set38 = defaultedMap36.keySet();
        boolean b39 = defaultedMap6.equals((java.lang.Object) defaultedMap36);
        java.lang.String str40 = defaultedMap6.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap43.clear();
        java.util.Set set45 = defaultedMap43.entrySet();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) 10);
        java.lang.String str48 = defaultedMap43.toString();
        java.lang.Object obj49 = defaultedMap1.get((java.lang.Object) str48);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (short) 100 + "'", obj49.equals((short) 100));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap7.clear();
        java.util.Set set9 = defaultedMap7.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, 1, 0.0d);
        int i18 = elitisticListPopulation17.getPopulationLimit();
        boolean b19 = defaultedMap7.containsValue((java.lang.Object) i18);
        int i20 = defaultedMap7.size();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) i20);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 100 + "'", obj21.equals((short) 100));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome13);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation5.addChromosome(chromosome15);
        double d17 = elitisticListPopulation5.getElitismRate();
        int i18 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, 1, 0.0d);
        int i25 = elitisticListPopulation24.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome32);
        elitisticListPopulation24.setPopulationLimit(100);
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome36);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(d17 == 0.0d);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertNotNull(list_chromosome36);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        int i18 = elitisticListPopulation5.getPopulationSize();
        double d19 = elitisticListPopulation5.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(list_chromosome20, (int) (short) 10, (double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome20);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection8 = defaultedMap7.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) (-1));
        int i14 = defaultedMap11.size();
        java.lang.Object obj16 = defaultedMap11.remove((java.lang.Object) 100L);
        boolean b17 = defaultedMap7.containsKey(obj16);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 100 + "'", obj13.equals((short) 100));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        java.lang.String str7 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        java.util.Set set7 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap7.clear();
        java.util.Set set9 = defaultedMap7.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, 1, 0.0d);
        int i18 = elitisticListPopulation17.getPopulationLimit();
        boolean b19 = defaultedMap7.containsValue((java.lang.Object) i18);
        int i20 = defaultedMap7.size();
        java.lang.String str21 = defaultedMap7.toString();
        boolean b22 = defaultedMap1.equals((java.lang.Object) str21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b26 = defaultedMap24.containsValue((java.lang.Object) (-1.0f));
        boolean b28 = defaultedMap24.equals((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b32 = defaultedMap30.containsValue((java.lang.Object) (-1.0f));
        boolean b34 = defaultedMap30.equals((java.lang.Object) 100.0d);
        java.util.Collection collection35 = defaultedMap30.values();
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap24, (java.lang.Object) defaultedMap30);
        java.util.Collection collection37 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) false);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        int i10 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj15 = defaultedMap12.get((java.lang.Object) defaultedMap14);
        boolean b16 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection19 = defaultedMap18.values();
        java.lang.Object obj20 = defaultedMap12.get((java.lang.Object) collection19);
        int i21 = defaultedMap12.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (short) 100 + "'", obj15.equals((short) 100));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 100 + "'", obj20.equals((short) 100));
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        java.util.Set set8 = defaultedMap1.keySet();
        boolean b9 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) defaultedMap13);
        boolean b15 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection18 = defaultedMap17.values();
        defaultedMap11.putAll((java.util.Map) defaultedMap17);
        java.util.Set set20 = defaultedMap17.entrySet();
        boolean b21 = defaultedMap1.containsKey((java.lang.Object) set20);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, 1, 0.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome28 = elitisticListPopulation27.iterator();
        int i29 = elitisticListPopulation27.getPopulationSize();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) i29);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 100 + "'", obj14.equals((short) 100));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, 1, 0.0d);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) i12);
        int i14 = defaultedMap1.size();
        java.util.Set set15 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) defaultedMap19);
        boolean b21 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) collection24);
        boolean b26 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap28.clear();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) false);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (-1L));
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        boolean b35 = defaultedMap28.equals((java.lang.Object) predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate34, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate(map37, predicate38, predicate39);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicate39);
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj47 = defaultedMap44.get((java.lang.Object) defaultedMap46);
        boolean b48 = defaultedMap44.isEmpty();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection51 = defaultedMap50.values();
        java.lang.Object obj52 = defaultedMap44.get((java.lang.Object) collection51);
        boolean b53 = defaultedMap44.isEmpty();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap55.clear();
        java.lang.Object obj58 = defaultedMap55.remove((java.lang.Object) false);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) (-1L));
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        boolean b62 = defaultedMap55.equals((java.lang.Object) predicate61);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate61, predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate(map64, predicate65, predicate66);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) predicate66);
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) predicate69);
        boolean b71 = defaultedMap1.containsValue((java.lang.Object) predicate69);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 100 + "'", obj20.equals((short) 100));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (short) 100 + "'", obj47.equals((short) 100));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (short) 100 + "'", obj52.equals((short) 100));
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        int i18 = elitisticListPopulation5.getPopulationSize();
        int i19 = elitisticListPopulation5.getPopulationLimit();
        int i20 = elitisticListPopulation5.getPopulationLimit();
        try {
            elitisticListPopulation5.setElitismRate((double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Population population18 = elitisticListPopulation5.nextGeneration();
        math.genetics.Population population19 = elitisticListPopulation5.nextGeneration();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap21.clear();
        java.lang.Object obj24 = defaultedMap21.remove((java.lang.Object) false);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, 1, 0.0d);
        double d31 = elitisticListPopulation30.getElitismRate();
        java.lang.Object obj32 = defaultedMap21.get((java.lang.Object) d31);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, 1, 0.0d);
        int i39 = elitisticListPopulation38.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome41, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome46 = elitisticListPopulation45.getChromosomes();
        elitisticListPopulation38.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome46);
        int i48 = elitisticListPopulation38.getPopulationLimit();
        int i49 = elitisticListPopulation38.getPopulationSize();
        boolean b50 = defaultedMap21.containsValue((java.lang.Object) elitisticListPopulation38);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection53 = defaultedMap52.values();
        elitisticListPopulation38.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection53);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection53);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(d31 == 0.0d);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 100 + "'", obj32.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i39 == 1);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(list_chromosome46);
        org.junit.Assert.assertTrue(i48 == 1);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(collection53);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, 1, 0.0d);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) i12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj18 = defaultedMap15.get((java.lang.Object) defaultedMap17);
        java.util.Collection collection19 = defaultedMap15.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj24 = defaultedMap21.get((java.lang.Object) defaultedMap23);
        boolean b25 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection28 = defaultedMap27.values();
        java.lang.Object obj29 = defaultedMap21.get((java.lang.Object) collection28);
        boolean b30 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap32.clear();
        java.lang.Object obj35 = defaultedMap32.remove((java.lang.Object) false);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) (-1L));
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        boolean b39 = defaultedMap32.equals((java.lang.Object) predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate38, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate(map41, predicate42, predicate43);
        java.lang.Object obj45 = defaultedMap15.remove((java.lang.Object) predicate43);
        boolean b46 = defaultedMap1.containsValue((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 100 + "'", obj24.equals((short) 100));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (short) 100 + "'", obj29.equals((short) 100));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        int i16 = elitisticListPopulation5.getPopulationLimit();
        try {
            math.genetics.Chromosome chromosome17 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, 1, 0.0d);
        int i11 = elitisticListPopulation10.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation17.getChromosomes();
        elitisticListPopulation10.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome18);
        int i20 = elitisticListPopulation10.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) defaultedMap24);
        boolean b26 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj30 = defaultedMap22.get((java.lang.Object) collection29);
        elitisticListPopulation10.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection29);
        int i32 = elitisticListPopulation10.getPopulationLimit();
        int i33 = elitisticListPopulation10.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome34 = elitisticListPopulation10.spliterator();
        java.lang.Object obj35 = defaultedMap1.get((java.lang.Object) spliterator_chromosome34);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 100 + "'", obj30.equals((short) 100));
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 100 + "'", obj35.equals((short) 100));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome13);
        try {
            math.genetics.Chromosome chromosome15 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((-1), (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        java.util.Set set8 = defaultedMap1.keySet();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, 1, 0.0d);
        int i15 = elitisticListPopulation14.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation21.getChromosomes();
        elitisticListPopulation14.setChromosomes(list_chromosome22);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation14.addChromosome(chromosome24);
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation14.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation14.getChromosomes();
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, 1, 0.0d);
        int i34 = elitisticListPopulation33.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation40.getChromosomes();
        elitisticListPopulation33.setChromosomes(list_chromosome41);
        math.genetics.Chromosome chromosome43 = null;
        elitisticListPopulation33.addChromosome(chromosome43);
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation33.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome46 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation14.setChromosomes(list_chromosome46);
        boolean b48 = defaultedMap1.containsKey((java.lang.Object) list_chromosome46);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(list_chromosome22);
        org.junit.Assert.assertNotNull(list_chromosome26);
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(list_chromosome41);
        org.junit.Assert.assertNotNull(list_chromosome45);
        org.junit.Assert.assertNotNull(list_chromosome46);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) collection8);
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap12.clear();
        java.lang.Object obj15 = defaultedMap12.remove((java.lang.Object) false);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (-1L));
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        boolean b19 = defaultedMap12.equals((java.lang.Object) predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate20);
        java.util.Set set22 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 100 + "'", obj9.equals((short) 100));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj11 = defaultedMap8.get((java.lang.Object) defaultedMap10);
        java.util.Collection collection12 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj17 = defaultedMap14.get((java.lang.Object) defaultedMap16);
        boolean b18 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) collection21);
        boolean b23 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap25.clear();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) false);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (-1L));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        boolean b32 = defaultedMap25.equals((java.lang.Object) predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate31, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate(map34, predicate35, predicate36);
        java.lang.Object obj38 = defaultedMap8.remove((java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj43 = defaultedMap40.get((java.lang.Object) defaultedMap42);
        boolean b44 = defaultedMap40.isEmpty();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj51 = defaultedMap48.get((java.lang.Object) defaultedMap50);
        boolean b52 = defaultedMap48.isEmpty();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection55 = defaultedMap54.values();
        java.lang.Object obj56 = defaultedMap48.get((java.lang.Object) collection55);
        boolean b57 = defaultedMap48.isEmpty();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap59.clear();
        java.lang.Object obj62 = defaultedMap59.remove((java.lang.Object) false);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) (-1L));
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        boolean b66 = defaultedMap59.equals((java.lang.Object) predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate65, predicate67);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate(map68, predicate69, predicate70);
        boolean b72 = defaultedMap40.containsValue((java.lang.Object) predicate70);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate36, predicate70);
        collections.Transformer transformer74 = null;
        try {
            java.util.Map map75 = collections.map.DefaultedMap.decorate(map73, transformer74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 100 + "'", obj17.equals((short) 100));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 100 + "'", obj22.equals((short) 100));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (short) 100 + "'", obj43.equals((short) 100));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (short) 100 + "'", obj51.equals((short) 100));
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (short) 100 + "'", obj56.equals((short) 100));
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(map73);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome13);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation5.addChromosome(chromosome15);
        math.genetics.Population population17 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(population17);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, 1, 0.0d);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) i12);
        int i14 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj23 = defaultedMap20.get((java.lang.Object) defaultedMap22);
        java.util.Collection collection24 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj29 = defaultedMap26.get((java.lang.Object) defaultedMap28);
        boolean b30 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection33 = defaultedMap32.values();
        java.lang.Object obj34 = defaultedMap26.get((java.lang.Object) collection33);
        boolean b35 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap37.clear();
        java.lang.Object obj40 = defaultedMap37.remove((java.lang.Object) false);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        boolean b44 = defaultedMap37.equals((java.lang.Object) predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate43, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate(map46, predicate47, predicate48);
        java.lang.Object obj50 = defaultedMap20.remove((java.lang.Object) predicate48);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap52.clear();
        java.lang.Object obj55 = defaultedMap52.remove((java.lang.Object) false);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) (-1L));
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        boolean b59 = defaultedMap52.equals((java.lang.Object) predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate48, predicate58);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj65 = defaultedMap62.get((java.lang.Object) defaultedMap64);
        boolean b66 = defaultedMap62.isEmpty();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection69 = defaultedMap68.values();
        java.lang.Object obj70 = defaultedMap62.get((java.lang.Object) collection69);
        boolean b71 = defaultedMap62.isEmpty();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap73.clear();
        java.lang.Object obj76 = defaultedMap73.remove((java.lang.Object) false);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, (java.lang.Object) (-1L));
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        boolean b80 = defaultedMap73.equals((java.lang.Object) predicate79);
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate79, predicate81);
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate58, predicate79);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 100 + "'", obj23.equals((short) 100));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (short) 100 + "'", obj29.equals((short) 100));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 100 + "'", obj34.equals((short) 100));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (short) 100 + "'", obj65.equals((short) 100));
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + (short) 100 + "'", obj70.equals((short) 100));
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map83);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) false);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        boolean b8 = defaultedMap1.equals((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj12 = defaultedMap9.get((java.lang.Object) defaultedMap11);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome19 = elitisticListPopulation18.spliterator();
        boolean b20 = defaultedMap9.equals((java.lang.Object) elitisticListPopulation18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) defaultedMap24);
        defaultedMap9.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj32 = defaultedMap29.get((java.lang.Object) defaultedMap31);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome39 = elitisticListPopulation38.spliterator();
        boolean b40 = defaultedMap29.equals((java.lang.Object) elitisticListPopulation38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj45 = defaultedMap42.get((java.lang.Object) defaultedMap44);
        defaultedMap29.putAll((java.util.Map) defaultedMap44);
        boolean b47 = defaultedMap9.containsValue((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap49.clear();
        java.lang.Object obj52 = defaultedMap49.remove((java.lang.Object) false);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) (-1L));
        collections.Predicate predicate55 = null;
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate55, predicate56);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap49);
        boolean b59 = defaultedMap29.containsKey((java.lang.Object) defaultedMap49);
        math.genetics.Chromosome[] chromosome_array60 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome61 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61, chromosome_array60);
        math.genetics.ElitisticListPopulation elitisticListPopulation65 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome61, 1, 0.0d);
        int i66 = elitisticListPopulation65.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array67 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome68 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b69 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome68, chromosome_array67);
        math.genetics.ElitisticListPopulation elitisticListPopulation72 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome68, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome73 = elitisticListPopulation72.getChromosomes();
        elitisticListPopulation65.setChromosomes(list_chromosome73);
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) list_chromosome73);
        collections.Factory factory76 = null;
        try {
            java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, factory76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 100 + "'", obj12.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 100 + "'", obj32.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) 100 + "'", obj45.equals((short) 100));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(chromosome_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i66 == 1);
        org.junit.Assert.assertNotNull(chromosome_array67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(list_chromosome73);
        org.junit.Assert.assertNotNull(map75);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Population population18 = elitisticListPopulation5.nextGeneration();
        int i19 = elitisticListPopulation5.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap21.clear();
        java.lang.Object obj24 = defaultedMap21.remove((java.lang.Object) false);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) (-1L));
        collections.Predicate predicate27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap21);
        java.lang.String str31 = defaultedMap21.toString();
        java.util.Collection collection32 = defaultedMap21.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation5);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj12 = defaultedMap9.get((java.lang.Object) defaultedMap11);
        boolean b13 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection16 = defaultedMap15.values();
        java.lang.Object obj17 = defaultedMap9.get((java.lang.Object) collection16);
        boolean b18 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap20.clear();
        java.lang.Object obj23 = defaultedMap20.remove((java.lang.Object) false);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) (-1L));
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        boolean b27 = defaultedMap20.equals((java.lang.Object) predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate26, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate(map29, predicate30, predicate31);
        boolean b33 = defaultedMap1.containsValue((java.lang.Object) predicate31);
        collections.Factory factory34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 100 + "'", obj12.equals((short) 100));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 100 + "'", obj17.equals((short) 100));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        int i18 = elitisticListPopulation5.getPopulationSize();
        double d19 = elitisticListPopulation5.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation5.getChromosomes();
        double d21 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue(d21 == 0.0d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection8 = defaultedMap7.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) defaultedMap11);
        java.util.Collection collection14 = defaultedMap11.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj23 = defaultedMap20.get((java.lang.Object) defaultedMap22);
        java.util.Collection collection24 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj29 = defaultedMap26.get((java.lang.Object) defaultedMap28);
        boolean b30 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection33 = defaultedMap32.values();
        java.lang.Object obj34 = defaultedMap26.get((java.lang.Object) collection33);
        boolean b35 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap37.clear();
        java.lang.Object obj40 = defaultedMap37.remove((java.lang.Object) false);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        boolean b44 = defaultedMap37.equals((java.lang.Object) predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate43, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate(map46, predicate47, predicate48);
        java.lang.Object obj50 = defaultedMap20.remove((java.lang.Object) predicate48);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap52.clear();
        java.lang.Object obj55 = defaultedMap52.remove((java.lang.Object) false);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) (-1L));
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        boolean b59 = defaultedMap52.equals((java.lang.Object) predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate48, predicate58);
        boolean b61 = defaultedMap11.containsKey((java.lang.Object) predicate58);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 100 + "'", obj13.equals((short) 100));
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 100 + "'", obj23.equals((short) 100));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (short) 100 + "'", obj29.equals((short) 100));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 100 + "'", obj34.equals((short) 100));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        int i16 = elitisticListPopulation5.getPopulationSize();
        int i17 = elitisticListPopulation5.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(list_chromosome18);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome13);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation5.addChromosome(chromosome15);
        elitisticListPopulation5.setPopulationLimit((int) (short) 100);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj12 = defaultedMap9.get((java.lang.Object) defaultedMap11);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome19 = elitisticListPopulation18.spliterator();
        boolean b20 = defaultedMap9.equals((java.lang.Object) elitisticListPopulation18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) defaultedMap24);
        defaultedMap9.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj32 = defaultedMap29.get((java.lang.Object) defaultedMap31);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome39 = elitisticListPopulation38.spliterator();
        boolean b40 = defaultedMap29.equals((java.lang.Object) elitisticListPopulation38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj45 = defaultedMap42.get((java.lang.Object) defaultedMap44);
        defaultedMap29.putAll((java.util.Map) defaultedMap44);
        boolean b47 = defaultedMap9.containsValue((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap49.clear();
        java.lang.Object obj52 = defaultedMap49.remove((java.lang.Object) false);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) (-1L));
        collections.Predicate predicate55 = null;
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate55, predicate56);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap49);
        boolean b59 = defaultedMap29.containsKey((java.lang.Object) defaultedMap49);
        boolean b60 = defaultedMap49.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 100 + "'", obj12.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 100 + "'", obj32.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) 100 + "'", obj45.equals((short) 100));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b60 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) collection8);
        int i10 = defaultedMap1.size();
        java.util.Collection collection11 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 100 + "'", obj9.equals((short) 100));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation10.spliterator();
        boolean b12 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj17 = defaultedMap14.get((java.lang.Object) defaultedMap16);
        boolean b18 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) collection21);
        boolean b23 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap25.clear();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) false);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (-1L));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        boolean b32 = defaultedMap25.equals((java.lang.Object) predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate31, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate33, predicate35);
        int i37 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) (-1));
        int i43 = defaultedMap40.size();
        java.util.Set set44 = defaultedMap40.entrySet();
        java.util.Set set45 = defaultedMap40.entrySet();
        java.lang.String str46 = defaultedMap40.toString();
        java.util.Set set47 = defaultedMap40.keySet();
        boolean b48 = defaultedMap40.isEmpty();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj53 = defaultedMap50.get((java.lang.Object) defaultedMap52);
        boolean b54 = defaultedMap50.isEmpty();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection57 = defaultedMap56.values();
        defaultedMap50.putAll((java.util.Map) defaultedMap56);
        java.util.Set set59 = defaultedMap56.entrySet();
        boolean b60 = defaultedMap40.containsKey((java.lang.Object) set59);
        boolean b61 = defaultedMap1.equals((java.lang.Object) set59);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 100 + "'", obj17.equals((short) 100));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 100 + "'", obj22.equals((short) 100));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 100 + "'", obj42.equals((short) 100));
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 100 + "'", obj53.equals((short) 100));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Population population18 = elitisticListPopulation5.nextGeneration();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap20.clear();
        java.lang.Object obj23 = defaultedMap20.remove((java.lang.Object) false);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) (-1L));
        collections.Predicate predicate26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        java.lang.String str30 = defaultedMap20.toString();
        java.util.Collection collection31 = defaultedMap20.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection31);
        try {
            elitisticListPopulation5.setElitismRate((double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Population population18 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation5.addChromosome(chromosome19);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(population18);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation10.spliterator();
        boolean b12 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation10);
        int i13 = elitisticListPopulation10.getPopulationSize();
        math.genetics.Population population14 = elitisticListPopulation10.nextGeneration();
        elitisticListPopulation10.setPopulationLimit(1);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(population14);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) collection8);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) (-1));
        int i16 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) (-1));
        int i21 = defaultedMap18.size();
        java.util.Set set22 = defaultedMap18.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap24.clear();
        java.lang.Object obj27 = defaultedMap24.remove((java.lang.Object) false);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) (-1L));
        collections.Predicate predicate30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap24);
        java.lang.String str34 = defaultedMap24.toString();
        int i35 = defaultedMap24.size();
        java.lang.Object obj36 = defaultedMap13.put((java.lang.Object) defaultedMap18, (java.lang.Object) i35);
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38, 1, 0.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome43 = elitisticListPopulation42.iterator();
        math.genetics.Population population44 = elitisticListPopulation42.nextGeneration();
        java.lang.Object obj45 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) elitisticListPopulation42);
        int i46 = elitisticListPopulation42.getPopulationSize();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 100 + "'", obj9.equals((short) 100));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (short) 100 + "'", obj15.equals((short) 100));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 100 + "'", obj20.equals((short) 100));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome43);
        org.junit.Assert.assertNotNull(population44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(i46 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        java.util.Set set8 = defaultedMap1.keySet();
        boolean b9 = defaultedMap1.isEmpty();
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Population population18 = elitisticListPopulation5.nextGeneration();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap20.clear();
        java.lang.Object obj23 = defaultedMap20.remove((java.lang.Object) false);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) (-1L));
        collections.Predicate predicate26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        java.lang.String str30 = defaultedMap20.toString();
        java.util.Collection collection31 = defaultedMap20.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection31);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome33 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(iterator_chromosome33);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection8 = defaultedMap7.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj18 = defaultedMap15.get((java.lang.Object) defaultedMap17);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome25 = elitisticListPopulation24.spliterator();
        boolean b26 = defaultedMap15.equals((java.lang.Object) elitisticListPopulation24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj31 = defaultedMap28.get((java.lang.Object) defaultedMap30);
        boolean b32 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection35 = defaultedMap34.values();
        java.lang.Object obj36 = defaultedMap28.get((java.lang.Object) collection35);
        boolean b37 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap39.clear();
        java.lang.Object obj42 = defaultedMap39.remove((java.lang.Object) false);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) (-1L));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        boolean b46 = defaultedMap39.equals((java.lang.Object) predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate45, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate47, predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap52.clear();
        java.lang.Object obj55 = defaultedMap52.remove((java.lang.Object) false);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) (-1L));
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        boolean b59 = defaultedMap52.equals((java.lang.Object) predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate49, predicate58);
        defaultedMap11.clear();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 100 + "'", obj13.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 100 + "'", obj31.equals((short) 100));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 100 + "'", obj36.equals((short) 100));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        int i18 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, 1, 0.0d);
        int i25 = elitisticListPopulation24.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome32);
        elitisticListPopulation24.setPopulationLimit(100);
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome36);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation(list_chromosome36, (int) (byte) -1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertNotNull(list_chromosome36);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap5.clear();
        java.lang.Object obj8 = defaultedMap5.remove((java.lang.Object) false);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) (-1L));
        collections.Predicate predicate11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) defaultedMap19);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = elitisticListPopulation26.spliterator();
        boolean b28 = defaultedMap17.equals((java.lang.Object) elitisticListPopulation26);
        math.genetics.Chromosome chromosome29 = null;
        elitisticListPopulation26.addChromosome(chromosome29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) chromosome29);
        int i32 = defaultedMap31.size();
        java.util.Set set33 = defaultedMap31.keySet();
        boolean b34 = defaultedMap1.equals((java.lang.Object) defaultedMap31);
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap1.get(obj35);
        java.util.Set set37 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 100 + "'", obj20.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 100 + "'", obj36.equals((short) 100));
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj10 = defaultedMap7.get((java.lang.Object) defaultedMap9);
        boolean b11 = defaultedMap7.isEmpty();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (-1L));
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, 1, 0.0d);
        int i21 = elitisticListPopulation20.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome28);
        int i30 = elitisticListPopulation20.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj35 = defaultedMap32.get((java.lang.Object) defaultedMap34);
        boolean b36 = defaultedMap32.isEmpty();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection39 = defaultedMap38.values();
        java.lang.Object obj40 = defaultedMap32.get((java.lang.Object) collection39);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection39);
        int i42 = elitisticListPopulation20.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome43 = elitisticListPopulation20.iterator();
        double d44 = elitisticListPopulation20.getElitismRate();
        boolean b45 = defaultedMap7.equals((java.lang.Object) elitisticListPopulation20);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 100 + "'", obj10.equals((short) 100));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 100 + "'", obj35.equals((short) 100));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short) 100 + "'", obj40.equals((short) 100));
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertNotNull(iterator_chromosome43);
        org.junit.Assert.assertTrue(d44 == 0.0d);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap5.clear();
        java.lang.Object obj8 = defaultedMap5.remove((java.lang.Object) false);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) (-1L));
        collections.Predicate predicate11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) defaultedMap19);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = elitisticListPopulation26.spliterator();
        boolean b28 = defaultedMap17.equals((java.lang.Object) elitisticListPopulation26);
        math.genetics.Chromosome chromosome29 = null;
        elitisticListPopulation26.addChromosome(chromosome29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) chromosome29);
        int i32 = defaultedMap31.size();
        java.util.Set set33 = defaultedMap31.keySet();
        boolean b34 = defaultedMap1.equals((java.lang.Object) defaultedMap31);
        java.util.Set set35 = defaultedMap1.entrySet();
        int i36 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 100 + "'", obj20.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        int i16 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setElitismRate((double) (byte) 1);
        int i19 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit((int) '#');
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Population population18 = elitisticListPopulation5.nextGeneration();
        math.genetics.Population population19 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setElitismRate(0.0d);
        double d22 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertTrue(d22 == 0.0d);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.lang.String str8 = defaultedMap1.toString();
        java.util.Set set9 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation10.spliterator();
        boolean b12 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj17 = defaultedMap14.get((java.lang.Object) defaultedMap16);
        boolean b18 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) collection21);
        boolean b23 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap25.clear();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) false);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (-1L));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        boolean b32 = defaultedMap25.equals((java.lang.Object) predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate31, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate33, predicate35);
        java.util.Set set37 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 100 + "'", obj17.equals((short) 100));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 100 + "'", obj22.equals((short) 100));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj12 = defaultedMap9.get((java.lang.Object) defaultedMap11);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome19 = elitisticListPopulation18.spliterator();
        boolean b20 = defaultedMap9.equals((java.lang.Object) elitisticListPopulation18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) defaultedMap24);
        defaultedMap9.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj32 = defaultedMap29.get((java.lang.Object) defaultedMap31);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome39 = elitisticListPopulation38.spliterator();
        boolean b40 = defaultedMap29.equals((java.lang.Object) elitisticListPopulation38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj45 = defaultedMap42.get((java.lang.Object) defaultedMap44);
        defaultedMap29.putAll((java.util.Map) defaultedMap44);
        boolean b47 = defaultedMap9.containsValue((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap49.clear();
        java.lang.Object obj52 = defaultedMap49.remove((java.lang.Object) false);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) (-1L));
        collections.Predicate predicate55 = null;
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate55, predicate56);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap49);
        boolean b59 = defaultedMap29.containsKey((java.lang.Object) defaultedMap49);
        math.genetics.Chromosome[] chromosome_array60 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome61 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61, chromosome_array60);
        math.genetics.ElitisticListPopulation elitisticListPopulation65 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome61, 1, 0.0d);
        int i66 = elitisticListPopulation65.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array67 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome68 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b69 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome68, chromosome_array67);
        math.genetics.ElitisticListPopulation elitisticListPopulation72 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome68, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome73 = elitisticListPopulation72.getChromosomes();
        elitisticListPopulation65.setChromosomes(list_chromosome73);
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) list_chromosome73);
        defaultedMap49.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 100 + "'", obj12.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 100 + "'", obj32.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) 100 + "'", obj45.equals((short) 100));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(chromosome_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i66 == 1);
        org.junit.Assert.assertNotNull(chromosome_array67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(list_chromosome73);
        org.junit.Assert.assertNotNull(map75);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap8.clear();
        java.lang.Object obj11 = defaultedMap8.remove((java.lang.Object) false);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (-1L));
        collections.Predicate predicate14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        java.lang.String str18 = defaultedMap8.toString();
        java.util.Collection collection19 = defaultedMap8.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection19);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap10.clear();
        java.util.Set set12 = defaultedMap10.entrySet();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 10);
        java.util.Set set15 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) defaultedMap19);
        boolean b21 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection24 = defaultedMap23.values();
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) defaultedMap23);
        int i27 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 100 + "'", obj20.equals((short) 100));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome13);
        math.genetics.Population population15 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(population15);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj12 = defaultedMap9.get((java.lang.Object) defaultedMap11);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome19 = elitisticListPopulation18.spliterator();
        boolean b20 = defaultedMap9.equals((java.lang.Object) elitisticListPopulation18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) defaultedMap24);
        defaultedMap9.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, 1, 0.0d);
        int i34 = elitisticListPopulation33.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation40.getChromosomes();
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome41);
        int i43 = elitisticListPopulation33.getPopulationLimit();
        elitisticListPopulation33.setPopulationLimit((int) (byte) 1);
        int i46 = elitisticListPopulation33.getPopulationSize();
        java.lang.Object obj47 = defaultedMap1.get((java.lang.Object) elitisticListPopulation33);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj52 = defaultedMap49.get((java.lang.Object) defaultedMap51);
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome59 = elitisticListPopulation58.spliterator();
        boolean b60 = defaultedMap49.equals((java.lang.Object) elitisticListPopulation58);
        boolean b61 = defaultedMap49.isEmpty();
        boolean b62 = defaultedMap1.containsValue((java.lang.Object) b61);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 100 + "'", obj12.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(list_chromosome41);
        org.junit.Assert.assertTrue(i43 == 1);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (short) 100 + "'", obj47.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (short) 100 + "'", obj52.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b62 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome13);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation5.addChromosome(chromosome15);
        double d17 = elitisticListPopulation5.getElitismRate();
        java.lang.String str18 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(d17 == 0.0d);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[null]" + "'", str18.equals("[null]"));
        org.junit.Assert.assertNotNull(list_chromosome19);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        int i18 = elitisticListPopulation5.getPopulationSize();
        java.util.Collection<math.genetics.Chromosome> collection_chromosome19 = null;
        try {
            elitisticListPopulation5.addChromosomes(collection_chromosome19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) collection8);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) (-1));
        int i16 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) (-1));
        int i21 = defaultedMap18.size();
        java.util.Set set22 = defaultedMap18.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap24.clear();
        java.lang.Object obj27 = defaultedMap24.remove((java.lang.Object) false);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) (-1L));
        collections.Predicate predicate30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap24);
        java.lang.String str34 = defaultedMap24.toString();
        int i35 = defaultedMap24.size();
        java.lang.Object obj36 = defaultedMap13.put((java.lang.Object) defaultedMap18, (java.lang.Object) i35);
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38, 1, 0.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome43 = elitisticListPopulation42.iterator();
        math.genetics.Population population44 = elitisticListPopulation42.nextGeneration();
        java.lang.Object obj45 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) elitisticListPopulation42);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj50 = defaultedMap47.get((java.lang.Object) defaultedMap49);
        boolean b51 = defaultedMap47.isEmpty();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection54 = defaultedMap53.values();
        defaultedMap47.putAll((java.util.Map) defaultedMap53);
        math.genetics.Chromosome[] chromosome_array56 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome57 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b58 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57, chromosome_array56);
        math.genetics.ElitisticListPopulation elitisticListPopulation61 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome57, 1, 0.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome62 = elitisticListPopulation61.iterator();
        math.genetics.Population population63 = elitisticListPopulation61.nextGeneration();
        boolean b64 = defaultedMap53.equals((java.lang.Object) elitisticListPopulation61);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome65 = elitisticListPopulation61.iterator();
        boolean b66 = defaultedMap18.equals((java.lang.Object) elitisticListPopulation61);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 100 + "'", obj9.equals((short) 100));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (short) 100 + "'", obj15.equals((short) 100));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 100 + "'", obj20.equals((short) 100));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome43);
        org.junit.Assert.assertNotNull(population44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (short) 100 + "'", obj50.equals((short) 100));
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(chromosome_array56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome62);
        org.junit.Assert.assertNotNull(population63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome65);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10);
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, 1, 0.0d);
        int i19 = elitisticListPopulation18.getPopulationLimit();
        boolean b20 = defaultedMap8.containsValue((java.lang.Object) i19);
        int i21 = defaultedMap8.size();
        java.lang.String str22 = defaultedMap8.toString();
        defaultedMap8.clear();
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj33 = defaultedMap30.get((java.lang.Object) defaultedMap32);
        java.util.Collection collection34 = defaultedMap30.values();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj39 = defaultedMap36.get((java.lang.Object) defaultedMap38);
        boolean b40 = defaultedMap36.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection43 = defaultedMap42.values();
        java.lang.Object obj44 = defaultedMap36.get((java.lang.Object) collection43);
        boolean b45 = defaultedMap36.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap47.clear();
        java.lang.Object obj50 = defaultedMap47.remove((java.lang.Object) false);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) (-1L));
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        boolean b54 = defaultedMap47.equals((java.lang.Object) predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate53, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate(map56, predicate57, predicate58);
        java.lang.Object obj60 = defaultedMap30.remove((java.lang.Object) predicate58);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap62.clear();
        java.lang.Object obj65 = defaultedMap62.remove((java.lang.Object) false);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) (-1L));
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        boolean b69 = defaultedMap62.equals((java.lang.Object) predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate58, predicate68);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap72.clear();
        java.lang.Object obj75 = defaultedMap72.remove((java.lang.Object) false);
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap72, (java.lang.Object) (-1L));
        collections.Predicate predicate78 = null;
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate78, predicate79);
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate58, predicate78);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 100 + "'", obj28.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) 100 + "'", obj33.equals((short) 100));
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 100 + "'", obj39.equals((short) 100));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 100 + "'", obj44.equals((short) 100));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) defaultedMap19);
        boolean b21 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) collection24);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection24);
        int i27 = elitisticListPopulation5.getPopulationLimit();
        int i28 = elitisticListPopulation5.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome29 = elitisticListPopulation5.spliterator();
        int i30 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome31 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome chromosome32 = null;
        elitisticListPopulation5.addChromosome(chromosome32);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 100 + "'", obj20.equals((short) 100));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome29);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome31);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj12 = defaultedMap9.get((java.lang.Object) defaultedMap11);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome19 = elitisticListPopulation18.spliterator();
        boolean b20 = defaultedMap9.equals((java.lang.Object) elitisticListPopulation18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) defaultedMap24);
        defaultedMap9.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.lang.Object obj30 = null;
        boolean b31 = defaultedMap1.equals(obj30);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 100 + "'", obj12.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) 0L);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, 1, 0.0d);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) i12);
        int i14 = defaultedMap1.size();
        java.lang.String str15 = defaultedMap1.toString();
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, 1, 0.0d);
        int i22 = elitisticListPopulation21.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation21.setChromosomes(list_chromosome29);
        boolean b31 = defaultedMap1.containsValue((java.lang.Object) list_chromosome29);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(list_chromosome29);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) collection8);
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap12.clear();
        java.lang.Object obj15 = defaultedMap12.remove((java.lang.Object) false);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (-1L));
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        boolean b19 = defaultedMap12.equals((java.lang.Object) predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate(map21, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) predicate26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) (-1));
        int i32 = defaultedMap29.size();
        java.util.Set set33 = defaultedMap29.entrySet();
        java.util.Set set34 = defaultedMap29.entrySet();
        java.lang.String str35 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj40 = defaultedMap37.get((java.lang.Object) defaultedMap39);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome47 = elitisticListPopulation46.spliterator();
        boolean b48 = defaultedMap37.equals((java.lang.Object) elitisticListPopulation46);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj53 = defaultedMap50.get((java.lang.Object) defaultedMap52);
        defaultedMap37.putAll((java.util.Map) defaultedMap52);
        boolean b55 = defaultedMap29.equals((java.lang.Object) defaultedMap37);
        int i56 = defaultedMap37.size();
        java.lang.Object obj57 = defaultedMap25.get((java.lang.Object) defaultedMap37);
        defaultedMap37.clear();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 100 + "'", obj4.equals((short) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 100 + "'", obj9.equals((short) 100));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 100 + "'", obj31.equals((short) 100));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short) 100 + "'", obj40.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 100 + "'", obj53.equals((short) 100));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(obj57);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) (-1));
        int i10 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) (-1));
        int i15 = defaultedMap12.size();
        java.util.Set set16 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap18.clear();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) false);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (-1L));
        collections.Predicate predicate24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate24, predicate25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap18);
        java.lang.String str28 = defaultedMap18.toString();
        int i29 = defaultedMap18.size();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) defaultedMap12, (java.lang.Object) i29);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 100 + "'", obj9.equals((short) 100));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 100 + "'", obj14.equals((short) 100));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) defaultedMap7);
        java.util.Collection collection9 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) defaultedMap13);
        boolean b15 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object obj19 = defaultedMap11.get((java.lang.Object) collection18);
        boolean b20 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap22.clear();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) false);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) (-1L));
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        boolean b29 = defaultedMap22.equals((java.lang.Object) predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate28, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate(map31, predicate32, predicate33);
        java.lang.Object obj35 = defaultedMap5.remove((java.lang.Object) predicate33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap37.clear();
        java.lang.Object obj40 = defaultedMap37.remove((java.lang.Object) false);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        boolean b44 = defaultedMap37.equals((java.lang.Object) predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate33, predicate43);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 100 + "'", obj8.equals((short) 100));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 100 + "'", obj14.equals((short) 100));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 100 + "'", obj19.equals((short) 100));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, 1, 0.0d);
        double d8 = elitisticListPopulation7.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap10.clear();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) false);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (-1L));
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate17);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) d8, (java.lang.Object) predicate16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, 1, 0.0d);
        double d28 = elitisticListPopulation27.getElitismRate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap30.clear();
        java.lang.Object obj33 = defaultedMap30.remove((java.lang.Object) false);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (-1L));
        collections.Predicate predicate36 = null;
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate36, predicate37);
        java.lang.Object obj39 = defaultedMap21.put((java.lang.Object) d28, (java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap41.clear();
        java.lang.Object obj44 = defaultedMap41.remove((java.lang.Object) false);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) (-1L));
        collections.Predicate predicate47 = null;
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate47, predicate48);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap52.clear();
        java.lang.Object obj55 = defaultedMap52.remove((java.lang.Object) false);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) (-1L));
        collections.Predicate predicate58 = null;
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate58, predicate59);
        java.lang.Object obj61 = defaultedMap1.put((java.lang.Object) map50, (java.lang.Object) defaultedMap52);
        java.lang.String str62 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{0.0=null, {0.0=null}={}}" + "'", str62.equals("{0.0=null, {0.0=null}={}}"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1));
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj12 = defaultedMap9.get((java.lang.Object) defaultedMap11);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome19 = elitisticListPopulation18.spliterator();
        boolean b20 = defaultedMap9.equals((java.lang.Object) elitisticListPopulation18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) defaultedMap24);
        defaultedMap9.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj32 = defaultedMap29.get((java.lang.Object) defaultedMap31);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome39 = elitisticListPopulation38.spliterator();
        boolean b40 = defaultedMap29.equals((java.lang.Object) elitisticListPopulation38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj45 = defaultedMap42.get((java.lang.Object) defaultedMap44);
        defaultedMap29.putAll((java.util.Map) defaultedMap44);
        boolean b47 = defaultedMap9.containsValue((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap49.clear();
        java.lang.Object obj52 = defaultedMap49.remove((java.lang.Object) false);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) (-1L));
        collections.Predicate predicate55 = null;
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate55, predicate56);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap49);
        boolean b59 = defaultedMap29.containsKey((java.lang.Object) defaultedMap49);
        math.genetics.Chromosome[] chromosome_array60 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome61 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61, chromosome_array60);
        math.genetics.ElitisticListPopulation elitisticListPopulation65 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome61, 1, 0.0d);
        int i66 = elitisticListPopulation65.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array67 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome68 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b69 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome68, chromosome_array67);
        math.genetics.ElitisticListPopulation elitisticListPopulation72 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome68, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome73 = elitisticListPopulation72.getChromosomes();
        elitisticListPopulation65.setChromosomes(list_chromosome73);
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) list_chromosome73);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj80 = defaultedMap77.get((java.lang.Object) defaultedMap79);
        java.util.Collection collection81 = defaultedMap77.values();
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) collection81);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 100 + "'", obj3.equals((short) 100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 100 + "'", obj12.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 100 + "'", obj32.equals((short) 100));
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) 100 + "'", obj45.equals((short) 100));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(chromosome_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i66 == 1);
        org.junit.Assert.assertNotNull(chromosome_array67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(list_chromosome73);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + (short) 100 + "'", obj80.equals((short) 100));
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNotNull(map82);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        int i18 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, 1, 0.0d);
        int i25 = elitisticListPopulation24.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, 1, 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome32);
        elitisticListPopulation24.setPopulationLimit(100);
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome36);
        elitisticListPopulation5.setPopulationLimit((int) '4');
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertNotNull(list_chromosome36);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10);
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, 1, 0.0d);
        int i19 = elitisticListPopulation18.getPopulationLimit();
        boolean b20 = defaultedMap8.containsValue((java.lang.Object) i19);
        int i21 = defaultedMap8.size();
        java.lang.String str22 = defaultedMap8.toString();
        defaultedMap8.clear();
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        java.util.Set set25 = defaultedMap8.keySet();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
    }
}

