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
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 0, (double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
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
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 100.0f);
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
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) -1, (double) (byte) 100);
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
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        try {
            elitisticListPopulation5.setElitismRate((double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        try {
            math.genetics.Chromosome chromosome6 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((-1), (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        try {
            elitisticListPopulation5.setElitismRate((double) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        int i6 = elitisticListPopulation5.getPopulationSize();
        try {
            elitisticListPopulation5.setElitismRate((double) 97);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        try {
            elitisticListPopulation5.setElitismRate((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        double d10 = elitisticListPopulation5.getElitismRate();
        java.lang.String str11 = elitisticListPopulation5.toString();
        try {
            elitisticListPopulation5.setElitismRate((double) 97);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        int i6 = elitisticListPopulation5.getPopulationSize();
        try {
            elitisticListPopulation5.setElitismRate((double) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        int i13 = elitisticListPopulation5.getPopulationLimit();
        try {
            elitisticListPopulation5.setPopulationLimit((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i13 == 97);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        double d10 = elitisticListPopulation5.getElitismRate();
        java.lang.String str11 = elitisticListPopulation5.toString();
        int i12 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(i12 == 97);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        double d10 = elitisticListPopulation5.getElitismRate();
        try {
            elitisticListPopulation5.setElitismRate((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(d10 == 0.0d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 1L);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', (double) 97);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        int i13 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        try {
            elitisticListPopulation5.setElitismRate((double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i13 == 97);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        try {
            elitisticListPopulation5.setElitismRate(100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        int i13 = elitisticListPopulation5.getPopulationLimit();
        int i14 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22);
        try {
            math.genetics.Chromosome chromosome26 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation5.addChromosome(chromosome7);
        try {
            math.genetics.Chromosome chromosome9 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 97);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        int i6 = elitisticListPopulation5.getPopulationSize();
        try {
            elitisticListPopulation5.setPopulationLimit((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        double d10 = elitisticListPopulation5.getElitismRate();
        java.lang.String str11 = elitisticListPopulation5.toString();
        double d12 = elitisticListPopulation5.getElitismRate();
        try {
            math.genetics.Chromosome chromosome13 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(d12 == 0.0d);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        int i13 = elitisticListPopulation5.getPopulationLimit();
        int i14 = elitisticListPopulation5.getPopulationLimit();
        int i15 = elitisticListPopulation5.getPopulationLimit();
        int i16 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue(i15 == 97);
        org.junit.Assert.assertTrue(i16 == 97);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 0, (double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        int i7 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) 'a', 0.0d);
        elitisticListPopulation15.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17);
        int i23 = elitisticListPopulation15.getPopulationLimit();
        int i24 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32);
        elitisticListPopulation15.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32);
        math.genetics.Population population37 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome chromosome38 = null;
        elitisticListPopulation5.addChromosome(chromosome38);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i23 == 97);
        org.junit.Assert.assertTrue(i24 == 97);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(population37);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 1L);
        try {
            math.genetics.Chromosome chromosome6 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        elitisticListPopulation5.setElitismRate((double) 0L);
        try {
            math.genetics.Chromosome chromosome15 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation7.spliterator();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) spliterator_chromosome10);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        boolean b22 = defaultedMap1.containsValue((java.lang.Object) arraylist_chromosome19);
        java.util.Collection collection23 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31, (int) 'a', 0.0d);
        elitisticListPopulation29.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31);
        int i37 = elitisticListPopulation29.getPopulationLimit();
        int i38 = elitisticListPopulation29.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        elitisticListPopulation44.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46);
        elitisticListPopulation29.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46);
        boolean b50 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation29);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome51 = elitisticListPopulation29.iterator();
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i37 == 97);
        org.junit.Assert.assertTrue(i38 == 97);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome51);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        double d7 = elitisticListPopulation5.getElitismRate();
        try {
            math.genetics.Chromosome chromosome8 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(d7 == 0.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) "{}");
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) 'a', 0.0d);
        elitisticListPopulation10.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12);
        int i18 = elitisticListPopulation10.getPopulationSize();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) i18);
        java.util.Map map20 = null;
        try {
            defaultedMap1.putAll(map20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0d + "'", obj19.equals(0.0d));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) 'a', 0.0d);
        elitisticListPopulation15.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17);
        int i23 = elitisticListPopulation15.getPopulationLimit();
        int i24 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32);
        elitisticListPopulation15.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32);
        int i37 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i23 == 97);
        org.junit.Assert.assertTrue(i24 == 97);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i37 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        int i12 = elitisticListPopulation11.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation11.spliterator();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) spliterator_chromosome14);
        defaultedMap5.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) 97);
        java.util.Set set20 = defaultedMap1.entrySet();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome31 = elitisticListPopulation26.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation26.getChromosomes();
        java.lang.Object obj33 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation26);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0.0d + "'", obj15.equals(0.0d));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome31);
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        double d10 = elitisticListPopulation5.getElitismRate();
        java.lang.String str11 = elitisticListPopulation5.toString();
        math.genetics.Population population12 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(population12);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 0, (double) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation7.spliterator();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) spliterator_chromosome10);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) 'a', 0.0d);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19);
        int i25 = elitisticListPopulation17.getPopulationLimit();
        int i26 = elitisticListPopulation17.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation32.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        elitisticListPopulation17.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome38 = arraylist_chromosome34.spliterator();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) 'a', 0.0d);
        int i51 = elitisticListPopulation50.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation50.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome53 = elitisticListPopulation50.spliterator();
        java.lang.Object obj54 = defaultedMap44.get((java.lang.Object) spliterator_chromosome53);
        defaultedMap44.clear();
        defaultedMap40.putAll((java.util.Map) defaultedMap44);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate57, predicate58);
        java.lang.Object obj60 = defaultedMap1.put((java.lang.Object) arraylist_chromosome34, (java.lang.Object) defaultedMap40);
        defaultedMap40.clear();
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i25 == 97);
        org.junit.Assert.assertTrue(i26 == 97);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome38);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0.0d + "'", obj42.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(list_chromosome52);
        org.junit.Assert.assertNotNull(spliterator_chromosome53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0.0d + "'", obj54.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) 'a', 0.0d);
        elitisticListPopulation15.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17);
        int i23 = elitisticListPopulation15.getPopulationLimit();
        int i24 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32);
        elitisticListPopulation15.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32);
        math.genetics.Population population37 = elitisticListPopulation5.nextGeneration();
        java.lang.String str38 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome39 = null;
        elitisticListPopulation5.addChromosome(chromosome39);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i23 == 97);
        org.junit.Assert.assertTrue(i24 == 97);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(population37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str5 = defaultedMap4.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        boolean b7 = defaultedMap4.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation7.spliterator();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) spliterator_chromosome10);
        defaultedMap1.clear();
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation(list_chromosome6, 0, (double) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1L));
        java.util.Set set4 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        double d9 = elitisticListPopulation7.getElitismRate();
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation7);
        java.lang.Object obj11 = new java.lang.Object();
        boolean b12 = defaultedMap1.equals(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) 'a', 0.0d);
        int i21 = elitisticListPopulation20.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation20.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome23 = elitisticListPopulation20.spliterator();
        java.lang.Object obj24 = defaultedMap14.get((java.lang.Object) spliterator_chromosome23);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32);
        boolean b35 = defaultedMap14.containsValue((java.lang.Object) arraylist_chromosome32);
        java.util.Collection collection36 = defaultedMap14.values();
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array43 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome44 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44, chromosome_array43);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome44, (int) 'a', 0.0d);
        elitisticListPopulation42.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome44);
        int i50 = elitisticListPopulation42.getPopulationLimit();
        int i51 = elitisticListPopulation42.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array52 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome53 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b54 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome53, chromosome_array52);
        math.genetics.ElitisticListPopulation elitisticListPopulation57 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome53, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array58 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome59 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b60 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome59, chromosome_array58);
        elitisticListPopulation57.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome59);
        elitisticListPopulation42.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome59);
        boolean b63 = defaultedMap14.containsKey((java.lang.Object) elitisticListPopulation42);
        java.lang.Object obj64 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(list_chromosome22);
        org.junit.Assert.assertNotNull(spliterator_chromosome23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0.0d + "'", obj24.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(chromosome_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i50 == 97);
        org.junit.Assert.assertTrue(i51 == 97);
        org.junit.Assert.assertNotNull(chromosome_array52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(chromosome_array58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0.0d + "'", obj64.equals(0.0d));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        java.lang.String str24 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) "{}");
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation7.spliterator();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) spliterator_chromosome10);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap14.isEmpty();
        java.lang.Object obj17 = defaultedMap14.remove((java.lang.Object) "{}");
        boolean b18 = defaultedMap1.equals((java.lang.Object) defaultedMap14);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) "[]");
        java.util.Set set21 = defaultedMap1.entrySet();
        java.util.Set set22 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation5.spliterator();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation5.getChromosomes();
        int i12 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome10);
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        int i13 = elitisticListPopulation5.getPopulationLimit();
        int i14 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) ' ');
        int i17 = elitisticListPopulation5.getPopulationSize();
        try {
            math.genetics.Chromosome chromosome18 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        int i12 = elitisticListPopulation11.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation11.spliterator();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) spliterator_chromosome14);
        defaultedMap5.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate19);
        java.lang.Object obj21 = new java.lang.Object();
        java.util.Map map22 = collections.map.DefaultedMap.decorate(map20, obj21);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0.0d + "'", obj15.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) 'a', 0.0d);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        int i17 = elitisticListPopulation9.getPopulationLimit();
        int i18 = elitisticListPopulation9.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome30 = arraylist_chromosome26.spliterator();
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32, (int) 'a', 0.0d);
        int i37 = elitisticListPopulation36.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation36.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome39 = elitisticListPopulation36.spliterator();
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) spliterator_chromosome30, (java.lang.Object) elitisticListPopulation36);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, (int) 'a', 0.0d);
        elitisticListPopulation46.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        int i54 = elitisticListPopulation46.getPopulationLimit();
        int i55 = elitisticListPopulation46.getPopulationLimit();
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) elitisticListPopulation46);
        math.genetics.Chromosome[] chromosome_array57 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome58 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b59 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58, chromosome_array57);
        math.genetics.ElitisticListPopulation elitisticListPopulation62 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome58, (int) 'a', 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome63 = elitisticListPopulation62.getChromosomes();
        math.genetics.Chromosome[] chromosome_array64 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome65 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b66 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65, chromosome_array64);
        math.genetics.ElitisticListPopulation elitisticListPopulation69 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome65, (int) 'a', 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome70 = elitisticListPopulation69.getChromosomes();
        elitisticListPopulation62.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome70);
        boolean b72 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation62);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap74.clear();
        boolean b76 = defaultedMap1.containsValue((java.lang.Object) defaultedMap74);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome30);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNotNull(spliterator_chromosome39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i54 == 97);
        org.junit.Assert.assertTrue(i55 == 97);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0.0d + "'", obj56.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(list_chromosome63);
        org.junit.Assert.assertNotNull(chromosome_array64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(list_chromosome70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation7.spliterator();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) spliterator_chromosome10);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        boolean b22 = defaultedMap1.containsValue((java.lang.Object) arraylist_chromosome19);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str25 = defaultedMap24.toString();
        java.util.Set set26 = defaultedMap24.keySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) (-1L));
        int i31 = defaultedMap28.size();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35, (int) 'a', 0.0d);
        int i40 = elitisticListPopulation39.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation39.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome42 = elitisticListPopulation39.spliterator();
        java.lang.Object obj43 = defaultedMap33.get((java.lang.Object) spliterator_chromosome42);
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        elitisticListPopulation49.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51);
        boolean b54 = defaultedMap33.containsValue((java.lang.Object) arraylist_chromosome51);
        defaultedMap28.putAll((java.util.Map) defaultedMap33);
        boolean b56 = defaultedMap28.isEmpty();
        math.genetics.Chromosome[] chromosome_array57 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome58 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b59 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58, chromosome_array57);
        math.genetics.ElitisticListPopulation elitisticListPopulation62 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome58, (int) 'a', 0.0d);
        int i63 = elitisticListPopulation62.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome64 = elitisticListPopulation62.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome65 = elitisticListPopulation62.getChromosomes();
        java.lang.Object obj66 = defaultedMap24.put((java.lang.Object) defaultedMap28, (java.lang.Object) list_chromosome65);
        boolean b67 = defaultedMap1.equals((java.lang.Object) defaultedMap28);
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0.0d + "'", obj30.equals(0.0d));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(list_chromosome41);
        org.junit.Assert.assertNotNull(spliterator_chromosome42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0.0d + "'", obj43.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(chromosome_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(list_chromosome64);
        org.junit.Assert.assertNotNull(list_chromosome65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b67 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        int i13 = elitisticListPopulation5.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) ' ');
        int i17 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation5.addChromosome(chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) "{}");
        java.util.Set set5 = defaultedMap1.entrySet();
        java.lang.String str6 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation5.spliterator();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation5.iterator();
        try {
            elitisticListPopulation5.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        int i13 = elitisticListPopulation5.getPopulationLimit();
        int i14 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNotNull(list_chromosome15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        int i13 = elitisticListPopulation5.getPopulationLimit();
        int i14 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) ' ');
        int i17 = elitisticListPopulation5.getPopulationSize();
        int i18 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) 'a', 0.0d);
        int i25 = elitisticListPopulation24.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome26);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(list_chromosome26);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) "{}");
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) 'a', 0.0d);
        elitisticListPopulation10.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12);
        int i18 = elitisticListPopulation10.getPopulationSize();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) i18);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation25.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37, (int) 'a', 0.0d);
        elitisticListPopulation35.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        int i43 = elitisticListPopulation35.getPopulationLimit();
        int i44 = elitisticListPopulation35.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array51 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome52 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b53 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52, chromosome_array51);
        elitisticListPopulation50.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52);
        elitisticListPopulation35.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome52);
        elitisticListPopulation25.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52);
        math.genetics.Population population57 = elitisticListPopulation25.nextGeneration();
        boolean b58 = defaultedMap1.containsValue((java.lang.Object) population57);
        boolean b59 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0d + "'", obj19.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i43 == 97);
        org.junit.Assert.assertTrue(i44 == 97);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(chromosome_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(population57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation5.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population12 = elitisticListPopulation5.nextGeneration();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) 'a', 0.0d);
        int i21 = elitisticListPopulation20.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation20.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome23 = elitisticListPopulation20.spliterator();
        java.lang.Object obj24 = defaultedMap14.get((java.lang.Object) spliterator_chromosome23);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32);
        boolean b35 = defaultedMap14.containsValue((java.lang.Object) arraylist_chromosome32);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32);
        try {
            math.genetics.Chromosome chromosome37 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(list_chromosome22);
        org.junit.Assert.assertNotNull(spliterator_chromosome23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0.0d + "'", obj24.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        int i13 = elitisticListPopulation5.getPopulationLimit();
        int i14 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) ' ');
        int i17 = elitisticListPopulation5.getPopulationSize();
        int i18 = elitisticListPopulation5.getPopulationSize();
        try {
            math.genetics.Chromosome chromosome19 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str5 = defaultedMap4.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Set set7 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) arraylist_chromosome10);
        int i14 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation5.spliterator();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit(1);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        double d9 = elitisticListPopulation7.getElitismRate();
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation7);
        java.lang.Object obj11 = new java.lang.Object();
        boolean b12 = defaultedMap1.equals(obj11);
        int i13 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) 'a', 0.0d);
        int i11 = elitisticListPopulation10.getPopulationSize();
        double d12 = elitisticListPopulation10.getElitismRate();
        boolean b13 = defaultedMap4.containsValue((java.lang.Object) elitisticListPopulation10);
        java.lang.Object obj14 = new java.lang.Object();
        boolean b15 = defaultedMap4.equals(obj14);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) defaultedMap4);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) 'a', 0.0d);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        int i17 = elitisticListPopulation9.getPopulationLimit();
        int i18 = elitisticListPopulation9.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome30 = arraylist_chromosome26.spliterator();
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32, (int) 'a', 0.0d);
        int i37 = elitisticListPopulation36.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation36.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome39 = elitisticListPopulation36.spliterator();
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) spliterator_chromosome30, (java.lang.Object) elitisticListPopulation36);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, (int) 'a', 0.0d);
        elitisticListPopulation46.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        int i54 = elitisticListPopulation46.getPopulationLimit();
        int i55 = elitisticListPopulation46.getPopulationLimit();
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) elitisticListPopulation46);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate57, predicate58);
        boolean b60 = defaultedMap1.isEmpty();
        java.lang.Object obj62 = defaultedMap1.get((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome30);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNotNull(spliterator_chromosome39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i54 == 97);
        org.junit.Assert.assertTrue(i55 == 97);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0.0d + "'", obj56.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0.0d + "'", obj62.equals(0.0d));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap5.isEmpty();
        java.lang.Object obj8 = defaultedMap5.remove((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b11 = defaultedMap10.isEmpty();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) "{}");
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) 'a', 0.0d);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        int i27 = elitisticListPopulation19.getPopulationSize();
        java.lang.Object obj28 = defaultedMap10.get((java.lang.Object) i27);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        elitisticListPopulation34.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36);
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) 'a', 0.0d);
        elitisticListPopulation44.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46);
        int i52 = elitisticListPopulation44.getPopulationLimit();
        int i53 = elitisticListPopulation44.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array54 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome55 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55, chromosome_array54);
        math.genetics.ElitisticListPopulation elitisticListPopulation59 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome55, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array60 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome61 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61, chromosome_array60);
        elitisticListPopulation59.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61);
        elitisticListPopulation44.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome61);
        elitisticListPopulation34.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61);
        math.genetics.Population population66 = elitisticListPopulation34.nextGeneration();
        boolean b67 = defaultedMap10.containsValue((java.lang.Object) population66);
        java.lang.Object obj68 = defaultedMap5.get((java.lang.Object) defaultedMap10);
        boolean b69 = defaultedMap1.containsValue(obj68);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0.0d + "'", obj28.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i52 == 97);
        org.junit.Assert.assertTrue(i53 == 97);
        org.junit.Assert.assertNotNull(chromosome_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(chromosome_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(population66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 0.0d + "'", obj68.equals(0.0d));
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) 'a', 0.0d);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        int i17 = elitisticListPopulation9.getPopulationLimit();
        int i18 = elitisticListPopulation9.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome30 = arraylist_chromosome26.spliterator();
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32, (int) 'a', 0.0d);
        int i37 = elitisticListPopulation36.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation36.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome39 = elitisticListPopulation36.spliterator();
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) spliterator_chromosome30, (java.lang.Object) elitisticListPopulation36);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, (int) 'a', 0.0d);
        elitisticListPopulation46.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        int i54 = elitisticListPopulation46.getPopulationLimit();
        int i55 = elitisticListPopulation46.getPopulationLimit();
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) elitisticListPopulation46);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate57, predicate58);
        java.lang.String str60 = defaultedMap1.toString();
        math.genetics.Chromosome[] chromosome_array61 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome62 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b63 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome62, chromosome_array61);
        math.genetics.ElitisticListPopulation elitisticListPopulation66 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome62, (int) 'a', 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome67 = elitisticListPopulation66.getChromosomes();
        boolean b68 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation66);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str71 = defaultedMap70.toString();
        math.genetics.Chromosome[] chromosome_array72 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome73 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b74 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome73, chromosome_array72);
        math.genetics.ElitisticListPopulation elitisticListPopulation77 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome73, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array78 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome79 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b80 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome79, chromosome_array78);
        elitisticListPopulation77.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome79);
        boolean b82 = defaultedMap70.containsKey((java.lang.Object) arraylist_chromosome79);
        java.lang.Object obj83 = defaultedMap1.get((java.lang.Object) arraylist_chromosome79);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome30);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNotNull(spliterator_chromosome39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i54 == 97);
        org.junit.Assert.assertTrue(i55 == 97);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0.0d + "'", obj56.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(chromosome_array61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(list_chromosome67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "{}" + "'", str71.equals("{}"));
        org.junit.Assert.assertNotNull(chromosome_array72);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(chromosome_array78);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + 0.0d + "'", obj83.equals(0.0d));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        int i12 = elitisticListPopulation11.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation11.spliterator();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) spliterator_chromosome14);
        defaultedMap5.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.Transformer transformer18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0.0d + "'", obj15.equals(0.0d));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation7.spliterator();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) spliterator_chromosome10);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) 100.0d);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0.0d + "'", obj13.equals(0.0d));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        int i13 = elitisticListPopulation5.getPopulationLimit();
        int i14 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str28 = defaultedMap27.toString();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        elitisticListPopulation34.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36);
        boolean b39 = defaultedMap27.containsKey((java.lang.Object) arraylist_chromosome36);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        int i13 = elitisticListPopulation5.getPopulationSize();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) 'a', 0.0d);
        int i22 = elitisticListPopulation21.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation21.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome24 = elitisticListPopulation21.spliterator();
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) spliterator_chromosome24);
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        elitisticListPopulation31.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        boolean b36 = defaultedMap15.containsValue((java.lang.Object) arraylist_chromosome33);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertNotNull(spliterator_chromosome24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0.0d + "'", obj25.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) "{}");
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) 'a', 0.0d);
        elitisticListPopulation10.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12);
        int i18 = elitisticListPopulation10.getPopulationSize();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) i18);
        java.util.Collection collection20 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0d + "'", obj19.equals(0.0d));
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b4 = defaultedMap3.isEmpty();
        java.lang.Object obj6 = defaultedMap3.remove((java.lang.Object) "{}");
        java.util.Set set7 = defaultedMap3.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) defaultedMap3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1L));
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) 'a', 0.0d);
        int i13 = elitisticListPopulation12.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation12.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome15 = elitisticListPopulation12.spliterator();
        java.lang.Object obj16 = defaultedMap6.get((java.lang.Object) spliterator_chromosome15);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        elitisticListPopulation22.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24);
        boolean b27 = defaultedMap6.containsValue((java.lang.Object) arraylist_chromosome24);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) 'a', 0.0d);
        int i41 = elitisticListPopulation40.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation40.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome43 = elitisticListPopulation40.spliterator();
        java.lang.Object obj44 = defaultedMap34.get((java.lang.Object) spliterator_chromosome43);
        defaultedMap34.clear();
        defaultedMap30.putAll((java.util.Map) defaultedMap34);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate47, predicate48);
        boolean b50 = defaultedMap6.equals((java.lang.Object) defaultedMap30);
        java.util.Set set51 = defaultedMap30.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(spliterator_chromosome15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0.0d + "'", obj16.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0.0d + "'", obj32.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertNotNull(spliterator_chromosome43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0.0d + "'", obj44.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(set51);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (-1L));
        int i8 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) 'a', 0.0d);
        int i17 = elitisticListPopulation16.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation16.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome19 = elitisticListPopulation16.spliterator();
        java.lang.Object obj20 = defaultedMap10.get((java.lang.Object) spliterator_chromosome19);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        boolean b31 = defaultedMap10.containsValue((java.lang.Object) arraylist_chromosome28);
        defaultedMap5.putAll((java.util.Map) defaultedMap10);
        boolean b33 = defaultedMap5.isEmpty();
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35, (int) 'a', 0.0d);
        int i40 = elitisticListPopulation39.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation39.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation39.getChromosomes();
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) list_chromosome42);
        boolean b45 = defaultedMap5.containsValue((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertNotNull(spliterator_chromosome19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(list_chromosome41);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str5 = defaultedMap4.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, (int) 'a', 0.0d);
        int i19 = elitisticListPopulation18.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation18.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = elitisticListPopulation18.spliterator();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) spliterator_chromosome21);
        defaultedMap12.clear();
        defaultedMap8.putAll((java.util.Map) defaultedMap12);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate25, predicate26);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) map27);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0.0d + "'", obj22.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0.0d + "'", obj28.equals(0.0d));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) "{}");
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) 'a', 0.0d);
        elitisticListPopulation10.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12);
        int i18 = elitisticListPopulation10.getPopulationSize();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) i18);
        java.util.Set set20 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0d + "'", obj19.equals(0.0d));
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1L));
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) 'a', 0.0d);
        int i13 = elitisticListPopulation12.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation12.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome15 = elitisticListPopulation12.spliterator();
        java.lang.Object obj16 = defaultedMap6.get((java.lang.Object) spliterator_chromosome15);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        elitisticListPopulation22.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24);
        boolean b27 = defaultedMap6.containsValue((java.lang.Object) arraylist_chromosome24);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) 'a', 0.0d);
        int i41 = elitisticListPopulation40.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation40.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome43 = elitisticListPopulation40.spliterator();
        java.lang.Object obj44 = defaultedMap34.get((java.lang.Object) spliterator_chromosome43);
        defaultedMap34.clear();
        defaultedMap30.putAll((java.util.Map) defaultedMap34);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate47, predicate48);
        boolean b50 = defaultedMap6.equals((java.lang.Object) defaultedMap30);
        collections.Factory factory51 = null;
        try {
            java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, factory51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(spliterator_chromosome15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0.0d + "'", obj16.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0.0d + "'", obj32.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertNotNull(spliterator_chromosome43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0.0d + "'", obj44.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        elitisticListPopulation5.setElitismRate((double) 0L);
        java.lang.String str15 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]" + "'", str15.equals("[]"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) 'a', 0.0d);
        int i13 = elitisticListPopulation12.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation12.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome15 = elitisticListPopulation12.spliterator();
        int i16 = elitisticListPopulation12.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation12.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome18);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(spliterator_chromosome15);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertNotNull(list_chromosome18);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) 'a', 0.0d);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        int i17 = elitisticListPopulation9.getPopulationLimit();
        int i18 = elitisticListPopulation9.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome30 = arraylist_chromosome26.spliterator();
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32, (int) 'a', 0.0d);
        int i37 = elitisticListPopulation36.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation36.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome39 = elitisticListPopulation36.spliterator();
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) spliterator_chromosome30, (java.lang.Object) elitisticListPopulation36);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, (int) 'a', 0.0d);
        elitisticListPopulation46.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        int i54 = elitisticListPopulation46.getPopulationLimit();
        int i55 = elitisticListPopulation46.getPopulationLimit();
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) elitisticListPopulation46);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate57, predicate58);
        java.lang.String str60 = defaultedMap1.toString();
        math.genetics.Chromosome[] chromosome_array61 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome62 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b63 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome62, chromosome_array61);
        math.genetics.ElitisticListPopulation elitisticListPopulation66 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome62, (int) 'a', 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome67 = elitisticListPopulation66.getChromosomes();
        boolean b68 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation66);
        int i69 = elitisticListPopulation66.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome30);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNotNull(spliterator_chromosome39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i54 == 97);
        org.junit.Assert.assertTrue(i55 == 97);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0.0d + "'", obj56.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(chromosome_array61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(list_chromosome67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(i69 == 97);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        double d7 = elitisticListPopulation5.getElitismRate();
        double d8 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setPopulationLimit(100);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertTrue(d8 == 0.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation7.spliterator();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) spliterator_chromosome10);
        defaultedMap1.clear();
        int i13 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) 'a', 0.0d);
        int i22 = elitisticListPopulation21.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation21.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome24 = elitisticListPopulation21.spliterator();
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) spliterator_chromosome24);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj25);
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertNotNull(spliterator_chromosome24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0.0d + "'", obj25.equals(0.0d));
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation7.spliterator();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) spliterator_chromosome10);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap14.isEmpty();
        java.lang.Object obj17 = defaultedMap14.remove((java.lang.Object) "{}");
        boolean b18 = defaultedMap1.equals((java.lang.Object) defaultedMap14);
        boolean b19 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, (int) 'a', 0.0d);
        int i32 = elitisticListPopulation31.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation31.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome34 = elitisticListPopulation31.spliterator();
        java.lang.Object obj35 = defaultedMap25.get((java.lang.Object) spliterator_chromosome34);
        defaultedMap25.clear();
        defaultedMap21.putAll((java.util.Map) defaultedMap25);
        boolean b38 = defaultedMap1.containsValue((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0.0d + "'", obj23.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertNotNull(spliterator_chromosome34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0.0d + "'", obj35.equals(0.0d));
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        int i13 = elitisticListPopulation5.getPopulationLimit();
        int i14 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22);
        int i26 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (-1L));
        int i8 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) 'a', 0.0d);
        int i17 = elitisticListPopulation16.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation16.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome19 = elitisticListPopulation16.spliterator();
        java.lang.Object obj20 = defaultedMap10.get((java.lang.Object) spliterator_chromosome19);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        boolean b31 = defaultedMap10.containsValue((java.lang.Object) arraylist_chromosome28);
        defaultedMap5.putAll((java.util.Map) defaultedMap10);
        boolean b33 = defaultedMap5.isEmpty();
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35, (int) 'a', 0.0d);
        int i40 = elitisticListPopulation39.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation39.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation39.getChromosomes();
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) list_chromosome42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome51, (int) 'a', 0.0d);
        int i56 = elitisticListPopulation55.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome57 = elitisticListPopulation55.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome58 = elitisticListPopulation55.spliterator();
        java.lang.Object obj59 = defaultedMap49.get((java.lang.Object) spliterator_chromosome58);
        defaultedMap49.clear();
        defaultedMap45.putAll((java.util.Map) defaultedMap49);
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate62, predicate63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj68 = defaultedMap66.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array71 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome72 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b73 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome72, chromosome_array71);
        math.genetics.ElitisticListPopulation elitisticListPopulation76 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome72, (int) 'a', 0.0d);
        int i77 = elitisticListPopulation76.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome78 = elitisticListPopulation76.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome79 = elitisticListPopulation76.spliterator();
        java.lang.Object obj80 = defaultedMap70.get((java.lang.Object) spliterator_chromosome79);
        defaultedMap70.clear();
        defaultedMap66.putAll((java.util.Map) defaultedMap70);
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate83, predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate62, predicate83);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertNotNull(spliterator_chromosome19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(list_chromosome41);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0.0d + "'", obj47.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(list_chromosome57);
        org.junit.Assert.assertNotNull(spliterator_chromosome58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0.0d + "'", obj59.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 0.0d + "'", obj68.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertNotNull(list_chromosome78);
        org.junit.Assert.assertNotNull(spliterator_chromosome79);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 0.0d + "'", obj80.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        int i12 = elitisticListPopulation11.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation11.spliterator();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) spliterator_chromosome14);
        defaultedMap5.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) (-1L));
        int i25 = defaultedMap22.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) 'a', 0.0d);
        int i34 = elitisticListPopulation33.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation33.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome36 = elitisticListPopulation33.spliterator();
        java.lang.Object obj37 = defaultedMap27.get((java.lang.Object) spliterator_chromosome36);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        elitisticListPopulation43.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45);
        boolean b48 = defaultedMap27.containsValue((java.lang.Object) arraylist_chromosome45);
        defaultedMap22.putAll((java.util.Map) defaultedMap27);
        boolean b50 = defaultedMap22.isEmpty();
        math.genetics.Chromosome[] chromosome_array51 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome52 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b53 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52, chromosome_array51);
        math.genetics.ElitisticListPopulation elitisticListPopulation56 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome52, (int) 'a', 0.0d);
        int i57 = elitisticListPopulation56.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome58 = elitisticListPopulation56.getChromosomes();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) list_chromosome58);
        java.lang.Object obj60 = defaultedMap1.remove((java.lang.Object) map59);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0.0d + "'", obj15.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0.0d + "'", obj24.equals(0.0d));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertNotNull(spliterator_chromosome36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0.0d + "'", obj37.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(chromosome_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(list_chromosome58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        double d9 = elitisticListPopulation7.getElitismRate();
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation7);
        int i11 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 0);
        elitisticListPopulation2.setPopulationLimit(100);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation7.spliterator();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) spliterator_chromosome10);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap14.isEmpty();
        java.lang.Object obj17 = defaultedMap14.remove((java.lang.Object) "{}");
        boolean b18 = defaultedMap1.equals((java.lang.Object) defaultedMap14);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation24);
        java.util.Map map31 = collections.map.DefaultedMap.decorate(map29, (java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation5.spliterator();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        int i10 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i10 == 97);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) 'a', 0.0d);
        elitisticListPopulation15.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17);
        int i23 = elitisticListPopulation15.getPopulationLimit();
        int i24 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32);
        elitisticListPopulation15.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32);
        int i37 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i23 == 97);
        org.junit.Assert.assertTrue(i24 == 97);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i37 == 97);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) 'a', 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        int i15 = elitisticListPopulation5.getPopulationSize();
        int i16 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i16 == 97);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation7.spliterator();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) spliterator_chromosome10);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap14.isEmpty();
        java.lang.Object obj17 = defaultedMap14.remove((java.lang.Object) "{}");
        boolean b18 = defaultedMap1.equals((java.lang.Object) defaultedMap14);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) 'a', 0.0d);
        elitisticListPopulation24.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        int i32 = elitisticListPopulation24.getPopulationLimit();
        int i33 = elitisticListPopulation24.getPopulationLimit();
        elitisticListPopulation24.setPopulationLimit((int) ' ');
        boolean b36 = defaultedMap14.containsValue((java.lang.Object) ' ');
        java.util.Set set37 = defaultedMap14.entrySet();
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i32 == 97);
        org.junit.Assert.assertTrue(i33 == 97);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        double d9 = elitisticListPopulation7.getElitismRate();
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation7);
        java.util.Collection collection11 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation7.spliterator();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) spliterator_chromosome10);
        defaultedMap1.clear();
        int i13 = defaultedMap1.size();
        int i14 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18, (int) 'a', 0.0d);
        int i23 = elitisticListPopulation22.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation22.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome25 = elitisticListPopulation22.spliterator();
        java.lang.Object obj26 = defaultedMap16.get((java.lang.Object) spliterator_chromosome25);
        defaultedMap16.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b30 = defaultedMap29.isEmpty();
        java.lang.Object obj32 = defaultedMap29.remove((java.lang.Object) "{}");
        boolean b33 = defaultedMap16.equals((java.lang.Object) defaultedMap29);
        boolean b35 = defaultedMap16.containsKey((java.lang.Object) "[]");
        java.util.Set set36 = defaultedMap16.entrySet();
        defaultedMap16.clear();
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap16.remove(obj38);
        java.lang.Object obj40 = defaultedMap1.remove(obj39);
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(list_chromosome24);
        org.junit.Assert.assertNotNull(spliterator_chromosome25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation7.spliterator();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) spliterator_chromosome10);
        defaultedMap1.clear();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) 'a', 0.0d);
        elitisticListPopulation28.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        int i36 = elitisticListPopulation28.getPopulationLimit();
        int i37 = elitisticListPopulation28.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        elitisticListPopulation43.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45);
        elitisticListPopulation28.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45);
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45);
        math.genetics.Population population50 = elitisticListPopulation18.nextGeneration();
        boolean b51 = defaultedMap1.equals((java.lang.Object) population50);
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i36 == 97);
        org.junit.Assert.assertTrue(i37 == 97);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(population50);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) 'a', 0.0d);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        int i17 = elitisticListPopulation9.getPopulationLimit();
        int i18 = elitisticListPopulation9.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome30 = arraylist_chromosome26.spliterator();
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32, (int) 'a', 0.0d);
        int i37 = elitisticListPopulation36.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation36.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome39 = elitisticListPopulation36.spliterator();
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) spliterator_chromosome30, (java.lang.Object) elitisticListPopulation36);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, (int) 'a', 0.0d);
        elitisticListPopulation46.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        int i54 = elitisticListPopulation46.getPopulationLimit();
        int i55 = elitisticListPopulation46.getPopulationLimit();
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) elitisticListPopulation46);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate57, predicate58);
        java.lang.String str60 = defaultedMap1.toString();
        math.genetics.Chromosome[] chromosome_array61 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome62 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b63 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome62, chromosome_array61);
        math.genetics.ElitisticListPopulation elitisticListPopulation66 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome62, (int) 'a', 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome67 = elitisticListPopulation66.getChromosomes();
        boolean b68 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation66);
        math.genetics.Chromosome[] chromosome_array69 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome70 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b71 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome70, chromosome_array69);
        math.genetics.ElitisticListPopulation elitisticListPopulation74 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome70, (int) 'a', 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome75 = elitisticListPopulation74.getChromosomes();
        math.genetics.Chromosome[] chromosome_array76 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome77 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b78 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome77, chromosome_array76);
        math.genetics.ElitisticListPopulation elitisticListPopulation81 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome77, (int) 'a', 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome82 = elitisticListPopulation81.getChromosomes();
        elitisticListPopulation74.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome82);
        elitisticListPopulation66.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome82);
        int i85 = elitisticListPopulation66.getPopulationSize();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome30);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNotNull(spliterator_chromosome39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i54 == 97);
        org.junit.Assert.assertTrue(i55 == 97);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0.0d + "'", obj56.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(chromosome_array61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(list_chromosome67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(chromosome_array69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(list_chromosome75);
        org.junit.Assert.assertNotNull(chromosome_array76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(list_chromosome82);
        org.junit.Assert.assertTrue(i85 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        int i13 = elitisticListPopulation5.getPopulationLimit();
        int i14 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setElitismRate(0.0d);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) "{}");
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0d + "'", obj6.equals(0.0d));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) 'a', 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        elitisticListPopulation5.setPopulationLimit((int) '#');
        math.genetics.Population population17 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(population17);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) "{}");
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) 'a', 0.0d);
        elitisticListPopulation10.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12);
        int i18 = elitisticListPopulation10.getPopulationSize();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) i18);
        int i20 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0d + "'", obj19.equals(0.0d));
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 1L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) arraylist_chromosome1);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation5.addChromosome(chromosome7);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) 'a', 0.0d);
        int i15 = elitisticListPopulation14.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation14.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome17);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertNotNull(list_chromosome17);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        double d10 = elitisticListPopulation5.getElitismRate();
        java.lang.String str11 = elitisticListPopulation5.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) 'a', 0.0d);
        int i20 = elitisticListPopulation19.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome22 = elitisticListPopulation19.spliterator();
        java.lang.Object obj23 = defaultedMap13.get((java.lang.Object) spliterator_chromosome22);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31, (int) 'a', 0.0d);
        elitisticListPopulation29.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31);
        int i37 = elitisticListPopulation29.getPopulationLimit();
        int i38 = elitisticListPopulation29.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        elitisticListPopulation44.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46);
        elitisticListPopulation29.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome50 = arraylist_chromosome46.spliterator();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj54 = defaultedMap52.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array57 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome58 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b59 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58, chromosome_array57);
        math.genetics.ElitisticListPopulation elitisticListPopulation62 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome58, (int) 'a', 0.0d);
        int i63 = elitisticListPopulation62.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome64 = elitisticListPopulation62.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome65 = elitisticListPopulation62.spliterator();
        java.lang.Object obj66 = defaultedMap56.get((java.lang.Object) spliterator_chromosome65);
        defaultedMap56.clear();
        defaultedMap52.putAll((java.util.Map) defaultedMap56);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate69, predicate70);
        java.lang.Object obj72 = defaultedMap13.put((java.lang.Object) arraylist_chromosome46, (java.lang.Object) defaultedMap52);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(spliterator_chromosome22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0.0d + "'", obj23.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i37 == 97);
        org.junit.Assert.assertTrue(i38 == 97);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome50);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0.0d + "'", obj54.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(list_chromosome64);
        org.junit.Assert.assertNotNull(spliterator_chromosome65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 0.0d + "'", obj66.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNull(obj72);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        double d9 = elitisticListPopulation7.getElitismRate();
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation7);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = elitisticListPopulation16.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation16.getChromosomes();
        math.genetics.Population population23 = elitisticListPopulation16.nextGeneration();
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) population23);
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertNotNull(list_chromosome22);
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation5.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population12 = elitisticListPopulation5.nextGeneration();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) 'a', 0.0d);
        int i21 = elitisticListPopulation20.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation20.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome23 = elitisticListPopulation20.spliterator();
        java.lang.Object obj24 = defaultedMap14.get((java.lang.Object) spliterator_chromosome23);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32);
        boolean b35 = defaultedMap14.containsValue((java.lang.Object) arraylist_chromosome32);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32);
        java.lang.String str37 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(list_chromosome22);
        org.junit.Assert.assertNotNull(spliterator_chromosome23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0.0d + "'", obj24.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setElitismRate(0.0d);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        double d10 = elitisticListPopulation5.getElitismRate();
        java.lang.String str11 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        double d13 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue(d13 == 0.0d);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        int i12 = elitisticListPopulation11.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation11.spliterator();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) spliterator_chromosome14);
        defaultedMap5.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Collection collection18 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0.0d + "'", obj15.equals(0.0d));
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (short) 100, (java.lang.Object) 1.0f);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation5.addChromosome(chromosome10);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        int i12 = elitisticListPopulation11.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation11.spliterator();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) spliterator_chromosome14);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) 'a', 0.0d);
        elitisticListPopulation21.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23);
        int i29 = elitisticListPopulation21.getPopulationLimit();
        int i30 = elitisticListPopulation21.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        elitisticListPopulation36.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38);
        elitisticListPopulation21.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome42 = arraylist_chromosome38.spliterator();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome50, (int) 'a', 0.0d);
        int i55 = elitisticListPopulation54.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome56 = elitisticListPopulation54.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome57 = elitisticListPopulation54.spliterator();
        java.lang.Object obj58 = defaultedMap48.get((java.lang.Object) spliterator_chromosome57);
        defaultedMap48.clear();
        defaultedMap44.putAll((java.util.Map) defaultedMap48);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate61, predicate62);
        java.lang.Object obj64 = defaultedMap5.put((java.lang.Object) arraylist_chromosome38, (java.lang.Object) defaultedMap44);
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        math.genetics.ElitisticListPopulation elitisticListPopulation70 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome66, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array71 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome72 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b73 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome72, chromosome_array71);
        elitisticListPopulation70.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome72);
        double d75 = elitisticListPopulation70.getElitismRate();
        java.lang.String str76 = elitisticListPopulation70.toString();
        java.lang.Object obj77 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) elitisticListPopulation70);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str80 = defaultedMap79.toString();
        math.genetics.Chromosome[] chromosome_array81 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome82 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b83 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome82, chromosome_array81);
        math.genetics.ElitisticListPopulation elitisticListPopulation86 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome82, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array87 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome88 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b89 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome88, chromosome_array87);
        elitisticListPopulation86.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome88);
        boolean b91 = defaultedMap79.containsKey((java.lang.Object) arraylist_chromosome88);
        java.lang.Object obj92 = defaultedMap5.get((java.lang.Object) arraylist_chromosome88);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0.0d + "'", obj15.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i29 == 97);
        org.junit.Assert.assertTrue(i30 == 97);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome42);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0.0d + "'", obj46.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNotNull(list_chromosome56);
        org.junit.Assert.assertNotNull(spliterator_chromosome57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0.0d + "'", obj58.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(chromosome_array71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(d75 == 0.0d);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "[]" + "'", str76.equals("[]"));
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "{}" + "'", str80.equals("{}"));
        org.junit.Assert.assertNotNull(chromosome_array81);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(chromosome_array87);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertNotNull(obj92);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation7.spliterator();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) spliterator_chromosome10);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap14.isEmpty();
        java.lang.Object obj17 = defaultedMap14.remove((java.lang.Object) "{}");
        boolean b18 = defaultedMap1.equals((java.lang.Object) defaultedMap14);
        boolean b19 = defaultedMap1.isEmpty();
        java.util.Set set20 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation7.spliterator();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) spliterator_chromosome10);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap14.isEmpty();
        java.lang.Object obj17 = defaultedMap14.remove((java.lang.Object) "{}");
        boolean b18 = defaultedMap1.equals((java.lang.Object) defaultedMap14);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) 'a', 0.0d);
        elitisticListPopulation24.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        int i32 = elitisticListPopulation24.getPopulationLimit();
        int i33 = elitisticListPopulation24.getPopulationLimit();
        elitisticListPopulation24.setPopulationLimit((int) ' ');
        boolean b36 = defaultedMap14.containsValue((java.lang.Object) ' ');
        java.util.Set set37 = defaultedMap14.keySet();
        collections.Transformer transformer38 = null;
        try {
            java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, transformer38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i32 == 97);
        org.junit.Assert.assertTrue(i33 == 97);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        elitisticListPopulation5.setElitismRate((double) 0L);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = list_chromosome15.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.util.List<math.genetics.Chromosome> list_chromosome0 = null;
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(list_chromosome0, (int) (byte) 100, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (-1L));
        int i6 = defaultedMap3.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) 'a', 0.0d);
        int i15 = elitisticListPopulation14.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation14.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome17 = elitisticListPopulation14.spliterator();
        java.lang.Object obj18 = defaultedMap8.get((java.lang.Object) spliterator_chromosome17);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26);
        boolean b29 = defaultedMap8.containsValue((java.lang.Object) arraylist_chromosome26);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        boolean b31 = defaultedMap3.isEmpty();
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33, (int) 'a', 0.0d);
        int i38 = elitisticListPopulation37.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation37.getChromosomes();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) list_chromosome39);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b42 = defaultedMap3.isEmpty();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0.0d + "'", obj5.equals(0.0d));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertNotNull(spliterator_chromosome17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0.0d + "'", obj18.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(list_chromosome39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b42 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation5.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation(list_chromosome6, (int) 'a', (double) 1);
        double d10 = elitisticListPopulation9.getElitismRate();
        try {
            math.genetics.Chromosome chromosome11 = elitisticListPopulation9.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(d10 == 1.0d);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation7.spliterator();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) spliterator_chromosome10);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) 100.0d);
        collections.Predicate predicate14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate15);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0.0d + "'", obj13.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap6.isEmpty();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) "{}");
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) 'a', 0.0d);
        elitisticListPopulation15.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17);
        int i23 = elitisticListPopulation15.getPopulationSize();
        java.lang.Object obj24 = defaultedMap6.get((java.lang.Object) i23);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) 'a', 0.0d);
        elitisticListPopulation40.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42);
        int i48 = elitisticListPopulation40.getPopulationLimit();
        int i49 = elitisticListPopulation40.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome51, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array56 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome57 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b58 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57, chromosome_array56);
        elitisticListPopulation55.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57);
        elitisticListPopulation40.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome57);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57);
        math.genetics.Population population62 = elitisticListPopulation30.nextGeneration();
        boolean b63 = defaultedMap6.containsValue((java.lang.Object) population62);
        java.lang.Object obj64 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj68 = defaultedMap66.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array71 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome72 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b73 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome72, chromosome_array71);
        math.genetics.ElitisticListPopulation elitisticListPopulation76 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome72, (int) 'a', 0.0d);
        int i77 = elitisticListPopulation76.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome78 = elitisticListPopulation76.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome79 = elitisticListPopulation76.spliterator();
        java.lang.Object obj80 = defaultedMap70.get((java.lang.Object) spliterator_chromosome79);
        defaultedMap70.clear();
        defaultedMap66.putAll((java.util.Map) defaultedMap70);
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate83, predicate84);
        boolean b86 = defaultedMap6.containsValue((java.lang.Object) defaultedMap66);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0.0d + "'", obj24.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i48 == 97);
        org.junit.Assert.assertTrue(i49 == 97);
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(chromosome_array56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(population62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0.0d + "'", obj64.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 0.0d + "'", obj68.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertNotNull(list_chromosome78);
        org.junit.Assert.assertNotNull(spliterator_chromosome79);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 0.0d + "'", obj80.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertTrue(b86 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        int i13 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation5.addChromosome(chromosome16);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i13 == 97);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation7.spliterator();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) spliterator_chromosome10);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap14.isEmpty();
        java.lang.Object obj17 = defaultedMap14.remove((java.lang.Object) "{}");
        boolean b18 = defaultedMap1.equals((java.lang.Object) defaultedMap14);
        java.util.Set set19 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) 'a', 0.0d);
        elitisticListPopulation15.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17);
        int i23 = elitisticListPopulation15.getPopulationLimit();
        int i24 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32);
        elitisticListPopulation15.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32);
        math.genetics.Population population37 = elitisticListPopulation5.nextGeneration();
        java.lang.String str38 = elitisticListPopulation5.toString();
        int i39 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i23 == 97);
        org.junit.Assert.assertTrue(i24 == 97);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(population37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
        org.junit.Assert.assertTrue(i39 == 97);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        int i12 = elitisticListPopulation11.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation11.spliterator();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) spliterator_chromosome14);
        defaultedMap5.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str20 = defaultedMap19.toString();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        boolean b31 = defaultedMap19.containsKey((java.lang.Object) arraylist_chromosome28);
        java.lang.Object obj32 = defaultedMap1.remove((java.lang.Object) b31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b35 = defaultedMap34.isEmpty();
        boolean b36 = defaultedMap34.isEmpty();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap34);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0.0d + "'", obj15.equals(0.0d));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        int i10 = elitisticListPopulation5.getPopulationSize();
        try {
            elitisticListPopulation5.setElitismRate((double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7);
        elitisticListPopulation5.setElitismRate((double) 0L);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = elitisticListPopulation5.spliterator();
        int i17 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 10);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) 'a', 0.0d);
        int i8 = elitisticListPopulation7.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation7.spliterator();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) spliterator_chromosome10);
        int i12 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) 'a', 0.0d);
        int i12 = elitisticListPopulation11.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation11.spliterator();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) spliterator_chromosome14);
        defaultedMap5.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str20 = defaultedMap19.toString();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        boolean b31 = defaultedMap19.containsKey((java.lang.Object) arraylist_chromosome28);
        java.lang.Object obj32 = defaultedMap1.remove((java.lang.Object) b31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str36 = defaultedMap35.toString();
        java.util.Set set37 = defaultedMap35.keySet();
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45, (int) 'a', 0.0d);
        elitisticListPopulation43.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45);
        int i51 = elitisticListPopulation43.getPopulationLimit();
        int i52 = elitisticListPopulation43.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array59 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome60 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b61 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome60, chromosome_array59);
        elitisticListPopulation58.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome60);
        elitisticListPopulation43.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome60);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome64 = arraylist_chromosome60.spliterator();
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        math.genetics.ElitisticListPopulation elitisticListPopulation70 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome66, (int) 'a', 0.0d);
        int i71 = elitisticListPopulation70.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome72 = elitisticListPopulation70.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome73 = elitisticListPopulation70.spliterator();
        java.lang.Object obj74 = defaultedMap35.put((java.lang.Object) spliterator_chromosome64, (java.lang.Object) elitisticListPopulation70);
        math.genetics.Chromosome[] chromosome_array75 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome76 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b77 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome76, chromosome_array75);
        math.genetics.ElitisticListPopulation elitisticListPopulation80 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome76, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array81 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome82 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b83 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome82, chromosome_array81);
        math.genetics.ElitisticListPopulation elitisticListPopulation86 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome82, (int) 'a', 0.0d);
        elitisticListPopulation80.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome82);
        int i88 = elitisticListPopulation80.getPopulationLimit();
        int i89 = elitisticListPopulation80.getPopulationLimit();
        java.lang.Object obj90 = defaultedMap35.get((java.lang.Object) elitisticListPopulation80);
        collections.Predicate predicate91 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate92 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate91, predicate92);
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate33, predicate92);
        collections.map.DefaultedMap defaultedMap95 = new collections.map.DefaultedMap((java.lang.Object) predicate33);
        collections.Factory factory96 = null;
        try {
            java.util.Map map97 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap95, factory96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0.0d + "'", obj15.equals(0.0d));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i51 == 97);
        org.junit.Assert.assertTrue(i52 == 97);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(chromosome_array59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome64);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertNotNull(list_chromosome72);
        org.junit.Assert.assertNotNull(spliterator_chromosome73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(chromosome_array75);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(chromosome_array81);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(i88 == 97);
        org.junit.Assert.assertTrue(i89 == 97);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + 0.0d + "'", obj90.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(map94);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) 'a', 0.0d);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        int i17 = elitisticListPopulation9.getPopulationLimit();
        int i18 = elitisticListPopulation9.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome30 = arraylist_chromosome26.spliterator();
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32, (int) 'a', 0.0d);
        int i37 = elitisticListPopulation36.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation36.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome39 = elitisticListPopulation36.spliterator();
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) spliterator_chromosome30, (java.lang.Object) elitisticListPopulation36);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) 'a', 0.0d);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, (int) 'a', 0.0d);
        elitisticListPopulation46.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        int i54 = elitisticListPopulation46.getPopulationLimit();
        int i55 = elitisticListPopulation46.getPopulationLimit();
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) elitisticListPopulation46);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate57, predicate58);
        java.lang.String str60 = defaultedMap1.toString();
        math.genetics.Chromosome[] chromosome_array61 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome62 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b63 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome62, chromosome_array61);
        math.genetics.ElitisticListPopulation elitisticListPopulation66 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome62, (int) 'a', 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome67 = elitisticListPopulation66.getChromosomes();
        boolean b68 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation66);
        math.genetics.Chromosome chromosome69 = null;
        elitisticListPopulation66.addChromosome(chromosome69);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome30);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNotNull(spliterator_chromosome39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i54 == 97);
        org.junit.Assert.assertTrue(i55 == 97);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0.0d + "'", obj56.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(chromosome_array61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(list_chromosome67);
        org.junit.Assert.assertTrue(b68 == false);
    }
}

