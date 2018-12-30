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
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        try {
            math.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        try {
            elitisticListPopulation2.setElitismRate((-1.0d));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(list_chromosome7, (int) ' ', (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
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
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.Chromosome chromosome6 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        try {
            math.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0d);
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) (-1.0d));
        int i22 = defaultedMap17.size();
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) defaultedMap17);
        collections.Transformer transformer24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, transformer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) '#');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setPopulationLimit(1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        try {
            elitisticListPopulation2.setElitismRate((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((-1), (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0d);
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) (-1.0d));
        int i22 = defaultedMap17.size();
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) defaultedMap17);
        java.util.Set set24 = defaultedMap1.keySet();
        collections.Factory factory25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation14.setElitismRate((double) (byte) 0);
        elitisticListPopulation14.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation9.setChromosomes(list_chromosome19);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = list_chromosome19.spliterator();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome19);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation(list_chromosome19, (int) (short) 1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        try {
            math.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(population8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        try {
            elitisticListPopulation2.setElitismRate((double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) '4');
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Set set7 = defaultedMap6.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate8, predicate9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 100.0d);
        int i15 = defaultedMap12.size();
        boolean b17 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap12.isEmpty();
        java.util.Set set19 = defaultedMap12.keySet();
        boolean b20 = defaultedMap6.containsValue((java.lang.Object) defaultedMap12);
        boolean b21 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        java.util.Set set22 = defaultedMap12.entrySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.lang.String str6 = elitisticListPopulation2.toString();
        try {
            elitisticListPopulation2.setPopulationLimit((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation7.setElitismRate((double) (byte) 0);
        elitisticListPopulation7.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome12);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = list_chromosome12.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(list_chromosome12, (int) (byte) 100, 1.0d);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation(list_chromosome12, (int) (byte) 0, (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) '4');
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        java.util.Collection collection7 = defaultedMap1.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.lang.String str18 = elitisticListPopulation2.toString();
        try {
            elitisticListPopulation2.setElitismRate((double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) 1L);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Set set13 = defaultedMap12.entrySet();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) predicate15);
        collections.Transformer transformer18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation8.setElitismRate((double) (byte) 0);
        elitisticListPopulation8.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation8.getChromosomes();
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation8.addChromosome(chromosome14);
        int i16 = elitisticListPopulation8.getPopulationSize();
        int i17 = elitisticListPopulation8.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation20.setElitismRate((double) (byte) 0);
        elitisticListPopulation20.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation20.getChromosomes();
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation20.addChromosome(chromosome26);
        int i28 = elitisticListPopulation20.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        elitisticListPopulation31.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33);
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 100);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.util.Set set4 = defaultedMap3.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0d);
        int i12 = defaultedMap9.size();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap9.isEmpty();
        java.util.Set set16 = defaultedMap9.keySet();
        boolean b17 = defaultedMap3.containsValue((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0d);
        int i23 = defaultedMap20.size();
        boolean b25 = defaultedMap20.containsKey((java.lang.Object) 10.0d);
        boolean b26 = defaultedMap20.isEmpty();
        java.util.Collection collection27 = defaultedMap20.values();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) (short) 0);
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation4.setElitismRate((double) (byte) 0);
        elitisticListPopulation4.setElitismRate((double) 0.0f);
        int i9 = elitisticListPopulation4.getPopulationSize();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) i9, (java.lang.Object) defaultedMap11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) 100.0d);
        int i17 = defaultedMap14.size();
        boolean b19 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        boolean b20 = defaultedMap14.isEmpty();
        java.util.Set set21 = defaultedMap14.keySet();
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) 100.0d);
        boolean b27 = defaultedMap23.containsValue((java.lang.Object) (-1.0d));
        boolean b28 = defaultedMap14.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate30, predicate32);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        try {
            math.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.util.Set set16 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation24.setElitismRate((double) (byte) 0);
        elitisticListPopulation24.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation19.setChromosomes(list_chromosome29);
        boolean b31 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation19);
        collections.Transformer transformer32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(list_chromosome29);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (short) 1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation7.setElitismRate((double) (byte) 0);
        elitisticListPopulation7.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome12);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(list_chromosome12, (int) (byte) 10, (double) (byte) 0);
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation16.addChromosome(chromosome17);
        double d19 = elitisticListPopulation16.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        elitisticListPopulation22.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation29.addChromosome(chromosome30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation34.setElitismRate((double) (byte) 0);
        elitisticListPopulation34.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation29.setChromosomes(list_chromosome39);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome41 = list_chromosome39.spliterator();
        elitisticListPopulation22.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome39);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome39);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(list_chromosome39);
        org.junit.Assert.assertNotNull(spliterator_chromosome41);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation5.setElitismRate((double) (byte) 0);
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation5.addChromosome(chromosome11);
        int i13 = elitisticListPopulation5.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18);
        try {
            elitisticListPopulation2.setElitismRate((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation5.setElitismRate((double) (byte) 0);
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation5.addChromosome(chromosome11);
        int i13 = elitisticListPopulation5.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation26.setElitismRate((double) (byte) 0);
        elitisticListPopulation26.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation26.getChromosomes();
        math.genetics.Chromosome chromosome32 = null;
        elitisticListPopulation26.addChromosome(chromosome32);
        int i34 = elitisticListPopulation26.getPopulationSize();
        int i35 = elitisticListPopulation26.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        elitisticListPopulation38.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40);
        java.lang.String str45 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "[]" + "'", str45.equals("[]"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0d);
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) (-1.0d));
        int i22 = defaultedMap17.size();
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) defaultedMap17);
        java.lang.String str24 = defaultedMap17.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation(10, (double) 1);
        boolean b28 = defaultedMap17.containsValue((java.lang.Object) 1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0d);
        int i20 = defaultedMap17.size();
        boolean b22 = defaultedMap17.containsKey((java.lang.Object) 10.0d);
        boolean b23 = defaultedMap17.isEmpty();
        java.util.Set set24 = defaultedMap17.keySet();
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) set24);
        java.util.Set set26 = defaultedMap1.keySet();
        java.util.Collection collection27 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation11.setElitismRate((double) (byte) 0);
        elitisticListPopulation11.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation11.getChromosomes();
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation11.addChromosome(chromosome17);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        elitisticListPopulation21.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23);
        elitisticListPopulation11.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome28 = arraylist_chromosome23.spliterator();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) (byte) 0, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome28);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) map18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.util.Set set22 = defaultedMap21.entrySet();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate23, predicate24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 100.0d);
        int i30 = defaultedMap27.size();
        boolean b32 = defaultedMap27.containsKey((java.lang.Object) 10.0d);
        boolean b33 = defaultedMap27.isEmpty();
        java.util.Set set34 = defaultedMap27.keySet();
        boolean b35 = defaultedMap21.containsValue((java.lang.Object) defaultedMap27);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) 100.0d);
        int i40 = defaultedMap37.size();
        boolean b42 = defaultedMap37.containsKey((java.lang.Object) 10.0d);
        boolean b43 = defaultedMap37.isEmpty();
        java.util.Set set44 = defaultedMap37.keySet();
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) 100.0d);
        boolean b50 = defaultedMap46.containsValue((java.lang.Object) (-1.0d));
        boolean b51 = defaultedMap37.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate52, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate52, predicate55);
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) 100.0d);
        int i61 = defaultedMap58.size();
        java.lang.Object obj62 = null;
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap(obj62);
        java.util.Set set64 = defaultedMap63.entrySet();
        java.util.Set set65 = defaultedMap63.keySet();
        boolean b66 = defaultedMap58.containsKey((java.lang.Object) defaultedMap63);
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        java.util.Set set69 = defaultedMap68.entrySet();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate70, predicate71);
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        boolean b76 = defaultedMap74.containsKey((java.lang.Object) 100.0d);
        int i77 = defaultedMap74.size();
        boolean b79 = defaultedMap74.containsKey((java.lang.Object) 10.0d);
        boolean b80 = defaultedMap74.isEmpty();
        java.util.Set set81 = defaultedMap74.keySet();
        java.lang.Object obj82 = null;
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap(obj82);
        boolean b85 = defaultedMap83.containsKey((java.lang.Object) 100.0d);
        boolean b87 = defaultedMap83.containsValue((java.lang.Object) (-1.0d));
        boolean b88 = defaultedMap74.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate89 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate89, predicate90);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate70, predicate89);
        collections.map.DefaultedMap defaultedMap93 = new collections.map.DefaultedMap((java.lang.Object) predicate89);
        java.util.Map map94 = collections.map.PredicatedMap.decorate(map18, predicate55, predicate89);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(map94);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        try {
            elitisticListPopulation2.setElitismRate((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0d);
        int i20 = defaultedMap17.size();
        boolean b22 = defaultedMap17.containsKey((java.lang.Object) 10.0d);
        boolean b23 = defaultedMap17.isEmpty();
        java.util.Set set24 = defaultedMap17.keySet();
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) set24);
        java.lang.String str26 = defaultedMap1.toString();
        java.lang.String str27 = defaultedMap1.toString();
        java.util.Set set28 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) map18);
        collections.Transformer transformer20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, transformer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        int i11 = elitisticListPopulation2.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        try {
            elitisticListPopulation2.setElitismRate((double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0d);
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) (-1.0d));
        int i22 = defaultedMap17.size();
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) defaultedMap17);
        java.util.Set set24 = defaultedMap1.keySet();
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.util.Set set27 = defaultedMap26.entrySet();
        boolean b28 = defaultedMap1.containsKey((java.lang.Object) defaultedMap26);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        int i7 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str8 = elitisticListPopulation2.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        try {
            elitisticListPopulation2.setElitismRate((double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Set set7 = defaultedMap6.entrySet();
        java.util.Set set8 = defaultedMap6.keySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Set set12 = defaultedMap11.entrySet();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate13, predicate14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0d);
        int i20 = defaultedMap17.size();
        boolean b22 = defaultedMap17.containsKey((java.lang.Object) 10.0d);
        boolean b23 = defaultedMap17.isEmpty();
        java.util.Set set24 = defaultedMap17.keySet();
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 100.0d);
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) (-1.0d));
        boolean b31 = defaultedMap17.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate32);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) 100.0d);
        int i40 = defaultedMap37.size();
        boolean b42 = defaultedMap37.containsKey((java.lang.Object) 10.0d);
        boolean b43 = defaultedMap37.isEmpty();
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        java.lang.Object obj46 = defaultedMap37.get((java.lang.Object) defaultedMap45);
        java.lang.Object obj47 = defaultedMap1.get((java.lang.Object) defaultedMap45);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Set set8 = defaultedMap7.entrySet();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) 100.0d);
        int i16 = defaultedMap13.size();
        boolean b18 = defaultedMap13.containsKey((java.lang.Object) 10.0d);
        boolean b19 = defaultedMap13.isEmpty();
        java.util.Set set20 = defaultedMap13.keySet();
        boolean b21 = defaultedMap7.containsValue((java.lang.Object) defaultedMap13);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) 100.0d);
        boolean b27 = defaultedMap23.containsValue((java.lang.Object) (-1.0d));
        int i28 = defaultedMap23.size();
        boolean b29 = defaultedMap7.containsValue((java.lang.Object) defaultedMap23);
        java.lang.String str30 = defaultedMap23.toString();
        boolean b31 = defaultedMap1.containsValue((java.lang.Object) str30);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.List<math.genetics.Chromosome> list_chromosome0 = null;
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(list_chromosome0, (int) ' ', (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        int i11 = elitisticListPopulation2.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.lang.String str20 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[null]" + "'", str20.equals("[null]"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Set set18 = defaultedMap17.entrySet();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) 100.0d);
        int i26 = defaultedMap23.size();
        boolean b28 = defaultedMap23.containsKey((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap23.isEmpty();
        java.util.Set set30 = defaultedMap23.keySet();
        boolean b31 = defaultedMap17.containsValue((java.lang.Object) defaultedMap23);
        java.util.Set set32 = defaultedMap17.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation35.addChromosome(chromosome36);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation40.setElitismRate((double) (byte) 0);
        elitisticListPopulation40.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation40.getChromosomes();
        elitisticListPopulation35.setChromosomes(list_chromosome45);
        boolean b47 = defaultedMap17.equals((java.lang.Object) elitisticListPopulation35);
        boolean b48 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation35);
        int i49 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(list_chromosome45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i49 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        boolean b16 = defaultedMap7.isEmpty();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) 100.0d);
        int i21 = defaultedMap18.size();
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.util.Set set24 = defaultedMap23.entrySet();
        java.util.Set set25 = defaultedMap23.keySet();
        boolean b26 = defaultedMap18.containsKey((java.lang.Object) defaultedMap23);
        java.lang.Object obj27 = defaultedMap7.get((java.lang.Object) b26);
        int i28 = defaultedMap7.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i28 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation8.setElitismRate((double) (byte) 0);
        elitisticListPopulation8.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation8.getChromosomes();
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation8.addChromosome(chromosome14);
        int i16 = elitisticListPopulation8.getPopulationSize();
        int i17 = elitisticListPopulation8.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation20.setElitismRate((double) (byte) 0);
        elitisticListPopulation20.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation20.getChromosomes();
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation20.addChromosome(chromosome26);
        int i28 = elitisticListPopulation20.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        elitisticListPopulation31.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        int i39 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 100);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i39 == 100);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str11 = elitisticListPopulation2.toString();
        int i12 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[null]" + "'", str11.equals("[null]"));
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(d3 == 0.0d);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.containsValue(obj6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0d);
        int i12 = defaultedMap9.size();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap9.isEmpty();
        java.util.Set set16 = defaultedMap9.keySet();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) 100.0d);
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) (-1.0d));
        boolean b23 = defaultedMap9.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate24, predicate25);
        boolean b27 = defaultedMap1.equals((java.lang.Object) map26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) 100.0d);
        int i32 = defaultedMap29.size();
        java.lang.String str33 = defaultedMap29.toString();
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap29.containsValue(obj34);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) 100.0d);
        int i40 = defaultedMap37.size();
        boolean b42 = defaultedMap37.containsKey((java.lang.Object) 10.0d);
        boolean b43 = defaultedMap37.isEmpty();
        java.util.Set set44 = defaultedMap37.keySet();
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) 100.0d);
        boolean b50 = defaultedMap46.containsValue((java.lang.Object) (-1.0d));
        boolean b51 = defaultedMap37.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate52, predicate53);
        boolean b55 = defaultedMap29.equals((java.lang.Object) map54);
        boolean b56 = defaultedMap1.equals((java.lang.Object) map54);
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) 100.0d);
        int i61 = defaultedMap58.size();
        boolean b63 = defaultedMap58.containsKey((java.lang.Object) 10.0d);
        boolean b64 = defaultedMap58.isEmpty();
        java.util.Set set65 = defaultedMap58.keySet();
        java.lang.Object obj66 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap(obj66);
        boolean b69 = defaultedMap67.containsKey((java.lang.Object) 100.0d);
        boolean b71 = defaultedMap67.containsValue((java.lang.Object) (-1.0d));
        boolean b72 = defaultedMap58.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate73, predicate74);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate73, predicate76);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.containsValue(obj2);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        int i11 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation2.iterator();
        java.util.Collection<math.genetics.Chromosome> collection_chromosome13 = null;
        try {
            elitisticListPopulation2.addChromosomes(collection_chromosome13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 100);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation5.setElitismRate((double) (byte) 0);
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation5.addChromosome(chromosome11);
        int i13 = elitisticListPopulation5.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation2.addChromosome(chromosome24);
        try {
            math.genetics.Chromosome chromosome26 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome23);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation5.setElitismRate((double) (byte) 0);
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation5.addChromosome(chromosome11);
        int i13 = elitisticListPopulation5.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation33.addChromosome(chromosome34);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation38.setElitismRate((double) (byte) 0);
        elitisticListPopulation38.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation33.setChromosomes(list_chromosome43);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome45 = list_chromosome43.spliterator();
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome43);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome43);
        math.genetics.Chromosome chromosome48 = null;
        elitisticListPopulation2.addChromosome(chromosome48);
        try {
            elitisticListPopulation2.setElitismRate((double) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(list_chromosome43);
        org.junit.Assert.assertNotNull(spliterator_chromosome45);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        java.util.Set set4 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation7.setElitismRate((double) (byte) 0);
        elitisticListPopulation7.setElitismRate((double) 0.0f);
        int i12 = elitisticListPopulation7.getPopulationLimit();
        math.genetics.Population population13 = elitisticListPopulation7.nextGeneration();
        boolean b14 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation7);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        try {
            math.genetics.Chromosome chromosome12 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(population11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.util.Set set4 = defaultedMap3.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0d);
        int i12 = defaultedMap9.size();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap9.isEmpty();
        java.util.Set set16 = defaultedMap9.keySet();
        boolean b17 = defaultedMap3.containsValue((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Set set21 = defaultedMap20.entrySet();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 100.0d);
        int i29 = defaultedMap26.size();
        boolean b31 = defaultedMap26.containsKey((java.lang.Object) 10.0d);
        boolean b32 = defaultedMap26.isEmpty();
        java.util.Set set33 = defaultedMap26.keySet();
        boolean b34 = defaultedMap20.containsValue((java.lang.Object) defaultedMap26);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 100.0d);
        boolean b40 = defaultedMap36.containsValue((java.lang.Object) (-1.0d));
        int i41 = defaultedMap36.size();
        boolean b42 = defaultedMap20.containsValue((java.lang.Object) defaultedMap36);
        defaultedMap1.putAll((java.util.Map) defaultedMap36);
        collections.Factory factory44 = null;
        try {
            java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation7.setElitismRate((double) (byte) 0);
        elitisticListPopulation7.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome12);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(list_chromosome12, (int) (byte) 10, (double) (byte) 0);
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation16.addChromosome(chromosome17);
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation16.addChromosome(chromosome19);
        org.junit.Assert.assertNotNull(list_chromosome12);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) '4');
        defaultedMap1.clear();
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i8 = defaultedMap7.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation11.setElitismRate((double) (byte) 0);
        elitisticListPopulation11.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation11.getChromosomes();
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation11.addChromosome(chromosome17);
        int i19 = elitisticListPopulation11.getPopulationSize();
        java.lang.String str20 = elitisticListPopulation11.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation11.iterator();
        double d22 = elitisticListPopulation11.getElitismRate();
        boolean b23 = defaultedMap7.containsValue((java.lang.Object) d22);
        collections.Transformer transformer24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[null]" + "'", str20.equals("[null]"));
        org.junit.Assert.assertNotNull(iterator_chromosome21);
        org.junit.Assert.assertTrue(d22 == 0.0d);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.String str9 = defaultedMap1.toString();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation14.setElitismRate((double) (byte) 0);
        elitisticListPopulation14.setElitismRate((double) 0.0f);
        int i19 = elitisticListPopulation14.getPopulationSize();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.lang.Object obj22 = defaultedMap11.put((java.lang.Object) i19, (java.lang.Object) defaultedMap21);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap1.get(obj24);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) (byte) 100, (java.lang.Object) '4');
        defaultedMap7.clear();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Set set14 = defaultedMap13.entrySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate15, predicate16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 100.0d);
        int i22 = defaultedMap19.size();
        boolean b24 = defaultedMap19.containsKey((java.lang.Object) 10.0d);
        boolean b25 = defaultedMap19.isEmpty();
        java.util.Set set26 = defaultedMap19.keySet();
        boolean b27 = defaultedMap13.containsValue((java.lang.Object) defaultedMap19);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) 100.0d);
        boolean b33 = defaultedMap29.containsValue((java.lang.Object) (-1.0d));
        int i34 = defaultedMap29.size();
        boolean b35 = defaultedMap13.containsValue((java.lang.Object) defaultedMap29);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) b35);
        boolean b37 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation42.setElitismRate((double) (byte) 0);
        elitisticListPopulation42.setElitismRate((double) 0.0f);
        int i47 = elitisticListPopulation42.getPopulationSize();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) predicate48);
        java.lang.Object obj50 = defaultedMap39.put((java.lang.Object) i47, (java.lang.Object) defaultedMap49);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation53.setElitismRate((double) (byte) 0);
        elitisticListPopulation53.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome58 = elitisticListPopulation53.getChromosomes();
        math.genetics.Population population59 = elitisticListPopulation53.nextGeneration();
        math.genetics.Chromosome chromosome60 = null;
        elitisticListPopulation53.addChromosome(chromosome60);
        java.lang.Object obj62 = defaultedMap49.get((java.lang.Object) chromosome60);
        java.lang.Object obj63 = defaultedMap1.remove((java.lang.Object) chromosome60);
        java.util.Set set64 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(list_chromosome58);
        org.junit.Assert.assertNotNull(population59);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.containsValue(obj6);
        java.util.Set set8 = defaultedMap1.keySet();
        java.util.Set set9 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) (-1.0d));
        int i12 = defaultedMap7.size();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) 100.0d);
        int i17 = defaultedMap14.size();
        boolean b19 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        boolean b20 = defaultedMap14.isEmpty();
        java.util.Collection collection21 = defaultedMap14.values();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 0);
        boolean b24 = defaultedMap7.containsValue((java.lang.Object) map23);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) b24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Set set28 = defaultedMap27.entrySet();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) 100.0d);
        int i36 = defaultedMap33.size();
        boolean b38 = defaultedMap33.containsKey((java.lang.Object) 10.0d);
        boolean b39 = defaultedMap33.isEmpty();
        java.util.Set set40 = defaultedMap33.keySet();
        boolean b41 = defaultedMap27.containsValue((java.lang.Object) defaultedMap33);
        int i42 = defaultedMap27.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation2.iterator();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Set set14 = defaultedMap13.entrySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate15, predicate16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 100.0d);
        int i22 = defaultedMap19.size();
        boolean b24 = defaultedMap19.containsKey((java.lang.Object) 10.0d);
        boolean b25 = defaultedMap19.isEmpty();
        java.util.Set set26 = defaultedMap19.keySet();
        boolean b27 = defaultedMap13.containsValue((java.lang.Object) defaultedMap19);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.util.Set set31 = defaultedMap30.entrySet();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 100.0d);
        int i39 = defaultedMap36.size();
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) 10.0d);
        boolean b42 = defaultedMap36.isEmpty();
        java.util.Set set43 = defaultedMap36.keySet();
        boolean b44 = defaultedMap30.containsValue((java.lang.Object) defaultedMap36);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) 100.0d);
        boolean b50 = defaultedMap46.containsValue((java.lang.Object) (-1.0d));
        int i51 = defaultedMap46.size();
        boolean b52 = defaultedMap30.containsValue((java.lang.Object) defaultedMap46);
        defaultedMap11.putAll((java.util.Map) defaultedMap46);
        java.util.Collection collection54 = defaultedMap46.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection54);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection54);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.util.Set set4 = defaultedMap3.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0d);
        int i12 = defaultedMap9.size();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap9.isEmpty();
        java.util.Set set16 = defaultedMap9.keySet();
        boolean b17 = defaultedMap3.containsValue((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Set set21 = defaultedMap20.entrySet();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 100.0d);
        int i29 = defaultedMap26.size();
        boolean b31 = defaultedMap26.containsKey((java.lang.Object) 10.0d);
        boolean b32 = defaultedMap26.isEmpty();
        java.util.Set set33 = defaultedMap26.keySet();
        boolean b34 = defaultedMap20.containsValue((java.lang.Object) defaultedMap26);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 100.0d);
        boolean b40 = defaultedMap36.containsValue((java.lang.Object) (-1.0d));
        int i41 = defaultedMap36.size();
        boolean b42 = defaultedMap20.containsValue((java.lang.Object) defaultedMap36);
        defaultedMap1.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) (byte) 100, (java.lang.Object) '4');
        defaultedMap45.clear();
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.util.Set set52 = defaultedMap51.entrySet();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate53, predicate54);
        java.lang.Object obj56 = null;
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap(obj56);
        boolean b59 = defaultedMap57.containsKey((java.lang.Object) 100.0d);
        int i60 = defaultedMap57.size();
        boolean b62 = defaultedMap57.containsKey((java.lang.Object) 10.0d);
        boolean b63 = defaultedMap57.isEmpty();
        java.util.Set set64 = defaultedMap57.keySet();
        boolean b65 = defaultedMap51.containsValue((java.lang.Object) defaultedMap57);
        java.lang.Object obj66 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap(obj66);
        boolean b69 = defaultedMap67.containsKey((java.lang.Object) 100.0d);
        boolean b71 = defaultedMap67.containsValue((java.lang.Object) (-1.0d));
        int i72 = defaultedMap67.size();
        boolean b73 = defaultedMap51.containsValue((java.lang.Object) defaultedMap67);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) b73);
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) defaultedMap45);
        collections.Factory factory76 = null;
        try {
            java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, factory76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.util.Collection collection11 = defaultedMap1.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) 100.0d);
        int i16 = defaultedMap13.size();
        boolean b18 = defaultedMap13.containsKey((java.lang.Object) 10.0d);
        boolean b19 = defaultedMap13.isEmpty();
        java.util.Set set20 = defaultedMap13.keySet();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) 100.0d);
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (-1.0d));
        boolean b27 = defaultedMap13.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate28, predicate29);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Set set33 = defaultedMap32.entrySet();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate34, predicate35);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) 100.0d);
        int i41 = defaultedMap38.size();
        boolean b43 = defaultedMap38.containsKey((java.lang.Object) 10.0d);
        boolean b44 = defaultedMap38.isEmpty();
        java.util.Set set45 = defaultedMap38.keySet();
        boolean b46 = defaultedMap32.containsValue((java.lang.Object) defaultedMap38);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) 100.0d);
        boolean b52 = defaultedMap48.containsValue((java.lang.Object) (-1.0d));
        int i53 = defaultedMap48.size();
        boolean b54 = defaultedMap32.containsValue((java.lang.Object) defaultedMap48);
        java.util.Set set55 = defaultedMap32.keySet();
        java.lang.Object obj56 = null;
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap(obj56);
        java.util.Set set58 = defaultedMap57.entrySet();
        boolean b59 = defaultedMap32.containsKey((java.lang.Object) defaultedMap57);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap57);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        int i62 = defaultedMap1.size();
        java.lang.String str63 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) 1L);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Set set13 = defaultedMap12.entrySet();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) predicate15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation20.setElitismRate((double) (byte) 0);
        elitisticListPopulation20.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation20.getChromosomes();
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation20.addChromosome(chromosome26);
        int i28 = elitisticListPopulation20.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation20.getChromosomes();
        boolean b30 = defaultedMap1.containsValue((java.lang.Object) list_chromosome29);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertNotNull(list_chromosome29);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation11.setElitismRate((double) (byte) 0);
        elitisticListPopulation11.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation11.getChromosomes();
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation11.addChromosome(chromosome17);
        int i19 = elitisticListPopulation11.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        elitisticListPopulation22.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24);
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24);
        math.genetics.Population population29 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(population29);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) -1, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection16 = defaultedMap1.values();
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.util.Collection collection11 = defaultedMap1.values();
        java.util.Set set12 = defaultedMap1.entrySet();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) 100.0d);
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) (-1.0d));
        boolean b19 = defaultedMap14.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation22.setElitismRate((double) (byte) 0);
        elitisticListPopulation22.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation22.getChromosomes();
        math.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation22.addChromosome(chromosome28);
        int i30 = elitisticListPopulation22.getPopulationSize();
        math.genetics.Population population31 = elitisticListPopulation22.nextGeneration();
        java.lang.Object obj32 = defaultedMap14.get((java.lang.Object) population31);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertNotNull(population31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit(10);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation16.setElitismRate((double) (byte) 0);
        elitisticListPopulation16.setElitismRate((double) 0.0f);
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation16.addChromosome(chromosome21);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation25.setElitismRate((double) (byte) 0);
        elitisticListPopulation25.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation25.getChromosomes();
        math.genetics.Chromosome chromosome31 = null;
        elitisticListPopulation25.addChromosome(chromosome31);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37);
        elitisticListPopulation25.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        elitisticListPopulation16.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome42 = arraylist_chromosome37.spliterator();
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        try {
            elitisticListPopulation2.setPopulationLimit((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome42);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection16 = defaultedMap1.values();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) 100.0d);
        int i21 = defaultedMap18.size();
        boolean b23 = defaultedMap18.containsKey((java.lang.Object) 10.0d);
        boolean b24 = defaultedMap18.isEmpty();
        java.util.Set set25 = defaultedMap18.keySet();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 100.0d);
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) (-1.0d));
        boolean b32 = defaultedMap18.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection33 = defaultedMap18.values();
        boolean b34 = defaultedMap1.containsKey((java.lang.Object) collection33);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) (byte) 100, (java.lang.Object) '4');
        defaultedMap36.clear();
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        java.util.Set set43 = defaultedMap42.entrySet();
        boolean b44 = defaultedMap42.isEmpty();
        java.lang.Object obj46 = defaultedMap42.get((java.lang.Object) '#');
        java.lang.Object obj47 = defaultedMap1.put((java.lang.Object) defaultedMap36, (java.lang.Object) defaultedMap42);
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) 100.0d);
        boolean b53 = defaultedMap49.containsValue((java.lang.Object) (-1.0d));
        int i54 = defaultedMap49.size();
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        boolean b58 = defaultedMap56.containsKey((java.lang.Object) 100.0d);
        int i59 = defaultedMap56.size();
        boolean b61 = defaultedMap56.containsKey((java.lang.Object) 10.0d);
        boolean b62 = defaultedMap56.isEmpty();
        java.util.Collection collection63 = defaultedMap56.values();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) (short) 0);
        boolean b66 = defaultedMap49.containsValue((java.lang.Object) map65);
        math.genetics.ElitisticListPopulation elitisticListPopulation69 = new math.genetics.ElitisticListPopulation(10, (double) 1);
        math.genetics.Population population70 = elitisticListPopulation69.nextGeneration();
        boolean b71 = defaultedMap49.containsKey((java.lang.Object) elitisticListPopulation69);
        java.lang.Object obj72 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation69);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(population70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNull(obj72);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.util.Set set11 = defaultedMap9.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.util.Set set13 = defaultedMap7.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation16.setElitismRate((double) (byte) 0);
        elitisticListPopulation16.setElitismRate((double) 0.0f);
        int i21 = elitisticListPopulation16.getPopulationLimit();
        boolean b22 = defaultedMap7.containsKey((java.lang.Object) i21);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i21 == 100);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation2.addChromosome(chromosome11);
        int i13 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome10);
        org.junit.Assert.assertTrue(i13 == 2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        double d9 = elitisticListPopulation2.getElitismRate();
        try {
            elitisticListPopulation2.setPopulationLimit((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 1.0d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit(10);
        double d14 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation2.getChromosomes();
        java.lang.String str16 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[null]" + "'", str16.equals("[null]"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.util.Set set4 = defaultedMap3.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0d);
        int i12 = defaultedMap9.size();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap9.isEmpty();
        java.util.Set set16 = defaultedMap9.keySet();
        boolean b17 = defaultedMap3.containsValue((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Set set21 = defaultedMap20.entrySet();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 100.0d);
        int i29 = defaultedMap26.size();
        boolean b31 = defaultedMap26.containsKey((java.lang.Object) 10.0d);
        boolean b32 = defaultedMap26.isEmpty();
        java.util.Set set33 = defaultedMap26.keySet();
        boolean b34 = defaultedMap20.containsValue((java.lang.Object) defaultedMap26);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 100.0d);
        boolean b40 = defaultedMap36.containsValue((java.lang.Object) (-1.0d));
        int i41 = defaultedMap36.size();
        boolean b42 = defaultedMap20.containsValue((java.lang.Object) defaultedMap36);
        defaultedMap1.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        java.util.Set set46 = defaultedMap45.entrySet();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate47, predicate48);
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) 100.0d);
        int i54 = defaultedMap51.size();
        boolean b56 = defaultedMap51.containsKey((java.lang.Object) 10.0d);
        boolean b57 = defaultedMap51.isEmpty();
        java.util.Set set58 = defaultedMap51.keySet();
        boolean b59 = defaultedMap45.containsValue((java.lang.Object) defaultedMap51);
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        boolean b63 = defaultedMap61.containsKey((java.lang.Object) 100.0d);
        int i64 = defaultedMap61.size();
        boolean b66 = defaultedMap61.containsKey((java.lang.Object) 10.0d);
        boolean b67 = defaultedMap61.isEmpty();
        java.util.Set set68 = defaultedMap61.keySet();
        java.lang.Object obj69 = null;
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap(obj69);
        boolean b72 = defaultedMap70.containsKey((java.lang.Object) 100.0d);
        boolean b74 = defaultedMap70.containsValue((java.lang.Object) (-1.0d));
        boolean b75 = defaultedMap61.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate76, predicate77);
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate76, predicate79);
        java.lang.Object obj81 = null;
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap(obj81);
        java.util.Set set83 = defaultedMap82.entrySet();
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap82, predicate84, predicate85);
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate76, predicate84);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map87);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection16 = defaultedMap1.values();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) 100.0d);
        int i21 = defaultedMap18.size();
        boolean b23 = defaultedMap18.containsKey((java.lang.Object) 10.0d);
        boolean b24 = defaultedMap18.isEmpty();
        java.util.Set set25 = defaultedMap18.keySet();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 100.0d);
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) (-1.0d));
        boolean b32 = defaultedMap18.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection33 = defaultedMap18.values();
        boolean b34 = defaultedMap1.containsKey((java.lang.Object) collection33);
        int i35 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.util.Collection collection11 = defaultedMap1.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) 100.0d);
        int i16 = defaultedMap13.size();
        boolean b18 = defaultedMap13.containsKey((java.lang.Object) 10.0d);
        boolean b19 = defaultedMap13.isEmpty();
        java.util.Set set20 = defaultedMap13.keySet();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) 100.0d);
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (-1.0d));
        boolean b27 = defaultedMap13.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate28, predicate29);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Set set33 = defaultedMap32.entrySet();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate34, predicate35);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) 100.0d);
        int i41 = defaultedMap38.size();
        boolean b43 = defaultedMap38.containsKey((java.lang.Object) 10.0d);
        boolean b44 = defaultedMap38.isEmpty();
        java.util.Set set45 = defaultedMap38.keySet();
        boolean b46 = defaultedMap32.containsValue((java.lang.Object) defaultedMap38);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) 100.0d);
        boolean b52 = defaultedMap48.containsValue((java.lang.Object) (-1.0d));
        int i53 = defaultedMap48.size();
        boolean b54 = defaultedMap32.containsValue((java.lang.Object) defaultedMap48);
        java.util.Set set55 = defaultedMap32.keySet();
        java.lang.Object obj56 = null;
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap(obj56);
        java.util.Set set58 = defaultedMap57.entrySet();
        boolean b59 = defaultedMap32.containsKey((java.lang.Object) defaultedMap57);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap57);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        int i62 = defaultedMap1.size();
        java.util.Set set63 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertNotNull(set63);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) '4');
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Set set7 = defaultedMap6.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate8, predicate9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 100.0d);
        int i15 = defaultedMap12.size();
        boolean b17 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap12.isEmpty();
        java.util.Set set19 = defaultedMap12.keySet();
        boolean b20 = defaultedMap6.containsValue((java.lang.Object) defaultedMap12);
        boolean b21 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        java.util.Collection collection22 = defaultedMap1.values();
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 100.0d);
        int i27 = defaultedMap24.size();
        boolean b29 = defaultedMap24.containsKey((java.lang.Object) 10.0d);
        boolean b30 = defaultedMap24.isEmpty();
        java.util.Set set31 = defaultedMap24.keySet();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) 100.0d);
        boolean b37 = defaultedMap33.containsValue((java.lang.Object) (-1.0d));
        boolean b38 = defaultedMap24.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate39, predicate40);
        defaultedMap1.putAll(map41);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) 100.0d);
        int i47 = defaultedMap44.size();
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        java.util.Set set50 = defaultedMap49.entrySet();
        java.util.Set set51 = defaultedMap49.keySet();
        boolean b52 = defaultedMap44.containsKey((java.lang.Object) defaultedMap49);
        boolean b53 = defaultedMap44.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        java.util.Set set57 = defaultedMap56.entrySet();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate58, predicate59);
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) 100.0d);
        int i65 = defaultedMap62.size();
        boolean b67 = defaultedMap62.containsKey((java.lang.Object) 10.0d);
        boolean b68 = defaultedMap62.isEmpty();
        java.util.Set set69 = defaultedMap62.keySet();
        boolean b70 = defaultedMap56.containsValue((java.lang.Object) defaultedMap62);
        java.lang.Object obj71 = null;
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap(obj71);
        boolean b74 = defaultedMap72.containsKey((java.lang.Object) 100.0d);
        int i75 = defaultedMap72.size();
        boolean b77 = defaultedMap72.containsKey((java.lang.Object) 10.0d);
        boolean b78 = defaultedMap72.isEmpty();
        java.util.Set set79 = defaultedMap72.keySet();
        java.lang.Object obj80 = null;
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap(obj80);
        boolean b83 = defaultedMap81.containsKey((java.lang.Object) 100.0d);
        boolean b85 = defaultedMap81.containsValue((java.lang.Object) (-1.0d));
        boolean b86 = defaultedMap72.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate87 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate87, predicate88);
        collections.Predicate predicate90 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate87, predicate90);
        int i92 = defaultedMap56.size();
        java.lang.Object obj94 = defaultedMap1.put((java.lang.Object) defaultedMap56, (java.lang.Object) 1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertTrue(i92 == 0);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        int i6 = defaultedMap1.size();
        java.lang.String str7 = defaultedMap1.toString();
        java.util.Set set8 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) '4');
        defaultedMap1.clear();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Set set8 = defaultedMap7.entrySet();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) 100.0d);
        int i16 = defaultedMap13.size();
        boolean b18 = defaultedMap13.containsKey((java.lang.Object) 10.0d);
        boolean b19 = defaultedMap13.isEmpty();
        java.util.Set set20 = defaultedMap13.keySet();
        boolean b21 = defaultedMap7.containsValue((java.lang.Object) defaultedMap13);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) 100.0d);
        boolean b27 = defaultedMap23.containsValue((java.lang.Object) (-1.0d));
        int i28 = defaultedMap23.size();
        boolean b29 = defaultedMap7.containsValue((java.lang.Object) defaultedMap23);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b29);
        java.util.Set set31 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(set31);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 100.0d);
        boolean b23 = defaultedMap19.containsValue((java.lang.Object) (-1.0d));
        defaultedMap19.clear();
        java.util.Collection collection25 = defaultedMap19.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection25);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.lang.String str18 = elitisticListPopulation2.toString();
        math.genetics.Population population19 = elitisticListPopulation2.nextGeneration();
        java.lang.String str20 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.util.Set set16 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation24.setElitismRate((double) (byte) 0);
        elitisticListPopulation24.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation19.setChromosomes(list_chromosome29);
        boolean b31 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation19);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation34.setElitismRate((double) (byte) 0);
        elitisticListPopulation34.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome39);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) (short) 10, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(list_chromosome29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(list_chromosome39);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Set set18 = defaultedMap17.entrySet();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) 100.0d);
        int i26 = defaultedMap23.size();
        boolean b28 = defaultedMap23.containsKey((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap23.isEmpty();
        java.util.Set set30 = defaultedMap23.keySet();
        boolean b31 = defaultedMap17.containsValue((java.lang.Object) defaultedMap23);
        java.util.Set set32 = defaultedMap17.entrySet();
        defaultedMap17.clear();
        int i34 = defaultedMap17.size();
        boolean b35 = defaultedMap1.equals((java.lang.Object) i34);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome39 = null;
        elitisticListPopulation38.addChromosome(chromosome39);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome41 = elitisticListPopulation38.spliterator();
        java.lang.Object obj42 = defaultedMap1.get((java.lang.Object) elitisticListPopulation38);
        boolean b43 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int i9 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0d);
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) (-1.0d));
        int i22 = defaultedMap17.size();
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 100.0d);
        int i27 = defaultedMap24.size();
        boolean b29 = defaultedMap24.containsKey((java.lang.Object) 10.0d);
        boolean b30 = defaultedMap24.isEmpty();
        java.util.Collection collection31 = defaultedMap24.values();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) (short) 0);
        boolean b34 = defaultedMap17.containsValue((java.lang.Object) map33);
        boolean b35 = defaultedMap1.containsKey((java.lang.Object) b34);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation4.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation11.addChromosome(chromosome12);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation16.setElitismRate((double) (byte) 0);
        elitisticListPopulation16.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome21);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome23 = list_chromosome21.spliterator();
        elitisticListPopulation4.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome21);
        int i25 = elitisticListPopulation4.getPopulationLimit();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) i25);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(spliterator_chromosome23);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + true + "'", obj26.equals(true));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation6.setElitismRate((double) (byte) 0);
        elitisticListPopulation6.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation6.getChromosomes();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation6.addChromosome(chromosome12);
        int i14 = elitisticListPopulation6.getPopulationSize();
        java.lang.String str15 = elitisticListPopulation6.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation6.iterator();
        boolean b17 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation6);
        double d18 = elitisticListPopulation6.getElitismRate();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[null]" + "'", str15.equals("[null]"));
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation5.setElitismRate((double) (byte) 0);
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation5.addChromosome(chromosome11);
        int i13 = elitisticListPopulation5.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation33.addChromosome(chromosome34);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation38.setElitismRate((double) (byte) 0);
        elitisticListPopulation38.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation33.setChromosomes(list_chromosome43);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome45 = list_chromosome43.spliterator();
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome43);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome43);
        math.genetics.Population population48 = elitisticListPopulation2.nextGeneration();
        try {
            elitisticListPopulation2.setPopulationLimit((-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(list_chromosome43);
        org.junit.Assert.assertNotNull(spliterator_chromosome45);
        org.junit.Assert.assertNotNull(population48);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Set set18 = defaultedMap17.entrySet();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) 100.0d);
        int i26 = defaultedMap23.size();
        boolean b28 = defaultedMap23.containsKey((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap23.isEmpty();
        java.util.Set set30 = defaultedMap23.keySet();
        boolean b31 = defaultedMap17.containsValue((java.lang.Object) defaultedMap23);
        java.util.Set set32 = defaultedMap17.entrySet();
        defaultedMap17.clear();
        int i34 = defaultedMap17.size();
        boolean b35 = defaultedMap1.equals((java.lang.Object) i34);
        java.util.Collection collection36 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation6.addChromosome(chromosome7);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation6.spliterator();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation6);
        java.lang.String str11 = defaultedMap1.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation14.setElitismRate((double) (byte) 0);
        double d17 = elitisticListPopulation14.getElitismRate();
        elitisticListPopulation14.setPopulationLimit((int) (byte) 100);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation14.addChromosome(chromosome20);
        boolean b22 = defaultedMap1.containsValue((java.lang.Object) chromosome20);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(d17 == 0.0d);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.containsValue(obj6);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation10.setElitismRate((double) (byte) 0);
        elitisticListPopulation10.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation10.getChromosomes();
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation10.addChromosome(chromosome16);
        int i18 = elitisticListPopulation10.getPopulationSize();
        math.genetics.Population population19 = elitisticListPopulation10.nextGeneration();
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) population19);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.util.Set set4 = defaultedMap3.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0d);
        int i12 = defaultedMap9.size();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap9.isEmpty();
        java.util.Set set16 = defaultedMap9.keySet();
        boolean b17 = defaultedMap3.containsValue((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Set set7 = defaultedMap6.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate8, predicate9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 100.0d);
        int i15 = defaultedMap12.size();
        boolean b17 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap12.isEmpty();
        java.util.Set set19 = defaultedMap12.keySet();
        boolean b20 = defaultedMap6.containsValue((java.lang.Object) defaultedMap12);
        java.util.Set set21 = defaultedMap6.entrySet();
        defaultedMap6.clear();
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 100.0d);
        int i28 = defaultedMap25.size();
        boolean b30 = defaultedMap25.containsKey((java.lang.Object) 10.0d);
        boolean b31 = defaultedMap25.isEmpty();
        java.util.Set set32 = defaultedMap25.keySet();
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) 100.0d);
        boolean b38 = defaultedMap34.containsValue((java.lang.Object) (-1.0d));
        boolean b39 = defaultedMap25.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate40, predicate41);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.util.Set set45 = defaultedMap44.entrySet();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate46, predicate47);
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 100.0d);
        int i53 = defaultedMap50.size();
        boolean b55 = defaultedMap50.containsKey((java.lang.Object) 10.0d);
        boolean b56 = defaultedMap50.isEmpty();
        java.util.Set set57 = defaultedMap50.keySet();
        boolean b58 = defaultedMap44.containsValue((java.lang.Object) defaultedMap50);
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        boolean b62 = defaultedMap60.containsKey((java.lang.Object) 100.0d);
        boolean b64 = defaultedMap60.containsValue((java.lang.Object) (-1.0d));
        int i65 = defaultedMap60.size();
        boolean b66 = defaultedMap44.containsValue((java.lang.Object) defaultedMap60);
        java.util.Set set67 = defaultedMap44.keySet();
        java.lang.Object obj68 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        java.util.Set set70 = defaultedMap69.entrySet();
        boolean b71 = defaultedMap44.containsKey((java.lang.Object) defaultedMap69);
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) defaultedMap69);
        defaultedMap69.clear();
        boolean b74 = defaultedMap1.containsKey((java.lang.Object) defaultedMap69);
        java.util.Set set75 = defaultedMap69.entrySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(set75);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation9.setElitismRate((double) (byte) 0);
        double d12 = elitisticListPopulation9.getElitismRate();
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation9);
        java.util.Set set14 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation17.setElitismRate((double) (byte) 0);
        double d20 = elitisticListPopulation17.getElitismRate();
        boolean b21 = defaultedMap1.equals((java.lang.Object) d20);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation14.setElitismRate((double) (byte) 0);
        elitisticListPopulation14.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation9.setChromosomes(list_chromosome19);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = list_chromosome19.spliterator();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome19);
        elitisticListPopulation2.setPopulationLimit((int) (short) 10);
        int i25 = elitisticListPopulation2.getPopulationLimit();
        double d26 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertTrue(i25 == 10);
        org.junit.Assert.assertTrue(d26 == 1.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 100.0d);
        int i19 = defaultedMap16.size();
        boolean b21 = defaultedMap16.containsKey((java.lang.Object) 10.0d);
        boolean b22 = defaultedMap16.isEmpty();
        java.util.Set set23 = defaultedMap16.keySet();
        java.lang.Object obj24 = defaultedMap7.put((java.lang.Object) 100.0d, (java.lang.Object) set23);
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) defaultedMap7);
        boolean b26 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        int i7 = elitisticListPopulation2.getPopulationSize();
        int i8 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) (short) 0);
        try {
            elitisticListPopulation2.setElitismRate((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit(10);
        double d14 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setElitismRate((double) 1L);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue(d14 == 0.0d);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        try {
            math.genetics.Chromosome chromosome11 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate17);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        elitisticListPopulation21.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome29 = null;
        elitisticListPopulation28.addChromosome(chromosome29);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation33.setElitismRate((double) (byte) 0);
        elitisticListPopulation33.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation28.setChromosomes(list_chromosome38);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome40 = list_chromosome38.spliterator();
        elitisticListPopulation21.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome38);
        elitisticListPopulation21.setPopulationLimit((int) (short) 10);
        int i44 = elitisticListPopulation21.getPopulationLimit();
        boolean b45 = defaultedMap1.equals((java.lang.Object) i44);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNotNull(spliterator_chromosome40);
        org.junit.Assert.assertTrue(i44 == 10);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) '4');
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Set set7 = defaultedMap6.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate8, predicate9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 100.0d);
        int i15 = defaultedMap12.size();
        boolean b17 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap12.isEmpty();
        java.util.Set set19 = defaultedMap12.keySet();
        boolean b20 = defaultedMap6.containsValue((java.lang.Object) defaultedMap12);
        boolean b21 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        java.util.Set set22 = defaultedMap12.keySet();
        collections.Transformer transformer23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation14.setElitismRate((double) (byte) 0);
        elitisticListPopulation14.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation9.setChromosomes(list_chromosome19);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = list_chromosome19.spliterator();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome19);
        int i23 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str24 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertTrue(i23 == 100);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Set set18 = defaultedMap17.entrySet();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) 100.0d);
        int i26 = defaultedMap23.size();
        boolean b28 = defaultedMap23.containsKey((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap23.isEmpty();
        java.util.Set set30 = defaultedMap23.keySet();
        boolean b31 = defaultedMap17.containsValue((java.lang.Object) defaultedMap23);
        java.util.Set set32 = defaultedMap17.entrySet();
        defaultedMap17.clear();
        int i34 = defaultedMap17.size();
        boolean b35 = defaultedMap1.equals((java.lang.Object) i34);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) 100.0d);
        int i40 = defaultedMap37.size();
        boolean b42 = defaultedMap37.containsKey((java.lang.Object) 10.0d);
        boolean b43 = defaultedMap37.isEmpty();
        java.util.Collection collection44 = defaultedMap37.values();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) (short) 0);
        java.lang.Object obj47 = defaultedMap1.remove((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Set set7 = defaultedMap6.entrySet();
        java.util.Set set8 = defaultedMap6.keySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation8.setElitismRate((double) (byte) 0);
        elitisticListPopulation8.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation8.getChromosomes();
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation8.addChromosome(chromosome14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        java.lang.String str24 = elitisticListPopulation8.toString();
        math.genetics.Population population25 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        int i27 = elitisticListPopulation8.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome28 = elitisticListPopulation8.iterator();
        int i29 = elitisticListPopulation8.getPopulationSize();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
        org.junit.Assert.assertNotNull(population25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome28);
        org.junit.Assert.assertTrue(i29 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Collection collection8 = defaultedMap1.values();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 0);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        int i13 = defaultedMap12.size();
        boolean b14 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) b14);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection16 = defaultedMap1.values();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) 100.0d);
        int i21 = defaultedMap18.size();
        boolean b23 = defaultedMap18.containsKey((java.lang.Object) 10.0d);
        boolean b24 = defaultedMap18.isEmpty();
        java.util.Set set25 = defaultedMap18.keySet();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 100.0d);
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) (-1.0d));
        boolean b32 = defaultedMap18.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection33 = defaultedMap18.values();
        boolean b34 = defaultedMap1.containsKey((java.lang.Object) collection33);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) (byte) 100, (java.lang.Object) '4');
        defaultedMap36.clear();
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        java.util.Set set43 = defaultedMap42.entrySet();
        boolean b44 = defaultedMap42.isEmpty();
        java.lang.Object obj46 = defaultedMap42.get((java.lang.Object) '#');
        java.lang.Object obj47 = defaultedMap1.put((java.lang.Object) defaultedMap36, (java.lang.Object) defaultedMap42);
        collections.Transformer transformer48 = null;
        try {
            java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, transformer48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation8.setElitismRate((double) (byte) 0);
        elitisticListPopulation8.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation8.getChromosomes();
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation8.addChromosome(chromosome14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        java.lang.String str24 = elitisticListPopulation8.toString();
        math.genetics.Population population25 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        java.lang.String str27 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
        org.junit.Assert.assertNotNull(population25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation2.addChromosome(chromosome11);
        try {
            elitisticListPopulation2.setElitismRate((double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate17);
        boolean b19 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) b19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Set set23 = defaultedMap22.entrySet();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate24, predicate25);
        java.lang.Object obj27 = defaultedMap20.get((java.lang.Object) map26);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + true + "'", obj27.equals(true));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0d);
        int i11 = defaultedMap8.size();
        boolean b13 = defaultedMap8.containsKey((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap8.isEmpty();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap16);
        java.util.Collection collection18 = defaultedMap8.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.util.Set set22 = defaultedMap21.entrySet();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate23, predicate24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 100.0d);
        int i30 = defaultedMap27.size();
        boolean b32 = defaultedMap27.containsKey((java.lang.Object) 10.0d);
        boolean b33 = defaultedMap27.isEmpty();
        java.util.Set set34 = defaultedMap27.keySet();
        boolean b35 = defaultedMap21.containsValue((java.lang.Object) defaultedMap27);
        boolean b36 = defaultedMap27.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        elitisticListPopulation39.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41);
        math.genetics.Chromosome chromosome44 = null;
        elitisticListPopulation39.addChromosome(chromosome44);
        double d46 = elitisticListPopulation39.getElitismRate();
        boolean b47 = defaultedMap27.containsValue((java.lang.Object) d46);
        java.util.Set set48 = defaultedMap27.keySet();
        java.util.Collection collection49 = defaultedMap27.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection49);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(d46 == 1.0d);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(collection49);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation6.addChromosome(chromosome7);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation6.spliterator();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation6);
        try {
            elitisticListPopulation6.setPopulationLimit((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        java.util.Set set7 = defaultedMap1.entrySet();
        int i8 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0d);
        int i20 = defaultedMap17.size();
        boolean b22 = defaultedMap17.containsKey((java.lang.Object) 10.0d);
        boolean b23 = defaultedMap17.isEmpty();
        java.util.Set set24 = defaultedMap17.keySet();
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) set24);
        java.util.Set set26 = defaultedMap1.keySet();
        int i27 = defaultedMap1.size();
        java.lang.String str28 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        int i6 = defaultedMap1.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation14.setElitismRate((double) (byte) 0);
        elitisticListPopulation14.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation9.setChromosomes(list_chromosome19);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = list_chromosome19.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation(list_chromosome19, (int) (byte) 100, 1.0d);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.String str26 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate17);
        boolean b19 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) b19);
        java.util.Set set21 = defaultedMap20.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((-1), (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Collection collection7 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation2.addChromosome(chromosome11);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation16.setElitismRate((double) (byte) 0);
        elitisticListPopulation16.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation16.getChromosomes();
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation16.addChromosome(chromosome22);
        int i24 = elitisticListPopulation16.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i24 == 1);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        double d9 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(10, (double) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation15.setElitismRate((double) (byte) 0);
        elitisticListPopulation15.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation15.getChromosomes();
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation15.addChromosome(chromosome21);
        int i23 = elitisticListPopulation15.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation12.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation36.setElitismRate((double) (byte) 0);
        elitisticListPopulation36.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation36.getChromosomes();
        math.genetics.Chromosome chromosome42 = null;
        elitisticListPopulation36.addChromosome(chromosome42);
        int i44 = elitisticListPopulation36.getPopulationSize();
        int i45 = elitisticListPopulation36.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        elitisticListPopulation48.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50);
        elitisticListPopulation36.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertNotNull(list_chromosome41);
        org.junit.Assert.assertTrue(i44 == 1);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0d);
        int i20 = defaultedMap17.size();
        boolean b22 = defaultedMap17.containsKey((java.lang.Object) 10.0d);
        boolean b23 = defaultedMap17.isEmpty();
        java.util.Set set24 = defaultedMap17.keySet();
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) set24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 100.0d);
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) (-1.0d));
        int i32 = defaultedMap27.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation35.addChromosome(chromosome36);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation40.setElitismRate((double) (byte) 0);
        elitisticListPopulation40.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation40.getChromosomes();
        elitisticListPopulation35.setChromosomes(list_chromosome45);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome47 = list_chromosome45.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation(list_chromosome45, (int) (byte) 100, 1.0d);
        java.lang.Object obj51 = defaultedMap27.get((java.lang.Object) (byte) 100);
        java.lang.Object obj52 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(list_chromosome45);
        org.junit.Assert.assertNotNull(spliterator_chromosome47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0d);
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) (-1.0d));
        int i22 = defaultedMap17.size();
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) defaultedMap17);
        java.util.Set set24 = defaultedMap1.keySet();
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.util.Set set27 = defaultedMap26.entrySet();
        boolean b28 = defaultedMap1.containsKey((java.lang.Object) defaultedMap26);
        java.lang.String str29 = defaultedMap1.toString();
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.lang.String str32 = defaultedMap31.toString();
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) (byte) 100, (java.lang.Object) '4');
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.util.Set set40 = defaultedMap39.entrySet();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate41, predicate42);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) 100.0d);
        int i48 = defaultedMap45.size();
        boolean b50 = defaultedMap45.containsKey((java.lang.Object) 10.0d);
        boolean b51 = defaultedMap45.isEmpty();
        java.util.Set set52 = defaultedMap45.keySet();
        boolean b53 = defaultedMap39.containsValue((java.lang.Object) defaultedMap45);
        boolean b54 = defaultedMap34.containsKey((java.lang.Object) defaultedMap45);
        java.util.Collection collection55 = defaultedMap34.values();
        java.lang.Object obj56 = null;
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap(obj56);
        boolean b59 = defaultedMap57.containsKey((java.lang.Object) 100.0d);
        int i60 = defaultedMap57.size();
        boolean b62 = defaultedMap57.containsKey((java.lang.Object) 10.0d);
        boolean b63 = defaultedMap57.isEmpty();
        java.util.Set set64 = defaultedMap57.keySet();
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        boolean b68 = defaultedMap66.containsKey((java.lang.Object) 100.0d);
        boolean b70 = defaultedMap66.containsValue((java.lang.Object) (-1.0d));
        boolean b71 = defaultedMap57.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate72, predicate73);
        defaultedMap34.putAll(map74);
        java.lang.Object obj76 = defaultedMap31.get((java.lang.Object) map74);
        java.lang.Object obj77 = defaultedMap1.get(obj76);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0d);
        int i11 = defaultedMap8.size();
        boolean b13 = defaultedMap8.containsKey((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap8.isEmpty();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b14);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit(10);
        double d14 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(list_chromosome15, (int) (byte) 1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome15);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Set set6 = defaultedMap5.entrySet();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0d);
        int i14 = defaultedMap11.size();
        boolean b16 = defaultedMap11.containsKey((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap11.isEmpty();
        java.util.Set set18 = defaultedMap11.keySet();
        boolean b19 = defaultedMap5.containsValue((java.lang.Object) defaultedMap11);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) 100.0d);
        int i24 = defaultedMap21.size();
        boolean b26 = defaultedMap21.containsKey((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap21.isEmpty();
        java.util.Set set28 = defaultedMap21.keySet();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) 100.0d);
        boolean b34 = defaultedMap30.containsValue((java.lang.Object) (-1.0d));
        boolean b35 = defaultedMap21.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate39);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        boolean b44 = defaultedMap42.containsKey((java.lang.Object) 100.0d);
        java.lang.Object obj45 = defaultedMap5.get((java.lang.Object) defaultedMap42);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        boolean b49 = defaultedMap47.containsKey((java.lang.Object) 100.0d);
        boolean b51 = defaultedMap47.containsValue((java.lang.Object) (-1.0d));
        defaultedMap47.clear();
        defaultedMap47.clear();
        java.util.Set set54 = defaultedMap47.keySet();
        java.lang.Object obj55 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) defaultedMap47);
        defaultedMap5.clear();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) '4');
        defaultedMap1.clear();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Set set8 = defaultedMap7.entrySet();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) 100.0d);
        int i16 = defaultedMap13.size();
        boolean b18 = defaultedMap13.containsKey((java.lang.Object) 10.0d);
        boolean b19 = defaultedMap13.isEmpty();
        java.util.Set set20 = defaultedMap13.keySet();
        boolean b21 = defaultedMap7.containsValue((java.lang.Object) defaultedMap13);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) 100.0d);
        boolean b27 = defaultedMap23.containsValue((java.lang.Object) (-1.0d));
        int i28 = defaultedMap23.size();
        boolean b29 = defaultedMap7.containsValue((java.lang.Object) defaultedMap23);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b29);
        boolean b31 = defaultedMap1.isEmpty();
        collections.Factory factory32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation6.addChromosome(chromosome7);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation6.spliterator();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation6);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation18.setElitismRate((double) (byte) 0);
        elitisticListPopulation18.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation13.setChromosomes(list_chromosome23);
        elitisticListPopulation6.setChromosomes(list_chromosome23);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(list_chromosome23, (int) (byte) -1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list_chromosome23);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i8 = defaultedMap7.size();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0d);
        int i13 = defaultedMap10.size();
        boolean b15 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap10.isEmpty();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) defaultedMap18);
        defaultedMap7.putAll((java.util.Map) defaultedMap18);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        math.genetics.Population population18 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation2.addChromosome(chromosome19);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(population18);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.String str7 = defaultedMap1.toString();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.util.Set set10 = defaultedMap9.entrySet();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) 100.0d);
        int i18 = defaultedMap15.size();
        boolean b20 = defaultedMap15.containsKey((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap15.isEmpty();
        java.util.Set set22 = defaultedMap15.keySet();
        boolean b23 = defaultedMap9.containsValue((java.lang.Object) defaultedMap15);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 100.0d);
        boolean b29 = defaultedMap25.containsValue((java.lang.Object) (-1.0d));
        int i30 = defaultedMap25.size();
        boolean b31 = defaultedMap9.containsValue((java.lang.Object) defaultedMap25);
        java.util.Set set32 = defaultedMap9.keySet();
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.util.Set set35 = defaultedMap34.entrySet();
        boolean b36 = defaultedMap9.containsKey((java.lang.Object) defaultedMap34);
        java.lang.Object obj37 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 100.0d);
        int i19 = defaultedMap16.size();
        boolean b21 = defaultedMap16.containsKey((java.lang.Object) 10.0d);
        boolean b22 = defaultedMap16.isEmpty();
        java.util.Set set23 = defaultedMap16.keySet();
        java.lang.Object obj24 = defaultedMap7.put((java.lang.Object) 100.0d, (java.lang.Object) set23);
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) defaultedMap7);
        int i26 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        boolean b16 = defaultedMap7.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation19.addChromosome(chromosome24);
        double d26 = elitisticListPopulation19.getElitismRate();
        boolean b27 = defaultedMap7.containsValue((java.lang.Object) d26);
        java.util.Set set28 = defaultedMap7.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome32 = null;
        elitisticListPopulation31.addChromosome(chromosome32);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome34 = elitisticListPopulation31.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation31.iterator();
        boolean b36 = defaultedMap7.containsKey((java.lang.Object) elitisticListPopulation31);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(d26 == 1.0d);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(spliterator_chromosome34);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) '4');
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Set set7 = defaultedMap6.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate8, predicate9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 100.0d);
        int i15 = defaultedMap12.size();
        boolean b17 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap12.isEmpty();
        java.util.Set set19 = defaultedMap12.keySet();
        boolean b20 = defaultedMap6.containsValue((java.lang.Object) defaultedMap12);
        boolean b21 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        java.util.Set set22 = defaultedMap12.keySet();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        int i25 = defaultedMap24.size();
        boolean b26 = defaultedMap24.isEmpty();
        java.util.Collection collection27 = defaultedMap24.values();
        java.lang.Object obj28 = defaultedMap12.get((java.lang.Object) defaultedMap24);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit(10);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation16.setElitismRate((double) (byte) 0);
        elitisticListPopulation16.setElitismRate((double) 0.0f);
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation16.addChromosome(chromosome21);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation25.setElitismRate((double) (byte) 0);
        elitisticListPopulation25.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation25.getChromosomes();
        math.genetics.Chromosome chromosome31 = null;
        elitisticListPopulation25.addChromosome(chromosome31);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37);
        elitisticListPopulation25.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        elitisticListPopulation16.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome42 = arraylist_chromosome37.spliterator();
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        int i44 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation2.getChromosomes();
        int i46 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome42);
        org.junit.Assert.assertTrue(i44 == 10);
        org.junit.Assert.assertNotNull(list_chromosome45);
        org.junit.Assert.assertTrue(i46 == 10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.lang.String str18 = elitisticListPopulation2.toString();
        int i19 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertTrue(i19 == 100);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.util.Set set16 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation24.setElitismRate((double) (byte) 0);
        elitisticListPopulation24.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation19.setChromosomes(list_chromosome29);
        boolean b31 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation19);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        int i34 = defaultedMap33.size();
        boolean b35 = defaultedMap33.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome39 = null;
        elitisticListPopulation38.addChromosome(chromosome39);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome41 = elitisticListPopulation38.spliterator();
        java.lang.Object obj42 = defaultedMap33.remove((java.lang.Object) elitisticListPopulation38);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome46 = null;
        elitisticListPopulation45.addChromosome(chromosome46);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation50.setElitismRate((double) (byte) 0);
        elitisticListPopulation50.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation50.getChromosomes();
        elitisticListPopulation45.setChromosomes(list_chromosome55);
        elitisticListPopulation38.setChromosomes(list_chromosome55);
        elitisticListPopulation19.setChromosomes(list_chromosome55);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(list_chromosome29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(spliterator_chromosome41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(list_chromosome55);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation9.setElitismRate((double) (byte) 0);
        double d12 = elitisticListPopulation9.getElitismRate();
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation9);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation9.iterator();
        java.lang.String str15 = elitisticListPopulation9.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]" + "'", str15.equals("[]"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0d);
        int i11 = defaultedMap8.size();
        boolean b13 = defaultedMap8.containsKey((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap8.isEmpty();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation21.addChromosome(chromosome22);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation26.setElitismRate((double) (byte) 0);
        elitisticListPopulation26.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation26.getChromosomes();
        elitisticListPopulation21.setChromosomes(list_chromosome31);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation(list_chromosome31, (int) (byte) 10, (double) (byte) 0);
        double d36 = elitisticListPopulation35.getElitismRate();
        java.lang.Object obj37 = defaultedMap8.get((java.lang.Object) elitisticListPopulation35);
        java.lang.String str38 = defaultedMap8.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertTrue(d36 == 0.0d);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Set set7 = defaultedMap6.entrySet();
        java.util.Set set8 = defaultedMap6.keySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.lang.String str10 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.util.Set set4 = defaultedMap3.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0d);
        int i12 = defaultedMap9.size();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap9.isEmpty();
        java.util.Set set16 = defaultedMap9.keySet();
        boolean b17 = defaultedMap3.containsValue((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Set set21 = defaultedMap20.entrySet();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 100.0d);
        int i29 = defaultedMap26.size();
        boolean b31 = defaultedMap26.containsKey((java.lang.Object) 10.0d);
        boolean b32 = defaultedMap26.isEmpty();
        java.util.Set set33 = defaultedMap26.keySet();
        boolean b34 = defaultedMap20.containsValue((java.lang.Object) defaultedMap26);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 100.0d);
        int i39 = defaultedMap36.size();
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) 10.0d);
        boolean b42 = defaultedMap36.isEmpty();
        java.util.Set set43 = defaultedMap36.keySet();
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) 100.0d);
        boolean b49 = defaultedMap45.containsValue((java.lang.Object) (-1.0d));
        boolean b50 = defaultedMap36.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate51, predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate51, predicate54);
        java.lang.Object obj56 = defaultedMap3.remove((java.lang.Object) map55);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        int i6 = defaultedMap1.size();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0d);
        int i11 = defaultedMap8.size();
        boolean b13 = defaultedMap8.containsKey((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap8.isEmpty();
        java.util.Collection collection15 = defaultedMap8.values();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (short) 0);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) map17);
        boolean b19 = defaultedMap1.isEmpty();
        java.util.Set set20 = defaultedMap1.keySet();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) 100.0d);
        int i25 = defaultedMap22.size();
        boolean b27 = defaultedMap22.containsKey((java.lang.Object) 10.0d);
        boolean b28 = defaultedMap22.isEmpty();
        java.util.Set set29 = defaultedMap22.keySet();
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0d);
        boolean b35 = defaultedMap31.containsValue((java.lang.Object) (-1.0d));
        boolean b36 = defaultedMap22.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) 100.0d);
        int i41 = defaultedMap38.size();
        boolean b43 = defaultedMap38.containsKey((java.lang.Object) 10.0d);
        boolean b44 = defaultedMap38.isEmpty();
        java.util.Set set45 = defaultedMap38.keySet();
        boolean b46 = defaultedMap22.containsKey((java.lang.Object) set45);
        java.util.Set set47 = defaultedMap22.keySet();
        java.lang.Object obj48 = defaultedMap1.get((java.lang.Object) set47);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation14.setElitismRate((double) (byte) 0);
        elitisticListPopulation14.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation9.setChromosomes(list_chromosome19);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = list_chromosome19.spliterator();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome19);
        elitisticListPopulation2.setPopulationLimit((int) (short) 10);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        int i27 = defaultedMap26.size();
        boolean b28 = defaultedMap26.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome32 = null;
        elitisticListPopulation31.addChromosome(chromosome32);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome34 = elitisticListPopulation31.spliterator();
        java.lang.Object obj35 = defaultedMap26.remove((java.lang.Object) elitisticListPopulation31);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome39 = null;
        elitisticListPopulation38.addChromosome(chromosome39);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation43.setElitismRate((double) (byte) 0);
        elitisticListPopulation43.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation43.getChromosomes();
        elitisticListPopulation38.setChromosomes(list_chromosome48);
        elitisticListPopulation31.setChromosomes(list_chromosome48);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(list_chromosome48, 100, (double) (byte) 0);
        elitisticListPopulation2.setChromosomes(list_chromosome48);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(spliterator_chromosome34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(list_chromosome48);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, 0.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation7.setElitismRate((double) (byte) 0);
        elitisticListPopulation7.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome12);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(list_chromosome12, (int) (byte) 10, (double) (byte) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation16.iterator();
        java.lang.String str18 = elitisticListPopulation16.toString();
        int i19 = elitisticListPopulation16.getPopulationLimit();
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertTrue(i19 == 10);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Set set18 = defaultedMap17.entrySet();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) 100.0d);
        int i26 = defaultedMap23.size();
        boolean b28 = defaultedMap23.containsKey((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap23.isEmpty();
        java.util.Set set30 = defaultedMap23.keySet();
        boolean b31 = defaultedMap17.containsValue((java.lang.Object) defaultedMap23);
        java.util.Set set32 = defaultedMap17.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation35.addChromosome(chromosome36);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation40.setElitismRate((double) (byte) 0);
        elitisticListPopulation40.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation40.getChromosomes();
        elitisticListPopulation35.setChromosomes(list_chromosome45);
        boolean b47 = defaultedMap17.equals((java.lang.Object) elitisticListPopulation35);
        boolean b48 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation35);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation51.setElitismRate((double) (byte) 0);
        elitisticListPopulation51.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome56 = elitisticListPopulation51.getChromosomes();
        math.genetics.Chromosome chromosome57 = null;
        elitisticListPopulation51.addChromosome(chromosome57);
        int i59 = elitisticListPopulation51.getPopulationSize();
        int i60 = elitisticListPopulation51.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation63.setElitismRate((double) (byte) 0);
        elitisticListPopulation63.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome68 = elitisticListPopulation63.getChromosomes();
        math.genetics.Chromosome chromosome69 = null;
        elitisticListPopulation63.addChromosome(chromosome69);
        int i71 = elitisticListPopulation63.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation74 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array75 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome76 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b77 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome76, chromosome_array75);
        elitisticListPopulation74.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome76);
        elitisticListPopulation63.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome76);
        elitisticListPopulation51.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome76);
        elitisticListPopulation35.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome76);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(list_chromosome45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(list_chromosome56);
        org.junit.Assert.assertTrue(i59 == 1);
        org.junit.Assert.assertTrue(i60 == 100);
        org.junit.Assert.assertNotNull(list_chromosome68);
        org.junit.Assert.assertTrue(i71 == 1);
        org.junit.Assert.assertNotNull(chromosome_array75);
        org.junit.Assert.assertTrue(b77 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation8.setElitismRate((double) (byte) 0);
        elitisticListPopulation8.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation8.getChromosomes();
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation8.addChromosome(chromosome14);
        int i16 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Population population17 = elitisticListPopulation8.nextGeneration();
        elitisticListPopulation8.setPopulationLimit(10);
        double d20 = elitisticListPopulation8.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(10, (double) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation26.setElitismRate((double) (byte) 0);
        elitisticListPopulation26.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation26.getChromosomes();
        math.genetics.Chromosome chromosome32 = null;
        elitisticListPopulation26.addChromosome(chromosome32);
        int i34 = elitisticListPopulation26.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39);
        java.lang.Object obj45 = defaultedMap1.remove((java.lang.Object) arraylist_chromosome39);
        collections.Transformer transformer46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNotNull(population17);
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation7.setElitismRate((double) (byte) 0);
        elitisticListPopulation7.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome12);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(list_chromosome12, (int) (byte) 10, (double) (byte) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation16.iterator();
        double d18 = elitisticListPopulation16.getElitismRate();
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertTrue(d18 == 0.0d);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i8 = defaultedMap7.size();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.util.Set set11 = defaultedMap9.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj13 = null;
        boolean b14 = defaultedMap7.containsKey(obj13);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation5.setElitismRate((double) (byte) 0);
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation5.addChromosome(chromosome11);
        int i13 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation5.addChromosome(chromosome14);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation5.iterator();
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation5);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Set set7 = defaultedMap6.entrySet();
        java.util.Set set8 = defaultedMap6.keySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Set set12 = defaultedMap11.entrySet();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate13, predicate14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0d);
        int i20 = defaultedMap17.size();
        boolean b22 = defaultedMap17.containsKey((java.lang.Object) 10.0d);
        boolean b23 = defaultedMap17.isEmpty();
        java.util.Set set24 = defaultedMap17.keySet();
        boolean b25 = defaultedMap11.containsValue((java.lang.Object) defaultedMap17);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 100.0d);
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) (-1.0d));
        int i32 = defaultedMap27.size();
        boolean b33 = defaultedMap11.containsValue((java.lang.Object) defaultedMap27);
        java.lang.String str34 = defaultedMap27.toString();
        java.util.Set set35 = defaultedMap27.entrySet();
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        java.util.Set set38 = defaultedMap37.entrySet();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate39, predicate40);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) 100.0d);
        int i46 = defaultedMap43.size();
        boolean b48 = defaultedMap43.containsKey((java.lang.Object) 10.0d);
        boolean b49 = defaultedMap43.isEmpty();
        java.util.Set set50 = defaultedMap43.keySet();
        boolean b51 = defaultedMap37.containsValue((java.lang.Object) defaultedMap43);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        java.util.Set set54 = defaultedMap53.entrySet();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate55, predicate56);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        boolean b61 = defaultedMap59.containsKey((java.lang.Object) 100.0d);
        int i62 = defaultedMap59.size();
        boolean b64 = defaultedMap59.containsKey((java.lang.Object) 10.0d);
        boolean b65 = defaultedMap59.isEmpty();
        java.util.Set set66 = defaultedMap59.keySet();
        boolean b67 = defaultedMap53.containsValue((java.lang.Object) defaultedMap59);
        java.util.Set set68 = defaultedMap53.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation71 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome72 = null;
        elitisticListPopulation71.addChromosome(chromosome72);
        math.genetics.ElitisticListPopulation elitisticListPopulation76 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation76.setElitismRate((double) (byte) 0);
        elitisticListPopulation76.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome81 = elitisticListPopulation76.getChromosomes();
        elitisticListPopulation71.setChromosomes(list_chromosome81);
        boolean b83 = defaultedMap53.equals((java.lang.Object) elitisticListPopulation71);
        boolean b84 = defaultedMap37.containsKey((java.lang.Object) elitisticListPopulation71);
        boolean b85 = defaultedMap27.containsKey((java.lang.Object) defaultedMap37);
        java.lang.Object obj86 = defaultedMap6.remove((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(list_chromosome81);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNull(obj86);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        try {
            math.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation2.iterator();
        int i13 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Population population14 = elitisticListPopulation2.nextGeneration();
        try {
            math.genetics.Chromosome chromosome15 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[null]" + "'", str11.equals("[null]"));
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue(i13 == 100);
        org.junit.Assert.assertNotNull(population14);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation6.addChromosome(chromosome7);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation6.spliterator();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation6);
        int i11 = elitisticListPopulation6.getPopulationLimit();
        math.genetics.Population population12 = elitisticListPopulation6.nextGeneration();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 100);
        org.junit.Assert.assertNotNull(population12);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Set set13 = defaultedMap12.entrySet();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) 100.0d);
        int i21 = defaultedMap18.size();
        boolean b23 = defaultedMap18.containsKey((java.lang.Object) 10.0d);
        boolean b24 = defaultedMap18.isEmpty();
        java.util.Set set25 = defaultedMap18.keySet();
        boolean b26 = defaultedMap12.containsValue((java.lang.Object) defaultedMap18);
        java.util.Set set27 = defaultedMap18.keySet();
        java.lang.String str28 = defaultedMap18.toString();
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap18);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation2.iterator();
        int i13 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[null]" + "'", str11.equals("[null]"));
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue(i13 == 100);
        org.junit.Assert.assertNotNull(list_chromosome14);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0d);
        int i12 = defaultedMap9.size();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap9.isEmpty();
        java.util.Set set16 = defaultedMap9.keySet();
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) 1L);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Set set21 = defaultedMap20.entrySet();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        java.lang.Object obj25 = defaultedMap9.get((java.lang.Object) predicate23);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        int i27 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Set set6 = defaultedMap5.entrySet();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0d);
        int i14 = defaultedMap11.size();
        boolean b16 = defaultedMap11.containsKey((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap11.isEmpty();
        java.util.Set set18 = defaultedMap11.keySet();
        boolean b19 = defaultedMap5.containsValue((java.lang.Object) defaultedMap11);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) 100.0d);
        int i24 = defaultedMap21.size();
        boolean b26 = defaultedMap21.containsKey((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap21.isEmpty();
        java.util.Set set28 = defaultedMap21.keySet();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) 100.0d);
        boolean b34 = defaultedMap30.containsValue((java.lang.Object) (-1.0d));
        boolean b35 = defaultedMap21.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate39);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        boolean b44 = defaultedMap42.containsKey((java.lang.Object) 100.0d);
        java.lang.Object obj45 = defaultedMap5.get((java.lang.Object) defaultedMap42);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        boolean b49 = defaultedMap47.containsKey((java.lang.Object) 100.0d);
        boolean b51 = defaultedMap47.containsValue((java.lang.Object) (-1.0d));
        defaultedMap47.clear();
        defaultedMap47.clear();
        java.util.Set set54 = defaultedMap47.keySet();
        java.lang.Object obj55 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) defaultedMap47);
        java.lang.String str56 = defaultedMap47.toString();
        int i57 = defaultedMap47.size();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertTrue(i57 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap1.containsValue(obj8);
        java.util.Set set10 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(10, (double) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation16.setElitismRate((double) (byte) 0);
        elitisticListPopulation16.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation16.getChromosomes();
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation16.addChromosome(chromosome22);
        int i24 = elitisticListPopulation16.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29);
        elitisticListPopulation13.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29);
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation13.getChromosomes();
        java.lang.String str35 = elitisticListPopulation13.toString();
        boolean b36 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation13);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i24 == 1);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(list_chromosome34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[]" + "'", str35.equals("[]"));
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        int i6 = defaultedMap1.size();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0d);
        int i11 = defaultedMap8.size();
        boolean b13 = defaultedMap8.containsKey((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap8.isEmpty();
        java.util.Set set15 = defaultedMap8.keySet();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0d);
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) (-1.0d));
        boolean b22 = defaultedMap8.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate23, predicate24);
        boolean b26 = defaultedMap8.isEmpty();
        java.util.Collection collection27 = defaultedMap8.values();
        boolean b28 = defaultedMap1.containsKey((java.lang.Object) collection27);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) (-1.0d));
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        int i14 = defaultedMap13.size();
        boolean b16 = defaultedMap13.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b16);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation6.addChromosome(chromosome7);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation6.spliterator();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation6);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation18.setElitismRate((double) (byte) 0);
        elitisticListPopulation18.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation13.setChromosomes(list_chromosome23);
        elitisticListPopulation6.setChromosomes(list_chromosome23);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 100.0d);
        int i30 = defaultedMap27.size();
        boolean b32 = defaultedMap27.containsKey((java.lang.Object) 10.0d);
        boolean b33 = defaultedMap27.isEmpty();
        java.util.Set set34 = defaultedMap27.keySet();
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 100.0d);
        boolean b40 = defaultedMap36.containsValue((java.lang.Object) (-1.0d));
        boolean b41 = defaultedMap27.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate42, predicate43);
        boolean b45 = defaultedMap27.isEmpty();
        java.util.Collection collection46 = defaultedMap27.values();
        elitisticListPopulation6.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection46);
        int i48 = elitisticListPopulation6.getPopulationSize();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue(i48 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) '4');
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Set set7 = defaultedMap6.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate8, predicate9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 100.0d);
        int i15 = defaultedMap12.size();
        boolean b17 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap12.isEmpty();
        java.util.Set set19 = defaultedMap12.keySet();
        boolean b20 = defaultedMap6.containsValue((java.lang.Object) defaultedMap12);
        boolean b21 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation24.setElitismRate((double) (byte) 0);
        elitisticListPopulation24.setElitismRate((double) 0.0f);
        math.genetics.Chromosome chromosome29 = null;
        elitisticListPopulation24.addChromosome(chromosome29);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation33.setElitismRate((double) (byte) 0);
        elitisticListPopulation33.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation33.getChromosomes();
        math.genetics.Chromosome chromosome39 = null;
        elitisticListPopulation33.addChromosome(chromosome39);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        elitisticListPopulation43.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45);
        elitisticListPopulation33.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45);
        elitisticListPopulation24.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45);
        boolean b50 = defaultedMap12.containsKey((java.lang.Object) arraylist_chromosome45);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b50 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        int i6 = defaultedMap1.size();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0d);
        int i11 = defaultedMap8.size();
        boolean b13 = defaultedMap8.containsKey((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap8.isEmpty();
        java.util.Collection collection15 = defaultedMap8.values();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (short) 0);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) map17);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(10, (double) 1);
        math.genetics.Population population22 = elitisticListPopulation21.nextGeneration();
        boolean b23 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation21);
        int i24 = elitisticListPopulation21.getPopulationSize();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(population22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap1.containsValue(obj8);
        java.util.Set set10 = defaultedMap1.entrySet();
        boolean b11 = defaultedMap1.isEmpty();
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) false);
        defaultedMap9.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0d);
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) (-1.0d));
        int i22 = defaultedMap17.size();
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) defaultedMap17);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) '#');
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 100.0d);
        boolean b20 = defaultedMap16.containsValue((java.lang.Object) (-1.0d));
        boolean b21 = defaultedMap7.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate22, predicate23);
        boolean b25 = defaultedMap7.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) 100.0d);
        int i31 = defaultedMap28.size();
        java.lang.String str32 = defaultedMap28.toString();
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap28.containsValue(obj33);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 100.0d);
        int i39 = defaultedMap36.size();
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) 10.0d);
        boolean b42 = defaultedMap36.isEmpty();
        java.util.Set set43 = defaultedMap36.keySet();
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) 100.0d);
        boolean b49 = defaultedMap45.containsValue((java.lang.Object) (-1.0d));
        boolean b50 = defaultedMap36.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate51, predicate52);
        boolean b54 = defaultedMap28.equals((java.lang.Object) map53);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) b54);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.util.Set set16 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        int i18 = defaultedMap1.size();
        boolean b20 = defaultedMap1.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation5.setElitismRate((double) (byte) 0);
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation5.addChromosome(chromosome11);
        int i13 = elitisticListPopulation5.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation33.addChromosome(chromosome34);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation38.setElitismRate((double) (byte) 0);
        elitisticListPopulation38.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation33.setChromosomes(list_chromosome43);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome45 = list_chromosome43.spliterator();
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome43);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome43);
        math.genetics.Population population48 = elitisticListPopulation2.nextGeneration();
        int i49 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(list_chromosome43);
        org.junit.Assert.assertNotNull(spliterator_chromosome45);
        org.junit.Assert.assertNotNull(population48);
        org.junit.Assert.assertTrue(i49 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        double d5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue(d5 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        defaultedMap1.clear();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) 100.0d);
        int i7 = defaultedMap4.size();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.util.Set set11 = defaultedMap9.keySet();
        boolean b12 = defaultedMap4.containsKey((java.lang.Object) defaultedMap9);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.util.Set set15 = defaultedMap14.entrySet();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0d);
        int i23 = defaultedMap20.size();
        boolean b25 = defaultedMap20.containsKey((java.lang.Object) 10.0d);
        boolean b26 = defaultedMap20.isEmpty();
        java.util.Set set27 = defaultedMap20.keySet();
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) 100.0d);
        boolean b33 = defaultedMap29.containsValue((java.lang.Object) (-1.0d));
        boolean b34 = defaultedMap20.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate35, predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate16, predicate35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        boolean b40 = defaultedMap1.containsKey((java.lang.Object) predicate35);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        boolean b16 = defaultedMap7.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation19.addChromosome(chromosome24);
        double d26 = elitisticListPopulation19.getElitismRate();
        boolean b27 = defaultedMap7.containsValue((java.lang.Object) d26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) 100.0d);
        int i32 = defaultedMap29.size();
        java.lang.String str33 = defaultedMap29.toString();
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap29.containsValue(obj34);
        java.util.Set set36 = defaultedMap29.keySet();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap29);
        defaultedMap29.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome42 = null;
        elitisticListPopulation41.addChromosome(chromosome42);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome44 = elitisticListPopulation41.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome45 = elitisticListPopulation41.iterator();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) iterator_chromosome45);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(d26 == 1.0d);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(spliterator_chromosome44);
        org.junit.Assert.assertNotNull(iterator_chromosome45);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Set set18 = defaultedMap17.entrySet();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) 100.0d);
        int i26 = defaultedMap23.size();
        boolean b28 = defaultedMap23.containsKey((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap23.isEmpty();
        java.util.Set set30 = defaultedMap23.keySet();
        boolean b31 = defaultedMap17.containsValue((java.lang.Object) defaultedMap23);
        java.util.Set set32 = defaultedMap17.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation35.addChromosome(chromosome36);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation40.setElitismRate((double) (byte) 0);
        elitisticListPopulation40.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation40.getChromosomes();
        elitisticListPopulation35.setChromosomes(list_chromosome45);
        boolean b47 = defaultedMap17.equals((java.lang.Object) elitisticListPopulation35);
        boolean b48 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation35);
        java.util.List<math.genetics.Chromosome> list_chromosome49 = elitisticListPopulation35.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation52.setElitismRate((double) (byte) 0);
        elitisticListPopulation52.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome57 = elitisticListPopulation52.getChromosomes();
        math.genetics.Chromosome chromosome58 = null;
        elitisticListPopulation52.addChromosome(chromosome58);
        int i60 = elitisticListPopulation52.getPopulationSize();
        math.genetics.Chromosome chromosome61 = null;
        elitisticListPopulation52.addChromosome(chromosome61);
        elitisticListPopulation52.setPopulationLimit((int) ' ');
        math.genetics.ElitisticListPopulation elitisticListPopulation67 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array68 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome69 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b70 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome69, chromosome_array68);
        elitisticListPopulation67.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome69);
        math.genetics.ElitisticListPopulation elitisticListPopulation74 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome75 = null;
        elitisticListPopulation74.addChromosome(chromosome75);
        math.genetics.ElitisticListPopulation elitisticListPopulation79 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation79.setElitismRate((double) (byte) 0);
        elitisticListPopulation79.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome84 = elitisticListPopulation79.getChromosomes();
        elitisticListPopulation74.setChromosomes(list_chromosome84);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome86 = list_chromosome84.spliterator();
        elitisticListPopulation67.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome84);
        elitisticListPopulation52.setChromosomes(list_chromosome84);
        elitisticListPopulation35.setChromosomes(list_chromosome84);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(list_chromosome45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(list_chromosome49);
        org.junit.Assert.assertNotNull(list_chromosome57);
        org.junit.Assert.assertTrue(i60 == 1);
        org.junit.Assert.assertNotNull(chromosome_array68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(list_chromosome84);
        org.junit.Assert.assertNotNull(spliterator_chromosome86);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0d);
        int i11 = defaultedMap8.size();
        boolean b13 = defaultedMap8.containsKey((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap8.isEmpty();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap16);
        java.util.Collection collection18 = defaultedMap8.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection18);
        elitisticListPopulation2.setElitismRate(0.0d);
        math.genetics.Population population22 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(population22);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit(10);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation16.setElitismRate((double) (byte) 0);
        elitisticListPopulation16.setElitismRate((double) 0.0f);
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation16.addChromosome(chromosome21);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation25.setElitismRate((double) (byte) 0);
        elitisticListPopulation25.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation25.getChromosomes();
        math.genetics.Chromosome chromosome31 = null;
        elitisticListPopulation25.addChromosome(chromosome31);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37);
        elitisticListPopulation25.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        elitisticListPopulation16.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome42 = arraylist_chromosome37.spliterator();
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        int i44 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation(list_chromosome45, 2, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome42);
        org.junit.Assert.assertTrue(i44 == 10);
        org.junit.Assert.assertNotNull(list_chromosome45);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.util.Set set4 = defaultedMap3.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0d);
        int i12 = defaultedMap9.size();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap9.isEmpty();
        java.util.Set set16 = defaultedMap9.keySet();
        boolean b17 = defaultedMap3.containsValue((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Set set21 = defaultedMap20.entrySet();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 100.0d);
        int i29 = defaultedMap26.size();
        boolean b31 = defaultedMap26.containsKey((java.lang.Object) 10.0d);
        boolean b32 = defaultedMap26.isEmpty();
        java.util.Set set33 = defaultedMap26.keySet();
        boolean b34 = defaultedMap20.containsValue((java.lang.Object) defaultedMap26);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 100.0d);
        boolean b40 = defaultedMap36.containsValue((java.lang.Object) (-1.0d));
        int i41 = defaultedMap36.size();
        boolean b42 = defaultedMap20.containsValue((java.lang.Object) defaultedMap36);
        defaultedMap1.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        java.lang.Object obj46 = defaultedMap1.remove(obj44);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0d);
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) (-1.0d));
        int i22 = defaultedMap17.size();
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) defaultedMap17);
        java.lang.String str24 = defaultedMap17.toString();
        collections.Transformer transformer25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, transformer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit(10);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation16.setElitismRate((double) (byte) 0);
        elitisticListPopulation16.setElitismRate((double) 0.0f);
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation16.addChromosome(chromosome21);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation25.setElitismRate((double) (byte) 0);
        elitisticListPopulation25.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation25.getChromosomes();
        math.genetics.Chromosome chromosome31 = null;
        elitisticListPopulation25.addChromosome(chromosome31);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37);
        elitisticListPopulation25.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        elitisticListPopulation16.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome42 = arraylist_chromosome37.spliterator();
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        int i44 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str45 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome42);
        org.junit.Assert.assertTrue(i44 == 10);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "[]" + "'", str45.equals("[]"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit(10);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation20.addChromosome(chromosome21);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation25.setElitismRate((double) (byte) 0);
        elitisticListPopulation25.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation20.setChromosomes(list_chromosome30);
        elitisticListPopulation2.setChromosomes(list_chromosome30);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNotNull(list_chromosome33);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.String str7 = defaultedMap1.toString();
        java.util.Set set8 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        java.lang.String str4 = defaultedMap1.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation7.addChromosome(chromosome8);
        java.lang.String str10 = elitisticListPopulation7.toString();
        boolean b11 = defaultedMap1.equals((java.lang.Object) str10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[null]" + "'", str10.equals("[null]"));
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        double d5 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) arraylist_chromosome10);
        java.util.Set set15 = defaultedMap14.entrySet();
        org.junit.Assert.assertTrue(d5 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        int i7 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        math.genetics.Population population10 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertNotNull(population10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        int i6 = defaultedMap1.size();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0d);
        int i11 = defaultedMap8.size();
        boolean b13 = defaultedMap8.containsKey((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap8.isEmpty();
        java.util.Collection collection15 = defaultedMap8.values();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (short) 0);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) map17);
        boolean b19 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation22.setElitismRate((double) (byte) 0);
        elitisticListPopulation22.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation22.getChromosomes();
        math.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation22.addChromosome(chromosome28);
        int i30 = elitisticListPopulation22.getPopulationSize();
        java.lang.String str31 = elitisticListPopulation22.toString();
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation22);
        try {
            elitisticListPopulation22.setPopulationLimit((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[null]" + "'", str31.equals("[null]"));
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit(10);
        double d14 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(10, (double) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation20.setElitismRate((double) (byte) 0);
        elitisticListPopulation20.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation20.getChromosomes();
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation20.addChromosome(chromosome26);
        int i28 = elitisticListPopulation20.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        elitisticListPopulation31.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i40 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i40 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0d);
        int i11 = defaultedMap8.size();
        boolean b13 = defaultedMap8.containsKey((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap8.isEmpty();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap16);
        java.util.Collection collection18 = defaultedMap8.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection18);
        java.lang.String str20 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation6.addChromosome(chromosome7);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation6.spliterator();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation6);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation18.setElitismRate((double) (byte) 0);
        elitisticListPopulation18.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation13.setChromosomes(list_chromosome23);
        elitisticListPopulation6.setChromosomes(list_chromosome23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(list_chromosome23, 100, (double) (byte) 0);
        java.lang.String str29 = elitisticListPopulation28.toString();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]" + "'", str29.equals("[]"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection16 = defaultedMap1.values();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) 100.0d);
        int i21 = defaultedMap18.size();
        boolean b23 = defaultedMap18.containsKey((java.lang.Object) 10.0d);
        boolean b24 = defaultedMap18.isEmpty();
        java.util.Set set25 = defaultedMap18.keySet();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 100.0d);
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) (-1.0d));
        boolean b32 = defaultedMap18.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection33 = defaultedMap18.values();
        boolean b34 = defaultedMap1.containsKey((java.lang.Object) collection33);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) (byte) 100, (java.lang.Object) '4');
        defaultedMap36.clear();
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        java.util.Set set43 = defaultedMap42.entrySet();
        boolean b44 = defaultedMap42.isEmpty();
        java.lang.Object obj46 = defaultedMap42.get((java.lang.Object) '#');
        java.lang.Object obj47 = defaultedMap1.put((java.lang.Object) defaultedMap36, (java.lang.Object) defaultedMap42);
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) 100.0d);
        int i52 = defaultedMap49.size();
        boolean b54 = defaultedMap49.containsKey((java.lang.Object) 10.0d);
        boolean b55 = defaultedMap49.isEmpty();
        java.util.Set set56 = defaultedMap49.keySet();
        java.lang.String str57 = defaultedMap49.toString();
        java.util.Set set58 = defaultedMap49.entrySet();
        java.util.Set set59 = defaultedMap49.entrySet();
        boolean b60 = defaultedMap42.equals((java.lang.Object) defaultedMap49);
        collections.Transformer transformer61 = null;
        try {
            java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, transformer61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue(b60 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation8.setElitismRate((double) (byte) 0);
        elitisticListPopulation8.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation8.getChromosomes();
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation8.addChromosome(chromosome14);
        int i16 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Population population17 = elitisticListPopulation8.nextGeneration();
        elitisticListPopulation8.setPopulationLimit(10);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation22.setElitismRate((double) (byte) 0);
        elitisticListPopulation22.setElitismRate((double) 0.0f);
        math.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation22.addChromosome(chromosome27);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation31.setElitismRate((double) (byte) 0);
        elitisticListPopulation31.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation31.getChromosomes();
        math.genetics.Chromosome chromosome37 = null;
        elitisticListPopulation31.addChromosome(chromosome37);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        elitisticListPopulation41.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43);
        elitisticListPopulation31.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome43);
        elitisticListPopulation22.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome43);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome48 = arraylist_chromosome43.spliterator();
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome43);
        int i50 = elitisticListPopulation8.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome51 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome51);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation(list_chromosome51, (int) (short) -1, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNotNull(population17);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome48);
        org.junit.Assert.assertTrue(i50 == 10);
        org.junit.Assert.assertNotNull(list_chromosome51);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        double d9 = elitisticListPopulation2.getElitismRate();
        java.lang.String str10 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[null]" + "'", str10.equals("[null]"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation20.setElitismRate((double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation20.getChromosomes();
        math.genetics.Population population24 = elitisticListPopulation20.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation27.setElitismRate((double) (byte) 0);
        elitisticListPopulation27.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation27.getChromosomes();
        math.genetics.Chromosome chromosome33 = null;
        elitisticListPopulation27.addChromosome(chromosome33);
        int i35 = elitisticListPopulation27.getPopulationSize();
        math.genetics.Population population36 = elitisticListPopulation27.nextGeneration();
        elitisticListPopulation27.setPopulationLimit(10);
        double d39 = elitisticListPopulation27.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome40 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation20.setChromosomes(list_chromosome40);
        elitisticListPopulation2.setChromosomes(list_chromosome40);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertNotNull(population36);
        org.junit.Assert.assertTrue(d39 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome40);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, 1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) (byte) 100, (java.lang.Object) '4');
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.util.Set set10 = defaultedMap9.entrySet();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) 100.0d);
        int i18 = defaultedMap15.size();
        boolean b20 = defaultedMap15.containsKey((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap15.isEmpty();
        java.util.Set set22 = defaultedMap15.keySet();
        boolean b23 = defaultedMap9.containsValue((java.lang.Object) defaultedMap15);
        boolean b24 = defaultedMap4.containsKey((java.lang.Object) defaultedMap15);
        java.util.Collection collection25 = defaultedMap4.values();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 100.0d);
        int i30 = defaultedMap27.size();
        boolean b32 = defaultedMap27.containsKey((java.lang.Object) 10.0d);
        boolean b33 = defaultedMap27.isEmpty();
        java.util.Set set34 = defaultedMap27.keySet();
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 100.0d);
        boolean b40 = defaultedMap36.containsValue((java.lang.Object) (-1.0d));
        boolean b41 = defaultedMap27.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate42, predicate43);
        defaultedMap4.putAll(map44);
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) map44);
        java.util.Set set47 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set47);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation6.setElitismRate((double) (byte) 0);
        elitisticListPopulation6.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation6.getChromosomes();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation6.addChromosome(chromosome12);
        int i14 = elitisticListPopulation6.getPopulationSize();
        java.lang.String str15 = elitisticListPopulation6.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation6.iterator();
        boolean b17 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation6);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome18 = elitisticListPopulation6.spliterator();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[null]" + "'", str15.equals("[null]"));
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome18);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) '4');
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Set set7 = defaultedMap6.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate8, predicate9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 100.0d);
        int i15 = defaultedMap12.size();
        boolean b17 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap12.isEmpty();
        java.util.Set set19 = defaultedMap12.keySet();
        boolean b20 = defaultedMap6.containsValue((java.lang.Object) defaultedMap12);
        boolean b21 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.util.Set set24 = defaultedMap23.entrySet();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate25, predicate26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) 100.0d);
        int i32 = defaultedMap29.size();
        boolean b34 = defaultedMap29.containsKey((java.lang.Object) 10.0d);
        boolean b35 = defaultedMap29.isEmpty();
        java.util.Set set36 = defaultedMap29.keySet();
        boolean b37 = defaultedMap23.containsValue((java.lang.Object) defaultedMap29);
        java.util.Set set38 = defaultedMap23.entrySet();
        defaultedMap23.clear();
        int i40 = defaultedMap23.size();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) i40);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.util.Set set16 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation24.setElitismRate((double) (byte) 0);
        elitisticListPopulation24.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation19.setChromosomes(list_chromosome29);
        boolean b31 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation19);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation34.setElitismRate((double) (byte) 0);
        elitisticListPopulation34.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome39);
        try {
            math.genetics.Chromosome chromosome41 = elitisticListPopulation19.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(list_chromosome29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(list_chromosome39);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        int i11 = elitisticListPopulation2.getPopulationSize();
        try {
            math.genetics.Chromosome chromosome12 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Set set7 = defaultedMap6.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate8, predicate9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 100.0d);
        int i15 = defaultedMap12.size();
        boolean b17 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap12.isEmpty();
        java.util.Set set19 = defaultedMap12.keySet();
        boolean b20 = defaultedMap6.containsValue((java.lang.Object) defaultedMap12);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) 100.0d);
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (-1.0d));
        int i27 = defaultedMap22.size();
        boolean b28 = defaultedMap6.containsValue((java.lang.Object) defaultedMap22);
        java.util.Set set29 = defaultedMap6.keySet();
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.util.Set set32 = defaultedMap31.entrySet();
        boolean b33 = defaultedMap6.containsKey((java.lang.Object) defaultedMap31);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 100.0d);
        int i39 = defaultedMap36.size();
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.util.Set set42 = defaultedMap41.entrySet();
        java.util.Set set43 = defaultedMap41.keySet();
        boolean b44 = defaultedMap36.containsKey((java.lang.Object) defaultedMap41);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        java.util.Set set47 = defaultedMap46.entrySet();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate48, predicate49);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) 100.0d);
        int i55 = defaultedMap52.size();
        boolean b57 = defaultedMap52.containsKey((java.lang.Object) 10.0d);
        boolean b58 = defaultedMap52.isEmpty();
        java.util.Set set59 = defaultedMap52.keySet();
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        boolean b63 = defaultedMap61.containsKey((java.lang.Object) 100.0d);
        boolean b65 = defaultedMap61.containsValue((java.lang.Object) (-1.0d));
        boolean b66 = defaultedMap52.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate67, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate48, predicate67);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) predicate67);
        java.lang.String str72 = defaultedMap71.toString();
        boolean b73 = defaultedMap1.equals((java.lang.Object) defaultedMap71);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertTrue(b73 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        double d8 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(d8 == 0.0d);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation6.addChromosome(chromosome7);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation6.spliterator();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation6);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation18.setElitismRate((double) (byte) 0);
        elitisticListPopulation18.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation13.setChromosomes(list_chromosome23);
        elitisticListPopulation6.setChromosomes(list_chromosome23);
        math.genetics.Population population26 = elitisticListPopulation6.nextGeneration();
        java.lang.String str27 = elitisticListPopulation6.toString();
        try {
            elitisticListPopulation6.setElitismRate((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertNotNull(population26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]" + "'", str27.equals("[]"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Set set18 = defaultedMap17.entrySet();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) 100.0d);
        int i26 = defaultedMap23.size();
        boolean b28 = defaultedMap23.containsKey((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap23.isEmpty();
        java.util.Set set30 = defaultedMap23.keySet();
        boolean b31 = defaultedMap17.containsValue((java.lang.Object) defaultedMap23);
        java.util.Set set32 = defaultedMap17.entrySet();
        defaultedMap17.clear();
        int i34 = defaultedMap17.size();
        boolean b35 = defaultedMap1.equals((java.lang.Object) i34);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Set set6 = defaultedMap5.entrySet();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0d);
        int i14 = defaultedMap11.size();
        boolean b16 = defaultedMap11.containsKey((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap11.isEmpty();
        java.util.Set set18 = defaultedMap11.keySet();
        boolean b19 = defaultedMap5.containsValue((java.lang.Object) defaultedMap11);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) 100.0d);
        int i24 = defaultedMap21.size();
        boolean b26 = defaultedMap21.containsKey((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap21.isEmpty();
        java.util.Set set28 = defaultedMap21.keySet();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) 100.0d);
        boolean b34 = defaultedMap30.containsValue((java.lang.Object) (-1.0d));
        boolean b35 = defaultedMap21.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate39);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        boolean b44 = defaultedMap42.containsKey((java.lang.Object) 100.0d);
        java.lang.Object obj45 = defaultedMap5.get((java.lang.Object) defaultedMap42);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        boolean b49 = defaultedMap47.containsKey((java.lang.Object) 100.0d);
        boolean b51 = defaultedMap47.containsValue((java.lang.Object) (-1.0d));
        defaultedMap47.clear();
        defaultedMap47.clear();
        java.util.Set set54 = defaultedMap47.keySet();
        java.lang.Object obj55 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) defaultedMap47);
        java.lang.String str56 = defaultedMap5.toString();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) '4');
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Set set7 = defaultedMap6.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate8, predicate9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 100.0d);
        int i15 = defaultedMap12.size();
        boolean b17 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap12.isEmpty();
        java.util.Set set19 = defaultedMap12.keySet();
        boolean b20 = defaultedMap6.containsValue((java.lang.Object) defaultedMap12);
        boolean b21 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        java.util.Collection collection22 = defaultedMap1.values();
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 100.0d);
        int i27 = defaultedMap24.size();
        boolean b29 = defaultedMap24.containsKey((java.lang.Object) 10.0d);
        boolean b30 = defaultedMap24.isEmpty();
        java.util.Set set31 = defaultedMap24.keySet();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) 100.0d);
        boolean b37 = defaultedMap33.containsValue((java.lang.Object) (-1.0d));
        boolean b38 = defaultedMap24.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate39, predicate40);
        defaultedMap1.putAll(map41);
        java.util.Collection collection43 = defaultedMap1.values();
        java.util.Set set44 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation14.setElitismRate((double) (byte) 0);
        elitisticListPopulation14.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation9.setChromosomes(list_chromosome19);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = list_chromosome19.spliterator();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome19);
        int i23 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(10, (double) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation29.setElitismRate((double) (byte) 0);
        elitisticListPopulation29.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation29.getChromosomes();
        math.genetics.Chromosome chromosome35 = null;
        elitisticListPopulation29.addChromosome(chromosome35);
        int i37 = elitisticListPopulation29.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        elitisticListPopulation40.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42);
        elitisticListPopulation29.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42);
        elitisticListPopulation26.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42);
        java.util.List<math.genetics.Chromosome> list_chromosome47 = elitisticListPopulation26.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome47);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertTrue(i23 == 100);
        org.junit.Assert.assertNotNull(list_chromosome34);
        org.junit.Assert.assertTrue(i37 == 1);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(list_chromosome47);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 100.0d);
        int i6 = defaultedMap3.size();
        boolean b8 = defaultedMap3.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0d);
        int i13 = defaultedMap10.size();
        boolean b15 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap10.isEmpty();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) defaultedMap18);
        defaultedMap3.putAll((java.util.Map) defaultedMap10);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        int i23 = defaultedMap22.size();
        boolean b24 = defaultedMap22.isEmpty();
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) b24);
        java.util.Set set26 = defaultedMap3.entrySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        math.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation9.setElitismRate((double) (byte) 0);
        elitisticListPopulation9.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation9.getChromosomes();
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation9.addChromosome(chromosome15);
        int i17 = elitisticListPopulation9.getPopulationSize();
        math.genetics.Population population18 = elitisticListPopulation9.nextGeneration();
        elitisticListPopulation9.setPopulationLimit(10);
        double d21 = elitisticListPopulation9.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome22);
        elitisticListPopulation2.setPopulationLimit((int) '4');
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertTrue(d21 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome22);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.util.Set set4 = defaultedMap3.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0d);
        int i12 = defaultedMap9.size();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap9.isEmpty();
        java.util.Set set16 = defaultedMap9.keySet();
        boolean b17 = defaultedMap3.containsValue((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Set set21 = defaultedMap20.entrySet();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 100.0d);
        int i29 = defaultedMap26.size();
        boolean b31 = defaultedMap26.containsKey((java.lang.Object) 10.0d);
        boolean b32 = defaultedMap26.isEmpty();
        java.util.Set set33 = defaultedMap26.keySet();
        boolean b34 = defaultedMap20.containsValue((java.lang.Object) defaultedMap26);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 100.0d);
        boolean b40 = defaultedMap36.containsValue((java.lang.Object) (-1.0d));
        int i41 = defaultedMap36.size();
        boolean b42 = defaultedMap20.containsValue((java.lang.Object) defaultedMap36);
        defaultedMap1.putAll((java.util.Map) defaultedMap36);
        boolean b44 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0d);
        int i11 = defaultedMap8.size();
        boolean b13 = defaultedMap8.containsKey((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap8.isEmpty();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        boolean b19 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0d);
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) (-1.0d));
        int i22 = defaultedMap17.size();
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) defaultedMap17);
        java.util.Set set24 = defaultedMap1.keySet();
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.util.Set set27 = defaultedMap26.entrySet();
        boolean b28 = defaultedMap1.containsKey((java.lang.Object) defaultedMap26);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) 100.0d);
        boolean b33 = defaultedMap30.isEmpty();
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        java.lang.String str35 = defaultedMap30.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[null]" + "'", str11.equals("[null]"));
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation7.setElitismRate((double) (byte) 0);
        elitisticListPopulation7.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome12);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(list_chromosome12, (int) (byte) 10, (double) (byte) 0);
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation16.addChromosome(chromosome17);
        java.lang.String str19 = elitisticListPopulation16.toString();
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[null]" + "'", str19.equals("[null]"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0d);
        int i11 = defaultedMap8.size();
        java.lang.String str12 = defaultedMap8.toString();
        java.lang.Object obj13 = null;
        boolean b14 = defaultedMap8.containsValue(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 100.0d);
        int i19 = defaultedMap16.size();
        boolean b21 = defaultedMap16.containsKey((java.lang.Object) 10.0d);
        boolean b22 = defaultedMap16.isEmpty();
        java.util.Set set23 = defaultedMap16.keySet();
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 100.0d);
        boolean b29 = defaultedMap25.containsValue((java.lang.Object) (-1.0d));
        boolean b30 = defaultedMap16.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate31, predicate32);
        boolean b34 = defaultedMap8.equals((java.lang.Object) map33);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 100.0d);
        int i39 = defaultedMap36.size();
        java.lang.String str40 = defaultedMap36.toString();
        java.lang.Object obj41 = null;
        boolean b42 = defaultedMap36.containsValue(obj41);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) 100.0d);
        int i47 = defaultedMap44.size();
        boolean b49 = defaultedMap44.containsKey((java.lang.Object) 10.0d);
        boolean b50 = defaultedMap44.isEmpty();
        java.util.Set set51 = defaultedMap44.keySet();
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        boolean b55 = defaultedMap53.containsKey((java.lang.Object) 100.0d);
        boolean b57 = defaultedMap53.containsValue((java.lang.Object) (-1.0d));
        boolean b58 = defaultedMap44.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate59, predicate60);
        boolean b62 = defaultedMap36.equals((java.lang.Object) map61);
        boolean b63 = defaultedMap8.equals((java.lang.Object) map61);
        math.genetics.ElitisticListPopulation elitisticListPopulation66 = new math.genetics.ElitisticListPopulation(10, (double) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation69 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation69.setElitismRate((double) (byte) 0);
        elitisticListPopulation69.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome74 = elitisticListPopulation69.getChromosomes();
        math.genetics.Chromosome chromosome75 = null;
        elitisticListPopulation69.addChromosome(chromosome75);
        int i77 = elitisticListPopulation69.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation80 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array81 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome82 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b83 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome82, chromosome_array81);
        elitisticListPopulation80.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome82);
        elitisticListPopulation69.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome82);
        elitisticListPopulation66.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome82);
        java.util.List<math.genetics.Chromosome> list_chromosome87 = elitisticListPopulation66.getChromosomes();
        java.lang.String str88 = elitisticListPopulation66.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome89 = elitisticListPopulation66.spliterator();
        java.lang.Object obj90 = defaultedMap1.put((java.lang.Object) map61, (java.lang.Object) elitisticListPopulation66);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(list_chromosome74);
        org.junit.Assert.assertTrue(i77 == 1);
        org.junit.Assert.assertNotNull(chromosome_array81);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(list_chromosome87);
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "[]" + "'", str88.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome89);
        org.junit.Assert.assertNull(obj90);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation7.setElitismRate((double) (byte) 0);
        elitisticListPopulation7.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome12);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(list_chromosome12, (int) (byte) 10, (double) (byte) 0);
        double d17 = elitisticListPopulation16.getElitismRate();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation16.addChromosome(chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation16.getChromosomes();
        try {
            math.genetics.Chromosome chromosome21 = elitisticListPopulation16.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(d17 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome20);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        int i11 = elitisticListPopulation2.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Population population20 = elitisticListPopulation2.nextGeneration();
        math.genetics.Population population21 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(population20);
        org.junit.Assert.assertNotNull(population21);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation9.setElitismRate((double) (byte) 0);
        double d12 = elitisticListPopulation9.getElitismRate();
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation9);
        java.util.Set set14 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation17.setElitismRate((double) (byte) 0);
        elitisticListPopulation17.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation17.getChromosomes();
        math.genetics.Chromosome chromosome23 = null;
        elitisticListPopulation17.addChromosome(chromosome23);
        int i25 = elitisticListPopulation17.getPopulationSize();
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation17.addChromosome(chromosome26);
        int i28 = elitisticListPopulation17.getPopulationLimit();
        java.lang.Object obj29 = defaultedMap1.remove((java.lang.Object) i28);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(list_chromosome22);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue(i28 == 100);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit(10);
        double d14 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(10, (double) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation20.setElitismRate((double) (byte) 0);
        elitisticListPopulation20.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation20.getChromosomes();
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation20.addChromosome(chromosome26);
        int i28 = elitisticListPopulation20.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        elitisticListPopulation31.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        java.lang.String str40 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[]" + "'", str40.equals("[]"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation2.addChromosome(chromosome12);
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(list_chromosome14);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit(10);
        double d14 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation2.getChromosomes();
        math.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(population16);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.util.Map map0 = null;
        math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation3.setElitismRate((double) (byte) 0);
        double d6 = elitisticListPopulation3.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation3.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) arraylist_chromosome11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.lang.String str5 = elitisticListPopulation2.toString();
        math.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        int i7 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]" + "'", str5.equals("[null]"));
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertTrue(i7 == 100);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        double d19 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(d19 == 0.0d);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation11.setElitismRate((double) (byte) 0);
        elitisticListPopulation11.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation11.getChromosomes();
        math.genetics.Population population17 = elitisticListPopulation11.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation11.iterator();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) elitisticListPopulation11);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertNotNull(population17);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.lang.String str5 = elitisticListPopulation2.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]" + "'", str5.equals("[null]"));
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap1.containsValue(obj8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0d);
        int i14 = defaultedMap11.size();
        boolean b16 = defaultedMap11.containsKey((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap11.isEmpty();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap19);
        java.util.Collection collection21 = defaultedMap11.values();
        java.util.Set set22 = defaultedMap11.entrySet();
        boolean b23 = defaultedMap1.containsKey((java.lang.Object) set22);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, 0.0d);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation9.setElitismRate((double) (byte) 0);
        double d12 = elitisticListPopulation9.getElitismRate();
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation9);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) 100.0d);
        int i18 = defaultedMap15.size();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Set set21 = defaultedMap20.entrySet();
        java.util.Set set22 = defaultedMap20.keySet();
        boolean b23 = defaultedMap15.containsKey((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.util.Set set26 = defaultedMap25.entrySet();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate27, predicate28);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0d);
        int i34 = defaultedMap31.size();
        boolean b36 = defaultedMap31.containsKey((java.lang.Object) 10.0d);
        boolean b37 = defaultedMap31.isEmpty();
        java.util.Set set38 = defaultedMap31.keySet();
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) 100.0d);
        boolean b44 = defaultedMap40.containsValue((java.lang.Object) (-1.0d));
        boolean b45 = defaultedMap31.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate46, predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate27, predicate46);
        java.lang.Object obj50 = defaultedMap1.get((java.lang.Object) map49);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        java.util.Set set53 = defaultedMap52.entrySet();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate54, predicate55);
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) 100.0d);
        int i61 = defaultedMap58.size();
        boolean b63 = defaultedMap58.containsKey((java.lang.Object) 10.0d);
        boolean b64 = defaultedMap58.isEmpty();
        java.util.Set set65 = defaultedMap58.keySet();
        boolean b66 = defaultedMap52.containsValue((java.lang.Object) defaultedMap58);
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        boolean b70 = defaultedMap68.containsKey((java.lang.Object) 100.0d);
        int i71 = defaultedMap68.size();
        boolean b73 = defaultedMap68.containsKey((java.lang.Object) 10.0d);
        boolean b74 = defaultedMap68.isEmpty();
        java.util.Set set75 = defaultedMap68.keySet();
        java.lang.Object obj76 = null;
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap(obj76);
        boolean b79 = defaultedMap77.containsKey((java.lang.Object) 100.0d);
        boolean b81 = defaultedMap77.containsValue((java.lang.Object) (-1.0d));
        boolean b82 = defaultedMap68.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate83, predicate84);
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate83, predicate86);
        java.lang.Object obj88 = null;
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap(obj88);
        java.util.Set set90 = defaultedMap89.entrySet();
        collections.Predicate predicate91 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate92 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap89, predicate91, predicate92);
        java.util.Map map94 = collections.map.PredicatedMap.decorate(map49, predicate83, predicate92);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(map94);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation5.setElitismRate((double) (byte) 0);
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation5.addChromosome(chromosome11);
        int i13 = elitisticListPopulation5.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation2.getChromosomes();
        java.lang.String str24 = elitisticListPopulation2.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome25 = elitisticListPopulation2.spliterator();
        double d26 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome27 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome25);
        org.junit.Assert.assertTrue(d26 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome27);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation4.setElitismRate((double) (byte) 0);
        elitisticListPopulation4.setElitismRate((double) 0.0f);
        int i9 = elitisticListPopulation4.getPopulationSize();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) i9, (java.lang.Object) defaultedMap11);
        java.lang.String str13 = defaultedMap1.toString();
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap1.containsKey(obj14);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{0={}}" + "'", str13.equals("{0={}}"));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) 0L);
        try {
            elitisticListPopulation2.setElitismRate((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate17);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Set set21 = defaultedMap20.entrySet();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 100.0d);
        int i29 = defaultedMap26.size();
        boolean b31 = defaultedMap26.containsKey((java.lang.Object) 10.0d);
        boolean b32 = defaultedMap26.isEmpty();
        java.util.Set set33 = defaultedMap26.keySet();
        boolean b34 = defaultedMap20.containsValue((java.lang.Object) defaultedMap26);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 100.0d);
        boolean b40 = defaultedMap36.containsValue((java.lang.Object) (-1.0d));
        int i41 = defaultedMap36.size();
        boolean b42 = defaultedMap20.containsValue((java.lang.Object) defaultedMap36);
        java.util.Set set43 = defaultedMap20.keySet();
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        java.util.Set set46 = defaultedMap45.entrySet();
        boolean b47 = defaultedMap20.containsKey((java.lang.Object) defaultedMap45);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 100.0d);
        boolean b54 = defaultedMap50.containsValue((java.lang.Object) (-1.0d));
        defaultedMap50.clear();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap50);
        boolean b57 = defaultedMap45.containsValue((java.lang.Object) defaultedMap56);
        int i58 = defaultedMap56.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i58 == 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        double d7 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(d7 == 0.0d);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 100.0d);
        boolean b20 = defaultedMap16.containsValue((java.lang.Object) (-1.0d));
        boolean b21 = defaultedMap7.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) map24);
        boolean b26 = defaultedMap1.equals((java.lang.Object) map24);
        collections.Factory factory27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate(map24, factory27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        int i6 = defaultedMap1.size();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0d);
        int i11 = defaultedMap8.size();
        boolean b13 = defaultedMap8.containsKey((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap8.isEmpty();
        java.util.Collection collection15 = defaultedMap8.values();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (short) 0);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) map17);
        boolean b19 = defaultedMap1.isEmpty();
        java.lang.String str20 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.lang.String str18 = elitisticListPopulation2.toString();
        math.genetics.Population population19 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        int i6 = defaultedMap1.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation14.setElitismRate((double) (byte) 0);
        elitisticListPopulation14.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation9.setChromosomes(list_chromosome19);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = list_chromosome19.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation(list_chromosome19, (int) (byte) 100, 1.0d);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.util.Set set26 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        int i11 = elitisticListPopulation2.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Population population20 = elitisticListPopulation2.nextGeneration();
        try {
            math.genetics.Chromosome chromosome21 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(population20);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation11.setElitismRate((double) (byte) 0);
        math.genetics.Population population14 = elitisticListPopulation11.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation17.setElitismRate((double) (byte) 0);
        elitisticListPopulation17.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation17.getChromosomes();
        math.genetics.Chromosome chromosome23 = null;
        elitisticListPopulation17.addChromosome(chromosome23);
        int i25 = elitisticListPopulation17.getPopulationSize();
        math.genetics.Population population26 = elitisticListPopulation17.nextGeneration();
        elitisticListPopulation17.setPopulationLimit(10);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation31.setElitismRate((double) (byte) 0);
        elitisticListPopulation31.setElitismRate((double) 0.0f);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation31.addChromosome(chromosome36);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation40.setElitismRate((double) (byte) 0);
        elitisticListPopulation40.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation40.getChromosomes();
        math.genetics.Chromosome chromosome46 = null;
        elitisticListPopulation40.addChromosome(chromosome46);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array51 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome52 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b53 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52, chromosome_array51);
        elitisticListPopulation50.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52);
        elitisticListPopulation40.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome52);
        elitisticListPopulation31.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome52);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome57 = arraylist_chromosome52.spliterator();
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome52);
        int i59 = elitisticListPopulation17.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome60 = elitisticListPopulation17.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome60);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertNotNull(list_chromosome22);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertNotNull(population26);
        org.junit.Assert.assertNotNull(list_chromosome45);
        org.junit.Assert.assertNotNull(chromosome_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome57);
        org.junit.Assert.assertTrue(i59 == 10);
        org.junit.Assert.assertNotNull(list_chromosome60);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.containsValue(obj6);
        java.util.Set set8 = defaultedMap1.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation11.setElitismRate((double) (byte) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation11.getChromosomes();
        elitisticListPopulation11.setElitismRate((double) (short) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation19.setElitismRate((double) (byte) 0);
        elitisticListPopulation19.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation19.getChromosomes();
        math.genetics.Population population25 = elitisticListPopulation19.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome26 = elitisticListPopulation19.iterator();
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) elitisticListPopulation11, (java.lang.Object) elitisticListPopulation19);
        try {
            math.genetics.Chromosome chromosome28 = elitisticListPopulation11.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(list_chromosome24);
        org.junit.Assert.assertNotNull(population25);
        org.junit.Assert.assertNotNull(iterator_chromosome26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i8 = defaultedMap7.size();
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap7.containsValue(obj9);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation5.setElitismRate((double) (byte) 0);
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation5.addChromosome(chromosome11);
        int i13 = elitisticListPopulation5.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation33.addChromosome(chromosome34);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation38.setElitismRate((double) (byte) 0);
        elitisticListPopulation38.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation33.setChromosomes(list_chromosome43);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome45 = list_chromosome43.spliterator();
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome43);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome43);
        math.genetics.Population population48 = elitisticListPopulation2.nextGeneration();
        try {
            math.genetics.Chromosome chromosome49 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(list_chromosome43);
        org.junit.Assert.assertNotNull(spliterator_chromosome45);
        org.junit.Assert.assertNotNull(population48);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0d);
        int i11 = defaultedMap8.size();
        boolean b13 = defaultedMap8.containsKey((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap8.isEmpty();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap16);
        java.util.Collection collection18 = defaultedMap8.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection18);
        elitisticListPopulation2.setElitismRate(0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome22 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(spliterator_chromosome22);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        double d5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        elitisticListPopulation2.setElitismRate((double) (short) 1);
        org.junit.Assert.assertTrue(d5 == 0.0d);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        java.util.Collection collection5 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation8.setElitismRate((double) (byte) 0);
        elitisticListPopulation8.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation8.getChromosomes();
        math.genetics.Population population14 = elitisticListPopulation8.nextGeneration();
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation8.addChromosome(chromosome15);
        elitisticListPopulation8.setElitismRate((double) (short) 0);
        boolean b19 = defaultedMap1.equals((java.lang.Object) (short) 0);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) 100.0d);
        int i24 = defaultedMap21.size();
        boolean b26 = defaultedMap21.containsKey((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap21.isEmpty();
        java.util.Set set28 = defaultedMap21.keySet();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) 100.0d);
        boolean b34 = defaultedMap30.containsValue((java.lang.Object) (-1.0d));
        boolean b35 = defaultedMap21.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate36, predicate37);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) 100.0d);
        int i43 = defaultedMap40.size();
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        java.util.Set set46 = defaultedMap45.entrySet();
        java.util.Set set47 = defaultedMap45.keySet();
        boolean b48 = defaultedMap40.containsKey((java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        java.util.Set set51 = defaultedMap50.entrySet();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate52, predicate53);
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        boolean b58 = defaultedMap56.containsKey((java.lang.Object) 100.0d);
        int i59 = defaultedMap56.size();
        boolean b61 = defaultedMap56.containsKey((java.lang.Object) 10.0d);
        boolean b62 = defaultedMap56.isEmpty();
        java.util.Set set63 = defaultedMap56.keySet();
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        boolean b67 = defaultedMap65.containsKey((java.lang.Object) 100.0d);
        boolean b69 = defaultedMap65.containsValue((java.lang.Object) (-1.0d));
        boolean b70 = defaultedMap56.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate71, predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate52, predicate71);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate37, predicate52);
        java.util.Set set76 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(set76);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.util.Set set9 = defaultedMap1.keySet();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0d);
        int i14 = defaultedMap11.size();
        boolean b16 = defaultedMap11.containsKey((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap11.isEmpty();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap19);
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation8.setElitismRate((double) (byte) 0);
        elitisticListPopulation8.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation8.getChromosomes();
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation8.addChromosome(chromosome14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        java.lang.String str24 = elitisticListPopulation8.toString();
        math.genetics.Population population25 = elitisticListPopulation8.nextGeneration();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) elitisticListPopulation8);
        int i27 = elitisticListPopulation8.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation30.setElitismRate((double) (byte) 0);
        elitisticListPopulation30.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation30.getChromosomes();
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation30.addChromosome(chromosome36);
        int i38 = elitisticListPopulation30.getPopulationSize();
        math.genetics.Population population39 = elitisticListPopulation30.nextGeneration();
        elitisticListPopulation30.setPopulationLimit(10);
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome49 = null;
        elitisticListPopulation48.addChromosome(chromosome49);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation53.setElitismRate((double) (byte) 0);
        elitisticListPopulation53.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome58 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation48.setChromosomes(list_chromosome58);
        elitisticListPopulation30.setChromosomes(list_chromosome58);
        elitisticListPopulation8.setChromosomes(list_chromosome58);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation(list_chromosome58, (int) (short) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
        org.junit.Assert.assertNotNull(population25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertTrue(i38 == 1);
        org.junit.Assert.assertNotNull(population39);
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(list_chromosome58);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i8 = defaultedMap7.size();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int i10 = elitisticListPopulation2.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) arraylist_chromosome15);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.util.Set set22 = defaultedMap21.entrySet();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate23, predicate24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 100.0d);
        int i30 = defaultedMap27.size();
        boolean b32 = defaultedMap27.containsKey((java.lang.Object) 10.0d);
        boolean b33 = defaultedMap27.isEmpty();
        java.util.Set set34 = defaultedMap27.keySet();
        boolean b35 = defaultedMap21.containsValue((java.lang.Object) defaultedMap27);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) 100.0d);
        int i40 = defaultedMap37.size();
        boolean b42 = defaultedMap37.containsKey((java.lang.Object) 10.0d);
        boolean b43 = defaultedMap37.isEmpty();
        java.util.Set set44 = defaultedMap37.keySet();
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) 100.0d);
        boolean b50 = defaultedMap46.containsValue((java.lang.Object) (-1.0d));
        boolean b51 = defaultedMap37.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate52, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate52, predicate55);
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Object obj58 = defaultedMap21.remove(obj57);
        java.lang.Object obj59 = null;
        java.lang.Object obj61 = defaultedMap21.put(obj59, (java.lang.Object) 1);
        boolean b62 = defaultedMap19.containsKey((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b62 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0d);
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) (-1.0d));
        int i22 = defaultedMap17.size();
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) defaultedMap17);
        java.util.Set set24 = defaultedMap1.keySet();
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 100.0d);
        int i29 = defaultedMap26.size();
        java.lang.String str30 = defaultedMap26.toString();
        java.lang.Object obj31 = null;
        boolean b32 = defaultedMap26.containsValue(obj31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap26);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) 100.0d);
        int i38 = defaultedMap35.size();
        boolean b40 = defaultedMap35.containsKey((java.lang.Object) 10.0d);
        boolean b41 = defaultedMap35.isEmpty();
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.Object obj44 = defaultedMap35.get((java.lang.Object) defaultedMap43);
        java.lang.Object obj45 = defaultedMap26.remove(obj44);
        java.util.Set set46 = defaultedMap26.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        int i4 = defaultedMap1.size();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Set set7 = defaultedMap6.entrySet();
        java.util.Set set8 = defaultedMap6.keySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Set set12 = defaultedMap11.entrySet();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate13, predicate14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0d);
        int i20 = defaultedMap17.size();
        boolean b22 = defaultedMap17.containsKey((java.lang.Object) 10.0d);
        boolean b23 = defaultedMap17.isEmpty();
        java.util.Set set24 = defaultedMap17.keySet();
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 100.0d);
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) (-1.0d));
        boolean b31 = defaultedMap17.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        java.lang.String str37 = defaultedMap36.toString();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) true);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation42.setElitismRate((double) (byte) 0);
        math.genetics.Population population45 = elitisticListPopulation42.nextGeneration();
        java.lang.Object obj46 = defaultedMap36.put((java.lang.Object) true, (java.lang.Object) elitisticListPopulation42);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome47 = elitisticListPopulation42.iterator();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(population45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(iterator_chromosome47);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap1.containsValue(obj8);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Set set18 = defaultedMap17.entrySet();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) 100.0d);
        int i26 = defaultedMap23.size();
        boolean b28 = defaultedMap23.containsKey((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap23.isEmpty();
        java.util.Set set30 = defaultedMap23.keySet();
        boolean b31 = defaultedMap17.containsValue((java.lang.Object) defaultedMap23);
        java.util.Set set32 = defaultedMap17.entrySet();
        defaultedMap17.clear();
        int i34 = defaultedMap17.size();
        boolean b35 = defaultedMap1.equals((java.lang.Object) i34);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome39 = null;
        elitisticListPopulation38.addChromosome(chromosome39);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome41 = elitisticListPopulation38.spliterator();
        java.lang.Object obj42 = defaultedMap1.get((java.lang.Object) elitisticListPopulation38);
        math.genetics.Population population43 = elitisticListPopulation38.nextGeneration();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(population43);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation6.addChromosome(chromosome7);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation6.spliterator();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation6);
        int i11 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation6.addChromosome(chromosome7);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation6.spliterator();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation6);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation18.setElitismRate((double) (byte) 0);
        elitisticListPopulation18.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation13.setChromosomes(list_chromosome23);
        elitisticListPopulation6.setChromosomes(list_chromosome23);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 100.0d);
        int i30 = defaultedMap27.size();
        boolean b32 = defaultedMap27.containsKey((java.lang.Object) 10.0d);
        boolean b33 = defaultedMap27.isEmpty();
        java.util.Set set34 = defaultedMap27.keySet();
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 100.0d);
        boolean b40 = defaultedMap36.containsValue((java.lang.Object) (-1.0d));
        boolean b41 = defaultedMap27.containsValue((java.lang.Object) (-1.0d));
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate42, predicate43);
        boolean b45 = defaultedMap27.isEmpty();
        java.util.Collection collection46 = defaultedMap27.values();
        elitisticListPopulation6.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection46);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation(10, (double) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation53.setElitismRate((double) (byte) 0);
        elitisticListPopulation53.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome58 = elitisticListPopulation53.getChromosomes();
        math.genetics.Chromosome chromosome59 = null;
        elitisticListPopulation53.addChromosome(chromosome59);
        int i61 = elitisticListPopulation53.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        elitisticListPopulation64.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66);
        elitisticListPopulation53.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66);
        elitisticListPopulation50.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome66);
        java.util.List<math.genetics.Chromosome> list_chromosome71 = elitisticListPopulation50.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation74 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation74.setElitismRate((double) (byte) 0);
        elitisticListPopulation74.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome79 = elitisticListPopulation74.getChromosomes();
        math.genetics.Chromosome chromosome80 = null;
        elitisticListPopulation74.addChromosome(chromosome80);
        int i82 = elitisticListPopulation74.getPopulationSize();
        int i83 = elitisticListPopulation74.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation86 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome[] chromosome_array87 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome88 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b89 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome88, chromosome_array87);
        elitisticListPopulation86.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome88);
        elitisticListPopulation74.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome88);
        elitisticListPopulation50.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome88);
        elitisticListPopulation6.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome88);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(list_chromosome58);
        org.junit.Assert.assertTrue(i61 == 1);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(list_chromosome71);
        org.junit.Assert.assertNotNull(list_chromosome79);
        org.junit.Assert.assertTrue(i82 == 1);
        org.junit.Assert.assertTrue(i83 == 1);
        org.junit.Assert.assertNotNull(chromosome_array87);
        org.junit.Assert.assertTrue(b89 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0d);
        int i10 = defaultedMap7.size();
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap7.isEmpty();
        java.util.Set set14 = defaultedMap7.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0d);
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) (-1.0d));
        int i22 = defaultedMap17.size();
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) defaultedMap17);
        java.lang.String str24 = defaultedMap17.toString();
        java.util.Set set25 = defaultedMap17.entrySet();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Set set28 = defaultedMap27.entrySet();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) 100.0d);
        int i36 = defaultedMap33.size();
        boolean b38 = defaultedMap33.containsKey((java.lang.Object) 10.0d);
        boolean b39 = defaultedMap33.isEmpty();
        java.util.Set set40 = defaultedMap33.keySet();
        boolean b41 = defaultedMap27.containsValue((java.lang.Object) defaultedMap33);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.util.Set set44 = defaultedMap43.entrySet();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate45, predicate46);
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) 100.0d);
        int i52 = defaultedMap49.size();
        boolean b54 = defaultedMap49.containsKey((java.lang.Object) 10.0d);
        boolean b55 = defaultedMap49.isEmpty();
        java.util.Set set56 = defaultedMap49.keySet();
        boolean b57 = defaultedMap43.containsValue((java.lang.Object) defaultedMap49);
        java.util.Set set58 = defaultedMap43.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation61 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        math.genetics.Chromosome chromosome62 = null;
        elitisticListPopulation61.addChromosome(chromosome62);
        math.genetics.ElitisticListPopulation elitisticListPopulation66 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1.0f);
        elitisticListPopulation66.setElitismRate((double) (byte) 0);
        elitisticListPopulation66.setElitismRate((double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome71 = elitisticListPopulation66.getChromosomes();
        elitisticListPopulation61.setChromosomes(list_chromosome71);
        boolean b73 = defaultedMap43.equals((java.lang.Object) elitisticListPopulation61);
        boolean b74 = defaultedMap27.containsKey((java.lang.Object) elitisticListPopulation61);
        boolean b75 = defaultedMap17.containsKey((java.lang.Object) defaultedMap27);
        java.util.Collection collection76 = defaultedMap27.values();
        java.lang.String str77 = defaultedMap27.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(list_chromosome71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
    }
}

