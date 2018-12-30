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
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
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
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        try {
            math.genetics.Chromosome chromosome6 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.lang.String str13 = elitisticListPopulation5.toString();
        java.lang.String str14 = elitisticListPopulation5.toString();
        try {
            math.genetics.Chromosome chromosome15 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, (double) (short) 10);
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
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        try {
            math.genetics.Chromosome chromosome13 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.lang.String str13 = elitisticListPopulation5.toString();
        try {
            elitisticListPopulation5.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set6 = defaultedMap5.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap5.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation5.addChromosome(chromosome7);
        math.genetics.Chromosome chromosome9 = null;
        try {
            elitisticListPopulation5.addChromosome(chromosome9);
            org.junit.Assert.fail("Expected exception of type math.exception.NumberIsTooLargeException");
        } catch (math.exception.NumberIsTooLargeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, 1.0d);
        try {
            math.genetics.Chromosome chromosome3 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) -1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) -1, (double) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(100);
        try {
            math.genetics.Chromosome chromosome6 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 0, (double) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (-1), (double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) "hi!");
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) '4');
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) (short) 1, (double) 0);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        boolean b27 = defaultedMap11.containsKey((java.lang.Object) elitisticListPopulation19);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) (short) 1, (double) 0);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) elitisticListPopulation19, (java.lang.Object) (short) 10);
        java.lang.String str37 = elitisticListPopulation19.toString();
        try {
            math.genetics.Chromosome chromosome38 = elitisticListPopulation19.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100 + "'", obj13.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) "hi!");
        java.util.Set set24 = defaultedMap16.entrySet();
        boolean b25 = defaultedMap12.containsValue((java.lang.Object) defaultedMap16);
        java.lang.Object obj26 = defaultedMap8.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap12.remove(obj30);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (short) 100, 1.0d);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) "hi!");
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) (short) 1, (double) 0);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        boolean b36 = defaultedMap20.containsKey((java.lang.Object) elitisticListPopulation28);
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38, (int) (short) 1, (double) 0);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38);
        java.lang.Object obj45 = defaultedMap10.put((java.lang.Object) elitisticListPopulation28, (java.lang.Object) (short) 10);
        java.util.Collection collection46 = defaultedMap10.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection46);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100 + "'", obj22.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection46);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(100);
        java.lang.String str6 = elitisticListPopulation2.toString();
        int i7 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(100);
        java.lang.String str6 = elitisticListPopulation2.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100);
        java.lang.String str8 = defaultedMap5.toString();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) 1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100 + "'", obj7.equals(100));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.lang.String str13 = elitisticListPopulation5.toString();
        int i14 = elitisticListPopulation5.getPopulationSize();
        try {
            elitisticListPopulation5.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (short) 100, 1.0d);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome7);
        try {
            elitisticListPopulation2.setElitismRate((double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) "hi!");
        java.util.Set set24 = defaultedMap16.entrySet();
        boolean b25 = defaultedMap12.containsValue((java.lang.Object) defaultedMap16);
        java.lang.Object obj26 = defaultedMap8.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj33 = defaultedMap28.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) "hi!");
        java.lang.Object obj36 = defaultedMap8.get((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj43 = defaultedMap38.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj45 = defaultedMap38.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj52 = defaultedMap47.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) "hi!");
        defaultedMap47.clear();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation61 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj63 = defaultedMap58.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) "hi!");
        defaultedMap58.clear();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate67, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate56, predicate68);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation75 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj77 = defaultedMap72.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap72, (java.lang.Object) "hi!");
        defaultedMap72.clear();
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate81, predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate68, predicate82);
        java.lang.String str85 = defaultedMap38.toString();
        boolean b86 = defaultedMap28.containsValue((java.lang.Object) str85);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0L + "'", obj36.equals(0L));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100 + "'", obj45.equals(100));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "{1.0=false}" + "'", str85.equals("{1.0=false}"));
        org.junit.Assert.assertTrue(b86 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Set set4 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) (short) 1, (double) 0);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        boolean b27 = defaultedMap11.containsKey((java.lang.Object) elitisticListPopulation19);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) (short) 1, (double) 0);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) elitisticListPopulation19, (java.lang.Object) (short) 10);
        java.util.Collection collection37 = defaultedMap1.values();
        collections.Transformer transformer38 = null;
        try {
            java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100 + "'", obj13.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation5.addChromosome(chromosome7);
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100);
        java.lang.String str8 = defaultedMap5.toString();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set12 = defaultedMap11.entrySet();
        java.util.Collection collection13 = defaultedMap11.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 100);
        java.lang.String str18 = defaultedMap15.toString();
        java.lang.Object obj19 = defaultedMap11.remove((java.lang.Object) defaultedMap15);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap11);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100 + "'", obj7.equals(100));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (short) -1);
        int i6 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.lang.String str13 = elitisticListPopulation5.toString();
        int i14 = elitisticListPopulation5.getPopulationSize();
        java.lang.String str15 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation5.iterator();
        try {
            math.genetics.Chromosome chromosome17 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]" + "'", str15.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome16);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) (short) 1, (double) 0);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation9);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj24 = defaultedMap19.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) "hi!");
        defaultedMap19.clear();
        java.util.Set set28 = defaultedMap19.keySet();
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) defaultedMap19);
        java.lang.String str30 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap14.putAll((java.util.Map) defaultedMap21);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) "hi!");
        java.util.Set set37 = defaultedMap29.entrySet();
        boolean b38 = defaultedMap25.containsValue((java.lang.Object) defaultedMap29);
        java.lang.Object obj39 = defaultedMap21.get((java.lang.Object) defaultedMap25);
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 100);
        java.lang.Object obj46 = defaultedMap42.remove((java.lang.Object) (short) -1);
        boolean b48 = defaultedMap42.containsKey((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj52 = defaultedMap50.get((java.lang.Object) 100);
        java.lang.String str53 = defaultedMap50.toString();
        java.util.Collection collection54 = defaultedMap50.values();
        java.lang.Object obj55 = defaultedMap42.get((java.lang.Object) defaultedMap50);
        java.lang.Object obj56 = defaultedMap1.remove((java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation61 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj63 = defaultedMap58.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) "hi!");
        defaultedMap58.clear();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj70 = defaultedMap68.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array71 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome72 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b73 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome72, chromosome_array71);
        math.genetics.ElitisticListPopulation elitisticListPopulation76 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome72, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array77 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome78 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b79 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome78, chromosome_array77);
        math.genetics.ElitisticListPopulation elitisticListPopulation82 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome78, (int) (short) 1, (double) 0);
        elitisticListPopulation76.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome78);
        boolean b84 = defaultedMap68.containsKey((java.lang.Object) elitisticListPopulation76);
        math.genetics.Chromosome[] chromosome_array85 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome86 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b87 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome86, chromosome_array85);
        math.genetics.ElitisticListPopulation elitisticListPopulation90 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome86, (int) (short) 1, (double) 0);
        elitisticListPopulation76.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome86);
        java.lang.Object obj93 = defaultedMap58.put((java.lang.Object) elitisticListPopulation76, (java.lang.Object) (short) 10);
        java.util.Collection collection94 = defaultedMap58.values();
        java.util.Set set95 = defaultedMap58.entrySet();
        java.lang.Object obj96 = defaultedMap1.get((java.lang.Object) defaultedMap58);
        java.lang.String str97 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 100 + "'", obj44.equals(100));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 100 + "'", obj52.equals(100));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 100 + "'", obj55.equals(100));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 100 + "'", obj70.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(chromosome_array77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(chromosome_array85);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(collection94);
        org.junit.Assert.assertNotNull(set95);
        org.junit.Assert.assertTrue("'" + obj96 + "' != '" + 100 + "'", obj96.equals(100));
        org.junit.Assert.assertTrue("'" + str97 + "' != '" + "{1.0=false, 0={}}" + "'", str97.equals("{1.0=false, 0={}}"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.util.Set set10 = defaultedMap1.keySet();
        java.util.Set set11 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set14 = defaultedMap13.entrySet();
        java.util.Collection collection15 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100);
        java.lang.String str20 = defaultedMap17.toString();
        java.lang.Object obj21 = defaultedMap13.remove((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj28 = defaultedMap23.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj29 = defaultedMap17.remove((java.lang.Object) defaultedMap23);
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) defaultedMap17);
        boolean b31 = defaultedMap17.isEmpty();
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) (short) 1, (double) 0);
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39);
        java.lang.String str45 = elitisticListPopulation37.toString();
        int i46 = elitisticListPopulation37.getPopulationSize();
        java.lang.String str47 = elitisticListPopulation37.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome48 = elitisticListPopulation37.iterator();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) iterator_chromosome48);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "[]" + "'", str45.equals("[]"));
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "[]" + "'", str47.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome48);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) (byte) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap14.putAll((java.util.Map) defaultedMap21);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) "hi!");
        java.util.Set set37 = defaultedMap29.entrySet();
        boolean b38 = defaultedMap25.containsValue((java.lang.Object) defaultedMap29);
        java.lang.Object obj39 = defaultedMap21.get((java.lang.Object) defaultedMap25);
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap25);
        java.util.Set set41 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) collection3);
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) (short) 1, (double) 0);
        elitisticListPopulation10.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12);
        java.lang.String str18 = elitisticListPopulation10.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation10.getChromosomes();
        boolean b20 = defaultedMap4.equals((java.lang.Object) list_chromosome19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) "hi!");
        java.util.Set set13 = defaultedMap5.entrySet();
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) defaultedMap5);
        java.util.Set set15 = defaultedMap1.keySet();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.util.Set set10 = defaultedMap1.keySet();
        java.util.Set set11 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set14 = defaultedMap13.entrySet();
        java.util.Collection collection15 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100);
        java.lang.String str20 = defaultedMap17.toString();
        java.lang.Object obj21 = defaultedMap13.remove((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj28 = defaultedMap23.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj29 = defaultedMap17.remove((java.lang.Object) defaultedMap23);
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj37 = defaultedMap32.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) "hi!");
        defaultedMap32.clear();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array51 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome52 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b53 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52, chromosome_array51);
        math.genetics.ElitisticListPopulation elitisticListPopulation56 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome52, (int) (short) 1, (double) 0);
        elitisticListPopulation50.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52);
        boolean b58 = defaultedMap42.containsKey((java.lang.Object) elitisticListPopulation50);
        math.genetics.Chromosome[] chromosome_array59 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome60 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b61 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome60, chromosome_array59);
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome60, (int) (short) 1, (double) 0);
        elitisticListPopulation50.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome60);
        java.lang.Object obj67 = defaultedMap32.put((java.lang.Object) elitisticListPopulation50, (java.lang.Object) (short) 10);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome68 = elitisticListPopulation50.iterator();
        boolean b69 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation50);
        double d70 = elitisticListPopulation50.getElitismRate();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 100 + "'", obj44.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(chromosome_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(chromosome_array59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(iterator_chromosome68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(d70 == 0.0d);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) "hi!");
        defaultedMap10.clear();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) "hi!");
        defaultedMap21.clear();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate19, predicate31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj40 = defaultedMap35.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) "hi!");
        defaultedMap35.clear();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate44, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate31, predicate45);
        boolean b48 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) (short) 1, (double) 0);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation9);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj24 = defaultedMap19.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) "hi!");
        defaultedMap19.clear();
        java.util.Set set28 = defaultedMap19.keySet();
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) defaultedMap19);
        boolean b30 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj39 = defaultedMap34.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) "hi!");
        defaultedMap34.clear();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate43, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate43, predicate46);
        collections.Predicate predicate48 = null;
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate43, predicate48);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) (short) 1, (double) 0);
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17);
        math.genetics.Population population23 = elitisticListPopulation15.nextGeneration();
        int i24 = elitisticListPopulation15.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 100);
        java.lang.String str29 = defaultedMap26.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj36 = defaultedMap31.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Set set37 = defaultedMap31.entrySet();
        java.util.Collection collection38 = defaultedMap31.values();
        boolean b39 = defaultedMap26.containsValue((java.lang.Object) defaultedMap31);
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) i24, (java.lang.Object) b39);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertTrue(i24 == 1);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100 + "'", obj28.equals(100));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) "hi!");
        defaultedMap10.clear();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) "hi!");
        defaultedMap21.clear();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate19, predicate31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj40 = defaultedMap35.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) "hi!");
        defaultedMap35.clear();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate44, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate31, predicate45);
        java.lang.String str48 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj55 = defaultedMap50.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) "hi!");
        defaultedMap50.clear();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate59, predicate60);
        java.util.Set set62 = defaultedMap50.entrySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj66 = defaultedMap64.get((java.lang.Object) 100);
        java.lang.String str67 = defaultedMap64.toString();
        java.lang.Object obj68 = null;
        java.lang.Object obj69 = defaultedMap50.put((java.lang.Object) str67, obj68);
        boolean b70 = defaultedMap1.containsValue((java.lang.Object) defaultedMap50);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{1.0=false}" + "'", str48.equals("{1.0=false}"));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 100 + "'", obj66.equals(100));
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) (short) 1, (double) 0);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation9);
        math.genetics.Population population18 = elitisticListPopulation9.nextGeneration();
        try {
            math.genetics.Chromosome chromosome19 = elitisticListPopulation9.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(population18);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set6 = defaultedMap5.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) "hi!");
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) (short) 1, (double) 0);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29);
        boolean b35 = defaultedMap19.containsKey((java.lang.Object) elitisticListPopulation27);
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37, (int) (short) 1, (double) 0);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37);
        java.lang.Object obj44 = defaultedMap9.put((java.lang.Object) elitisticListPopulation27, (java.lang.Object) (short) 10);
        java.lang.Object obj45 = defaultedMap5.remove(obj44);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100 + "'", obj21.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.lang.String str13 = elitisticListPopulation5.toString();
        int i14 = elitisticListPopulation5.getPopulationSize();
        java.lang.String str15 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) (short) 100);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]" + "'", str15.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome16);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) collection3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.lang.String str13 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(list_chromosome14, 1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome14);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        int i6 = elitisticListPopulation5.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation5.spliterator();
        try {
            math.genetics.Chromosome chromosome8 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(100);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation8.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation8.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation8.iterator();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (short) 1, (double) 0);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        org.junit.Assert.assertNotNull(iterator_chromosome3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap14.putAll((java.util.Map) defaultedMap21);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) "hi!");
        java.util.Set set37 = defaultedMap29.entrySet();
        boolean b38 = defaultedMap25.containsValue((java.lang.Object) defaultedMap29);
        java.lang.Object obj39 = defaultedMap21.get((java.lang.Object) defaultedMap25);
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 100);
        java.lang.Object obj46 = defaultedMap42.remove((java.lang.Object) (short) -1);
        boolean b48 = defaultedMap42.containsKey((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj52 = defaultedMap50.get((java.lang.Object) 100);
        java.lang.String str53 = defaultedMap50.toString();
        java.util.Collection collection54 = defaultedMap50.values();
        java.lang.Object obj55 = defaultedMap42.get((java.lang.Object) defaultedMap50);
        java.lang.Object obj56 = defaultedMap1.remove((java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation62 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj64 = defaultedMap59.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) "hi!");
        defaultedMap59.clear();
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation73 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj75 = defaultedMap70.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) "hi!");
        defaultedMap70.clear();
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate79, predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate68, predicate80);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation87 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj89 = defaultedMap84.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map91 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap84, (java.lang.Object) "hi!");
        defaultedMap84.clear();
        collections.Predicate predicate93 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate94 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate93, predicate94);
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate68, predicate94);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 100 + "'", obj44.equals(100));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 100 + "'", obj52.equals(100));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 100 + "'", obj55.equals(100));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNotNull(map96);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) (short) 1, (double) 0);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        boolean b27 = defaultedMap11.containsKey((java.lang.Object) elitisticListPopulation19);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) (short) 1, (double) 0);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) elitisticListPopulation19, (java.lang.Object) (short) 10);
        java.util.Collection collection37 = defaultedMap1.values();
        java.util.Set set38 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj46 = defaultedMap41.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "hi!");
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) defaultedMap41);
        java.util.Set set50 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100 + "'", obj13.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) "hi!");
        java.util.Set set13 = defaultedMap5.entrySet();
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) defaultedMap5);
        boolean b15 = defaultedMap1.isEmpty();
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) (short) 1, (double) 0);
        elitisticListPopulation21.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23);
        math.genetics.Population population29 = elitisticListPopulation21.nextGeneration();
        double d30 = elitisticListPopulation21.getElitismRate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj37 = defaultedMap32.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap32.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap32);
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) d30, (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set49 = defaultedMap48.entrySet();
        defaultedMap44.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj57 = defaultedMap52.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) "hi!");
        defaultedMap52.clear();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj64 = defaultedMap62.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        math.genetics.ElitisticListPopulation elitisticListPopulation70 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome66, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array71 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome72 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b73 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome72, chromosome_array71);
        math.genetics.ElitisticListPopulation elitisticListPopulation76 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome72, (int) (short) 1, (double) 0);
        elitisticListPopulation70.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome72);
        boolean b78 = defaultedMap62.containsKey((java.lang.Object) elitisticListPopulation70);
        math.genetics.Chromosome[] chromosome_array79 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome80 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b81 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome80, chromosome_array79);
        math.genetics.ElitisticListPopulation elitisticListPopulation84 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome80, (int) (short) 1, (double) 0);
        elitisticListPopulation70.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome80);
        java.lang.Object obj87 = defaultedMap52.put((java.lang.Object) elitisticListPopulation70, (java.lang.Object) (short) 10);
        java.lang.Object obj88 = defaultedMap48.remove(obj87);
        defaultedMap32.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set92 = defaultedMap91.entrySet();
        java.util.Collection collection93 = defaultedMap91.values();
        collections.map.DefaultedMap defaultedMap94 = new collections.map.DefaultedMap((java.lang.Object) collection93);
        java.lang.Object obj96 = defaultedMap94.remove((java.lang.Object) "hi!");
        java.lang.Object obj97 = defaultedMap48.get((java.lang.Object) defaultedMap94);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(population29);
        org.junit.Assert.assertTrue(d30 == 0.0d);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0 + "'", obj46.equals(0));
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 100 + "'", obj64.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(chromosome_array71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(chromosome_array79);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(set92);
        org.junit.Assert.assertNotNull(collection93);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertTrue("'" + obj97 + "' != '" + 100 + "'", obj97.equals(100));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) "hi!");
        defaultedMap10.clear();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) map21);
        collections.Transformer transformer23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100 + "'", obj22.equals(100));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) set9);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) (short) 1, (double) 0);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        boolean b27 = defaultedMap11.containsKey((java.lang.Object) elitisticListPopulation19);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) (short) 1, (double) 0);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) elitisticListPopulation19, (java.lang.Object) (short) 10);
        java.util.Collection collection37 = defaultedMap1.values();
        java.util.Set set38 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj46 = defaultedMap41.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "hi!");
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation56 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj58 = defaultedMap53.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) "hi!");
        defaultedMap53.clear();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate62, predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate62, predicate65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation71 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj73 = defaultedMap68.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) "hi!");
        defaultedMap68.clear();
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation82 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj84 = defaultedMap79.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap79, (java.lang.Object) "hi!");
        defaultedMap79.clear();
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate89 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate88, predicate89);
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate77, predicate89);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate65, predicate77);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100 + "'", obj13.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map92);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate11);
        java.util.Set set13 = defaultedMap1.entrySet();
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        boolean b4 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set6 = defaultedMap5.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) "hi!");
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) (short) 1, (double) 0);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29);
        boolean b35 = defaultedMap19.containsKey((java.lang.Object) elitisticListPopulation27);
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37, (int) (short) 1, (double) 0);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37);
        java.lang.Object obj44 = defaultedMap9.put((java.lang.Object) elitisticListPopulation27, (java.lang.Object) (short) 10);
        java.lang.Object obj45 = defaultedMap5.remove(obj44);
        java.lang.Object obj47 = defaultedMap5.get((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100 + "'", obj21.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100 + "'", obj47.equals(100));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (byte) 1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation5.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        defaultedMap8.clear();
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 0.0f);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) (short) 1, (double) 0);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation9);
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (short) 1, (double) 0);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        try {
            elitisticListPopulation9.setElitismRate((double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation6.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation6.spliterator();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) spliterator_chromosome8);
        java.lang.String str10 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(100);
        java.lang.String str6 = elitisticListPopulation2.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(100);
        java.lang.String str6 = elitisticListPopulation2.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 100, 1.0d);
        math.genetics.Population population10 = elitisticListPopulation9.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome11);
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(population10);
        org.junit.Assert.assertNotNull(list_chromosome11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.lang.String str6 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100);
        java.lang.String str8 = defaultedMap5.toString();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj16 = defaultedMap11.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj17 = defaultedMap5.remove((java.lang.Object) defaultedMap11);
        defaultedMap5.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100 + "'", obj7.equals(100));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation5.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setElitismRate((double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.util.Set set10 = defaultedMap1.keySet();
        java.util.Set set11 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set14 = defaultedMap13.entrySet();
        java.util.Collection collection15 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100);
        java.lang.String str20 = defaultedMap17.toString();
        java.lang.Object obj21 = defaultedMap13.remove((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj28 = defaultedMap23.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj29 = defaultedMap17.remove((java.lang.Object) defaultedMap23);
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) defaultedMap17);
        boolean b31 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj38 = defaultedMap33.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj40 = defaultedMap33.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj47 = defaultedMap42.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) "hi!");
        defaultedMap42.clear();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation56 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj58 = defaultedMap53.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) "hi!");
        defaultedMap53.clear();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate62, predicate63);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate51, predicate63);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation70 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj72 = defaultedMap67.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) "hi!");
        defaultedMap67.clear();
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate76, predicate77);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate63, predicate77);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation86 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj88 = defaultedMap83.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map90 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap83, (java.lang.Object) "hi!");
        defaultedMap83.clear();
        collections.Predicate predicate92 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate93 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap83, predicate92, predicate93);
        collections.Predicate predicate95 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap81, predicate92, predicate95);
        java.util.Map map97 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate77, predicate92);
        java.lang.Object obj99 = defaultedMap17.get((java.lang.Object) 10.0d);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 100 + "'", obj40.equals(100));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(map97);
        org.junit.Assert.assertTrue("'" + obj99 + "' != '" + 100 + "'", obj99.equals(100));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj16 = defaultedMap11.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap11.putAll((java.util.Map) defaultedMap18);
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj31 = defaultedMap26.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) "hi!");
        java.util.Set set34 = defaultedMap26.entrySet();
        boolean b35 = defaultedMap22.containsValue((java.lang.Object) defaultedMap26);
        java.lang.Object obj36 = defaultedMap18.get((java.lang.Object) defaultedMap22);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((int) (short) 100, 1.0d);
        java.lang.Object obj40 = defaultedMap22.get((java.lang.Object) 1.0d);
        java.lang.Object obj42 = defaultedMap22.get((java.lang.Object) 100L);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap22);
        java.lang.Object obj44 = null;
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array51 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome52 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b53 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52, chromosome_array51);
        math.genetics.ElitisticListPopulation elitisticListPopulation56 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome52, (int) (short) 1, (double) 0);
        elitisticListPopulation50.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52);
        java.lang.String str58 = elitisticListPopulation50.toString();
        java.lang.String str59 = elitisticListPopulation50.toString();
        math.genetics.Chromosome chromosome60 = null;
        elitisticListPopulation50.addChromosome(chromosome60);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome62 = elitisticListPopulation50.iterator();
        java.lang.Object obj63 = defaultedMap8.put(obj44, (java.lang.Object) iterator_chromosome62);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0 + "'", obj24.equals(0));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0L + "'", obj36.equals(0L));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0 + "'", obj42.equals(0));
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(chromosome_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "[]" + "'", str58.equals("[]"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "[]" + "'", str59.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome62);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj11 = defaultedMap6.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Set set12 = defaultedMap6.entrySet();
        java.util.Collection collection13 = defaultedMap6.values();
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) (short) 1, (double) 0);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome28 = elitisticListPopulation20.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome29 = elitisticListPopulation20.iterator();
        math.genetics.Population population30 = elitisticListPopulation20.nextGeneration();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set33 = defaultedMap32.entrySet();
        java.util.Collection collection34 = defaultedMap32.values();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) collection34);
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome43, (int) (short) 1, (double) 0);
        elitisticListPopulation41.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43);
        java.lang.String str49 = elitisticListPopulation41.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome50 = elitisticListPopulation41.getChromosomes();
        boolean b51 = defaultedMap35.equals((java.lang.Object) list_chromosome50);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome50);
        boolean b53 = defaultedMap6.equals((java.lang.Object) elitisticListPopulation20);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome28);
        org.junit.Assert.assertNotNull(iterator_chromosome29);
        org.junit.Assert.assertNotNull(population30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "[]" + "'", str49.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) "hi!");
        java.util.Set set13 = defaultedMap5.entrySet();
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) defaultedMap5);
        boolean b15 = defaultedMap1.isEmpty();
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) (short) 1, (double) 0);
        elitisticListPopulation21.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23);
        math.genetics.Population population29 = elitisticListPopulation21.nextGeneration();
        double d30 = elitisticListPopulation21.getElitismRate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj37 = defaultedMap32.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap32.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap32);
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) d30, (java.lang.Object) defaultedMap32);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        int i46 = elitisticListPopulation45.getPopulationSize();
        int i47 = elitisticListPopulation45.getPopulationSize();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) elitisticListPopulation45);
        boolean b50 = defaultedMap1.containsValue((java.lang.Object) "[]");
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(population29);
        org.junit.Assert.assertTrue(d30 == 0.0d);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b50 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.lang.String str13 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation5.getChromosomes();
        int i15 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap14.putAll((java.util.Map) defaultedMap21);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) "hi!");
        java.util.Set set37 = defaultedMap29.entrySet();
        boolean b38 = defaultedMap25.containsValue((java.lang.Object) defaultedMap29);
        java.lang.Object obj39 = defaultedMap21.get((java.lang.Object) defaultedMap25);
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 100);
        java.lang.Object obj46 = defaultedMap42.remove((java.lang.Object) (short) -1);
        boolean b48 = defaultedMap42.containsKey((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj52 = defaultedMap50.get((java.lang.Object) 100);
        java.lang.String str53 = defaultedMap50.toString();
        java.util.Collection collection54 = defaultedMap50.values();
        java.lang.Object obj55 = defaultedMap42.get((java.lang.Object) defaultedMap50);
        java.lang.Object obj56 = defaultedMap1.remove((java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj61 = defaultedMap59.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array62 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome63 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b64 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome63, chromosome_array62);
        math.genetics.ElitisticListPopulation elitisticListPopulation67 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome63, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array68 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome69 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b70 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome69, chromosome_array68);
        math.genetics.ElitisticListPopulation elitisticListPopulation73 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome69, (int) (short) 1, (double) 0);
        elitisticListPopulation67.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome69);
        boolean b75 = defaultedMap59.containsKey((java.lang.Object) elitisticListPopulation67);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation80 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj82 = defaultedMap77.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap77, (java.lang.Object) "hi!");
        defaultedMap77.clear();
        java.util.Set set86 = defaultedMap77.keySet();
        boolean b87 = defaultedMap59.containsKey((java.lang.Object) defaultedMap77);
        java.lang.Object obj88 = defaultedMap42.get((java.lang.Object) defaultedMap59);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 100 + "'", obj44.equals(100));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 100 + "'", obj52.equals(100));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 100 + "'", obj55.equals(100));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 100 + "'", obj61.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(chromosome_array68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + 100 + "'", obj88.equals(100));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        int i7 = elitisticListPopulation5.getPopulationSize();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) (short) 1, (double) 0);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation5.iterator();
        java.lang.String str15 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]" + "'", str15.equals("[]"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) collection3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj16 = defaultedMap9.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap22.putAll((java.util.Map) defaultedMap29);
        defaultedMap29.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj42 = defaultedMap37.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) "hi!");
        java.util.Set set45 = defaultedMap37.entrySet();
        boolean b46 = defaultedMap33.containsValue((java.lang.Object) defaultedMap37);
        java.lang.Object obj47 = defaultedMap29.get((java.lang.Object) defaultedMap33);
        java.lang.Object obj48 = defaultedMap9.put((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj55 = defaultedMap50.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) "hi!");
        java.lang.Object obj58 = defaultedMap4.put((java.lang.Object) defaultedMap9, (java.lang.Object) defaultedMap50);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj65 = defaultedMap60.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) "hi!");
        defaultedMap60.clear();
        java.util.Set set69 = defaultedMap60.keySet();
        java.util.Set set70 = defaultedMap60.entrySet();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set73 = defaultedMap72.entrySet();
        java.util.Collection collection74 = defaultedMap72.values();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj78 = defaultedMap76.get((java.lang.Object) 100);
        java.lang.String str79 = defaultedMap76.toString();
        java.lang.Object obj80 = defaultedMap72.remove((java.lang.Object) defaultedMap76);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation85 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj87 = defaultedMap82.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj88 = defaultedMap76.remove((java.lang.Object) defaultedMap82);
        java.lang.Object obj89 = defaultedMap60.remove((java.lang.Object) defaultedMap76);
        java.util.Set set90 = defaultedMap76.keySet();
        boolean b91 = defaultedMap50.containsKey((java.lang.Object) defaultedMap76);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100 + "'", obj16.equals(100));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0L + "'", obj47.equals(0L));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + 100 + "'", obj78.equals(100));
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertTrue(b91 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) (short) 1, (double) 0);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation9);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj24 = defaultedMap19.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) "hi!");
        defaultedMap19.clear();
        java.util.Set set28 = defaultedMap19.keySet();
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) defaultedMap19);
        java.util.Set set30 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) (short) 1, (double) 0);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation9);
        java.util.Set set18 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) "hi!");
        defaultedMap10.clear();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) "hi!");
        defaultedMap21.clear();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate19, predicate31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj40 = defaultedMap35.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) "hi!");
        defaultedMap35.clear();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate44, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate31, predicate45);
        java.lang.String str48 = defaultedMap1.toString();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj56 = defaultedMap51.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj58 = defaultedMap51.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj65 = defaultedMap60.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) "hi!");
        defaultedMap60.clear();
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation74 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj76 = defaultedMap71.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap71, (java.lang.Object) "hi!");
        defaultedMap71.clear();
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate80, predicate81);
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate69, predicate81);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation88 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj90 = defaultedMap85.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map92 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap85, (java.lang.Object) "hi!");
        defaultedMap85.clear();
        collections.Predicate predicate94 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate95 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate94, predicate95);
        java.util.Map map97 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate81, predicate95);
        java.util.Map map98 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate49, predicate81);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{1.0=false}" + "'", str48.equals("{1.0=false}"));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 100 + "'", obj58.equals(100));
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(map97);
        org.junit.Assert.assertNotNull(map98);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) collection3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        java.util.Set set8 = defaultedMap4.keySet();
        java.util.Set set9 = defaultedMap4.entrySet();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) (short) 1, (double) 0);
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17);
        java.lang.String str23 = elitisticListPopulation15.toString();
        java.lang.String str24 = elitisticListPopulation15.toString();
        math.genetics.Chromosome chromosome25 = null;
        elitisticListPopulation15.addChromosome(chromosome25);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome27 = elitisticListPopulation15.iterator();
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35, (int) (short) 1, (double) 0);
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35);
        java.lang.String str41 = elitisticListPopulation33.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome42);
        java.lang.Object obj44 = defaultedMap4.get((java.lang.Object) elitisticListPopulation15);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]" + "'", str23.equals("[]"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome27);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "[]" + "'", str41.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) (short) 1, (double) 0);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        boolean b27 = defaultedMap11.containsKey((java.lang.Object) elitisticListPopulation19);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) (short) 1, (double) 0);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) elitisticListPopulation19, (java.lang.Object) (short) 10);
        java.util.Collection collection37 = defaultedMap1.values();
        java.util.Set set38 = defaultedMap1.entrySet();
        collections.Factory factory39 = null;
        try {
            java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100 + "'", obj13.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, 1.0d);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome5 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(spliterator_chromosome5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        int i3 = elitisticListPopulation2.getPopulationSize();
        int i4 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(population5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) "hi!");
        java.util.Set set21 = defaultedMap13.entrySet();
        boolean b22 = defaultedMap9.containsValue((java.lang.Object) defaultedMap13);
        boolean b23 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj30 = defaultedMap25.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) "hi!");
        defaultedMap25.clear();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate34, predicate35);
        java.lang.Object obj37 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) defaultedMap25);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome41 = elitisticListPopulation40.iterator();
        elitisticListPopulation40.setPopulationLimit(100);
        int i44 = elitisticListPopulation40.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome45 = elitisticListPopulation40.iterator();
        java.lang.Object obj46 = defaultedMap25.remove((java.lang.Object) iterator_chromosome45);
        int i47 = defaultedMap25.size();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) i47);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0 + "'", obj11.equals(0));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(iterator_chromosome41);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(i47 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100);
        java.lang.String str8 = defaultedMap5.toString();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        java.util.Set set10 = defaultedMap1.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 1.0f);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100 + "'", obj7.equals(100));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100 + "'", obj12.equals(100));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) "hi!");
        java.util.Set set13 = defaultedMap5.entrySet();
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) defaultedMap5);
        boolean b15 = defaultedMap1.isEmpty();
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) (short) 1, (double) 0);
        elitisticListPopulation21.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23);
        math.genetics.Population population29 = elitisticListPopulation21.nextGeneration();
        double d30 = elitisticListPopulation21.getElitismRate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj37 = defaultedMap32.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap32.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap32);
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) d30, (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set49 = defaultedMap48.entrySet();
        defaultedMap44.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj57 = defaultedMap52.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) "hi!");
        defaultedMap52.clear();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj64 = defaultedMap62.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        math.genetics.ElitisticListPopulation elitisticListPopulation70 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome66, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array71 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome72 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b73 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome72, chromosome_array71);
        math.genetics.ElitisticListPopulation elitisticListPopulation76 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome72, (int) (short) 1, (double) 0);
        elitisticListPopulation70.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome72);
        boolean b78 = defaultedMap62.containsKey((java.lang.Object) elitisticListPopulation70);
        math.genetics.Chromosome[] chromosome_array79 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome80 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b81 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome80, chromosome_array79);
        math.genetics.ElitisticListPopulation elitisticListPopulation84 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome80, (int) (short) 1, (double) 0);
        elitisticListPopulation70.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome80);
        java.lang.Object obj87 = defaultedMap52.put((java.lang.Object) elitisticListPopulation70, (java.lang.Object) (short) 10);
        java.lang.Object obj88 = defaultedMap48.remove(obj87);
        defaultedMap32.putAll((java.util.Map) defaultedMap48);
        int i90 = defaultedMap48.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(population29);
        org.junit.Assert.assertTrue(d30 == 0.0d);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0 + "'", obj46.equals(0));
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 100 + "'", obj64.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(chromosome_array71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(chromosome_array79);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue(i90 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) collection3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj16 = defaultedMap9.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap22.putAll((java.util.Map) defaultedMap29);
        defaultedMap29.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj42 = defaultedMap37.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) "hi!");
        java.util.Set set45 = defaultedMap37.entrySet();
        boolean b46 = defaultedMap33.containsValue((java.lang.Object) defaultedMap37);
        java.lang.Object obj47 = defaultedMap29.get((java.lang.Object) defaultedMap33);
        java.lang.Object obj48 = defaultedMap9.put((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj55 = defaultedMap50.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) "hi!");
        java.lang.Object obj58 = defaultedMap4.put((java.lang.Object) defaultedMap9, (java.lang.Object) defaultedMap50);
        boolean b59 = defaultedMap9.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100 + "'", obj16.equals(100));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0L + "'", obj47.equals(0L));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) "hi!");
        java.util.Set set21 = defaultedMap13.entrySet();
        boolean b22 = defaultedMap9.containsValue((java.lang.Object) defaultedMap13);
        boolean b23 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj30 = defaultedMap25.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) "hi!");
        defaultedMap25.clear();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate34, predicate35);
        java.lang.Object obj37 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) defaultedMap25);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome41 = elitisticListPopulation40.iterator();
        elitisticListPopulation40.setPopulationLimit(100);
        int i44 = elitisticListPopulation40.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome45 = elitisticListPopulation40.iterator();
        java.lang.Object obj46 = defaultedMap25.remove((java.lang.Object) iterator_chromosome45);
        int i47 = defaultedMap25.size();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) "{1.0=false}");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0 + "'", obj11.equals(0));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(iterator_chromosome41);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) (short) 1, (double) 0);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation9);
        java.util.Collection collection18 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj16 = defaultedMap11.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap11.putAll((java.util.Map) defaultedMap18);
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj31 = defaultedMap26.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) "hi!");
        java.util.Set set34 = defaultedMap26.entrySet();
        boolean b35 = defaultedMap22.containsValue((java.lang.Object) defaultedMap26);
        java.lang.Object obj36 = defaultedMap18.get((java.lang.Object) defaultedMap22);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((int) (short) 100, 1.0d);
        java.lang.Object obj40 = defaultedMap22.get((java.lang.Object) 1.0d);
        java.lang.Object obj42 = defaultedMap22.get((java.lang.Object) 100L);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap22);
        java.lang.String str44 = defaultedMap8.toString();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0 + "'", obj24.equals(0));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0L + "'", obj36.equals(0L));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0 + "'", obj42.equals(0));
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) (byte) 1);
        try {
            elitisticListPopulation2.setPopulationLimit((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) "hi!");
        java.util.Set set24 = defaultedMap16.entrySet();
        boolean b25 = defaultedMap12.containsValue((java.lang.Object) defaultedMap16);
        java.lang.Object obj26 = defaultedMap8.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj33 = defaultedMap28.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) "hi!");
        java.lang.Object obj36 = defaultedMap8.get((java.lang.Object) defaultedMap28);
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array43 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome44 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44, chromosome_array43);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome44, (int) (short) 1, (double) 0);
        elitisticListPopulation42.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome50 = elitisticListPopulation42.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome51 = elitisticListPopulation42.iterator();
        math.genetics.Population population52 = elitisticListPopulation42.nextGeneration();
        boolean b53 = defaultedMap28.containsValue((java.lang.Object) elitisticListPopulation42);
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation42.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation57 = new math.genetics.ElitisticListPopulation(list_chromosome54, (int) 'a', (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0L + "'", obj36.equals(0L));
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(chromosome_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome50);
        org.junit.Assert.assertNotNull(iterator_chromosome51);
        org.junit.Assert.assertNotNull(population52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(list_chromosome54);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation5.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation5.iterator();
        math.genetics.Population population15 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation5.addChromosome(chromosome16);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertNotNull(population15);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) (short) 1, (double) 0);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation9);
        math.genetics.Population population18 = elitisticListPopulation9.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation9.iterator();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj11 = defaultedMap6.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Set set12 = defaultedMap6.entrySet();
        java.util.Collection collection13 = defaultedMap6.values();
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) "hi!");
        defaultedMap16.clear();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate25, predicate26);
        java.util.Set set28 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) 100);
        java.lang.String str33 = defaultedMap30.toString();
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = defaultedMap16.put((java.lang.Object) str33, obj34);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap16.get(obj36);
        boolean b38 = defaultedMap16.isEmpty();
        java.lang.Object obj39 = defaultedMap6.get((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 100 + "'", obj32.equals(100));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100 + "'", obj37.equals(100));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 100 + "'", obj39.equals(100));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) (short) 1, (double) 0);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation9);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj24 = defaultedMap19.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) "hi!");
        defaultedMap19.clear();
        java.util.Set set28 = defaultedMap19.keySet();
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) defaultedMap19);
        boolean b30 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 100);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) (short) -1);
        java.lang.String str37 = defaultedMap32.toString();
        boolean b38 = defaultedMap1.equals((java.lang.Object) defaultedMap32);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100 + "'", obj34.equals(100));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) "hi!");
        defaultedMap10.clear();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) "hi!");
        defaultedMap21.clear();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate19, predicate31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj40 = defaultedMap35.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) "hi!");
        defaultedMap35.clear();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate44, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate31, predicate45);
        java.lang.String str48 = defaultedMap1.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome52 = elitisticListPopulation51.iterator();
        elitisticListPopulation51.setPopulationLimit(100);
        int i55 = elitisticListPopulation51.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome56 = elitisticListPopulation51.iterator();
        java.lang.Object obj57 = defaultedMap1.get((java.lang.Object) iterator_chromosome56);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{1.0=false}" + "'", str48.equals("{1.0=false}"));
        org.junit.Assert.assertNotNull(iterator_chromosome52);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 100 + "'", obj57.equals(100));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate11);
        java.util.Set set13 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 100);
        java.lang.String str18 = defaultedMap15.toString();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) str18, obj19);
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap1.get(obj21);
        int i23 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100 + "'", obj22.equals(100));
        org.junit.Assert.assertTrue(i23 == 1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        int i6 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) "hi!");
        java.util.Set set24 = defaultedMap16.entrySet();
        boolean b25 = defaultedMap12.containsValue((java.lang.Object) defaultedMap16);
        java.lang.Object obj26 = defaultedMap8.get((java.lang.Object) defaultedMap12);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) (short) 100, 1.0d);
        java.lang.Object obj30 = defaultedMap12.get((java.lang.Object) 1.0d);
        java.lang.Object obj32 = defaultedMap12.get((java.lang.Object) 100L);
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj37 = defaultedMap35.get((java.lang.Object) 100);
        java.lang.Object obj39 = defaultedMap35.remove((java.lang.Object) (short) -1);
        java.lang.String str40 = defaultedMap35.toString();
        java.lang.Object obj41 = defaultedMap12.remove((java.lang.Object) defaultedMap35);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0 + "'", obj32.equals(0));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100 + "'", obj37.equals(100));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) collection3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj16 = defaultedMap9.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap22.putAll((java.util.Map) defaultedMap29);
        defaultedMap29.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj42 = defaultedMap37.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) "hi!");
        java.util.Set set45 = defaultedMap37.entrySet();
        boolean b46 = defaultedMap33.containsValue((java.lang.Object) defaultedMap37);
        java.lang.Object obj47 = defaultedMap29.get((java.lang.Object) defaultedMap33);
        java.lang.Object obj48 = defaultedMap9.put((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj55 = defaultedMap50.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) "hi!");
        java.lang.Object obj58 = defaultedMap4.put((java.lang.Object) defaultedMap9, (java.lang.Object) defaultedMap50);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj65 = defaultedMap60.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap60.putAll((java.util.Map) defaultedMap67);
        boolean b69 = defaultedMap4.containsKey((java.lang.Object) defaultedMap67);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100 + "'", obj16.equals(100));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0L + "'", obj47.equals(0L));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) collection3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj16 = defaultedMap9.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap22.putAll((java.util.Map) defaultedMap29);
        defaultedMap29.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj42 = defaultedMap37.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) "hi!");
        java.util.Set set45 = defaultedMap37.entrySet();
        boolean b46 = defaultedMap33.containsValue((java.lang.Object) defaultedMap37);
        java.lang.Object obj47 = defaultedMap29.get((java.lang.Object) defaultedMap33);
        java.lang.Object obj48 = defaultedMap9.put((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj55 = defaultedMap50.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) "hi!");
        java.lang.Object obj58 = defaultedMap4.put((java.lang.Object) defaultedMap9, (java.lang.Object) defaultedMap50);
        defaultedMap50.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100 + "'", obj16.equals(100));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0L + "'", obj47.equals(0L));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = null;
        try {
            elitisticListPopulation2.setChromosomes(list_chromosome4);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap14.putAll((java.util.Map) defaultedMap21);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) "hi!");
        java.util.Set set37 = defaultedMap29.entrySet();
        boolean b38 = defaultedMap25.containsValue((java.lang.Object) defaultedMap29);
        java.lang.Object obj39 = defaultedMap21.get((java.lang.Object) defaultedMap25);
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap25);
        java.lang.String str41 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{1.0=false, 0={}}" + "'", str41.equals("{1.0=false, 0={}}"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) (byte) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.lang.String str13 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation5.addChromosome(chromosome14);
        java.lang.String str16 = elitisticListPopulation5.toString();
        double d17 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[null]" + "'", str16.equals("[null]"));
        org.junit.Assert.assertTrue(d17 == 0.0d);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.lang.String str13 = elitisticListPopulation5.toString();
        java.lang.String str14 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation5.addChromosome(chromosome15);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation5.iterator();
        math.genetics.Population population18 = elitisticListPopulation5.nextGeneration();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) (short) 1, (double) 0);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        boolean b36 = defaultedMap20.containsKey((java.lang.Object) elitisticListPopulation28);
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38, (int) (short) 1, (double) 0);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38);
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100 + "'", obj22.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(list_chromosome45);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 100, 1.0d);
        math.genetics.Population population9 = elitisticListPopulation8.nextGeneration();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) (short) 1, (double) 0);
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17);
        java.lang.String str23 = elitisticListPopulation15.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation8.setChromosomes(list_chromosome24);
        elitisticListPopulation2.setChromosomes(list_chromosome24);
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]" + "'", str23.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome24);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.lang.String str13 = elitisticListPopulation5.toString();
        java.lang.String str14 = elitisticListPopulation5.toString();
        double d15 = elitisticListPopulation5.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation18.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome20);
        elitisticListPopulation5.setPopulationLimit((int) '#');
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertNotNull(list_chromosome20);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) "hi!");
        java.util.Set set13 = defaultedMap5.entrySet();
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) defaultedMap5);
        java.util.Set set15 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100);
        java.lang.String str20 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Set set28 = defaultedMap22.entrySet();
        java.util.Collection collection29 = defaultedMap22.values();
        boolean b30 = defaultedMap17.containsValue((java.lang.Object) defaultedMap22);
        boolean b31 = defaultedMap1.equals((java.lang.Object) defaultedMap22);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) (short) 1, (double) 0);
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39);
        java.lang.String str45 = elitisticListPopulation37.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome46 = elitisticListPopulation37.iterator();
        java.lang.Object obj47 = defaultedMap22.remove((java.lang.Object) iterator_chromosome46);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "[]" + "'", str45.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome46);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.lang.String str13 = elitisticListPopulation5.toString();
        java.lang.String str14 = elitisticListPopulation5.toString();
        double d15 = elitisticListPopulation5.getElitismRate();
        try {
            math.genetics.Chromosome chromosome16 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertTrue(d15 == 0.0d);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj11 = defaultedMap6.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Set set12 = defaultedMap6.entrySet();
        java.util.Collection collection13 = defaultedMap6.values();
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) "hi!");
        defaultedMap16.clear();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate25, predicate26);
        java.util.Set set28 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) 100);
        java.lang.String str33 = defaultedMap30.toString();
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = defaultedMap16.put((java.lang.Object) str33, obj34);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap16.get(obj36);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection39 = defaultedMap16.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 100 + "'", obj32.equals(100));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100 + "'", obj37.equals(100));
        org.junit.Assert.assertNotNull(collection39);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.lang.String str13 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation5.iterator();
        int i15 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation5.addChromosome(chromosome16);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) (short) 1, (double) 0);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation9);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj24 = defaultedMap19.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) "hi!");
        defaultedMap19.clear();
        java.util.Set set28 = defaultedMap19.keySet();
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj36 = defaultedMap31.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj38 = defaultedMap31.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj45 = defaultedMap40.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) "hi!");
        defaultedMap40.clear();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj56 = defaultedMap51.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) "hi!");
        defaultedMap51.clear();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate60, predicate61);
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate49, predicate61);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation68 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj70 = defaultedMap65.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) "hi!");
        defaultedMap65.clear();
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate74, predicate75);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate61, predicate75);
        java.lang.String str78 = defaultedMap31.toString();
        java.lang.Object obj79 = defaultedMap1.get((java.lang.Object) str78);
        java.lang.String str80 = defaultedMap1.toString();
        boolean b81 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 100 + "'", obj38.equals(100));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "{1.0=false}" + "'", str78.equals("{1.0=false}"));
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + 100 + "'", obj79.equals(100));
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "{}" + "'", str80.equals("{}"));
        org.junit.Assert.assertTrue(b81 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate11);
        java.util.Set set13 = defaultedMap1.entrySet();
        java.util.Collection collection14 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100);
        java.lang.String str8 = defaultedMap5.toString();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj16 = defaultedMap11.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj17 = defaultedMap5.remove((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj24 = defaultedMap19.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) "hi!");
        java.util.Set set27 = defaultedMap19.entrySet();
        java.lang.Object obj28 = defaultedMap5.remove((java.lang.Object) set27);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100 + "'", obj7.equals(100));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) (short) 1, (double) 0);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation9);
        java.util.Set set18 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) "hi!");
        java.util.Set set21 = defaultedMap13.entrySet();
        boolean b22 = defaultedMap9.containsValue((java.lang.Object) defaultedMap13);
        boolean b23 = defaultedMap1.equals((java.lang.Object) b22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) (byte) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap25);
        boolean b29 = defaultedMap25.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0 + "'", obj11.equals(0));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj17 = defaultedMap12.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) "hi!");
        defaultedMap12.clear();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate22);
        boolean b25 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) collection3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj16 = defaultedMap9.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap22.putAll((java.util.Map) defaultedMap29);
        defaultedMap29.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj42 = defaultedMap37.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) "hi!");
        java.util.Set set45 = defaultedMap37.entrySet();
        boolean b46 = defaultedMap33.containsValue((java.lang.Object) defaultedMap37);
        java.lang.Object obj47 = defaultedMap29.get((java.lang.Object) defaultedMap33);
        java.lang.Object obj48 = defaultedMap9.put((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj55 = defaultedMap50.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) "hi!");
        java.lang.Object obj58 = defaultedMap4.put((java.lang.Object) defaultedMap9, (java.lang.Object) defaultedMap50);
        java.util.Collection collection59 = defaultedMap4.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100 + "'", obj16.equals(100));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0L + "'", obj47.equals(0L));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(collection59);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100);
        java.lang.String str8 = defaultedMap5.toString();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        java.util.Set set10 = defaultedMap1.keySet();
        java.lang.Object obj11 = null;
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj11);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100 + "'", obj7.equals(100));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) (short) 1, (double) 0);
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13);
        java.lang.String str19 = elitisticListPopulation11.toString();
        java.lang.String str20 = elitisticListPopulation11.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation11.getChromosomes();
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) (short) 1, (double) 0);
        elitisticListPopulation11.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', (double) (short) 1);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23);
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]" + "'", str19.equals("[]"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, 1.0d);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) (short) 1, (double) 0);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        java.lang.String str17 = elitisticListPopulation9.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome18);
        double d20 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertTrue(d20 == 1.0d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) (short) 1, (double) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7);
        java.lang.String str13 = elitisticListPopulation5.toString();
        java.lang.String str14 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation5.addChromosome(chromosome15);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation5.iterator();
        math.genetics.Population population18 = elitisticListPopulation5.nextGeneration();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) (short) 1, (double) 0);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        boolean b36 = defaultedMap20.containsKey((java.lang.Object) elitisticListPopulation28);
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38, (int) (short) 1, (double) 0);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome45 = arraylist_chromosome38.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100 + "'", obj22.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome45);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate11);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.get(obj13);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.util.Set set10 = defaultedMap1.keySet();
        java.util.Set set11 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set14 = defaultedMap13.entrySet();
        java.util.Collection collection15 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100);
        java.lang.String str20 = defaultedMap17.toString();
        java.lang.Object obj21 = defaultedMap13.remove((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj28 = defaultedMap23.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.lang.Object obj29 = defaultedMap17.remove((java.lang.Object) defaultedMap23);
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) defaultedMap17);
        java.lang.String str31 = defaultedMap17.toString();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 100, 1.0d);
        math.genetics.Population population10 = elitisticListPopulation9.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation6.setChromosomes(list_chromosome11);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) list_chromosome11);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(population10);
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        int i6 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) collection3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) "hi!");
        java.util.Set set18 = defaultedMap10.entrySet();
        boolean b19 = defaultedMap6.containsValue((java.lang.Object) defaultedMap10);
        java.util.Set set20 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 100);
        java.lang.String str25 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj32 = defaultedMap27.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Set set33 = defaultedMap27.entrySet();
        java.util.Collection collection34 = defaultedMap27.values();
        boolean b35 = defaultedMap22.containsValue((java.lang.Object) defaultedMap27);
        boolean b36 = defaultedMap6.equals((java.lang.Object) defaultedMap27);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100 + "'", obj24.equals(100));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        int i7 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) (byte) 1);
        boolean b7 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj16 = defaultedMap11.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap11.putAll((java.util.Map) defaultedMap18);
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj31 = defaultedMap26.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) "hi!");
        java.util.Set set34 = defaultedMap26.entrySet();
        boolean b35 = defaultedMap22.containsValue((java.lang.Object) defaultedMap26);
        java.lang.Object obj36 = defaultedMap18.get((java.lang.Object) defaultedMap22);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((int) (short) 100, 1.0d);
        java.lang.Object obj40 = defaultedMap22.get((java.lang.Object) 1.0d);
        java.lang.Object obj42 = defaultedMap22.get((java.lang.Object) 100L);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap22);
        int i44 = defaultedMap8.size();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0 + "'", obj24.equals(0));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0L + "'", obj36.equals(0L));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0 + "'", obj42.equals(0));
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(i44 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100);
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (short) 1, (double) 0);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) (short) 1, (double) 0);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation9);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation(1, 1.0d);
        java.lang.Object obj24 = defaultedMap19.put((java.lang.Object) 1.0d, (java.lang.Object) false);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) "hi!");
        defaultedMap19.clear();
        java.util.Set set28 = defaultedMap19.keySet();
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) defaultedMap19);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) (short) 100, 1.0d);
        math.genetics.Population population33 = elitisticListPopulation32.nextGeneration();
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) population33);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(population33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100 + "'", obj34.equals(100));
    }
}

