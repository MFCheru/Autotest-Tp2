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
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        try {
            elitisticListPopulation2.setElitismRate((double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(i3 == 52);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        try {
            elitisticListPopulation2.setElitismRate((double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
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
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        try {
            math.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5);
        try {
            math.genetics.Chromosome chromosome8 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = population3.spliterator();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) -1, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        try {
            elitisticListPopulation2.setElitismRate((double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertNotNull(population5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation(list_chromosome5, (int) '#', (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation(list_chromosome5, (int) (byte) -1, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = arraylist_chromosome5.spliterator();
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.Chromosome chromosome6 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(d4 == 0.0d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = list_chromosome7.spliterator();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) list_chromosome7, (java.lang.Object) (short) 10);
        java.util.Set set11 = defaultedMap3.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) "[]");
        defaultedMap3.clear();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0d);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 52);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        try {
            math.genetics.Chromosome chromosome6 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(i5 == 52);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation14.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = list_chromosome15.spliterator();
        java.lang.Object obj18 = defaultedMap11.put((java.lang.Object) list_chromosome15, (java.lang.Object) (short) 10);
        java.util.Set set19 = defaultedMap11.keySet();
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap11);
        java.util.Set set21 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation11.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = list_chromosome12.spliterator();
        java.lang.Object obj15 = defaultedMap8.put((java.lang.Object) list_chromosome12, (java.lang.Object) (short) 10);
        java.util.Set set16 = defaultedMap8.keySet();
        java.lang.Object obj18 = defaultedMap8.remove((java.lang.Object) (byte) -1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) "[]");
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation24.getChromosomes();
        java.lang.Object obj26 = defaultedMap8.get((java.lang.Object) elitisticListPopulation24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation31.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome33 = list_chromosome32.spliterator();
        java.lang.Object obj35 = defaultedMap28.put((java.lang.Object) list_chromosome32, (java.lang.Object) (short) 10);
        java.util.Set set36 = defaultedMap28.keySet();
        boolean b38 = defaultedMap28.containsKey((java.lang.Object) 52);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate39, predicate40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome47 = elitisticListPopulation46.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome48 = list_chromosome47.spliterator();
        java.lang.Object obj50 = defaultedMap43.put((java.lang.Object) list_chromosome47, (java.lang.Object) (short) 10);
        java.util.Set set51 = defaultedMap43.keySet();
        boolean b53 = defaultedMap43.containsKey((java.lang.Object) 52);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate39, predicate54);
        java.lang.Object obj58 = defaultedMap1.remove((java.lang.Object) predicate54);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 10 + "'", obj26.equals((short) 10));
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertNotNull(spliterator_chromosome33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(list_chromosome47);
        org.junit.Assert.assertNotNull(spliterator_chromosome48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6);
        int i9 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 52);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) -1, 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome8);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation2.getChromosomes();
        double d11 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertNotNull(list_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(d11 == 0.0d);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 52);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate13);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i18 = elitisticListPopulation17.getPopulationLimit();
        double d19 = elitisticListPopulation17.getElitismRate();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation17);
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate(map20, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i18 == 52);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 52);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate13);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i18 = elitisticListPopulation17.getPopulationLimit();
        double d19 = elitisticListPopulation17.getElitismRate();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation17);
        int i21 = elitisticListPopulation17.getPopulationSize();
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i18 == 52);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation14.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = list_chromosome15.spliterator();
        java.lang.Object obj18 = defaultedMap11.put((java.lang.Object) list_chromosome15, (java.lang.Object) (short) 10);
        java.util.Set set19 = defaultedMap11.keySet();
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap11);
        boolean b21 = defaultedMap11.isEmpty();
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0d);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 52);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setElitismRate(0.0d);
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertTrue(i5 == 52);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = list_chromosome7.spliterator();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) list_chromosome7, (java.lang.Object) (short) 10);
        java.util.Set set11 = defaultedMap3.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set15 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        double d6 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertTrue(d6 == 0.0d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 1.0d);
        java.util.Collection collection10 = defaultedMap7.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection10);
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation14.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = list_chromosome15.spliterator();
        java.lang.Object obj18 = defaultedMap11.put((java.lang.Object) list_chromosome15, (java.lang.Object) (short) 10);
        java.util.Set set19 = defaultedMap11.keySet();
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap11);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        math.genetics.Population population24 = elitisticListPopulation23.nextGeneration();
        math.genetics.Chromosome chromosome25 = null;
        elitisticListPopulation23.addChromosome(chromosome25);
        java.lang.Object obj27 = defaultedMap11.get((java.lang.Object) elitisticListPopulation23);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 10 + "'", obj27.equals((short) 10));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double d6 = elitisticListPopulation2.getElitismRate();
        double d7 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        int i8 = elitisticListPopulation2.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) -1, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.lang.String str9 = defaultedMap1.toString();
        java.util.Collection collection10 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{[]=10}" + "'", str9.equals("{[]=10}"));
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        math.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        double d7 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertTrue(d7 == 0.0d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i7 = elitisticListPopulation6.getPopulationLimit();
        double d8 = elitisticListPopulation6.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation6.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(i7 == 52);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0d);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 52);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation8.getChromosomes();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Population population14 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation20.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome22 = list_chromosome21.spliterator();
        java.lang.Object obj24 = defaultedMap17.put((java.lang.Object) list_chromosome21, (java.lang.Object) (short) 10);
        java.lang.String str25 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation30.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome32 = list_chromosome31.spliterator();
        java.lang.Object obj34 = defaultedMap27.put((java.lang.Object) list_chromosome31, (java.lang.Object) (short) 10);
        java.util.Set set35 = defaultedMap27.keySet();
        boolean b37 = defaultedMap27.containsKey((java.lang.Object) 52);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate38, predicate39);
        java.lang.Object obj42 = defaultedMap27.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation47.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome49 = list_chromosome48.spliterator();
        java.lang.Object obj51 = defaultedMap44.put((java.lang.Object) list_chromosome48, (java.lang.Object) (short) 10);
        java.util.Set set52 = defaultedMap44.keySet();
        boolean b54 = defaultedMap44.containsKey((java.lang.Object) 52);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate55, predicate56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation62 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome63 = elitisticListPopulation62.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome64 = list_chromosome63.spliterator();
        java.lang.Object obj66 = defaultedMap59.put((java.lang.Object) list_chromosome63, (java.lang.Object) (short) 10);
        java.util.Set set67 = defaultedMap59.keySet();
        boolean b69 = defaultedMap59.containsKey((java.lang.Object) 52);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate70, predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate73, predicate74);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate55, predicate73);
        java.lang.Object obj77 = defaultedMap17.get((java.lang.Object) map76);
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (short) 10 + "'", obj15.equals((short) 10));
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(spliterator_chromosome22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{[]=10}" + "'", str25.equals("{[]=10}"));
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertNotNull(spliterator_chromosome32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(list_chromosome48);
        org.junit.Assert.assertNotNull(spliterator_chromosome49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(list_chromosome63);
        org.junit.Assert.assertNotNull(spliterator_chromosome64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + (short) 10 + "'", obj77.equals((short) 10));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0d);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 52);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation8.getChromosomes();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Population population14 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation8.addChromosome(chromosome16);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (short) 10 + "'", obj15.equals((short) 10));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 52);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicate16);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.lang.String str3 = elitisticListPopulation2.toString();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d10 = elitisticListPopulation9.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation9.setChromosomes(list_chromosome14);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0d);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = list_chromosome7.spliterator();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) list_chromosome7, (java.lang.Object) (short) 10);
        java.util.Set set11 = defaultedMap3.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) 1.0d);
        java.util.Collection collection19 = defaultedMap16.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation27.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome29 = list_chromosome28.spliterator();
        java.lang.Object obj31 = defaultedMap24.put((java.lang.Object) list_chromosome28, (java.lang.Object) (short) 10);
        java.util.Set set32 = defaultedMap24.keySet();
        java.lang.Object obj34 = defaultedMap24.remove((java.lang.Object) (byte) -1);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) "[]");
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation40.getChromosomes();
        java.lang.Object obj42 = defaultedMap24.get((java.lang.Object) elitisticListPopulation40);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation47.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome49 = list_chromosome48.spliterator();
        java.lang.Object obj51 = defaultedMap44.put((java.lang.Object) list_chromosome48, (java.lang.Object) (short) 10);
        java.util.Set set52 = defaultedMap44.keySet();
        boolean b54 = defaultedMap44.containsKey((java.lang.Object) 52);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate55, predicate56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation62 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome63 = elitisticListPopulation62.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome64 = list_chromosome63.spliterator();
        java.lang.Object obj66 = defaultedMap59.put((java.lang.Object) list_chromosome63, (java.lang.Object) (short) 10);
        java.util.Set set67 = defaultedMap59.keySet();
        boolean b69 = defaultedMap59.containsKey((java.lang.Object) 52);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate70, predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate55, predicate70);
        math.genetics.ElitisticListPopulation elitisticListPopulation76 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i77 = elitisticListPopulation76.getPopulationLimit();
        double d78 = elitisticListPopulation76.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome79 = elitisticListPopulation76.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome80 = elitisticListPopulation76.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome81 = elitisticListPopulation76.getChromosomes();
        boolean b82 = defaultedMap24.containsValue((java.lang.Object) elitisticListPopulation76);
        boolean b83 = defaultedMap1.equals((java.lang.Object) defaultedMap24);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertNotNull(spliterator_chromosome29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(list_chromosome41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 10 + "'", obj42.equals((short) 10));
        org.junit.Assert.assertNotNull(list_chromosome48);
        org.junit.Assert.assertNotNull(spliterator_chromosome49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(list_chromosome63);
        org.junit.Assert.assertNotNull(spliterator_chromosome64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue(i77 == 52);
        org.junit.Assert.assertTrue(d78 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome79);
        org.junit.Assert.assertNotNull(iterator_chromosome80);
        org.junit.Assert.assertNotNull(list_chromosome81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b83 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 52);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate13);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation21.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome23 = list_chromosome22.spliterator();
        java.lang.Object obj25 = defaultedMap18.put((java.lang.Object) list_chromosome22, (java.lang.Object) (short) 10);
        java.util.Set set26 = defaultedMap18.keySet();
        boolean b28 = defaultedMap18.containsKey((java.lang.Object) 52);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate29, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome37 = elitisticListPopulation36.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome38 = list_chromosome37.spliterator();
        java.lang.Object obj40 = defaultedMap33.put((java.lang.Object) list_chromosome37, (java.lang.Object) (short) 10);
        java.util.Set set41 = defaultedMap33.keySet();
        boolean b43 = defaultedMap33.containsKey((java.lang.Object) 52);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate44, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate29, predicate47);
        collections.Transformer transformer51 = null;
        try {
            java.util.Map map52 = collections.map.DefaultedMap.decorate(map50, transformer51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(list_chromosome22);
        org.junit.Assert.assertNotNull(spliterator_chromosome23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(list_chromosome37);
        org.junit.Assert.assertNotNull(spliterator_chromosome38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        int i4 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        try {
            elitisticListPopulation2.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertTrue(i5 == 52);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome8);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertNotNull(list_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome7);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) (byte) 100, (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = list_chromosome7.spliterator();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) list_chromosome7, (java.lang.Object) (short) 10);
        java.util.Set set11 = defaultedMap3.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) 1.0d);
        java.util.Collection collection19 = defaultedMap16.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        boolean b21 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 52);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i15 = elitisticListPopulation14.getPopulationLimit();
        double d16 = elitisticListPopulation14.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation14.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation14.iterator();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) elitisticListPopulation14);
        double d20 = elitisticListPopulation14.getElitismRate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation25.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = list_chromosome26.spliterator();
        java.lang.Object obj29 = defaultedMap22.put((java.lang.Object) list_chromosome26, (java.lang.Object) (short) 10);
        elitisticListPopulation14.setChromosomes(list_chromosome26);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(d16 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome26);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        double d5 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertTrue(d5 == 0.0d);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d7 = elitisticListPopulation6.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation6.iterator();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation6);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i13 = elitisticListPopulation12.getPopulationLimit();
        double d14 = elitisticListPopulation12.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation12.getChromosomes();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) list_chromosome15);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 10 + "'", obj9.equals((short) 10));
        org.junit.Assert.assertTrue(i13 == 52);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation14.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = list_chromosome15.spliterator();
        java.lang.Object obj18 = defaultedMap11.put((java.lang.Object) list_chromosome15, (java.lang.Object) (short) 10);
        java.util.Set set19 = defaultedMap11.keySet();
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap11);
        boolean b21 = defaultedMap11.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d25 = elitisticListPopulation24.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome26 = elitisticListPopulation24.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation24.getChromosomes();
        java.lang.Object obj28 = defaultedMap11.get((java.lang.Object) list_chromosome27);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d25 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome26);
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 10 + "'", obj28.equals((short) 10));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 52);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate13);
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = list_chromosome7.spliterator();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) list_chromosome7, (java.lang.Object) (short) 10);
        java.util.Set set11 = defaultedMap3.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) "[]");
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation19.getChromosomes();
        java.lang.Object obj21 = defaultedMap3.get((java.lang.Object) elitisticListPopulation19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.lang.String str25 = elitisticListPopulation24.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome26 = elitisticListPopulation24.spliterator();
        boolean b27 = defaultedMap3.containsKey((java.lang.Object) elitisticListPopulation24);
        elitisticListPopulation24.setElitismRate(1.0d);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome26);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = list_chromosome7.spliterator();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) list_chromosome7, (java.lang.Object) (short) 10);
        java.util.Set set11 = defaultedMap3.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) "[]");
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation19.getChromosomes();
        java.lang.Object obj21 = defaultedMap3.get((java.lang.Object) elitisticListPopulation19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation26.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome28 = list_chromosome27.spliterator();
        java.lang.Object obj30 = defaultedMap23.put((java.lang.Object) list_chromosome27, (java.lang.Object) (short) 10);
        java.util.Set set31 = defaultedMap23.keySet();
        boolean b33 = defaultedMap23.containsKey((java.lang.Object) 52);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation41.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome43 = list_chromosome42.spliterator();
        java.lang.Object obj45 = defaultedMap38.put((java.lang.Object) list_chromosome42, (java.lang.Object) (short) 10);
        java.util.Set set46 = defaultedMap38.keySet();
        boolean b48 = defaultedMap38.containsKey((java.lang.Object) 52);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate34, predicate49);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i56 = elitisticListPopulation55.getPopulationLimit();
        double d57 = elitisticListPopulation55.getElitismRate();
        int i58 = elitisticListPopulation55.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation61 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome62 = elitisticListPopulation61.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome63 = list_chromosome62.spliterator();
        elitisticListPopulation55.setChromosomes(list_chromosome62);
        java.lang.String str65 = elitisticListPopulation55.toString();
        java.lang.Object obj66 = defaultedMap3.get((java.lang.Object) str65);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertNotNull(spliterator_chromosome28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertNotNull(spliterator_chromosome43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(i56 == 52);
        org.junit.Assert.assertTrue(d57 == 0.0d);
        org.junit.Assert.assertTrue(i58 == 52);
        org.junit.Assert.assertNotNull(list_chromosome62);
        org.junit.Assert.assertNotNull(spliterator_chromosome63);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "[]" + "'", str65.equals("[]"));
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + (short) 10 + "'", obj66.equals((short) 10));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation13.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome15 = list_chromosome14.spliterator();
        java.lang.Object obj17 = defaultedMap10.put((java.lang.Object) list_chromosome14, (java.lang.Object) (short) 10);
        java.util.Set set18 = defaultedMap10.keySet();
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) set18);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(spliterator_chromosome15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double d6 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 52);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i15 = elitisticListPopulation14.getPopulationLimit();
        double d16 = elitisticListPopulation14.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation14.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation14.iterator();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) elitisticListPopulation14);
        java.util.Collection collection20 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(d16 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 52);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i15 = elitisticListPopulation14.getPopulationLimit();
        double d16 = elitisticListPopulation14.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation14.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation14.iterator();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) elitisticListPopulation14);
        double d20 = elitisticListPopulation14.getElitismRate();
        try {
            elitisticListPopulation14.setElitismRate((double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(d16 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertTrue(d20 == 0.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        int i4 = elitisticListPopulation2.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = list_chromosome7.spliterator();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) list_chromosome7, (java.lang.Object) (short) 10);
        java.util.Set set11 = defaultedMap3.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) "[]");
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation19.getChromosomes();
        java.lang.Object obj21 = defaultedMap3.get((java.lang.Object) elitisticListPopulation19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.lang.String str25 = elitisticListPopulation24.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome26 = elitisticListPopulation24.spliterator();
        boolean b27 = defaultedMap3.containsKey((java.lang.Object) elitisticListPopulation24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation32.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome34 = list_chromosome33.spliterator();
        java.lang.Object obj36 = defaultedMap29.put((java.lang.Object) list_chromosome33, (java.lang.Object) (short) 10);
        java.util.Set set37 = defaultedMap29.keySet();
        java.lang.Object obj39 = defaultedMap29.remove((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap29);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d44 = elitisticListPopulation43.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation47.getChromosomes();
        elitisticListPopulation43.setChromosomes(list_chromosome48);
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        elitisticListPopulation43.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome51);
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation43.getChromosomes();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) elitisticListPopulation43);
        try {
            math.genetics.Chromosome chromosome56 = elitisticListPopulation43.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertNotNull(spliterator_chromosome34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(d44 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome48);
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(list_chromosome54);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d12 = elitisticListPopulation11.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome16);
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation11.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19);
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation11.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome22);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(list_chromosome22);
        org.junit.Assert.assertNotNull(iterator_chromosome24);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation18.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = list_chromosome19.spliterator();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) list_chromosome19, (java.lang.Object) (short) 10);
        java.util.Set set23 = defaultedMap15.keySet();
        java.lang.Object obj25 = defaultedMap15.remove((java.lang.Object) (byte) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) "[]");
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation31.getChromosomes();
        java.lang.Object obj33 = defaultedMap15.get((java.lang.Object) elitisticListPopulation31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation38.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome40 = list_chromosome39.spliterator();
        java.lang.Object obj42 = defaultedMap35.put((java.lang.Object) list_chromosome39, (java.lang.Object) (short) 10);
        java.util.Set set43 = defaultedMap35.keySet();
        boolean b45 = defaultedMap35.containsKey((java.lang.Object) 52);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation53.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome55 = list_chromosome54.spliterator();
        java.lang.Object obj57 = defaultedMap50.put((java.lang.Object) list_chromosome54, (java.lang.Object) (short) 10);
        java.util.Set set58 = defaultedMap50.keySet();
        boolean b60 = defaultedMap50.containsKey((java.lang.Object) 52);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate61, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate46, predicate61);
        math.genetics.ElitisticListPopulation elitisticListPopulation67 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i68 = elitisticListPopulation67.getPopulationLimit();
        double d69 = elitisticListPopulation67.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome70 = elitisticListPopulation67.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome71 = elitisticListPopulation67.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome72 = elitisticListPopulation67.getChromosomes();
        boolean b73 = defaultedMap15.containsValue((java.lang.Object) elitisticListPopulation67);
        java.lang.Object obj74 = defaultedMap1.get((java.lang.Object) elitisticListPopulation67);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation81 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome82 = elitisticListPopulation81.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome83 = list_chromosome82.spliterator();
        java.lang.Object obj85 = defaultedMap78.put((java.lang.Object) list_chromosome82, (java.lang.Object) (short) 10);
        java.util.Set set86 = defaultedMap78.keySet();
        java.lang.Object obj88 = defaultedMap78.remove((java.lang.Object) (byte) -1);
        defaultedMap76.putAll((java.util.Map) defaultedMap78);
        java.util.Map map91 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap78, (java.lang.Object) "[]");
        math.genetics.ElitisticListPopulation elitisticListPopulation94 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome95 = elitisticListPopulation94.getChromosomes();
        java.lang.Object obj96 = defaultedMap78.get((java.lang.Object) elitisticListPopulation94);
        java.lang.Object obj97 = defaultedMap1.get((java.lang.Object) defaultedMap78);
        java.lang.String str98 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) 10 + "'", obj33.equals((short) 10));
        org.junit.Assert.assertNotNull(list_chromosome39);
        org.junit.Assert.assertNotNull(spliterator_chromosome40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(list_chromosome54);
        org.junit.Assert.assertNotNull(spliterator_chromosome55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(i68 == 52);
        org.junit.Assert.assertTrue(d69 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome70);
        org.junit.Assert.assertNotNull(iterator_chromosome71);
        org.junit.Assert.assertNotNull(list_chromosome72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (short) 10 + "'", obj74.equals((short) 10));
        org.junit.Assert.assertNotNull(list_chromosome82);
        org.junit.Assert.assertNotNull(spliterator_chromosome83);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(list_chromosome95);
        org.junit.Assert.assertTrue("'" + obj96 + "' != '" + (short) 10 + "'", obj96.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj97 + "' != '" + (short) 10 + "'", obj97.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str98 + "' != '" + "{[]=10}" + "'", str98.equals("{[]=10}"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = list_chromosome7.spliterator();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) list_chromosome7, (java.lang.Object) (short) 10);
        java.util.Set set11 = defaultedMap3.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) "[]");
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation19.getChromosomes();
        java.lang.Object obj21 = defaultedMap3.get((java.lang.Object) elitisticListPopulation19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation26.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome28 = list_chromosome27.spliterator();
        java.lang.Object obj30 = defaultedMap23.put((java.lang.Object) list_chromosome27, (java.lang.Object) (short) 10);
        java.util.Set set31 = defaultedMap23.keySet();
        boolean b33 = defaultedMap23.containsKey((java.lang.Object) 52);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation41.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome43 = list_chromosome42.spliterator();
        java.lang.Object obj45 = defaultedMap38.put((java.lang.Object) list_chromosome42, (java.lang.Object) (short) 10);
        java.util.Set set46 = defaultedMap38.keySet();
        boolean b48 = defaultedMap38.containsKey((java.lang.Object) 52);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate34, predicate49);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i56 = elitisticListPopulation55.getPopulationLimit();
        double d57 = elitisticListPopulation55.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome58 = elitisticListPopulation55.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome59 = elitisticListPopulation55.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome60 = elitisticListPopulation55.getChromosomes();
        boolean b61 = defaultedMap3.containsValue((java.lang.Object) elitisticListPopulation55);
        collections.Transformer transformer62 = null;
        try {
            java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertNotNull(spliterator_chromosome28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertNotNull(spliterator_chromosome43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(i56 == 52);
        org.junit.Assert.assertTrue(d57 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome58);
        org.junit.Assert.assertNotNull(iterator_chromosome59);
        org.junit.Assert.assertNotNull(list_chromosome60);
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation18.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = list_chromosome19.spliterator();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) list_chromosome19, (java.lang.Object) (short) 10);
        java.util.Set set23 = defaultedMap15.keySet();
        java.lang.Object obj25 = defaultedMap15.remove((java.lang.Object) (byte) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) "[]");
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation31.getChromosomes();
        java.lang.Object obj33 = defaultedMap15.get((java.lang.Object) elitisticListPopulation31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation38.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome40 = list_chromosome39.spliterator();
        java.lang.Object obj42 = defaultedMap35.put((java.lang.Object) list_chromosome39, (java.lang.Object) (short) 10);
        java.util.Set set43 = defaultedMap35.keySet();
        boolean b45 = defaultedMap35.containsKey((java.lang.Object) 52);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation53.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome55 = list_chromosome54.spliterator();
        java.lang.Object obj57 = defaultedMap50.put((java.lang.Object) list_chromosome54, (java.lang.Object) (short) 10);
        java.util.Set set58 = defaultedMap50.keySet();
        boolean b60 = defaultedMap50.containsKey((java.lang.Object) 52);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate61, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate46, predicate61);
        math.genetics.ElitisticListPopulation elitisticListPopulation67 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i68 = elitisticListPopulation67.getPopulationLimit();
        double d69 = elitisticListPopulation67.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome70 = elitisticListPopulation67.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome71 = elitisticListPopulation67.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome72 = elitisticListPopulation67.getChromosomes();
        boolean b73 = defaultedMap15.containsValue((java.lang.Object) elitisticListPopulation67);
        java.lang.Object obj74 = defaultedMap1.get((java.lang.Object) elitisticListPopulation67);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome75 = elitisticListPopulation67.iterator();
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) 10 + "'", obj33.equals((short) 10));
        org.junit.Assert.assertNotNull(list_chromosome39);
        org.junit.Assert.assertNotNull(spliterator_chromosome40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(list_chromosome54);
        org.junit.Assert.assertNotNull(spliterator_chromosome55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(i68 == 52);
        org.junit.Assert.assertTrue(d69 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome70);
        org.junit.Assert.assertNotNull(iterator_chromosome71);
        org.junit.Assert.assertNotNull(list_chromosome72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (short) 10 + "'", obj74.equals((short) 10));
        org.junit.Assert.assertNotNull(iterator_chromosome75);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 52);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate13);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i18 = elitisticListPopulation17.getPopulationLimit();
        double d19 = elitisticListPopulation17.getElitismRate();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation17);
        double d21 = elitisticListPopulation17.getElitismRate();
        try {
            math.genetics.Chromosome chromosome22 = elitisticListPopulation17.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i18 == 52);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(d21 == 0.0d);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation18.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = list_chromosome19.spliterator();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) list_chromosome19, (java.lang.Object) (short) 10);
        java.util.Set set23 = defaultedMap15.keySet();
        java.lang.Object obj25 = defaultedMap15.remove((java.lang.Object) (byte) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) "[]");
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation31.getChromosomes();
        java.lang.Object obj33 = defaultedMap15.get((java.lang.Object) elitisticListPopulation31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation38.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome40 = list_chromosome39.spliterator();
        java.lang.Object obj42 = defaultedMap35.put((java.lang.Object) list_chromosome39, (java.lang.Object) (short) 10);
        java.util.Set set43 = defaultedMap35.keySet();
        boolean b45 = defaultedMap35.containsKey((java.lang.Object) 52);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation53.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome55 = list_chromosome54.spliterator();
        java.lang.Object obj57 = defaultedMap50.put((java.lang.Object) list_chromosome54, (java.lang.Object) (short) 10);
        java.util.Set set58 = defaultedMap50.keySet();
        boolean b60 = defaultedMap50.containsKey((java.lang.Object) 52);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate61, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate46, predicate61);
        math.genetics.ElitisticListPopulation elitisticListPopulation67 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i68 = elitisticListPopulation67.getPopulationLimit();
        double d69 = elitisticListPopulation67.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome70 = elitisticListPopulation67.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome71 = elitisticListPopulation67.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome72 = elitisticListPopulation67.getChromosomes();
        boolean b73 = defaultedMap15.containsValue((java.lang.Object) elitisticListPopulation67);
        java.lang.Object obj74 = defaultedMap1.get((java.lang.Object) elitisticListPopulation67);
        try {
            math.genetics.Chromosome chromosome75 = elitisticListPopulation67.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) 10 + "'", obj33.equals((short) 10));
        org.junit.Assert.assertNotNull(list_chromosome39);
        org.junit.Assert.assertNotNull(spliterator_chromosome40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(list_chromosome54);
        org.junit.Assert.assertNotNull(spliterator_chromosome55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(i68 == 52);
        org.junit.Assert.assertTrue(d69 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome70);
        org.junit.Assert.assertNotNull(iterator_chromosome71);
        org.junit.Assert.assertNotNull(list_chromosome72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (short) 10 + "'", obj74.equals((short) 10));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d7 = elitisticListPopulation6.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation6.setChromosomes(list_chromosome11);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation6.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome18 = arraylist_chromosome14.spliterator();
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome18);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 52);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate16);
        boolean b18 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        int i5 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation14.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = list_chromosome15.spliterator();
        java.lang.Object obj18 = defaultedMap11.put((java.lang.Object) list_chromosome15, (java.lang.Object) (short) 10);
        java.util.Set set19 = defaultedMap11.keySet();
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap11);
        boolean b21 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation26.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome28 = list_chromosome27.spliterator();
        java.lang.Object obj30 = defaultedMap23.put((java.lang.Object) list_chromosome27, (java.lang.Object) (short) 10);
        java.util.Set set31 = defaultedMap23.keySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome37 = elitisticListPopulation36.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome38 = list_chromosome37.spliterator();
        java.lang.Object obj40 = defaultedMap33.put((java.lang.Object) list_chromosome37, (java.lang.Object) (short) 10);
        java.util.Set set41 = defaultedMap33.keySet();
        boolean b42 = defaultedMap23.equals((java.lang.Object) defaultedMap33);
        boolean b43 = defaultedMap33.isEmpty();
        java.lang.Object obj44 = defaultedMap11.get((java.lang.Object) defaultedMap33);
        java.util.Set set45 = defaultedMap11.entrySet();
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertNotNull(spliterator_chromosome28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(list_chromosome37);
        org.junit.Assert.assertNotNull(spliterator_chromosome38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 10 + "'", obj44.equals((short) 10));
        org.junit.Assert.assertNotNull(set45);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        int i6 = elitisticListPopulation2.getPopulationSize();
        try {
            math.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertTrue(i5 == 52);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.lang.String str3 = elitisticListPopulation2.toString();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        try {
            elitisticListPopulation2.setElitismRate((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[null]" + "'", str7.equals("[null]"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = list_chromosome7.spliterator();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) list_chromosome7, (java.lang.Object) (short) 10);
        java.util.Set set11 = defaultedMap3.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) "[]");
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation19.getChromosomes();
        java.lang.Object obj21 = defaultedMap3.get((java.lang.Object) elitisticListPopulation19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation26.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome28 = list_chromosome27.spliterator();
        java.lang.Object obj30 = defaultedMap23.put((java.lang.Object) list_chromosome27, (java.lang.Object) (short) 10);
        java.util.Set set31 = defaultedMap23.keySet();
        boolean b33 = defaultedMap23.containsKey((java.lang.Object) 52);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation41.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome43 = list_chromosome42.spliterator();
        java.lang.Object obj45 = defaultedMap38.put((java.lang.Object) list_chromosome42, (java.lang.Object) (short) 10);
        java.util.Set set46 = defaultedMap38.keySet();
        boolean b48 = defaultedMap38.containsKey((java.lang.Object) 52);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate34, predicate49);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i56 = elitisticListPopulation55.getPopulationLimit();
        double d57 = elitisticListPopulation55.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome58 = elitisticListPopulation55.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome59 = elitisticListPopulation55.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome60 = elitisticListPopulation55.getChromosomes();
        boolean b61 = defaultedMap3.containsValue((java.lang.Object) elitisticListPopulation55);
        java.util.Collection collection62 = defaultedMap3.values();
        java.lang.String str63 = defaultedMap3.toString();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertNotNull(spliterator_chromosome28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertNotNull(spliterator_chromosome43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(i56 == 52);
        org.junit.Assert.assertTrue(d57 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome58);
        org.junit.Assert.assertNotNull(iterator_chromosome59);
        org.junit.Assert.assertNotNull(list_chromosome60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{[]=10}" + "'", str63.equals("{[]=10}"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 52);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate13);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i18 = elitisticListPopulation17.getPopulationLimit();
        double d19 = elitisticListPopulation17.getElitismRate();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation17);
        boolean b21 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i25 = elitisticListPopulation24.getPopulationLimit();
        double d26 = elitisticListPopulation24.getElitismRate();
        math.genetics.Population population27 = elitisticListPopulation24.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d31 = elitisticListPopulation30.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome32 = elitisticListPopulation30.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation35.getChromosomes();
        elitisticListPopulation30.setChromosomes(list_chromosome36);
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation30.getChromosomes();
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome38);
        boolean b40 = defaultedMap1.containsKey((java.lang.Object) list_chromosome38);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i18 == 52);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i25 == 52);
        org.junit.Assert.assertTrue(d26 == 0.0d);
        org.junit.Assert.assertNotNull(population27);
        org.junit.Assert.assertTrue(d31 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome32);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i7 = elitisticListPopulation6.getPopulationLimit();
        double d8 = elitisticListPopulation6.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation6.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome9);
        elitisticListPopulation2.setPopulationLimit((int) '#');
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(i7 == 52);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = list_chromosome7.spliterator();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) list_chromosome7, (java.lang.Object) (short) 10);
        java.util.Set set11 = defaultedMap3.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) "[]");
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation19.getChromosomes();
        java.lang.Object obj21 = defaultedMap3.get((java.lang.Object) elitisticListPopulation19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.lang.String str25 = elitisticListPopulation24.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome26 = elitisticListPopulation24.spliterator();
        boolean b27 = defaultedMap3.containsKey((java.lang.Object) elitisticListPopulation24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation32.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome34 = list_chromosome33.spliterator();
        java.lang.Object obj36 = defaultedMap29.put((java.lang.Object) list_chromosome33, (java.lang.Object) (short) 10);
        java.util.Set set37 = defaultedMap29.keySet();
        java.lang.Object obj39 = defaultedMap29.remove((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap29);
        java.util.Set set41 = defaultedMap3.entrySet();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertNotNull(spliterator_chromosome34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set41);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.lang.String str6 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome7);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) 52);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = list_chromosome7.spliterator();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) list_chromosome7, (java.lang.Object) (short) 10);
        java.util.Set set11 = defaultedMap3.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) "[]");
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation19.getChromosomes();
        java.lang.Object obj21 = defaultedMap3.get((java.lang.Object) elitisticListPopulation19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.lang.String str25 = elitisticListPopulation24.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome26 = elitisticListPopulation24.spliterator();
        boolean b27 = defaultedMap3.containsKey((java.lang.Object) elitisticListPopulation24);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome26);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = list_chromosome7.spliterator();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) list_chromosome7, (java.lang.Object) (short) 10);
        java.util.Set set11 = defaultedMap3.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) "[]");
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation19.getChromosomes();
        java.lang.Object obj21 = defaultedMap3.get((java.lang.Object) elitisticListPopulation19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.lang.String str25 = elitisticListPopulation24.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome26 = elitisticListPopulation24.spliterator();
        boolean b27 = defaultedMap3.containsKey((java.lang.Object) elitisticListPopulation24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation32.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome34 = list_chromosome33.spliterator();
        java.lang.Object obj36 = defaultedMap29.put((java.lang.Object) list_chromosome33, (java.lang.Object) (short) 10);
        java.util.Set set37 = defaultedMap29.keySet();
        java.lang.Object obj39 = defaultedMap29.remove((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap29);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d44 = elitisticListPopulation43.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation47.getChromosomes();
        elitisticListPopulation43.setChromosomes(list_chromosome48);
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        elitisticListPopulation43.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome51);
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation43.getChromosomes();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) elitisticListPopulation43);
        java.util.Collection collection56 = defaultedMap29.values();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertNotNull(spliterator_chromosome34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(d44 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome48);
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(list_chromosome54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(collection56);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 52);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate13);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i18 = elitisticListPopulation17.getPopulationLimit();
        double d19 = elitisticListPopulation17.getElitismRate();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation25.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = list_chromosome26.spliterator();
        java.lang.Object obj29 = defaultedMap22.put((java.lang.Object) list_chromosome26, (java.lang.Object) (short) 10);
        java.util.Set set30 = defaultedMap22.keySet();
        boolean b32 = defaultedMap22.containsKey((java.lang.Object) 52);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate33, predicate34);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i39 = elitisticListPopulation38.getPopulationLimit();
        double d40 = elitisticListPopulation38.getElitismRate();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) elitisticListPopulation38);
        boolean b42 = defaultedMap22.isEmpty();
        java.lang.Object obj43 = defaultedMap1.remove((java.lang.Object) defaultedMap22);
        int i44 = defaultedMap22.size();
        int i45 = defaultedMap22.size();
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i18 == 52);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(list_chromosome26);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(i39 == 52);
        org.junit.Assert.assertTrue(d40 == 0.0d);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(i44 == 1);
        org.junit.Assert.assertTrue(i45 == 1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = list_chromosome7.spliterator();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) list_chromosome7, (java.lang.Object) (short) 10);
        java.util.Set set11 = defaultedMap3.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) "[]");
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation19.getChromosomes();
        java.lang.Object obj21 = defaultedMap3.get((java.lang.Object) elitisticListPopulation19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.lang.String str25 = elitisticListPopulation24.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome26 = elitisticListPopulation24.spliterator();
        boolean b27 = defaultedMap3.containsKey((java.lang.Object) elitisticListPopulation24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation32.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome34 = list_chromosome33.spliterator();
        java.lang.Object obj36 = defaultedMap29.put((java.lang.Object) list_chromosome33, (java.lang.Object) (short) 10);
        java.util.Set set37 = defaultedMap29.keySet();
        boolean b39 = defaultedMap29.containsKey((java.lang.Object) 52);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate40, predicate41);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i46 = elitisticListPopulation45.getPopulationLimit();
        double d47 = elitisticListPopulation45.getElitismRate();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) elitisticListPopulation45);
        boolean b49 = defaultedMap3.equals((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b53 = defaultedMap51.containsValue((java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation56 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d57 = elitisticListPopulation56.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome58 = elitisticListPopulation56.iterator();
        java.lang.Object obj59 = defaultedMap51.get((java.lang.Object) elitisticListPopulation56);
        boolean b60 = defaultedMap3.equals((java.lang.Object) elitisticListPopulation56);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertNotNull(spliterator_chromosome34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(i46 == 52);
        org.junit.Assert.assertTrue(d47 == 0.0d);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(d57 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (short) 10 + "'", obj59.equals((short) 10));
        org.junit.Assert.assertTrue(b60 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation14.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = list_chromosome15.spliterator();
        java.lang.Object obj18 = defaultedMap11.put((java.lang.Object) list_chromosome15, (java.lang.Object) (short) 10);
        java.util.Set set19 = defaultedMap11.keySet();
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap11);
        boolean b21 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation26.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome28 = list_chromosome27.spliterator();
        java.lang.Object obj30 = defaultedMap23.put((java.lang.Object) list_chromosome27, (java.lang.Object) (short) 10);
        java.util.Set set31 = defaultedMap23.keySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome37 = elitisticListPopulation36.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome38 = list_chromosome37.spliterator();
        java.lang.Object obj40 = defaultedMap33.put((java.lang.Object) list_chromosome37, (java.lang.Object) (short) 10);
        java.util.Set set41 = defaultedMap33.keySet();
        boolean b42 = defaultedMap23.equals((java.lang.Object) defaultedMap33);
        boolean b43 = defaultedMap33.isEmpty();
        java.lang.Object obj44 = defaultedMap11.get((java.lang.Object) defaultedMap33);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i48 = elitisticListPopulation47.getPopulationLimit();
        double d49 = elitisticListPopulation47.getElitismRate();
        math.genetics.Population population50 = elitisticListPopulation47.nextGeneration();
        double d51 = elitisticListPopulation47.getElitismRate();
        double d52 = elitisticListPopulation47.getElitismRate();
        boolean b53 = defaultedMap33.containsKey((java.lang.Object) d52);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertNotNull(spliterator_chromosome28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(list_chromosome37);
        org.junit.Assert.assertNotNull(spliterator_chromosome38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 10 + "'", obj44.equals((short) 10));
        org.junit.Assert.assertTrue(i48 == 52);
        org.junit.Assert.assertTrue(d49 == 0.0d);
        org.junit.Assert.assertNotNull(population50);
        org.junit.Assert.assertTrue(d51 == 0.0d);
        org.junit.Assert.assertTrue(d52 == 0.0d);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0d);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 52);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation8.setChromosomes(list_chromosome13);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation8);
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation8.getChromosomes();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(list_chromosome16);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 52);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate13);
        java.util.Set set15 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = list_chromosome7.spliterator();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) list_chromosome7, (java.lang.Object) (short) 10);
        java.util.Set set11 = defaultedMap3.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) "[]");
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation19.getChromosomes();
        java.lang.Object obj21 = defaultedMap3.get((java.lang.Object) elitisticListPopulation19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.lang.String str25 = elitisticListPopulation24.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome26 = elitisticListPopulation24.spliterator();
        boolean b27 = defaultedMap3.containsKey((java.lang.Object) elitisticListPopulation24);
        math.genetics.Population population28 = elitisticListPopulation24.nextGeneration();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(population28);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.lang.String str9 = defaultedMap1.toString();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{[]=10}" + "'", str9.equals("{[]=10}"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = list_chromosome7.spliterator();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) list_chromosome7, (java.lang.Object) (short) 10);
        java.util.Set set11 = defaultedMap3.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) "[]");
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation19.getChromosomes();
        java.lang.Object obj21 = defaultedMap3.get((java.lang.Object) elitisticListPopulation19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.lang.String str25 = elitisticListPopulation24.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome26 = elitisticListPopulation24.spliterator();
        boolean b27 = defaultedMap3.containsKey((java.lang.Object) elitisticListPopulation24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation32.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome34 = list_chromosome33.spliterator();
        java.lang.Object obj36 = defaultedMap29.put((java.lang.Object) list_chromosome33, (java.lang.Object) (short) 10);
        java.util.Set set37 = defaultedMap29.keySet();
        java.lang.Object obj39 = defaultedMap29.remove((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap29);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d44 = elitisticListPopulation43.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation47.getChromosomes();
        elitisticListPopulation43.setChromosomes(list_chromosome48);
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        elitisticListPopulation43.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome51);
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation43.getChromosomes();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) elitisticListPopulation43);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i59 = elitisticListPopulation58.getPopulationLimit();
        double d60 = elitisticListPopulation58.getElitismRate();
        math.genetics.Population population61 = elitisticListPopulation58.nextGeneration();
        double d62 = elitisticListPopulation58.getElitismRate();
        double d63 = elitisticListPopulation58.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome64 = elitisticListPopulation58.iterator();
        boolean b65 = defaultedMap29.containsKey((java.lang.Object) iterator_chromosome64);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertNotNull(spliterator_chromosome34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(d44 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome48);
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(list_chromosome54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(i59 == 52);
        org.junit.Assert.assertTrue(d60 == 0.0d);
        org.junit.Assert.assertNotNull(population61);
        org.junit.Assert.assertTrue(d62 == 0.0d);
        org.junit.Assert.assertTrue(d63 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome64);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double d6 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(population7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation8.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = list_chromosome9.spliterator();
        elitisticListPopulation2.setChromosomes(list_chromosome9);
        math.genetics.Population population12 = elitisticListPopulation2.nextGeneration();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation18.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = list_chromosome19.spliterator();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) list_chromosome19, (java.lang.Object) (short) 10);
        java.util.Set set23 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation28.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome30 = list_chromosome29.spliterator();
        java.lang.Object obj32 = defaultedMap25.put((java.lang.Object) list_chromosome29, (java.lang.Object) (short) 10);
        java.util.Set set33 = defaultedMap25.keySet();
        boolean b34 = defaultedMap15.equals((java.lang.Object) defaultedMap25);
        boolean b35 = defaultedMap25.isEmpty();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation40.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome42 = list_chromosome41.spliterator();
        java.lang.Object obj44 = defaultedMap37.put((java.lang.Object) list_chromosome41, (java.lang.Object) (short) 10);
        java.util.Set set45 = defaultedMap37.keySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome51 = elitisticListPopulation50.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome52 = list_chromosome51.spliterator();
        java.lang.Object obj54 = defaultedMap47.put((java.lang.Object) list_chromosome51, (java.lang.Object) (short) 10);
        java.util.Set set55 = defaultedMap47.keySet();
        boolean b56 = defaultedMap37.equals((java.lang.Object) defaultedMap47);
        boolean b57 = defaultedMap47.isEmpty();
        java.lang.Object obj58 = defaultedMap25.get((java.lang.Object) defaultedMap47);
        defaultedMap47.clear();
        java.lang.String str60 = defaultedMap47.toString();
        java.lang.Object obj61 = defaultedMap13.remove((java.lang.Object) defaultedMap47);
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertTrue(i5 == 52);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(list_chromosome29);
        org.junit.Assert.assertNotNull(spliterator_chromosome30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(list_chromosome41);
        org.junit.Assert.assertNotNull(spliterator_chromosome42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(list_chromosome51);
        org.junit.Assert.assertNotNull(spliterator_chromosome52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (short) 10 + "'", obj58.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome7);
        java.lang.String str9 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit(1);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation14.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = list_chromosome15.spliterator();
        java.lang.Object obj18 = defaultedMap11.put((java.lang.Object) list_chromosome15, (java.lang.Object) (short) 10);
        java.util.Set set19 = defaultedMap11.keySet();
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap11);
        boolean b21 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation26.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome28 = list_chromosome27.spliterator();
        java.lang.Object obj30 = defaultedMap23.put((java.lang.Object) list_chromosome27, (java.lang.Object) (short) 10);
        java.util.Set set31 = defaultedMap23.keySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome37 = elitisticListPopulation36.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome38 = list_chromosome37.spliterator();
        java.lang.Object obj40 = defaultedMap33.put((java.lang.Object) list_chromosome37, (java.lang.Object) (short) 10);
        java.util.Set set41 = defaultedMap33.keySet();
        boolean b42 = defaultedMap23.equals((java.lang.Object) defaultedMap33);
        boolean b43 = defaultedMap33.isEmpty();
        java.lang.Object obj44 = defaultedMap11.get((java.lang.Object) defaultedMap33);
        defaultedMap33.clear();
        java.util.Set set46 = defaultedMap33.keySet();
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertNotNull(spliterator_chromosome28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(list_chromosome37);
        org.junit.Assert.assertNotNull(spliterator_chromosome38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 10 + "'", obj44.equals((short) 10));
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        try {
            elitisticListPopulation2.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double d6 = elitisticListPopulation2.getElitismRate();
        double d7 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d7 = elitisticListPopulation6.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation6.iterator();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation14.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = list_chromosome15.spliterator();
        java.lang.Object obj18 = defaultedMap11.put((java.lang.Object) list_chromosome15, (java.lang.Object) (short) 10);
        java.util.Set set19 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation24.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome26 = list_chromosome25.spliterator();
        java.lang.Object obj28 = defaultedMap21.put((java.lang.Object) list_chromosome25, (java.lang.Object) (short) 10);
        java.util.Set set29 = defaultedMap21.keySet();
        boolean b30 = defaultedMap11.equals((java.lang.Object) defaultedMap21);
        boolean b31 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome37 = elitisticListPopulation36.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome38 = list_chromosome37.spliterator();
        java.lang.Object obj40 = defaultedMap33.put((java.lang.Object) list_chromosome37, (java.lang.Object) (short) 10);
        java.util.Set set41 = defaultedMap33.keySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome47 = elitisticListPopulation46.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome48 = list_chromosome47.spliterator();
        java.lang.Object obj50 = defaultedMap43.put((java.lang.Object) list_chromosome47, (java.lang.Object) (short) 10);
        java.util.Set set51 = defaultedMap43.keySet();
        boolean b52 = defaultedMap33.equals((java.lang.Object) defaultedMap43);
        boolean b53 = defaultedMap43.isEmpty();
        java.lang.Object obj54 = defaultedMap21.get((java.lang.Object) defaultedMap43);
        defaultedMap43.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap43);
        boolean b57 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 10 + "'", obj9.equals((short) 10));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertNotNull(spliterator_chromosome26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(list_chromosome37);
        org.junit.Assert.assertNotNull(spliterator_chromosome38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(list_chromosome47);
        org.junit.Assert.assertNotNull(spliterator_chromosome48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + (short) 10 + "'", obj54.equals((short) 10));
        org.junit.Assert.assertTrue(b57 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d7 = elitisticListPopulation6.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation6.iterator();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) elitisticListPopulation6);
        double d10 = elitisticListPopulation6.getElitismRate();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 10 + "'", obj9.equals((short) 10));
        org.junit.Assert.assertTrue(d10 == 0.0d);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = list_chromosome7.spliterator();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) list_chromosome7, (java.lang.Object) (short) 10);
        java.util.Set set11 = defaultedMap3.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) "[]");
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation19.getChromosomes();
        java.lang.Object obj21 = defaultedMap3.get((java.lang.Object) elitisticListPopulation19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation26.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome28 = list_chromosome27.spliterator();
        java.lang.Object obj30 = defaultedMap23.put((java.lang.Object) list_chromosome27, (java.lang.Object) (short) 10);
        java.util.Set set31 = defaultedMap23.keySet();
        boolean b33 = defaultedMap23.containsKey((java.lang.Object) 52);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation41.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome43 = list_chromosome42.spliterator();
        java.lang.Object obj45 = defaultedMap38.put((java.lang.Object) list_chromosome42, (java.lang.Object) (short) 10);
        java.util.Set set46 = defaultedMap38.keySet();
        boolean b48 = defaultedMap38.containsKey((java.lang.Object) 52);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate34, predicate49);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d56 = elitisticListPopulation55.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome57 = elitisticListPopulation55.iterator();
        math.genetics.Chromosome[] chromosome_array58 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome59 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b60 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome59, chromosome_array58);
        elitisticListPopulation55.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome59);
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d65 = elitisticListPopulation64.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation68 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome69 = elitisticListPopulation68.getChromosomes();
        elitisticListPopulation64.setChromosomes(list_chromosome69);
        math.genetics.Chromosome[] chromosome_array71 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome72 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b73 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome72, chromosome_array71);
        elitisticListPopulation64.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome72);
        java.util.List<math.genetics.Chromosome> list_chromosome75 = elitisticListPopulation64.getChromosomes();
        elitisticListPopulation55.setChromosomes(list_chromosome75);
        java.lang.Object obj78 = defaultedMap3.put((java.lang.Object) elitisticListPopulation55, (java.lang.Object) "[null]");
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertNotNull(spliterator_chromosome28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertNotNull(spliterator_chromosome43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(d56 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome57);
        org.junit.Assert.assertNotNull(chromosome_array58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(d65 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome69);
        org.junit.Assert.assertNotNull(chromosome_array71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(list_chromosome75);
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double d6 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation2.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d11 = elitisticListPopulation10.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation10.iterator();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation10.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d20 = elitisticListPopulation19.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation19.setChromosomes(list_chromosome24);
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27);
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation10.setChromosomes(list_chromosome30);
        elitisticListPopulation2.setChromosomes(list_chromosome30);
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome24);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(list_chromosome30);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 52);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate16);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d21 = elitisticListPopulation20.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation20.setChromosomes(list_chromosome25);
        java.lang.String str27 = elitisticListPopulation20.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d31 = elitisticListPopulation30.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome32 = elitisticListPopulation30.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation35.getChromosomes();
        elitisticListPopulation30.setChromosomes(list_chromosome36);
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation30.getChromosomes();
        elitisticListPopulation20.setChromosomes(list_chromosome38);
        math.genetics.Population population40 = elitisticListPopulation20.nextGeneration();
        boolean b41 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation20);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(d21 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]" + "'", str27.equals("[]"));
        org.junit.Assert.assertTrue(d31 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome32);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNotNull(population40);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5);
        math.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) population8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation14.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = list_chromosome15.spliterator();
        java.lang.Object obj18 = defaultedMap11.put((java.lang.Object) list_chromosome15, (java.lang.Object) (short) 10);
        java.util.Set set19 = defaultedMap11.keySet();
        boolean b21 = defaultedMap11.containsKey((java.lang.Object) 52);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate22, predicate23);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i28 = elitisticListPopulation27.getPopulationLimit();
        double d29 = elitisticListPopulation27.getElitismRate();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) elitisticListPopulation27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation35.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome37 = list_chromosome36.spliterator();
        java.lang.Object obj39 = defaultedMap32.put((java.lang.Object) list_chromosome36, (java.lang.Object) (short) 10);
        java.util.Set set40 = defaultedMap32.keySet();
        boolean b42 = defaultedMap32.containsKey((java.lang.Object) 52);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate43, predicate44);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i49 = elitisticListPopulation48.getPopulationLimit();
        double d50 = elitisticListPopulation48.getElitismRate();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) elitisticListPopulation48);
        boolean b52 = defaultedMap32.isEmpty();
        java.lang.Object obj53 = defaultedMap11.remove((java.lang.Object) defaultedMap32);
        boolean b54 = defaultedMap9.containsKey(obj53);
        math.genetics.ElitisticListPopulation elitisticListPopulation57 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome58 = elitisticListPopulation57.getChromosomes();
        java.lang.Object obj59 = defaultedMap9.get((java.lang.Object) list_chromosome58);
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(i28 == 52);
        org.junit.Assert.assertTrue(d29 == 0.0d);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNotNull(spliterator_chromosome37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(i49 == 52);
        org.junit.Assert.assertTrue(d50 == 0.0d);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(list_chromosome58);
        org.junit.Assert.assertNotNull(obj59);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d9 = elitisticListPopulation8.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation8.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(list_chromosome14);
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome16);
        math.genetics.Population population18 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue(i3 == 52);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome10);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertNotNull(population18);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation6.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome7);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) arraylist_chromosome10);
        java.util.Set set14 = defaultedMap13.entrySet();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.lang.String str9 = defaultedMap1.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i13 = elitisticListPopulation12.getPopulationLimit();
        double d14 = elitisticListPopulation12.getElitismRate();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) d14);
        java.util.Set set16 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{[]=10}" + "'", str9.equals("{[]=10}"));
        org.junit.Assert.assertTrue(i13 == 52);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (short) 10 + "'", obj15.equals((short) 10));
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation4.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = list_chromosome5.spliterator();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) list_chromosome5, (java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 52);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate13);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i18 = elitisticListPopulation17.getPopulationLimit();
        double d19 = elitisticListPopulation17.getElitismRate();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation25.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = list_chromosome26.spliterator();
        java.lang.Object obj29 = defaultedMap22.put((java.lang.Object) list_chromosome26, (java.lang.Object) (short) 10);
        java.util.Set set30 = defaultedMap22.keySet();
        boolean b32 = defaultedMap22.containsKey((java.lang.Object) 52);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate33, predicate34);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        int i39 = elitisticListPopulation38.getPopulationLimit();
        double d40 = elitisticListPopulation38.getElitismRate();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) elitisticListPopulation38);
        boolean b42 = defaultedMap22.isEmpty();
        java.lang.Object obj43 = defaultedMap1.remove((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome49 = elitisticListPopulation48.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome50 = list_chromosome49.spliterator();
        java.lang.Object obj52 = defaultedMap45.put((java.lang.Object) list_chromosome49, (java.lang.Object) (short) 10);
        java.util.Set set53 = defaultedMap45.keySet();
        boolean b55 = defaultedMap45.containsKey((java.lang.Object) 52);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate56, predicate57);
        defaultedMap1.putAll((java.util.Map) defaultedMap45);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i18 == 52);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(list_chromosome26);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(i39 == 52);
        org.junit.Assert.assertTrue(d40 == 0.0d);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(list_chromosome49);
        org.junit.Assert.assertNotNull(spliterator_chromosome50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
    }
}

