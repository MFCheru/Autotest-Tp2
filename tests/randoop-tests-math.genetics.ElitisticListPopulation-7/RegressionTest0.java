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
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        try {
            math.genetics.Chromosome chromosome4 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
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
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
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
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        int i4 = elitisticListPopulation2.getPopulationSize();
        try {
            elitisticListPopulation2.setElitismRate((double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(i4 == 0);
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
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
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
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        try {
            elitisticListPopulation5.setElitismRate((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Map map0 = null;
        math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d4 = elitisticListPopulation3.getElitismRate();
        int i5 = elitisticListPopulation3.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation3.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation3.addChromosome(chromosome10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation14.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation3.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome16);
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) elitisticListPopulation3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertTrue(i5 == 100);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertNotNull(list_chromosome16);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome7);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation2.iterator();
        try {
            elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome7);
        try {
            elitisticListPopulation2.setPopulationLimit((-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        boolean b5 = defaultedMap4.isEmpty();
        defaultedMap4.clear();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', (double) 0.0f);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        double d13 = elitisticListPopulation5.getElitismRate();
        try {
            elitisticListPopulation5.setElitismRate((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(d13 == 0.0d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        try {
            math.genetics.Chromosome chromosome6 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation5.spliterator();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 10);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d13 = elitisticListPopulation12.getElitismRate();
        int i14 = elitisticListPopulation12.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation12.addChromosome(chromosome19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation23.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome25);
        java.lang.Object obj28 = defaultedMap4.put((java.lang.Object) elitisticListPopulation12, (java.lang.Object) (-1L));
        try {
            elitisticListPopulation12.setElitismRate((double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertTrue(i14 == 100);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome24);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d13 = elitisticListPopulation12.getElitismRate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) d13);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) iterator_chromosome18);
        boolean b20 = defaultedMap14.isEmpty();
        defaultedMap4.putAll((java.util.Map) defaultedMap14);
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0d + "'", obj19.equals(0.0d));
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation5.spliterator();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.lang.String str8 = elitisticListPopulation5.toString();
        double d9 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(d9 == 0.0d);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        boolean b10 = defaultedMap4.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d14 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) d14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation18.iterator();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) iterator_chromosome19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d24 = elitisticListPopulation23.getElitismRate();
        int i25 = elitisticListPopulation23.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation23.addChromosome(chromosome30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation34.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome36);
        java.lang.Object obj39 = defaultedMap15.put((java.lang.Object) elitisticListPopulation23, (java.lang.Object) (-1L));
        boolean b40 = defaultedMap4.equals((java.lang.Object) elitisticListPopulation23);
        elitisticListPopulation23.setPopulationLimit(10);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation5.spliterator();
        java.lang.String str7 = elitisticListPopulation5.toString();
        double d8 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(d8 == 0.0d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        boolean b10 = defaultedMap4.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d14 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) d14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation18.iterator();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) iterator_chromosome19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d24 = elitisticListPopulation23.getElitismRate();
        int i25 = elitisticListPopulation23.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation23.addChromosome(chromosome30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation34.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome36);
        java.lang.Object obj39 = defaultedMap15.put((java.lang.Object) elitisticListPopulation23, (java.lang.Object) (-1L));
        boolean b40 = defaultedMap4.equals((java.lang.Object) elitisticListPopulation23);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d45 = elitisticListPopulation44.getElitismRate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) d45);
        boolean b47 = defaultedMap46.isEmpty();
        defaultedMap46.clear();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate41, predicate50);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d56 = elitisticListPopulation55.getElitismRate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) d56);
        boolean b58 = defaultedMap57.isEmpty();
        defaultedMap57.clear();
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate60, predicate61);
        math.genetics.ElitisticListPopulation elitisticListPopulation65 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome66 = elitisticListPopulation65.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome67 = elitisticListPopulation65.getChromosomes();
        java.lang.Object obj68 = defaultedMap57.remove((java.lang.Object) list_chromosome67);
        math.genetics.ElitisticListPopulation elitisticListPopulation71 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d72 = elitisticListPopulation71.getElitismRate();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) d72);
        boolean b74 = defaultedMap73.isEmpty();
        defaultedMap73.clear();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate76, predicate77);
        math.genetics.ElitisticListPopulation elitisticListPopulation81 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome82 = elitisticListPopulation81.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome83 = elitisticListPopulation81.getChromosomes();
        java.lang.Object obj84 = defaultedMap73.remove((java.lang.Object) list_chromosome83);
        boolean b86 = defaultedMap73.containsKey((java.lang.Object) 0);
        java.lang.Object obj87 = defaultedMap57.remove((java.lang.Object) defaultedMap73);
        java.util.Map map88 = collections.map.DefaultedMap.decorate(map52, obj87);
        collections.Transformer transformer89 = null;
        try {
            java.util.Map map90 = collections.map.DefaultedMap.decorate(map88, transformer89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(d45 == 0.0d);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(d56 == 0.0d);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(iterator_chromosome66);
        org.junit.Assert.assertNotNull(list_chromosome67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(d72 == 0.0d);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(iterator_chromosome82);
        org.junit.Assert.assertNotNull(list_chromosome83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(map88);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        org.junit.Assert.assertNotNull(population3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        java.lang.Object obj16 = defaultedMap4.get((java.lang.Object) 0.0f);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0.0d + "'", obj16.equals(0.0d));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation(list_chromosome6, (int) ' ', (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d18 = elitisticListPopulation17.getElitismRate();
        int i19 = elitisticListPopulation17.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.Population population24 = elitisticListPopulation17.nextGeneration();
        java.lang.Object obj26 = defaultedMap4.put((java.lang.Object) elitisticListPopulation17, (java.lang.Object) 10.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d30 = elitisticListPopulation29.getElitismRate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) d30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation34.iterator();
        java.lang.Object obj36 = defaultedMap31.get((java.lang.Object) iterator_chromosome35);
        boolean b37 = defaultedMap31.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d41 = elitisticListPopulation40.getElitismRate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) d41);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome46 = elitisticListPopulation45.iterator();
        java.lang.Object obj47 = defaultedMap42.get((java.lang.Object) iterator_chromosome46);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d51 = elitisticListPopulation50.getElitismRate();
        int i52 = elitisticListPopulation50.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        elitisticListPopulation50.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54);
        math.genetics.Chromosome chromosome57 = null;
        elitisticListPopulation50.addChromosome(chromosome57);
        math.genetics.ElitisticListPopulation elitisticListPopulation61 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome62 = elitisticListPopulation61.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome63 = elitisticListPopulation61.getChromosomes();
        elitisticListPopulation50.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome63);
        java.lang.Object obj66 = defaultedMap42.put((java.lang.Object) elitisticListPopulation50, (java.lang.Object) (-1L));
        boolean b67 = defaultedMap31.equals((java.lang.Object) elitisticListPopulation50);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        math.genetics.ElitisticListPopulation elitisticListPopulation71 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d72 = elitisticListPopulation71.getElitismRate();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) d72);
        boolean b74 = defaultedMap73.isEmpty();
        defaultedMap73.clear();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate76, predicate77);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate68, predicate77);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate77, predicate80);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(d30 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0.0d + "'", obj36.equals(0.0d));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(d41 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0.0d + "'", obj47.equals(0.0d));
        org.junit.Assert.assertTrue(d51 == 0.0d);
        org.junit.Assert.assertTrue(i52 == 100);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome62);
        org.junit.Assert.assertNotNull(list_chromosome63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue(d72 == 0.0d);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        boolean b5 = defaultedMap4.isEmpty();
        defaultedMap4.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate7, predicate8);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate(map9, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap4.put((java.lang.Object) elitisticListPopulation7, obj10);
        math.genetics.Population population12 = elitisticListPopulation7.nextGeneration();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(population12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', (double) 0.0f);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.lang.String str13 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        boolean b10 = defaultedMap4.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d14 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) d14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation18.iterator();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) iterator_chromosome19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d24 = elitisticListPopulation23.getElitismRate();
        int i25 = elitisticListPopulation23.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation23.addChromosome(chromosome30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation34.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome36);
        java.lang.Object obj39 = defaultedMap15.put((java.lang.Object) elitisticListPopulation23, (java.lang.Object) (-1L));
        boolean b40 = defaultedMap4.equals((java.lang.Object) elitisticListPopulation23);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d44 = elitisticListPopulation43.getElitismRate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) d44);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome49 = elitisticListPopulation48.iterator();
        java.lang.Object obj50 = defaultedMap45.get((java.lang.Object) iterator_chromosome49);
        boolean b51 = defaultedMap45.isEmpty();
        boolean b52 = defaultedMap4.containsValue((java.lang.Object) defaultedMap45);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d56 = elitisticListPopulation55.getElitismRate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) d56);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome64 = elitisticListPopulation63.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome65 = elitisticListPopulation63.getChromosomes();
        elitisticListPopulation60.setChromosomes(list_chromosome65);
        boolean b67 = defaultedMap57.containsKey((java.lang.Object) list_chromosome65);
        boolean b68 = defaultedMap57.isEmpty();
        java.lang.Object obj69 = defaultedMap45.get((java.lang.Object) b68);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(d44 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0.0d + "'", obj50.equals(0.0d));
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(d56 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome64);
        org.junit.Assert.assertNotNull(list_chromosome65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 0.0d + "'", obj69.equals(0.0d));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation5.spliterator();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation5.spliterator();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        double d11 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertTrue(d11 == 0.0d);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) (byte) 1, (double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap4.put((java.lang.Object) elitisticListPopulation7, obj10);
        int i12 = elitisticListPopulation7.getPopulationSize();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        java.lang.Object obj16 = defaultedMap4.get((java.lang.Object) 0.0f);
        java.util.Set set17 = defaultedMap4.entrySet();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0.0d + "'", obj16.equals(0.0d));
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(i4 == 100);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1L);
        boolean b18 = defaultedMap4.containsKey((java.lang.Object) (byte) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d22 = elitisticListPopulation21.getElitismRate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) d22);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome27 = elitisticListPopulation26.iterator();
        java.lang.Object obj28 = defaultedMap23.get((java.lang.Object) iterator_chromosome27);
        boolean b29 = defaultedMap23.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d33 = elitisticListPopulation32.getElitismRate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) d33);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome38 = elitisticListPopulation37.iterator();
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) iterator_chromosome38);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d43 = elitisticListPopulation42.getElitismRate();
        int i44 = elitisticListPopulation42.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        elitisticListPopulation42.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46);
        math.genetics.Chromosome chromosome49 = null;
        elitisticListPopulation42.addChromosome(chromosome49);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation53.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation42.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome55);
        java.lang.Object obj58 = defaultedMap34.put((java.lang.Object) elitisticListPopulation42, (java.lang.Object) (-1L));
        boolean b59 = defaultedMap23.equals((java.lang.Object) elitisticListPopulation42);
        java.util.Set set60 = defaultedMap23.entrySet();
        boolean b61 = defaultedMap4.containsValue((java.lang.Object) defaultedMap23);
        int i62 = defaultedMap23.size();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(d22 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0.0d + "'", obj28.equals(0.0d));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(d33 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0.0d + "'", obj39.equals(0.0d));
        org.junit.Assert.assertTrue(d43 == 0.0d);
        org.junit.Assert.assertTrue(i44 == 100);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(i62 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        int i4 = elitisticListPopulation2.getPopulationSize();
        try {
            elitisticListPopulation2.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        double d4 = elitisticListPopulation2.getElitismRate();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertTrue(i5 == 100);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        boolean b5 = defaultedMap4.isEmpty();
        defaultedMap4.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate7, predicate8);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate(map9, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertNotNull(list_chromosome5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        boolean b10 = defaultedMap4.isEmpty();
        java.lang.String str11 = defaultedMap4.toString();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        boolean b10 = defaultedMap4.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d14 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) d14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation18.iterator();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) iterator_chromosome19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d24 = elitisticListPopulation23.getElitismRate();
        int i25 = elitisticListPopulation23.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation23.addChromosome(chromosome30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation34.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome36);
        java.lang.Object obj39 = defaultedMap15.put((java.lang.Object) elitisticListPopulation23, (java.lang.Object) (-1L));
        boolean b40 = defaultedMap4.equals((java.lang.Object) elitisticListPopulation23);
        java.util.Set set41 = defaultedMap4.entrySet();
        java.lang.String str42 = defaultedMap4.toString();
        int i43 = defaultedMap4.size();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(i43 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d13 = elitisticListPopulation12.getElitismRate();
        int i14 = elitisticListPopulation12.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation12.addChromosome(chromosome19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation23.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome25);
        java.lang.Object obj28 = defaultedMap4.put((java.lang.Object) elitisticListPopulation12, (java.lang.Object) (-1L));
        try {
            elitisticListPopulation12.setElitismRate(100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertTrue(i14 == 100);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome24);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome7);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation2.iterator();
        java.lang.String str10 = elitisticListPopulation2.toString();
        int i11 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertTrue(i11 == 100);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d18 = elitisticListPopulation17.getElitismRate();
        int i19 = elitisticListPopulation17.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.Population population24 = elitisticListPopulation17.nextGeneration();
        java.lang.Object obj26 = defaultedMap4.put((java.lang.Object) elitisticListPopulation17, (java.lang.Object) 10.0f);
        boolean b27 = defaultedMap4.isEmpty();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) '#');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        boolean b5 = defaultedMap4.isEmpty();
        defaultedMap4.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate7, predicate8);
        defaultedMap4.clear();
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        try {
            elitisticListPopulation2.setElitismRate((double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        boolean b5 = defaultedMap4.isEmpty();
        defaultedMap4.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate7, predicate8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d13 = elitisticListPopulation12.getElitismRate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) d13);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation20.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation17.setChromosomes(list_chromosome22);
        boolean b24 = defaultedMap14.containsKey((java.lang.Object) list_chromosome22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d28 = elitisticListPopulation27.getElitismRate();
        int i29 = elitisticListPopulation27.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        elitisticListPopulation27.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31);
        math.genetics.Population population34 = elitisticListPopulation27.nextGeneration();
        java.lang.Object obj36 = defaultedMap14.put((java.lang.Object) elitisticListPopulation27, (java.lang.Object) 10.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d40 = elitisticListPopulation39.getElitismRate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) d40);
        boolean b42 = defaultedMap41.isEmpty();
        defaultedMap41.clear();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate44, predicate45);
        boolean b47 = defaultedMap14.containsKey((java.lang.Object) predicate44);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d51 = elitisticListPopulation50.getElitismRate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) d51);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome59 = elitisticListPopulation58.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome60 = elitisticListPopulation58.getChromosomes();
        elitisticListPopulation55.setChromosomes(list_chromosome60);
        boolean b62 = defaultedMap52.containsKey((java.lang.Object) list_chromosome60);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) 1L);
        java.lang.Object obj65 = defaultedMap14.get((java.lang.Object) defaultedMap52);
        java.lang.Object obj66 = defaultedMap4.get(obj65);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
        org.junit.Assert.assertNotNull(list_chromosome22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertTrue(i29 == 100);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(population34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(d40 == 0.0d);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(d51 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome59);
        org.junit.Assert.assertNotNull(list_chromosome60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 0.0d + "'", obj65.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 0.0d + "'", obj66.equals(0.0d));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d6 = elitisticListPopulation5.getElitismRate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) d6);
        boolean b8 = defaultedMap7.isEmpty();
        defaultedMap7.clear();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Collection collection13 = defaultedMap7.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection13);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d18 = elitisticListPopulation17.getElitismRate();
        int i19 = elitisticListPopulation17.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.Population population24 = elitisticListPopulation17.nextGeneration();
        java.lang.Object obj26 = defaultedMap4.put((java.lang.Object) elitisticListPopulation17, (java.lang.Object) 10.0f);
        boolean b28 = defaultedMap4.equals((java.lang.Object) (byte) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome32 = elitisticListPopulation31.iterator();
        double d33 = elitisticListPopulation31.getElitismRate();
        int i34 = elitisticListPopulation31.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        elitisticListPopulation31.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36);
        math.genetics.Population population39 = elitisticListPopulation31.nextGeneration();
        math.genetics.Chromosome chromosome40 = null;
        elitisticListPopulation31.addChromosome(chromosome40);
        boolean b42 = defaultedMap4.containsKey((java.lang.Object) chromosome40);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome32);
        org.junit.Assert.assertTrue(d33 == 0.0d);
        org.junit.Assert.assertTrue(i34 == 100);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(population39);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d13 = elitisticListPopulation12.getElitismRate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) d13);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) iterator_chromosome18);
        boolean b20 = defaultedMap14.isEmpty();
        defaultedMap4.putAll((java.util.Map) defaultedMap14);
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0d + "'", obj19.equals(0.0d));
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', (double) 0.0f);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) -1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d13 = elitisticListPopulation12.getElitismRate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) d13);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation20.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation17.setChromosomes(list_chromosome22);
        boolean b24 = defaultedMap14.containsKey((java.lang.Object) list_chromosome22);
        java.lang.Object obj26 = defaultedMap14.get((java.lang.Object) 0.0f);
        int i27 = defaultedMap14.size();
        java.lang.Object obj28 = defaultedMap4.get((java.lang.Object) defaultedMap14);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) 'a', (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) 'a', (double) 0.0f);
        elitisticListPopulation34.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36);
        java.lang.Object obj42 = null;
        java.lang.Object obj43 = defaultedMap4.put((java.lang.Object) elitisticListPopulation34, obj42);
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45, (int) 'a', (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome51, (int) 'a', (double) 0.0f);
        elitisticListPopulation49.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51);
        double d57 = elitisticListPopulation49.getElitismRate();
        double d58 = elitisticListPopulation49.getElitismRate();
        java.lang.Object obj59 = defaultedMap4.remove((java.lang.Object) d58);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
        org.junit.Assert.assertNotNull(list_chromosome22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0.0d + "'", obj28.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(d57 == 0.0d);
        org.junit.Assert.assertTrue(d58 == 0.0d);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        int i4 = elitisticListPopulation2.getPopulationSize();
        try {
            elitisticListPopulation2.setElitismRate((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        boolean b5 = defaultedMap4.isEmpty();
        defaultedMap4.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate7, predicate8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation12.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation12.getChromosomes();
        java.lang.Object obj15 = defaultedMap4.remove((java.lang.Object) list_chromosome14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d19 = elitisticListPopulation18.getElitismRate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) d19);
        boolean b21 = defaultedMap20.isEmpty();
        defaultedMap20.clear();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate23, predicate24);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome29 = elitisticListPopulation28.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation28.getChromosomes();
        java.lang.Object obj31 = defaultedMap20.remove((java.lang.Object) list_chromosome30);
        boolean b33 = defaultedMap20.containsKey((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap4.remove((java.lang.Object) defaultedMap20);
        boolean b35 = defaultedMap4.isEmpty();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(iterator_chromosome29);
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1L);
        boolean b18 = defaultedMap4.containsKey((java.lang.Object) (byte) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d22 = elitisticListPopulation21.getElitismRate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) d22);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome27 = elitisticListPopulation26.iterator();
        java.lang.Object obj28 = defaultedMap23.get((java.lang.Object) iterator_chromosome27);
        boolean b29 = defaultedMap23.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d33 = elitisticListPopulation32.getElitismRate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) d33);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome38 = elitisticListPopulation37.iterator();
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) iterator_chromosome38);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d43 = elitisticListPopulation42.getElitismRate();
        int i44 = elitisticListPopulation42.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        elitisticListPopulation42.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46);
        math.genetics.Chromosome chromosome49 = null;
        elitisticListPopulation42.addChromosome(chromosome49);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation53.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation42.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome55);
        java.lang.Object obj58 = defaultedMap34.put((java.lang.Object) elitisticListPopulation42, (java.lang.Object) (-1L));
        boolean b59 = defaultedMap23.equals((java.lang.Object) elitisticListPopulation42);
        java.util.Set set60 = defaultedMap23.entrySet();
        boolean b61 = defaultedMap4.containsValue((java.lang.Object) defaultedMap23);
        java.util.Set set62 = defaultedMap4.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation65 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d66 = elitisticListPopulation65.getElitismRate();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) d66);
        boolean b68 = defaultedMap67.isEmpty();
        defaultedMap67.clear();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate70, predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate71, predicate73);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(d22 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0.0d + "'", obj28.equals(0.0d));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(d33 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0.0d + "'", obj39.equals(0.0d));
        org.junit.Assert.assertTrue(d43 == 0.0d);
        org.junit.Assert.assertTrue(i44 == 100);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(d66 == 0.0d);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        try {
            elitisticListPopulation5.setPopulationLimit((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1L);
        boolean b18 = defaultedMap4.containsKey((java.lang.Object) (byte) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d22 = elitisticListPopulation21.getElitismRate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) d22);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome27 = elitisticListPopulation26.iterator();
        java.lang.Object obj28 = defaultedMap23.get((java.lang.Object) iterator_chromosome27);
        boolean b29 = defaultedMap23.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d33 = elitisticListPopulation32.getElitismRate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) d33);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome38 = elitisticListPopulation37.iterator();
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) iterator_chromosome38);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d43 = elitisticListPopulation42.getElitismRate();
        int i44 = elitisticListPopulation42.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        elitisticListPopulation42.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46);
        math.genetics.Chromosome chromosome49 = null;
        elitisticListPopulation42.addChromosome(chromosome49);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation53.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation42.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome55);
        java.lang.Object obj58 = defaultedMap34.put((java.lang.Object) elitisticListPopulation42, (java.lang.Object) (-1L));
        boolean b59 = defaultedMap23.equals((java.lang.Object) elitisticListPopulation42);
        java.util.Set set60 = defaultedMap23.entrySet();
        boolean b61 = defaultedMap4.containsValue((java.lang.Object) defaultedMap23);
        java.util.Set set62 = defaultedMap4.entrySet();
        java.util.Set set63 = defaultedMap4.keySet();
        collections.Factory factory64 = null;
        try {
            java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(d22 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0.0d + "'", obj28.equals(0.0d));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(d33 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0.0d + "'", obj39.equals(0.0d));
        org.junit.Assert.assertTrue(d43 == 0.0d);
        org.junit.Assert.assertTrue(i44 == 100);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(set63);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', (double) 0.0f);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1L);
        boolean b18 = defaultedMap4.containsKey((java.lang.Object) (byte) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d22 = elitisticListPopulation21.getElitismRate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) d22);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome27 = elitisticListPopulation26.iterator();
        java.lang.Object obj28 = defaultedMap23.get((java.lang.Object) iterator_chromosome27);
        boolean b29 = defaultedMap23.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d33 = elitisticListPopulation32.getElitismRate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) d33);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome38 = elitisticListPopulation37.iterator();
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) iterator_chromosome38);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d43 = elitisticListPopulation42.getElitismRate();
        int i44 = elitisticListPopulation42.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        elitisticListPopulation42.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46);
        math.genetics.Chromosome chromosome49 = null;
        elitisticListPopulation42.addChromosome(chromosome49);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation53.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation42.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome55);
        java.lang.Object obj58 = defaultedMap34.put((java.lang.Object) elitisticListPopulation42, (java.lang.Object) (-1L));
        boolean b59 = defaultedMap23.equals((java.lang.Object) elitisticListPopulation42);
        java.util.Set set60 = defaultedMap23.entrySet();
        boolean b61 = defaultedMap4.containsValue((java.lang.Object) defaultedMap23);
        java.util.Set set62 = defaultedMap4.entrySet();
        int i63 = defaultedMap4.size();
        collections.Factory factory64 = null;
        try {
            java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(d22 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0.0d + "'", obj28.equals(0.0d));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(d33 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0.0d + "'", obj39.equals(0.0d));
        org.junit.Assert.assertTrue(d43 == 0.0d);
        org.junit.Assert.assertTrue(i44 == 100);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(i63 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1L);
        boolean b18 = defaultedMap4.containsKey((java.lang.Object) (byte) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d22 = elitisticListPopulation21.getElitismRate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) d22);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome27 = elitisticListPopulation26.iterator();
        java.lang.Object obj28 = defaultedMap23.get((java.lang.Object) iterator_chromosome27);
        boolean b29 = defaultedMap23.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d33 = elitisticListPopulation32.getElitismRate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) d33);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome38 = elitisticListPopulation37.iterator();
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) iterator_chromosome38);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d43 = elitisticListPopulation42.getElitismRate();
        int i44 = elitisticListPopulation42.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        elitisticListPopulation42.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46);
        math.genetics.Chromosome chromosome49 = null;
        elitisticListPopulation42.addChromosome(chromosome49);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation53.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation42.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome55);
        java.lang.Object obj58 = defaultedMap34.put((java.lang.Object) elitisticListPopulation42, (java.lang.Object) (-1L));
        boolean b59 = defaultedMap23.equals((java.lang.Object) elitisticListPopulation42);
        java.util.Set set60 = defaultedMap23.entrySet();
        boolean b61 = defaultedMap4.containsValue((java.lang.Object) defaultedMap23);
        java.util.Set set62 = defaultedMap4.entrySet();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        boolean b64 = defaultedMap4.containsKey((java.lang.Object) predicate63);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(d22 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0.0d + "'", obj28.equals(0.0d));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(d33 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0.0d + "'", obj39.equals(0.0d));
        org.junit.Assert.assertTrue(d43 == 0.0d);
        org.junit.Assert.assertTrue(i44 == 100);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        boolean b5 = defaultedMap4.isEmpty();
        defaultedMap4.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate7, predicate8);
        java.util.Set set10 = defaultedMap4.entrySet();
        java.util.Set set11 = defaultedMap4.entrySet();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap4.put((java.lang.Object) elitisticListPopulation7, obj10);
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation7.addChromosome(chromosome12);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', (double) 0.0f);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        double d13 = elitisticListPopulation5.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(list_chromosome14, (int) (byte) 100, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome14);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        boolean b5 = defaultedMap4.isEmpty();
        defaultedMap4.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate7, predicate8);
        java.util.Set set10 = defaultedMap4.entrySet();
        defaultedMap4.clear();
        java.util.Set set12 = defaultedMap4.keySet();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        int i6 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        java.lang.String str5 = defaultedMap4.toString();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome7);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation12.iterator();
        double d14 = elitisticListPopulation12.getElitismRate();
        int i15 = elitisticListPopulation12.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17);
        double d21 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertTrue(i15 == 100);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(d21 == 0.0d);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d18 = elitisticListPopulation17.getElitismRate();
        int i19 = elitisticListPopulation17.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.Population population24 = elitisticListPopulation17.nextGeneration();
        java.lang.Object obj26 = defaultedMap4.put((java.lang.Object) elitisticListPopulation17, (java.lang.Object) 10.0f);
        boolean b28 = defaultedMap4.equals((java.lang.Object) (byte) 100);
        defaultedMap4.clear();
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31, (int) 'a', (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome36 = elitisticListPopulation35.spliterator();
        boolean b37 = defaultedMap4.containsValue((java.lang.Object) elitisticListPopulation35);
        elitisticListPopulation35.setPopulationLimit((int) (byte) 1);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome36);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        boolean b10 = defaultedMap4.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d14 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) d14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation18.iterator();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) iterator_chromosome19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d24 = elitisticListPopulation23.getElitismRate();
        int i25 = elitisticListPopulation23.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation23.addChromosome(chromosome30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation34.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome36);
        java.lang.Object obj39 = defaultedMap15.put((java.lang.Object) elitisticListPopulation23, (java.lang.Object) (-1L));
        boolean b40 = defaultedMap4.equals((java.lang.Object) elitisticListPopulation23);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d45 = elitisticListPopulation44.getElitismRate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) d45);
        boolean b47 = defaultedMap46.isEmpty();
        defaultedMap46.clear();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate41, predicate50);
        java.lang.String str53 = defaultedMap4.toString();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(d45 == 0.0d);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d18 = elitisticListPopulation17.getElitismRate();
        int i19 = elitisticListPopulation17.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.Population population24 = elitisticListPopulation17.nextGeneration();
        java.lang.Object obj26 = defaultedMap4.put((java.lang.Object) elitisticListPopulation17, (java.lang.Object) 10.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d30 = elitisticListPopulation29.getElitismRate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) d30);
        boolean b32 = defaultedMap31.isEmpty();
        defaultedMap31.clear();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate34, predicate35);
        boolean b37 = defaultedMap4.containsKey((java.lang.Object) predicate34);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d41 = elitisticListPopulation40.getElitismRate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) d41);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome49 = elitisticListPopulation48.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome50 = elitisticListPopulation48.getChromosomes();
        elitisticListPopulation45.setChromosomes(list_chromosome50);
        boolean b52 = defaultedMap42.containsKey((java.lang.Object) list_chromosome50);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) 1L);
        java.lang.Object obj55 = defaultedMap4.get((java.lang.Object) defaultedMap42);
        math.genetics.Chromosome[] chromosome_array56 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome57 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b58 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57, chromosome_array56);
        math.genetics.ElitisticListPopulation elitisticListPopulation61 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome57, (int) 'a', (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array62 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome63 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b64 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome63, chromosome_array62);
        math.genetics.ElitisticListPopulation elitisticListPopulation67 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome63, (int) 'a', (double) 0.0f);
        elitisticListPopulation61.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome63);
        double d69 = elitisticListPopulation61.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome70 = elitisticListPopulation61.getChromosomes();
        boolean b71 = defaultedMap42.equals((java.lang.Object) elitisticListPopulation61);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(d30 == 0.0d);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(d41 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome49);
        org.junit.Assert.assertNotNull(list_chromosome50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 0.0d + "'", obj55.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(chromosome_array62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(d69 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome70);
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        boolean b10 = defaultedMap4.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d14 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) d14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation18.iterator();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) iterator_chromosome19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d24 = elitisticListPopulation23.getElitismRate();
        int i25 = elitisticListPopulation23.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation23.addChromosome(chromosome30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation34.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome36);
        java.lang.Object obj39 = defaultedMap15.put((java.lang.Object) elitisticListPopulation23, (java.lang.Object) (-1L));
        boolean b40 = defaultedMap4.equals((java.lang.Object) elitisticListPopulation23);
        java.util.Set set41 = defaultedMap4.entrySet();
        int i42 = defaultedMap4.size();
        collections.PredicateUtils predicateUtils43 = new collections.PredicateUtils();
        java.lang.Object obj44 = defaultedMap4.get((java.lang.Object) predicateUtils43);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0.0d + "'", obj44.equals(0.0d));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', (double) 0.0f);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        double d13 = elitisticListPopulation5.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation5.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(list_chromosome14, (int) '#', (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation21.iterator();
        double d23 = elitisticListPopulation21.getElitismRate();
        int i24 = elitisticListPopulation21.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        elitisticListPopulation21.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) (short) 0, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertTrue(d23 == 0.0d);
        org.junit.Assert.assertTrue(i24 == 100);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        try {
            elitisticListPopulation2.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(population4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome7);
        java.lang.String str9 = elitisticListPopulation2.toString();
        int i10 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d18 = elitisticListPopulation17.getElitismRate();
        int i19 = elitisticListPopulation17.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.Population population24 = elitisticListPopulation17.nextGeneration();
        java.lang.Object obj26 = defaultedMap4.put((java.lang.Object) elitisticListPopulation17, (java.lang.Object) 10.0f);
        boolean b28 = defaultedMap4.equals((java.lang.Object) (byte) 100);
        defaultedMap4.clear();
        java.lang.String str30 = defaultedMap4.toString();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', (double) 0.0f);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        double d13 = elitisticListPopulation5.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation5.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(list_chromosome14, (int) '#', (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        int i19 = elitisticListPopulation17.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertTrue(i19 == 35);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d18 = elitisticListPopulation17.getElitismRate();
        int i19 = elitisticListPopulation17.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.Population population24 = elitisticListPopulation17.nextGeneration();
        java.lang.Object obj26 = defaultedMap4.put((java.lang.Object) elitisticListPopulation17, (java.lang.Object) 10.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d30 = elitisticListPopulation29.getElitismRate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) d30);
        boolean b32 = defaultedMap31.isEmpty();
        defaultedMap31.clear();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate34, predicate35);
        boolean b37 = defaultedMap4.containsKey((java.lang.Object) predicate34);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d41 = elitisticListPopulation40.getElitismRate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) d41);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome49 = elitisticListPopulation48.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome50 = elitisticListPopulation48.getChromosomes();
        elitisticListPopulation45.setChromosomes(list_chromosome50);
        boolean b52 = defaultedMap42.containsKey((java.lang.Object) list_chromosome50);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) 1L);
        java.lang.Object obj55 = defaultedMap4.get((java.lang.Object) defaultedMap42);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d59 = elitisticListPopulation58.getElitismRate();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) d59);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome64 = elitisticListPopulation63.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome65 = elitisticListPopulation63.getChromosomes();
        java.lang.Object obj66 = null;
        java.lang.Object obj67 = defaultedMap60.put((java.lang.Object) elitisticListPopulation63, obj66);
        int i68 = elitisticListPopulation63.getPopulationLimit();
        boolean b69 = defaultedMap4.equals((java.lang.Object) i68);
        java.util.Set set70 = defaultedMap4.keySet();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(d30 == 0.0d);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(d41 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome49);
        org.junit.Assert.assertNotNull(list_chromosome50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 0.0d + "'", obj55.equals(0.0d));
        org.junit.Assert.assertTrue(d59 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome64);
        org.junit.Assert.assertNotNull(list_chromosome65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(i68 == 100);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(set70);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        java.lang.String str6 = elitisticListPopulation5.toString();
        double d7 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertTrue(d7 == 0.0d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        double d6 = elitisticListPopulation2.getElitismRate();
        int i7 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(i7 == 100);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1L);
        java.util.Collection collection17 = defaultedMap4.values();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        boolean b10 = defaultedMap4.isEmpty();
        java.util.Collection collection11 = defaultedMap4.values();
        java.util.Set set12 = defaultedMap4.keySet();
        java.lang.Object obj14 = defaultedMap4.remove((java.lang.Object) 10);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', (double) 0.0f);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        double d13 = elitisticListPopulation5.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(list_chromosome14, (int) (short) 10, (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome14);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d8 = elitisticListPopulation7.getElitismRate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) d8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation12.iterator();
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) iterator_chromosome13);
        boolean b15 = defaultedMap9.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d19 = elitisticListPopulation18.getElitismRate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) d19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation23.iterator();
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) iterator_chromosome24);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d29 = elitisticListPopulation28.getElitismRate();
        int i30 = elitisticListPopulation28.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        elitisticListPopulation28.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32);
        math.genetics.Chromosome chromosome35 = null;
        elitisticListPopulation28.addChromosome(chromosome35);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome40 = elitisticListPopulation39.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation39.getChromosomes();
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome41);
        java.lang.Object obj44 = defaultedMap20.put((java.lang.Object) elitisticListPopulation28, (java.lang.Object) (-1L));
        boolean b45 = defaultedMap9.equals((java.lang.Object) elitisticListPopulation28);
        java.util.Set set46 = defaultedMap9.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d50 = elitisticListPopulation49.getElitismRate();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) d50);
        boolean b52 = defaultedMap51.isEmpty();
        defaultedMap51.clear();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate54, predicate55);
        defaultedMap51.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d61 = elitisticListPopulation60.getElitismRate();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) d61);
        math.genetics.ElitisticListPopulation elitisticListPopulation65 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation68 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome69 = elitisticListPopulation68.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome70 = elitisticListPopulation68.getChromosomes();
        elitisticListPopulation65.setChromosomes(list_chromosome70);
        boolean b72 = defaultedMap62.containsKey((java.lang.Object) list_chromosome70);
        math.genetics.ElitisticListPopulation elitisticListPopulation75 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d76 = elitisticListPopulation75.getElitismRate();
        int i77 = elitisticListPopulation75.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array78 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome79 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b80 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome79, chromosome_array78);
        elitisticListPopulation75.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome79);
        math.genetics.Population population82 = elitisticListPopulation75.nextGeneration();
        java.lang.Object obj84 = defaultedMap62.put((java.lang.Object) elitisticListPopulation75, (java.lang.Object) 10.0f);
        math.genetics.Chromosome[] chromosome_array85 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome86 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b87 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome86, chromosome_array85);
        math.genetics.ElitisticListPopulation elitisticListPopulation90 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome86, (int) 'a', (double) 0.0f);
        int i91 = elitisticListPopulation90.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome92 = elitisticListPopulation90.getChromosomes();
        elitisticListPopulation75.setChromosomes(list_chromosome92);
        java.lang.Object obj94 = defaultedMap9.put((java.lang.Object) defaultedMap51, (java.lang.Object) list_chromosome92);
        elitisticListPopulation2.setChromosomes(list_chromosome92);
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0.0d + "'", obj25.equals(0.0d));
        org.junit.Assert.assertTrue(d29 == 0.0d);
        org.junit.Assert.assertTrue(i30 == 100);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome40);
        org.junit.Assert.assertNotNull(list_chromosome41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(d50 == 0.0d);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(d61 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome69);
        org.junit.Assert.assertNotNull(list_chromosome70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(d76 == 0.0d);
        org.junit.Assert.assertTrue(i77 == 100);
        org.junit.Assert.assertNotNull(chromosome_array78);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(population82);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(chromosome_array85);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(i91 == 0);
        org.junit.Assert.assertNotNull(list_chromosome92);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', (double) 0.0f);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation5.spliterator();
        math.genetics.Population population14 = elitisticListPopulation5.nextGeneration();
        int i15 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation5);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation5.spliterator();
        int i8 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d18 = elitisticListPopulation17.getElitismRate();
        int i19 = elitisticListPopulation17.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.Population population24 = elitisticListPopulation17.nextGeneration();
        java.lang.Object obj26 = defaultedMap4.put((java.lang.Object) elitisticListPopulation17, (java.lang.Object) 10.0f);
        boolean b28 = defaultedMap4.equals((java.lang.Object) (byte) 100);
        defaultedMap4.clear();
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31, (int) 'a', (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome36 = elitisticListPopulation35.spliterator();
        boolean b37 = defaultedMap4.containsValue((java.lang.Object) elitisticListPopulation35);
        math.genetics.Population population38 = elitisticListPopulation35.nextGeneration();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(population38);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        boolean b5 = defaultedMap4.isEmpty();
        defaultedMap4.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate7, predicate8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation12.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation12.getChromosomes();
        java.lang.Object obj15 = defaultedMap4.remove((java.lang.Object) list_chromosome14);
        java.util.Set set16 = defaultedMap4.keySet();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        boolean b5 = defaultedMap4.isEmpty();
        defaultedMap4.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate7, predicate8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation12.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation12.getChromosomes();
        java.lang.Object obj15 = defaultedMap4.remove((java.lang.Object) list_chromosome14);
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap4.remove(obj16);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d13 = elitisticListPopulation12.getElitismRate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) d13);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation20.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation17.setChromosomes(list_chromosome22);
        boolean b24 = defaultedMap14.containsKey((java.lang.Object) list_chromosome22);
        java.lang.Object obj26 = defaultedMap14.get((java.lang.Object) 0.0f);
        int i27 = defaultedMap14.size();
        java.lang.Object obj28 = defaultedMap4.get((java.lang.Object) defaultedMap14);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) 'a', (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) 'a', (double) 0.0f);
        elitisticListPopulation34.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36);
        java.lang.Object obj42 = null;
        java.lang.Object obj43 = defaultedMap4.put((java.lang.Object) elitisticListPopulation34, obj42);
        java.util.List<math.genetics.Chromosome> list_chromosome44 = elitisticListPopulation34.getChromosomes();
        double d45 = elitisticListPopulation34.getElitismRate();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
        org.junit.Assert.assertNotNull(list_chromosome22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0.0d + "'", obj28.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(list_chromosome44);
        org.junit.Assert.assertTrue(d45 == 0.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        boolean b10 = defaultedMap4.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d14 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) d14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation18.iterator();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) iterator_chromosome19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d24 = elitisticListPopulation23.getElitismRate();
        int i25 = elitisticListPopulation23.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation23.addChromosome(chromosome30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation34.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome36);
        java.lang.Object obj39 = defaultedMap15.put((java.lang.Object) elitisticListPopulation23, (java.lang.Object) (-1L));
        boolean b40 = defaultedMap4.equals((java.lang.Object) elitisticListPopulation23);
        java.util.Set set41 = defaultedMap4.entrySet();
        java.lang.String str42 = defaultedMap4.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d46 = elitisticListPopulation45.getElitismRate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) d46);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation53.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation50.setChromosomes(list_chromosome55);
        boolean b57 = defaultedMap47.containsKey((java.lang.Object) list_chromosome55);
        boolean b58 = defaultedMap47.isEmpty();
        java.lang.Object obj59 = defaultedMap4.remove((java.lang.Object) defaultedMap47);
        defaultedMap4.clear();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(d46 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation(list_chromosome5, (int) (short) 1, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(list_chromosome5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1L);
        boolean b18 = defaultedMap4.containsKey((java.lang.Object) (byte) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d22 = elitisticListPopulation21.getElitismRate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) d22);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome27 = elitisticListPopulation26.iterator();
        java.lang.Object obj28 = defaultedMap23.get((java.lang.Object) iterator_chromosome27);
        boolean b29 = defaultedMap23.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d33 = elitisticListPopulation32.getElitismRate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) d33);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome38 = elitisticListPopulation37.iterator();
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) iterator_chromosome38);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d43 = elitisticListPopulation42.getElitismRate();
        int i44 = elitisticListPopulation42.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        elitisticListPopulation42.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46);
        math.genetics.Chromosome chromosome49 = null;
        elitisticListPopulation42.addChromosome(chromosome49);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation53.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation42.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome55);
        java.lang.Object obj58 = defaultedMap34.put((java.lang.Object) elitisticListPopulation42, (java.lang.Object) (-1L));
        boolean b59 = defaultedMap23.equals((java.lang.Object) elitisticListPopulation42);
        java.util.Set set60 = defaultedMap23.entrySet();
        boolean b61 = defaultedMap4.containsValue((java.lang.Object) defaultedMap23);
        java.util.Set set62 = defaultedMap4.keySet();
        defaultedMap4.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation66 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation69 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome70 = elitisticListPopulation69.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome71 = elitisticListPopulation69.getChromosomes();
        elitisticListPopulation66.setChromosomes(list_chromosome71);
        java.lang.String str73 = elitisticListPopulation66.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome74 = elitisticListPopulation66.getChromosomes();
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) elitisticListPopulation66);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(d22 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0.0d + "'", obj28.equals(0.0d));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(d33 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0.0d + "'", obj39.equals(0.0d));
        org.junit.Assert.assertTrue(d43 == 0.0d);
        org.junit.Assert.assertTrue(i44 == 100);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(iterator_chromosome70);
        org.junit.Assert.assertNotNull(list_chromosome71);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "[]" + "'", str73.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome74);
        org.junit.Assert.assertNotNull(map75);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        double d4 = elitisticListPopulation2.getElitismRate();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation2.getPopulationLimit();
        int i11 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertTrue(i5 == 100);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 100);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        boolean b10 = defaultedMap4.isEmpty();
        java.util.Collection collection11 = defaultedMap4.values();
        java.util.Set set12 = defaultedMap4.keySet();
        java.util.Set set13 = defaultedMap4.entrySet();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        boolean b10 = defaultedMap4.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d14 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) d14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation18.iterator();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) iterator_chromosome19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d24 = elitisticListPopulation23.getElitismRate();
        int i25 = elitisticListPopulation23.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation23.addChromosome(chromosome30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation34.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome36);
        java.lang.Object obj39 = defaultedMap15.put((java.lang.Object) elitisticListPopulation23, (java.lang.Object) (-1L));
        boolean b40 = defaultedMap4.equals((java.lang.Object) elitisticListPopulation23);
        java.util.Set set41 = defaultedMap4.entrySet();
        java.lang.String str42 = defaultedMap4.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d46 = elitisticListPopulation45.getElitismRate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) d46);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation53.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation50.setChromosomes(list_chromosome55);
        boolean b57 = defaultedMap47.containsKey((java.lang.Object) list_chromosome55);
        boolean b58 = defaultedMap47.isEmpty();
        java.lang.Object obj59 = defaultedMap4.remove((java.lang.Object) defaultedMap47);
        math.genetics.ElitisticListPopulation elitisticListPopulation62 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d63 = elitisticListPopulation62.getElitismRate();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) d63);
        boolean b65 = defaultedMap64.isEmpty();
        defaultedMap64.clear();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate67, predicate68);
        math.genetics.ElitisticListPopulation elitisticListPopulation72 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome73 = elitisticListPopulation72.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome74 = elitisticListPopulation72.getChromosomes();
        java.lang.Object obj75 = defaultedMap64.remove((java.lang.Object) list_chromosome74);
        java.lang.Object obj76 = defaultedMap47.get(obj75);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(d46 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(d63 == 0.0d);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(iterator_chromosome73);
        org.junit.Assert.assertNotNull(list_chromosome74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 0.0d + "'", obj76.equals(0.0d));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        boolean b10 = defaultedMap4.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d14 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) d14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation18.iterator();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) iterator_chromosome19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d24 = elitisticListPopulation23.getElitismRate();
        int i25 = elitisticListPopulation23.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation23.addChromosome(chromosome30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation34.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome36);
        java.lang.Object obj39 = defaultedMap15.put((java.lang.Object) elitisticListPopulation23, (java.lang.Object) (-1L));
        boolean b40 = defaultedMap4.equals((java.lang.Object) elitisticListPopulation23);
        collections.Transformer transformer41 = null;
        try {
            java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6);
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation2.addChromosome(chromosome9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation13.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome15);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(list_chromosome15, 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertNotNull(list_chromosome15);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        boolean b10 = defaultedMap4.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d14 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) d14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation18.iterator();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) iterator_chromosome19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d24 = elitisticListPopulation23.getElitismRate();
        int i25 = elitisticListPopulation23.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation23.addChromosome(chromosome30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation34.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome36);
        java.lang.Object obj39 = defaultedMap15.put((java.lang.Object) elitisticListPopulation23, (java.lang.Object) (-1L));
        boolean b40 = defaultedMap4.equals((java.lang.Object) elitisticListPopulation23);
        java.util.Set set41 = defaultedMap4.entrySet();
        java.util.Set set42 = defaultedMap4.entrySet();
        int i43 = defaultedMap4.size();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(i43 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6);
        double d9 = elitisticListPopulation2.getElitismRate();
        double d10 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertTrue(d10 == 0.0d);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation5.spliterator();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        boolean b10 = defaultedMap4.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d14 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) d14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation18.iterator();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) iterator_chromosome19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d24 = elitisticListPopulation23.getElitismRate();
        int i25 = elitisticListPopulation23.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation23.addChromosome(chromosome30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation34.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome36);
        java.lang.Object obj39 = defaultedMap15.put((java.lang.Object) elitisticListPopulation23, (java.lang.Object) (-1L));
        boolean b40 = defaultedMap4.equals((java.lang.Object) elitisticListPopulation23);
        java.util.Set set41 = defaultedMap4.entrySet();
        java.lang.String str42 = defaultedMap4.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d46 = elitisticListPopulation45.getElitismRate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) d46);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation53.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation50.setChromosomes(list_chromosome55);
        boolean b57 = defaultedMap47.containsKey((java.lang.Object) list_chromosome55);
        boolean b58 = defaultedMap47.isEmpty();
        java.lang.Object obj59 = defaultedMap4.remove((java.lang.Object) defaultedMap47);
        math.genetics.Chromosome[] chromosome_array60 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome61 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61, chromosome_array60);
        math.genetics.ElitisticListPopulation elitisticListPopulation65 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome61, (int) 'a', (double) 0.0f);
        int i66 = elitisticListPopulation65.getPopulationSize();
        java.lang.Object obj67 = defaultedMap47.get((java.lang.Object) i66);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(d46 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(chromosome_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 0.0d + "'", obj67.equals(0.0d));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6);
        double d9 = elitisticListPopulation2.getElitismRate();
        int i10 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertTrue(i10 == 100);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation5);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome7);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation11.iterator();
        double d13 = elitisticListPopulation11.getElitismRate();
        int i14 = elitisticListPopulation11.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation11.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Population population19 = elitisticListPopulation11.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation11.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome20);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation(list_chromosome20, (int) (byte) -1, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertTrue(i14 == 100);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertNotNull(list_chromosome20);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        defaultedMap9.clear();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        boolean b5 = defaultedMap4.isEmpty();
        defaultedMap4.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate7, predicate8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation12.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation12.getChromosomes();
        java.lang.Object obj15 = defaultedMap4.remove((java.lang.Object) list_chromosome14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d19 = elitisticListPopulation18.getElitismRate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) d19);
        boolean b21 = defaultedMap20.isEmpty();
        defaultedMap20.clear();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate23, predicate24);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome29 = elitisticListPopulation28.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation28.getChromosomes();
        java.lang.Object obj31 = defaultedMap20.remove((java.lang.Object) list_chromosome30);
        boolean b33 = defaultedMap20.containsKey((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap4.remove((java.lang.Object) defaultedMap20);
        java.util.Collection collection35 = defaultedMap20.values();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(iterator_chromosome29);
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation5.spliterator();
        try {
            math.genetics.Chromosome chromosome8 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap4.put((java.lang.Object) elitisticListPopulation7, obj10);
        int i12 = elitisticListPopulation7.getPopulationLimit();
        elitisticListPopulation7.setPopulationLimit((int) (short) 10);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation7.getChromosomes();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertNotNull(list_chromosome15);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        boolean b5 = defaultedMap4.isEmpty();
        defaultedMap4.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate7, predicate8);
        defaultedMap4.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d14 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) d14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation18.iterator();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) iterator_chromosome19);
        java.util.Set set21 = defaultedMap15.entrySet();
        boolean b22 = defaultedMap4.containsValue((java.lang.Object) defaultedMap15);
        java.util.Collection collection23 = defaultedMap15.values();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1L);
        boolean b18 = defaultedMap4.containsKey((java.lang.Object) (byte) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d22 = elitisticListPopulation21.getElitismRate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) d22);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome27 = elitisticListPopulation26.iterator();
        java.lang.Object obj28 = defaultedMap23.get((java.lang.Object) iterator_chromosome27);
        boolean b29 = defaultedMap23.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d33 = elitisticListPopulation32.getElitismRate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) d33);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome38 = elitisticListPopulation37.iterator();
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) iterator_chromosome38);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d43 = elitisticListPopulation42.getElitismRate();
        int i44 = elitisticListPopulation42.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        elitisticListPopulation42.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46);
        math.genetics.Chromosome chromosome49 = null;
        elitisticListPopulation42.addChromosome(chromosome49);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation53.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation42.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome55);
        java.lang.Object obj58 = defaultedMap34.put((java.lang.Object) elitisticListPopulation42, (java.lang.Object) (-1L));
        boolean b59 = defaultedMap23.equals((java.lang.Object) elitisticListPopulation42);
        java.util.Set set60 = defaultedMap23.entrySet();
        boolean b61 = defaultedMap4.containsValue((java.lang.Object) defaultedMap23);
        java.util.Set set62 = defaultedMap23.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation65 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d66 = elitisticListPopulation65.getElitismRate();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) d66);
        boolean b68 = defaultedMap67.isEmpty();
        defaultedMap67.clear();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate70, predicate71);
        math.genetics.ElitisticListPopulation elitisticListPopulation75 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome76 = elitisticListPopulation75.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome77 = elitisticListPopulation75.getChromosomes();
        java.lang.Object obj78 = defaultedMap67.remove((java.lang.Object) list_chromosome77);
        java.lang.Object obj79 = defaultedMap23.remove((java.lang.Object) defaultedMap67);
        math.genetics.ElitisticListPopulation elitisticListPopulation82 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.Population population83 = elitisticListPopulation82.nextGeneration();
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) population83);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(d22 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0.0d + "'", obj28.equals(0.0d));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(d33 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0.0d + "'", obj39.equals(0.0d));
        org.junit.Assert.assertTrue(d43 == 0.0d);
        org.junit.Assert.assertTrue(i44 == 100);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(d66 == 0.0d);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(iterator_chromosome76);
        org.junit.Assert.assertNotNull(list_chromosome77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(population83);
        org.junit.Assert.assertNotNull(map84);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d9 = elitisticListPopulation8.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation13.iterator();
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) iterator_chromosome14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d19 = elitisticListPopulation18.getElitismRate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) d19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome27 = elitisticListPopulation26.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation26.getChromosomes();
        elitisticListPopulation23.setChromosomes(list_chromosome28);
        boolean b30 = defaultedMap20.containsKey((java.lang.Object) list_chromosome28);
        java.lang.Object obj32 = defaultedMap20.get((java.lang.Object) 0.0f);
        int i33 = defaultedMap20.size();
        java.lang.Object obj34 = defaultedMap10.get((java.lang.Object) defaultedMap20);
        java.util.Collection collection35 = defaultedMap20.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection35);
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0.0d + "'", obj15.equals(0.0d));
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome27);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0.0d + "'", obj32.equals(0.0d));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0.0d + "'", obj34.equals(0.0d));
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6);
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation2.addChromosome(chromosome9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation13.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation19.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome21);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome26 = elitisticListPopulation25.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation25.getChromosomes();
        int i28 = elitisticListPopulation25.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d32 = elitisticListPopulation31.getElitismRate();
        int i33 = elitisticListPopulation31.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        elitisticListPopulation31.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35);
        elitisticListPopulation25.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(iterator_chromosome26);
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertTrue(i28 == 100);
        org.junit.Assert.assertTrue(d32 == 0.0d);
        org.junit.Assert.assertTrue(i33 == 100);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        double d4 = elitisticListPopulation2.getElitismRate();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertTrue(i5 == 100);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap4.put((java.lang.Object) elitisticListPopulation7, obj10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0.0f);
        double d15 = elitisticListPopulation14.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d19 = elitisticListPopulation18.getElitismRate();
        int i20 = elitisticListPopulation18.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        elitisticListPopulation18.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22);
        math.genetics.Chromosome chromosome25 = null;
        elitisticListPopulation18.addChromosome(chromosome25);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome30 = elitisticListPopulation29.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation29.getChromosomes();
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome31);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome36 = elitisticListPopulation35.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome37 = elitisticListPopulation35.getChromosomes();
        elitisticListPopulation18.setChromosomes(list_chromosome37);
        elitisticListPopulation14.setChromosomes(list_chromosome37);
        elitisticListPopulation7.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome37);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertTrue(i20 == 100);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome30);
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertNotNull(iterator_chromosome36);
        org.junit.Assert.assertNotNull(list_chromosome37);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        java.lang.Object obj16 = defaultedMap4.get((java.lang.Object) 0.0f);
        int i17 = defaultedMap4.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d21 = elitisticListPopulation20.getElitismRate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) d21);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome29 = elitisticListPopulation28.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation25.setChromosomes(list_chromosome30);
        boolean b32 = defaultedMap22.containsKey((java.lang.Object) list_chromosome30);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 1L);
        boolean b36 = defaultedMap22.containsKey((java.lang.Object) (byte) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d40 = elitisticListPopulation39.getElitismRate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) d40);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome45 = elitisticListPopulation44.iterator();
        java.lang.Object obj46 = defaultedMap41.get((java.lang.Object) iterator_chromosome45);
        boolean b47 = defaultedMap41.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d51 = elitisticListPopulation50.getElitismRate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) d51);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome56 = elitisticListPopulation55.iterator();
        java.lang.Object obj57 = defaultedMap52.get((java.lang.Object) iterator_chromosome56);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d61 = elitisticListPopulation60.getElitismRate();
        int i62 = elitisticListPopulation60.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array63 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome64 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b65 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome64, chromosome_array63);
        elitisticListPopulation60.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome64);
        math.genetics.Chromosome chromosome67 = null;
        elitisticListPopulation60.addChromosome(chromosome67);
        math.genetics.ElitisticListPopulation elitisticListPopulation71 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome72 = elitisticListPopulation71.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome73 = elitisticListPopulation71.getChromosomes();
        elitisticListPopulation60.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome73);
        java.lang.Object obj76 = defaultedMap52.put((java.lang.Object) elitisticListPopulation60, (java.lang.Object) (-1L));
        boolean b77 = defaultedMap41.equals((java.lang.Object) elitisticListPopulation60);
        java.util.Set set78 = defaultedMap41.entrySet();
        boolean b79 = defaultedMap22.containsValue((java.lang.Object) defaultedMap41);
        java.lang.Object obj80 = defaultedMap4.get((java.lang.Object) defaultedMap41);
        math.genetics.ElitisticListPopulation elitisticListPopulation83 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d84 = elitisticListPopulation83.getElitismRate();
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) d84);
        math.genetics.ElitisticListPopulation elitisticListPopulation88 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation91 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome92 = elitisticListPopulation91.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome93 = elitisticListPopulation91.getChromosomes();
        elitisticListPopulation88.setChromosomes(list_chromosome93);
        boolean b95 = defaultedMap85.containsKey((java.lang.Object) list_chromosome93);
        java.lang.Object obj96 = defaultedMap4.get((java.lang.Object) b95);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0.0d + "'", obj16.equals(0.0d));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(d21 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome29);
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(d40 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0.0d + "'", obj46.equals(0.0d));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(d51 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0.0d + "'", obj57.equals(0.0d));
        org.junit.Assert.assertTrue(d61 == 0.0d);
        org.junit.Assert.assertTrue(i62 == 100);
        org.junit.Assert.assertNotNull(chromosome_array63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome72);
        org.junit.Assert.assertNotNull(list_chromosome73);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 0.0d + "'", obj80.equals(0.0d));
        org.junit.Assert.assertTrue(d84 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome92);
        org.junit.Assert.assertNotNull(list_chromosome93);
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertTrue("'" + obj96 + "' != '" + 0.0d + "'", obj96.equals(0.0d));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        boolean b10 = defaultedMap4.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d14 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) d14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation18.iterator();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) iterator_chromosome19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d24 = elitisticListPopulation23.getElitismRate();
        int i25 = elitisticListPopulation23.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation23.addChromosome(chromosome30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation34.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome36);
        java.lang.Object obj39 = defaultedMap15.put((java.lang.Object) elitisticListPopulation23, (java.lang.Object) (-1L));
        boolean b40 = defaultedMap4.equals((java.lang.Object) elitisticListPopulation23);
        defaultedMap4.clear();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d13 = elitisticListPopulation12.getElitismRate();
        int i14 = elitisticListPopulation12.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation12.addChromosome(chromosome19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation23.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome25);
        java.lang.Object obj28 = defaultedMap4.put((java.lang.Object) elitisticListPopulation12, (java.lang.Object) (-1L));
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome29 = elitisticListPopulation12.iterator();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertTrue(i14 == 100);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome24);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(iterator_chromosome29);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d18 = elitisticListPopulation17.getElitismRate();
        int i19 = elitisticListPopulation17.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.Population population24 = elitisticListPopulation17.nextGeneration();
        java.lang.Object obj26 = defaultedMap4.put((java.lang.Object) elitisticListPopulation17, (java.lang.Object) 10.0f);
        boolean b28 = defaultedMap4.equals((java.lang.Object) (byte) 100);
        defaultedMap4.clear();
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31, (int) 'a', (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome36 = elitisticListPopulation35.spliterator();
        boolean b37 = defaultedMap4.containsValue((java.lang.Object) elitisticListPopulation35);
        defaultedMap4.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d42 = elitisticListPopulation41.getElitismRate();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) d42);
        boolean b44 = defaultedMap43.isEmpty();
        defaultedMap43.clear();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate46, predicate47);
        defaultedMap43.clear();
        defaultedMap4.putAll((java.util.Map) defaultedMap43);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(d42 == 0.0d);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation5.spliterator();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.lang.String str8 = elitisticListPopulation5.toString();
        math.genetics.Population population9 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(population9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        boolean b10 = defaultedMap4.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d14 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) d14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation18.iterator();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) iterator_chromosome19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d24 = elitisticListPopulation23.getElitismRate();
        int i25 = elitisticListPopulation23.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation23.addChromosome(chromosome30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation34.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome36);
        java.lang.Object obj39 = defaultedMap15.put((java.lang.Object) elitisticListPopulation23, (java.lang.Object) (-1L));
        boolean b40 = defaultedMap4.equals((java.lang.Object) elitisticListPopulation23);
        java.util.Set set41 = defaultedMap4.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d45 = elitisticListPopulation44.getElitismRate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) d45);
        boolean b47 = defaultedMap46.isEmpty();
        defaultedMap46.clear();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate49, predicate50);
        defaultedMap46.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d56 = elitisticListPopulation55.getElitismRate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) d56);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome64 = elitisticListPopulation63.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome65 = elitisticListPopulation63.getChromosomes();
        elitisticListPopulation60.setChromosomes(list_chromosome65);
        boolean b67 = defaultedMap57.containsKey((java.lang.Object) list_chromosome65);
        math.genetics.ElitisticListPopulation elitisticListPopulation70 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d71 = elitisticListPopulation70.getElitismRate();
        int i72 = elitisticListPopulation70.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array73 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome74 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b75 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome74, chromosome_array73);
        elitisticListPopulation70.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome74);
        math.genetics.Population population77 = elitisticListPopulation70.nextGeneration();
        java.lang.Object obj79 = defaultedMap57.put((java.lang.Object) elitisticListPopulation70, (java.lang.Object) 10.0f);
        math.genetics.Chromosome[] chromosome_array80 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome81 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b82 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome81, chromosome_array80);
        math.genetics.ElitisticListPopulation elitisticListPopulation85 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome81, (int) 'a', (double) 0.0f);
        int i86 = elitisticListPopulation85.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome87 = elitisticListPopulation85.getChromosomes();
        elitisticListPopulation70.setChromosomes(list_chromosome87);
        java.lang.Object obj89 = defaultedMap4.put((java.lang.Object) defaultedMap46, (java.lang.Object) list_chromosome87);
        java.util.Collection collection90 = defaultedMap4.values();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(d45 == 0.0d);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(d56 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome64);
        org.junit.Assert.assertNotNull(list_chromosome65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(d71 == 0.0d);
        org.junit.Assert.assertTrue(i72 == 100);
        org.junit.Assert.assertNotNull(chromosome_array73);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(population77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(chromosome_array80);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertNotNull(list_chromosome87);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(collection90);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d13 = elitisticListPopulation12.getElitismRate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) d13);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation20.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation17.setChromosomes(list_chromosome22);
        boolean b24 = defaultedMap14.containsKey((java.lang.Object) list_chromosome22);
        java.lang.Object obj26 = defaultedMap14.get((java.lang.Object) 0.0f);
        int i27 = defaultedMap14.size();
        java.lang.Object obj28 = defaultedMap4.get((java.lang.Object) defaultedMap14);
        java.util.Collection collection29 = defaultedMap14.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d33 = elitisticListPopulation32.getElitismRate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) d33);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome41 = elitisticListPopulation40.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation40.getChromosomes();
        elitisticListPopulation37.setChromosomes(list_chromosome42);
        boolean b44 = defaultedMap34.containsKey((java.lang.Object) list_chromosome42);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d48 = elitisticListPopulation47.getElitismRate();
        int i49 = elitisticListPopulation47.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        elitisticListPopulation47.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome51);
        math.genetics.Population population54 = elitisticListPopulation47.nextGeneration();
        java.lang.Object obj56 = defaultedMap34.put((java.lang.Object) elitisticListPopulation47, (java.lang.Object) 10.0f);
        boolean b58 = defaultedMap34.equals((java.lang.Object) (byte) 100);
        defaultedMap34.clear();
        math.genetics.Chromosome[] chromosome_array60 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome61 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61, chromosome_array60);
        math.genetics.ElitisticListPopulation elitisticListPopulation65 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome61, (int) 'a', (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome66 = elitisticListPopulation65.spliterator();
        boolean b67 = defaultedMap34.containsValue((java.lang.Object) elitisticListPopulation65);
        math.genetics.ElitisticListPopulation elitisticListPopulation70 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome71 = elitisticListPopulation70.iterator();
        double d72 = elitisticListPopulation70.getElitismRate();
        int i73 = elitisticListPopulation70.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array74 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome75 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b76 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome75, chromosome_array74);
        elitisticListPopulation70.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome75);
        math.genetics.Population population78 = elitisticListPopulation70.nextGeneration();
        java.lang.Object obj79 = defaultedMap34.remove((java.lang.Object) population78);
        boolean b80 = defaultedMap34.isEmpty();
        defaultedMap34.clear();
        boolean b82 = defaultedMap14.containsKey((java.lang.Object) defaultedMap34);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
        org.junit.Assert.assertNotNull(list_chromosome22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0.0d + "'", obj28.equals(0.0d));
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(d33 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome41);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(d48 == 0.0d);
        org.junit.Assert.assertTrue(i49 == 100);
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(population54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(chromosome_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome71);
        org.junit.Assert.assertTrue(d72 == 0.0d);
        org.junit.Assert.assertTrue(i73 == 100);
        org.junit.Assert.assertNotNull(chromosome_array74);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(population78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(b82 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        boolean b10 = defaultedMap4.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d14 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) d14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation18.iterator();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) iterator_chromosome19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d24 = elitisticListPopulation23.getElitismRate();
        int i25 = elitisticListPopulation23.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation23.addChromosome(chromosome30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation34.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome36);
        java.lang.Object obj39 = defaultedMap15.put((java.lang.Object) elitisticListPopulation23, (java.lang.Object) (-1L));
        boolean b40 = defaultedMap4.equals((java.lang.Object) elitisticListPopulation23);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d44 = elitisticListPopulation43.getElitismRate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) d44);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome49 = elitisticListPopulation48.iterator();
        java.lang.Object obj50 = defaultedMap45.get((java.lang.Object) iterator_chromosome49);
        boolean b51 = defaultedMap45.isEmpty();
        boolean b52 = defaultedMap4.containsValue((java.lang.Object) defaultedMap45);
        int i53 = defaultedMap45.size();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(d44 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0.0d + "'", obj50.equals(0.0d));
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1L);
        boolean b18 = defaultedMap4.containsKey((java.lang.Object) (byte) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d22 = elitisticListPopulation21.getElitismRate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) d22);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome30 = elitisticListPopulation29.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation29.getChromosomes();
        elitisticListPopulation26.setChromosomes(list_chromosome31);
        boolean b33 = defaultedMap23.containsKey((java.lang.Object) list_chromosome31);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d37 = elitisticListPopulation36.getElitismRate();
        int i38 = elitisticListPopulation36.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        elitisticListPopulation36.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40);
        math.genetics.Population population43 = elitisticListPopulation36.nextGeneration();
        java.lang.Object obj45 = defaultedMap23.put((java.lang.Object) elitisticListPopulation36, (java.lang.Object) 10.0f);
        boolean b47 = defaultedMap23.equals((java.lang.Object) (byte) 100);
        defaultedMap23.clear();
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome50, (int) 'a', (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome55 = elitisticListPopulation54.spliterator();
        boolean b56 = defaultedMap23.containsValue((java.lang.Object) elitisticListPopulation54);
        defaultedMap23.clear();
        java.lang.Object obj58 = defaultedMap4.get((java.lang.Object) defaultedMap23);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(d22 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome30);
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(d37 == 0.0d);
        org.junit.Assert.assertTrue(i38 == 100);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(population43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0.0d + "'", obj58.equals(0.0d));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) iterator_chromosome8);
        boolean b10 = defaultedMap4.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d14 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) d14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation18.iterator();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) iterator_chromosome19);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d24 = elitisticListPopulation23.getElitismRate();
        int i25 = elitisticListPopulation23.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation23.addChromosome(chromosome30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation34.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome36);
        java.lang.Object obj39 = defaultedMap15.put((java.lang.Object) elitisticListPopulation23, (java.lang.Object) (-1L));
        boolean b40 = defaultedMap4.equals((java.lang.Object) elitisticListPopulation23);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d44 = elitisticListPopulation43.getElitismRate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) d44);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome49 = elitisticListPopulation48.iterator();
        java.lang.Object obj50 = defaultedMap45.get((java.lang.Object) iterator_chromosome49);
        boolean b51 = defaultedMap45.isEmpty();
        boolean b52 = defaultedMap4.containsValue((java.lang.Object) defaultedMap45);
        java.util.Collection collection53 = defaultedMap45.values();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(d44 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0.0d + "'", obj50.equals(0.0d));
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection53);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d8 = elitisticListPopulation7.getElitismRate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) d8);
        boolean b10 = defaultedMap9.isEmpty();
        defaultedMap9.clear();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        java.util.Set set15 = defaultedMap9.entrySet();
        defaultedMap9.clear();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d21 = elitisticListPopulation20.getElitismRate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) d21);
        boolean b23 = defaultedMap22.isEmpty();
        defaultedMap22.clear();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate17, predicate25);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation34.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation31.setChromosomes(list_chromosome36);
        java.lang.String str38 = elitisticListPopulation31.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation31.getChromosomes();
        math.genetics.Population population40 = elitisticListPopulation31.nextGeneration();
        java.lang.Object obj41 = defaultedMap4.put((java.lang.Object) predicate17, (java.lang.Object) elitisticListPopulation31);
        java.lang.String str42 = elitisticListPopulation31.toString();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(d21 == 0.0d);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome39);
        org.junit.Assert.assertNotNull(population40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[]" + "'", str42.equals("[]"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.util.List<math.genetics.Chromosome> list_chromosome0 = null;
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(list_chromosome0, 1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) iterator_chromosome3);
        boolean b6 = defaultedMap4.equals((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1L);
        boolean b18 = defaultedMap4.containsKey((java.lang.Object) (byte) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d22 = elitisticListPopulation21.getElitismRate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) d22);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome27 = elitisticListPopulation26.iterator();
        java.lang.Object obj28 = defaultedMap23.get((java.lang.Object) iterator_chromosome27);
        boolean b29 = defaultedMap23.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d33 = elitisticListPopulation32.getElitismRate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) d33);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome38 = elitisticListPopulation37.iterator();
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) iterator_chromosome38);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d43 = elitisticListPopulation42.getElitismRate();
        int i44 = elitisticListPopulation42.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        elitisticListPopulation42.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46);
        math.genetics.Chromosome chromosome49 = null;
        elitisticListPopulation42.addChromosome(chromosome49);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation53.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation42.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome55);
        java.lang.Object obj58 = defaultedMap34.put((java.lang.Object) elitisticListPopulation42, (java.lang.Object) (-1L));
        boolean b59 = defaultedMap23.equals((java.lang.Object) elitisticListPopulation42);
        java.util.Set set60 = defaultedMap23.entrySet();
        boolean b61 = defaultedMap4.containsValue((java.lang.Object) defaultedMap23);
        java.util.Set set62 = defaultedMap4.entrySet();
        java.util.Set set63 = defaultedMap4.keySet();
        java.util.Set set64 = defaultedMap4.keySet();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(d22 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0.0d + "'", obj28.equals(0.0d));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(d33 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0.0d + "'", obj39.equals(0.0d));
        org.junit.Assert.assertTrue(d43 == 0.0d);
        org.junit.Assert.assertTrue(i44 == 100);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(set64);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation5.spliterator();
        java.lang.String str7 = elitisticListPopulation5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation13.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation10.setChromosomes(list_chromosome15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation19.iterator();
        double d21 = elitisticListPopulation19.getElitismRate();
        int i22 = elitisticListPopulation19.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24);
        math.genetics.Population population27 = elitisticListPopulation19.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation10.setChromosomes(list_chromosome28);
        elitisticListPopulation5.setChromosomes(list_chromosome28);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertTrue(d21 == 0.0d);
        org.junit.Assert.assertTrue(i22 == 100);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(population27);
        org.junit.Assert.assertNotNull(list_chromosome28);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) 'a', (double) 0.0f);
        math.genetics.Population population14 = elitisticListPopulation13.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        elitisticListPopulation5.setPopulationLimit(100);
        try {
            elitisticListPopulation5.setElitismRate((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertNotNull(list_chromosome15);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        java.util.Collection collection10 = defaultedMap9.values();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0.0f);
        try {
            math.genetics.Chromosome chromosome3 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0.0f);
        double d3 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(population4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', (double) 0.0f);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        double d13 = elitisticListPopulation5.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation5.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(list_chromosome14, (int) '#', (double) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation21.iterator();
        double d23 = elitisticListPopulation21.getElitismRate();
        int i24 = elitisticListPopulation21.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        elitisticListPopulation21.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        math.genetics.Population population30 = elitisticListPopulation17.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertTrue(d23 == 0.0d);
        org.junit.Assert.assertTrue(i24 == 100);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(population30);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) d3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) list_chromosome12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        double d18 = elitisticListPopulation17.getElitismRate();
        int i19 = elitisticListPopulation17.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.Population population24 = elitisticListPopulation17.nextGeneration();
        java.lang.Object obj26 = defaultedMap4.put((java.lang.Object) elitisticListPopulation17, (java.lang.Object) 10.0f);
        boolean b28 = defaultedMap4.equals((java.lang.Object) (byte) 100);
        defaultedMap4.clear();
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31, (int) 'a', (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome36 = elitisticListPopulation35.spliterator();
        boolean b37 = defaultedMap4.containsValue((java.lang.Object) elitisticListPopulation35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome41 = elitisticListPopulation40.iterator();
        double d42 = elitisticListPopulation40.getElitismRate();
        int i43 = elitisticListPopulation40.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        elitisticListPopulation40.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45);
        math.genetics.Population population48 = elitisticListPopulation40.nextGeneration();
        java.lang.Object obj49 = defaultedMap4.remove((java.lang.Object) population48);
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome51, (int) 'a', (double) 0.0f);
        boolean b56 = defaultedMap4.containsKey((java.lang.Object) elitisticListPopulation55);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome41);
        org.junit.Assert.assertTrue(d42 == 0.0d);
        org.junit.Assert.assertTrue(i43 == 100);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(population48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b56 == false);
    }
}

