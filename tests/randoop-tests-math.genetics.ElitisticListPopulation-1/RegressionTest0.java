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
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) ' ');
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) -1, (double) (byte) 1);
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
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) defaultedMap7);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 10 + "'", obj9.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 'a');
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
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 0.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0.0d);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        try {
            java.util.Map map15 = collections.map.PredicatedMap.decorate(map0, predicate6, predicate12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 10 + "'", obj4.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 10 + "'", obj11.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) 0.0d);
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap4.containsKey(obj10);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, obj10);
        boolean b13 = defaultedMap2.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str17 = defaultedMap16.toString();
        boolean b19 = defaultedMap16.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) b19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 0.0d);
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) defaultedMap22);
        java.lang.Object obj26 = defaultedMap2.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap20);
        java.util.Set set27 = defaultedMap2.entrySet();
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 10 + "'", obj6.equals((short) 10));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 10 + "'", obj24.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        java.util.Set set13 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((-1), (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 10 + "'", obj9.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        try {
            elitisticListPopulation2.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        double d5 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertNotNull(population6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        elitisticListPopulation2.setElitismRate(0.0d);
        double d5 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(d5 == 0.0d);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        double d5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        try {
            elitisticListPopulation2.setElitismRate((double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 10 + "'", obj6.equals((short) 10));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        java.util.Set set16 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.Map map0 = null;
        math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d4 = elitisticListPopulation3.getElitismRate();
        double d5 = elitisticListPopulation3.getElitismRate();
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) elitisticListPopulation3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertTrue(d5 == 1.0d);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        double d10 = elitisticListPopulation8.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation8.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation8.iterator();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        try {
            elitisticListPopulation2.setPopulationLimit((-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d10 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        double d5 = elitisticListPopulation2.getElitismRate();
        java.lang.String str6 = elitisticListPopulation2.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d8 = elitisticListPopulation7.getElitismRate();
        double d9 = elitisticListPopulation7.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome10);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation2.iterator();
        int i13 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation2.iterator();
        try {
            math.genetics.Chromosome chromosome15 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        int i13 = defaultedMap1.size();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) (short) 100);
        boolean b22 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) defaultedMap7);
        java.util.Collection collection11 = defaultedMap7.values();
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 10 + "'", obj9.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8);
        try {
            math.genetics.Chromosome chromosome11 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) (short) 100);
        java.util.Set set22 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 0.0d);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b31 = defaultedMap24.containsKey((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) 0.0d);
        java.lang.Object obj39 = defaultedMap34.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj40 = null;
        boolean b41 = defaultedMap34.containsKey(obj40);
        int i42 = defaultedMap34.size();
        boolean b43 = defaultedMap1.equals((java.lang.Object) defaultedMap34);
        collections.Factory factory44 = null;
        try {
            java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 10 + "'", obj26.equals((short) 10));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 10 + "'", obj32.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 10 + "'", obj36.equals((short) 10));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap1.clear();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        math.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(population6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) defaultedMap7);
        java.lang.String str11 = defaultedMap5.toString();
        defaultedMap5.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 10 + "'", obj9.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0L);
        elitisticListPopulation2.setElitismRate(0.0d);
        int i5 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0L);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        int i4 = elitisticListPopulation2.getPopulationSize();
        try {
            elitisticListPopulation2.setElitismRate((double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0.0d);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap10.containsKey(obj16);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, obj16);
        boolean b19 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str23 = defaultedMap22.toString();
        boolean b25 = defaultedMap22.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) b25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 0.0d);
        java.lang.Object obj31 = defaultedMap26.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj32 = defaultedMap8.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 0.0d);
        java.lang.Object obj41 = defaultedMap36.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap36.containsKey(obj42);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, obj42);
        java.lang.Object obj45 = defaultedMap8.get((java.lang.Object) defaultedMap34);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d50 = elitisticListPopulation49.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome51 = elitisticListPopulation49.iterator();
        double d52 = elitisticListPopulation49.getElitismRate();
        java.lang.String str53 = elitisticListPopulation49.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation56 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d57 = elitisticListPopulation56.getElitismRate();
        double d58 = elitisticListPopulation56.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome59 = elitisticListPopulation56.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome60 = elitisticListPopulation56.iterator();
        math.genetics.Chromosome[] chromosome_array61 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome62 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b63 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome62, chromosome_array61);
        elitisticListPopulation56.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome62);
        math.genetics.ElitisticListPopulation elitisticListPopulation67 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d68 = elitisticListPopulation67.getElitismRate();
        double d69 = elitisticListPopulation67.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome70 = elitisticListPopulation67.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation73 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d74 = elitisticListPopulation73.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome75 = elitisticListPopulation73.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation78 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d79 = elitisticListPopulation78.getElitismRate();
        double d80 = elitisticListPopulation78.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome81 = elitisticListPopulation78.getChromosomes();
        elitisticListPopulation73.setChromosomes(list_chromosome81);
        elitisticListPopulation67.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome81);
        elitisticListPopulation56.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome81);
        elitisticListPopulation49.setChromosomes(list_chromosome81);
        math.genetics.ElitisticListPopulation elitisticListPopulation88 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d89 = elitisticListPopulation88.getElitismRate();
        double d90 = elitisticListPopulation88.getElitismRate();
        double d91 = elitisticListPopulation88.getElitismRate();
        elitisticListPopulation88.setPopulationLimit((int) (byte) 100);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome94 = elitisticListPopulation88.iterator();
        java.lang.Object obj95 = defaultedMap1.put((java.lang.Object) list_chromosome81, (java.lang.Object) elitisticListPopulation88);
        java.lang.Object obj97 = defaultedMap1.remove((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 10 + "'", obj12.equals((short) 10));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 10 + "'", obj30.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + false + "'", obj31.equals(false));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 10 + "'", obj38.equals((short) 10));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + ' ' + "'", obj45.equals(' '));
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(d50 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome51);
        org.junit.Assert.assertTrue(d52 == 1.0d);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[]" + "'", str53.equals("[]"));
        org.junit.Assert.assertTrue(d57 == 1.0d);
        org.junit.Assert.assertTrue(d58 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome59);
        org.junit.Assert.assertNotNull(iterator_chromosome60);
        org.junit.Assert.assertNotNull(chromosome_array61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(d68 == 1.0d);
        org.junit.Assert.assertTrue(d69 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome70);
        org.junit.Assert.assertTrue(d74 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome75);
        org.junit.Assert.assertTrue(d79 == 1.0d);
        org.junit.Assert.assertTrue(d80 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome81);
        org.junit.Assert.assertTrue(d89 == 1.0d);
        org.junit.Assert.assertTrue(d90 == 1.0d);
        org.junit.Assert.assertTrue(d91 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome94);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0L);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.Chromosome chromosome4 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 0.0d);
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap3.containsKey(obj9);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj9);
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str16 = defaultedMap15.toString();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) b18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0.0d);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) defaultedMap21);
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap19);
        java.util.Set set26 = defaultedMap19.entrySet();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 10 + "'", obj23.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + false + "'", obj24.equals(false));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        int i9 = defaultedMap1.size();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str14 = defaultedMap13.toString();
        boolean b16 = defaultedMap13.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 0.0d);
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap20.containsKey(obj26);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, obj26);
        defaultedMap13.putAll(map28);
        boolean b30 = defaultedMap11.containsKey((java.lang.Object) map28);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 10 + "'", obj9.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 10 + "'", obj22.equals((short) 10));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) (short) 100);
        java.util.Set set22 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 0.0d);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b31 = defaultedMap24.containsKey((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str35 = defaultedMap34.toString();
        boolean b37 = defaultedMap34.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) b37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 0.0d);
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap40);
        boolean b45 = defaultedMap1.equals((java.lang.Object) defaultedMap40);
        collections.Transformer transformer46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 10 + "'", obj26.equals((short) 10));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 10 + "'", obj32.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 10 + "'", obj42.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertTrue(b45 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d16 = elitisticListPopulation15.getElitismRate();
        double d17 = elitisticListPopulation15.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation15.getChromosomes();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) list_chromosome18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str23 = defaultedMap22.toString();
        boolean b25 = defaultedMap22.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 0.0d);
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj35 = null;
        boolean b36 = defaultedMap29.containsKey(obj35);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, obj35);
        defaultedMap22.putAll(map37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj40 = defaultedMap22.get((java.lang.Object) predicate39);
        java.util.Set set41 = defaultedMap22.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0L);
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation44.getChromosomes();
        boolean b46 = defaultedMap22.containsKey((java.lang.Object) elitisticListPopulation44);
        java.lang.Object obj47 = defaultedMap11.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) 0.0d);
        java.lang.Object obj56 = defaultedMap51.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj57 = null;
        boolean b58 = defaultedMap51.containsKey(obj57);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, obj57);
        boolean b60 = defaultedMap49.isEmpty();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str64 = defaultedMap63.toString();
        boolean b66 = defaultedMap63.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) b66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj71 = defaultedMap69.get((java.lang.Object) 0.0d);
        java.lang.Object obj72 = defaultedMap67.get((java.lang.Object) defaultedMap69);
        java.lang.Object obj73 = defaultedMap49.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap67);
        defaultedMap22.putAll((java.util.Map) defaultedMap49);
        collections.Transformer transformer75 = null;
        try {
            java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, transformer75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(d16 == 1.0d);
        org.junit.Assert.assertTrue(d17 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 10 + "'", obj31.equals((short) 10));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short) 10 + "'", obj40.equals((short) 10));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(list_chromosome45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 10 + "'", obj53.equals((short) 10));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (short) 10 + "'", obj71.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + false + "'", obj72.equals(false));
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0.0d);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b16 = defaultedMap9.containsKey((java.lang.Object) '#');
        int i17 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap9.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj21 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) defaultedMap9);
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 10 + "'", obj11.equals((short) 10));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d16 = elitisticListPopulation15.getElitismRate();
        double d17 = elitisticListPopulation15.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation15.getChromosomes();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) list_chromosome18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str23 = defaultedMap22.toString();
        boolean b25 = defaultedMap22.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 0.0d);
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj35 = null;
        boolean b36 = defaultedMap29.containsKey(obj35);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, obj35);
        defaultedMap22.putAll(map37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj40 = defaultedMap22.get((java.lang.Object) predicate39);
        java.util.Set set41 = defaultedMap22.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0L);
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation44.getChromosomes();
        boolean b46 = defaultedMap22.containsKey((java.lang.Object) elitisticListPopulation44);
        java.lang.Object obj47 = defaultedMap11.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap22);
        int i48 = defaultedMap22.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(d16 == 1.0d);
        org.junit.Assert.assertTrue(d17 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 10 + "'", obj31.equals((short) 10));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short) 10 + "'", obj40.equals((short) 10));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(list_chromosome45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(i48 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Collection collection8 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 10 + "'", obj6.equals((short) 10));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0L);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        try {
            elitisticListPopulation2.setPopulationLimit((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0L);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        org.junit.Assert.assertNotNull(list_chromosome3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        java.util.Set set16 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 0.0d);
        java.lang.Object obj23 = defaultedMap18.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap18.containsKey(obj24);
        boolean b27 = defaultedMap18.equals((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str30 = defaultedMap29.toString();
        boolean b32 = defaultedMap29.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 0.0d);
        java.lang.Object obj41 = defaultedMap36.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap36.containsKey(obj42);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, obj42);
        defaultedMap29.putAll(map44);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj47 = defaultedMap29.get((java.lang.Object) predicate46);
        java.lang.Object obj48 = defaultedMap14.put((java.lang.Object) defaultedMap18, obj47);
        boolean b49 = defaultedMap14.isEmpty();
        int i50 = defaultedMap14.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 10 + "'", obj20.equals((short) 10));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 10 + "'", obj38.equals((short) 10));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (short) 10 + "'", obj47.equals((short) 10));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i50 == 1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        double d5 = elitisticListPopulation2.getElitismRate();
        java.lang.String str6 = elitisticListPopulation2.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d10 = elitisticListPopulation9.getElitismRate();
        double d11 = elitisticListPopulation9.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation9.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation9.iterator();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d21 = elitisticListPopulation20.getElitismRate();
        double d22 = elitisticListPopulation20.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation20.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d27 = elitisticListPopulation26.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome28 = elitisticListPopulation26.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d32 = elitisticListPopulation31.getElitismRate();
        double d33 = elitisticListPopulation31.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation26.setChromosomes(list_chromosome34);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome34);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome34);
        elitisticListPopulation2.setChromosomes(list_chromosome34);
        try {
            math.genetics.Chromosome chromosome39 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertTrue(d10 == 1.0d);
        org.junit.Assert.assertTrue(d11 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(d21 == 1.0d);
        org.junit.Assert.assertTrue(d22 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertTrue(d27 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome28);
        org.junit.Assert.assertTrue(d32 == 1.0d);
        org.junit.Assert.assertTrue(d33 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome34);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (-1.0d));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation8.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        double d15 = elitisticListPopulation13.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(list_chromosome16);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome16);
        int i19 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome10);
        org.junit.Assert.assertTrue(d14 == 1.0d);
        org.junit.Assert.assertTrue(d15 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d21 = elitisticListPopulation20.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation20.iterator();
        double d23 = elitisticListPopulation20.getElitismRate();
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) elitisticListPopulation20);
        elitisticListPopulation20.setPopulationLimit((int) (short) 100);
        math.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation20.addChromosome(chromosome27);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(d21 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertTrue(d23 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 10 + "'", obj24.equals((short) 10));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.lang.String str6 = elitisticListPopulation2.toString();
        try {
            math.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsKey(obj7);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) (short) 1);
        java.util.Set set15 = defaultedMap12.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 10 + "'", obj14.equals((short) 10));
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0.0d);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b16 = defaultedMap9.containsKey((java.lang.Object) '#');
        int i17 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap9.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj21 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) defaultedMap9);
        java.lang.Object obj23 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Set set24 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 10 + "'", obj11.equals((short) 10));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        try {
            math.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b15 = defaultedMap8.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str18 = defaultedMap17.toString();
        boolean b20 = defaultedMap17.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) b20);
        java.lang.Object obj22 = defaultedMap8.remove((java.lang.Object) defaultedMap21);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str27 = defaultedMap26.toString();
        java.util.Set set28 = defaultedMap26.entrySet();
        boolean b29 = defaultedMap21.containsValue((java.lang.Object) defaultedMap26);
        boolean b30 = defaultedMap1.containsValue((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 10 + "'", obj6.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0.0d);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap10.containsKey(obj16);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, obj16);
        boolean b19 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str23 = defaultedMap22.toString();
        boolean b25 = defaultedMap22.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) b25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 0.0d);
        java.lang.Object obj31 = defaultedMap26.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj32 = defaultedMap8.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 0.0d);
        java.lang.Object obj41 = defaultedMap36.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap36.containsKey(obj42);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, obj42);
        java.lang.Object obj45 = defaultedMap8.get((java.lang.Object) defaultedMap34);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        java.lang.Object obj47 = null;
        boolean b48 = defaultedMap8.containsValue(obj47);
        collections.Transformer transformer49 = null;
        try {
            java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 10 + "'", obj12.equals((short) 10));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 10 + "'", obj30.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + false + "'", obj31.equals(false));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 10 + "'", obj38.equals((short) 10));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + ' ' + "'", obj45.equals(' '));
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation8.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        double d15 = elitisticListPopulation13.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(list_chromosome16);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 0.0d);
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b27 = defaultedMap20.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str30 = defaultedMap29.toString();
        boolean b32 = defaultedMap29.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) b32);
        java.lang.Object obj34 = defaultedMap20.remove((java.lang.Object) defaultedMap33);
        java.util.Set set35 = defaultedMap33.keySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 0.0d);
        java.lang.Object obj42 = defaultedMap37.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b44 = defaultedMap37.containsKey((java.lang.Object) '#');
        int i45 = defaultedMap37.size();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap37.putAll((java.util.Map) defaultedMap47);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d52 = elitisticListPopulation51.getElitismRate();
        double d53 = elitisticListPopulation51.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation51.getChromosomes();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) list_chromosome54);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d59 = elitisticListPopulation58.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome60 = elitisticListPopulation58.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d64 = elitisticListPopulation63.getElitismRate();
        double d65 = elitisticListPopulation63.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome66 = elitisticListPopulation63.getChromosomes();
        elitisticListPopulation58.setChromosomes(list_chromosome66);
        java.lang.Object obj68 = defaultedMap33.put((java.lang.Object) map55, (java.lang.Object) list_chromosome66);
        elitisticListPopulation2.setChromosomes(list_chromosome66);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome10);
        org.junit.Assert.assertTrue(d14 == 1.0d);
        org.junit.Assert.assertTrue(d15 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 10 + "'", obj22.equals((short) 10));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 10 + "'", obj39.equals((short) 10));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertTrue(d52 == 1.0d);
        org.junit.Assert.assertTrue(d53 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(d59 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome60);
        org.junit.Assert.assertTrue(d64 == 1.0d);
        org.junit.Assert.assertTrue(d65 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome66);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0.0d);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b16 = defaultedMap9.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str19 = defaultedMap18.toString();
        boolean b21 = defaultedMap18.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) b21);
        java.lang.Object obj23 = defaultedMap9.remove((java.lang.Object) defaultedMap22);
        java.util.Set set24 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 0.0d);
        java.lang.Object obj31 = defaultedMap26.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b33 = defaultedMap26.containsKey((java.lang.Object) '#');
        int i34 = defaultedMap26.size();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap26.putAll((java.util.Map) defaultedMap36);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d41 = elitisticListPopulation40.getElitismRate();
        double d42 = elitisticListPopulation40.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation40.getChromosomes();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) list_chromosome43);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d48 = elitisticListPopulation47.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome49 = elitisticListPopulation47.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d53 = elitisticListPopulation52.getElitismRate();
        double d54 = elitisticListPopulation52.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation52.getChromosomes();
        elitisticListPopulation47.setChromosomes(list_chromosome55);
        java.lang.Object obj57 = defaultedMap22.put((java.lang.Object) map44, (java.lang.Object) list_chromosome55);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome55);
        math.genetics.ElitisticListPopulation elitisticListPopulation61 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d62 = elitisticListPopulation61.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome63 = elitisticListPopulation61.iterator();
        double d64 = elitisticListPopulation61.getElitismRate();
        java.lang.String str65 = elitisticListPopulation61.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation68 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d69 = elitisticListPopulation68.getElitismRate();
        double d70 = elitisticListPopulation68.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome71 = elitisticListPopulation68.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome72 = elitisticListPopulation68.iterator();
        math.genetics.Chromosome[] chromosome_array73 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome74 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b75 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome74, chromosome_array73);
        elitisticListPopulation68.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome74);
        math.genetics.ElitisticListPopulation elitisticListPopulation79 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d80 = elitisticListPopulation79.getElitismRate();
        double d81 = elitisticListPopulation79.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome82 = elitisticListPopulation79.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation85 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d86 = elitisticListPopulation85.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome87 = elitisticListPopulation85.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation90 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d91 = elitisticListPopulation90.getElitismRate();
        double d92 = elitisticListPopulation90.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome93 = elitisticListPopulation90.getChromosomes();
        elitisticListPopulation85.setChromosomes(list_chromosome93);
        elitisticListPopulation79.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome93);
        elitisticListPopulation68.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome93);
        elitisticListPopulation61.setChromosomes(list_chromosome93);
        java.util.List<math.genetics.Chromosome> list_chromosome98 = elitisticListPopulation61.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome98);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 10 + "'", obj11.equals((short) 10));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 10 + "'", obj28.equals((short) 10));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(d41 == 1.0d);
        org.junit.Assert.assertTrue(d42 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(d48 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome49);
        org.junit.Assert.assertTrue(d53 == 1.0d);
        org.junit.Assert.assertTrue(d54 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(d62 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome63);
        org.junit.Assert.assertTrue(d64 == 1.0d);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "[]" + "'", str65.equals("[]"));
        org.junit.Assert.assertTrue(d69 == 1.0d);
        org.junit.Assert.assertTrue(d70 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome71);
        org.junit.Assert.assertNotNull(iterator_chromosome72);
        org.junit.Assert.assertNotNull(chromosome_array73);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(d80 == 1.0d);
        org.junit.Assert.assertTrue(d81 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome82);
        org.junit.Assert.assertTrue(d86 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome87);
        org.junit.Assert.assertTrue(d91 == 1.0d);
        org.junit.Assert.assertTrue(d92 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome93);
        org.junit.Assert.assertNotNull(list_chromosome98);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        int i6 = elitisticListPopulation2.getPopulationSize();
        double d7 = elitisticListPopulation2.getElitismRate();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(d7 == 1.0d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d8 = elitisticListPopulation7.getElitismRate();
        double d9 = elitisticListPopulation7.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome10);
        elitisticListPopulation2.setPopulationLimit((int) '#');
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation2.spliterator();
        java.lang.String str15 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]" + "'", str15.equals("[]"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 0.0d);
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap3.containsKey(obj9);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj9);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) predicate12);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str20 = defaultedMap19.toString();
        java.util.Set set21 = defaultedMap19.entrySet();
        boolean b22 = defaultedMap14.containsValue((java.lang.Object) defaultedMap19);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d26 = elitisticListPopulation25.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome27 = elitisticListPopulation25.iterator();
        double d28 = elitisticListPopulation25.getElitismRate();
        java.lang.String str29 = elitisticListPopulation25.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d33 = elitisticListPopulation32.getElitismRate();
        double d34 = elitisticListPopulation32.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation32.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome36 = elitisticListPopulation32.iterator();
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        elitisticListPopulation32.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d44 = elitisticListPopulation43.getElitismRate();
        double d45 = elitisticListPopulation43.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome46 = elitisticListPopulation43.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d50 = elitisticListPopulation49.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome51 = elitisticListPopulation49.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d55 = elitisticListPopulation54.getElitismRate();
        double d56 = elitisticListPopulation54.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome57 = elitisticListPopulation54.getChromosomes();
        elitisticListPopulation49.setChromosomes(list_chromosome57);
        elitisticListPopulation43.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome57);
        elitisticListPopulation32.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome57);
        elitisticListPopulation25.setChromosomes(list_chromosome57);
        java.util.List<math.genetics.Chromosome> list_chromosome62 = elitisticListPopulation25.getChromosomes();
        double d63 = elitisticListPopulation25.getElitismRate();
        elitisticListPopulation25.setPopulationLimit((int) '#');
        boolean b66 = defaultedMap19.equals((java.lang.Object) elitisticListPopulation25);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(d26 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome27);
        org.junit.Assert.assertTrue(d28 == 1.0d);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]" + "'", str29.equals("[]"));
        org.junit.Assert.assertTrue(d33 == 1.0d);
        org.junit.Assert.assertTrue(d34 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertNotNull(iterator_chromosome36);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(d44 == 1.0d);
        org.junit.Assert.assertTrue(d45 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome46);
        org.junit.Assert.assertTrue(d50 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome51);
        org.junit.Assert.assertTrue(d55 == 1.0d);
        org.junit.Assert.assertTrue(d56 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome57);
        org.junit.Assert.assertNotNull(list_chromosome62);
        org.junit.Assert.assertTrue(d63 == 1.0d);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 0.0d);
        java.lang.Object obj7 = defaultedMap2.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b9 = defaultedMap2.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str12 = defaultedMap11.toString();
        boolean b14 = defaultedMap11.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        java.lang.Object obj16 = defaultedMap2.remove((java.lang.Object) defaultedMap15);
        java.util.Set set17 = defaultedMap15.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0.0d);
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b28 = defaultedMap21.containsKey((java.lang.Object) '#');
        int i29 = defaultedMap21.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap21.putAll((java.util.Map) defaultedMap31);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate33, predicate36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 0.0d);
        java.lang.Object obj45 = defaultedMap40.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b47 = defaultedMap40.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str50 = defaultedMap49.toString();
        boolean b52 = defaultedMap49.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) b52);
        java.lang.Object obj54 = defaultedMap40.remove((java.lang.Object) defaultedMap53);
        java.util.Set set55 = defaultedMap53.keySet();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj57 = defaultedMap53.get((java.lang.Object) predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate(map38, predicate56, predicate58);
        try {
            java.util.Map map60 = collections.map.PredicatedMap.decorate(map0, predicate18, predicate58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 10 + "'", obj4.equals((short) 10));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 10 + "'", obj23.equals((short) 10));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 10 + "'", obj42.equals((short) 10));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + false + "'", obj57.equals(false));
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0L);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0.0d);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap9.containsKey(obj15);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, obj15);
        boolean b18 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str22 = defaultedMap21.toString();
        boolean b24 = defaultedMap21.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) b24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 0.0d);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) defaultedMap27);
        java.lang.Object obj31 = defaultedMap7.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap25);
        boolean b32 = defaultedMap5.containsKey(obj31);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.Factory factory34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 10 + "'", obj11.equals((short) 10));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (short) 10 + "'", obj29.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + false + "'", obj30.equals(false));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        java.util.Set set16 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 0.0d);
        java.lang.Object obj23 = defaultedMap18.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap18.containsKey(obj24);
        boolean b27 = defaultedMap18.equals((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str30 = defaultedMap29.toString();
        boolean b32 = defaultedMap29.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 0.0d);
        java.lang.Object obj41 = defaultedMap36.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap36.containsKey(obj42);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, obj42);
        defaultedMap29.putAll(map44);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj47 = defaultedMap29.get((java.lang.Object) predicate46);
        java.lang.Object obj48 = defaultedMap14.put((java.lang.Object) defaultedMap18, obj47);
        java.util.Set set49 = defaultedMap14.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 10 + "'", obj20.equals((short) 10));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 10 + "'", obj38.equals((short) 10));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (short) 10 + "'", obj47.equals((short) 10));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 0.0d);
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b24 = defaultedMap17.containsKey((java.lang.Object) '#');
        int i25 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap17.putAll((java.util.Map) defaultedMap27);
        boolean b30 = defaultedMap27.containsValue((java.lang.Object) (byte) 0);
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) defaultedMap27);
        java.util.Set set32 = defaultedMap27.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d36 = elitisticListPopulation35.getElitismRate();
        double d37 = elitisticListPopulation35.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome38 = elitisticListPopulation35.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome39 = elitisticListPopulation35.iterator();
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        elitisticListPopulation35.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d47 = elitisticListPopulation46.getElitismRate();
        double d48 = elitisticListPopulation46.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome49 = elitisticListPopulation46.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d53 = elitisticListPopulation52.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation52.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation57 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d58 = elitisticListPopulation57.getElitismRate();
        double d59 = elitisticListPopulation57.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome60 = elitisticListPopulation57.getChromosomes();
        elitisticListPopulation52.setChromosomes(list_chromosome60);
        elitisticListPopulation46.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        math.genetics.ElitisticListPopulation elitisticListPopulation66 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d67 = elitisticListPopulation66.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome68 = elitisticListPopulation66.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation71 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d72 = elitisticListPopulation71.getElitismRate();
        double d73 = elitisticListPopulation71.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome74 = elitisticListPopulation71.getChromosomes();
        elitisticListPopulation66.setChromosomes(list_chromosome74);
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome74);
        boolean b77 = defaultedMap27.containsValue((java.lang.Object) list_chromosome74);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 10 + "'", obj31.equals((short) 10));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(d36 == 1.0d);
        org.junit.Assert.assertTrue(d37 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome38);
        org.junit.Assert.assertNotNull(iterator_chromosome39);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(d47 == 1.0d);
        org.junit.Assert.assertTrue(d48 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome49);
        org.junit.Assert.assertTrue(d53 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertTrue(d58 == 1.0d);
        org.junit.Assert.assertTrue(d59 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome60);
        org.junit.Assert.assertTrue(d67 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome68);
        org.junit.Assert.assertTrue(d72 == 1.0d);
        org.junit.Assert.assertTrue(d73 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome74);
        org.junit.Assert.assertTrue(b77 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) defaultedMap7);
        java.util.Set set11 = defaultedMap5.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 10 + "'", obj9.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        int i6 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, 0.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0L);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        double d10 = elitisticListPopulation8.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation8.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation8.iterator();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, (int) '#', (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d10 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 0.0d);
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap3.containsKey(obj9);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsKey(obj7);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0.0d);
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b20 = defaultedMap13.containsKey((java.lang.Object) '#');
        int i21 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap13.putAll((java.util.Map) defaultedMap23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate25, predicate28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) 0.0d);
        java.lang.Object obj39 = defaultedMap34.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj40 = null;
        boolean b41 = defaultedMap34.containsKey(obj40);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, obj40);
        java.lang.Object obj43 = defaultedMap23.remove((java.lang.Object) map42);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map42);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (short) 10 + "'", obj15.equals((short) 10));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 10 + "'", obj36.equals((short) 10));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d8 = elitisticListPopulation7.getElitismRate();
        double d9 = elitisticListPopulation7.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome15);
        elitisticListPopulation2.setElitismRate(1.0d);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(list_chromosome15);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 0.0d);
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b24 = defaultedMap17.containsKey((java.lang.Object) '#');
        int i25 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap17.putAll((java.util.Map) defaultedMap27);
        boolean b30 = defaultedMap27.containsValue((java.lang.Object) (byte) 0);
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str34 = defaultedMap33.toString();
        java.util.Set set35 = defaultedMap33.entrySet();
        boolean b36 = defaultedMap1.equals((java.lang.Object) defaultedMap33);
        boolean b38 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 10 + "'", obj31.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d8 = elitisticListPopulation7.getElitismRate();
        double d9 = elitisticListPopulation7.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome10);
        java.lang.String str12 = elitisticListPopulation2.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d16 = elitisticListPopulation15.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation15.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d21 = elitisticListPopulation20.getElitismRate();
        double d22 = elitisticListPopulation20.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation15.setChromosomes(list_chromosome23);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation15.setChromosomes(list_chromosome28);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome28);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome31 = elitisticListPopulation2.spliterator();
        java.lang.String str32 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertTrue(d16 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertTrue(d21 == 1.0d);
        org.junit.Assert.assertTrue(d22 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertNotNull(spliterator_chromosome31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]" + "'", str32.equals("[]"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str20 = defaultedMap19.toString();
        boolean b22 = defaultedMap19.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 0.0d);
        java.lang.Object obj31 = defaultedMap26.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj32 = null;
        boolean b33 = defaultedMap26.containsKey(obj32);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, obj32);
        defaultedMap19.putAll(map34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj37 = defaultedMap19.get((java.lang.Object) predicate36);
        java.lang.Object obj39 = defaultedMap19.get((java.lang.Object) (short) 100);
        java.util.Set set40 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 0.0d);
        java.lang.Object obj47 = defaultedMap42.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b49 = defaultedMap42.containsKey((java.lang.Object) '#');
        java.lang.Object obj50 = defaultedMap19.get((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj54 = defaultedMap52.get((java.lang.Object) 0.0d);
        java.lang.Object obj57 = defaultedMap52.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj58 = null;
        boolean b59 = defaultedMap52.containsKey(obj58);
        int i60 = defaultedMap52.size();
        boolean b61 = defaultedMap19.equals((java.lang.Object) defaultedMap52);
        boolean b62 = defaultedMap1.equals((java.lang.Object) b61);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 10 + "'", obj28.equals((short) 10));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 10 + "'", obj37.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 10 + "'", obj39.equals((short) 10));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 10 + "'", obj44.equals((short) 10));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (short) 10 + "'", obj50.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + (short) 10 + "'", obj54.equals((short) 10));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == 1);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str20 = defaultedMap19.toString();
        java.util.Set set21 = defaultedMap19.entrySet();
        boolean b22 = defaultedMap14.containsValue((java.lang.Object) defaultedMap19);
        java.lang.Object obj24 = defaultedMap14.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str27 = defaultedMap26.toString();
        boolean b29 = defaultedMap26.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) 0.0d);
        java.lang.Object obj38 = defaultedMap33.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj39 = null;
        boolean b40 = defaultedMap33.containsKey(obj39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, obj39);
        defaultedMap26.putAll(map41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj44 = defaultedMap26.get((java.lang.Object) predicate43);
        java.lang.Object obj46 = defaultedMap26.get((java.lang.Object) (short) 100);
        java.util.Set set47 = defaultedMap26.keySet();
        boolean b48 = defaultedMap14.containsValue((java.lang.Object) defaultedMap26);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 10 + "'", obj35.equals((short) 10));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 10 + "'", obj44.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (short) 10 + "'", obj46.equals((short) 10));
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        try {
            elitisticListPopulation2.setElitismRate((-1.0d));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 0.0d);
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap3.containsKey(obj9);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj9);
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str16 = defaultedMap15.toString();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) b18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0.0d);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) defaultedMap21);
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 0.0d);
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj35 = null;
        boolean b36 = defaultedMap29.containsKey(obj35);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, obj35);
        java.lang.Object obj38 = defaultedMap1.get((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) 0.0d);
        java.lang.Object obj48 = defaultedMap43.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj49 = null;
        boolean b50 = defaultedMap43.containsKey(obj49);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, obj49);
        boolean b52 = defaultedMap39.equals((java.lang.Object) map51);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 10 + "'", obj23.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + false + "'", obj24.equals(false));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 10 + "'", obj31.equals((short) 10));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + ' ' + "'", obj38.equals(' '));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) 10 + "'", obj45.equals((short) 10));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b52 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        double d15 = elitisticListPopulation13.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation13.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d20 = elitisticListPopulation19.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation19.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d25 = elitisticListPopulation24.getElitismRate();
        double d26 = elitisticListPopulation24.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation19.setChromosomes(list_chromosome27);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome27);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome27);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d34 = elitisticListPopulation33.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation33.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d39 = elitisticListPopulation38.getElitismRate();
        double d40 = elitisticListPopulation38.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation33.setChromosomes(list_chromosome41);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome41);
        math.genetics.Population population44 = elitisticListPopulation2.nextGeneration();
        int i45 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(d14 == 1.0d);
        org.junit.Assert.assertTrue(d15 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
        org.junit.Assert.assertTrue(d25 == 1.0d);
        org.junit.Assert.assertTrue(d26 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertTrue(d34 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertTrue(d39 == 1.0d);
        org.junit.Assert.assertTrue(d40 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome41);
        org.junit.Assert.assertNotNull(population44);
        org.junit.Assert.assertTrue(i45 == 10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        double d5 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) (short) 100);
        java.util.Set set22 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 0.0d);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b31 = defaultedMap24.containsKey((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str35 = defaultedMap34.toString();
        boolean b37 = defaultedMap34.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) b37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 0.0d);
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap40);
        boolean b45 = defaultedMap1.equals((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) 0.0d);
        java.lang.Object obj56 = defaultedMap51.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj57 = null;
        boolean b58 = defaultedMap51.containsKey(obj57);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, obj57);
        boolean b60 = defaultedMap49.isEmpty();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str64 = defaultedMap63.toString();
        boolean b66 = defaultedMap63.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) b66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj71 = defaultedMap69.get((java.lang.Object) 0.0d);
        java.lang.Object obj72 = defaultedMap67.get((java.lang.Object) defaultedMap69);
        java.lang.Object obj73 = defaultedMap49.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap67);
        boolean b74 = defaultedMap47.containsKey(obj73);
        math.genetics.ElitisticListPopulation elitisticListPopulation77 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d78 = elitisticListPopulation77.getElitismRate();
        double d79 = elitisticListPopulation77.getElitismRate();
        double d80 = elitisticListPopulation77.getElitismRate();
        boolean b81 = defaultedMap47.containsValue((java.lang.Object) d80);
        java.lang.Object obj82 = defaultedMap1.get((java.lang.Object) defaultedMap47);
        math.genetics.ElitisticListPopulation elitisticListPopulation85 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d86 = elitisticListPopulation85.getElitismRate();
        double d87 = elitisticListPopulation85.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome88 = elitisticListPopulation85.iterator();
        boolean b89 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation85);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation85);
        int i91 = elitisticListPopulation85.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 10 + "'", obj26.equals((short) 10));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 10 + "'", obj32.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 10 + "'", obj42.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 10 + "'", obj53.equals((short) 10));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (short) 10 + "'", obj71.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + false + "'", obj72.equals(false));
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(d78 == 1.0d);
        org.junit.Assert.assertTrue(d79 == 1.0d);
        org.junit.Assert.assertTrue(d80 == 1.0d);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (short) 10 + "'", obj82.equals((short) 10));
        org.junit.Assert.assertTrue(d86 == 1.0d);
        org.junit.Assert.assertTrue(d87 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome88);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(i91 == 10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        double d5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertTrue(d5 == 1.0d);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 0.0d);
        java.lang.Object obj17 = defaultedMap12.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0.0d);
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap21.containsKey(obj27);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, obj27);
        boolean b30 = defaultedMap19.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str34 = defaultedMap33.toString();
        boolean b36 = defaultedMap33.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) b36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 0.0d);
        java.lang.Object obj42 = defaultedMap37.get((java.lang.Object) defaultedMap39);
        java.lang.Object obj43 = defaultedMap19.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 0.0d);
        java.lang.Object obj52 = defaultedMap47.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj53 = null;
        boolean b54 = defaultedMap47.containsKey(obj53);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, obj53);
        java.lang.Object obj56 = defaultedMap19.get((java.lang.Object) defaultedMap45);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap19);
        java.lang.Object obj58 = null;
        boolean b59 = defaultedMap19.containsValue(obj58);
        boolean b60 = defaultedMap7.containsKey((java.lang.Object) defaultedMap19);
        java.lang.Object obj62 = defaultedMap19.get((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 10 + "'", obj9.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 10 + "'", obj14.equals((short) 10));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 10 + "'", obj23.equals((short) 10));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) 10 + "'", obj41.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + false + "'", obj42.equals(false));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (short) 10 + "'", obj49.equals((short) 10));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + ' ' + "'", obj56.equals(' '));
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + ' ' + "'", obj62.equals(' '));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d11 = elitisticListPopulation10.getElitismRate();
        double d12 = elitisticListPopulation10.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation10.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d17 = elitisticListPopulation16.getElitismRate();
        double d18 = elitisticListPopulation16.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation16.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation16.iterator();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        elitisticListPopulation16.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22);
        elitisticListPopulation10.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) elitisticListPopulation10);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 10 + "'", obj6.equals((short) 10));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(d11 == 1.0d);
        org.junit.Assert.assertTrue(d12 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertTrue(d17 == 1.0d);
        org.junit.Assert.assertTrue(d18 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 10 + "'", obj26.equals((short) 10));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.lang.String str6 = elitisticListPopulation2.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d10 = elitisticListPopulation9.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation9.iterator();
        double d12 = elitisticListPopulation9.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        math.genetics.Population population15 = elitisticListPopulation2.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d19 = elitisticListPopulation18.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation18.iterator();
        double d21 = elitisticListPopulation18.getElitismRate();
        java.lang.String str22 = elitisticListPopulation18.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d26 = elitisticListPopulation25.getElitismRate();
        double d27 = elitisticListPopulation25.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome28 = elitisticListPopulation25.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome29 = elitisticListPopulation25.iterator();
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        elitisticListPopulation25.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d37 = elitisticListPopulation36.getElitismRate();
        double d38 = elitisticListPopulation36.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation36.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d43 = elitisticListPopulation42.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome44 = elitisticListPopulation42.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d48 = elitisticListPopulation47.getElitismRate();
        double d49 = elitisticListPopulation47.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome50 = elitisticListPopulation47.getChromosomes();
        elitisticListPopulation42.setChromosomes(list_chromosome50);
        elitisticListPopulation36.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome50);
        elitisticListPopulation25.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome50);
        elitisticListPopulation18.setChromosomes(list_chromosome50);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome50);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertTrue(d10 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertTrue(d12 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(population15);
        org.junit.Assert.assertTrue(d19 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertTrue(d21 == 1.0d);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertTrue(d26 == 1.0d);
        org.junit.Assert.assertTrue(d27 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome28);
        org.junit.Assert.assertNotNull(iterator_chromosome29);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(d37 == 1.0d);
        org.junit.Assert.assertTrue(d38 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome39);
        org.junit.Assert.assertTrue(d43 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome44);
        org.junit.Assert.assertTrue(d48 == 1.0d);
        org.junit.Assert.assertTrue(d49 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome50);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(population3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 0.0d);
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b24 = defaultedMap17.containsKey((java.lang.Object) '#');
        int i25 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap17.putAll((java.util.Map) defaultedMap27);
        boolean b30 = defaultedMap27.containsValue((java.lang.Object) (byte) 0);
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) defaultedMap27);
        collections.Factory factory32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, factory32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 10 + "'", obj31.equals((short) 10));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0L);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        math.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0.0d);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap10.containsKey(obj16);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, obj16);
        boolean b19 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str23 = defaultedMap22.toString();
        boolean b25 = defaultedMap22.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) b25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 0.0d);
        java.lang.Object obj31 = defaultedMap26.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj32 = defaultedMap8.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 0.0d);
        java.lang.Object obj41 = defaultedMap36.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap36.containsKey(obj42);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, obj42);
        java.lang.Object obj45 = defaultedMap8.get((java.lang.Object) defaultedMap34);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d50 = elitisticListPopulation49.getElitismRate();
        double d51 = elitisticListPopulation49.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome52 = elitisticListPopulation49.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome53 = elitisticListPopulation49.iterator();
        math.genetics.Chromosome[] chromosome_array54 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome55 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55, chromosome_array54);
        elitisticListPopulation49.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome55);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation49);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj64 = defaultedMap62.get((java.lang.Object) 0.0d);
        java.lang.Object obj67 = defaultedMap62.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj68 = null;
        boolean b69 = defaultedMap62.containsKey(obj68);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, obj68);
        boolean b71 = defaultedMap60.isEmpty();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str75 = defaultedMap74.toString();
        boolean b77 = defaultedMap74.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) b77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj82 = defaultedMap80.get((java.lang.Object) 0.0d);
        java.lang.Object obj83 = defaultedMap78.get((java.lang.Object) defaultedMap80);
        java.lang.Object obj84 = defaultedMap60.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap78);
        java.util.Set set85 = defaultedMap60.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap60);
        boolean b87 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 10 + "'", obj12.equals((short) 10));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 10 + "'", obj30.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + false + "'", obj31.equals(false));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 10 + "'", obj38.equals((short) 10));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + ' ' + "'", obj45.equals(' '));
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(d50 == 1.0d);
        org.junit.Assert.assertTrue(d51 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome52);
        org.junit.Assert.assertNotNull(iterator_chromosome53);
        org.junit.Assert.assertNotNull(chromosome_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (short) 10 + "'", obj64.equals((short) 10));
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "{}" + "'", str75.equals("{}"));
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (short) 10 + "'", obj82.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + false + "'", obj83.equals(false));
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertTrue(b87 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d21 = elitisticListPopulation20.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation20.iterator();
        double d23 = elitisticListPopulation20.getElitismRate();
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) elitisticListPopulation20);
        elitisticListPopulation20.setPopulationLimit((int) (short) 100);
        java.lang.String str27 = elitisticListPopulation20.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(d21 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertTrue(d23 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 10 + "'", obj24.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]" + "'", str27.equals("[]"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        java.util.Set set16 = defaultedMap14.keySet();
        int i17 = defaultedMap14.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d21 = elitisticListPopulation20.getElitismRate();
        double d22 = elitisticListPopulation20.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation20.getChromosomes();
        int i24 = elitisticListPopulation20.getPopulationSize();
        double d25 = elitisticListPopulation20.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation20.getChromosomes();
        java.lang.Object obj27 = defaultedMap14.remove((java.lang.Object) elitisticListPopulation20);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(d21 == 1.0d);
        org.junit.Assert.assertTrue(d22 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(d25 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsKey(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 0.0d);
        java.lang.Object obj23 = defaultedMap18.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap18.containsKey(obj24);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, obj24);
        boolean b27 = defaultedMap16.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str31 = defaultedMap30.toString();
        boolean b33 = defaultedMap30.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) b33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 0.0d);
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) defaultedMap36);
        java.lang.Object obj40 = defaultedMap16.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap34);
        boolean b41 = defaultedMap14.containsKey(obj40);
        defaultedMap10.putAll((java.util.Map) defaultedMap14);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d46 = elitisticListPopulation45.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome47 = elitisticListPopulation45.iterator();
        double d48 = elitisticListPopulation45.getElitismRate();
        java.lang.String str49 = elitisticListPopulation45.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d53 = elitisticListPopulation52.getElitismRate();
        double d54 = elitisticListPopulation52.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome55 = elitisticListPopulation52.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome56 = elitisticListPopulation52.iterator();
        math.genetics.Chromosome[] chromosome_array57 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome58 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b59 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58, chromosome_array57);
        elitisticListPopulation52.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome58);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d64 = elitisticListPopulation63.getElitismRate();
        double d65 = elitisticListPopulation63.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome66 = elitisticListPopulation63.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation69 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d70 = elitisticListPopulation69.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome71 = elitisticListPopulation69.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation74 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d75 = elitisticListPopulation74.getElitismRate();
        double d76 = elitisticListPopulation74.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome77 = elitisticListPopulation74.getChromosomes();
        elitisticListPopulation69.setChromosomes(list_chromosome77);
        elitisticListPopulation63.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome77);
        elitisticListPopulation52.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome77);
        elitisticListPopulation45.setChromosomes(list_chromosome77);
        java.util.List<math.genetics.Chromosome> list_chromosome82 = elitisticListPopulation45.getChromosomes();
        double d83 = elitisticListPopulation45.getElitismRate();
        java.lang.Object obj84 = defaultedMap1.put((java.lang.Object) defaultedMap14, (java.lang.Object) d83);
        boolean b85 = defaultedMap14.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 10 + "'", obj12.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 10 + "'", obj20.equals((short) 10));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 10 + "'", obj38.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + false + "'", obj39.equals(false));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(d46 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome47);
        org.junit.Assert.assertTrue(d48 == 1.0d);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "[]" + "'", str49.equals("[]"));
        org.junit.Assert.assertTrue(d53 == 1.0d);
        org.junit.Assert.assertTrue(d54 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome55);
        org.junit.Assert.assertNotNull(iterator_chromosome56);
        org.junit.Assert.assertNotNull(chromosome_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(d64 == 1.0d);
        org.junit.Assert.assertTrue(d65 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome66);
        org.junit.Assert.assertTrue(d70 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome71);
        org.junit.Assert.assertTrue(d75 == 1.0d);
        org.junit.Assert.assertTrue(d76 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome77);
        org.junit.Assert.assertNotNull(list_chromosome82);
        org.junit.Assert.assertTrue(d83 == 1.0d);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue(b85 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = list_chromosome3.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = list_chromosome3.spliterator();
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) predicate18);
        java.util.Set set20 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 0.0d);
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b29 = defaultedMap22.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str32 = defaultedMap31.toString();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) b34);
        java.lang.Object obj36 = defaultedMap22.remove((java.lang.Object) defaultedMap35);
        java.util.Set set37 = defaultedMap35.keySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 0.0d);
        java.lang.Object obj44 = defaultedMap39.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b46 = defaultedMap39.containsKey((java.lang.Object) '#');
        int i47 = defaultedMap39.size();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap39.putAll((java.util.Map) defaultedMap49);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d54 = elitisticListPopulation53.getElitismRate();
        double d55 = elitisticListPopulation53.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome56 = elitisticListPopulation53.getChromosomes();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) list_chromosome56);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d61 = elitisticListPopulation60.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome62 = elitisticListPopulation60.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation65 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d66 = elitisticListPopulation65.getElitismRate();
        double d67 = elitisticListPopulation65.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome68 = elitisticListPopulation65.getChromosomes();
        elitisticListPopulation60.setChromosomes(list_chromosome68);
        java.lang.Object obj70 = defaultedMap35.put((java.lang.Object) map57, (java.lang.Object) list_chromosome68);
        java.util.Collection collection71 = defaultedMap35.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation74 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome75 = elitisticListPopulation74.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome76 = list_chromosome75.spliterator();
        java.lang.Object obj77 = defaultedMap1.put((java.lang.Object) collection71, (java.lang.Object) list_chromosome75);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation80 = new math.genetics.ElitisticListPopulation(list_chromosome75, 10, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 10 + "'", obj24.equals((short) 10));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) 10 + "'", obj41.equals((short) 10));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i47 == 1);
        org.junit.Assert.assertTrue(d54 == 1.0d);
        org.junit.Assert.assertTrue(d55 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(d61 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome62);
        org.junit.Assert.assertTrue(d66 == 1.0d);
        org.junit.Assert.assertTrue(d67 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNotNull(list_chromosome75);
        org.junit.Assert.assertNotNull(spliterator_chromosome76);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) (short) 100);
        java.util.Set set22 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 0.0d);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b31 = defaultedMap24.containsKey((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str35 = defaultedMap34.toString();
        boolean b37 = defaultedMap34.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) b37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 0.0d);
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap40);
        boolean b45 = defaultedMap1.equals((java.lang.Object) defaultedMap40);
        defaultedMap1.clear();
        int i47 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 10 + "'", obj26.equals((short) 10));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 10 + "'", obj32.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 10 + "'", obj42.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(i47 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d16 = elitisticListPopulation15.getElitismRate();
        double d17 = elitisticListPopulation15.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation15.getChromosomes();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) list_chromosome18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str22 = defaultedMap21.toString();
        java.util.Set set23 = defaultedMap21.entrySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 0.0d);
        java.lang.Object obj31 = defaultedMap26.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b33 = defaultedMap26.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str36 = defaultedMap35.toString();
        boolean b38 = defaultedMap35.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) b38);
        java.lang.Object obj40 = defaultedMap26.remove((java.lang.Object) defaultedMap39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        boolean b42 = defaultedMap39.containsValue((java.lang.Object) predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str45 = defaultedMap44.toString();
        java.util.Set set46 = defaultedMap44.entrySet();
        boolean b47 = defaultedMap39.containsValue((java.lang.Object) defaultedMap44);
        java.lang.Object obj48 = null;
        boolean b49 = defaultedMap44.containsValue(obj48);
        java.lang.Object obj50 = defaultedMap11.get(obj48);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(d16 == 1.0d);
        org.junit.Assert.assertTrue(d17 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 10 + "'", obj28.equals((short) 10));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + ' ' + "'", obj50.equals(' '));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0L);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        math.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertNotNull(population7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0.0d);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap10.containsKey(obj16);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, obj16);
        boolean b19 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str23 = defaultedMap22.toString();
        boolean b25 = defaultedMap22.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) b25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 0.0d);
        java.lang.Object obj31 = defaultedMap26.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj32 = defaultedMap8.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 0.0d);
        java.lang.Object obj41 = defaultedMap36.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap36.containsKey(obj42);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, obj42);
        java.lang.Object obj45 = defaultedMap8.get((java.lang.Object) defaultedMap34);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        java.lang.Object obj47 = null;
        boolean b48 = defaultedMap8.containsValue(obj47);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d52 = elitisticListPopulation51.getElitismRate();
        double d53 = elitisticListPopulation51.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation51.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome55 = elitisticListPopulation51.iterator();
        math.genetics.Chromosome[] chromosome_array56 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome57 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b58 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57, chromosome_array56);
        elitisticListPopulation51.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome57);
        int i60 = elitisticListPopulation51.getPopulationLimit();
        math.genetics.Population population61 = elitisticListPopulation51.nextGeneration();
        boolean b62 = defaultedMap8.containsValue((java.lang.Object) population61);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 10 + "'", obj12.equals((short) 10));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 10 + "'", obj30.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + false + "'", obj31.equals(false));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 10 + "'", obj38.equals((short) 10));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + ' ' + "'", obj45.equals(' '));
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(d52 == 1.0d);
        org.junit.Assert.assertTrue(d53 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertNotNull(iterator_chromosome55);
        org.junit.Assert.assertNotNull(chromosome_array56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i60 == 10);
        org.junit.Assert.assertNotNull(population61);
        org.junit.Assert.assertTrue(b62 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) defaultedMap7);
        java.util.Collection collection11 = defaultedMap7.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d15 = elitisticListPopulation14.getElitismRate();
        double d16 = elitisticListPopulation14.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation14.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation14.iterator();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation14.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        java.lang.Object obj23 = defaultedMap7.get((java.lang.Object) elitisticListPopulation14);
        collections.Factory factory24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 10 + "'", obj9.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(d15 == 1.0d);
        org.junit.Assert.assertTrue(d16 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 10 + "'", obj23.equals((short) 10));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) (short) 100);
        java.util.Set set22 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 0.0d);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b31 = defaultedMap24.containsKey((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str35 = defaultedMap34.toString();
        boolean b37 = defaultedMap34.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) b37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 0.0d);
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap40);
        boolean b45 = defaultedMap1.equals((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) 0.0d);
        java.lang.Object obj56 = defaultedMap51.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj57 = null;
        boolean b58 = defaultedMap51.containsKey(obj57);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, obj57);
        boolean b60 = defaultedMap49.isEmpty();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str64 = defaultedMap63.toString();
        boolean b66 = defaultedMap63.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) b66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj71 = defaultedMap69.get((java.lang.Object) 0.0d);
        java.lang.Object obj72 = defaultedMap67.get((java.lang.Object) defaultedMap69);
        java.lang.Object obj73 = defaultedMap49.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap67);
        boolean b74 = defaultedMap47.containsKey(obj73);
        math.genetics.ElitisticListPopulation elitisticListPopulation77 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d78 = elitisticListPopulation77.getElitismRate();
        double d79 = elitisticListPopulation77.getElitismRate();
        double d80 = elitisticListPopulation77.getElitismRate();
        boolean b81 = defaultedMap47.containsValue((java.lang.Object) d80);
        java.lang.Object obj82 = defaultedMap1.get((java.lang.Object) defaultedMap47);
        math.genetics.ElitisticListPopulation elitisticListPopulation85 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d86 = elitisticListPopulation85.getElitismRate();
        double d87 = elitisticListPopulation85.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome88 = elitisticListPopulation85.iterator();
        boolean b89 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation85);
        math.genetics.Population population90 = elitisticListPopulation85.nextGeneration();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 10 + "'", obj26.equals((short) 10));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 10 + "'", obj32.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 10 + "'", obj42.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 10 + "'", obj53.equals((short) 10));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (short) 10 + "'", obj71.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + false + "'", obj72.equals(false));
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(d78 == 1.0d);
        org.junit.Assert.assertTrue(d79 == 1.0d);
        org.junit.Assert.assertTrue(d80 == 1.0d);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (short) 10 + "'", obj82.equals((short) 10));
        org.junit.Assert.assertTrue(d86 == 1.0d);
        org.junit.Assert.assertTrue(d87 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome88);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(population90);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(list_chromosome4, (int) (byte) 10, (double) 0.0f);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        try {
            math.genetics.Chromosome chromosome9 = elitisticListPopulation7.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 0.0d);
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap3.containsKey(obj9);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj9);
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str16 = defaultedMap15.toString();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) b18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0.0d);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) defaultedMap21);
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap19);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d29 = elitisticListPopulation28.getElitismRate();
        double d30 = elitisticListPopulation28.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome31 = elitisticListPopulation28.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome32 = elitisticListPopulation28.iterator();
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation28.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d40 = elitisticListPopulation39.getElitismRate();
        double d41 = elitisticListPopulation39.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation39.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d46 = elitisticListPopulation45.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome47 = elitisticListPopulation45.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d51 = elitisticListPopulation50.getElitismRate();
        double d52 = elitisticListPopulation50.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome53 = elitisticListPopulation50.getChromosomes();
        elitisticListPopulation45.setChromosomes(list_chromosome53);
        elitisticListPopulation39.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome53);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome53);
        math.genetics.ElitisticListPopulation elitisticListPopulation59 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d60 = elitisticListPopulation59.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome61 = elitisticListPopulation59.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d65 = elitisticListPopulation64.getElitismRate();
        double d66 = elitisticListPopulation64.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome67 = elitisticListPopulation64.getChromosomes();
        elitisticListPopulation59.setChromosomes(list_chromosome67);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome67);
        math.genetics.Population population70 = elitisticListPopulation28.nextGeneration();
        boolean b71 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation28);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 10 + "'", obj23.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + false + "'", obj24.equals(false));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(d29 == 1.0d);
        org.junit.Assert.assertTrue(d30 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome31);
        org.junit.Assert.assertNotNull(iterator_chromosome32);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(d40 == 1.0d);
        org.junit.Assert.assertTrue(d41 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertTrue(d46 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome47);
        org.junit.Assert.assertTrue(d51 == 1.0d);
        org.junit.Assert.assertTrue(d52 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome53);
        org.junit.Assert.assertTrue(d60 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome61);
        org.junit.Assert.assertTrue(d65 == 1.0d);
        org.junit.Assert.assertTrue(d66 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome67);
        org.junit.Assert.assertNotNull(population70);
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(list_chromosome4, (int) (byte) 10, (double) 0.0f);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation7.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation7.spliterator();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0.0d);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b16 = defaultedMap9.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str19 = defaultedMap18.toString();
        boolean b21 = defaultedMap18.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) b21);
        java.lang.Object obj23 = defaultedMap9.remove((java.lang.Object) defaultedMap22);
        java.util.Set set24 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 0.0d);
        java.lang.Object obj31 = defaultedMap26.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b33 = defaultedMap26.containsKey((java.lang.Object) '#');
        int i34 = defaultedMap26.size();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap26.putAll((java.util.Map) defaultedMap36);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d41 = elitisticListPopulation40.getElitismRate();
        double d42 = elitisticListPopulation40.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation40.getChromosomes();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) list_chromosome43);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d48 = elitisticListPopulation47.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome49 = elitisticListPopulation47.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d53 = elitisticListPopulation52.getElitismRate();
        double d54 = elitisticListPopulation52.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation52.getChromosomes();
        elitisticListPopulation47.setChromosomes(list_chromosome55);
        java.lang.Object obj57 = defaultedMap22.put((java.lang.Object) map44, (java.lang.Object) list_chromosome55);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome55);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation61 = new math.genetics.ElitisticListPopulation(list_chromosome55, (int) 'a', (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 10 + "'", obj11.equals((short) 10));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 10 + "'", obj28.equals((short) 10));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(d41 == 1.0d);
        org.junit.Assert.assertTrue(d42 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(d48 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome49);
        org.junit.Assert.assertTrue(d53 == 1.0d);
        org.junit.Assert.assertTrue(d54 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        double d5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) iterator_chromosome8);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) (short) 100);
        java.util.Set set22 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 0.0d);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b31 = defaultedMap24.containsKey((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str35 = defaultedMap34.toString();
        boolean b37 = defaultedMap34.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) b37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 0.0d);
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap40);
        boolean b45 = defaultedMap1.equals((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) 0.0d);
        java.lang.Object obj56 = defaultedMap51.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj57 = null;
        boolean b58 = defaultedMap51.containsKey(obj57);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, obj57);
        boolean b60 = defaultedMap49.isEmpty();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str64 = defaultedMap63.toString();
        boolean b66 = defaultedMap63.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) b66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj71 = defaultedMap69.get((java.lang.Object) 0.0d);
        java.lang.Object obj72 = defaultedMap67.get((java.lang.Object) defaultedMap69);
        java.lang.Object obj73 = defaultedMap49.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap67);
        boolean b74 = defaultedMap47.containsKey(obj73);
        math.genetics.ElitisticListPopulation elitisticListPopulation77 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d78 = elitisticListPopulation77.getElitismRate();
        double d79 = elitisticListPopulation77.getElitismRate();
        double d80 = elitisticListPopulation77.getElitismRate();
        boolean b81 = defaultedMap47.containsValue((java.lang.Object) d80);
        java.lang.Object obj82 = defaultedMap1.get((java.lang.Object) defaultedMap47);
        math.genetics.ElitisticListPopulation elitisticListPopulation85 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d86 = elitisticListPopulation85.getElitismRate();
        double d87 = elitisticListPopulation85.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome88 = elitisticListPopulation85.iterator();
        boolean b89 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation85);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation85);
        double d91 = elitisticListPopulation85.getElitismRate();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 10 + "'", obj26.equals((short) 10));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 10 + "'", obj32.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 10 + "'", obj42.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 10 + "'", obj53.equals((short) 10));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (short) 10 + "'", obj71.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + false + "'", obj72.equals(false));
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(d78 == 1.0d);
        org.junit.Assert.assertTrue(d79 == 1.0d);
        org.junit.Assert.assertTrue(d80 == 1.0d);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (short) 10 + "'", obj82.equals((short) 10));
        org.junit.Assert.assertTrue(d86 == 1.0d);
        org.junit.Assert.assertTrue(d87 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome88);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(d91 == 1.0d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        java.util.Set set18 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d22 = elitisticListPopulation21.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation21.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(list_chromosome23, (int) (byte) 10, (double) 0.0f);
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) list_chromosome23);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(d22 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 10 + "'", obj27.equals((short) 10));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str13 = defaultedMap12.toString();
        boolean b15 = defaultedMap12.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 0.0d);
        java.lang.Object obj24 = defaultedMap19.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap19.containsKey(obj25);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, obj25);
        defaultedMap12.putAll(map27);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj30 = defaultedMap12.get((java.lang.Object) predicate29);
        java.util.Set set31 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) 0.0d);
        java.lang.Object obj38 = defaultedMap33.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b40 = defaultedMap33.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str43 = defaultedMap42.toString();
        boolean b45 = defaultedMap42.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) b45);
        java.lang.Object obj47 = defaultedMap33.remove((java.lang.Object) defaultedMap46);
        java.util.Set set48 = defaultedMap46.keySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj52 = defaultedMap50.get((java.lang.Object) 0.0d);
        java.lang.Object obj55 = defaultedMap50.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) '#');
        int i58 = defaultedMap50.size();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap50.putAll((java.util.Map) defaultedMap60);
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d65 = elitisticListPopulation64.getElitismRate();
        double d66 = elitisticListPopulation64.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome67 = elitisticListPopulation64.getChromosomes();
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) list_chromosome67);
        math.genetics.ElitisticListPopulation elitisticListPopulation71 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d72 = elitisticListPopulation71.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome73 = elitisticListPopulation71.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation76 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d77 = elitisticListPopulation76.getElitismRate();
        double d78 = elitisticListPopulation76.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome79 = elitisticListPopulation76.getChromosomes();
        elitisticListPopulation71.setChromosomes(list_chromosome79);
        java.lang.Object obj81 = defaultedMap46.put((java.lang.Object) map68, (java.lang.Object) list_chromosome79);
        java.util.Collection collection82 = defaultedMap46.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation85 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome86 = elitisticListPopulation85.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome87 = list_chromosome86.spliterator();
        java.lang.Object obj88 = defaultedMap12.put((java.lang.Object) collection82, (java.lang.Object) list_chromosome86);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome86);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 10 + "'", obj30.equals((short) 10));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 10 + "'", obj35.equals((short) 10));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (short) 10 + "'", obj52.equals((short) 10));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i58 == 1);
        org.junit.Assert.assertTrue(d65 == 1.0d);
        org.junit.Assert.assertTrue(d66 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(d72 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome73);
        org.junit.Assert.assertTrue(d77 == 1.0d);
        org.junit.Assert.assertTrue(d78 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNotNull(list_chromosome86);
        org.junit.Assert.assertNotNull(spliterator_chromosome87);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0.0d);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap10.containsKey(obj16);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, obj16);
        boolean b19 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str23 = defaultedMap22.toString();
        boolean b25 = defaultedMap22.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) b25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 0.0d);
        java.lang.Object obj31 = defaultedMap26.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj32 = defaultedMap8.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 0.0d);
        java.lang.Object obj41 = defaultedMap36.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap36.containsKey(obj42);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, obj42);
        java.lang.Object obj45 = defaultedMap8.get((java.lang.Object) defaultedMap34);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d50 = elitisticListPopulation49.getElitismRate();
        double d51 = elitisticListPopulation49.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome52 = elitisticListPopulation49.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome53 = elitisticListPopulation49.iterator();
        math.genetics.Chromosome[] chromosome_array54 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome55 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55, chromosome_array54);
        elitisticListPopulation49.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome55);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation49);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj64 = defaultedMap62.get((java.lang.Object) 0.0d);
        java.lang.Object obj67 = defaultedMap62.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj68 = null;
        boolean b69 = defaultedMap62.containsKey(obj68);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, obj68);
        boolean b71 = defaultedMap60.isEmpty();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str75 = defaultedMap74.toString();
        boolean b77 = defaultedMap74.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) b77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj82 = defaultedMap80.get((java.lang.Object) 0.0d);
        java.lang.Object obj83 = defaultedMap78.get((java.lang.Object) defaultedMap80);
        java.lang.Object obj84 = defaultedMap60.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap78);
        java.util.Set set85 = defaultedMap60.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap60);
        boolean b87 = defaultedMap60.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 10 + "'", obj12.equals((short) 10));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 10 + "'", obj30.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + false + "'", obj31.equals(false));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 10 + "'", obj38.equals((short) 10));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + ' ' + "'", obj45.equals(' '));
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(d50 == 1.0d);
        org.junit.Assert.assertTrue(d51 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome52);
        org.junit.Assert.assertNotNull(iterator_chromosome53);
        org.junit.Assert.assertNotNull(chromosome_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (short) 10 + "'", obj64.equals((short) 10));
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "{}" + "'", str75.equals("{}"));
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (short) 10 + "'", obj82.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + false + "'", obj83.equals(false));
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertTrue(b87 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate13, predicate16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 0.0d);
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b27 = defaultedMap20.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str30 = defaultedMap29.toString();
        boolean b32 = defaultedMap29.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) b32);
        java.lang.Object obj34 = defaultedMap20.remove((java.lang.Object) defaultedMap33);
        java.util.Set set35 = defaultedMap33.keySet();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate(map18, predicate36, predicate38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicate38);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 10 + "'", obj22.equals((short) 10));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + false + "'", obj37.equals(false));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d16 = elitisticListPopulation15.getElitismRate();
        double d17 = elitisticListPopulation15.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation15.getChromosomes();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) list_chromosome18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str23 = defaultedMap22.toString();
        boolean b25 = defaultedMap22.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 0.0d);
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj35 = null;
        boolean b36 = defaultedMap29.containsKey(obj35);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, obj35);
        defaultedMap22.putAll(map37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj40 = defaultedMap22.get((java.lang.Object) predicate39);
        java.util.Set set41 = defaultedMap22.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0L);
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation44.getChromosomes();
        boolean b46 = defaultedMap22.containsKey((java.lang.Object) elitisticListPopulation44);
        java.lang.Object obj47 = defaultedMap11.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) 0.0d);
        java.lang.Object obj56 = defaultedMap51.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj57 = null;
        boolean b58 = defaultedMap51.containsKey(obj57);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, obj57);
        boolean b60 = defaultedMap49.isEmpty();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str64 = defaultedMap63.toString();
        boolean b66 = defaultedMap63.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) b66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj71 = defaultedMap69.get((java.lang.Object) 0.0d);
        java.lang.Object obj72 = defaultedMap67.get((java.lang.Object) defaultedMap69);
        java.lang.Object obj73 = defaultedMap49.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap67);
        defaultedMap22.putAll((java.util.Map) defaultedMap49);
        int i75 = defaultedMap49.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(d16 == 1.0d);
        org.junit.Assert.assertTrue(d17 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 10 + "'", obj31.equals((short) 10));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short) 10 + "'", obj40.equals((short) 10));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(list_chromosome45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 10 + "'", obj53.equals((short) 10));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (short) 10 + "'", obj71.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + false + "'", obj72.equals(false));
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(i75 == 1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        try {
            elitisticListPopulation2.setElitismRate((double) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str20 = defaultedMap19.toString();
        java.util.Set set21 = defaultedMap19.entrySet();
        boolean b22 = defaultedMap14.containsValue((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 0.0d);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b31 = defaultedMap24.containsKey((java.lang.Object) '#');
        int i32 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap24.putAll((java.util.Map) defaultedMap34);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d39 = elitisticListPopulation38.getElitismRate();
        double d40 = elitisticListPopulation38.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation38.getChromosomes();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) list_chromosome41);
        defaultedMap19.putAll((java.util.Map) defaultedMap34);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 10 + "'", obj26.equals((short) 10));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertTrue(d39 == 1.0d);
        org.junit.Assert.assertTrue(d40 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome41);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.lang.String str6 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        double d10 = elitisticListPopulation8.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation8.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation8.iterator();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, (int) (short) 10, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d10 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d8 = elitisticListPopulation7.getElitismRate();
        double d9 = elitisticListPopulation7.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome10);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation2.iterator();
        int i13 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str14 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicate2);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d7 = elitisticListPopulation6.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation6.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d12 = elitisticListPopulation11.getElitismRate();
        double d13 = elitisticListPopulation11.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation11.getChromosomes();
        elitisticListPopulation6.setChromosomes(list_chromosome14);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation6.iterator();
        int i17 = elitisticListPopulation6.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation6.iterator();
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation6.addChromosome(chromosome19);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation6.getChromosomes();
        java.lang.Object obj22 = defaultedMap1.remove((java.lang.Object) list_chromosome21);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(d7 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue(d12 == 1.0d);
        org.junit.Assert.assertTrue(d13 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d5 = elitisticListPopulation4.getElitismRate();
        double d6 = elitisticListPopulation4.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation4.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation4.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation4.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) elitisticListPopulation4);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d8 = elitisticListPopulation7.getElitismRate();
        double d9 = elitisticListPopulation7.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome10);
        elitisticListPopulation2.setPopulationLimit((int) '#');
        math.genetics.Population population14 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(population14);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 0.0d);
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap3.containsKey(obj9);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d15 = elitisticListPopulation14.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation14.iterator();
        double d17 = elitisticListPopulation14.getElitismRate();
        java.lang.String str18 = elitisticListPopulation14.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome19 = elitisticListPopulation14.spliterator();
        java.util.Map map20 = collections.map.DefaultedMap.decorate(map11, (java.lang.Object) spliterator_chromosome19);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(d15 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertTrue(d17 == 1.0d);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 0.0d);
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b24 = defaultedMap17.containsKey((java.lang.Object) '#');
        int i25 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap17.putAll((java.util.Map) defaultedMap27);
        boolean b30 = defaultedMap27.containsValue((java.lang.Object) (byte) 0);
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str34 = defaultedMap33.toString();
        java.util.Set set35 = defaultedMap33.entrySet();
        boolean b36 = defaultedMap1.equals((java.lang.Object) defaultedMap33);
        java.util.Set set37 = defaultedMap33.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 10 + "'", obj31.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d8 = elitisticListPopulation7.getElitismRate();
        double d9 = elitisticListPopulation7.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome10);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation2.iterator();
        int i13 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d18 = elitisticListPopulation17.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation17.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d23 = elitisticListPopulation22.getElitismRate();
        double d24 = elitisticListPopulation22.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation17.setChromosomes(list_chromosome25);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation29.getChromosomes();
        elitisticListPopulation17.setChromosomes(list_chromosome30);
        elitisticListPopulation2.setChromosomes(list_chromosome30);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d36 = elitisticListPopulation35.getElitismRate();
        double d37 = elitisticListPopulation35.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation35.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d42 = elitisticListPopulation41.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome43 = elitisticListPopulation41.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d47 = elitisticListPopulation46.getElitismRate();
        double d48 = elitisticListPopulation46.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome49 = elitisticListPopulation46.getChromosomes();
        elitisticListPopulation41.setChromosomes(list_chromosome49);
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome49);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome49);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertTrue(d18 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertTrue(d23 == 1.0d);
        org.junit.Assert.assertTrue(d24 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertTrue(d36 == 1.0d);
        org.junit.Assert.assertTrue(d37 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertTrue(d42 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome43);
        org.junit.Assert.assertTrue(d47 == 1.0d);
        org.junit.Assert.assertTrue(d48 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome49);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) (short) 100);
        java.util.Set set22 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 0.0d);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b31 = defaultedMap24.containsKey((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str35 = defaultedMap34.toString();
        boolean b37 = defaultedMap34.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) b37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 0.0d);
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap40);
        boolean b45 = defaultedMap1.equals((java.lang.Object) defaultedMap40);
        defaultedMap1.clear();
        java.lang.String str47 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 10 + "'", obj26.equals((short) 10));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 10 + "'", obj32.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 10 + "'", obj42.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 0.0d);
        java.lang.Object obj11 = defaultedMap6.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b13 = defaultedMap6.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str16 = defaultedMap15.toString();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) b18);
        java.lang.Object obj20 = defaultedMap6.remove((java.lang.Object) defaultedMap19);
        java.util.Set set21 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 0.0d);
        java.lang.Object obj28 = defaultedMap23.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b30 = defaultedMap23.containsKey((java.lang.Object) '#');
        int i31 = defaultedMap23.size();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap23.putAll((java.util.Map) defaultedMap33);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d38 = elitisticListPopulation37.getElitismRate();
        double d39 = elitisticListPopulation37.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome40 = elitisticListPopulation37.getChromosomes();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) list_chromosome40);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d45 = elitisticListPopulation44.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome46 = elitisticListPopulation44.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d50 = elitisticListPopulation49.getElitismRate();
        double d51 = elitisticListPopulation49.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation49.getChromosomes();
        elitisticListPopulation44.setChromosomes(list_chromosome52);
        java.lang.Object obj54 = defaultedMap19.put((java.lang.Object) map41, (java.lang.Object) list_chromosome52);
        java.util.Collection collection55 = defaultedMap19.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection55);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 10 + "'", obj25.equals((short) 10));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 1);
        org.junit.Assert.assertTrue(d38 == 1.0d);
        org.junit.Assert.assertTrue(d39 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(d45 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome46);
        org.junit.Assert.assertTrue(d50 == 1.0d);
        org.junit.Assert.assertTrue(d51 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(collection55);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsKey(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0.0d);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 0.0d);
        java.lang.Object obj24 = defaultedMap19.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap19.containsKey(obj25);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, obj25);
        boolean b28 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str32 = defaultedMap31.toString();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) b34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 0.0d);
        java.lang.Object obj40 = defaultedMap35.get((java.lang.Object) defaultedMap37);
        java.lang.Object obj41 = defaultedMap17.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) 0.0d);
        java.lang.Object obj50 = defaultedMap45.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj51 = null;
        boolean b52 = defaultedMap45.containsKey(obj51);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, obj51);
        java.lang.Object obj54 = defaultedMap17.get((java.lang.Object) defaultedMap43);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap17);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj60 = defaultedMap58.get((java.lang.Object) 0.0d);
        java.lang.Object obj63 = defaultedMap58.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b65 = defaultedMap58.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str68 = defaultedMap67.toString();
        boolean b70 = defaultedMap67.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) b70);
        java.lang.Object obj72 = defaultedMap58.remove((java.lang.Object) defaultedMap71);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        boolean b74 = defaultedMap71.containsValue((java.lang.Object) predicate73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str77 = defaultedMap76.toString();
        java.util.Set set78 = defaultedMap76.entrySet();
        boolean b79 = defaultedMap71.containsValue((java.lang.Object) defaultedMap76);
        java.lang.Object obj80 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) defaultedMap71);
        java.util.Set set81 = defaultedMap71.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 10 + "'", obj12.equals((short) 10));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 10 + "'", obj39.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + false + "'", obj40.equals(false));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (short) 10 + "'", obj47.equals((short) 10));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + ' ' + "'", obj54.equals(' '));
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (short) 10 + "'", obj60.equals((short) 10));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(set81);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d8 = elitisticListPopulation7.getElitismRate();
        double d9 = elitisticListPopulation7.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome10);
        elitisticListPopulation2.setPopulationLimit((int) '#');
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation2.spliterator();
        int i15 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        double d5 = elitisticListPopulation2.getElitismRate();
        java.lang.String str6 = elitisticListPopulation2.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d10 = elitisticListPopulation9.getElitismRate();
        double d11 = elitisticListPopulation9.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation9.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation9.iterator();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d21 = elitisticListPopulation20.getElitismRate();
        double d22 = elitisticListPopulation20.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation20.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d27 = elitisticListPopulation26.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome28 = elitisticListPopulation26.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d32 = elitisticListPopulation31.getElitismRate();
        double d33 = elitisticListPopulation31.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation26.setChromosomes(list_chromosome34);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome34);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome34);
        elitisticListPopulation2.setChromosomes(list_chromosome34);
        java.lang.String str39 = elitisticListPopulation2.toString();
        math.genetics.Population population40 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertTrue(d10 == 1.0d);
        org.junit.Assert.assertTrue(d11 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(d21 == 1.0d);
        org.junit.Assert.assertTrue(d22 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertTrue(d27 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome28);
        org.junit.Assert.assertTrue(d32 == 1.0d);
        org.junit.Assert.assertTrue(d33 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome34);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]" + "'", str39.equals("[]"));
        org.junit.Assert.assertNotNull(population40);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        java.util.Set set16 = defaultedMap14.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str21 = defaultedMap20.toString();
        boolean b23 = defaultedMap20.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) b23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 0.0d);
        java.lang.Object obj29 = defaultedMap24.get((java.lang.Object) defaultedMap26);
        java.util.Collection collection30 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 0.0d);
        java.lang.Object obj37 = defaultedMap32.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b39 = defaultedMap32.containsKey((java.lang.Object) '#');
        int i40 = defaultedMap32.size();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap32.putAll((java.util.Map) defaultedMap42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate44, predicate47);
        boolean b50 = defaultedMap26.containsKey((java.lang.Object) defaultedMap42);
        java.lang.Object obj51 = defaultedMap14.remove((java.lang.Object) defaultedMap26);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 10 + "'", obj28.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + false + "'", obj29.equals(false));
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 10 + "'", obj34.equals((short) 10));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 1);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d8 = elitisticListPopulation7.getElitismRate();
        double d9 = elitisticListPopulation7.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome10);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation2.iterator();
        int i13 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation2.addChromosome(chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d8 = elitisticListPopulation7.getElitismRate();
        double d9 = elitisticListPopulation7.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome10);
        elitisticListPopulation2.setPopulationLimit((int) '#');
        try {
            math.genetics.Chromosome chromosome14 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8);
        math.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(population11);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) (short) 100);
        java.util.Set set22 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 0.0d);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b31 = defaultedMap24.containsKey((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) 0.0d);
        java.lang.Object obj39 = defaultedMap34.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b41 = defaultedMap34.containsKey((java.lang.Object) '#');
        int i42 = defaultedMap34.size();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap34.putAll((java.util.Map) defaultedMap44);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) predicate49);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate46, predicate49);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj55 = defaultedMap53.get((java.lang.Object) 0.0d);
        java.lang.Object obj58 = defaultedMap53.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b60 = defaultedMap53.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str63 = defaultedMap62.toString();
        boolean b65 = defaultedMap62.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) b65);
        java.lang.Object obj67 = defaultedMap53.remove((java.lang.Object) defaultedMap66);
        java.util.Set set68 = defaultedMap66.keySet();
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj70 = defaultedMap66.get((java.lang.Object) predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate(map51, predicate69, predicate71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj76 = defaultedMap74.get((java.lang.Object) 0.0d);
        java.lang.Object obj79 = defaultedMap74.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b81 = defaultedMap74.containsKey((java.lang.Object) '#');
        int i82 = defaultedMap74.size();
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap74.putAll((java.util.Map) defaultedMap84);
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj90 = defaultedMap88.remove((java.lang.Object) predicate89);
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate86, predicate89);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate69, predicate86);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 10 + "'", obj26.equals((short) 10));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 10 + "'", obj32.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 10 + "'", obj36.equals((short) 10));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (short) 10 + "'", obj55.equals((short) 10));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + false + "'", obj70.equals(false));
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + (short) 10 + "'", obj76.equals((short) 10));
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(i82 == 1);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map92);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        java.util.Set set16 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 0.0d);
        java.lang.Object obj23 = defaultedMap18.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b25 = defaultedMap18.containsKey((java.lang.Object) '#');
        int i26 = defaultedMap18.size();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap18.putAll((java.util.Map) defaultedMap28);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d33 = elitisticListPopulation32.getElitismRate();
        double d34 = elitisticListPopulation32.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation32.getChromosomes();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) list_chromosome35);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d40 = elitisticListPopulation39.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome41 = elitisticListPopulation39.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d45 = elitisticListPopulation44.getElitismRate();
        double d46 = elitisticListPopulation44.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome47 = elitisticListPopulation44.getChromosomes();
        elitisticListPopulation39.setChromosomes(list_chromosome47);
        java.lang.Object obj49 = defaultedMap14.put((java.lang.Object) map36, (java.lang.Object) list_chromosome47);
        java.util.Collection collection50 = defaultedMap14.values();
        boolean b51 = defaultedMap14.isEmpty();
        java.util.Set set52 = defaultedMap14.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 10 + "'", obj20.equals((short) 10));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertTrue(d33 == 1.0d);
        org.junit.Assert.assertTrue(d34 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(d40 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome41);
        org.junit.Assert.assertTrue(d45 == 1.0d);
        org.junit.Assert.assertTrue(d46 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set52);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, 0.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0L);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        int i7 = elitisticListPopulation5.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d11 = elitisticListPopulation10.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation10.iterator();
        double d13 = elitisticListPopulation10.getElitismRate();
        java.lang.String str14 = elitisticListPopulation10.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d18 = elitisticListPopulation17.getElitismRate();
        double d19 = elitisticListPopulation17.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation17.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation17.iterator();
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d29 = elitisticListPopulation28.getElitismRate();
        double d30 = elitisticListPopulation28.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation28.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d35 = elitisticListPopulation34.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome36 = elitisticListPopulation34.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d40 = elitisticListPopulation39.getElitismRate();
        double d41 = elitisticListPopulation39.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation39.getChromosomes();
        elitisticListPopulation34.setChromosomes(list_chromosome42);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome42);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome42);
        elitisticListPopulation10.setChromosomes(list_chromosome42);
        java.util.List<math.genetics.Chromosome> list_chromosome47 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome47);
        elitisticListPopulation2.setChromosomes(list_chromosome47);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(d11 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue(d13 == 1.0d);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertTrue(d18 == 1.0d);
        org.junit.Assert.assertTrue(d19 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d29 == 1.0d);
        org.junit.Assert.assertTrue(d30 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertTrue(d35 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome36);
        org.junit.Assert.assertTrue(d40 == 1.0d);
        org.junit.Assert.assertTrue(d41 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertNotNull(list_chromosome47);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate13, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap11);
        java.util.Set set20 = defaultedMap19.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        collections.Factory factory18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate(map16, factory18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsKey(obj7);
        int i9 = defaultedMap1.size();
        int i10 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 0.0d);
        java.lang.Object obj24 = defaultedMap19.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str29 = defaultedMap28.toString();
        boolean b31 = defaultedMap28.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) b31);
        java.lang.Object obj33 = defaultedMap19.remove((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj37 = defaultedMap35.get((java.lang.Object) 0.0d);
        java.lang.Object obj40 = defaultedMap35.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b42 = defaultedMap35.containsKey((java.lang.Object) '#');
        int i43 = defaultedMap35.size();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap35.putAll((java.util.Map) defaultedMap45);
        boolean b48 = defaultedMap45.containsValue((java.lang.Object) (byte) 0);
        java.lang.Object obj49 = defaultedMap19.get((java.lang.Object) defaultedMap45);
        defaultedMap14.putAll((java.util.Map) defaultedMap45);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 10 + "'", obj37.equals((short) 10));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == 1);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (short) 10 + "'", obj49.equals((short) 10));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0.0d);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b16 = defaultedMap9.containsKey((java.lang.Object) '#');
        int i17 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap9.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj21 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) defaultedMap9);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d25 = elitisticListPopulation24.getElitismRate();
        double d26 = elitisticListPopulation24.getElitismRate();
        math.genetics.Population population27 = elitisticListPopulation24.nextGeneration();
        java.lang.Object obj28 = defaultedMap9.remove((java.lang.Object) elitisticListPopulation24);
        elitisticListPopulation24.setPopulationLimit((int) (short) 10);
        double d31 = elitisticListPopulation24.getElitismRate();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 10 + "'", obj11.equals((short) 10));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(d25 == 1.0d);
        org.junit.Assert.assertTrue(d26 == 1.0d);
        org.junit.Assert.assertNotNull(population27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(d31 == 1.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d16 = elitisticListPopulation15.getElitismRate();
        double d17 = elitisticListPopulation15.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation15.getChromosomes();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) list_chromosome18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0.0d);
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b28 = defaultedMap21.containsKey((java.lang.Object) '#');
        int i29 = defaultedMap21.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap21.putAll((java.util.Map) defaultedMap31);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d36 = elitisticListPopulation35.getElitismRate();
        double d37 = elitisticListPopulation35.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation35.getChromosomes();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) list_chromosome38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str43 = defaultedMap42.toString();
        boolean b45 = defaultedMap42.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) 0.0d);
        java.lang.Object obj54 = defaultedMap49.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj55 = null;
        boolean b56 = defaultedMap49.containsKey(obj55);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, obj55);
        defaultedMap42.putAll(map57);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj60 = defaultedMap42.get((java.lang.Object) predicate59);
        java.util.Set set61 = defaultedMap42.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0L);
        java.util.List<math.genetics.Chromosome> list_chromosome65 = elitisticListPopulation64.getChromosomes();
        boolean b66 = defaultedMap42.containsKey((java.lang.Object) elitisticListPopulation64);
        java.lang.Object obj67 = defaultedMap31.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj73 = defaultedMap71.get((java.lang.Object) 0.0d);
        java.lang.Object obj76 = defaultedMap71.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj77 = null;
        boolean b78 = defaultedMap71.containsKey(obj77);
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, obj77);
        boolean b80 = defaultedMap69.isEmpty();
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str84 = defaultedMap83.toString();
        boolean b86 = defaultedMap83.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) b86);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj91 = defaultedMap89.get((java.lang.Object) 0.0d);
        java.lang.Object obj92 = defaultedMap87.get((java.lang.Object) defaultedMap89);
        java.lang.Object obj93 = defaultedMap69.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap87);
        defaultedMap42.putAll((java.util.Map) defaultedMap69);
        boolean b95 = defaultedMap11.containsKey((java.lang.Object) defaultedMap42);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(d16 == 1.0d);
        org.junit.Assert.assertTrue(d17 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 10 + "'", obj23.equals((short) 10));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertTrue(d36 == 1.0d);
        org.junit.Assert.assertTrue(d37 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (short) 10 + "'", obj51.equals((short) 10));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (short) 10 + "'", obj60.equals((short) 10));
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(list_chromosome65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + (short) 10 + "'", obj73.equals((short) 10));
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "{}" + "'", str84.equals("{}"));
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + (short) 10 + "'", obj91.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + false + "'", obj92.equals(false));
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue(b95 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0.0d);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b16 = defaultedMap9.containsKey((java.lang.Object) '#');
        int i17 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap9.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj21 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 0.0d);
        java.lang.Object obj28 = defaultedMap23.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b30 = defaultedMap23.containsKey((java.lang.Object) '#');
        int i31 = defaultedMap23.size();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap23.putAll((java.util.Map) defaultedMap33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate35, predicate38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 0.0d);
        java.lang.Object obj47 = defaultedMap42.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b49 = defaultedMap42.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str52 = defaultedMap51.toString();
        boolean b54 = defaultedMap51.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) b54);
        java.lang.Object obj56 = defaultedMap42.remove((java.lang.Object) defaultedMap55);
        java.util.Set set57 = defaultedMap55.keySet();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj59 = defaultedMap55.get((java.lang.Object) predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate(map40, predicate58, predicate60);
        boolean b62 = defaultedMap5.containsValue((java.lang.Object) map61);
        java.lang.String str63 = defaultedMap5.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 10 + "'", obj11.equals((short) 10));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 10 + "'", obj25.equals((short) 10));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 1);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 10 + "'", obj44.equals((short) 10));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + false + "'", obj59.equals(false));
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.util.List<math.genetics.Chromosome> list_chromosome0 = null;
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(list_chromosome0, (int) (short) 1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) (short) 100);
        int i22 = defaultedMap1.size();
        int i23 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        java.util.Set set16 = defaultedMap14.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) predicate17);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d22 = elitisticListPopulation21.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome23 = elitisticListPopulation21.iterator();
        double d24 = elitisticListPopulation21.getElitismRate();
        java.lang.String str25 = elitisticListPopulation21.toString();
        java.lang.Object obj26 = defaultedMap14.get((java.lang.Object) elitisticListPopulation21);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation21.getChromosomes();
        elitisticListPopulation21.setPopulationLimit((int) (byte) 100);
        math.genetics.Population population30 = elitisticListPopulation21.nextGeneration();
        math.genetics.Chromosome chromosome31 = null;
        elitisticListPopulation21.addChromosome(chromosome31);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertTrue(d22 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome23);
        org.junit.Assert.assertTrue(d24 == 1.0d);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + false + "'", obj26.equals(false));
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertNotNull(population30);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0L);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setElitismRate((double) (byte) 1);
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        double d5 = elitisticListPopulation2.getElitismRate();
        java.lang.String str6 = elitisticListPopulation2.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d10 = elitisticListPopulation9.getElitismRate();
        double d11 = elitisticListPopulation9.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation9.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation9.iterator();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d21 = elitisticListPopulation20.getElitismRate();
        double d22 = elitisticListPopulation20.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation20.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d27 = elitisticListPopulation26.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome28 = elitisticListPopulation26.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d32 = elitisticListPopulation31.getElitismRate();
        double d33 = elitisticListPopulation31.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation26.setChromosomes(list_chromosome34);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome34);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome34);
        elitisticListPopulation2.setChromosomes(list_chromosome34);
        int i39 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertTrue(d10 == 1.0d);
        org.junit.Assert.assertTrue(d11 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(d21 == 1.0d);
        org.junit.Assert.assertTrue(d22 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertTrue(d27 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome28);
        org.junit.Assert.assertTrue(d32 == 1.0d);
        org.junit.Assert.assertTrue(d33 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome34);
        org.junit.Assert.assertTrue(i39 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0.0d);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b16 = defaultedMap9.containsKey((java.lang.Object) '#');
        int i17 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap9.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj21 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) defaultedMap9);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d25 = elitisticListPopulation24.getElitismRate();
        double d26 = elitisticListPopulation24.getElitismRate();
        math.genetics.Population population27 = elitisticListPopulation24.nextGeneration();
        java.lang.Object obj28 = defaultedMap9.remove((java.lang.Object) elitisticListPopulation24);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str31 = defaultedMap30.toString();
        boolean b33 = defaultedMap30.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) b33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 0.0d);
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) defaultedMap36);
        java.lang.Object obj41 = defaultedMap36.remove((java.lang.Object) ' ');
        boolean b42 = defaultedMap9.containsValue((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 10 + "'", obj11.equals((short) 10));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(d25 == 1.0d);
        org.junit.Assert.assertTrue(d26 == 1.0d);
        org.junit.Assert.assertNotNull(population27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 10 + "'", obj38.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + false + "'", obj39.equals(false));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        double d15 = elitisticListPopulation13.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation13.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d20 = elitisticListPopulation19.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation19.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d25 = elitisticListPopulation24.getElitismRate();
        double d26 = elitisticListPopulation24.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation19.setChromosomes(list_chromosome27);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome27);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome27);
        int i31 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome32 = null;
        elitisticListPopulation2.addChromosome(chromosome32);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(d14 == 1.0d);
        org.junit.Assert.assertTrue(d15 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
        org.junit.Assert.assertTrue(d25 == 1.0d);
        org.junit.Assert.assertTrue(d26 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertTrue(i31 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsKey(obj7);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) (-1.0d));
        boolean b12 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d16 = elitisticListPopulation15.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation15.iterator();
        double d18 = elitisticListPopulation15.getElitismRate();
        java.lang.String str19 = elitisticListPopulation15.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str22 = defaultedMap21.toString();
        boolean b24 = defaultedMap21.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) b24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 0.0d);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) defaultedMap27);
        java.util.Collection collection31 = defaultedMap27.values();
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) elitisticListPopulation15);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(d16 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertTrue(d18 == 1.0d);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]" + "'", str19.equals("[]"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (short) 10 + "'", obj29.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + false + "'", obj30.equals(false));
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) 10 + "'", obj33.equals((short) 10));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d8 = elitisticListPopulation7.getElitismRate();
        double d9 = elitisticListPopulation7.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome10);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation2.iterator();
        int i13 = elitisticListPopulation2.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d17 = elitisticListPopulation16.getElitismRate();
        double d18 = elitisticListPopulation16.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation16.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation16.iterator();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        elitisticListPopulation16.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d28 = elitisticListPopulation27.getElitismRate();
        double d29 = elitisticListPopulation27.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation27.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d34 = elitisticListPopulation33.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation33.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d39 = elitisticListPopulation38.getElitismRate();
        double d40 = elitisticListPopulation38.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation33.setChromosomes(list_chromosome41);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome41);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome41);
        elitisticListPopulation2.setChromosomes(list_chromosome41);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation(list_chromosome41, (int) 'a', (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(d17 == 1.0d);
        org.junit.Assert.assertTrue(d18 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(d28 == 1.0d);
        org.junit.Assert.assertTrue(d29 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertTrue(d34 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertTrue(d39 == 1.0d);
        org.junit.Assert.assertTrue(d40 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome41);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d8 = elitisticListPopulation7.getElitismRate();
        double d9 = elitisticListPopulation7.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome10);
        elitisticListPopulation2.setPopulationLimit((int) '#');
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertNotNull(list_chromosome15);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        double d5 = elitisticListPopulation2.getElitismRate();
        java.lang.String str6 = elitisticListPopulation2.toString();
        int i7 = elitisticListPopulation2.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertTrue(i7 == 10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 0, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d21 = elitisticListPopulation20.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation20.iterator();
        double d23 = elitisticListPopulation20.getElitismRate();
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) elitisticListPopulation20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str27 = defaultedMap26.toString();
        java.util.Collection collection28 = defaultedMap26.values();
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection28);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(d21 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertTrue(d23 == 1.0d);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 10 + "'", obj24.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0.0d);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap9.containsKey(obj15);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, obj15);
        boolean b18 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str22 = defaultedMap21.toString();
        boolean b24 = defaultedMap21.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) b24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 0.0d);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) defaultedMap27);
        java.lang.Object obj31 = defaultedMap7.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap25);
        boolean b32 = defaultedMap5.containsKey(obj31);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        defaultedMap5.clear();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str37 = defaultedMap36.toString();
        defaultedMap5.putAll((java.util.Map) defaultedMap36);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 10 + "'", obj11.equals((short) 10));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (short) 10 + "'", obj29.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + false + "'", obj30.equals(false));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        int i6 = elitisticListPopulation2.getPopulationSize();
        int i7 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d11 = elitisticListPopulation10.getElitismRate();
        double d12 = elitisticListPopulation10.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation10.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d17 = elitisticListPopulation16.getElitismRate();
        double d18 = elitisticListPopulation16.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation16.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation16.iterator();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        elitisticListPopulation16.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22);
        elitisticListPopulation10.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(d11 == 1.0d);
        org.junit.Assert.assertTrue(d12 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertTrue(d17 == 1.0d);
        org.junit.Assert.assertTrue(d18 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0L);
        elitisticListPopulation2.setElitismRate(0.0d);
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(population5);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        double d5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertTrue(d5 == 1.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 0.0d);
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap3.containsKey(obj9);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj9);
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str16 = defaultedMap15.toString();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) b18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0.0d);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) defaultedMap21);
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 0.0d);
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj35 = null;
        boolean b36 = defaultedMap29.containsKey(obj35);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, obj35);
        java.lang.Object obj38 = defaultedMap1.get((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 0.0d);
        java.lang.Object obj45 = defaultedMap40.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b47 = defaultedMap40.containsKey((java.lang.Object) '#');
        boolean b48 = defaultedMap40.isEmpty();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj52 = defaultedMap50.get((java.lang.Object) 0.0d);
        java.lang.Object obj55 = defaultedMap50.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj56 = null;
        boolean b57 = defaultedMap50.containsKey(obj56);
        int i58 = defaultedMap50.size();
        java.lang.Object obj59 = defaultedMap27.put((java.lang.Object) defaultedMap40, (java.lang.Object) i58);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 10 + "'", obj23.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + false + "'", obj24.equals(false));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 10 + "'", obj31.equals((short) 10));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + ' ' + "'", obj38.equals(' '));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 10 + "'", obj42.equals((short) 10));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (short) 10 + "'", obj52.equals((short) 10));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i58 == 1);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsKey(obj7);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d12 = elitisticListPopulation11.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation11.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d17 = elitisticListPopulation16.getElitismRate();
        double d18 = elitisticListPopulation16.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome19);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation11.iterator();
        int i22 = elitisticListPopulation11.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome23 = elitisticListPopulation11.iterator();
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation11);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 0.0d);
        java.lang.Object obj31 = defaultedMap26.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b33 = defaultedMap26.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str36 = defaultedMap35.toString();
        boolean b38 = defaultedMap35.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) b38);
        java.lang.Object obj40 = defaultedMap26.remove((java.lang.Object) defaultedMap39);
        java.util.Set set41 = defaultedMap39.keySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) 0.0d);
        java.lang.Object obj48 = defaultedMap43.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b50 = defaultedMap43.containsKey((java.lang.Object) '#');
        int i51 = defaultedMap43.size();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap43.putAll((java.util.Map) defaultedMap53);
        math.genetics.ElitisticListPopulation elitisticListPopulation57 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d58 = elitisticListPopulation57.getElitismRate();
        double d59 = elitisticListPopulation57.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome60 = elitisticListPopulation57.getChromosomes();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) list_chromosome60);
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d65 = elitisticListPopulation64.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome66 = elitisticListPopulation64.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation69 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d70 = elitisticListPopulation69.getElitismRate();
        double d71 = elitisticListPopulation69.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome72 = elitisticListPopulation69.getChromosomes();
        elitisticListPopulation64.setChromosomes(list_chromosome72);
        java.lang.Object obj74 = defaultedMap39.put((java.lang.Object) map61, (java.lang.Object) list_chromosome72);
        defaultedMap1.putAll((java.util.Map) defaultedMap39);
        collections.Factory factory76 = null;
        try {
            java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(d12 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertTrue(d17 == 1.0d);
        org.junit.Assert.assertTrue(d18 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 10 + "'", obj28.equals((short) 10));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) 10 + "'", obj45.equals((short) 10));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i51 == 1);
        org.junit.Assert.assertTrue(d58 == 1.0d);
        org.junit.Assert.assertTrue(d59 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(d65 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome66);
        org.junit.Assert.assertTrue(d70 == 1.0d);
        org.junit.Assert.assertTrue(d71 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome72);
        org.junit.Assert.assertNull(obj74);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        java.util.Set set12 = defaultedMap7.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 10 + "'", obj9.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        int i8 = elitisticListPopulation2.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) (short) 100);
        java.util.Set set22 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 0.0d);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b31 = defaultedMap24.containsKey((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) 0.0d);
        java.lang.Object obj39 = defaultedMap34.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj40 = null;
        boolean b41 = defaultedMap34.containsKey(obj40);
        int i42 = defaultedMap34.size();
        boolean b43 = defaultedMap1.equals((java.lang.Object) defaultedMap34);
        java.util.Set set44 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 10 + "'", obj26.equals((short) 10));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 10 + "'", obj32.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 10 + "'", obj36.equals((short) 10));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        double d10 = elitisticListPopulation8.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation8.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation8.iterator();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d20 = elitisticListPopulation19.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation19.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d25 = elitisticListPopulation24.getElitismRate();
        double d26 = elitisticListPopulation24.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation19.setChromosomes(list_chromosome27);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation19.setChromosomes(list_chromosome32);
        elitisticListPopulation8.setChromosomes(list_chromosome32);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(list_chromosome32, (int) (byte) 10, (double) 1);
        elitisticListPopulation2.setChromosomes(list_chromosome32);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d10 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
        org.junit.Assert.assertTrue(d25 == 1.0d);
        org.junit.Assert.assertTrue(d26 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertNotNull(list_chromosome32);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        int i6 = elitisticListPopulation2.getPopulationSize();
        int i7 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str8 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        double d5 = elitisticListPopulation2.getElitismRate();
        java.lang.String str6 = elitisticListPopulation2.toString();
        int i7 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome11);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertTrue(d5 == 1.0d);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertNotNull(list_chromosome11);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "[]");
        java.util.Set set2 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 0.0d);
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap3.containsKey(obj9);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj9);
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str16 = defaultedMap15.toString();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) b18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0.0d);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) defaultedMap21);
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 0.0d);
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj35 = null;
        boolean b36 = defaultedMap29.containsKey(obj35);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, obj35);
        java.lang.Object obj38 = defaultedMap1.get((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str42 = defaultedMap41.toString();
        int i43 = defaultedMap41.size();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) 0.0d);
        java.lang.Object obj54 = defaultedMap49.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b56 = defaultedMap49.containsKey((java.lang.Object) '#');
        int i57 = defaultedMap49.size();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap49.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj61 = defaultedMap41.put((java.lang.Object) defaultedMap45, (java.lang.Object) defaultedMap49);
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d65 = elitisticListPopulation64.getElitismRate();
        double d66 = elitisticListPopulation64.getElitismRate();
        math.genetics.Population population67 = elitisticListPopulation64.nextGeneration();
        java.lang.Object obj68 = defaultedMap49.remove((java.lang.Object) elitisticListPopulation64);
        math.genetics.ElitisticListPopulation elitisticListPopulation71 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d72 = elitisticListPopulation71.getElitismRate();
        double d73 = elitisticListPopulation71.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome74 = elitisticListPopulation71.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome75 = elitisticListPopulation71.iterator();
        math.genetics.Chromosome[] chromosome_array76 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome77 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b78 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome77, chromosome_array76);
        elitisticListPopulation71.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome77);
        int i80 = elitisticListPopulation71.getPopulationLimit();
        math.genetics.Population population81 = elitisticListPopulation71.nextGeneration();
        java.lang.Object obj82 = defaultedMap39.put((java.lang.Object) elitisticListPopulation64, (java.lang.Object) population81);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 10 + "'", obj23.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + false + "'", obj24.equals(false));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 10 + "'", obj31.equals((short) 10));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + ' ' + "'", obj38.equals(' '));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (short) 10 + "'", obj51.equals((short) 10));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(i57 == 1);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(d65 == 1.0d);
        org.junit.Assert.assertTrue(d66 == 1.0d);
        org.junit.Assert.assertNotNull(population67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(d72 == 1.0d);
        org.junit.Assert.assertTrue(d73 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome74);
        org.junit.Assert.assertNotNull(iterator_chromosome75);
        org.junit.Assert.assertNotNull(chromosome_array76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(i80 == 10);
        org.junit.Assert.assertNotNull(population81);
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) (short) 100);
        java.util.Set set22 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 0.0d);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b31 = defaultedMap24.containsKey((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str35 = defaultedMap34.toString();
        boolean b37 = defaultedMap34.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) b37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 0.0d);
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap40);
        boolean b45 = defaultedMap1.equals((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) 0.0d);
        java.lang.Object obj56 = defaultedMap51.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj57 = null;
        boolean b58 = defaultedMap51.containsKey(obj57);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, obj57);
        boolean b60 = defaultedMap49.isEmpty();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str64 = defaultedMap63.toString();
        boolean b66 = defaultedMap63.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) b66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj71 = defaultedMap69.get((java.lang.Object) 0.0d);
        java.lang.Object obj72 = defaultedMap67.get((java.lang.Object) defaultedMap69);
        java.lang.Object obj73 = defaultedMap49.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap67);
        boolean b74 = defaultedMap47.containsKey(obj73);
        math.genetics.ElitisticListPopulation elitisticListPopulation77 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d78 = elitisticListPopulation77.getElitismRate();
        double d79 = elitisticListPopulation77.getElitismRate();
        double d80 = elitisticListPopulation77.getElitismRate();
        boolean b81 = defaultedMap47.containsValue((java.lang.Object) d80);
        java.lang.Object obj82 = defaultedMap1.get((java.lang.Object) defaultedMap47);
        math.genetics.ElitisticListPopulation elitisticListPopulation85 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d86 = elitisticListPopulation85.getElitismRate();
        double d87 = elitisticListPopulation85.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome88 = elitisticListPopulation85.iterator();
        boolean b89 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation85);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation85);
        int i91 = elitisticListPopulation85.getPopulationSize();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 10 + "'", obj26.equals((short) 10));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 10 + "'", obj32.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 10 + "'", obj42.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 10 + "'", obj53.equals((short) 10));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (short) 10 + "'", obj71.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + false + "'", obj72.equals(false));
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(d78 == 1.0d);
        org.junit.Assert.assertTrue(d79 == 1.0d);
        org.junit.Assert.assertTrue(d80 == 1.0d);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (short) 10 + "'", obj82.equals((short) 10));
        org.junit.Assert.assertTrue(d86 == 1.0d);
        org.junit.Assert.assertTrue(d87 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome88);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(i91 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsKey(obj7);
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str12 = defaultedMap11.toString();
        java.util.Set set13 = defaultedMap11.entrySet();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "[]");
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 10 + "'", obj14.equals((short) 10));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Collection collection5 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + ' ' + "'", obj3.equals(' '));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0.0d);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap10.containsKey(obj16);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, obj16);
        boolean b19 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str23 = defaultedMap22.toString();
        boolean b25 = defaultedMap22.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) b25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 0.0d);
        java.lang.Object obj31 = defaultedMap26.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj32 = defaultedMap8.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 0.0d);
        java.lang.Object obj41 = defaultedMap36.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap36.containsKey(obj42);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, obj42);
        java.lang.Object obj45 = defaultedMap8.get((java.lang.Object) defaultedMap34);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d50 = elitisticListPopulation49.getElitismRate();
        double d51 = elitisticListPopulation49.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome52 = elitisticListPopulation49.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome53 = elitisticListPopulation49.iterator();
        math.genetics.Chromosome[] chromosome_array54 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome55 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55, chromosome_array54);
        elitisticListPopulation49.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome55);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation49);
        int i59 = elitisticListPopulation49.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 10 + "'", obj12.equals((short) 10));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 10 + "'", obj30.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + false + "'", obj31.equals(false));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 10 + "'", obj38.equals((short) 10));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + ' ' + "'", obj45.equals(' '));
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(d50 == 1.0d);
        org.junit.Assert.assertTrue(d51 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome52);
        org.junit.Assert.assertNotNull(iterator_chromosome53);
        org.junit.Assert.assertNotNull(chromosome_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(i59 == 10);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0L);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation(list_chromosome3, (int) (byte) 1, (double) 1.0f);
        org.junit.Assert.assertNotNull(list_chromosome3);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation2.getChromosomes();
        try {
            elitisticListPopulation2.setPopulationLimit((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        java.lang.String str6 = defaultedMap5.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0.0d);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap5.containsKey(obj11);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, obj11);
        boolean b14 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str18 = defaultedMap17.toString();
        boolean b20 = defaultedMap17.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) b20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 0.0d);
        java.lang.Object obj26 = defaultedMap21.get((java.lang.Object) defaultedMap23);
        java.lang.Object obj27 = defaultedMap3.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap21);
        boolean b28 = defaultedMap1.containsKey(obj27);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d32 = elitisticListPopulation31.getElitismRate();
        double d33 = elitisticListPopulation31.getElitismRate();
        double d34 = elitisticListPopulation31.getElitismRate();
        boolean b35 = defaultedMap1.containsValue((java.lang.Object) d34);
        java.lang.Object obj36 = null;
        boolean b37 = defaultedMap1.containsValue(obj36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 0.0d);
        java.lang.Object obj44 = defaultedMap39.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b46 = defaultedMap39.containsKey((java.lang.Object) '#');
        int i47 = defaultedMap39.size();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap39.putAll((java.util.Map) defaultedMap49);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj55 = defaultedMap53.remove((java.lang.Object) predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate51, predicate54);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj62 = defaultedMap60.get((java.lang.Object) 0.0d);
        java.lang.Object obj65 = defaultedMap60.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj66 = null;
        boolean b67 = defaultedMap60.containsKey(obj66);
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, obj66);
        java.lang.Object obj69 = defaultedMap49.remove((java.lang.Object) map68);
        defaultedMap1.putAll((java.util.Map) defaultedMap49);
        java.util.Map map71 = null;
        try {
            defaultedMap49.putAll(map71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short) 10 + "'", obj7.equals((short) 10));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 10 + "'", obj25.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + false + "'", obj26.equals(false));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(d32 == 1.0d);
        org.junit.Assert.assertTrue(d33 == 1.0d);
        org.junit.Assert.assertTrue(d34 == 1.0d);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) 10 + "'", obj41.equals((short) 10));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i47 == 1);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + (short) 10 + "'", obj62.equals((short) 10));
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsKey(obj7);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) '#');
        defaultedMap1.clear();
        java.util.Set set12 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsKey(obj7);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate22);
        java.util.Collection collection24 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (short) 10 + "'", obj15.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        int i8 = elitisticListPopulation2.getPopulationSize();
        int i9 = elitisticListPopulation2.getPopulationLimit();
        int i10 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        java.util.Set set16 = defaultedMap14.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) predicate17);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d22 = elitisticListPopulation21.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome23 = elitisticListPopulation21.iterator();
        double d24 = elitisticListPopulation21.getElitismRate();
        java.lang.String str25 = elitisticListPopulation21.toString();
        java.lang.Object obj26 = defaultedMap14.get((java.lang.Object) elitisticListPopulation21);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation21.getChromosomes();
        elitisticListPopulation21.setPopulationLimit((int) (byte) 100);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation21.addChromosome(chromosome30);
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation21.getChromosomes();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertTrue(d22 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome23);
        org.junit.Assert.assertTrue(d24 == 1.0d);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + false + "'", obj26.equals(false));
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertNotNull(list_chromosome32);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap8.containsKey(obj14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj14);
        defaultedMap1.putAll(map16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) (short) 100);
        java.util.Set set22 = defaultedMap1.keySet();
        collections.Transformer transformer23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 10 + "'", obj19.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0.0d);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) defaultedMap7);
        java.util.Collection collection11 = defaultedMap7.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d15 = elitisticListPopulation14.getElitismRate();
        double d16 = elitisticListPopulation14.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation14.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation14.iterator();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation14.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        java.lang.Object obj23 = defaultedMap7.get((java.lang.Object) elitisticListPopulation14);
        java.lang.String str24 = defaultedMap7.toString();
        collections.Transformer transformer25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 10 + "'", obj9.equals((short) 10));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(d15 == 1.0d);
        org.junit.Assert.assertTrue(d16 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 10 + "'", obj23.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) '#');
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d16 = elitisticListPopulation15.getElitismRate();
        double d17 = elitisticListPopulation15.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation15.getChromosomes();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) list_chromosome18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.String str23 = defaultedMap22.toString();
        boolean b25 = defaultedMap22.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 0.0d);
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) (short) 10, (java.lang.Object) '4');
        java.lang.Object obj35 = null;
        boolean b36 = defaultedMap29.containsKey(obj35);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, obj35);
        defaultedMap22.putAll(map37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj40 = defaultedMap22.get((java.lang.Object) predicate39);
        java.util.Set set41 = defaultedMap22.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 0L);
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation44.getChromosomes();
        boolean b46 = defaultedMap22.containsKey((java.lang.Object) elitisticListPopulation44);
        java.lang.Object obj47 = defaultedMap11.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap22);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d51 = elitisticListPopulation50.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome52 = elitisticListPopulation50.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        double d56 = elitisticListPopulation55.getElitismRate();
        double d57 = elitisticListPopulation55.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome58 = elitisticListPopulation55.getChromosomes();
        elitisticListPopulation50.setChromosomes(list_chromosome58);
        math.genetics.ElitisticListPopulation elitisticListPopulation62 = new math.genetics.ElitisticListPopulation((int) (byte) 10, 1.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome63 = elitisticListPopulation62.getChromosomes();
        elitisticListPopulation50.setChromosomes(list_chromosome63);
        java.lang.Object obj65 = defaultedMap11.get((java.lang.Object) list_chromosome63);
        java.lang.String str66 = defaultedMap11.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(d16 == 1.0d);
        org.junit.Assert.assertTrue(d17 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 10 + "'", obj31.equals((short) 10));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short) 10 + "'", obj40.equals((short) 10));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(list_chromosome45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(d51 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome52);
        org.junit.Assert.assertTrue(d56 == 1.0d);
        org.junit.Assert.assertTrue(d57 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome58);
        org.junit.Assert.assertNotNull(list_chromosome63);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + ' ' + "'", obj65.equals(' '));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{-1={}}" + "'", str66.equals("{-1={}}"));
    }
}

