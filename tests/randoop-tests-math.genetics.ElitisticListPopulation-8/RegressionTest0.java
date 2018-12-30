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
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
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
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) "");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.Chromosome chromosome8 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
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
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        int i9 = elitisticListPopulation2.getPopulationLimit();
        try {
            elitisticListPopulation2.setPopulationLimit((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue(i9 == 100);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) -1, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) (short) 1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 0, 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        double d5 = elitisticListPopulation2.getElitismRate();
        java.lang.String str6 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        double d7 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d7 == 1.0d);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        elitisticListPopulation2.setPopulationLimit(1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        collections.Transformer transformer24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, transformer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        try {
            math.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertNotNull(population9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate24, predicate25);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation32.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        elitisticListPopulation29.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        int i38 = elitisticListPopulation29.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome39 = elitisticListPopulation29.spliterator();
        boolean b40 = defaultedMap10.containsValue((java.lang.Object) elitisticListPopulation29);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome39);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        try {
            math.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 100);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (-1), (double) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15);
        java.lang.String str19 = elitisticListPopulation2.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation2.iterator();
        try {
            math.genetics.Chromosome chromosome21 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]" + "'", str19.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome20);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 100);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        double d5 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation8.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome14);
        try {
            elitisticListPopulation2.setPopulationLimit((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(list_chromosome14);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        try {
            math.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 10, 1.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation5.addChromosome(chromosome7);
        double d9 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 10, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        defaultedMap10.clear();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap10.get(obj12);
        java.lang.String str14 = defaultedMap10.toString();
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0d + "'", obj13.equals(1.0d));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        double d8 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(d8 == 1.0d);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) '#');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((-1), 1.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i27 = elitisticListPopulation26.getPopulationLimit();
        int i28 = elitisticListPopulation26.getPopulationLimit();
        double d29 = elitisticListPopulation26.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation32.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        java.util.List<math.genetics.Chromosome> list_chromosome37 = elitisticListPopulation32.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation32.getChromosomes();
        elitisticListPopulation26.setChromosomes(list_chromosome38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation26);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) elitisticListPopulation26);
        collections.Transformer transformer42 = null;
        try {
            java.util.Map map43 = collections.map.DefaultedMap.decorate(map41, transformer42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertTrue(i27 == 100);
        org.junit.Assert.assertTrue(i28 == 100);
        org.junit.Assert.assertTrue(d29 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(list_chromosome37);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        double d5 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation8.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome14);
        double d16 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue(d16 == 1.0d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 10, 1.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        try {
            elitisticListPopulation5.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation26.getChromosomes();
        int i32 = elitisticListPopulation26.getPopulationLimit();
        double d33 = elitisticListPopulation26.getElitismRate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) d33);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39);
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation37.getChromosomes();
        int i43 = elitisticListPopulation37.getPopulationLimit();
        double d44 = elitisticListPopulation37.getElitismRate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) d44);
        defaultedMap45.clear();
        defaultedMap34.putAll((java.util.Map) defaultedMap45);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate48, predicate49);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array54 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome55 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55, chromosome_array54);
        elitisticListPopulation53.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55);
        java.util.List<math.genetics.Chromosome> list_chromosome58 = elitisticListPopulation53.getChromosomes();
        int i59 = elitisticListPopulation53.getPopulationLimit();
        double d60 = elitisticListPopulation53.getElitismRate();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) d60);
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        elitisticListPopulation64.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66);
        java.util.List<math.genetics.Chromosome> list_chromosome69 = elitisticListPopulation64.getChromosomes();
        int i70 = elitisticListPopulation64.getPopulationLimit();
        double d71 = elitisticListPopulation64.getElitismRate();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) d71);
        defaultedMap72.clear();
        defaultedMap61.putAll((java.util.Map) defaultedMap72);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate75, predicate76);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate49, predicate76);
        java.lang.String str79 = defaultedMap21.toString();
        int i80 = defaultedMap21.size();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertTrue(i32 == 100);
        org.junit.Assert.assertTrue(d33 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertTrue(i43 == 100);
        org.junit.Assert.assertTrue(d44 == 1.0d);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(chromosome_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(list_chromosome58);
        org.junit.Assert.assertTrue(i59 == 100);
        org.junit.Assert.assertTrue(d60 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(list_chromosome69);
        org.junit.Assert.assertTrue(i70 == 100);
        org.junit.Assert.assertTrue(d71 == 1.0d);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertTrue(i80 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        defaultedMap10.clear();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap10.get(obj12);
        java.lang.String str14 = defaultedMap10.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        elitisticListPopulation17.setPopulationLimit((int) (short) 100);
        boolean b20 = defaultedMap10.containsKey((java.lang.Object) elitisticListPopulation17);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0d + "'", obj13.equals(1.0d));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = elitisticListPopulation26.spliterator();
        boolean b28 = defaultedMap10.containsValue((java.lang.Object) elitisticListPopulation26);
        math.genetics.Chromosome chromosome29 = null;
        elitisticListPopulation26.addChromosome(chromosome29);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = list_chromosome10.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15);
        try {
            math.genetics.Chromosome chromosome19 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        boolean b25 = defaultedMap21.equals((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap21.containsKey((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation26.getChromosomes();
        int i32 = elitisticListPopulation26.getPopulationLimit();
        double d33 = elitisticListPopulation26.getElitismRate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) d33);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39);
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation37.getChromosomes();
        int i43 = elitisticListPopulation37.getPopulationLimit();
        double d44 = elitisticListPopulation37.getElitismRate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) d44);
        defaultedMap45.clear();
        defaultedMap34.putAll((java.util.Map) defaultedMap45);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate48, predicate49);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array54 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome55 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55, chromosome_array54);
        elitisticListPopulation53.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55);
        java.util.List<math.genetics.Chromosome> list_chromosome58 = elitisticListPopulation53.getChromosomes();
        int i59 = elitisticListPopulation53.getPopulationLimit();
        double d60 = elitisticListPopulation53.getElitismRate();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) d60);
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        elitisticListPopulation64.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66);
        java.util.List<math.genetics.Chromosome> list_chromosome69 = elitisticListPopulation64.getChromosomes();
        int i70 = elitisticListPopulation64.getPopulationLimit();
        double d71 = elitisticListPopulation64.getElitismRate();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) d71);
        defaultedMap72.clear();
        defaultedMap61.putAll((java.util.Map) defaultedMap72);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate75, predicate76);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate49, predicate76);
        java.lang.String str79 = defaultedMap21.toString();
        java.util.Set set80 = defaultedMap21.keySet();
        int i81 = defaultedMap21.size();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertTrue(i32 == 100);
        org.junit.Assert.assertTrue(d33 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertTrue(i43 == 100);
        org.junit.Assert.assertTrue(d44 == 1.0d);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(chromosome_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(list_chromosome58);
        org.junit.Assert.assertTrue(i59 == 100);
        org.junit.Assert.assertTrue(d60 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(list_chromosome69);
        org.junit.Assert.assertTrue(i70 == 100);
        org.junit.Assert.assertTrue(d71 == 1.0d);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue(i81 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation2.spliterator();
        try {
            elitisticListPopulation2.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        double d5 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation8.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome14);
        try {
            math.genetics.Chromosome chromosome16 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(list_chromosome14);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        double d5 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 10, 1.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        try {
            elitisticListPopulation5.setElitismRate((double) (byte) 100);
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
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        defaultedMap10.clear();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) (short) -1);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0d + "'", obj13.equals(1.0d));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        elitisticListPopulation7.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation7.getChromosomes();
        int i13 = elitisticListPopulation7.getPopulationLimit();
        math.genetics.Population population14 = elitisticListPopulation7.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome15);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(i13 == 100);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, 10, 1.0d);
        double d30 = elitisticListPopulation29.getElitismRate();
        boolean b31 = defaultedMap10.containsValue((java.lang.Object) d30);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(d30 == 1.0d);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation2.iterator();
        try {
            elitisticListPopulation2.setElitismRate(100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertNotNull(iterator_chromosome10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        defaultedMap10.clear();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap10.get(obj12);
        java.util.Collection collection14 = defaultedMap10.values();
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0d + "'", obj13.equals(1.0d));
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        defaultedMap10.clear();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation16.getChromosomes();
        int i22 = elitisticListPopulation16.getPopulationLimit();
        double d23 = elitisticListPopulation16.getElitismRate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) d23);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 10.0f);
        boolean b27 = defaultedMap10.containsKey(obj26);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0d + "'", obj13.equals(1.0d));
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i22 == 100);
        org.junit.Assert.assertTrue(d23 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1.0d + "'", obj26.equals(1.0d));
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        defaultedMap10.clear();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap10.get(obj12);
        java.lang.String str14 = defaultedMap10.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation17.getChromosomes();
        int i23 = elitisticListPopulation17.getPopulationLimit();
        double d24 = elitisticListPopulation17.getElitismRate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) d24);
        defaultedMap25.clear();
        java.lang.Object obj27 = defaultedMap10.get((java.lang.Object) defaultedMap25);
        collections.Transformer transformer28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, transformer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0d + "'", obj13.equals(1.0d));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(list_chromosome22);
        org.junit.Assert.assertTrue(i23 == 100);
        org.junit.Assert.assertTrue(d24 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1.0d + "'", obj27.equals(1.0d));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation26.getChromosomes();
        int i32 = elitisticListPopulation26.getPopulationLimit();
        double d33 = elitisticListPopulation26.getElitismRate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) d33);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39);
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation37.getChromosomes();
        int i43 = elitisticListPopulation37.getPopulationLimit();
        double d44 = elitisticListPopulation37.getElitismRate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) d44);
        defaultedMap45.clear();
        defaultedMap34.putAll((java.util.Map) defaultedMap45);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate48, predicate49);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array54 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome55 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55, chromosome_array54);
        elitisticListPopulation53.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55);
        java.util.List<math.genetics.Chromosome> list_chromosome58 = elitisticListPopulation53.getChromosomes();
        int i59 = elitisticListPopulation53.getPopulationLimit();
        double d60 = elitisticListPopulation53.getElitismRate();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) d60);
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        elitisticListPopulation64.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66);
        java.util.List<math.genetics.Chromosome> list_chromosome69 = elitisticListPopulation64.getChromosomes();
        int i70 = elitisticListPopulation64.getPopulationLimit();
        double d71 = elitisticListPopulation64.getElitismRate();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) d71);
        defaultedMap72.clear();
        defaultedMap61.putAll((java.util.Map) defaultedMap72);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate75, predicate76);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate49, predicate76);
        java.lang.String str79 = defaultedMap21.toString();
        java.util.Collection collection80 = defaultedMap21.values();
        java.lang.Object obj82 = defaultedMap21.get((java.lang.Object) 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertTrue(i32 == 100);
        org.junit.Assert.assertTrue(d33 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertTrue(i43 == 100);
        org.junit.Assert.assertTrue(d44 == 1.0d);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(chromosome_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(list_chromosome58);
        org.junit.Assert.assertTrue(i59 == 100);
        org.junit.Assert.assertTrue(d60 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(list_chromosome69);
        org.junit.Assert.assertTrue(i70 == 100);
        org.junit.Assert.assertTrue(d71 == 1.0d);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 1.0d + "'", obj82.equals(1.0d));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        boolean b25 = defaultedMap21.equals((java.lang.Object) 10.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation28.getChromosomes();
        int i34 = elitisticListPopulation28.getPopulationLimit();
        math.genetics.Population population35 = elitisticListPopulation28.nextGeneration();
        java.lang.Object obj36 = defaultedMap21.remove((java.lang.Object) elitisticListPopulation28);
        collections.Transformer transformer37 = null;
        try {
            java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, transformer37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertTrue(i34 == 100);
        org.junit.Assert.assertNotNull(population35);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        int i20 = elitisticListPopulation11.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        double d5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        try {
            math.genetics.Chromosome chromosome8 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertTrue(d5 == 1.0d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) list_chromosome7);
        java.util.Collection collection9 = defaultedMap8.values();
        int i10 = defaultedMap8.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26);
        elitisticListPopulation13.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        java.lang.String str30 = elitisticListPopulation13.toString();
        boolean b31 = defaultedMap8.equals((java.lang.Object) str30);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]" + "'", str30.equals("[]"));
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation15.getChromosomes();
        int i21 = elitisticListPopulation15.getPopulationLimit();
        double d22 = elitisticListPopulation15.getElitismRate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) d22);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation26.getChromosomes();
        int i32 = elitisticListPopulation26.getPopulationLimit();
        double d33 = elitisticListPopulation26.getElitismRate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) d33);
        defaultedMap34.clear();
        defaultedMap23.putAll((java.util.Map) defaultedMap34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        elitisticListPopulation39.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41);
        java.util.List<math.genetics.Chromosome> list_chromosome44 = elitisticListPopulation39.getChromosomes();
        int i45 = elitisticListPopulation39.getPopulationLimit();
        double d46 = elitisticListPopulation39.getElitismRate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) d46);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array51 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome52 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b53 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52, chromosome_array51);
        elitisticListPopulation50.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52);
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation50.getChromosomes();
        int i56 = elitisticListPopulation50.getPopulationLimit();
        double d57 = elitisticListPopulation50.getElitismRate();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) d57);
        defaultedMap58.clear();
        defaultedMap47.putAll((java.util.Map) defaultedMap58);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate61, predicate62);
        math.genetics.ElitisticListPopulation elitisticListPopulation66 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array67 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome68 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b69 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome68, chromosome_array67);
        elitisticListPopulation66.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome68);
        java.util.List<math.genetics.Chromosome> list_chromosome71 = elitisticListPopulation66.getChromosomes();
        int i72 = elitisticListPopulation66.getPopulationLimit();
        double d73 = elitisticListPopulation66.getElitismRate();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) d73);
        math.genetics.ElitisticListPopulation elitisticListPopulation77 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array78 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome79 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b80 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome79, chromosome_array78);
        elitisticListPopulation77.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome79);
        java.util.List<math.genetics.Chromosome> list_chromosome82 = elitisticListPopulation77.getChromosomes();
        int i83 = elitisticListPopulation77.getPopulationLimit();
        double d84 = elitisticListPopulation77.getElitismRate();
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) d84);
        defaultedMap85.clear();
        defaultedMap74.putAll((java.util.Map) defaultedMap85);
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate89 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate88, predicate89);
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate62, predicate89);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate62);
        collections.map.DefaultedMap defaultedMap93 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue(i21 == 100);
        org.junit.Assert.assertTrue(d22 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertTrue(i32 == 100);
        org.junit.Assert.assertTrue(d33 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(list_chromosome44);
        org.junit.Assert.assertTrue(i45 == 100);
        org.junit.Assert.assertTrue(d46 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertTrue(i56 == 100);
        org.junit.Assert.assertTrue(d57 == 1.0d);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(chromosome_array67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(list_chromosome71);
        org.junit.Assert.assertTrue(i72 == 100);
        org.junit.Assert.assertTrue(d73 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array78);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(list_chromosome82);
        org.junit.Assert.assertTrue(i83 == 100);
        org.junit.Assert.assertTrue(d84 == 1.0d);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map92);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        defaultedMap10.clear();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        elitisticListPopulation16.setPopulationLimit((int) (short) 100);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) elitisticListPopulation16);
        defaultedMap10.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25);
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation23.getChromosomes();
        int i29 = elitisticListPopulation23.getPopulationLimit();
        double d30 = elitisticListPopulation23.getElitismRate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) d30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        elitisticListPopulation34.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36);
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation34.getChromosomes();
        int i40 = elitisticListPopulation34.getPopulationLimit();
        double d41 = elitisticListPopulation34.getElitismRate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) d41);
        defaultedMap42.clear();
        defaultedMap31.putAll((java.util.Map) defaultedMap42);
        java.lang.Object obj45 = defaultedMap10.get((java.lang.Object) defaultedMap42);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0d + "'", obj13.equals(1.0d));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0d + "'", obj19.equals(1.0d));
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue(i29 == 100);
        org.junit.Assert.assertTrue(d30 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(list_chromosome39);
        org.junit.Assert.assertTrue(i40 == 100);
        org.junit.Assert.assertTrue(d41 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1.0d + "'", obj45.equals(1.0d));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15);
        java.lang.String str19 = elitisticListPopulation2.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation2.iterator();
        int i21 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]" + "'", str19.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertTrue(i21 == 100);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 10, 1.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation5.addChromosome(chromosome7);
        elitisticListPopulation5.setPopulationLimit((int) '4');
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 1.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        boolean b25 = defaultedMap21.equals((java.lang.Object) 10.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation28.getChromosomes();
        int i34 = elitisticListPopulation28.getPopulationLimit();
        math.genetics.Population population35 = elitisticListPopulation28.nextGeneration();
        java.lang.Object obj36 = defaultedMap21.remove((java.lang.Object) elitisticListPopulation28);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        elitisticListPopulation39.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41);
        java.util.List<math.genetics.Chromosome> list_chromosome44 = elitisticListPopulation39.getChromosomes();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) list_chromosome44);
        java.lang.Object obj46 = defaultedMap21.get((java.lang.Object) list_chromosome44);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation(list_chromosome44, (int) '#', (double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertTrue(i34 == 100);
        org.junit.Assert.assertNotNull(population35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(list_chromosome44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1.0d + "'", obj46.equals(1.0d));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i27 = elitisticListPopulation26.getPopulationLimit();
        int i28 = elitisticListPopulation26.getPopulationLimit();
        double d29 = elitisticListPopulation26.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation32.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        java.util.List<math.genetics.Chromosome> list_chromosome37 = elitisticListPopulation32.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation32.getChromosomes();
        elitisticListPopulation26.setChromosomes(list_chromosome38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation26);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) elitisticListPopulation26);
        int i42 = elitisticListPopulation26.getPopulationLimit();
        java.lang.String str43 = elitisticListPopulation26.toString();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertTrue(i27 == 100);
        org.junit.Assert.assertTrue(i28 == 100);
        org.junit.Assert.assertTrue(d29 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(list_chromosome37);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(i42 == 100);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "[]" + "'", str43.equals("[]"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        elitisticListPopulation7.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation7.getChromosomes();
        int i13 = elitisticListPopulation7.getPopulationLimit();
        math.genetics.Population population14 = elitisticListPopulation7.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome15);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome17 = list_chromosome15.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(i13 == 100);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(spliterator_chromosome17);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation26.getChromosomes();
        int i32 = elitisticListPopulation26.getPopulationLimit();
        double d33 = elitisticListPopulation26.getElitismRate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) d33);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39);
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation37.getChromosomes();
        int i43 = elitisticListPopulation37.getPopulationLimit();
        double d44 = elitisticListPopulation37.getElitismRate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) d44);
        defaultedMap45.clear();
        defaultedMap34.putAll((java.util.Map) defaultedMap45);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate48, predicate49);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array54 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome55 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55, chromosome_array54);
        elitisticListPopulation53.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55);
        java.util.List<math.genetics.Chromosome> list_chromosome58 = elitisticListPopulation53.getChromosomes();
        int i59 = elitisticListPopulation53.getPopulationLimit();
        double d60 = elitisticListPopulation53.getElitismRate();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) d60);
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        elitisticListPopulation64.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66);
        java.util.List<math.genetics.Chromosome> list_chromosome69 = elitisticListPopulation64.getChromosomes();
        int i70 = elitisticListPopulation64.getPopulationLimit();
        double d71 = elitisticListPopulation64.getElitismRate();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) d71);
        defaultedMap72.clear();
        defaultedMap61.putAll((java.util.Map) defaultedMap72);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate75, predicate76);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate49, predicate76);
        java.lang.String str79 = defaultedMap21.toString();
        java.util.Set set80 = defaultedMap21.keySet();
        java.util.Set set81 = defaultedMap21.entrySet();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertTrue(i32 == 100);
        org.junit.Assert.assertTrue(d33 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertTrue(i43 == 100);
        org.junit.Assert.assertTrue(d44 == 1.0d);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(chromosome_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(list_chromosome58);
        org.junit.Assert.assertTrue(i59 == 100);
        org.junit.Assert.assertTrue(d60 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(list_chromosome69);
        org.junit.Assert.assertTrue(i70 == 100);
        org.junit.Assert.assertTrue(d71 == 1.0d);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNotNull(set81);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i11 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str12 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i18 = elitisticListPopulation17.getPopulationLimit();
        int i19 = elitisticListPopulation17.getPopulationLimit();
        double d20 = elitisticListPopulation17.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation17.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome21);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation(list_chromosome21, 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertTrue(i18 == 100);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome21);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        boolean b25 = defaultedMap21.equals((java.lang.Object) 10.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation28.getChromosomes();
        int i34 = elitisticListPopulation28.getPopulationLimit();
        math.genetics.Population population35 = elitisticListPopulation28.nextGeneration();
        java.lang.Object obj36 = defaultedMap21.remove((java.lang.Object) elitisticListPopulation28);
        int i37 = defaultedMap21.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        elitisticListPopulation40.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42);
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation40.getChromosomes();
        int i46 = elitisticListPopulation40.getPopulationLimit();
        double d47 = elitisticListPopulation40.getElitismRate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) d47);
        defaultedMap48.clear();
        java.lang.Object obj50 = null;
        java.lang.Object obj51 = defaultedMap48.get(obj50);
        defaultedMap48.clear();
        defaultedMap21.putAll((java.util.Map) defaultedMap48);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertTrue(i34 == 100);
        org.junit.Assert.assertNotNull(population35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(list_chromosome45);
        org.junit.Assert.assertTrue(i46 == 100);
        org.junit.Assert.assertTrue(d47 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 1.0d + "'", obj51.equals(1.0d));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation2.iterator();
        double d12 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertNotNull(iterator_chromosome10);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertTrue(d12 == 1.0d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        double d5 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation8.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        try {
            math.genetics.Chromosome chromosome17 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(list_chromosome14);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        double d5 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation8.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i17 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population18 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation2.addChromosome(chromosome19);
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(population18);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = elitisticListPopulation26.spliterator();
        boolean b28 = defaultedMap10.containsValue((java.lang.Object) elitisticListPopulation26);
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation26.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(list_chromosome29, (-1), (double) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(list_chromosome29);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) (short) 1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate24, predicate25);
        int i27 = defaultedMap10.size();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = elitisticListPopulation26.spliterator();
        boolean b28 = defaultedMap10.containsValue((java.lang.Object) elitisticListPopulation26);
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation26.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(list_chromosome29, (int) (byte) -1, 10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(list_chromosome29);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i27 = elitisticListPopulation26.getPopulationLimit();
        int i28 = elitisticListPopulation26.getPopulationLimit();
        double d29 = elitisticListPopulation26.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation32.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        java.util.List<math.genetics.Chromosome> list_chromosome37 = elitisticListPopulation32.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation32.getChromosomes();
        elitisticListPopulation26.setChromosomes(list_chromosome38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation26);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) elitisticListPopulation26);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        elitisticListPopulation44.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46);
        java.util.List<math.genetics.Chromosome> list_chromosome49 = elitisticListPopulation44.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array56 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome57 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b58 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57, chromosome_array56);
        elitisticListPopulation55.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57);
        elitisticListPopulation52.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array64 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome65 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b66 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65, chromosome_array64);
        elitisticListPopulation63.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65);
        elitisticListPopulation52.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome65);
        java.lang.String str69 = elitisticListPopulation52.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation72 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i73 = elitisticListPopulation72.getPopulationLimit();
        int i74 = elitisticListPopulation72.getPopulationLimit();
        double d75 = elitisticListPopulation72.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation78 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array79 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome80 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b81 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome80, chromosome_array79);
        elitisticListPopulation78.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome80);
        java.util.List<math.genetics.Chromosome> list_chromosome83 = elitisticListPopulation78.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome84 = elitisticListPopulation78.getChromosomes();
        elitisticListPopulation72.setChromosomes(list_chromosome84);
        elitisticListPopulation52.setChromosomes(list_chromosome84);
        elitisticListPopulation44.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome84);
        boolean b88 = defaultedMap10.containsKey((java.lang.Object) elitisticListPopulation44);
        java.lang.String str89 = defaultedMap10.toString();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertTrue(i27 == 100);
        org.junit.Assert.assertTrue(i28 == 100);
        org.junit.Assert.assertTrue(d29 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(list_chromosome37);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(list_chromosome49);
        org.junit.Assert.assertNotNull(chromosome_array56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(chromosome_array64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "[]" + "'", str69.equals("[]"));
        org.junit.Assert.assertTrue(i73 == 100);
        org.junit.Assert.assertTrue(i74 == 100);
        org.junit.Assert.assertTrue(d75 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array79);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(list_chromosome83);
        org.junit.Assert.assertNotNull(list_chromosome84);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "{}" + "'", str89.equals("{}"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        boolean b20 = defaultedMap10.equals((java.lang.Object) i19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate21);
        defaultedMap10.clear();
        java.lang.Object obj25 = defaultedMap10.get((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1.0d + "'", obj25.equals(1.0d));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        defaultedMap10.clear();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation16.getChromosomes();
        int i22 = elitisticListPopulation16.getPopulationLimit();
        double d23 = elitisticListPopulation16.getElitismRate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) d23);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 10.0f);
        java.util.Set set27 = defaultedMap24.entrySet();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) set27);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0d + "'", obj13.equals(1.0d));
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i22 == 100);
        org.junit.Assert.assertTrue(d23 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1.0d + "'", obj26.equals(1.0d));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        double d5 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation8.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation19.getChromosomes();
        int i25 = elitisticListPopulation19.getPopulationLimit();
        double d26 = elitisticListPopulation19.getElitismRate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) d26);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32);
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation30.getChromosomes();
        int i36 = elitisticListPopulation30.getPopulationLimit();
        double d37 = elitisticListPopulation30.getElitismRate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) d37);
        defaultedMap38.clear();
        defaultedMap27.putAll((java.util.Map) defaultedMap38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome44 = elitisticListPopulation43.spliterator();
        boolean b45 = defaultedMap27.containsValue((java.lang.Object) elitisticListPopulation43);
        boolean b46 = defaultedMap16.containsValue((java.lang.Object) elitisticListPopulation43);
        defaultedMap16.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i51 = elitisticListPopulation50.getPopulationLimit();
        int i52 = elitisticListPopulation50.getPopulationLimit();
        double d53 = elitisticListPopulation50.getElitismRate();
        elitisticListPopulation50.setPopulationLimit((int) (byte) 100);
        boolean b56 = defaultedMap16.containsValue((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(list_chromosome24);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertTrue(d26 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertTrue(i36 == 100);
        org.junit.Assert.assertTrue(d37 == 1.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i51 == 100);
        org.junit.Assert.assertTrue(i52 == 100);
        org.junit.Assert.assertTrue(d53 == 1.0d);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        int i11 = defaultedMap10.size();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0d + "'", obj13.equals(1.0d));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        defaultedMap10.clear();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        elitisticListPopulation16.setPopulationLimit((int) (short) 100);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) elitisticListPopulation16);
        try {
            math.genetics.Chromosome chromosome20 = elitisticListPopulation16.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0d + "'", obj13.equals(1.0d));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0d + "'", obj19.equals(1.0d));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        org.junit.Assert.assertTrue(i3 == 100);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) list_chromosome7);
        java.util.Collection collection9 = defaultedMap8.values();
        java.lang.Object obj10 = null;
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, obj10);
        java.util.Set set12 = defaultedMap8.entrySet();
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i11 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str12 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i18 = elitisticListPopulation17.getPopulationLimit();
        int i19 = elitisticListPopulation17.getPopulationLimit();
        double d20 = elitisticListPopulation17.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation17.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome21);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation(list_chromosome21, 0, (double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertTrue(i18 == 100);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome21);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        int i11 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15);
        java.lang.String str19 = elitisticListPopulation2.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i23 = elitisticListPopulation22.getPopulationLimit();
        int i24 = elitisticListPopulation22.getPopulationLimit();
        double d25 = elitisticListPopulation22.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation28.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation22.setChromosomes(list_chromosome34);
        elitisticListPopulation2.setChromosomes(list_chromosome34);
        int i37 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome38 = elitisticListPopulation2.iterator();
        int i39 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]" + "'", str19.equals("[]"));
        org.junit.Assert.assertTrue(i23 == 100);
        org.junit.Assert.assertTrue(i24 == 100);
        org.junit.Assert.assertTrue(d25 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertNotNull(list_chromosome34);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome38);
        org.junit.Assert.assertTrue(i39 == 100);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = elitisticListPopulation26.spliterator();
        boolean b28 = defaultedMap10.containsValue((java.lang.Object) elitisticListPopulation26);
        try {
            math.genetics.Chromosome chromosome29 = elitisticListPopulation26.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate24, predicate25);
        defaultedMap10.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i31 = elitisticListPopulation30.getPopulationLimit();
        int i32 = elitisticListPopulation30.getPopulationLimit();
        double d33 = elitisticListPopulation30.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        elitisticListPopulation36.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38);
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation36.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation36.getChromosomes();
        elitisticListPopulation30.setChromosomes(list_chromosome42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation30);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        elitisticListPopulation47.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49);
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation47.getChromosomes();
        int i53 = elitisticListPopulation47.getPopulationLimit();
        double d54 = elitisticListPopulation47.getElitismRate();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) d54);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array59 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome60 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b61 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome60, chromosome_array59);
        elitisticListPopulation58.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome60);
        java.util.List<math.genetics.Chromosome> list_chromosome63 = elitisticListPopulation58.getChromosomes();
        int i64 = elitisticListPopulation58.getPopulationLimit();
        double d65 = elitisticListPopulation58.getElitismRate();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) d65);
        defaultedMap66.clear();
        defaultedMap55.putAll((java.util.Map) defaultedMap66);
        math.genetics.ElitisticListPopulation elitisticListPopulation71 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome72 = elitisticListPopulation71.spliterator();
        boolean b73 = defaultedMap55.containsValue((java.lang.Object) elitisticListPopulation71);
        boolean b74 = defaultedMap44.containsValue((java.lang.Object) elitisticListPopulation71);
        boolean b75 = defaultedMap10.equals((java.lang.Object) defaultedMap44);
        math.genetics.ElitisticListPopulation elitisticListPopulation78 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array79 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome80 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b81 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome80, chromosome_array79);
        elitisticListPopulation78.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome80);
        java.util.List<math.genetics.Chromosome> list_chromosome83 = elitisticListPopulation78.getChromosomes();
        int i84 = elitisticListPopulation78.getPopulationLimit();
        math.genetics.Population population85 = elitisticListPopulation78.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome86 = elitisticListPopulation78.iterator();
        boolean b87 = defaultedMap44.containsValue((java.lang.Object) iterator_chromosome86);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(i32 == 100);
        org.junit.Assert.assertTrue(d33 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(list_chromosome41);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(list_chromosome52);
        org.junit.Assert.assertTrue(i53 == 100);
        org.junit.Assert.assertTrue(d54 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(list_chromosome63);
        org.junit.Assert.assertTrue(i64 == 100);
        org.junit.Assert.assertTrue(d65 == 1.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(chromosome_array79);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(list_chromosome83);
        org.junit.Assert.assertTrue(i84 == 100);
        org.junit.Assert.assertNotNull(population85);
        org.junit.Assert.assertNotNull(iterator_chromosome86);
        org.junit.Assert.assertTrue(b87 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate24, predicate25);
        defaultedMap10.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i31 = elitisticListPopulation30.getPopulationLimit();
        int i32 = elitisticListPopulation30.getPopulationLimit();
        double d33 = elitisticListPopulation30.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        elitisticListPopulation36.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38);
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation36.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation36.getChromosomes();
        elitisticListPopulation30.setChromosomes(list_chromosome42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation30);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        elitisticListPopulation47.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49);
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation47.getChromosomes();
        int i53 = elitisticListPopulation47.getPopulationLimit();
        double d54 = elitisticListPopulation47.getElitismRate();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) d54);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array59 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome60 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b61 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome60, chromosome_array59);
        elitisticListPopulation58.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome60);
        java.util.List<math.genetics.Chromosome> list_chromosome63 = elitisticListPopulation58.getChromosomes();
        int i64 = elitisticListPopulation58.getPopulationLimit();
        double d65 = elitisticListPopulation58.getElitismRate();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) d65);
        defaultedMap66.clear();
        defaultedMap55.putAll((java.util.Map) defaultedMap66);
        math.genetics.ElitisticListPopulation elitisticListPopulation71 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome72 = elitisticListPopulation71.spliterator();
        boolean b73 = defaultedMap55.containsValue((java.lang.Object) elitisticListPopulation71);
        boolean b74 = defaultedMap44.containsValue((java.lang.Object) elitisticListPopulation71);
        boolean b75 = defaultedMap10.equals((java.lang.Object) defaultedMap44);
        math.genetics.ElitisticListPopulation elitisticListPopulation78 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation81 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array82 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome83 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b84 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome83, chromosome_array82);
        elitisticListPopulation81.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome83);
        elitisticListPopulation78.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome83);
        int i87 = elitisticListPopulation78.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome88 = elitisticListPopulation78.spliterator();
        math.genetics.Chromosome chromosome89 = null;
        elitisticListPopulation78.addChromosome(chromosome89);
        int i91 = elitisticListPopulation78.getPopulationSize();
        boolean b92 = defaultedMap44.equals((java.lang.Object) elitisticListPopulation78);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(i32 == 100);
        org.junit.Assert.assertTrue(d33 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(list_chromosome41);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(list_chromosome52);
        org.junit.Assert.assertTrue(i53 == 100);
        org.junit.Assert.assertTrue(d54 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(list_chromosome63);
        org.junit.Assert.assertTrue(i64 == 100);
        org.junit.Assert.assertTrue(d65 == 1.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(chromosome_array82);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(i87 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome88);
        org.junit.Assert.assertTrue(i91 == 1);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        try {
            math.genetics.Chromosome chromosome11 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        boolean b25 = defaultedMap21.equals((java.lang.Object) 10.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation28.getChromosomes();
        int i34 = elitisticListPopulation28.getPopulationLimit();
        math.genetics.Population population35 = elitisticListPopulation28.nextGeneration();
        java.lang.Object obj36 = defaultedMap21.remove((java.lang.Object) elitisticListPopulation28);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        elitisticListPopulation39.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41);
        java.util.List<math.genetics.Chromosome> list_chromosome44 = elitisticListPopulation39.getChromosomes();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) list_chromosome44);
        java.lang.Object obj46 = defaultedMap21.get((java.lang.Object) list_chromosome44);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        elitisticListPopulation49.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51);
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation49.getChromosomes();
        int i55 = elitisticListPopulation49.getPopulationLimit();
        double d56 = elitisticListPopulation49.getElitismRate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) d56);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array61 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome62 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b63 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome62, chromosome_array61);
        elitisticListPopulation60.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome62);
        java.util.List<math.genetics.Chromosome> list_chromosome65 = elitisticListPopulation60.getChromosomes();
        int i66 = elitisticListPopulation60.getPopulationLimit();
        double d67 = elitisticListPopulation60.getElitismRate();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) d67);
        defaultedMap68.clear();
        defaultedMap57.putAll((java.util.Map) defaultedMap68);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate71, predicate72);
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) predicate74);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate72, predicate74);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertTrue(i34 == 100);
        org.junit.Assert.assertNotNull(population35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(list_chromosome44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1.0d + "'", obj46.equals(1.0d));
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(list_chromosome54);
        org.junit.Assert.assertTrue(i55 == 100);
        org.junit.Assert.assertTrue(d56 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(list_chromosome65);
        org.junit.Assert.assertTrue(i66 == 100);
        org.junit.Assert.assertTrue(d67 == 1.0d);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map76);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) list_chromosome7);
        java.util.Collection collection9 = defaultedMap8.values();
        java.lang.Object obj10 = null;
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, obj10);
        java.util.Collection collection12 = defaultedMap8.values();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        defaultedMap10.clear();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap10.get(obj12);
        java.lang.String str14 = defaultedMap10.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation17.getChromosomes();
        int i23 = elitisticListPopulation17.getPopulationLimit();
        double d24 = elitisticListPopulation17.getElitismRate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) d24);
        defaultedMap25.clear();
        java.lang.Object obj27 = defaultedMap10.get((java.lang.Object) defaultedMap25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i31 = elitisticListPopulation30.getPopulationLimit();
        int i32 = elitisticListPopulation30.getPopulationLimit();
        double d33 = elitisticListPopulation30.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        elitisticListPopulation36.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38);
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation36.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation36.getChromosomes();
        elitisticListPopulation30.setChromosomes(list_chromosome42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation30);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        elitisticListPopulation47.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49);
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation47.getChromosomes();
        int i53 = elitisticListPopulation47.getPopulationLimit();
        double d54 = elitisticListPopulation47.getElitismRate();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) d54);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array59 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome60 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b61 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome60, chromosome_array59);
        elitisticListPopulation58.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome60);
        java.util.List<math.genetics.Chromosome> list_chromosome63 = elitisticListPopulation58.getChromosomes();
        int i64 = elitisticListPopulation58.getPopulationLimit();
        double d65 = elitisticListPopulation58.getElitismRate();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) d65);
        defaultedMap66.clear();
        defaultedMap55.putAll((java.util.Map) defaultedMap66);
        math.genetics.ElitisticListPopulation elitisticListPopulation71 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome72 = elitisticListPopulation71.spliterator();
        boolean b73 = defaultedMap55.containsValue((java.lang.Object) elitisticListPopulation71);
        boolean b74 = defaultedMap44.containsValue((java.lang.Object) elitisticListPopulation71);
        boolean b75 = defaultedMap25.equals((java.lang.Object) b74);
        math.genetics.ElitisticListPopulation elitisticListPopulation78 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array79 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome80 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b81 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome80, chromosome_array79);
        elitisticListPopulation78.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome80);
        java.util.List<math.genetics.Chromosome> list_chromosome83 = elitisticListPopulation78.getChromosomes();
        int i84 = elitisticListPopulation78.getPopulationLimit();
        double d85 = elitisticListPopulation78.getElitismRate();
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) d85);
        defaultedMap86.clear();
        java.lang.Object obj88 = null;
        java.lang.Object obj89 = defaultedMap86.get(obj88);
        defaultedMap86.clear();
        java.lang.Object obj91 = defaultedMap25.remove((java.lang.Object) defaultedMap86);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0d + "'", obj13.equals(1.0d));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(list_chromosome22);
        org.junit.Assert.assertTrue(i23 == 100);
        org.junit.Assert.assertTrue(d24 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1.0d + "'", obj27.equals(1.0d));
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(i32 == 100);
        org.junit.Assert.assertTrue(d33 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(list_chromosome41);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(list_chromosome52);
        org.junit.Assert.assertTrue(i53 == 100);
        org.junit.Assert.assertTrue(d54 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(list_chromosome63);
        org.junit.Assert.assertTrue(i64 == 100);
        org.junit.Assert.assertTrue(d65 == 1.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(chromosome_array79);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(list_chromosome83);
        org.junit.Assert.assertTrue(i84 == 100);
        org.junit.Assert.assertTrue(d85 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + 1.0d + "'", obj89.equals(1.0d));
        org.junit.Assert.assertNull(obj91);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        boolean b25 = defaultedMap21.equals((java.lang.Object) 10.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation28.getChromosomes();
        int i34 = elitisticListPopulation28.getPopulationLimit();
        math.genetics.Population population35 = elitisticListPopulation28.nextGeneration();
        java.lang.Object obj36 = defaultedMap21.remove((java.lang.Object) elitisticListPopulation28);
        java.util.Collection collection37 = defaultedMap21.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        elitisticListPopulation43.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45);
        elitisticListPopulation40.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array52 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome53 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b54 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome53, chromosome_array52);
        elitisticListPopulation51.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome53);
        elitisticListPopulation40.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome53);
        java.lang.String str57 = elitisticListPopulation40.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i61 = elitisticListPopulation60.getPopulationLimit();
        int i62 = elitisticListPopulation60.getPopulationLimit();
        double d63 = elitisticListPopulation60.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation66 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array67 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome68 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b69 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome68, chromosome_array67);
        elitisticListPopulation66.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome68);
        java.util.List<math.genetics.Chromosome> list_chromosome71 = elitisticListPopulation66.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome72 = elitisticListPopulation66.getChromosomes();
        elitisticListPopulation60.setChromosomes(list_chromosome72);
        elitisticListPopulation40.setChromosomes(list_chromosome72);
        int i75 = elitisticListPopulation40.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome76 = elitisticListPopulation40.iterator();
        java.lang.Object obj77 = defaultedMap21.get((java.lang.Object) iterator_chromosome76);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertTrue(i34 == 100);
        org.junit.Assert.assertNotNull(population35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(chromosome_array52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "[]" + "'", str57.equals("[]"));
        org.junit.Assert.assertTrue(i61 == 100);
        org.junit.Assert.assertTrue(i62 == 100);
        org.junit.Assert.assertTrue(d63 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(list_chromosome71);
        org.junit.Assert.assertNotNull(list_chromosome72);
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome76);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 1.0d + "'", obj77.equals(1.0d));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        boolean b25 = defaultedMap21.equals((java.lang.Object) 10.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation28.getChromosomes();
        int i34 = elitisticListPopulation28.getPopulationLimit();
        math.genetics.Population population35 = elitisticListPopulation28.nextGeneration();
        java.lang.Object obj36 = defaultedMap21.remove((java.lang.Object) elitisticListPopulation28);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        elitisticListPopulation39.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41);
        java.util.List<math.genetics.Chromosome> list_chromosome44 = elitisticListPopulation39.getChromosomes();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) list_chromosome44);
        java.lang.Object obj46 = defaultedMap21.get((java.lang.Object) list_chromosome44);
        int i47 = defaultedMap21.size();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) i47);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertTrue(i34 == 100);
        org.junit.Assert.assertNotNull(population35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(list_chromosome44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1.0d + "'", obj46.equals(1.0d));
        org.junit.Assert.assertTrue(i47 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) 0.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        elitisticListPopulation31.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        int i37 = elitisticListPopulation28.getPopulationSize();
        java.lang.String str38 = elitisticListPopulation28.toString();
        elitisticListPopulation28.setPopulationLimit((int) '4');
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i44 = elitisticListPopulation43.getPopulationLimit();
        int i45 = elitisticListPopulation43.getPopulationLimit();
        double d46 = elitisticListPopulation43.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome47 = elitisticListPopulation43.getChromosomes();
        elitisticListPopulation28.setChromosomes(list_chromosome47);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array52 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome53 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b54 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome53, chromosome_array52);
        elitisticListPopulation51.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome53);
        java.util.List<math.genetics.Chromosome> list_chromosome56 = elitisticListPopulation51.getChromosomes();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) list_chromosome56);
        java.util.Collection collection58 = defaultedMap57.values();
        java.lang.Object obj59 = null;
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, obj59);
        java.util.Set set61 = defaultedMap57.entrySet();
        java.lang.Object obj62 = defaultedMap21.put((java.lang.Object) list_chromosome47, (java.lang.Object) set61);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1.0d + "'", obj25.equals(1.0d));
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
        org.junit.Assert.assertTrue(i44 == 100);
        org.junit.Assert.assertTrue(i45 == 100);
        org.junit.Assert.assertTrue(d46 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome47);
        org.junit.Assert.assertNotNull(chromosome_array52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(list_chromosome56);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        double d5 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation8.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i17 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population18 = elitisticListPopulation2.nextGeneration();
        int i19 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        boolean b20 = defaultedMap10.equals((java.lang.Object) i19);
        java.util.Collection collection21 = defaultedMap10.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26);
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation24.getChromosomes();
        int i30 = elitisticListPopulation24.getPopulationLimit();
        double d31 = elitisticListPopulation24.getElitismRate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) d31);
        defaultedMap32.clear();
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = defaultedMap32.get(obj34);
        java.util.Collection collection36 = defaultedMap32.values();
        java.util.Set set37 = defaultedMap32.keySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap32);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(list_chromosome29);
        org.junit.Assert.assertTrue(i30 == 100);
        org.junit.Assert.assertTrue(d31 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1.0d + "'", obj35.equals(1.0d));
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i11 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str12 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome15 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome15);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        defaultedMap10.clear();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        elitisticListPopulation16.setPopulationLimit((int) (short) 100);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) elitisticListPopulation16);
        double d20 = elitisticListPopulation16.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        elitisticListPopulation34.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36);
        elitisticListPopulation23.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36);
        java.lang.String str40 = elitisticListPopulation23.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i44 = elitisticListPopulation43.getPopulationLimit();
        int i45 = elitisticListPopulation43.getPopulationLimit();
        double d46 = elitisticListPopulation43.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        elitisticListPopulation49.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51);
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation49.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation49.getChromosomes();
        elitisticListPopulation43.setChromosomes(list_chromosome55);
        elitisticListPopulation23.setChromosomes(list_chromosome55);
        elitisticListPopulation16.setChromosomes(list_chromosome55);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome59 = elitisticListPopulation16.iterator();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0d + "'", obj13.equals(1.0d));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0d + "'", obj19.equals(1.0d));
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[]" + "'", str40.equals("[]"));
        org.junit.Assert.assertTrue(i44 == 100);
        org.junit.Assert.assertTrue(i45 == 100);
        org.junit.Assert.assertTrue(d46 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(list_chromosome54);
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertNotNull(iterator_chromosome59);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i11 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str12 = elitisticListPopulation2.toString();
        int i13 = elitisticListPopulation2.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        int i25 = elitisticListPopulation16.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome31 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome31);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) d9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation13.getChromosomes();
        int i19 = elitisticListPopulation13.getPopulationLimit();
        double d20 = elitisticListPopulation13.getElitismRate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) d20);
        defaultedMap21.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i27 = elitisticListPopulation26.getPopulationLimit();
        int i28 = elitisticListPopulation26.getPopulationLimit();
        double d29 = elitisticListPopulation26.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation32.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        java.util.List<math.genetics.Chromosome> list_chromosome37 = elitisticListPopulation32.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation32.getChromosomes();
        elitisticListPopulation26.setChromosomes(list_chromosome38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation26);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) elitisticListPopulation26);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        elitisticListPopulation44.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46);
        java.util.List<math.genetics.Chromosome> list_chromosome49 = elitisticListPopulation44.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array56 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome57 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b58 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57, chromosome_array56);
        elitisticListPopulation55.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57);
        elitisticListPopulation52.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array64 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome65 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b66 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65, chromosome_array64);
        elitisticListPopulation63.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65);
        elitisticListPopulation52.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome65);
        java.lang.String str69 = elitisticListPopulation52.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation72 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        int i73 = elitisticListPopulation72.getPopulationLimit();
        int i74 = elitisticListPopulation72.getPopulationLimit();
        double d75 = elitisticListPopulation72.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation78 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 1);
        math.genetics.Chromosome[] chromosome_array79 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome80 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b81 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome80, chromosome_array79);
        elitisticListPopulation78.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome80);
        java.util.List<math.genetics.Chromosome> list_chromosome83 = elitisticListPopulation78.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome84 = elitisticListPopulation78.getChromosomes();
        elitisticListPopulation72.setChromosomes(list_chromosome84);
        elitisticListPopulation52.setChromosomes(list_chromosome84);
        elitisticListPopulation44.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome84);
        java.lang.Object obj88 = defaultedMap10.get((java.lang.Object) list_chromosome84);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertTrue(i27 == 100);
        org.junit.Assert.assertTrue(i28 == 100);
        org.junit.Assert.assertTrue(d29 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(list_chromosome37);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(list_chromosome49);
        org.junit.Assert.assertNotNull(chromosome_array56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(chromosome_array64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "[]" + "'", str69.equals("[]"));
        org.junit.Assert.assertTrue(i73 == 100);
        org.junit.Assert.assertTrue(i74 == 100);
        org.junit.Assert.assertTrue(d75 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array79);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(list_chromosome83);
        org.junit.Assert.assertNotNull(list_chromosome84);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + 1.0d + "'", obj88.equals(1.0d));
    }
}

