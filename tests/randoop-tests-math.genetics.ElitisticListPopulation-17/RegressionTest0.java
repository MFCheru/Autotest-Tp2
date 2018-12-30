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
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 0, 0.0d);
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
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, 100.0d);
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
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 10.0f);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (byte) 0);
        java.util.Map map8 = null;
        try {
            defaultedMap1.putAll(map8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) -1 + "'", obj5.equals((short) -1));
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) predicate9);
        java.util.Collection collection12 = defaultedMap1.values();
        java.util.Collection collection13 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) -1 + "'", obj11.equals((short) -1));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (-1), (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate(map4, (java.lang.Object) false);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) predicate9);
        java.util.Collection collection12 = defaultedMap1.values();
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) -1 + "'", obj11.equals((short) -1));
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 10.0f);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) -1 + "'", obj5.equals((short) -1));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 0);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        try {
            elitisticListPopulation2.setPopulationLimit((-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 100L);
        java.util.Set set4 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        double d8 = elitisticListPopulation2.getElitismRate();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        double d13 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(d13 == 0.0d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) b3);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        double d8 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i12 = elitisticListPopulation11.getPopulationSize();
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation11.addChromosome(chromosome13);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation11.addChromosome(chromosome15);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome17 = elitisticListPopulation11.spliterator();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation11.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) 'a', (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome17);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.keySet();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b6 = defaultedMap4.equals((java.lang.Object) (byte) 1);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.Object obj14 = defaultedMap4.get((java.lang.Object) predicate12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate18, predicate23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (byte) 1);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        java.lang.Object obj37 = defaultedMap27.get((java.lang.Object) predicate35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate41, predicate46);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate46);
        java.util.Set set50 = defaultedMap1.keySet();
        java.util.Set set51 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b55 = defaultedMap53.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj57 = defaultedMap53.get((java.lang.Object) 10.0f);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) 1L);
        boolean b60 = defaultedMap1.containsKey((java.lang.Object) map59);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) -1 + "'", obj14.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) -1 + "'", obj37.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + (short) -1 + "'", obj57.equals((short) -1));
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        elitisticListPopulation2.setElitismRate(1.0d);
        java.util.Collection<math.genetics.Chromosome> collection_chromosome10 = null;
        try {
            elitisticListPopulation2.addChromosomes(collection_chromosome10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        int i4 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        try {
            math.genetics.Chromosome chromosome6 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(population5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation8.addChromosome(chromosome12);
        double d14 = elitisticListPopulation8.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i18 = elitisticListPopulation17.getPopulationSize();
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation17.addChromosome(chromosome19);
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation17.addChromosome(chromosome21);
        double d23 = elitisticListPopulation17.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i27 = elitisticListPopulation26.getPopulationSize();
        math.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation26.addChromosome(chromosome28);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation26.addChromosome(chromosome30);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome32 = elitisticListPopulation26.spliterator();
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation26.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34);
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        try {
            elitisticListPopulation2.setElitismRate((double) '#');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(d23 == 0.0d);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome32);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 100L);
        java.util.Collection collection4 = defaultedMap1.values();
        int i5 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        try {
            math.genetics.Chromosome chromosome4 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i3 == 100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        double d8 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i12 = elitisticListPopulation11.getPopulationSize();
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation11.addChromosome(chromosome13);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation11.addChromosome(chromosome15);
        double d17 = elitisticListPopulation11.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i21 = elitisticListPopulation20.getPopulationSize();
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation20.addChromosome(chromosome22);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation20.addChromosome(chromosome24);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome26 = elitisticListPopulation20.spliterator();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation20.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        try {
            math.genetics.Population population33 = elitisticListPopulation2.nextGeneration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(d17 == 0.0d);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome26);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100L);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i15 = elitisticListPopulation14.getPopulationSize();
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation14.addChromosome(chromosome16);
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation14.addChromosome(chromosome18);
        double d20 = elitisticListPopulation14.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i24 = elitisticListPopulation23.getPopulationSize();
        math.genetics.Chromosome chromosome25 = null;
        elitisticListPopulation23.addChromosome(chromosome25);
        math.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation23.addChromosome(chromosome27);
        double d29 = elitisticListPopulation23.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i33 = elitisticListPopulation32.getPopulationSize();
        math.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation32.addChromosome(chromosome34);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation32.addChromosome(chromosome36);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome38 = elitisticListPopulation32.spliterator();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        elitisticListPopulation32.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40);
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40);
        java.lang.Object obj46 = defaultedMap1.remove((java.lang.Object) arraylist_chromosome40);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap48.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b53 = defaultedMap51.equals((java.lang.Object) (byte) 1);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        java.lang.Object obj61 = defaultedMap51.get((java.lang.Object) predicate59);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate64, predicate65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate69, predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate65, predicate70);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b76 = defaultedMap74.equals((java.lang.Object) (byte) 1);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate81, predicate82);
        java.lang.Object obj84 = defaultedMap74.get((java.lang.Object) predicate82);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap86, predicate87, predicate88);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate92 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate93 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap91, predicate92, predicate93);
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate88, predicate93);
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate70, predicate93);
        java.util.Set set97 = defaultedMap48.keySet();
        java.util.Collection collection98 = defaultedMap48.values();
        boolean b99 = defaultedMap1.containsKey((java.lang.Object) defaultedMap48);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(d29 == 0.0d);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome38);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (short) -1 + "'", obj61.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + (short) -1 + "'", obj84.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(set97);
        org.junit.Assert.assertNotNull(collection98);
        org.junit.Assert.assertTrue(b99 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsValue(obj5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i11 = elitisticListPopulation10.getPopulationSize();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation10.addChromosome(chromosome12);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) elitisticListPopulation10);
        defaultedMap1.clear();
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) 100);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        double d8 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i12 = elitisticListPopulation11.getPopulationSize();
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation11.addChromosome(chromosome13);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation11.addChromosome(chromosome15);
        double d17 = elitisticListPopulation11.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i21 = elitisticListPopulation20.getPopulationSize();
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation20.addChromosome(chromosome22);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation20.addChromosome(chromosome24);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome26 = elitisticListPopulation20.spliterator();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation20.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(d17 == 0.0d);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome26);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(d4 == 0.0d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap5.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (byte) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.lang.Object obj18 = defaultedMap8.get((java.lang.Object) predicate16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate22, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b33 = defaultedMap31.equals((java.lang.Object) (byte) 1);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        java.lang.Object obj41 = defaultedMap31.get((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate45, predicate50);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate27, predicate50);
        java.util.Set set54 = defaultedMap5.keySet();
        java.util.Set set55 = defaultedMap5.entrySet();
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) set55);
        collections.Transformer transformer57 = null;
        try {
            java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) -1 + "'", obj18.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) -1 + "'", obj41.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (short) -1 + "'", obj56.equals((short) -1));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation2.spliterator();
        double d9 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertTrue(d9 == 0.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Set set2 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i5 = elitisticListPopulation4.getPopulationLimit();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) elitisticListPopulation4);
        double d7 = elitisticListPopulation4.getElitismRate();
        org.junit.Assert.assertTrue(i5 == 100);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0f + "'", obj6.equals(100.0f));
        org.junit.Assert.assertTrue(d7 == 0.0d);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        double d8 = elitisticListPopulation2.getElitismRate();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation2.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation2.iterator();
        int i15 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertTrue(i15 == 100);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsValue(obj5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i11 = elitisticListPopulation10.getPopulationSize();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation10.addChromosome(chromosome12);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) elitisticListPopulation10);
        int i15 = elitisticListPopulation10.getPopulationLimit();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 100);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b6 = defaultedMap4.equals((java.lang.Object) (byte) 1);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.Object obj14 = defaultedMap4.get((java.lang.Object) predicate12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate18, predicate23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (byte) 1);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        java.lang.Object obj37 = defaultedMap27.get((java.lang.Object) predicate35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate41, predicate46);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate46);
        java.util.Set set50 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) 100L);
        java.lang.Object obj55 = defaultedMap1.get((java.lang.Object) 100L);
        boolean b56 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) -1 + "'", obj14.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) -1 + "'", obj37.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (short) -1 + "'", obj55.equals((short) -1));
        org.junit.Assert.assertTrue(b56 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b4 = defaultedMap3.isEmpty();
        java.lang.Object obj6 = defaultedMap3.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (byte) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.lang.Object obj18 = defaultedMap8.get((java.lang.Object) predicate16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate22, predicate27);
        java.lang.Object obj30 = defaultedMap3.get((java.lang.Object) defaultedMap8);
        java.util.Set set31 = defaultedMap8.entrySet();
        boolean b32 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.Transformer transformer33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) -1 + "'", obj18.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) -1 + "'", obj30.equals((short) -1));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 100L);
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i7 = elitisticListPopulation6.getPopulationSize();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation6.addChromosome(chromosome8);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation6.addChromosome(chromosome10);
        double d12 = elitisticListPopulation6.getElitismRate();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation6.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome17 = arraylist_chromosome14.spliterator();
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome17);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b5 = defaultedMap4.isEmpty();
        java.lang.String str6 = defaultedMap4.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b13 = defaultedMap11.equals((java.lang.Object) (byte) 1);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        java.lang.Object obj21 = defaultedMap11.get((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate25, predicate30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b36 = defaultedMap34.equals((java.lang.Object) (byte) 1);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        java.lang.Object obj44 = defaultedMap34.get((java.lang.Object) predicate42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate52, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate48, predicate53);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate30, predicate53);
        java.util.Set set57 = defaultedMap8.keySet();
        java.util.Set set58 = defaultedMap8.entrySet();
        java.lang.Object obj59 = defaultedMap4.get((java.lang.Object) set58);
        int i60 = defaultedMap4.size();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b64 = defaultedMap63.isEmpty();
        java.lang.String str65 = defaultedMap63.toString();
        collections.PredicateUtils predicateUtils66 = new collections.PredicateUtils();
        java.lang.Object obj67 = defaultedMap63.remove((java.lang.Object) predicateUtils66);
        boolean b68 = defaultedMap1.equals(obj67);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) -1 + "'", obj21.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) -1 + "'", obj44.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (short) -1 + "'", obj59.equals((short) -1));
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b68 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) "{}");
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.util.Collection collection14 = defaultedMap7.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        int i4 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 10.0f);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        boolean b13 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        java.lang.String str14 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (byte) 1);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        java.lang.Object obj31 = defaultedMap21.get((java.lang.Object) predicate29);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate35, predicate40);
        java.lang.Object obj43 = defaultedMap16.get((java.lang.Object) defaultedMap21);
        java.lang.Object obj44 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) -1 + "'", obj5.equals((short) -1));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) -1 + "'", obj31.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (short) -1 + "'", obj43.equals((short) -1));
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) -1 + "'", obj44.equals((short) -1));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        int i4 = elitisticListPopulation2.getPopulationSize();
        double d5 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(d5 == 0.0d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 100L);
        java.util.Map map4 = null;
        try {
            defaultedMap1.putAll(map4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        java.util.Collection<math.genetics.Chromosome> collection_chromosome3 = null;
        try {
            elitisticListPopulation2.addChromosomes(collection_chromosome3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation2.spliterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(list_chromosome15);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsValue(obj5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i11 = elitisticListPopulation10.getPopulationSize();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation10.addChromosome(chromosome12);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) elitisticListPopulation10);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i19 = elitisticListPopulation18.getPopulationSize();
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation18.addChromosome(chromosome20);
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation18.addChromosome(chromosome22);
        double d24 = elitisticListPopulation18.getElitismRate();
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) d24);
        collections.Transformer transformer26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) -1 + "'", obj25.equals((short) -1));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100L);
        java.util.Collection collection5 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        double d8 = elitisticListPopulation2.getElitismRate();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation2.spliterator();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        elitisticListPopulation2.setPopulationLimit((int) (byte) 10);
        double d17 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
        org.junit.Assert.assertTrue(d17 == 0.0d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100L);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i15 = elitisticListPopulation14.getPopulationSize();
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation14.addChromosome(chromosome16);
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation14.addChromosome(chromosome18);
        double d20 = elitisticListPopulation14.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i24 = elitisticListPopulation23.getPopulationSize();
        math.genetics.Chromosome chromosome25 = null;
        elitisticListPopulation23.addChromosome(chromosome25);
        math.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation23.addChromosome(chromosome27);
        double d29 = elitisticListPopulation23.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i33 = elitisticListPopulation32.getPopulationSize();
        math.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation32.addChromosome(chromosome34);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation32.addChromosome(chromosome36);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome38 = elitisticListPopulation32.spliterator();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        elitisticListPopulation32.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40);
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40);
        java.lang.Object obj46 = defaultedMap1.remove((java.lang.Object) arraylist_chromosome40);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap48.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b53 = defaultedMap51.equals((java.lang.Object) (byte) 1);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        java.lang.Object obj61 = defaultedMap51.get((java.lang.Object) predicate59);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate64, predicate65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate69, predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate65, predicate70);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b76 = defaultedMap74.equals((java.lang.Object) (byte) 1);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate81, predicate82);
        java.lang.Object obj84 = defaultedMap74.get((java.lang.Object) predicate82);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap86, predicate87, predicate88);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate92 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate93 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap91, predicate92, predicate93);
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate88, predicate93);
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate70, predicate93);
        java.util.Set set97 = defaultedMap48.keySet();
        java.util.Set set98 = defaultedMap48.entrySet();
        java.lang.Object obj99 = defaultedMap1.get((java.lang.Object) set98);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(d29 == 0.0d);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome38);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (short) -1 + "'", obj61.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + (short) -1 + "'", obj84.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(set97);
        org.junit.Assert.assertNotNull(set98);
        org.junit.Assert.assertTrue("'" + obj99 + "' != '" + (short) -1 + "'", obj99.equals((short) -1));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.String str3 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) 10.0f);
        boolean b12 = defaultedMap6.containsKey((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        boolean b18 = defaultedMap6.equals((java.lang.Object) defaultedMap14);
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Transformer transformer20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) -1 + "'", obj10.equals((short) -1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.String str3 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) 10.0f);
        boolean b12 = defaultedMap6.containsKey((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        boolean b18 = defaultedMap6.equals((java.lang.Object) defaultedMap14);
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        int i20 = defaultedMap6.size();
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) -1 + "'", obj10.equals((short) -1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        double d4 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b8 = defaultedMap6.equals((java.lang.Object) 100L);
        java.util.Collection collection9 = defaultedMap6.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection9);
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(d4 == 0.0d);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        double d8 = elitisticListPopulation2.getElitismRate();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation2.spliterator();
        try {
            math.genetics.Chromosome chromosome14 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 10.0f);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        boolean b13 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        java.util.Set set14 = defaultedMap9.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) -1 + "'", obj5.equals((short) -1));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100L);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) 10.0f);
        boolean b19 = defaultedMap13.containsKey((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        boolean b25 = defaultedMap13.equals((java.lang.Object) defaultedMap21);
        java.lang.String str26 = defaultedMap21.toString();
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap21);
        java.lang.Object obj29 = defaultedMap7.remove((java.lang.Object) "hi!");
        java.util.Set set30 = defaultedMap7.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) -1 + "'", obj5.equals((short) -1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) -1 + "'", obj17.equals((short) -1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i5 = elitisticListPopulation4.getPopulationLimit();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) elitisticListPopulation4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i10 = elitisticListPopulation9.getPopulationSize();
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation9.addChromosome(chromosome11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b16 = defaultedMap14.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap14.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection21 = defaultedMap14.values();
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection21);
        elitisticListPopulation4.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection21);
        org.junit.Assert.assertTrue(i5 == 100);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0f + "'", obj6.equals(100.0f));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) -1 + "'", obj18.equals((short) -1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) "{}");
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.util.Set set14 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b17 = defaultedMap7.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b6 = defaultedMap5.isEmpty();
        java.lang.Object obj8 = defaultedMap5.remove((java.lang.Object) 100L);
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap5.containsValue(obj9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i15 = elitisticListPopulation14.getPopulationSize();
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation14.addChromosome(chromosome16);
        java.lang.Object obj18 = defaultedMap5.put((java.lang.Object) (byte) -1, (java.lang.Object) elitisticListPopulation14);
        math.genetics.Population population19 = elitisticListPopulation14.nextGeneration();
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) population19);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation2.spliterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        math.genetics.Population population15 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(population15);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation2.spliterator();
        try {
            elitisticListPopulation2.setPopulationLimit((-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b8 = defaultedMap7.isEmpty();
        java.lang.String str9 = defaultedMap7.toString();
        defaultedMap7.clear();
        java.util.Set set11 = defaultedMap7.entrySet();
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i16 = elitisticListPopulation15.getPopulationSize();
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation15.addChromosome(chromosome17);
        java.lang.String str19 = elitisticListPopulation15.toString();
        elitisticListPopulation15.setPopulationLimit((int) (byte) 100);
        boolean b22 = defaultedMap7.containsKey((java.lang.Object) (byte) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i26 = elitisticListPopulation25.getPopulationSize();
        math.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation25.addChromosome(chromosome27);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i32 = elitisticListPopulation31.getPopulationSize();
        math.genetics.Chromosome chromosome33 = null;
        elitisticListPopulation31.addChromosome(chromosome33);
        math.genetics.Chromosome chromosome35 = null;
        elitisticListPopulation31.addChromosome(chromosome35);
        double d37 = elitisticListPopulation31.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i41 = elitisticListPopulation40.getPopulationSize();
        math.genetics.Chromosome chromosome42 = null;
        elitisticListPopulation40.addChromosome(chromosome42);
        math.genetics.Chromosome chromosome44 = null;
        elitisticListPopulation40.addChromosome(chromosome44);
        double d46 = elitisticListPopulation40.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i50 = elitisticListPopulation49.getPopulationSize();
        math.genetics.Chromosome chromosome51 = null;
        elitisticListPopulation49.addChromosome(chromosome51);
        math.genetics.Chromosome chromosome53 = null;
        elitisticListPopulation49.addChromosome(chromosome53);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome55 = elitisticListPopulation49.spliterator();
        math.genetics.Chromosome[] chromosome_array56 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome57 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b58 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57, chromosome_array56);
        elitisticListPopulation49.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome57);
        elitisticListPopulation40.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57);
        elitisticListPopulation31.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57);
        elitisticListPopulation25.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome57);
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) arraylist_chromosome57);
        boolean b64 = defaultedMap7.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[null]" + "'", str19.equals("[null]"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(d37 == 0.0d);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(d46 == 0.0d);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome55);
        org.junit.Assert.assertNotNull(chromosome_array56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b64 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        double d8 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i12 = elitisticListPopulation11.getPopulationSize();
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation11.addChromosome(chromosome13);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation11.addChromosome(chromosome15);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome17 = elitisticListPopulation11.spliterator();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation11.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, 0, (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome17);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate20);
        java.util.Collection collection23 = defaultedMap1.values();
        collections.Factory factory24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) -1 + "'", obj11.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i8 = elitisticListPopulation7.getPopulationSize();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation7.addChromosome(chromosome9);
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation7.addChromosome(chromosome11);
        elitisticListPopulation7.setElitismRate(1.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome15);
        elitisticListPopulation2.setElitismRate(0.0d);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome15);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation2.spliterator();
        java.lang.String str9 = elitisticListPopulation2.toString();
        int i10 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation2.spliterator();
        java.lang.String str12 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[null, null]" + "'", str9.equals("[null, null]"));
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[null, null]" + "'", str12.equals("[null, null]"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.lang.String str6 = elitisticListPopulation2.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i10 = elitisticListPopulation9.getPopulationSize();
        int i11 = elitisticListPopulation9.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i15 = elitisticListPopulation14.getPopulationSize();
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation14.addChromosome(chromosome16);
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation14.addChromosome(chromosome18);
        elitisticListPopulation14.setElitismRate(1.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation9.setChromosomes(list_chromosome22);
        elitisticListPopulation2.setChromosomes(list_chromosome22);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation(list_chromosome22, (int) (short) -1, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[null]" + "'", str6.equals("[null]"));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 100);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(list_chromosome22);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i5 = elitisticListPopulation4.getPopulationLimit();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) elitisticListPopulation4);
        math.genetics.Population population7 = elitisticListPopulation4.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation4.spliterator();
        org.junit.Assert.assertTrue(i5 == 100);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0f + "'", obj6.equals(100.0f));
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Set set5 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation2.spliterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation2.addChromosome(chromosome15);
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation2.addChromosome(chromosome17);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i5 = elitisticListPopulation4.getPopulationLimit();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) elitisticListPopulation4);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i5 == 100);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0f + "'", obj6.equals(100.0f));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        try {
            math.genetics.Chromosome chromosome6 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsValue(obj5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i11 = elitisticListPopulation10.getPopulationSize();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation10.addChromosome(chromosome12);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) elitisticListPopulation10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        java.lang.String str18 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b25 = defaultedMap23.equals((java.lang.Object) (byte) 1);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        java.lang.Object obj33 = defaultedMap23.get((java.lang.Object) predicate31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate37, predicate42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b48 = defaultedMap46.equals((java.lang.Object) (byte) 1);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate53, predicate54);
        java.lang.Object obj56 = defaultedMap46.get((java.lang.Object) predicate54);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate59, predicate60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate64, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate60, predicate65);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate42, predicate65);
        java.util.Set set69 = defaultedMap20.keySet();
        java.util.Set set70 = defaultedMap20.entrySet();
        java.lang.Object obj71 = defaultedMap16.get((java.lang.Object) set70);
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap16);
        java.lang.String str73 = defaultedMap16.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) -1 + "'", obj33.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (short) -1 + "'", obj56.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (short) -1 + "'", obj71.equals((short) -1));
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        int i4 = elitisticListPopulation2.getPopulationSize();
        try {
            math.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b5 = defaultedMap4.isEmpty();
        java.lang.String str6 = defaultedMap4.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b13 = defaultedMap11.equals((java.lang.Object) (byte) 1);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        java.lang.Object obj21 = defaultedMap11.get((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate25, predicate30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b36 = defaultedMap34.equals((java.lang.Object) (byte) 1);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        java.lang.Object obj44 = defaultedMap34.get((java.lang.Object) predicate42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate52, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate48, predicate53);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate30, predicate53);
        java.util.Set set57 = defaultedMap8.keySet();
        java.util.Set set58 = defaultedMap8.entrySet();
        java.lang.Object obj59 = defaultedMap4.get((java.lang.Object) set58);
        int i60 = defaultedMap4.size();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap4);
        java.util.Set set62 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) -1 + "'", obj21.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) -1 + "'", obj44.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (short) -1 + "'", obj59.equals((short) -1));
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(set62);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 10.0f);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) 10.0f);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj13);
        int i15 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) -1 + "'", obj5.equals((short) -1));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) -1 + "'", obj13.equals((short) -1));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i5 = elitisticListPopulation4.getPopulationLimit();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) elitisticListPopulation4);
        int i7 = elitisticListPopulation4.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i11 = elitisticListPopulation10.getPopulationSize();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation10.addChromosome(chromosome12);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation10.addChromosome(chromosome14);
        elitisticListPopulation10.setPopulationLimit(10);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation4.setChromosomes(list_chromosome18);
        org.junit.Assert.assertTrue(i5 == 100);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0f + "'", obj6.equals(100.0f));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(list_chromosome18);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.lang.String str4 = elitisticListPopulation2.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i8 = elitisticListPopulation7.getPopulationSize();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation7.addChromosome(chromosome9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) 10.0f);
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection19 = defaultedMap12.values();
        elitisticListPopulation7.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection19);
        int i21 = elitisticListPopulation7.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i25 = elitisticListPopulation24.getPopulationSize();
        int i26 = elitisticListPopulation24.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i30 = elitisticListPopulation29.getPopulationSize();
        math.genetics.Chromosome chromosome31 = null;
        elitisticListPopulation29.addChromosome(chromosome31);
        math.genetics.Chromosome chromosome33 = null;
        elitisticListPopulation29.addChromosome(chromosome33);
        elitisticListPopulation29.setElitismRate(1.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome37 = elitisticListPopulation29.getChromosomes();
        elitisticListPopulation24.setChromosomes(list_chromosome37);
        elitisticListPopulation7.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome37);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome37);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short) -1 + "'", obj16.equals((short) -1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(i21 == 100);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == 100);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(list_chromosome37);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        double d3 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) '#');
        org.junit.Assert.assertTrue(d3 == 0.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        int i4 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setElitismRate((double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b8 = defaultedMap7.isEmpty();
        java.lang.String str9 = defaultedMap7.toString();
        defaultedMap7.clear();
        java.util.Set set11 = defaultedMap7.entrySet();
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i16 = elitisticListPopulation15.getPopulationSize();
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation15.addChromosome(chromosome17);
        java.lang.String str19 = elitisticListPopulation15.toString();
        elitisticListPopulation15.setPopulationLimit((int) (byte) 100);
        boolean b22 = defaultedMap7.containsKey((java.lang.Object) (byte) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i26 = elitisticListPopulation25.getPopulationSize();
        math.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation25.addChromosome(chromosome27);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i32 = elitisticListPopulation31.getPopulationSize();
        math.genetics.Chromosome chromosome33 = null;
        elitisticListPopulation31.addChromosome(chromosome33);
        math.genetics.Chromosome chromosome35 = null;
        elitisticListPopulation31.addChromosome(chromosome35);
        double d37 = elitisticListPopulation31.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i41 = elitisticListPopulation40.getPopulationSize();
        math.genetics.Chromosome chromosome42 = null;
        elitisticListPopulation40.addChromosome(chromosome42);
        math.genetics.Chromosome chromosome44 = null;
        elitisticListPopulation40.addChromosome(chromosome44);
        double d46 = elitisticListPopulation40.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i50 = elitisticListPopulation49.getPopulationSize();
        math.genetics.Chromosome chromosome51 = null;
        elitisticListPopulation49.addChromosome(chromosome51);
        math.genetics.Chromosome chromosome53 = null;
        elitisticListPopulation49.addChromosome(chromosome53);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome55 = elitisticListPopulation49.spliterator();
        math.genetics.Chromosome[] chromosome_array56 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome57 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b58 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57, chromosome_array56);
        elitisticListPopulation49.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome57);
        elitisticListPopulation40.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57);
        elitisticListPopulation31.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57);
        elitisticListPopulation25.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome57);
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) arraylist_chromosome57);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap65.clear();
        defaultedMap65.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation70 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i71 = elitisticListPopulation70.getPopulationSize();
        math.genetics.Chromosome chromosome72 = null;
        elitisticListPopulation70.addChromosome(chromosome72);
        java.lang.String str74 = elitisticListPopulation70.toString();
        elitisticListPopulation70.setPopulationLimit((int) (byte) 100);
        java.lang.Object obj77 = defaultedMap7.put((java.lang.Object) defaultedMap65, (java.lang.Object) elitisticListPopulation70);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[null]" + "'", str19.equals("[null]"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(d37 == 0.0d);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(d46 == 0.0d);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome55);
        org.junit.Assert.assertNotNull(chromosome_array56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "[null]" + "'", str74.equals("[null]"));
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, 1.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) predicate9);
        int i12 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap16.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (byte) 1);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.lang.Object obj29 = defaultedMap19.get((java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate33, predicate38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b44 = defaultedMap42.equals((java.lang.Object) (byte) 1);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        java.lang.Object obj52 = defaultedMap42.get((java.lang.Object) predicate50);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate60, predicate61);
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate56, predicate61);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate38, predicate61);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate67, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate38, predicate68);
        java.util.Set set71 = defaultedMap14.keySet();
        boolean b73 = defaultedMap14.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj74 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        math.genetics.ElitisticListPopulation elitisticListPopulation77 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i78 = elitisticListPopulation77.getPopulationSize();
        math.genetics.Chromosome chromosome79 = null;
        elitisticListPopulation77.addChromosome(chromosome79);
        math.genetics.Chromosome chromosome81 = null;
        elitisticListPopulation77.addChromosome(chromosome81);
        elitisticListPopulation77.setElitismRate(1.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome85 = elitisticListPopulation77.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation88 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i89 = elitisticListPopulation88.getPopulationLimit();
        int i90 = elitisticListPopulation88.getPopulationSize();
        java.lang.Object obj91 = defaultedMap14.put((java.lang.Object) list_chromosome85, (java.lang.Object) elitisticListPopulation88);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) -1 + "'", obj11.equals((short) -1));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (short) -1 + "'", obj29.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (short) -1 + "'", obj52.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (short) -1 + "'", obj74.equals((short) -1));
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertNotNull(list_chromosome85);
        org.junit.Assert.assertTrue(i89 == 100);
        org.junit.Assert.assertTrue(i90 == 0);
        org.junit.Assert.assertNull(obj91);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation8.addChromosome(chromosome10);
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation8.addChromosome(chromosome12);
        double d14 = elitisticListPopulation8.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i18 = elitisticListPopulation17.getPopulationSize();
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation17.addChromosome(chromosome19);
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation17.addChromosome(chromosome21);
        double d23 = elitisticListPopulation17.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i27 = elitisticListPopulation26.getPopulationSize();
        math.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation26.addChromosome(chromosome28);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation26.addChromosome(chromosome30);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome32 = elitisticListPopulation26.spliterator();
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation26.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34);
        elitisticListPopulation2.setPopulationLimit(1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(d23 == 0.0d);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome32);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        int i4 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (byte) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.lang.Object obj16 = defaultedMap6.get((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate20, predicate25);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.util.Set set29 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap31.clear();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b36 = defaultedMap34.equals((java.lang.Object) (byte) 1);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        java.lang.Object obj44 = defaultedMap34.get((java.lang.Object) predicate42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate52, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate48, predicate53);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b59 = defaultedMap57.equals((java.lang.Object) (byte) 1);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate64, predicate65);
        java.lang.Object obj67 = defaultedMap57.get((java.lang.Object) predicate65);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate70, predicate71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate75, predicate76);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate71, predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate53, predicate76);
        java.lang.Object obj80 = defaultedMap6.get((java.lang.Object) predicate76);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short) -1 + "'", obj16.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) -1 + "'", obj28.equals((short) -1));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) -1 + "'", obj44.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + (short) -1 + "'", obj67.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + (short) -1 + "'", obj80.equals((short) -1));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        double d8 = elitisticListPopulation2.getElitismRate();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation2.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation2.iterator();
        try {
            elitisticListPopulation2.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) "{}");
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation2.spliterator();
        java.lang.String str9 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) 10.0f);
        boolean b19 = defaultedMap13.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection20 = defaultedMap13.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection20);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[null, null]" + "'", str9.equals("[null, null]"));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) -1 + "'", obj17.equals((short) -1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        double d8 = elitisticListPopulation2.getElitismRate();
        int i9 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertTrue(i9 == 2);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) predicate9);
        int i12 = defaultedMap1.size();
        java.util.Set set13 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) -1 + "'", obj11.equals((short) -1));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.lang.String str6 = elitisticListPopulation2.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i10 = elitisticListPopulation9.getPopulationSize();
        int i11 = elitisticListPopulation9.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i15 = elitisticListPopulation14.getPopulationSize();
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation14.addChromosome(chromosome16);
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation14.addChromosome(chromosome18);
        elitisticListPopulation14.setElitismRate(1.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation9.setChromosomes(list_chromosome22);
        elitisticListPopulation2.setChromosomes(list_chromosome22);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation(list_chromosome22, (int) (short) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[null]" + "'", str6.equals("[null]"));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 100);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(list_chromosome22);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.String str3 = defaultedMap1.toString();
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) predicateUtils4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b8 = defaultedMap7.isEmpty();
        java.lang.String str9 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b16 = defaultedMap14.equals((java.lang.Object) (byte) 1);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        java.lang.Object obj24 = defaultedMap14.get((java.lang.Object) predicate22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate28, predicate33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap37.equals((java.lang.Object) (byte) 1);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        java.lang.Object obj47 = defaultedMap37.get((java.lang.Object) predicate45);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate51, predicate56);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate33, predicate56);
        java.util.Set set60 = defaultedMap11.keySet();
        java.util.Set set61 = defaultedMap11.entrySet();
        java.lang.Object obj62 = defaultedMap7.get((java.lang.Object) set61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap64);
        math.genetics.ElitisticListPopulation elitisticListPopulation68 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome69 = elitisticListPopulation68.getChromosomes();
        boolean b70 = defaultedMap64.containsValue((java.lang.Object) list_chromosome69);
        boolean b71 = defaultedMap1.containsValue((java.lang.Object) b70);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) -1 + "'", obj24.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (short) -1 + "'", obj47.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + (short) -1 + "'", obj62.equals((short) -1));
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(list_chromosome69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.String str3 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.util.Set set5 = defaultedMap1.entrySet();
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (byte) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.lang.Object obj16 = defaultedMap6.get((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate20, predicate25);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b29 = defaultedMap6.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short) -1 + "'", obj16.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) -1 + "'", obj28.equals((short) -1));
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b6 = defaultedMap4.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 10.0f);
        boolean b10 = defaultedMap4.containsKey((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap4.equals((java.lang.Object) defaultedMap12);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        java.lang.String str18 = defaultedMap12.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) -1 + "'", obj8.equals((short) -1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) -1 + "'", obj17.equals((short) -1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 1L);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        try {
            math.genetics.Chromosome chromosome4 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 10.0f);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        boolean b13 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        java.lang.String str14 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100L);
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap16.containsValue(obj20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i26 = elitisticListPopulation25.getPopulationSize();
        math.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation25.addChromosome(chromosome27);
        java.lang.Object obj29 = defaultedMap16.put((java.lang.Object) (byte) -1, (java.lang.Object) elitisticListPopulation25);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b33 = defaultedMap31.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate38, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj48 = defaultedMap44.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate51, predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate38, predicate54);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate38, predicate57);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) -1 + "'", obj5.equals((short) -1));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) -1 + "'", obj35.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) -1 + "'", obj48.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.String str3 = defaultedMap1.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i7 = elitisticListPopulation6.getPopulationSize();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation6.addChromosome(chromosome8);
        java.lang.String str10 = elitisticListPopulation6.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i14 = elitisticListPopulation13.getPopulationSize();
        int i15 = elitisticListPopulation13.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i19 = elitisticListPopulation18.getPopulationSize();
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation18.addChromosome(chromosome20);
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation18.addChromosome(chromosome22);
        elitisticListPopulation18.setElitismRate(1.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation13.setChromosomes(list_chromosome26);
        elitisticListPopulation6.setChromosomes(list_chromosome26);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) list_chromosome26);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[null]" + "'", str10.equals("[null]"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i15 == 100);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(list_chromosome26);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (short) -1 + "'", obj29.equals((short) -1));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b6 = defaultedMap4.equals((java.lang.Object) (byte) 1);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.Object obj14 = defaultedMap4.get((java.lang.Object) predicate12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate18, predicate23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (byte) 1);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        java.lang.Object obj37 = defaultedMap27.get((java.lang.Object) predicate35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate41, predicate46);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate46);
        java.util.Set set50 = defaultedMap1.keySet();
        java.util.Set set51 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b54 = defaultedMap53.isEmpty();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b58 = defaultedMap56.containsKey((java.lang.Object) "hi!");
        java.lang.Object obj59 = defaultedMap53.remove((java.lang.Object) "hi!");
        java.lang.Object obj61 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10.0d);
        collections.Transformer transformer62 = null;
        try {
            java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) -1 + "'", obj14.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) -1 + "'", obj37.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        try {
            math.genetics.Chromosome chromosome3 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100L);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) 10.0f);
        boolean b19 = defaultedMap13.containsKey((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        boolean b25 = defaultedMap13.equals((java.lang.Object) defaultedMap21);
        java.lang.String str26 = defaultedMap21.toString();
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap21);
        boolean b28 = defaultedMap7.isEmpty();
        java.lang.Object obj30 = defaultedMap7.get((java.lang.Object) "");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) -1 + "'", obj5.equals((short) -1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) -1 + "'", obj17.equals((short) -1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 100.0f + "'", obj30.equals(100.0f));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i5 = elitisticListPopulation4.getPopulationSize();
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation4.addChromosome(chromosome6);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i11 = elitisticListPopulation10.getPopulationSize();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation10.addChromosome(chromosome12);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation10.addChromosome(chromosome14);
        double d16 = elitisticListPopulation10.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i20 = elitisticListPopulation19.getPopulationSize();
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation19.addChromosome(chromosome21);
        math.genetics.Chromosome chromosome23 = null;
        elitisticListPopulation19.addChromosome(chromosome23);
        double d25 = elitisticListPopulation19.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i29 = elitisticListPopulation28.getPopulationSize();
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation28.addChromosome(chromosome30);
        math.genetics.Chromosome chromosome32 = null;
        elitisticListPopulation28.addChromosome(chromosome32);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome34 = elitisticListPopulation28.spliterator();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        elitisticListPopulation28.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36);
        elitisticListPopulation10.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36);
        elitisticListPopulation4.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36);
        elitisticListPopulation4.setPopulationLimit((int) (short) 100);
        java.lang.Object obj44 = defaultedMap1.remove((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(d16 == 0.0d);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(d25 == 0.0d);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome34);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        double d8 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i12 = elitisticListPopulation11.getPopulationSize();
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation11.addChromosome(chromosome13);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation11.addChromosome(chromosome15);
        double d17 = elitisticListPopulation11.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i21 = elitisticListPopulation20.getPopulationSize();
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation20.addChromosome(chromosome22);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation20.addChromosome(chromosome24);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome26 = elitisticListPopulation20.spliterator();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation20.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, 10, (double) (byte) 1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(d17 == 0.0d);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome26);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b6 = defaultedMap4.equals((java.lang.Object) (byte) 1);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.Object obj14 = defaultedMap4.get((java.lang.Object) predicate12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate18, predicate23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (byte) 1);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        java.lang.Object obj37 = defaultedMap27.get((java.lang.Object) predicate35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate41, predicate46);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate46);
        java.util.Set set50 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) 100L);
        java.lang.Object obj55 = defaultedMap1.get((java.lang.Object) 100L);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i59 = elitisticListPopulation58.getPopulationSize();
        math.genetics.Chromosome chromosome60 = null;
        elitisticListPopulation58.addChromosome(chromosome60);
        math.genetics.Chromosome chromosome62 = null;
        elitisticListPopulation58.addChromosome(chromosome62);
        elitisticListPopulation58.setElitismRate(1.0d);
        math.genetics.Chromosome chromosome66 = null;
        elitisticListPopulation58.addChromosome(chromosome66);
        boolean b68 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation58);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) -1 + "'", obj14.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) -1 + "'", obj37.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (short) -1 + "'", obj55.equals((short) -1));
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(b68 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b25 = defaultedMap24.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) 10.0f);
        boolean b33 = defaultedMap27.containsKey((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        boolean b39 = defaultedMap27.equals((java.lang.Object) defaultedMap35);
        java.lang.Object obj40 = defaultedMap24.get((java.lang.Object) defaultedMap35);
        boolean b41 = defaultedMap1.equals((java.lang.Object) defaultedMap35);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) -1 + "'", obj11.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) -1 + "'", obj31.equals((short) -1));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short) -1 + "'", obj40.equals((short) -1));
        org.junit.Assert.assertTrue(b41 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        elitisticListPopulation2.setPopulationLimit(10);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome14);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(list_chromosome14);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) b3);
        boolean b5 = defaultedMap4.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i9 = elitisticListPopulation8.getPopulationSize();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b12 = defaultedMap11.isEmpty();
        java.lang.String str13 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (byte) 1);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.lang.Object obj28 = defaultedMap18.get((java.lang.Object) predicate26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate32, predicate37);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b43 = defaultedMap41.equals((java.lang.Object) (byte) 1);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        java.lang.Object obj51 = defaultedMap41.get((java.lang.Object) predicate49);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate54, predicate55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate59, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate55, predicate60);
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate37, predicate60);
        java.util.Set set64 = defaultedMap15.keySet();
        java.util.Set set65 = defaultedMap15.entrySet();
        java.lang.Object obj66 = defaultedMap11.get((java.lang.Object) set65);
        int i67 = defaultedMap11.size();
        java.util.Set set68 = defaultedMap11.keySet();
        java.lang.Object obj69 = defaultedMap4.put((java.lang.Object) elitisticListPopulation8, (java.lang.Object) set68);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b72 = defaultedMap71.isEmpty();
        java.lang.Object obj74 = defaultedMap71.get((java.lang.Object) (short) 1);
        boolean b75 = defaultedMap4.equals(obj74);
        collections.Predicate predicate76 = null;
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b80 = defaultedMap78.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj82 = defaultedMap78.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate85, predicate86);
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate85, predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate76, predicate85);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) -1 + "'", obj28.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (short) -1 + "'", obj51.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + (short) -1 + "'", obj66.equals((short) -1));
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (short) -1 + "'", obj74.equals((short) -1));
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (short) -1 + "'", obj82.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (byte) 1);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate19, predicate24);
        boolean b27 = defaultedMap1.containsValue((java.lang.Object) predicate24);
        java.util.Collection collection28 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (short) -1 + "'", obj15.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b4 = defaultedMap3.isEmpty();
        java.lang.Object obj6 = defaultedMap3.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (byte) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.lang.Object obj18 = defaultedMap8.get((java.lang.Object) predicate16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate22, predicate27);
        java.lang.Object obj30 = defaultedMap3.get((java.lang.Object) defaultedMap8);
        java.util.Set set31 = defaultedMap8.entrySet();
        boolean b32 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i36 = elitisticListPopulation35.getPopulationSize();
        math.genetics.Chromosome chromosome37 = null;
        elitisticListPopulation35.addChromosome(chromosome37);
        math.genetics.Chromosome chromosome39 = null;
        elitisticListPopulation35.addChromosome(chromosome39);
        double d41 = elitisticListPopulation35.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i45 = elitisticListPopulation44.getPopulationSize();
        math.genetics.Chromosome chromosome46 = null;
        elitisticListPopulation44.addChromosome(chromosome46);
        math.genetics.Chromosome chromosome48 = null;
        elitisticListPopulation44.addChromosome(chromosome48);
        double d50 = elitisticListPopulation44.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i54 = elitisticListPopulation53.getPopulationSize();
        math.genetics.Chromosome chromosome55 = null;
        elitisticListPopulation53.addChromosome(chromosome55);
        math.genetics.Chromosome chromosome57 = null;
        elitisticListPopulation53.addChromosome(chromosome57);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome59 = elitisticListPopulation53.spliterator();
        math.genetics.Chromosome[] chromosome_array60 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome61 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61, chromosome_array60);
        elitisticListPopulation53.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome61);
        elitisticListPopulation44.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61);
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61);
        int i66 = elitisticListPopulation35.getPopulationSize();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b70 = defaultedMap68.equals((java.lang.Object) (byte) 1);
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate75, predicate76);
        java.lang.Object obj78 = defaultedMap68.get((java.lang.Object) predicate76);
        java.util.Collection collection79 = defaultedMap68.values();
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection79);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap82, predicate83, predicate84);
        java.lang.Object obj86 = defaultedMap1.put((java.lang.Object) collection79, (java.lang.Object) predicate84);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) -1 + "'", obj18.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) -1 + "'", obj30.equals((short) -1));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(d41 == 0.0d);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(d50 == 0.0d);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome59);
        org.junit.Assert.assertNotNull(chromosome_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i66 == 2);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + (short) -1 + "'", obj78.equals((short) -1));
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNull(obj86);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(population6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate11);
        java.util.Set set13 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) -1 + "'", obj5.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.String str3 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) 10.0f);
        boolean b12 = defaultedMap6.containsKey((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        boolean b18 = defaultedMap6.equals((java.lang.Object) defaultedMap14);
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        int i20 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b27 = defaultedMap25.equals((java.lang.Object) (byte) 1);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        java.lang.Object obj35 = defaultedMap25.get((java.lang.Object) predicate33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate39, predicate44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b50 = defaultedMap48.equals((java.lang.Object) (byte) 1);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        java.lang.Object obj58 = defaultedMap48.get((java.lang.Object) predicate56);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate61, predicate62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate66, predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate62, predicate67);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate44, predicate67);
        math.genetics.ElitisticListPopulation elitisticListPopulation73 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i74 = elitisticListPopulation73.getPopulationSize();
        math.genetics.Chromosome chromosome75 = null;
        elitisticListPopulation73.addChromosome(chromosome75);
        math.genetics.Chromosome chromosome77 = null;
        elitisticListPopulation73.addChromosome(chromosome77);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome79 = elitisticListPopulation73.spliterator();
        math.genetics.Chromosome[] chromosome_array80 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome81 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b82 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome81, chromosome_array80);
        elitisticListPopulation73.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome81);
        boolean b84 = defaultedMap22.equals((java.lang.Object) arraylist_chromosome81);
        java.lang.Object obj85 = defaultedMap6.get((java.lang.Object) defaultedMap22);
        java.util.Map map86 = null;
        try {
            defaultedMap22.putAll(map86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) -1 + "'", obj10.equals((short) -1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) -1 + "'", obj35.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (short) -1 + "'", obj58.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome79);
        org.junit.Assert.assertNotNull(chromosome_array80);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + (short) -1 + "'", obj85.equals((short) -1));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsValue(obj5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i11 = elitisticListPopulation10.getPopulationSize();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation10.addChromosome(chromosome12);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) elitisticListPopulation10);
        java.lang.String str15 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{-1=[null]}" + "'", str15.equals("{-1=[null]}"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (byte) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.lang.Object obj16 = defaultedMap6.get((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate20, predicate25);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b31 = defaultedMap1.equals((java.lang.Object) defaultedMap30);
        boolean b32 = defaultedMap30.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short) -1 + "'", obj16.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) -1 + "'", obj28.equals((short) -1));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        int i6 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsValue(obj5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i11 = elitisticListPopulation10.getPopulationSize();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation10.addChromosome(chromosome12);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) elitisticListPopulation10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 100L);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i22 = elitisticListPopulation21.getPopulationSize();
        math.genetics.Chromosome chromosome23 = null;
        elitisticListPopulation21.addChromosome(chromosome23);
        math.genetics.Chromosome chromosome25 = null;
        elitisticListPopulation21.addChromosome(chromosome25);
        elitisticListPopulation21.setElitismRate(1.0d);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) 10.0f);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 1L);
        java.lang.Object obj37 = defaultedMap16.put((java.lang.Object) 1.0d, (java.lang.Object) defaultedMap30);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i42 = elitisticListPopulation41.getPopulationSize();
        math.genetics.Chromosome chromosome43 = null;
        elitisticListPopulation41.addChromosome(chromosome43);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i48 = elitisticListPopulation47.getPopulationSize();
        math.genetics.Chromosome chromosome49 = null;
        elitisticListPopulation47.addChromosome(chromosome49);
        math.genetics.Chromosome chromosome51 = null;
        elitisticListPopulation47.addChromosome(chromosome51);
        double d53 = elitisticListPopulation47.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation56 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i57 = elitisticListPopulation56.getPopulationSize();
        math.genetics.Chromosome chromosome58 = null;
        elitisticListPopulation56.addChromosome(chromosome58);
        math.genetics.Chromosome chromosome60 = null;
        elitisticListPopulation56.addChromosome(chromosome60);
        double d62 = elitisticListPopulation56.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation65 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i66 = elitisticListPopulation65.getPopulationSize();
        math.genetics.Chromosome chromosome67 = null;
        elitisticListPopulation65.addChromosome(chromosome67);
        math.genetics.Chromosome chromosome69 = null;
        elitisticListPopulation65.addChromosome(chromosome69);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome71 = elitisticListPopulation65.spliterator();
        math.genetics.Chromosome[] chromosome_array72 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome73 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b74 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome73, chromosome_array72);
        elitisticListPopulation65.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome73);
        elitisticListPopulation56.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome73);
        elitisticListPopulation47.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome73);
        elitisticListPopulation41.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome73);
        boolean b79 = defaultedMap16.containsValue((java.lang.Object) arraylist_chromosome73);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) -1 + "'", obj34.equals((short) -1));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue(d53 == 0.0d);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(d62 == 0.0d);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome71);
        org.junit.Assert.assertNotNull(chromosome_array72);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (byte) 1);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate19, predicate24);
        boolean b27 = defaultedMap1.containsValue((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b30 = defaultedMap29.isEmpty();
        java.lang.String str31 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap33.clear();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (byte) 1);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate43, predicate44);
        java.lang.Object obj46 = defaultedMap36.get((java.lang.Object) predicate44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate50, predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b61 = defaultedMap59.equals((java.lang.Object) (byte) 1);
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate66, predicate67);
        java.lang.Object obj69 = defaultedMap59.get((java.lang.Object) predicate67);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate72, predicate73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate77, predicate78);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate73, predicate78);
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate55, predicate78);
        java.util.Set set82 = defaultedMap33.keySet();
        java.util.Set set83 = defaultedMap33.entrySet();
        java.lang.Object obj84 = defaultedMap29.get((java.lang.Object) set83);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) defaultedMap86);
        java.util.Collection collection88 = defaultedMap86.values();
        java.util.Map map89 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) collection88);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (short) -1 + "'", obj15.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (short) -1 + "'", obj46.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + (short) -1 + "'", obj69.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + (short) -1 + "'", obj84.equals((short) -1));
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(collection88);
        org.junit.Assert.assertNotNull(map89);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) predicate9);
        int i12 = defaultedMap1.size();
        int i13 = defaultedMap1.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation16.getChromosomes();
        int i18 = elitisticListPopulation16.getPopulationSize();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) elitisticListPopulation16);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) -1 + "'", obj11.equals((short) -1));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) -1 + "'", obj19.equals((short) -1));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        int i4 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        math.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        java.lang.String str9 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[null]" + "'", str9.equals("[null]"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setElitismRate(0.0d);
        try {
            math.genetics.Chromosome chromosome6 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsValue(obj5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i11 = elitisticListPopulation10.getPopulationSize();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation10.addChromosome(chromosome12);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) elitisticListPopulation10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate23, predicate26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate36, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i43 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) -1 + "'", obj20.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) -1 + "'", obj33.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(i43 == 1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i11 = elitisticListPopulation10.getPopulationSize();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation10.addChromosome(chromosome12);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation10.addChromosome(chromosome14);
        double d16 = elitisticListPopulation10.getElitismRate();
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation10.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = elitisticListPopulation10.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation10.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i26 = elitisticListPopulation25.getPopulationSize();
        math.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation25.addChromosome(chromosome27);
        math.genetics.Chromosome chromosome29 = null;
        elitisticListPopulation25.addChromosome(chromosome29);
        double d31 = elitisticListPopulation25.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i35 = elitisticListPopulation34.getPopulationSize();
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation34.addChromosome(chromosome36);
        math.genetics.Chromosome chromosome38 = null;
        elitisticListPopulation34.addChromosome(chromosome38);
        double d40 = elitisticListPopulation34.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i44 = elitisticListPopulation43.getPopulationSize();
        math.genetics.Chromosome chromosome45 = null;
        elitisticListPopulation43.addChromosome(chromosome45);
        math.genetics.Chromosome chromosome47 = null;
        elitisticListPopulation43.addChromosome(chromosome47);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome49 = elitisticListPopulation43.spliterator();
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        elitisticListPopulation43.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome51);
        elitisticListPopulation34.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51);
        elitisticListPopulation25.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51);
        elitisticListPopulation10.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome51);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(d16 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertNotNull(list_chromosome22);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(d31 == 0.0d);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(d40 == 0.0d);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome49);
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (byte) 1);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) predicate15);
        int i18 = defaultedMap7.size();
        int i19 = defaultedMap7.size();
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) i19);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) -1 + "'", obj17.equals((short) -1));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i5 = elitisticListPopulation4.getPopulationLimit();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) elitisticListPopulation4);
        math.genetics.Population population7 = elitisticListPopulation4.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation4.iterator();
        org.junit.Assert.assertTrue(i5 == 100);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0f + "'", obj6.equals(100.0f));
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 10.0f);
        boolean b13 = defaultedMap7.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection14 = defaultedMap7.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection14);
        int i16 = elitisticListPopulation2.getPopulationLimit();
        int i17 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation2.addChromosome(chromosome18);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) -1 + "'", obj11.equals((short) -1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        double d8 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0.0f);
        int i12 = elitisticListPopulation11.getPopulationSize();
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation11.addChromosome(chromosome13);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation11.addChromosome(chromosome15);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome17 = elitisticListPopulation11.spliterator();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation11.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        math.genetics.Chromosome chromosome23 = null;
        elitisticListPopulation2.addChromosome(chromosome23);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome17);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap5.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (byte) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.lang.Object obj18 = defaultedMap8.get((java.lang.Object) predicate16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate22, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b33 = defaultedMap31.equals((java.lang.Object) (byte) 1);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        java.lang.Object obj41 = defaultedMap31.get((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate45, predicate50);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate27, predicate50);
        java.util.Set set54 = defaultedMap5.keySet();
        java.util.Set set55 = defaultedMap5.entrySet();
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) set55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap58);
        java.util.Set set60 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) -1 + "'", obj18.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) -1 + "'", obj41.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (short) -1 + "'", obj56.equals((short) -1));
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(set60);
    }
}

