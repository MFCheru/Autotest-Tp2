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
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        int i7 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i7 == 32);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) '#');
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population9 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        try {
            math.genetics.Chromosome chromosome14 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome8);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Map map0 = null;
        math.genetics.Chromosome[] chromosome_array1 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome2 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome2, chromosome_array1);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome2, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation6.iterator();
        elitisticListPopulation6.setPopulationLimit((int) 'a');
        int i10 = elitisticListPopulation6.getPopulationLimit();
        double d11 = elitisticListPopulation6.getElitismRate();
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) elitisticListPopulation6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(d11 == 0.0d);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.Chromosome chromosome9 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        elitisticListPopulation5.setPopulationLimit((int) (byte) 10);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 100);
        try {
            math.genetics.Chromosome chromosome11 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.String str4 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation(list_chromosome8, (int) 'a', 0.0d);
        try {
            elitisticListPopulation11.setElitismRate((double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.String str11 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        int i9 = elitisticListPopulation5.getPopulationLimit();
        double d10 = elitisticListPopulation5.getElitismRate();
        try {
            elitisticListPopulation5.setElitismRate((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(d10 == 0.0d);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 32);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation(list_chromosome8, 100, 10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) '#', (java.lang.Object) predicate11);
        defaultedMap1.clear();
        java.util.Collection collection14 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj9 = null;
        java.lang.Object obj11 = defaultedMap8.put(obj9, (java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        math.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(population8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 100);
        double d11 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome8);
        org.junit.Assert.assertTrue(d11 == 0.0d);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        boolean b7 = defaultedMap1.equals((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) (short) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        int i9 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) ' ', (double) 0);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(list_chromosome17);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        try {
            elitisticListPopulation5.setElitismRate((double) 97);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        double d8 = elitisticListPopulation5.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(list_chromosome9, 0, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        double d7 = elitisticListPopulation5.getElitismRate();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertTrue(i8 == 32);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Set set7 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = null;
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        int i13 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = null;
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        int i19 = defaultedMap15.size();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate23 = null;
        collections.Predicate predicate24 = null;
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        boolean b27 = defaultedMap22.containsValue((java.lang.Object) (-1.0d));
        java.util.Set set28 = defaultedMap22.keySet();
        boolean b29 = defaultedMap15.containsValue((java.lang.Object) set28);
        java.lang.Object obj30 = defaultedMap9.get((java.lang.Object) set28);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + '#' + "'", obj30.equals('#'));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        java.util.Set set2 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.String str8 = defaultedMap1.toString();
        java.util.Set set9 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        int i9 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) ' ', (double) 0);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome23 = elitisticListPopulation22.iterator();
        double d24 = elitisticListPopulation22.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome25);
        try {
            math.genetics.Chromosome chromosome27 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome23);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome25);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Set set7 = defaultedMap1.keySet();
        boolean b8 = defaultedMap1.isEmpty();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) '#', (java.lang.Object) predicate11);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.String str8 = defaultedMap1.toString();
        defaultedMap1.clear();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation15.iterator();
        double d17 = elitisticListPopulation15.getElitismRate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate20 = null;
        collections.Predicate predicate21 = null;
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        int i23 = defaultedMap19.size();
        defaultedMap19.clear();
        java.util.Collection collection25 = defaultedMap19.values();
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj29 = null;
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, obj29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap28);
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100);
        java.lang.Object obj34 = defaultedMap1.put((java.lang.Object) collection25, (java.lang.Object) defaultedMap31);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertTrue(d17 == 0.0d);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation15.iterator();
        elitisticListPopulation15.setPopulationLimit((int) 'a');
        int i19 = elitisticListPopulation15.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation15.iterator();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) elitisticListPopulation15);
        java.util.Collection collection22 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + '#' + "'", obj21.equals('#'));
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        double d7 = elitisticListPopulation5.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        try {
            elitisticListPopulation5.setElitismRate((double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population9 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation5.addChromosome(chromosome14);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome8);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) ' ', (double) 0);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation16.addChromosome(chromosome17);
        double d19 = elitisticListPopulation16.getElitismRate();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) ' ', (java.lang.Object) d19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate23 = null;
        collections.Predicate predicate24 = null;
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        boolean b27 = defaultedMap22.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection28 = defaultedMap22.values();
        java.util.Set set29 = defaultedMap22.keySet();
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) defaultedMap22);
        java.util.Set set31 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation5.addChromosome(chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Set set7 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 100.0f, (java.lang.Object) (byte) -1);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        double d19 = elitisticListPopulation17.getElitismRate();
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) elitisticListPopulation17);
        try {
            elitisticListPopulation17.setElitismRate((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + '#' + "'", obj20.equals('#'));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        double d7 = elitisticListPopulation5.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation(list_chromosome8, (int) (byte) 1, (double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation7.addChromosome(chromosome8);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation7.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation7.iterator();
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) iterator_chromosome11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = null;
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        java.util.Set set19 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj22 = null;
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, obj22);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj25 = defaultedMap1.put(obj13, (java.lang.Object) defaultedMap21);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        int i7 = elitisticListPopulation5.getPopulationSize();
        try {
            math.genetics.Chromosome chromosome8 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        double d7 = elitisticListPopulation5.getElitismRate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = null;
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        int i13 = defaultedMap9.size();
        defaultedMap9.clear();
        java.util.Collection collection15 = defaultedMap9.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection15);
        math.genetics.Population population17 = elitisticListPopulation5.nextGeneration();
        int i18 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(population17);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        int i9 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) ' ', (double) 0);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection7 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation13.getChromosomes();
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome23 = elitisticListPopulation22.iterator();
        elitisticListPopulation22.setPopulationLimit((int) 'a');
        int i26 = elitisticListPopulation22.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, (int) ' ', (double) 0);
        elitisticListPopulation22.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation13.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        java.lang.Object obj35 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation13);
        try {
            elitisticListPopulation13.setElitismRate((double) 97);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome23);
        org.junit.Assert.assertTrue(i26 == 97);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        double d7 = elitisticListPopulation5.getElitismRate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = null;
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        int i13 = defaultedMap9.size();
        defaultedMap9.clear();
        java.util.Collection collection15 = defaultedMap9.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection15);
        try {
            math.genetics.Chromosome chromosome17 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 100);
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        boolean b12 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation9);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        elitisticListPopulation17.setPopulationLimit((int) 'a');
        int i21 = elitisticListPopulation17.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation17.iterator();
        boolean b23 = defaultedMap11.equals((java.lang.Object) elitisticListPopulation17);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome30 = elitisticListPopulation29.iterator();
        math.genetics.Population population31 = elitisticListPopulation29.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome32 = elitisticListPopulation29.spliterator();
        java.lang.Object obj33 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) spliterator_chromosome32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate36 = null;
        collections.Predicate predicate37 = null;
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        boolean b40 = defaultedMap35.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection41 = defaultedMap35.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap35);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertTrue(i21 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome30);
        org.junit.Assert.assertNotNull(population31);
        org.junit.Assert.assertNotNull(spliterator_chromosome32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection41);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate6 = null;
        collections.Predicate predicate7 = null;
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        int i9 = defaultedMap5.size();
        defaultedMap5.clear();
        java.util.Set set11 = defaultedMap5.entrySet();
        defaultedMap5.clear();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 100.0f, (java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate18 = null;
        collections.Predicate predicate19 = null;
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        int i21 = defaultedMap17.size();
        defaultedMap17.clear();
        java.util.Set set23 = defaultedMap17.entrySet();
        boolean b24 = defaultedMap5.containsKey((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate28 = null;
        collections.Predicate predicate29 = null;
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        boolean b32 = defaultedMap27.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj34 = defaultedMap27.get((java.lang.Object) (byte) 10);
        java.util.Set set35 = defaultedMap27.keySet();
        java.lang.Object obj37 = defaultedMap27.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate40 = null;
        collections.Predicate predicate41 = null;
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        int i43 = defaultedMap39.size();
        defaultedMap39.clear();
        java.util.Set set45 = defaultedMap39.keySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate48 = null;
        collections.Predicate predicate49 = null;
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        int i51 = defaultedMap47.size();
        defaultedMap47.clear();
        java.lang.Object obj53 = defaultedMap39.get((java.lang.Object) defaultedMap47);
        defaultedMap27.putAll((java.util.Map) defaultedMap47);
        java.lang.Object obj55 = defaultedMap5.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap27);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + '#' + "'", obj34.equals('#'));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + '#' + "'", obj37.equals('#'));
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + '#' + "'", obj53.equals('#'));
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit(97);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate14 = null;
        collections.Predicate predicate15 = null;
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        int i17 = defaultedMap13.size();
        defaultedMap13.clear();
        java.util.Collection collection19 = defaultedMap13.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection19);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome8);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) (short) 1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) '#', (java.lang.Object) predicate11);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = null;
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        boolean b20 = defaultedMap15.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection21 = defaultedMap15.values();
        boolean b22 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate25 = null;
        collections.Predicate predicate26 = null;
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        boolean b29 = defaultedMap24.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection30 = defaultedMap24.values();
        boolean b31 = defaultedMap24.isEmpty();
        java.lang.Object obj32 = defaultedMap15.get((java.lang.Object) b31);
        boolean b33 = defaultedMap1.containsKey(obj32);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + '#' + "'", obj32.equals('#'));
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Set set7 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 100.0f, (java.lang.Object) (byte) -1);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        double d19 = elitisticListPopulation17.getElitismRate();
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) elitisticListPopulation17);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate21, predicate22);
        java.lang.String str24 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + '#' + "'", obj20.equals('#'));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{100.0=-1}" + "'", str24.equals("{100.0=-1}"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population9 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation5.setElitismRate(0.0d);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome8);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation15.addChromosome(chromosome16);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation15.getChromosomes();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation15);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate23 = null;
        collections.Predicate predicate24 = null;
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        int i26 = defaultedMap22.size();
        defaultedMap22.clear();
        java.util.Set set28 = defaultedMap22.entrySet();
        defaultedMap22.clear();
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) defaultedMap22);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        double d7 = elitisticListPopulation5.getElitismRate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = null;
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        int i13 = defaultedMap9.size();
        defaultedMap9.clear();
        java.util.Collection collection15 = defaultedMap9.values();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection15);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        java.lang.String str10 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[null, null]" + "'", str10.equals("[null, null]"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        try {
            elitisticListPopulation5.setElitismRate((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        int i9 = elitisticListPopulation5.getPopulationLimit();
        double d10 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation5.addChromosome(chromosome11);
        double d13 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue(d13 == 0.0d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation15.iterator();
        elitisticListPopulation15.setPopulationLimit((int) 'a');
        int i19 = elitisticListPopulation15.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation15.iterator();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) elitisticListPopulation15);
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation15.addChromosome(chromosome22);
        double d24 = elitisticListPopulation15.getElitismRate();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome31 = elitisticListPopulation30.iterator();
        double d32 = elitisticListPopulation30.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation30.getChromosomes();
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome33);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + '#' + "'", obj21.equals('#'));
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome31);
        org.junit.Assert.assertTrue(d32 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome33);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation5.spliterator();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertTrue(i9 == 32);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        int i9 = elitisticListPopulation5.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) i9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate13 = null;
        collections.Predicate predicate14 = null;
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) ' ', (double) 0);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation27.addChromosome(chromosome28);
        double d30 = elitisticListPopulation27.getElitismRate();
        java.lang.Object obj31 = defaultedMap12.put((java.lang.Object) ' ', (java.lang.Object) d30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate34 = null;
        collections.Predicate predicate35 = null;
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        boolean b38 = defaultedMap33.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection39 = defaultedMap33.values();
        java.util.Set set40 = defaultedMap33.keySet();
        java.lang.Object obj41 = defaultedMap12.remove((java.lang.Object) defaultedMap33);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, obj41);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d30 == 0.0d);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation7.addChromosome(chromosome8);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation7.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation7.iterator();
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) iterator_chromosome11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = null;
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        java.util.Set set19 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj22 = null;
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, obj22);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj25 = defaultedMap1.put(obj13, (java.lang.Object) defaultedMap21);
        int i26 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate14 = null;
        collections.Predicate predicate15 = null;
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        int i17 = defaultedMap13.size();
        defaultedMap13.clear();
        java.util.Set set19 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate22 = null;
        collections.Predicate predicate23 = null;
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        int i25 = defaultedMap21.size();
        defaultedMap21.clear();
        java.lang.Object obj27 = defaultedMap13.get((java.lang.Object) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        collections.Transformer transformer29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + '#' + "'", obj11.equals('#'));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + '#' + "'", obj27.equals('#'));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate14 = null;
        collections.Predicate predicate15 = null;
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        int i17 = defaultedMap13.size();
        defaultedMap13.clear();
        java.util.Set set19 = defaultedMap13.entrySet();
        defaultedMap13.clear();
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 100.0f, (java.lang.Object) (byte) -1);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome30 = elitisticListPopulation29.iterator();
        double d31 = elitisticListPopulation29.getElitismRate();
        java.lang.Object obj32 = defaultedMap13.get((java.lang.Object) elitisticListPopulation29);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate33, predicate34);
        java.lang.Object obj36 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome43 = null;
        elitisticListPopulation42.addChromosome(chromosome43);
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation42.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome46 = elitisticListPopulation42.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome47 = elitisticListPopulation42.iterator();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) iterator_chromosome47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) (short) 100);
        defaultedMap48.putAll(map52);
        defaultedMap13.putAll(map52);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + '#' + "'", obj11.equals('#'));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome30);
        org.junit.Assert.assertTrue(d31 == 0.0d);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + '#' + "'", obj32.equals('#'));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + '#' + "'", obj36.equals('#'));
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(list_chromosome45);
        org.junit.Assert.assertNotNull(iterator_chromosome46);
        org.junit.Assert.assertNotNull(iterator_chromosome47);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) ' ', (double) 0);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation16.addChromosome(chromosome17);
        double d19 = elitisticListPopulation16.getElitismRate();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) ' ', (java.lang.Object) d19);
        java.util.Set set21 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate24 = null;
        collections.Predicate predicate25 = null;
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        boolean b28 = defaultedMap23.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj30 = defaultedMap23.get((java.lang.Object) (byte) 10);
        java.util.Set set31 = defaultedMap23.keySet();
        java.lang.Object obj33 = defaultedMap23.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate36 = null;
        collections.Predicate predicate37 = null;
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        int i39 = defaultedMap35.size();
        defaultedMap35.clear();
        java.util.Set set41 = defaultedMap35.entrySet();
        defaultedMap35.clear();
        java.lang.Object obj45 = defaultedMap35.put((java.lang.Object) 100.0f, (java.lang.Object) (byte) -1);
        math.genetics.Chromosome[] chromosome_array46 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome47 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b48 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome47, chromosome_array46);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome47, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome52 = elitisticListPopulation51.iterator();
        double d53 = elitisticListPopulation51.getElitismRate();
        java.lang.Object obj54 = defaultedMap35.get((java.lang.Object) elitisticListPopulation51);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate55, predicate56);
        java.lang.Object obj58 = defaultedMap23.get((java.lang.Object) defaultedMap35);
        boolean b59 = defaultedMap1.equals((java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate62 = null;
        collections.Predicate predicate63 = null;
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate62, predicate63);
        int i65 = defaultedMap61.size();
        defaultedMap61.clear();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        math.genetics.Chromosome[] chromosome_array72 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome73 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b74 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome73, chromosome_array72);
        math.genetics.ElitisticListPopulation elitisticListPopulation77 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome73, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome78 = elitisticListPopulation77.iterator();
        elitisticListPopulation77.setPopulationLimit((int) 'a');
        int i81 = elitisticListPopulation77.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome82 = elitisticListPopulation77.iterator();
        boolean b83 = defaultedMap71.equals((java.lang.Object) elitisticListPopulation77);
        math.genetics.Chromosome[] chromosome_array84 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome85 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b86 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome85, chromosome_array84);
        math.genetics.ElitisticListPopulation elitisticListPopulation89 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome85, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome90 = elitisticListPopulation89.iterator();
        math.genetics.Population population91 = elitisticListPopulation89.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome92 = elitisticListPopulation89.spliterator();
        java.lang.Object obj93 = defaultedMap61.put((java.lang.Object) defaultedMap71, (java.lang.Object) spliterator_chromosome92);
        boolean b94 = defaultedMap1.equals((java.lang.Object) defaultedMap71);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + '#' + "'", obj30.equals('#'));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(chromosome_array46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome52);
        org.junit.Assert.assertTrue(d53 == 0.0d);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + '#' + "'", obj54.equals('#'));
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + '#' + "'", obj58.equals('#'));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(chromosome_array72);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome78);
        org.junit.Assert.assertTrue(i81 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome82);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(chromosome_array84);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome90);
        org.junit.Assert.assertNotNull(population91);
        org.junit.Assert.assertNotNull(spliterator_chromosome92);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue(b94 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        int i2 = defaultedMap1.size();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation8.addChromosome(chromosome9);
        int i11 = elitisticListPopulation8.getPopulationSize();
        int i12 = elitisticListPopulation8.getPopulationSize();
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation8);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj2);
        java.lang.String str4 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        java.util.Collection collection10 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        try {
            math.genetics.Chromosome chromosome10 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) 97);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        int i9 = elitisticListPopulation5.getPopulationLimit();
        double d10 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation5.addChromosome(chromosome11);
        try {
            elitisticListPopulation5.setPopulationLimit((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(d10 == 0.0d);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        int i10 = defaultedMap6.size();
        defaultedMap6.clear();
        boolean b12 = defaultedMap4.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, obj15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate20 = null;
        collections.Predicate predicate21 = null;
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        int i23 = defaultedMap19.size();
        defaultedMap19.clear();
        boolean b25 = defaultedMap17.containsKey((java.lang.Object) defaultedMap19);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap19);
        collections.Factory factory27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.String str8 = defaultedMap1.toString();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) false);
        int i4 = defaultedMap1.size();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation10.addChromosome(chromosome11);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation10.setPopulationLimit((int) (byte) 100);
        elitisticListPopulation10.setElitismRate(0.0d);
        math.genetics.Population population18 = elitisticListPopulation10.nextGeneration();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) elitisticListPopulation10);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + '#' + "'", obj19.equals('#'));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) '#', (java.lang.Object) predicate11);
        java.util.Set set13 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        int i9 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) ' ', (double) 0);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        java.lang.String str17 = elitisticListPopulation5.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome18 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome18);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate14 = null;
        collections.Predicate predicate15 = null;
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        boolean b18 = defaultedMap13.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj20 = defaultedMap13.get((java.lang.Object) (byte) 10);
        java.util.Set set21 = defaultedMap13.keySet();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj24 = defaultedMap13.put((java.lang.Object) '#', (java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate27 = null;
        collections.Predicate predicate28 = null;
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) predicate23, (java.lang.Object) defaultedMap26);
        int i31 = defaultedMap26.size();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + '#' + "'", obj11.equals('#'));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + '#' + "'", obj20.equals('#'));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap7.remove((java.lang.Object) 0.0d);
        boolean b14 = defaultedMap7.isEmpty();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.lang.String str10 = elitisticListPopulation5.toString();
        double d11 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertTrue(d11 == 0.0d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b11 = defaultedMap7.isEmpty();
        boolean b12 = defaultedMap7.isEmpty();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.lang.String str10 = elitisticListPopulation5.toString();
        int i11 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        int i9 = elitisticListPopulation5.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) i9);
        java.util.Set set11 = defaultedMap10.keySet();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        double d8 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population9 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNotNull(population9);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        elitisticListPopulation17.setPopulationLimit((int) 'a');
        int i21 = elitisticListPopulation17.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation17.iterator();
        boolean b23 = defaultedMap11.equals((java.lang.Object) elitisticListPopulation17);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome30 = elitisticListPopulation29.iterator();
        math.genetics.Population population31 = elitisticListPopulation29.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome32 = elitisticListPopulation29.spliterator();
        java.lang.Object obj33 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) spliterator_chromosome32);
        boolean b34 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertTrue(i21 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome30);
        org.junit.Assert.assertNotNull(population31);
        org.junit.Assert.assertNotNull(spliterator_chromosome32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        int i9 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) ' ', (double) 0);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome23 = elitisticListPopulation22.iterator();
        double d24 = elitisticListPopulation22.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome25);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation5.getChromosomes();
        int i28 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome23);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertTrue(i28 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        int i8 = elitisticListPopulation5.getPopulationSize();
        try {
            math.genetics.Chromosome chromosome9 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(list_chromosome9, (int) '#', (double) 1L);
        java.lang.String str13 = elitisticListPopulation12.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        int i7 = defaultedMap3.size();
        defaultedMap3.clear();
        java.util.Set set9 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate12 = null;
        collections.Predicate predicate13 = null;
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        int i15 = defaultedMap11.size();
        defaultedMap11.clear();
        java.lang.Object obj17 = defaultedMap3.get((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj20 = null;
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, obj20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) defaultedMap19);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation29.addChromosome(chromosome30);
        double d32 = elitisticListPopulation29.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation29.getChromosomes();
        java.lang.Object obj34 = defaultedMap11.get((java.lang.Object) list_chromosome33);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + '#' + "'", obj17.equals('#'));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(d32 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + '#' + "'", obj34.equals('#'));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 10);
        int i9 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        double d10 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setElitismRate((double) (byte) 1);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(d10 == 0.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        elitisticListPopulation17.setPopulationLimit((int) 'a');
        int i21 = elitisticListPopulation17.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation17.iterator();
        boolean b23 = defaultedMap11.equals((java.lang.Object) elitisticListPopulation17);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome30 = elitisticListPopulation29.iterator();
        math.genetics.Population population31 = elitisticListPopulation29.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome32 = elitisticListPopulation29.spliterator();
        java.lang.Object obj33 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) spliterator_chromosome32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate36 = null;
        collections.Predicate predicate37 = null;
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        boolean b40 = defaultedMap35.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj42 = defaultedMap35.get((java.lang.Object) (byte) 10);
        java.util.Set set43 = defaultedMap35.keySet();
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome50 = elitisticListPopulation49.iterator();
        elitisticListPopulation49.setPopulationLimit((int) 'a');
        int i53 = elitisticListPopulation49.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation49.iterator();
        java.lang.Object obj55 = defaultedMap35.get((java.lang.Object) elitisticListPopulation49);
        math.genetics.Chromosome chromosome56 = null;
        elitisticListPopulation49.addChromosome(chromosome56);
        double d58 = elitisticListPopulation49.getElitismRate();
        java.lang.Object obj59 = defaultedMap1.remove((java.lang.Object) d58);
        java.lang.String str60 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertTrue(i21 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome30);
        org.junit.Assert.assertNotNull(population31);
        org.junit.Assert.assertNotNull(spliterator_chromosome32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + '#' + "'", obj42.equals('#'));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome50);
        org.junit.Assert.assertTrue(i53 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + '#' + "'", obj55.equals('#'));
        org.junit.Assert.assertTrue(d58 == 0.0d);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Collection collection7 = defaultedMap1.values();
        int i8 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation15.iterator();
        elitisticListPopulation15.setPopulationLimit((int) 'a');
        int i19 = elitisticListPopulation15.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation15.iterator();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) elitisticListPopulation15);
        double d22 = elitisticListPopulation15.getElitismRate();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + '#' + "'", obj21.equals('#'));
        org.junit.Assert.assertTrue(d22 == 0.0d);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        int i8 = elitisticListPopulation5.getPopulationSize();
        int i9 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setElitismRate(0.0d);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) ' ', (double) 0);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation16.addChromosome(chromosome17);
        double d19 = elitisticListPopulation16.getElitismRate();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) ' ', (java.lang.Object) d19);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation5.addChromosome(chromosome10);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome8);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        int i9 = elitisticListPopulation5.getPopulationLimit();
        double d10 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setPopulationLimit((int) (short) 1);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(d10 == 0.0d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 97);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b17 = defaultedMap16.isEmpty();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + '#' + "'", obj12.equals('#'));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        int i10 = defaultedMap6.size();
        defaultedMap6.clear();
        boolean b12 = defaultedMap4.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, obj15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate20 = null;
        collections.Predicate predicate21 = null;
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        int i23 = defaultedMap19.size();
        defaultedMap19.clear();
        boolean b25 = defaultedMap17.containsKey((java.lang.Object) defaultedMap19);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap19);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome33 = null;
        elitisticListPopulation32.addChromosome(chromosome33);
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation32.getChromosomes();
        math.genetics.Population population36 = elitisticListPopulation32.nextGeneration();
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        elitisticListPopulation32.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation32);
        java.lang.Object obj42 = defaultedMap4.get((java.lang.Object) defaultedMap41);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertNotNull(population36);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set9 = defaultedMap1.keySet();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) '#', (java.lang.Object) predicate11);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = null;
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        boolean b20 = defaultedMap15.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj22 = defaultedMap15.get((java.lang.Object) (byte) 10);
        java.util.Set set23 = defaultedMap15.keySet();
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate28 = null;
        collections.Predicate predicate29 = null;
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        boolean b32 = defaultedMap27.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj34 = defaultedMap27.get((java.lang.Object) (byte) 10);
        java.util.Set set35 = defaultedMap27.keySet();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj38 = defaultedMap27.put((java.lang.Object) '#', (java.lang.Object) predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate41 = null;
        collections.Predicate predicate42 = null;
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        java.lang.Object obj44 = defaultedMap15.put((java.lang.Object) predicate37, (java.lang.Object) defaultedMap40);
        java.lang.Object obj45 = defaultedMap1.get(obj44);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + '#' + "'", obj22.equals('#'));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + '#' + "'", obj25.equals('#'));
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + '#' + "'", obj34.equals('#'));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + '#' + "'", obj45.equals('#'));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) ' ', (double) 0);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation16.addChromosome(chromosome17);
        double d19 = elitisticListPopulation16.getElitismRate();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) ' ', (java.lang.Object) d19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate23 = null;
        collections.Predicate predicate24 = null;
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        boolean b27 = defaultedMap22.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection28 = defaultedMap22.values();
        java.util.Set set29 = defaultedMap22.keySet();
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) defaultedMap22);
        boolean b31 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit(97);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome8);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation17.iterator();
        elitisticListPopulation17.setPopulationLimit((int) 'a');
        int i21 = elitisticListPopulation17.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation17.iterator();
        boolean b23 = defaultedMap11.equals((java.lang.Object) elitisticListPopulation17);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome30 = elitisticListPopulation29.iterator();
        math.genetics.Population population31 = elitisticListPopulation29.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome32 = elitisticListPopulation29.spliterator();
        java.lang.Object obj33 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) spliterator_chromosome32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate36 = null;
        collections.Predicate predicate37 = null;
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        boolean b40 = defaultedMap35.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj42 = defaultedMap35.get((java.lang.Object) (byte) 10);
        java.util.Set set43 = defaultedMap35.keySet();
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45, (int) ' ', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome50 = elitisticListPopulation49.iterator();
        elitisticListPopulation49.setPopulationLimit((int) 'a');
        int i53 = elitisticListPopulation49.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation49.iterator();
        java.lang.Object obj55 = defaultedMap35.get((java.lang.Object) elitisticListPopulation49);
        math.genetics.Chromosome chromosome56 = null;
        elitisticListPopulation49.addChromosome(chromosome56);
        double d58 = elitisticListPopulation49.getElitismRate();
        java.lang.Object obj59 = defaultedMap1.remove((java.lang.Object) d58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate62 = null;
        collections.Predicate predicate63 = null;
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate62, predicate63);
        int i65 = defaultedMap61.size();
        defaultedMap61.clear();
        java.util.Set set67 = defaultedMap61.keySet();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate70 = null;
        collections.Predicate predicate71 = null;
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate70, predicate71);
        int i73 = defaultedMap69.size();
        defaultedMap69.clear();
        java.lang.Object obj75 = defaultedMap61.get((java.lang.Object) defaultedMap69);
        boolean b76 = defaultedMap1.containsValue((java.lang.Object) defaultedMap69);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertTrue(i21 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome30);
        org.junit.Assert.assertNotNull(population31);
        org.junit.Assert.assertNotNull(spliterator_chromosome32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + '#' + "'", obj42.equals('#'));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome50);
        org.junit.Assert.assertTrue(i53 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + '#' + "'", obj55.equals('#'));
        org.junit.Assert.assertTrue(d58 == 0.0d);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + '#' + "'", obj75.equals('#'));
        org.junit.Assert.assertTrue(b76 == false);
    }
}

